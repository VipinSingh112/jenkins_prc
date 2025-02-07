/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import com.nbp.explosives.competency.stages.service.exception.NoSuchExplosiveReviewAndVerificationException;
import com.nbp.explosives.competency.stages.service.model.ExplosiveReviewAndVerification;
import com.nbp.explosives.competency.stages.service.model.ExplosiveReviewAndVerificationTable;
import com.nbp.explosives.competency.stages.service.model.impl.ExplosiveReviewAndVerificationImpl;
import com.nbp.explosives.competency.stages.service.model.impl.ExplosiveReviewAndVerificationModelImpl;
import com.nbp.explosives.competency.stages.service.service.persistence.ExplosiveReviewAndVerificationPersistence;
import com.nbp.explosives.competency.stages.service.service.persistence.ExplosiveReviewAndVerificationUtil;
import com.nbp.explosives.competency.stages.service.service.persistence.impl.constants.EXPLOSIVE_STAGESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the explosive review and verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ExplosiveReviewAndVerificationPersistence.class)
public class ExplosiveReviewAndVerificationPersistenceImpl
	extends BasePersistenceImpl<ExplosiveReviewAndVerification>
	implements ExplosiveReviewAndVerificationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ExplosiveReviewAndVerificationUtil</code> to access the explosive review and verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ExplosiveReviewAndVerificationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the explosive review and verifications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching explosive review and verifications
	 */
	@Override
	public List<ExplosiveReviewAndVerification> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the explosive review and verifications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @return the range of matching explosive review and verifications
	 */
	@Override
	public List<ExplosiveReviewAndVerification> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the explosive review and verifications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive review and verifications
	 */
	@Override
	public List<ExplosiveReviewAndVerification> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ExplosiveReviewAndVerification> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the explosive review and verifications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive review and verifications
	 */
	@Override
	public List<ExplosiveReviewAndVerification> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ExplosiveReviewAndVerification> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<ExplosiveReviewAndVerification> list = null;

		if (useFinderCache) {
			list = (List<ExplosiveReviewAndVerification>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ExplosiveReviewAndVerification
						explosiveReviewAndVerification : list) {

					if (!uuid.equals(
							explosiveReviewAndVerification.getUuid())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_EXPLOSIVEREVIEWANDVERIFICATION_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					ExplosiveReviewAndVerificationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<ExplosiveReviewAndVerification>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first explosive review and verification in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a matching explosive review and verification could not be found
	 */
	@Override
	public ExplosiveReviewAndVerification findByUuid_First(
			String uuid,
			OrderByComparator<ExplosiveReviewAndVerification> orderByComparator)
		throws NoSuchExplosiveReviewAndVerificationException {

		ExplosiveReviewAndVerification explosiveReviewAndVerification =
			fetchByUuid_First(uuid, orderByComparator);

		if (explosiveReviewAndVerification != null) {
			return explosiveReviewAndVerification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchExplosiveReviewAndVerificationException(sb.toString());
	}

	/**
	 * Returns the first explosive review and verification in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive review and verification, or <code>null</code> if a matching explosive review and verification could not be found
	 */
	@Override
	public ExplosiveReviewAndVerification fetchByUuid_First(
		String uuid,
		OrderByComparator<ExplosiveReviewAndVerification> orderByComparator) {

		List<ExplosiveReviewAndVerification> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last explosive review and verification in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a matching explosive review and verification could not be found
	 */
	@Override
	public ExplosiveReviewAndVerification findByUuid_Last(
			String uuid,
			OrderByComparator<ExplosiveReviewAndVerification> orderByComparator)
		throws NoSuchExplosiveReviewAndVerificationException {

		ExplosiveReviewAndVerification explosiveReviewAndVerification =
			fetchByUuid_Last(uuid, orderByComparator);

		if (explosiveReviewAndVerification != null) {
			return explosiveReviewAndVerification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchExplosiveReviewAndVerificationException(sb.toString());
	}

	/**
	 * Returns the last explosive review and verification in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive review and verification, or <code>null</code> if a matching explosive review and verification could not be found
	 */
	@Override
	public ExplosiveReviewAndVerification fetchByUuid_Last(
		String uuid,
		OrderByComparator<ExplosiveReviewAndVerification> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<ExplosiveReviewAndVerification> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the explosive review and verifications before and after the current explosive review and verification in the ordered set where uuid = &#63;.
	 *
	 * @param issuanceId the primary key of the current explosive review and verification
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a explosive review and verification with the primary key could not be found
	 */
	@Override
	public ExplosiveReviewAndVerification[] findByUuid_PrevAndNext(
			long issuanceId, String uuid,
			OrderByComparator<ExplosiveReviewAndVerification> orderByComparator)
		throws NoSuchExplosiveReviewAndVerificationException {

		uuid = Objects.toString(uuid, "");

		ExplosiveReviewAndVerification explosiveReviewAndVerification =
			findByPrimaryKey(issuanceId);

		Session session = null;

		try {
			session = openSession();

			ExplosiveReviewAndVerification[] array =
				new ExplosiveReviewAndVerificationImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, explosiveReviewAndVerification, uuid,
				orderByComparator, true);

			array[1] = explosiveReviewAndVerification;

			array[2] = getByUuid_PrevAndNext(
				session, explosiveReviewAndVerification, uuid,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ExplosiveReviewAndVerification getByUuid_PrevAndNext(
		Session session,
		ExplosiveReviewAndVerification explosiveReviewAndVerification,
		String uuid,
		OrderByComparator<ExplosiveReviewAndVerification> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_EXPLOSIVEREVIEWANDVERIFICATION_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(ExplosiveReviewAndVerificationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						explosiveReviewAndVerification)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ExplosiveReviewAndVerification> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the explosive review and verifications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (ExplosiveReviewAndVerification explosiveReviewAndVerification :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(explosiveReviewAndVerification);
		}
	}

	/**
	 * Returns the number of explosive review and verifications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching explosive review and verifications
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EXPLOSIVEREVIEWANDVERIFICATION_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"explosiveReviewAndVerification.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(explosiveReviewAndVerification.uuid IS NULL OR explosiveReviewAndVerification.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the explosive review and verification where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchExplosiveReviewAndVerificationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a matching explosive review and verification could not be found
	 */
	@Override
	public ExplosiveReviewAndVerification findByUUID_G(
			String uuid, long groupId)
		throws NoSuchExplosiveReviewAndVerificationException {

		ExplosiveReviewAndVerification explosiveReviewAndVerification =
			fetchByUUID_G(uuid, groupId);

		if (explosiveReviewAndVerification == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("uuid=");
			sb.append(uuid);

			sb.append(", groupId=");
			sb.append(groupId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchExplosiveReviewAndVerificationException(
				sb.toString());
		}

		return explosiveReviewAndVerification;
	}

	/**
	 * Returns the explosive review and verification where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching explosive review and verification, or <code>null</code> if a matching explosive review and verification could not be found
	 */
	@Override
	public ExplosiveReviewAndVerification fetchByUUID_G(
		String uuid, long groupId) {

		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the explosive review and verification where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive review and verification, or <code>null</code> if a matching explosive review and verification could not be found
	 */
	@Override
	public ExplosiveReviewAndVerification fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {uuid, groupId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByUUID_G, finderArgs, this);
		}

		if (result instanceof ExplosiveReviewAndVerification) {
			ExplosiveReviewAndVerification explosiveReviewAndVerification =
				(ExplosiveReviewAndVerification)result;

			if (!Objects.equals(
					uuid, explosiveReviewAndVerification.getUuid()) ||
				(groupId != explosiveReviewAndVerification.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_EXPLOSIVEREVIEWANDVERIFICATION_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				List<ExplosiveReviewAndVerification> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					ExplosiveReviewAndVerification
						explosiveReviewAndVerification = list.get(0);

					result = explosiveReviewAndVerification;

					cacheResult(explosiveReviewAndVerification);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (ExplosiveReviewAndVerification)result;
		}
	}

	/**
	 * Removes the explosive review and verification where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the explosive review and verification that was removed
	 */
	@Override
	public ExplosiveReviewAndVerification removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchExplosiveReviewAndVerificationException {

		ExplosiveReviewAndVerification explosiveReviewAndVerification =
			findByUUID_G(uuid, groupId);

		return remove(explosiveReviewAndVerification);
	}

	/**
	 * Returns the number of explosive review and verifications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching explosive review and verifications
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_EXPLOSIVEREVIEWANDVERIFICATION_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_2 =
		"explosiveReviewAndVerification.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(explosiveReviewAndVerification.uuid IS NULL OR explosiveReviewAndVerification.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"explosiveReviewAndVerification.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the explosive review and verifications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching explosive review and verifications
	 */
	@Override
	public List<ExplosiveReviewAndVerification> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the explosive review and verifications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @return the range of matching explosive review and verifications
	 */
	@Override
	public List<ExplosiveReviewAndVerification> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the explosive review and verifications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive review and verifications
	 */
	@Override
	public List<ExplosiveReviewAndVerification> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ExplosiveReviewAndVerification> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the explosive review and verifications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive review and verifications
	 */
	@Override
	public List<ExplosiveReviewAndVerification> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ExplosiveReviewAndVerification> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid_C;
				finderArgs = new Object[] {uuid, companyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid_C;
			finderArgs = new Object[] {
				uuid, companyId, start, end, orderByComparator
			};
		}

		List<ExplosiveReviewAndVerification> list = null;

		if (useFinderCache) {
			list = (List<ExplosiveReviewAndVerification>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ExplosiveReviewAndVerification
						explosiveReviewAndVerification : list) {

					if (!uuid.equals(
							explosiveReviewAndVerification.getUuid()) ||
						(companyId !=
							explosiveReviewAndVerification.getCompanyId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_EXPLOSIVEREVIEWANDVERIFICATION_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					ExplosiveReviewAndVerificationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				list = (List<ExplosiveReviewAndVerification>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first explosive review and verification in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a matching explosive review and verification could not be found
	 */
	@Override
	public ExplosiveReviewAndVerification findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<ExplosiveReviewAndVerification> orderByComparator)
		throws NoSuchExplosiveReviewAndVerificationException {

		ExplosiveReviewAndVerification explosiveReviewAndVerification =
			fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (explosiveReviewAndVerification != null) {
			return explosiveReviewAndVerification;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchExplosiveReviewAndVerificationException(sb.toString());
	}

	/**
	 * Returns the first explosive review and verification in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive review and verification, or <code>null</code> if a matching explosive review and verification could not be found
	 */
	@Override
	public ExplosiveReviewAndVerification fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<ExplosiveReviewAndVerification> orderByComparator) {

		List<ExplosiveReviewAndVerification> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last explosive review and verification in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a matching explosive review and verification could not be found
	 */
	@Override
	public ExplosiveReviewAndVerification findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<ExplosiveReviewAndVerification> orderByComparator)
		throws NoSuchExplosiveReviewAndVerificationException {

		ExplosiveReviewAndVerification explosiveReviewAndVerification =
			fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (explosiveReviewAndVerification != null) {
			return explosiveReviewAndVerification;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchExplosiveReviewAndVerificationException(sb.toString());
	}

	/**
	 * Returns the last explosive review and verification in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive review and verification, or <code>null</code> if a matching explosive review and verification could not be found
	 */
	@Override
	public ExplosiveReviewAndVerification fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<ExplosiveReviewAndVerification> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<ExplosiveReviewAndVerification> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the explosive review and verifications before and after the current explosive review and verification in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param issuanceId the primary key of the current explosive review and verification
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a explosive review and verification with the primary key could not be found
	 */
	@Override
	public ExplosiveReviewAndVerification[] findByUuid_C_PrevAndNext(
			long issuanceId, String uuid, long companyId,
			OrderByComparator<ExplosiveReviewAndVerification> orderByComparator)
		throws NoSuchExplosiveReviewAndVerificationException {

		uuid = Objects.toString(uuid, "");

		ExplosiveReviewAndVerification explosiveReviewAndVerification =
			findByPrimaryKey(issuanceId);

		Session session = null;

		try {
			session = openSession();

			ExplosiveReviewAndVerification[] array =
				new ExplosiveReviewAndVerificationImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, explosiveReviewAndVerification, uuid, companyId,
				orderByComparator, true);

			array[1] = explosiveReviewAndVerification;

			array[2] = getByUuid_C_PrevAndNext(
				session, explosiveReviewAndVerification, uuid, companyId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ExplosiveReviewAndVerification getByUuid_C_PrevAndNext(
		Session session,
		ExplosiveReviewAndVerification explosiveReviewAndVerification,
		String uuid, long companyId,
		OrderByComparator<ExplosiveReviewAndVerification> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_EXPLOSIVEREVIEWANDVERIFICATION_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(ExplosiveReviewAndVerificationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		queryPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						explosiveReviewAndVerification)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ExplosiveReviewAndVerification> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the explosive review and verifications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (ExplosiveReviewAndVerification explosiveReviewAndVerification :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(explosiveReviewAndVerification);
		}
	}

	/**
	 * Returns the number of explosive review and verifications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching explosive review and verifications
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_EXPLOSIVEREVIEWANDVERIFICATION_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_2 =
		"explosiveReviewAndVerification.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(explosiveReviewAndVerification.uuid IS NULL OR explosiveReviewAndVerification.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"explosiveReviewAndVerification.companyId = ?";

	private FinderPath _finderPathFetchBygetEXP_RV_CI;
	private FinderPath _finderPathCountBygetEXP_RV_CI;

	/**
	 * Returns the explosive review and verification where caseId = &#63; or throws a <code>NoSuchExplosiveReviewAndVerificationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a matching explosive review and verification could not be found
	 */
	@Override
	public ExplosiveReviewAndVerification findBygetEXP_RV_CI(String caseId)
		throws NoSuchExplosiveReviewAndVerificationException {

		ExplosiveReviewAndVerification explosiveReviewAndVerification =
			fetchBygetEXP_RV_CI(caseId);

		if (explosiveReviewAndVerification == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchExplosiveReviewAndVerificationException(
				sb.toString());
		}

		return explosiveReviewAndVerification;
	}

	/**
	 * Returns the explosive review and verification where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching explosive review and verification, or <code>null</code> if a matching explosive review and verification could not be found
	 */
	@Override
	public ExplosiveReviewAndVerification fetchBygetEXP_RV_CI(String caseId) {
		return fetchBygetEXP_RV_CI(caseId, true);
	}

	/**
	 * Returns the explosive review and verification where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive review and verification, or <code>null</code> if a matching explosive review and verification could not be found
	 */
	@Override
	public ExplosiveReviewAndVerification fetchBygetEXP_RV_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetEXP_RV_CI, finderArgs, this);
		}

		if (result instanceof ExplosiveReviewAndVerification) {
			ExplosiveReviewAndVerification explosiveReviewAndVerification =
				(ExplosiveReviewAndVerification)result;

			if (!Objects.equals(
					caseId, explosiveReviewAndVerification.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_EXPLOSIVEREVIEWANDVERIFICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETEXP_RV_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETEXP_RV_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				List<ExplosiveReviewAndVerification> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetEXP_RV_CI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId};
							}

							_log.warn(
								"ExplosiveReviewAndVerificationPersistenceImpl.fetchBygetEXP_RV_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ExplosiveReviewAndVerification
						explosiveReviewAndVerification = list.get(0);

					result = explosiveReviewAndVerification;

					cacheResult(explosiveReviewAndVerification);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (ExplosiveReviewAndVerification)result;
		}
	}

	/**
	 * Removes the explosive review and verification where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the explosive review and verification that was removed
	 */
	@Override
	public ExplosiveReviewAndVerification removeBygetEXP_RV_CI(String caseId)
		throws NoSuchExplosiveReviewAndVerificationException {

		ExplosiveReviewAndVerification explosiveReviewAndVerification =
			findBygetEXP_RV_CI(caseId);

		return remove(explosiveReviewAndVerification);
	}

	/**
	 * Returns the number of explosive review and verifications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching explosive review and verifications
	 */
	@Override
	public int countBygetEXP_RV_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetEXP_RV_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EXPLOSIVEREVIEWANDVERIFICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETEXP_RV_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETEXP_RV_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GETEXP_RV_CI_CASEID_2 =
		"explosiveReviewAndVerification.caseId = ?";

	private static final String _FINDER_COLUMN_GETEXP_RV_CI_CASEID_3 =
		"(explosiveReviewAndVerification.caseId IS NULL OR explosiveReviewAndVerification.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetEXP_RV_List_CI;
	private FinderPath _finderPathWithoutPaginationFindBygetEXP_RV_List_CI;
	private FinderPath _finderPathCountBygetEXP_RV_List_CI;

	/**
	 * Returns all the explosive review and verifications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching explosive review and verifications
	 */
	@Override
	public List<ExplosiveReviewAndVerification> findBygetEXP_RV_List_CI(
		String caseId) {

		return findBygetEXP_RV_List_CI(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the explosive review and verifications where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @return the range of matching explosive review and verifications
	 */
	@Override
	public List<ExplosiveReviewAndVerification> findBygetEXP_RV_List_CI(
		String caseId, int start, int end) {

		return findBygetEXP_RV_List_CI(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the explosive review and verifications where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive review and verifications
	 */
	@Override
	public List<ExplosiveReviewAndVerification> findBygetEXP_RV_List_CI(
		String caseId, int start, int end,
		OrderByComparator<ExplosiveReviewAndVerification> orderByComparator) {

		return findBygetEXP_RV_List_CI(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the explosive review and verifications where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive review and verifications
	 */
	@Override
	public List<ExplosiveReviewAndVerification> findBygetEXP_RV_List_CI(
		String caseId, int start, int end,
		OrderByComparator<ExplosiveReviewAndVerification> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetEXP_RV_List_CI;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetEXP_RV_List_CI;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<ExplosiveReviewAndVerification> list = null;

		if (useFinderCache) {
			list = (List<ExplosiveReviewAndVerification>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ExplosiveReviewAndVerification
						explosiveReviewAndVerification : list) {

					if (!caseId.equals(
							explosiveReviewAndVerification.getCaseId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_EXPLOSIVEREVIEWANDVERIFICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETEXP_RV_LIST_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETEXP_RV_LIST_CI_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					ExplosiveReviewAndVerificationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				list = (List<ExplosiveReviewAndVerification>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first explosive review and verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a matching explosive review and verification could not be found
	 */
	@Override
	public ExplosiveReviewAndVerification findBygetEXP_RV_List_CI_First(
			String caseId,
			OrderByComparator<ExplosiveReviewAndVerification> orderByComparator)
		throws NoSuchExplosiveReviewAndVerificationException {

		ExplosiveReviewAndVerification explosiveReviewAndVerification =
			fetchBygetEXP_RV_List_CI_First(caseId, orderByComparator);

		if (explosiveReviewAndVerification != null) {
			return explosiveReviewAndVerification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchExplosiveReviewAndVerificationException(sb.toString());
	}

	/**
	 * Returns the first explosive review and verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive review and verification, or <code>null</code> if a matching explosive review and verification could not be found
	 */
	@Override
	public ExplosiveReviewAndVerification fetchBygetEXP_RV_List_CI_First(
		String caseId,
		OrderByComparator<ExplosiveReviewAndVerification> orderByComparator) {

		List<ExplosiveReviewAndVerification> list = findBygetEXP_RV_List_CI(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last explosive review and verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a matching explosive review and verification could not be found
	 */
	@Override
	public ExplosiveReviewAndVerification findBygetEXP_RV_List_CI_Last(
			String caseId,
			OrderByComparator<ExplosiveReviewAndVerification> orderByComparator)
		throws NoSuchExplosiveReviewAndVerificationException {

		ExplosiveReviewAndVerification explosiveReviewAndVerification =
			fetchBygetEXP_RV_List_CI_Last(caseId, orderByComparator);

		if (explosiveReviewAndVerification != null) {
			return explosiveReviewAndVerification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchExplosiveReviewAndVerificationException(sb.toString());
	}

	/**
	 * Returns the last explosive review and verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive review and verification, or <code>null</code> if a matching explosive review and verification could not be found
	 */
	@Override
	public ExplosiveReviewAndVerification fetchBygetEXP_RV_List_CI_Last(
		String caseId,
		OrderByComparator<ExplosiveReviewAndVerification> orderByComparator) {

		int count = countBygetEXP_RV_List_CI(caseId);

		if (count == 0) {
			return null;
		}

		List<ExplosiveReviewAndVerification> list = findBygetEXP_RV_List_CI(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the explosive review and verifications before and after the current explosive review and verification in the ordered set where caseId = &#63;.
	 *
	 * @param issuanceId the primary key of the current explosive review and verification
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a explosive review and verification with the primary key could not be found
	 */
	@Override
	public ExplosiveReviewAndVerification[] findBygetEXP_RV_List_CI_PrevAndNext(
			long issuanceId, String caseId,
			OrderByComparator<ExplosiveReviewAndVerification> orderByComparator)
		throws NoSuchExplosiveReviewAndVerificationException {

		caseId = Objects.toString(caseId, "");

		ExplosiveReviewAndVerification explosiveReviewAndVerification =
			findByPrimaryKey(issuanceId);

		Session session = null;

		try {
			session = openSession();

			ExplosiveReviewAndVerification[] array =
				new ExplosiveReviewAndVerificationImpl[3];

			array[0] = getBygetEXP_RV_List_CI_PrevAndNext(
				session, explosiveReviewAndVerification, caseId,
				orderByComparator, true);

			array[1] = explosiveReviewAndVerification;

			array[2] = getBygetEXP_RV_List_CI_PrevAndNext(
				session, explosiveReviewAndVerification, caseId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ExplosiveReviewAndVerification getBygetEXP_RV_List_CI_PrevAndNext(
		Session session,
		ExplosiveReviewAndVerification explosiveReviewAndVerification,
		String caseId,
		OrderByComparator<ExplosiveReviewAndVerification> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_EXPLOSIVEREVIEWANDVERIFICATION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETEXP_RV_LIST_CI_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETEXP_RV_LIST_CI_CASEID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(ExplosiveReviewAndVerificationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindCaseId) {
			queryPos.add(caseId);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						explosiveReviewAndVerification)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ExplosiveReviewAndVerification> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the explosive review and verifications where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetEXP_RV_List_CI(String caseId) {
		for (ExplosiveReviewAndVerification explosiveReviewAndVerification :
				findBygetEXP_RV_List_CI(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(explosiveReviewAndVerification);
		}
	}

	/**
	 * Returns the number of explosive review and verifications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching explosive review and verifications
	 */
	@Override
	public int countBygetEXP_RV_List_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetEXP_RV_List_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EXPLOSIVEREVIEWANDVERIFICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETEXP_RV_LIST_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETEXP_RV_LIST_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GETEXP_RV_LIST_CI_CASEID_2 =
		"explosiveReviewAndVerification.caseId = ?";

	private static final String _FINDER_COLUMN_GETEXP_RV_LIST_CI_CASEID_3 =
		"(explosiveReviewAndVerification.caseId IS NULL OR explosiveReviewAndVerification.caseId = '')";

	public ExplosiveReviewAndVerificationPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(ExplosiveReviewAndVerification.class);

		setModelImplClass(ExplosiveReviewAndVerificationImpl.class);
		setModelPKClass(long.class);

		setTable(ExplosiveReviewAndVerificationTable.INSTANCE);
	}

	/**
	 * Caches the explosive review and verification in the entity cache if it is enabled.
	 *
	 * @param explosiveReviewAndVerification the explosive review and verification
	 */
	@Override
	public void cacheResult(
		ExplosiveReviewAndVerification explosiveReviewAndVerification) {

		entityCache.putResult(
			ExplosiveReviewAndVerificationImpl.class,
			explosiveReviewAndVerification.getPrimaryKey(),
			explosiveReviewAndVerification);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				explosiveReviewAndVerification.getUuid(),
				explosiveReviewAndVerification.getGroupId()
			},
			explosiveReviewAndVerification);

		finderCache.putResult(
			_finderPathFetchBygetEXP_RV_CI,
			new Object[] {explosiveReviewAndVerification.getCaseId()},
			explosiveReviewAndVerification);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the explosive review and verifications in the entity cache if it is enabled.
	 *
	 * @param explosiveReviewAndVerifications the explosive review and verifications
	 */
	@Override
	public void cacheResult(
		List<ExplosiveReviewAndVerification> explosiveReviewAndVerifications) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (explosiveReviewAndVerifications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (ExplosiveReviewAndVerification explosiveReviewAndVerification :
				explosiveReviewAndVerifications) {

			if (entityCache.getResult(
					ExplosiveReviewAndVerificationImpl.class,
					explosiveReviewAndVerification.getPrimaryKey()) == null) {

				cacheResult(explosiveReviewAndVerification);
			}
		}
	}

	/**
	 * Clears the cache for all explosive review and verifications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ExplosiveReviewAndVerificationImpl.class);

		finderCache.clearCache(ExplosiveReviewAndVerificationImpl.class);
	}

	/**
	 * Clears the cache for the explosive review and verification.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		ExplosiveReviewAndVerification explosiveReviewAndVerification) {

		entityCache.removeResult(
			ExplosiveReviewAndVerificationImpl.class,
			explosiveReviewAndVerification);
	}

	@Override
	public void clearCache(
		List<ExplosiveReviewAndVerification> explosiveReviewAndVerifications) {

		for (ExplosiveReviewAndVerification explosiveReviewAndVerification :
				explosiveReviewAndVerifications) {

			entityCache.removeResult(
				ExplosiveReviewAndVerificationImpl.class,
				explosiveReviewAndVerification);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ExplosiveReviewAndVerificationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				ExplosiveReviewAndVerificationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		ExplosiveReviewAndVerificationModelImpl
			explosiveReviewAndVerificationModelImpl) {

		Object[] args = new Object[] {
			explosiveReviewAndVerificationModelImpl.getUuid(),
			explosiveReviewAndVerificationModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args,
			explosiveReviewAndVerificationModelImpl);

		args = new Object[] {
			explosiveReviewAndVerificationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetEXP_RV_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetEXP_RV_CI, args,
			explosiveReviewAndVerificationModelImpl);
	}

	/**
	 * Creates a new explosive review and verification with the primary key. Does not add the explosive review and verification to the database.
	 *
	 * @param issuanceId the primary key for the new explosive review and verification
	 * @return the new explosive review and verification
	 */
	@Override
	public ExplosiveReviewAndVerification create(long issuanceId) {
		ExplosiveReviewAndVerification explosiveReviewAndVerification =
			new ExplosiveReviewAndVerificationImpl();

		explosiveReviewAndVerification.setNew(true);
		explosiveReviewAndVerification.setPrimaryKey(issuanceId);

		String uuid = PortalUUIDUtil.generate();

		explosiveReviewAndVerification.setUuid(uuid);

		explosiveReviewAndVerification.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return explosiveReviewAndVerification;
	}

	/**
	 * Removes the explosive review and verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param issuanceId the primary key of the explosive review and verification
	 * @return the explosive review and verification that was removed
	 * @throws NoSuchExplosiveReviewAndVerificationException if a explosive review and verification with the primary key could not be found
	 */
	@Override
	public ExplosiveReviewAndVerification remove(long issuanceId)
		throws NoSuchExplosiveReviewAndVerificationException {

		return remove((Serializable)issuanceId);
	}

	/**
	 * Removes the explosive review and verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the explosive review and verification
	 * @return the explosive review and verification that was removed
	 * @throws NoSuchExplosiveReviewAndVerificationException if a explosive review and verification with the primary key could not be found
	 */
	@Override
	public ExplosiveReviewAndVerification remove(Serializable primaryKey)
		throws NoSuchExplosiveReviewAndVerificationException {

		Session session = null;

		try {
			session = openSession();

			ExplosiveReviewAndVerification explosiveReviewAndVerification =
				(ExplosiveReviewAndVerification)session.get(
					ExplosiveReviewAndVerificationImpl.class, primaryKey);

			if (explosiveReviewAndVerification == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchExplosiveReviewAndVerificationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(explosiveReviewAndVerification);
		}
		catch (NoSuchExplosiveReviewAndVerificationException
					noSuchEntityException) {

			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected ExplosiveReviewAndVerification removeImpl(
		ExplosiveReviewAndVerification explosiveReviewAndVerification) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(explosiveReviewAndVerification)) {
				explosiveReviewAndVerification =
					(ExplosiveReviewAndVerification)session.get(
						ExplosiveReviewAndVerificationImpl.class,
						explosiveReviewAndVerification.getPrimaryKeyObj());
			}

			if (explosiveReviewAndVerification != null) {
				session.delete(explosiveReviewAndVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (explosiveReviewAndVerification != null) {
			clearCache(explosiveReviewAndVerification);
		}

		return explosiveReviewAndVerification;
	}

	@Override
	public ExplosiveReviewAndVerification updateImpl(
		ExplosiveReviewAndVerification explosiveReviewAndVerification) {

		boolean isNew = explosiveReviewAndVerification.isNew();

		if (!(explosiveReviewAndVerification instanceof
				ExplosiveReviewAndVerificationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					explosiveReviewAndVerification.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					explosiveReviewAndVerification);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in explosiveReviewAndVerification proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ExplosiveReviewAndVerification implementation " +
					explosiveReviewAndVerification.getClass());
		}

		ExplosiveReviewAndVerificationModelImpl
			explosiveReviewAndVerificationModelImpl =
				(ExplosiveReviewAndVerificationModelImpl)
					explosiveReviewAndVerification;

		if (Validator.isNull(explosiveReviewAndVerification.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			explosiveReviewAndVerification.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (explosiveReviewAndVerification.getCreateDate() == null)) {
			if (serviceContext == null) {
				explosiveReviewAndVerification.setCreateDate(date);
			}
			else {
				explosiveReviewAndVerification.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!explosiveReviewAndVerificationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				explosiveReviewAndVerification.setModifiedDate(date);
			}
			else {
				explosiveReviewAndVerification.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(explosiveReviewAndVerification);
			}
			else {
				explosiveReviewAndVerification =
					(ExplosiveReviewAndVerification)session.merge(
						explosiveReviewAndVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ExplosiveReviewAndVerificationImpl.class,
			explosiveReviewAndVerificationModelImpl, false, true);

		cacheUniqueFindersCache(explosiveReviewAndVerificationModelImpl);

		if (isNew) {
			explosiveReviewAndVerification.setNew(false);
		}

		explosiveReviewAndVerification.resetOriginalValues();

		return explosiveReviewAndVerification;
	}

	/**
	 * Returns the explosive review and verification with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the explosive review and verification
	 * @return the explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a explosive review and verification with the primary key could not be found
	 */
	@Override
	public ExplosiveReviewAndVerification findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchExplosiveReviewAndVerificationException {

		ExplosiveReviewAndVerification explosiveReviewAndVerification =
			fetchByPrimaryKey(primaryKey);

		if (explosiveReviewAndVerification == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchExplosiveReviewAndVerificationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return explosiveReviewAndVerification;
	}

	/**
	 * Returns the explosive review and verification with the primary key or throws a <code>NoSuchExplosiveReviewAndVerificationException</code> if it could not be found.
	 *
	 * @param issuanceId the primary key of the explosive review and verification
	 * @return the explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a explosive review and verification with the primary key could not be found
	 */
	@Override
	public ExplosiveReviewAndVerification findByPrimaryKey(long issuanceId)
		throws NoSuchExplosiveReviewAndVerificationException {

		return findByPrimaryKey((Serializable)issuanceId);
	}

	/**
	 * Returns the explosive review and verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param issuanceId the primary key of the explosive review and verification
	 * @return the explosive review and verification, or <code>null</code> if a explosive review and verification with the primary key could not be found
	 */
	@Override
	public ExplosiveReviewAndVerification fetchByPrimaryKey(long issuanceId) {
		return fetchByPrimaryKey((Serializable)issuanceId);
	}

	/**
	 * Returns all the explosive review and verifications.
	 *
	 * @return the explosive review and verifications
	 */
	@Override
	public List<ExplosiveReviewAndVerification> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the explosive review and verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @return the range of explosive review and verifications
	 */
	@Override
	public List<ExplosiveReviewAndVerification> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the explosive review and verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of explosive review and verifications
	 */
	@Override
	public List<ExplosiveReviewAndVerification> findAll(
		int start, int end,
		OrderByComparator<ExplosiveReviewAndVerification> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the explosive review and verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of explosive review and verifications
	 */
	@Override
	public List<ExplosiveReviewAndVerification> findAll(
		int start, int end,
		OrderByComparator<ExplosiveReviewAndVerification> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<ExplosiveReviewAndVerification> list = null;

		if (useFinderCache) {
			list = (List<ExplosiveReviewAndVerification>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_EXPLOSIVEREVIEWANDVERIFICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_EXPLOSIVEREVIEWANDVERIFICATION;

				sql = sql.concat(
					ExplosiveReviewAndVerificationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ExplosiveReviewAndVerification>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the explosive review and verifications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ExplosiveReviewAndVerification explosiveReviewAndVerification :
				findAll()) {

			remove(explosiveReviewAndVerification);
		}
	}

	/**
	 * Returns the number of explosive review and verifications.
	 *
	 * @return the number of explosive review and verifications
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_EXPLOSIVEREVIEWANDVERIFICATION);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "issuanceId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_EXPLOSIVEREVIEWANDVERIFICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ExplosiveReviewAndVerificationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the explosive review and verification persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_finderPathFetchByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, true);

		_finderPathCountByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, false);

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathCountByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, false);

		_finderPathFetchBygetEXP_RV_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetEXP_RV_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetEXP_RV_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetEXP_RV_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetEXP_RV_List_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetEXP_RV_List_CI",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetEXP_RV_List_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetEXP_RV_List_CI", new String[] {String.class.getName()},
			new String[] {"caseId"}, true);

		_finderPathCountBygetEXP_RV_List_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetEXP_RV_List_CI", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		ExplosiveReviewAndVerificationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		ExplosiveReviewAndVerificationUtil.setPersistence(null);

		entityCache.removeCache(
			ExplosiveReviewAndVerificationImpl.class.getName());
	}

	@Override
	@Reference(
		target = EXPLOSIVE_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = EXPLOSIVE_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = EXPLOSIVE_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_EXPLOSIVEREVIEWANDVERIFICATION =
		"SELECT explosiveReviewAndVerification FROM ExplosiveReviewAndVerification explosiveReviewAndVerification";

	private static final String
		_SQL_SELECT_EXPLOSIVEREVIEWANDVERIFICATION_WHERE =
			"SELECT explosiveReviewAndVerification FROM ExplosiveReviewAndVerification explosiveReviewAndVerification WHERE ";

	private static final String _SQL_COUNT_EXPLOSIVEREVIEWANDVERIFICATION =
		"SELECT COUNT(explosiveReviewAndVerification) FROM ExplosiveReviewAndVerification explosiveReviewAndVerification";

	private static final String
		_SQL_COUNT_EXPLOSIVEREVIEWANDVERIFICATION_WHERE =
			"SELECT COUNT(explosiveReviewAndVerification) FROM ExplosiveReviewAndVerification explosiveReviewAndVerification WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"explosiveReviewAndVerification.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ExplosiveReviewAndVerification exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ExplosiveReviewAndVerification exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ExplosiveReviewAndVerificationPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}