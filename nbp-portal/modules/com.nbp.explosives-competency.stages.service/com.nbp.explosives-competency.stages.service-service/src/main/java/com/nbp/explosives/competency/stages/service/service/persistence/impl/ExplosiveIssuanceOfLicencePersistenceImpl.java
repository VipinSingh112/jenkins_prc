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

import com.nbp.explosives.competency.stages.service.exception.NoSuchExplosiveIssuanceOfLicenceException;
import com.nbp.explosives.competency.stages.service.model.ExplosiveIssuanceOfLicence;
import com.nbp.explosives.competency.stages.service.model.ExplosiveIssuanceOfLicenceTable;
import com.nbp.explosives.competency.stages.service.model.impl.ExplosiveIssuanceOfLicenceImpl;
import com.nbp.explosives.competency.stages.service.model.impl.ExplosiveIssuanceOfLicenceModelImpl;
import com.nbp.explosives.competency.stages.service.service.persistence.ExplosiveIssuanceOfLicencePersistence;
import com.nbp.explosives.competency.stages.service.service.persistence.ExplosiveIssuanceOfLicenceUtil;
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
 * The persistence implementation for the explosive issuance of licence service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ExplosiveIssuanceOfLicencePersistence.class)
public class ExplosiveIssuanceOfLicencePersistenceImpl
	extends BasePersistenceImpl<ExplosiveIssuanceOfLicence>
	implements ExplosiveIssuanceOfLicencePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ExplosiveIssuanceOfLicenceUtil</code> to access the explosive issuance of licence persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ExplosiveIssuanceOfLicenceImpl.class.getName();

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
	 * Returns all the explosive issuance of licences where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching explosive issuance of licences
	 */
	@Override
	public List<ExplosiveIssuanceOfLicence> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the explosive issuance of licences where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @return the range of matching explosive issuance of licences
	 */
	@Override
	public List<ExplosiveIssuanceOfLicence> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the explosive issuance of licences where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive issuance of licences
	 */
	@Override
	public List<ExplosiveIssuanceOfLicence> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the explosive issuance of licences where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive issuance of licences
	 */
	@Override
	public List<ExplosiveIssuanceOfLicence> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator,
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

		List<ExplosiveIssuanceOfLicence> list = null;

		if (useFinderCache) {
			list = (List<ExplosiveIssuanceOfLicence>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence :
						list) {

					if (!uuid.equals(explosiveIssuanceOfLicence.getUuid())) {
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

			sb.append(_SQL_SELECT_EXPLOSIVEISSUANCEOFLICENCE_WHERE);

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
				sb.append(ExplosiveIssuanceOfLicenceModelImpl.ORDER_BY_JPQL);
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

				list = (List<ExplosiveIssuanceOfLicence>)QueryUtil.list(
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
	 * Returns the first explosive issuance of licence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a matching explosive issuance of licence could not be found
	 */
	@Override
	public ExplosiveIssuanceOfLicence findByUuid_First(
			String uuid,
			OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator)
		throws NoSuchExplosiveIssuanceOfLicenceException {

		ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence =
			fetchByUuid_First(uuid, orderByComparator);

		if (explosiveIssuanceOfLicence != null) {
			return explosiveIssuanceOfLicence;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchExplosiveIssuanceOfLicenceException(sb.toString());
	}

	/**
	 * Returns the first explosive issuance of licence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive issuance of licence, or <code>null</code> if a matching explosive issuance of licence could not be found
	 */
	@Override
	public ExplosiveIssuanceOfLicence fetchByUuid_First(
		String uuid,
		OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator) {

		List<ExplosiveIssuanceOfLicence> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last explosive issuance of licence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a matching explosive issuance of licence could not be found
	 */
	@Override
	public ExplosiveIssuanceOfLicence findByUuid_Last(
			String uuid,
			OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator)
		throws NoSuchExplosiveIssuanceOfLicenceException {

		ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence =
			fetchByUuid_Last(uuid, orderByComparator);

		if (explosiveIssuanceOfLicence != null) {
			return explosiveIssuanceOfLicence;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchExplosiveIssuanceOfLicenceException(sb.toString());
	}

	/**
	 * Returns the last explosive issuance of licence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive issuance of licence, or <code>null</code> if a matching explosive issuance of licence could not be found
	 */
	@Override
	public ExplosiveIssuanceOfLicence fetchByUuid_Last(
		String uuid,
		OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<ExplosiveIssuanceOfLicence> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the explosive issuance of licences before and after the current explosive issuance of licence in the ordered set where uuid = &#63;.
	 *
	 * @param issuanceId the primary key of the current explosive issuance of licence
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a explosive issuance of licence with the primary key could not be found
	 */
	@Override
	public ExplosiveIssuanceOfLicence[] findByUuid_PrevAndNext(
			long issuanceId, String uuid,
			OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator)
		throws NoSuchExplosiveIssuanceOfLicenceException {

		uuid = Objects.toString(uuid, "");

		ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence =
			findByPrimaryKey(issuanceId);

		Session session = null;

		try {
			session = openSession();

			ExplosiveIssuanceOfLicence[] array =
				new ExplosiveIssuanceOfLicenceImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, explosiveIssuanceOfLicence, uuid, orderByComparator,
				true);

			array[1] = explosiveIssuanceOfLicence;

			array[2] = getByUuid_PrevAndNext(
				session, explosiveIssuanceOfLicence, uuid, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ExplosiveIssuanceOfLicence getByUuid_PrevAndNext(
		Session session, ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence,
		String uuid,
		OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator,
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

		sb.append(_SQL_SELECT_EXPLOSIVEISSUANCEOFLICENCE_WHERE);

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
			sb.append(ExplosiveIssuanceOfLicenceModelImpl.ORDER_BY_JPQL);
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
						explosiveIssuanceOfLicence)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ExplosiveIssuanceOfLicence> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the explosive issuance of licences where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(explosiveIssuanceOfLicence);
		}
	}

	/**
	 * Returns the number of explosive issuance of licences where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching explosive issuance of licences
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EXPLOSIVEISSUANCEOFLICENCE_WHERE);

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
		"explosiveIssuanceOfLicence.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(explosiveIssuanceOfLicence.uuid IS NULL OR explosiveIssuanceOfLicence.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the explosive issuance of licence where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchExplosiveIssuanceOfLicenceException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a matching explosive issuance of licence could not be found
	 */
	@Override
	public ExplosiveIssuanceOfLicence findByUUID_G(String uuid, long groupId)
		throws NoSuchExplosiveIssuanceOfLicenceException {

		ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence = fetchByUUID_G(
			uuid, groupId);

		if (explosiveIssuanceOfLicence == null) {
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

			throw new NoSuchExplosiveIssuanceOfLicenceException(sb.toString());
		}

		return explosiveIssuanceOfLicence;
	}

	/**
	 * Returns the explosive issuance of licence where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching explosive issuance of licence, or <code>null</code> if a matching explosive issuance of licence could not be found
	 */
	@Override
	public ExplosiveIssuanceOfLicence fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the explosive issuance of licence where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive issuance of licence, or <code>null</code> if a matching explosive issuance of licence could not be found
	 */
	@Override
	public ExplosiveIssuanceOfLicence fetchByUUID_G(
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

		if (result instanceof ExplosiveIssuanceOfLicence) {
			ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence =
				(ExplosiveIssuanceOfLicence)result;

			if (!Objects.equals(uuid, explosiveIssuanceOfLicence.getUuid()) ||
				(groupId != explosiveIssuanceOfLicence.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_EXPLOSIVEISSUANCEOFLICENCE_WHERE);

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

				List<ExplosiveIssuanceOfLicence> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence =
						list.get(0);

					result = explosiveIssuanceOfLicence;

					cacheResult(explosiveIssuanceOfLicence);
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
			return (ExplosiveIssuanceOfLicence)result;
		}
	}

	/**
	 * Removes the explosive issuance of licence where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the explosive issuance of licence that was removed
	 */
	@Override
	public ExplosiveIssuanceOfLicence removeByUUID_G(String uuid, long groupId)
		throws NoSuchExplosiveIssuanceOfLicenceException {

		ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence = findByUUID_G(
			uuid, groupId);

		return remove(explosiveIssuanceOfLicence);
	}

	/**
	 * Returns the number of explosive issuance of licences where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching explosive issuance of licences
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_EXPLOSIVEISSUANCEOFLICENCE_WHERE);

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
		"explosiveIssuanceOfLicence.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(explosiveIssuanceOfLicence.uuid IS NULL OR explosiveIssuanceOfLicence.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"explosiveIssuanceOfLicence.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the explosive issuance of licences where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching explosive issuance of licences
	 */
	@Override
	public List<ExplosiveIssuanceOfLicence> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the explosive issuance of licences where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @return the range of matching explosive issuance of licences
	 */
	@Override
	public List<ExplosiveIssuanceOfLicence> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the explosive issuance of licences where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive issuance of licences
	 */
	@Override
	public List<ExplosiveIssuanceOfLicence> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the explosive issuance of licences where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive issuance of licences
	 */
	@Override
	public List<ExplosiveIssuanceOfLicence> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator,
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

		List<ExplosiveIssuanceOfLicence> list = null;

		if (useFinderCache) {
			list = (List<ExplosiveIssuanceOfLicence>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence :
						list) {

					if (!uuid.equals(explosiveIssuanceOfLicence.getUuid()) ||
						(companyId !=
							explosiveIssuanceOfLicence.getCompanyId())) {

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

			sb.append(_SQL_SELECT_EXPLOSIVEISSUANCEOFLICENCE_WHERE);

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
				sb.append(ExplosiveIssuanceOfLicenceModelImpl.ORDER_BY_JPQL);
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

				list = (List<ExplosiveIssuanceOfLicence>)QueryUtil.list(
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
	 * Returns the first explosive issuance of licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a matching explosive issuance of licence could not be found
	 */
	@Override
	public ExplosiveIssuanceOfLicence findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator)
		throws NoSuchExplosiveIssuanceOfLicenceException {

		ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence =
			fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (explosiveIssuanceOfLicence != null) {
			return explosiveIssuanceOfLicence;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchExplosiveIssuanceOfLicenceException(sb.toString());
	}

	/**
	 * Returns the first explosive issuance of licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive issuance of licence, or <code>null</code> if a matching explosive issuance of licence could not be found
	 */
	@Override
	public ExplosiveIssuanceOfLicence fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator) {

		List<ExplosiveIssuanceOfLicence> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last explosive issuance of licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a matching explosive issuance of licence could not be found
	 */
	@Override
	public ExplosiveIssuanceOfLicence findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator)
		throws NoSuchExplosiveIssuanceOfLicenceException {

		ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence =
			fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (explosiveIssuanceOfLicence != null) {
			return explosiveIssuanceOfLicence;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchExplosiveIssuanceOfLicenceException(sb.toString());
	}

	/**
	 * Returns the last explosive issuance of licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive issuance of licence, or <code>null</code> if a matching explosive issuance of licence could not be found
	 */
	@Override
	public ExplosiveIssuanceOfLicence fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<ExplosiveIssuanceOfLicence> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the explosive issuance of licences before and after the current explosive issuance of licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param issuanceId the primary key of the current explosive issuance of licence
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a explosive issuance of licence with the primary key could not be found
	 */
	@Override
	public ExplosiveIssuanceOfLicence[] findByUuid_C_PrevAndNext(
			long issuanceId, String uuid, long companyId,
			OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator)
		throws NoSuchExplosiveIssuanceOfLicenceException {

		uuid = Objects.toString(uuid, "");

		ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence =
			findByPrimaryKey(issuanceId);

		Session session = null;

		try {
			session = openSession();

			ExplosiveIssuanceOfLicence[] array =
				new ExplosiveIssuanceOfLicenceImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, explosiveIssuanceOfLicence, uuid, companyId,
				orderByComparator, true);

			array[1] = explosiveIssuanceOfLicence;

			array[2] = getByUuid_C_PrevAndNext(
				session, explosiveIssuanceOfLicence, uuid, companyId,
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

	protected ExplosiveIssuanceOfLicence getByUuid_C_PrevAndNext(
		Session session, ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence,
		String uuid, long companyId,
		OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator,
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

		sb.append(_SQL_SELECT_EXPLOSIVEISSUANCEOFLICENCE_WHERE);

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
			sb.append(ExplosiveIssuanceOfLicenceModelImpl.ORDER_BY_JPQL);
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
						explosiveIssuanceOfLicence)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ExplosiveIssuanceOfLicence> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the explosive issuance of licences where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(explosiveIssuanceOfLicence);
		}
	}

	/**
	 * Returns the number of explosive issuance of licences where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching explosive issuance of licences
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_EXPLOSIVEISSUANCEOFLICENCE_WHERE);

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
		"explosiveIssuanceOfLicence.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(explosiveIssuanceOfLicence.uuid IS NULL OR explosiveIssuanceOfLicence.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"explosiveIssuanceOfLicence.companyId = ?";

	private FinderPath _finderPathFetchBygetEXP_CD_CI;
	private FinderPath _finderPathCountBygetEXP_CD_CI;

	/**
	 * Returns the explosive issuance of licence where caseId = &#63; or throws a <code>NoSuchExplosiveIssuanceOfLicenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a matching explosive issuance of licence could not be found
	 */
	@Override
	public ExplosiveIssuanceOfLicence findBygetEXP_CD_CI(String caseId)
		throws NoSuchExplosiveIssuanceOfLicenceException {

		ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence =
			fetchBygetEXP_CD_CI(caseId);

		if (explosiveIssuanceOfLicence == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchExplosiveIssuanceOfLicenceException(sb.toString());
		}

		return explosiveIssuanceOfLicence;
	}

	/**
	 * Returns the explosive issuance of licence where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching explosive issuance of licence, or <code>null</code> if a matching explosive issuance of licence could not be found
	 */
	@Override
	public ExplosiveIssuanceOfLicence fetchBygetEXP_CD_CI(String caseId) {
		return fetchBygetEXP_CD_CI(caseId, true);
	}

	/**
	 * Returns the explosive issuance of licence where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive issuance of licence, or <code>null</code> if a matching explosive issuance of licence could not be found
	 */
	@Override
	public ExplosiveIssuanceOfLicence fetchBygetEXP_CD_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetEXP_CD_CI, finderArgs, this);
		}

		if (result instanceof ExplosiveIssuanceOfLicence) {
			ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence =
				(ExplosiveIssuanceOfLicence)result;

			if (!Objects.equals(
					caseId, explosiveIssuanceOfLicence.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_EXPLOSIVEISSUANCEOFLICENCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETEXP_CD_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETEXP_CD_CI_CASEID_2);
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

				List<ExplosiveIssuanceOfLicence> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetEXP_CD_CI, finderArgs, list);
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
								"ExplosiveIssuanceOfLicencePersistenceImpl.fetchBygetEXP_CD_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence =
						list.get(0);

					result = explosiveIssuanceOfLicence;

					cacheResult(explosiveIssuanceOfLicence);
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
			return (ExplosiveIssuanceOfLicence)result;
		}
	}

	/**
	 * Removes the explosive issuance of licence where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the explosive issuance of licence that was removed
	 */
	@Override
	public ExplosiveIssuanceOfLicence removeBygetEXP_CD_CI(String caseId)
		throws NoSuchExplosiveIssuanceOfLicenceException {

		ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence =
			findBygetEXP_CD_CI(caseId);

		return remove(explosiveIssuanceOfLicence);
	}

	/**
	 * Returns the number of explosive issuance of licences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching explosive issuance of licences
	 */
	@Override
	public int countBygetEXP_CD_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetEXP_CD_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EXPLOSIVEISSUANCEOFLICENCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETEXP_CD_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETEXP_CD_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETEXP_CD_CI_CASEID_2 =
		"explosiveIssuanceOfLicence.caseId = ?";

	private static final String _FINDER_COLUMN_GETEXP_CD_CI_CASEID_3 =
		"(explosiveIssuanceOfLicence.caseId IS NULL OR explosiveIssuanceOfLicence.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetEXP_CD_List_CI;
	private FinderPath _finderPathWithoutPaginationFindBygetEXP_CD_List_CI;
	private FinderPath _finderPathCountBygetEXP_CD_List_CI;

	/**
	 * Returns all the explosive issuance of licences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching explosive issuance of licences
	 */
	@Override
	public List<ExplosiveIssuanceOfLicence> findBygetEXP_CD_List_CI(
		String caseId) {

		return findBygetEXP_CD_List_CI(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the explosive issuance of licences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @return the range of matching explosive issuance of licences
	 */
	@Override
	public List<ExplosiveIssuanceOfLicence> findBygetEXP_CD_List_CI(
		String caseId, int start, int end) {

		return findBygetEXP_CD_List_CI(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the explosive issuance of licences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive issuance of licences
	 */
	@Override
	public List<ExplosiveIssuanceOfLicence> findBygetEXP_CD_List_CI(
		String caseId, int start, int end,
		OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator) {

		return findBygetEXP_CD_List_CI(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the explosive issuance of licences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive issuance of licences
	 */
	@Override
	public List<ExplosiveIssuanceOfLicence> findBygetEXP_CD_List_CI(
		String caseId, int start, int end,
		OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetEXP_CD_List_CI;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetEXP_CD_List_CI;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<ExplosiveIssuanceOfLicence> list = null;

		if (useFinderCache) {
			list = (List<ExplosiveIssuanceOfLicence>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence :
						list) {

					if (!caseId.equals(
							explosiveIssuanceOfLicence.getCaseId())) {

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

			sb.append(_SQL_SELECT_EXPLOSIVEISSUANCEOFLICENCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETEXP_CD_LIST_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETEXP_CD_LIST_CI_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ExplosiveIssuanceOfLicenceModelImpl.ORDER_BY_JPQL);
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

				list = (List<ExplosiveIssuanceOfLicence>)QueryUtil.list(
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
	 * Returns the first explosive issuance of licence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a matching explosive issuance of licence could not be found
	 */
	@Override
	public ExplosiveIssuanceOfLicence findBygetEXP_CD_List_CI_First(
			String caseId,
			OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator)
		throws NoSuchExplosiveIssuanceOfLicenceException {

		ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence =
			fetchBygetEXP_CD_List_CI_First(caseId, orderByComparator);

		if (explosiveIssuanceOfLicence != null) {
			return explosiveIssuanceOfLicence;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchExplosiveIssuanceOfLicenceException(sb.toString());
	}

	/**
	 * Returns the first explosive issuance of licence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive issuance of licence, or <code>null</code> if a matching explosive issuance of licence could not be found
	 */
	@Override
	public ExplosiveIssuanceOfLicence fetchBygetEXP_CD_List_CI_First(
		String caseId,
		OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator) {

		List<ExplosiveIssuanceOfLicence> list = findBygetEXP_CD_List_CI(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last explosive issuance of licence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a matching explosive issuance of licence could not be found
	 */
	@Override
	public ExplosiveIssuanceOfLicence findBygetEXP_CD_List_CI_Last(
			String caseId,
			OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator)
		throws NoSuchExplosiveIssuanceOfLicenceException {

		ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence =
			fetchBygetEXP_CD_List_CI_Last(caseId, orderByComparator);

		if (explosiveIssuanceOfLicence != null) {
			return explosiveIssuanceOfLicence;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchExplosiveIssuanceOfLicenceException(sb.toString());
	}

	/**
	 * Returns the last explosive issuance of licence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive issuance of licence, or <code>null</code> if a matching explosive issuance of licence could not be found
	 */
	@Override
	public ExplosiveIssuanceOfLicence fetchBygetEXP_CD_List_CI_Last(
		String caseId,
		OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator) {

		int count = countBygetEXP_CD_List_CI(caseId);

		if (count == 0) {
			return null;
		}

		List<ExplosiveIssuanceOfLicence> list = findBygetEXP_CD_List_CI(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the explosive issuance of licences before and after the current explosive issuance of licence in the ordered set where caseId = &#63;.
	 *
	 * @param issuanceId the primary key of the current explosive issuance of licence
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a explosive issuance of licence with the primary key could not be found
	 */
	@Override
	public ExplosiveIssuanceOfLicence[] findBygetEXP_CD_List_CI_PrevAndNext(
			long issuanceId, String caseId,
			OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator)
		throws NoSuchExplosiveIssuanceOfLicenceException {

		caseId = Objects.toString(caseId, "");

		ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence =
			findByPrimaryKey(issuanceId);

		Session session = null;

		try {
			session = openSession();

			ExplosiveIssuanceOfLicence[] array =
				new ExplosiveIssuanceOfLicenceImpl[3];

			array[0] = getBygetEXP_CD_List_CI_PrevAndNext(
				session, explosiveIssuanceOfLicence, caseId, orderByComparator,
				true);

			array[1] = explosiveIssuanceOfLicence;

			array[2] = getBygetEXP_CD_List_CI_PrevAndNext(
				session, explosiveIssuanceOfLicence, caseId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ExplosiveIssuanceOfLicence getBygetEXP_CD_List_CI_PrevAndNext(
		Session session, ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence,
		String caseId,
		OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator,
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

		sb.append(_SQL_SELECT_EXPLOSIVEISSUANCEOFLICENCE_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETEXP_CD_LIST_CI_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETEXP_CD_LIST_CI_CASEID_2);
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
			sb.append(ExplosiveIssuanceOfLicenceModelImpl.ORDER_BY_JPQL);
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
						explosiveIssuanceOfLicence)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ExplosiveIssuanceOfLicence> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the explosive issuance of licences where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetEXP_CD_List_CI(String caseId) {
		for (ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence :
				findBygetEXP_CD_List_CI(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(explosiveIssuanceOfLicence);
		}
	}

	/**
	 * Returns the number of explosive issuance of licences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching explosive issuance of licences
	 */
	@Override
	public int countBygetEXP_CD_List_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetEXP_CD_List_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EXPLOSIVEISSUANCEOFLICENCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETEXP_CD_LIST_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETEXP_CD_LIST_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETEXP_CD_LIST_CI_CASEID_2 =
		"explosiveIssuanceOfLicence.caseId = ?";

	private static final String _FINDER_COLUMN_GETEXP_CD_LIST_CI_CASEID_3 =
		"(explosiveIssuanceOfLicence.caseId IS NULL OR explosiveIssuanceOfLicence.caseId = '')";

	public ExplosiveIssuanceOfLicencePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(ExplosiveIssuanceOfLicence.class);

		setModelImplClass(ExplosiveIssuanceOfLicenceImpl.class);
		setModelPKClass(long.class);

		setTable(ExplosiveIssuanceOfLicenceTable.INSTANCE);
	}

	/**
	 * Caches the explosive issuance of licence in the entity cache if it is enabled.
	 *
	 * @param explosiveIssuanceOfLicence the explosive issuance of licence
	 */
	@Override
	public void cacheResult(
		ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence) {

		entityCache.putResult(
			ExplosiveIssuanceOfLicenceImpl.class,
			explosiveIssuanceOfLicence.getPrimaryKey(),
			explosiveIssuanceOfLicence);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				explosiveIssuanceOfLicence.getUuid(),
				explosiveIssuanceOfLicence.getGroupId()
			},
			explosiveIssuanceOfLicence);

		finderCache.putResult(
			_finderPathFetchBygetEXP_CD_CI,
			new Object[] {explosiveIssuanceOfLicence.getCaseId()},
			explosiveIssuanceOfLicence);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the explosive issuance of licences in the entity cache if it is enabled.
	 *
	 * @param explosiveIssuanceOfLicences the explosive issuance of licences
	 */
	@Override
	public void cacheResult(
		List<ExplosiveIssuanceOfLicence> explosiveIssuanceOfLicences) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (explosiveIssuanceOfLicences.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence :
				explosiveIssuanceOfLicences) {

			if (entityCache.getResult(
					ExplosiveIssuanceOfLicenceImpl.class,
					explosiveIssuanceOfLicence.getPrimaryKey()) == null) {

				cacheResult(explosiveIssuanceOfLicence);
			}
		}
	}

	/**
	 * Clears the cache for all explosive issuance of licences.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ExplosiveIssuanceOfLicenceImpl.class);

		finderCache.clearCache(ExplosiveIssuanceOfLicenceImpl.class);
	}

	/**
	 * Clears the cache for the explosive issuance of licence.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence) {

		entityCache.removeResult(
			ExplosiveIssuanceOfLicenceImpl.class, explosiveIssuanceOfLicence);
	}

	@Override
	public void clearCache(
		List<ExplosiveIssuanceOfLicence> explosiveIssuanceOfLicences) {

		for (ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence :
				explosiveIssuanceOfLicences) {

			entityCache.removeResult(
				ExplosiveIssuanceOfLicenceImpl.class,
				explosiveIssuanceOfLicence);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ExplosiveIssuanceOfLicenceImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				ExplosiveIssuanceOfLicenceImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		ExplosiveIssuanceOfLicenceModelImpl
			explosiveIssuanceOfLicenceModelImpl) {

		Object[] args = new Object[] {
			explosiveIssuanceOfLicenceModelImpl.getUuid(),
			explosiveIssuanceOfLicenceModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args,
			explosiveIssuanceOfLicenceModelImpl);

		args = new Object[] {explosiveIssuanceOfLicenceModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetEXP_CD_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetEXP_CD_CI, args,
			explosiveIssuanceOfLicenceModelImpl);
	}

	/**
	 * Creates a new explosive issuance of licence with the primary key. Does not add the explosive issuance of licence to the database.
	 *
	 * @param issuanceId the primary key for the new explosive issuance of licence
	 * @return the new explosive issuance of licence
	 */
	@Override
	public ExplosiveIssuanceOfLicence create(long issuanceId) {
		ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence =
			new ExplosiveIssuanceOfLicenceImpl();

		explosiveIssuanceOfLicence.setNew(true);
		explosiveIssuanceOfLicence.setPrimaryKey(issuanceId);

		String uuid = PortalUUIDUtil.generate();

		explosiveIssuanceOfLicence.setUuid(uuid);

		explosiveIssuanceOfLicence.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return explosiveIssuanceOfLicence;
	}

	/**
	 * Removes the explosive issuance of licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param issuanceId the primary key of the explosive issuance of licence
	 * @return the explosive issuance of licence that was removed
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a explosive issuance of licence with the primary key could not be found
	 */
	@Override
	public ExplosiveIssuanceOfLicence remove(long issuanceId)
		throws NoSuchExplosiveIssuanceOfLicenceException {

		return remove((Serializable)issuanceId);
	}

	/**
	 * Removes the explosive issuance of licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the explosive issuance of licence
	 * @return the explosive issuance of licence that was removed
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a explosive issuance of licence with the primary key could not be found
	 */
	@Override
	public ExplosiveIssuanceOfLicence remove(Serializable primaryKey)
		throws NoSuchExplosiveIssuanceOfLicenceException {

		Session session = null;

		try {
			session = openSession();

			ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence =
				(ExplosiveIssuanceOfLicence)session.get(
					ExplosiveIssuanceOfLicenceImpl.class, primaryKey);

			if (explosiveIssuanceOfLicence == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchExplosiveIssuanceOfLicenceException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(explosiveIssuanceOfLicence);
		}
		catch (NoSuchExplosiveIssuanceOfLicenceException
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
	protected ExplosiveIssuanceOfLicence removeImpl(
		ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(explosiveIssuanceOfLicence)) {
				explosiveIssuanceOfLicence =
					(ExplosiveIssuanceOfLicence)session.get(
						ExplosiveIssuanceOfLicenceImpl.class,
						explosiveIssuanceOfLicence.getPrimaryKeyObj());
			}

			if (explosiveIssuanceOfLicence != null) {
				session.delete(explosiveIssuanceOfLicence);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (explosiveIssuanceOfLicence != null) {
			clearCache(explosiveIssuanceOfLicence);
		}

		return explosiveIssuanceOfLicence;
	}

	@Override
	public ExplosiveIssuanceOfLicence updateImpl(
		ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence) {

		boolean isNew = explosiveIssuanceOfLicence.isNew();

		if (!(explosiveIssuanceOfLicence instanceof
				ExplosiveIssuanceOfLicenceModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(explosiveIssuanceOfLicence.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					explosiveIssuanceOfLicence);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in explosiveIssuanceOfLicence proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ExplosiveIssuanceOfLicence implementation " +
					explosiveIssuanceOfLicence.getClass());
		}

		ExplosiveIssuanceOfLicenceModelImpl
			explosiveIssuanceOfLicenceModelImpl =
				(ExplosiveIssuanceOfLicenceModelImpl)explosiveIssuanceOfLicence;

		if (Validator.isNull(explosiveIssuanceOfLicence.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			explosiveIssuanceOfLicence.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (explosiveIssuanceOfLicence.getCreateDate() == null)) {
			if (serviceContext == null) {
				explosiveIssuanceOfLicence.setCreateDate(date);
			}
			else {
				explosiveIssuanceOfLicence.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!explosiveIssuanceOfLicenceModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				explosiveIssuanceOfLicence.setModifiedDate(date);
			}
			else {
				explosiveIssuanceOfLicence.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(explosiveIssuanceOfLicence);
			}
			else {
				explosiveIssuanceOfLicence =
					(ExplosiveIssuanceOfLicence)session.merge(
						explosiveIssuanceOfLicence);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ExplosiveIssuanceOfLicenceImpl.class,
			explosiveIssuanceOfLicenceModelImpl, false, true);

		cacheUniqueFindersCache(explosiveIssuanceOfLicenceModelImpl);

		if (isNew) {
			explosiveIssuanceOfLicence.setNew(false);
		}

		explosiveIssuanceOfLicence.resetOriginalValues();

		return explosiveIssuanceOfLicence;
	}

	/**
	 * Returns the explosive issuance of licence with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the explosive issuance of licence
	 * @return the explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a explosive issuance of licence with the primary key could not be found
	 */
	@Override
	public ExplosiveIssuanceOfLicence findByPrimaryKey(Serializable primaryKey)
		throws NoSuchExplosiveIssuanceOfLicenceException {

		ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence =
			fetchByPrimaryKey(primaryKey);

		if (explosiveIssuanceOfLicence == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchExplosiveIssuanceOfLicenceException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return explosiveIssuanceOfLicence;
	}

	/**
	 * Returns the explosive issuance of licence with the primary key or throws a <code>NoSuchExplosiveIssuanceOfLicenceException</code> if it could not be found.
	 *
	 * @param issuanceId the primary key of the explosive issuance of licence
	 * @return the explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a explosive issuance of licence with the primary key could not be found
	 */
	@Override
	public ExplosiveIssuanceOfLicence findByPrimaryKey(long issuanceId)
		throws NoSuchExplosiveIssuanceOfLicenceException {

		return findByPrimaryKey((Serializable)issuanceId);
	}

	/**
	 * Returns the explosive issuance of licence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param issuanceId the primary key of the explosive issuance of licence
	 * @return the explosive issuance of licence, or <code>null</code> if a explosive issuance of licence with the primary key could not be found
	 */
	@Override
	public ExplosiveIssuanceOfLicence fetchByPrimaryKey(long issuanceId) {
		return fetchByPrimaryKey((Serializable)issuanceId);
	}

	/**
	 * Returns all the explosive issuance of licences.
	 *
	 * @return the explosive issuance of licences
	 */
	@Override
	public List<ExplosiveIssuanceOfLicence> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the explosive issuance of licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @return the range of explosive issuance of licences
	 */
	@Override
	public List<ExplosiveIssuanceOfLicence> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the explosive issuance of licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of explosive issuance of licences
	 */
	@Override
	public List<ExplosiveIssuanceOfLicence> findAll(
		int start, int end,
		OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the explosive issuance of licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of explosive issuance of licences
	 */
	@Override
	public List<ExplosiveIssuanceOfLicence> findAll(
		int start, int end,
		OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator,
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

		List<ExplosiveIssuanceOfLicence> list = null;

		if (useFinderCache) {
			list = (List<ExplosiveIssuanceOfLicence>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_EXPLOSIVEISSUANCEOFLICENCE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_EXPLOSIVEISSUANCEOFLICENCE;

				sql = sql.concat(
					ExplosiveIssuanceOfLicenceModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ExplosiveIssuanceOfLicence>)QueryUtil.list(
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
	 * Removes all the explosive issuance of licences from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence :
				findAll()) {

			remove(explosiveIssuanceOfLicence);
		}
	}

	/**
	 * Returns the number of explosive issuance of licences.
	 *
	 * @return the number of explosive issuance of licences
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
					_SQL_COUNT_EXPLOSIVEISSUANCEOFLICENCE);

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
		return _SQL_SELECT_EXPLOSIVEISSUANCEOFLICENCE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ExplosiveIssuanceOfLicenceModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the explosive issuance of licence persistence.
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

		_finderPathFetchBygetEXP_CD_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetEXP_CD_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetEXP_CD_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetEXP_CD_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetEXP_CD_List_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetEXP_CD_List_CI",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetEXP_CD_List_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetEXP_CD_List_CI", new String[] {String.class.getName()},
			new String[] {"caseId"}, true);

		_finderPathCountBygetEXP_CD_List_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetEXP_CD_List_CI", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		ExplosiveIssuanceOfLicenceUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		ExplosiveIssuanceOfLicenceUtil.setPersistence(null);

		entityCache.removeCache(ExplosiveIssuanceOfLicenceImpl.class.getName());
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

	private static final String _SQL_SELECT_EXPLOSIVEISSUANCEOFLICENCE =
		"SELECT explosiveIssuanceOfLicence FROM ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence";

	private static final String _SQL_SELECT_EXPLOSIVEISSUANCEOFLICENCE_WHERE =
		"SELECT explosiveIssuanceOfLicence FROM ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence WHERE ";

	private static final String _SQL_COUNT_EXPLOSIVEISSUANCEOFLICENCE =
		"SELECT COUNT(explosiveIssuanceOfLicence) FROM ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence";

	private static final String _SQL_COUNT_EXPLOSIVEISSUANCEOFLICENCE_WHERE =
		"SELECT COUNT(explosiveIssuanceOfLicence) FROM ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"explosiveIssuanceOfLicence.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ExplosiveIssuanceOfLicence exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ExplosiveIssuanceOfLicence exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ExplosiveIssuanceOfLicencePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}