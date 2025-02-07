/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service.persistence.impl;

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

import com.nbp.sez.status.application.stage.services.exception.NoSuchSezStatusARCDecisionException;
import com.nbp.sez.status.application.stage.services.model.SezStatusARCDecision;
import com.nbp.sez.status.application.stage.services.model.SezStatusARCDecisionTable;
import com.nbp.sez.status.application.stage.services.model.impl.SezStatusARCDecisionImpl;
import com.nbp.sez.status.application.stage.services.model.impl.SezStatusARCDecisionModelImpl;
import com.nbp.sez.status.application.stage.services.service.persistence.SezStatusARCDecisionPersistence;
import com.nbp.sez.status.application.stage.services.service.persistence.SezStatusARCDecisionUtil;
import com.nbp.sez.status.application.stage.services.service.persistence.impl.constants.SEZ_STATUS_STAGESPersistenceConstants;

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
 * The persistence implementation for the sez status arc decision service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezStatusARCDecisionPersistence.class)
public class SezStatusARCDecisionPersistenceImpl
	extends BasePersistenceImpl<SezStatusARCDecision>
	implements SezStatusARCDecisionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezStatusARCDecisionUtil</code> to access the sez status arc decision persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezStatusARCDecisionImpl.class.getName();

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
	 * Returns all the sez status arc decisions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching sez status arc decisions
	 */
	@Override
	public List<SezStatusARCDecision> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status arc decisions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusARCDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status arc decisions
	 * @param end the upper bound of the range of sez status arc decisions (not inclusive)
	 * @return the range of matching sez status arc decisions
	 */
	@Override
	public List<SezStatusARCDecision> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status arc decisions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusARCDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status arc decisions
	 * @param end the upper bound of the range of sez status arc decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status arc decisions
	 */
	@Override
	public List<SezStatusARCDecision> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SezStatusARCDecision> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status arc decisions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusARCDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status arc decisions
	 * @param end the upper bound of the range of sez status arc decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status arc decisions
	 */
	@Override
	public List<SezStatusARCDecision> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SezStatusARCDecision> orderByComparator,
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

		List<SezStatusARCDecision> list = null;

		if (useFinderCache) {
			list = (List<SezStatusARCDecision>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezStatusARCDecision sezStatusARCDecision : list) {
					if (!uuid.equals(sezStatusARCDecision.getUuid())) {
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

			sb.append(_SQL_SELECT_SEZSTATUSARCDECISION_WHERE);

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
				sb.append(SezStatusARCDecisionModelImpl.ORDER_BY_JPQL);
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

				list = (List<SezStatusARCDecision>)QueryUtil.list(
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
	 * Returns the first sez status arc decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status arc decision
	 * @throws NoSuchSezStatusARCDecisionException if a matching sez status arc decision could not be found
	 */
	@Override
	public SezStatusARCDecision findByUuid_First(
			String uuid,
			OrderByComparator<SezStatusARCDecision> orderByComparator)
		throws NoSuchSezStatusARCDecisionException {

		SezStatusARCDecision sezStatusARCDecision = fetchByUuid_First(
			uuid, orderByComparator);

		if (sezStatusARCDecision != null) {
			return sezStatusARCDecision;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchSezStatusARCDecisionException(sb.toString());
	}

	/**
	 * Returns the first sez status arc decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status arc decision, or <code>null</code> if a matching sez status arc decision could not be found
	 */
	@Override
	public SezStatusARCDecision fetchByUuid_First(
		String uuid,
		OrderByComparator<SezStatusARCDecision> orderByComparator) {

		List<SezStatusARCDecision> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez status arc decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status arc decision
	 * @throws NoSuchSezStatusARCDecisionException if a matching sez status arc decision could not be found
	 */
	@Override
	public SezStatusARCDecision findByUuid_Last(
			String uuid,
			OrderByComparator<SezStatusARCDecision> orderByComparator)
		throws NoSuchSezStatusARCDecisionException {

		SezStatusARCDecision sezStatusARCDecision = fetchByUuid_Last(
			uuid, orderByComparator);

		if (sezStatusARCDecision != null) {
			return sezStatusARCDecision;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchSezStatusARCDecisionException(sb.toString());
	}

	/**
	 * Returns the last sez status arc decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status arc decision, or <code>null</code> if a matching sez status arc decision could not be found
	 */
	@Override
	public SezStatusARCDecision fetchByUuid_Last(
		String uuid,
		OrderByComparator<SezStatusARCDecision> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<SezStatusARCDecision> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez status arc decisions before and after the current sez status arc decision in the ordered set where uuid = &#63;.
	 *
	 * @param sezStatusCommitteeId the primary key of the current sez status arc decision
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status arc decision
	 * @throws NoSuchSezStatusARCDecisionException if a sez status arc decision with the primary key could not be found
	 */
	@Override
	public SezStatusARCDecision[] findByUuid_PrevAndNext(
			long sezStatusCommitteeId, String uuid,
			OrderByComparator<SezStatusARCDecision> orderByComparator)
		throws NoSuchSezStatusARCDecisionException {

		uuid = Objects.toString(uuid, "");

		SezStatusARCDecision sezStatusARCDecision = findByPrimaryKey(
			sezStatusCommitteeId);

		Session session = null;

		try {
			session = openSession();

			SezStatusARCDecision[] array = new SezStatusARCDecisionImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, sezStatusARCDecision, uuid, orderByComparator, true);

			array[1] = sezStatusARCDecision;

			array[2] = getByUuid_PrevAndNext(
				session, sezStatusARCDecision, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected SezStatusARCDecision getByUuid_PrevAndNext(
		Session session, SezStatusARCDecision sezStatusARCDecision, String uuid,
		OrderByComparator<SezStatusARCDecision> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZSTATUSARCDECISION_WHERE);

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
			sb.append(SezStatusARCDecisionModelImpl.ORDER_BY_JPQL);
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
						sezStatusARCDecision)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezStatusARCDecision> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez status arc decisions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (SezStatusARCDecision sezStatusARCDecision :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(sezStatusARCDecision);
		}
	}

	/**
	 * Returns the number of sez status arc decisions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching sez status arc decisions
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZSTATUSARCDECISION_WHERE);

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
		"sezStatusARCDecision.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(sezStatusARCDecision.uuid IS NULL OR sezStatusARCDecision.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the sez status arc decision where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSezStatusARCDecisionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sez status arc decision
	 * @throws NoSuchSezStatusARCDecisionException if a matching sez status arc decision could not be found
	 */
	@Override
	public SezStatusARCDecision findByUUID_G(String uuid, long groupId)
		throws NoSuchSezStatusARCDecisionException {

		SezStatusARCDecision sezStatusARCDecision = fetchByUUID_G(
			uuid, groupId);

		if (sezStatusARCDecision == null) {
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

			throw new NoSuchSezStatusARCDecisionException(sb.toString());
		}

		return sezStatusARCDecision;
	}

	/**
	 * Returns the sez status arc decision where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sez status arc decision, or <code>null</code> if a matching sez status arc decision could not be found
	 */
	@Override
	public SezStatusARCDecision fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the sez status arc decision where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status arc decision, or <code>null</code> if a matching sez status arc decision could not be found
	 */
	@Override
	public SezStatusARCDecision fetchByUUID_G(
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

		if (result instanceof SezStatusARCDecision) {
			SezStatusARCDecision sezStatusARCDecision =
				(SezStatusARCDecision)result;

			if (!Objects.equals(uuid, sezStatusARCDecision.getUuid()) ||
				(groupId != sezStatusARCDecision.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_SEZSTATUSARCDECISION_WHERE);

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

				List<SezStatusARCDecision> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					SezStatusARCDecision sezStatusARCDecision = list.get(0);

					result = sezStatusARCDecision;

					cacheResult(sezStatusARCDecision);
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
			return (SezStatusARCDecision)result;
		}
	}

	/**
	 * Removes the sez status arc decision where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the sez status arc decision that was removed
	 */
	@Override
	public SezStatusARCDecision removeByUUID_G(String uuid, long groupId)
		throws NoSuchSezStatusARCDecisionException {

		SezStatusARCDecision sezStatusARCDecision = findByUUID_G(uuid, groupId);

		return remove(sezStatusARCDecision);
	}

	/**
	 * Returns the number of sez status arc decisions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching sez status arc decisions
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_SEZSTATUSARCDECISION_WHERE);

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
		"sezStatusARCDecision.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(sezStatusARCDecision.uuid IS NULL OR sezStatusARCDecision.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"sezStatusARCDecision.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the sez status arc decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching sez status arc decisions
	 */
	@Override
	public List<SezStatusARCDecision> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status arc decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusARCDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status arc decisions
	 * @param end the upper bound of the range of sez status arc decisions (not inclusive)
	 * @return the range of matching sez status arc decisions
	 */
	@Override
	public List<SezStatusARCDecision> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status arc decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusARCDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status arc decisions
	 * @param end the upper bound of the range of sez status arc decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status arc decisions
	 */
	@Override
	public List<SezStatusARCDecision> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SezStatusARCDecision> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status arc decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusARCDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status arc decisions
	 * @param end the upper bound of the range of sez status arc decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status arc decisions
	 */
	@Override
	public List<SezStatusARCDecision> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SezStatusARCDecision> orderByComparator,
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

		List<SezStatusARCDecision> list = null;

		if (useFinderCache) {
			list = (List<SezStatusARCDecision>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezStatusARCDecision sezStatusARCDecision : list) {
					if (!uuid.equals(sezStatusARCDecision.getUuid()) ||
						(companyId != sezStatusARCDecision.getCompanyId())) {

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

			sb.append(_SQL_SELECT_SEZSTATUSARCDECISION_WHERE);

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
				sb.append(SezStatusARCDecisionModelImpl.ORDER_BY_JPQL);
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

				list = (List<SezStatusARCDecision>)QueryUtil.list(
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
	 * Returns the first sez status arc decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status arc decision
	 * @throws NoSuchSezStatusARCDecisionException if a matching sez status arc decision could not be found
	 */
	@Override
	public SezStatusARCDecision findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<SezStatusARCDecision> orderByComparator)
		throws NoSuchSezStatusARCDecisionException {

		SezStatusARCDecision sezStatusARCDecision = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (sezStatusARCDecision != null) {
			return sezStatusARCDecision;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchSezStatusARCDecisionException(sb.toString());
	}

	/**
	 * Returns the first sez status arc decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status arc decision, or <code>null</code> if a matching sez status arc decision could not be found
	 */
	@Override
	public SezStatusARCDecision fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<SezStatusARCDecision> orderByComparator) {

		List<SezStatusARCDecision> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez status arc decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status arc decision
	 * @throws NoSuchSezStatusARCDecisionException if a matching sez status arc decision could not be found
	 */
	@Override
	public SezStatusARCDecision findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<SezStatusARCDecision> orderByComparator)
		throws NoSuchSezStatusARCDecisionException {

		SezStatusARCDecision sezStatusARCDecision = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (sezStatusARCDecision != null) {
			return sezStatusARCDecision;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchSezStatusARCDecisionException(sb.toString());
	}

	/**
	 * Returns the last sez status arc decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status arc decision, or <code>null</code> if a matching sez status arc decision could not be found
	 */
	@Override
	public SezStatusARCDecision fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<SezStatusARCDecision> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<SezStatusARCDecision> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez status arc decisions before and after the current sez status arc decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param sezStatusCommitteeId the primary key of the current sez status arc decision
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status arc decision
	 * @throws NoSuchSezStatusARCDecisionException if a sez status arc decision with the primary key could not be found
	 */
	@Override
	public SezStatusARCDecision[] findByUuid_C_PrevAndNext(
			long sezStatusCommitteeId, String uuid, long companyId,
			OrderByComparator<SezStatusARCDecision> orderByComparator)
		throws NoSuchSezStatusARCDecisionException {

		uuid = Objects.toString(uuid, "");

		SezStatusARCDecision sezStatusARCDecision = findByPrimaryKey(
			sezStatusCommitteeId);

		Session session = null;

		try {
			session = openSession();

			SezStatusARCDecision[] array = new SezStatusARCDecisionImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, sezStatusARCDecision, uuid, companyId,
				orderByComparator, true);

			array[1] = sezStatusARCDecision;

			array[2] = getByUuid_C_PrevAndNext(
				session, sezStatusARCDecision, uuid, companyId,
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

	protected SezStatusARCDecision getByUuid_C_PrevAndNext(
		Session session, SezStatusARCDecision sezStatusARCDecision, String uuid,
		long companyId,
		OrderByComparator<SezStatusARCDecision> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZSTATUSARCDECISION_WHERE);

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
			sb.append(SezStatusARCDecisionModelImpl.ORDER_BY_JPQL);
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
						sezStatusARCDecision)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezStatusARCDecision> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez status arc decisions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (SezStatusARCDecision sezStatusARCDecision :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(sezStatusARCDecision);
		}
	}

	/**
	 * Returns the number of sez status arc decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching sez status arc decisions
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_SEZSTATUSARCDECISION_WHERE);

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
		"sezStatusARCDecision.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(sezStatusARCDecision.uuid IS NULL OR sezStatusARCDecision.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"sezStatusARCDecision.companyId = ?";

	private FinderPath _finderPathFetchBygetSezStatus_Committee_Decision_By_CI;
	private FinderPath _finderPathCountBygetSezStatus_Committee_Decision_By_CI;

	/**
	 * Returns the sez status arc decision where caseId = &#63; or throws a <code>NoSuchSezStatusARCDecisionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status arc decision
	 * @throws NoSuchSezStatusARCDecisionException if a matching sez status arc decision could not be found
	 */
	@Override
	public SezStatusARCDecision findBygetSezStatus_Committee_Decision_By_CI(
			String caseId)
		throws NoSuchSezStatusARCDecisionException {

		SezStatusARCDecision sezStatusARCDecision =
			fetchBygetSezStatus_Committee_Decision_By_CI(caseId);

		if (sezStatusARCDecision == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezStatusARCDecisionException(sb.toString());
		}

		return sezStatusARCDecision;
	}

	/**
	 * Returns the sez status arc decision where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status arc decision, or <code>null</code> if a matching sez status arc decision could not be found
	 */
	@Override
	public SezStatusARCDecision fetchBygetSezStatus_Committee_Decision_By_CI(
		String caseId) {

		return fetchBygetSezStatus_Committee_Decision_By_CI(caseId, true);
	}

	/**
	 * Returns the sez status arc decision where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status arc decision, or <code>null</code> if a matching sez status arc decision could not be found
	 */
	@Override
	public SezStatusARCDecision fetchBygetSezStatus_Committee_Decision_By_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetSezStatus_Committee_Decision_By_CI,
				finderArgs, this);
		}

		if (result instanceof SezStatusARCDecision) {
			SezStatusARCDecision sezStatusARCDecision =
				(SezStatusARCDecision)result;

			if (!Objects.equals(caseId, sezStatusARCDecision.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZSTATUSARCDECISION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETSEZSTATUS_COMMITTEE_DECISION_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETSEZSTATUS_COMMITTEE_DECISION_BY_CI_CASEID_2);
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

				List<SezStatusARCDecision> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetSezStatus_Committee_Decision_By_CI,
							finderArgs, list);
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
								"SezStatusARCDecisionPersistenceImpl.fetchBygetSezStatus_Committee_Decision_By_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezStatusARCDecision sezStatusARCDecision = list.get(0);

					result = sezStatusARCDecision;

					cacheResult(sezStatusARCDecision);
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
			return (SezStatusARCDecision)result;
		}
	}

	/**
	 * Removes the sez status arc decision where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the sez status arc decision that was removed
	 */
	@Override
	public SezStatusARCDecision removeBygetSezStatus_Committee_Decision_By_CI(
			String caseId)
		throws NoSuchSezStatusARCDecisionException {

		SezStatusARCDecision sezStatusARCDecision =
			findBygetSezStatus_Committee_Decision_By_CI(caseId);

		return remove(sezStatusARCDecision);
	}

	/**
	 * Returns the number of sez status arc decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching sez status arc decisions
	 */
	@Override
	public int countBygetSezStatus_Committee_Decision_By_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath =
			_finderPathCountBygetSezStatus_Committee_Decision_By_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZSTATUSARCDECISION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETSEZSTATUS_COMMITTEE_DECISION_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETSEZSTATUS_COMMITTEE_DECISION_BY_CI_CASEID_2);
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

	private static final String
		_FINDER_COLUMN_GETSEZSTATUS_COMMITTEE_DECISION_BY_CI_CASEID_2 =
			"sezStatusARCDecision.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETSEZSTATUS_COMMITTEE_DECISION_BY_CI_CASEID_3 =
			"(sezStatusARCDecision.caseId IS NULL OR sezStatusARCDecision.caseId = '')";

	public SezStatusARCDecisionPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(SezStatusARCDecision.class);

		setModelImplClass(SezStatusARCDecisionImpl.class);
		setModelPKClass(long.class);

		setTable(SezStatusARCDecisionTable.INSTANCE);
	}

	/**
	 * Caches the sez status arc decision in the entity cache if it is enabled.
	 *
	 * @param sezStatusARCDecision the sez status arc decision
	 */
	@Override
	public void cacheResult(SezStatusARCDecision sezStatusARCDecision) {
		entityCache.putResult(
			SezStatusARCDecisionImpl.class,
			sezStatusARCDecision.getPrimaryKey(), sezStatusARCDecision);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				sezStatusARCDecision.getUuid(),
				sezStatusARCDecision.getGroupId()
			},
			sezStatusARCDecision);

		finderCache.putResult(
			_finderPathFetchBygetSezStatus_Committee_Decision_By_CI,
			new Object[] {sezStatusARCDecision.getCaseId()},
			sezStatusARCDecision);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez status arc decisions in the entity cache if it is enabled.
	 *
	 * @param sezStatusARCDecisions the sez status arc decisions
	 */
	@Override
	public void cacheResult(List<SezStatusARCDecision> sezStatusARCDecisions) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezStatusARCDecisions.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezStatusARCDecision sezStatusARCDecision :
				sezStatusARCDecisions) {

			if (entityCache.getResult(
					SezStatusARCDecisionImpl.class,
					sezStatusARCDecision.getPrimaryKey()) == null) {

				cacheResult(sezStatusARCDecision);
			}
		}
	}

	/**
	 * Clears the cache for all sez status arc decisions.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezStatusARCDecisionImpl.class);

		finderCache.clearCache(SezStatusARCDecisionImpl.class);
	}

	/**
	 * Clears the cache for the sez status arc decision.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SezStatusARCDecision sezStatusARCDecision) {
		entityCache.removeResult(
			SezStatusARCDecisionImpl.class, sezStatusARCDecision);
	}

	@Override
	public void clearCache(List<SezStatusARCDecision> sezStatusARCDecisions) {
		for (SezStatusARCDecision sezStatusARCDecision :
				sezStatusARCDecisions) {

			entityCache.removeResult(
				SezStatusARCDecisionImpl.class, sezStatusARCDecision);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezStatusARCDecisionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezStatusARCDecisionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezStatusARCDecisionModelImpl sezStatusARCDecisionModelImpl) {

		Object[] args = new Object[] {
			sezStatusARCDecisionModelImpl.getUuid(),
			sezStatusARCDecisionModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, sezStatusARCDecisionModelImpl);

		args = new Object[] {sezStatusARCDecisionModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetSezStatus_Committee_Decision_By_CI, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatus_Committee_Decision_By_CI, args,
			sezStatusARCDecisionModelImpl);
	}

	/**
	 * Creates a new sez status arc decision with the primary key. Does not add the sez status arc decision to the database.
	 *
	 * @param sezStatusCommitteeId the primary key for the new sez status arc decision
	 * @return the new sez status arc decision
	 */
	@Override
	public SezStatusARCDecision create(long sezStatusCommitteeId) {
		SezStatusARCDecision sezStatusARCDecision =
			new SezStatusARCDecisionImpl();

		sezStatusARCDecision.setNew(true);
		sezStatusARCDecision.setPrimaryKey(sezStatusCommitteeId);

		String uuid = PortalUUIDUtil.generate();

		sezStatusARCDecision.setUuid(uuid);

		sezStatusARCDecision.setCompanyId(CompanyThreadLocal.getCompanyId());

		return sezStatusARCDecision;
	}

	/**
	 * Removes the sez status arc decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezStatusCommitteeId the primary key of the sez status arc decision
	 * @return the sez status arc decision that was removed
	 * @throws NoSuchSezStatusARCDecisionException if a sez status arc decision with the primary key could not be found
	 */
	@Override
	public SezStatusARCDecision remove(long sezStatusCommitteeId)
		throws NoSuchSezStatusARCDecisionException {

		return remove((Serializable)sezStatusCommitteeId);
	}

	/**
	 * Removes the sez status arc decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez status arc decision
	 * @return the sez status arc decision that was removed
	 * @throws NoSuchSezStatusARCDecisionException if a sez status arc decision with the primary key could not be found
	 */
	@Override
	public SezStatusARCDecision remove(Serializable primaryKey)
		throws NoSuchSezStatusARCDecisionException {

		Session session = null;

		try {
			session = openSession();

			SezStatusARCDecision sezStatusARCDecision =
				(SezStatusARCDecision)session.get(
					SezStatusARCDecisionImpl.class, primaryKey);

			if (sezStatusARCDecision == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezStatusARCDecisionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezStatusARCDecision);
		}
		catch (NoSuchSezStatusARCDecisionException noSuchEntityException) {
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
	protected SezStatusARCDecision removeImpl(
		SezStatusARCDecision sezStatusARCDecision) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezStatusARCDecision)) {
				sezStatusARCDecision = (SezStatusARCDecision)session.get(
					SezStatusARCDecisionImpl.class,
					sezStatusARCDecision.getPrimaryKeyObj());
			}

			if (sezStatusARCDecision != null) {
				session.delete(sezStatusARCDecision);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezStatusARCDecision != null) {
			clearCache(sezStatusARCDecision);
		}

		return sezStatusARCDecision;
	}

	@Override
	public SezStatusARCDecision updateImpl(
		SezStatusARCDecision sezStatusARCDecision) {

		boolean isNew = sezStatusARCDecision.isNew();

		if (!(sezStatusARCDecision instanceof SezStatusARCDecisionModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezStatusARCDecision.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezStatusARCDecision);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezStatusARCDecision proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezStatusARCDecision implementation " +
					sezStatusARCDecision.getClass());
		}

		SezStatusARCDecisionModelImpl sezStatusARCDecisionModelImpl =
			(SezStatusARCDecisionModelImpl)sezStatusARCDecision;

		if (Validator.isNull(sezStatusARCDecision.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			sezStatusARCDecision.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezStatusARCDecision.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezStatusARCDecision.setCreateDate(date);
			}
			else {
				sezStatusARCDecision.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezStatusARCDecisionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezStatusARCDecision.setModifiedDate(date);
			}
			else {
				sezStatusARCDecision.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezStatusARCDecision);
			}
			else {
				sezStatusARCDecision = (SezStatusARCDecision)session.merge(
					sezStatusARCDecision);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezStatusARCDecisionImpl.class, sezStatusARCDecisionModelImpl,
			false, true);

		cacheUniqueFindersCache(sezStatusARCDecisionModelImpl);

		if (isNew) {
			sezStatusARCDecision.setNew(false);
		}

		sezStatusARCDecision.resetOriginalValues();

		return sezStatusARCDecision;
	}

	/**
	 * Returns the sez status arc decision with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez status arc decision
	 * @return the sez status arc decision
	 * @throws NoSuchSezStatusARCDecisionException if a sez status arc decision with the primary key could not be found
	 */
	@Override
	public SezStatusARCDecision findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezStatusARCDecisionException {

		SezStatusARCDecision sezStatusARCDecision = fetchByPrimaryKey(
			primaryKey);

		if (sezStatusARCDecision == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezStatusARCDecisionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezStatusARCDecision;
	}

	/**
	 * Returns the sez status arc decision with the primary key or throws a <code>NoSuchSezStatusARCDecisionException</code> if it could not be found.
	 *
	 * @param sezStatusCommitteeId the primary key of the sez status arc decision
	 * @return the sez status arc decision
	 * @throws NoSuchSezStatusARCDecisionException if a sez status arc decision with the primary key could not be found
	 */
	@Override
	public SezStatusARCDecision findByPrimaryKey(long sezStatusCommitteeId)
		throws NoSuchSezStatusARCDecisionException {

		return findByPrimaryKey((Serializable)sezStatusCommitteeId);
	}

	/**
	 * Returns the sez status arc decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezStatusCommitteeId the primary key of the sez status arc decision
	 * @return the sez status arc decision, or <code>null</code> if a sez status arc decision with the primary key could not be found
	 */
	@Override
	public SezStatusARCDecision fetchByPrimaryKey(long sezStatusCommitteeId) {
		return fetchByPrimaryKey((Serializable)sezStatusCommitteeId);
	}

	/**
	 * Returns all the sez status arc decisions.
	 *
	 * @return the sez status arc decisions
	 */
	@Override
	public List<SezStatusARCDecision> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status arc decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusARCDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status arc decisions
	 * @param end the upper bound of the range of sez status arc decisions (not inclusive)
	 * @return the range of sez status arc decisions
	 */
	@Override
	public List<SezStatusARCDecision> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status arc decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusARCDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status arc decisions
	 * @param end the upper bound of the range of sez status arc decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status arc decisions
	 */
	@Override
	public List<SezStatusARCDecision> findAll(
		int start, int end,
		OrderByComparator<SezStatusARCDecision> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status arc decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusARCDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status arc decisions
	 * @param end the upper bound of the range of sez status arc decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status arc decisions
	 */
	@Override
	public List<SezStatusARCDecision> findAll(
		int start, int end,
		OrderByComparator<SezStatusARCDecision> orderByComparator,
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

		List<SezStatusARCDecision> list = null;

		if (useFinderCache) {
			list = (List<SezStatusARCDecision>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZSTATUSARCDECISION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZSTATUSARCDECISION;

				sql = sql.concat(SezStatusARCDecisionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezStatusARCDecision>)QueryUtil.list(
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
	 * Removes all the sez status arc decisions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezStatusARCDecision sezStatusARCDecision : findAll()) {
			remove(sezStatusARCDecision);
		}
	}

	/**
	 * Returns the number of sez status arc decisions.
	 *
	 * @return the number of sez status arc decisions
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
					_SQL_COUNT_SEZSTATUSARCDECISION);

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
		return "sezStatusCommitteeId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZSTATUSARCDECISION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezStatusARCDecisionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez status arc decision persistence.
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

		_finderPathFetchBygetSezStatus_Committee_Decision_By_CI =
			new FinderPath(
				FINDER_CLASS_NAME_ENTITY,
				"fetchBygetSezStatus_Committee_Decision_By_CI",
				new String[] {String.class.getName()}, new String[] {"caseId"},
				true);

		_finderPathCountBygetSezStatus_Committee_Decision_By_CI =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"countBygetSezStatus_Committee_Decision_By_CI",
				new String[] {String.class.getName()}, new String[] {"caseId"},
				false);

		SezStatusARCDecisionUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezStatusARCDecisionUtil.setPersistence(null);

		entityCache.removeCache(SezStatusARCDecisionImpl.class.getName());
	}

	@Override
	@Reference(
		target = SEZ_STATUS_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = SEZ_STATUS_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = SEZ_STATUS_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SEZSTATUSARCDECISION =
		"SELECT sezStatusARCDecision FROM SezStatusARCDecision sezStatusARCDecision";

	private static final String _SQL_SELECT_SEZSTATUSARCDECISION_WHERE =
		"SELECT sezStatusARCDecision FROM SezStatusARCDecision sezStatusARCDecision WHERE ";

	private static final String _SQL_COUNT_SEZSTATUSARCDECISION =
		"SELECT COUNT(sezStatusARCDecision) FROM SezStatusARCDecision sezStatusARCDecision";

	private static final String _SQL_COUNT_SEZSTATUSARCDECISION_WHERE =
		"SELECT COUNT(sezStatusARCDecision) FROM SezStatusARCDecision sezStatusARCDecision WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezStatusARCDecision.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezStatusARCDecision exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezStatusARCDecision exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezStatusARCDecisionPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}