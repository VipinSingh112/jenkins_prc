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

import com.nbp.sez.status.application.stage.services.exception.NoSuchSezStatusBoardDecisionException;
import com.nbp.sez.status.application.stage.services.model.SezStatusBoardDecision;
import com.nbp.sez.status.application.stage.services.model.SezStatusBoardDecisionTable;
import com.nbp.sez.status.application.stage.services.model.impl.SezStatusBoardDecisionImpl;
import com.nbp.sez.status.application.stage.services.model.impl.SezStatusBoardDecisionModelImpl;
import com.nbp.sez.status.application.stage.services.service.persistence.SezStatusBoardDecisionPersistence;
import com.nbp.sez.status.application.stage.services.service.persistence.SezStatusBoardDecisionUtil;
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
 * The persistence implementation for the sez status board decision service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezStatusBoardDecisionPersistence.class)
public class SezStatusBoardDecisionPersistenceImpl
	extends BasePersistenceImpl<SezStatusBoardDecision>
	implements SezStatusBoardDecisionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezStatusBoardDecisionUtil</code> to access the sez status board decision persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezStatusBoardDecisionImpl.class.getName();

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
	 * Returns all the sez status board decisions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching sez status board decisions
	 */
	@Override
	public List<SezStatusBoardDecision> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status board decisions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status board decisions
	 * @param end the upper bound of the range of sez status board decisions (not inclusive)
	 * @return the range of matching sez status board decisions
	 */
	@Override
	public List<SezStatusBoardDecision> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status board decisions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status board decisions
	 * @param end the upper bound of the range of sez status board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status board decisions
	 */
	@Override
	public List<SezStatusBoardDecision> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SezStatusBoardDecision> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status board decisions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status board decisions
	 * @param end the upper bound of the range of sez status board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status board decisions
	 */
	@Override
	public List<SezStatusBoardDecision> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SezStatusBoardDecision> orderByComparator,
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

		List<SezStatusBoardDecision> list = null;

		if (useFinderCache) {
			list = (List<SezStatusBoardDecision>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezStatusBoardDecision sezStatusBoardDecision : list) {
					if (!uuid.equals(sezStatusBoardDecision.getUuid())) {
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

			sb.append(_SQL_SELECT_SEZSTATUSBOARDDECISION_WHERE);

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
				sb.append(SezStatusBoardDecisionModelImpl.ORDER_BY_JPQL);
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

				list = (List<SezStatusBoardDecision>)QueryUtil.list(
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
	 * Returns the first sez status board decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status board decision
	 * @throws NoSuchSezStatusBoardDecisionException if a matching sez status board decision could not be found
	 */
	@Override
	public SezStatusBoardDecision findByUuid_First(
			String uuid,
			OrderByComparator<SezStatusBoardDecision> orderByComparator)
		throws NoSuchSezStatusBoardDecisionException {

		SezStatusBoardDecision sezStatusBoardDecision = fetchByUuid_First(
			uuid, orderByComparator);

		if (sezStatusBoardDecision != null) {
			return sezStatusBoardDecision;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchSezStatusBoardDecisionException(sb.toString());
	}

	/**
	 * Returns the first sez status board decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status board decision, or <code>null</code> if a matching sez status board decision could not be found
	 */
	@Override
	public SezStatusBoardDecision fetchByUuid_First(
		String uuid,
		OrderByComparator<SezStatusBoardDecision> orderByComparator) {

		List<SezStatusBoardDecision> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez status board decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status board decision
	 * @throws NoSuchSezStatusBoardDecisionException if a matching sez status board decision could not be found
	 */
	@Override
	public SezStatusBoardDecision findByUuid_Last(
			String uuid,
			OrderByComparator<SezStatusBoardDecision> orderByComparator)
		throws NoSuchSezStatusBoardDecisionException {

		SezStatusBoardDecision sezStatusBoardDecision = fetchByUuid_Last(
			uuid, orderByComparator);

		if (sezStatusBoardDecision != null) {
			return sezStatusBoardDecision;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchSezStatusBoardDecisionException(sb.toString());
	}

	/**
	 * Returns the last sez status board decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status board decision, or <code>null</code> if a matching sez status board decision could not be found
	 */
	@Override
	public SezStatusBoardDecision fetchByUuid_Last(
		String uuid,
		OrderByComparator<SezStatusBoardDecision> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<SezStatusBoardDecision> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez status board decisions before and after the current sez status board decision in the ordered set where uuid = &#63;.
	 *
	 * @param sezStatusBoardId the primary key of the current sez status board decision
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status board decision
	 * @throws NoSuchSezStatusBoardDecisionException if a sez status board decision with the primary key could not be found
	 */
	@Override
	public SezStatusBoardDecision[] findByUuid_PrevAndNext(
			long sezStatusBoardId, String uuid,
			OrderByComparator<SezStatusBoardDecision> orderByComparator)
		throws NoSuchSezStatusBoardDecisionException {

		uuid = Objects.toString(uuid, "");

		SezStatusBoardDecision sezStatusBoardDecision = findByPrimaryKey(
			sezStatusBoardId);

		Session session = null;

		try {
			session = openSession();

			SezStatusBoardDecision[] array = new SezStatusBoardDecisionImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, sezStatusBoardDecision, uuid, orderByComparator, true);

			array[1] = sezStatusBoardDecision;

			array[2] = getByUuid_PrevAndNext(
				session, sezStatusBoardDecision, uuid, orderByComparator,
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

	protected SezStatusBoardDecision getByUuid_PrevAndNext(
		Session session, SezStatusBoardDecision sezStatusBoardDecision,
		String uuid,
		OrderByComparator<SezStatusBoardDecision> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZSTATUSBOARDDECISION_WHERE);

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
			sb.append(SezStatusBoardDecisionModelImpl.ORDER_BY_JPQL);
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
						sezStatusBoardDecision)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezStatusBoardDecision> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez status board decisions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (SezStatusBoardDecision sezStatusBoardDecision :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(sezStatusBoardDecision);
		}
	}

	/**
	 * Returns the number of sez status board decisions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching sez status board decisions
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZSTATUSBOARDDECISION_WHERE);

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
		"sezStatusBoardDecision.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(sezStatusBoardDecision.uuid IS NULL OR sezStatusBoardDecision.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the sez status board decision where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSezStatusBoardDecisionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sez status board decision
	 * @throws NoSuchSezStatusBoardDecisionException if a matching sez status board decision could not be found
	 */
	@Override
	public SezStatusBoardDecision findByUUID_G(String uuid, long groupId)
		throws NoSuchSezStatusBoardDecisionException {

		SezStatusBoardDecision sezStatusBoardDecision = fetchByUUID_G(
			uuid, groupId);

		if (sezStatusBoardDecision == null) {
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

			throw new NoSuchSezStatusBoardDecisionException(sb.toString());
		}

		return sezStatusBoardDecision;
	}

	/**
	 * Returns the sez status board decision where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sez status board decision, or <code>null</code> if a matching sez status board decision could not be found
	 */
	@Override
	public SezStatusBoardDecision fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the sez status board decision where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status board decision, or <code>null</code> if a matching sez status board decision could not be found
	 */
	@Override
	public SezStatusBoardDecision fetchByUUID_G(
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

		if (result instanceof SezStatusBoardDecision) {
			SezStatusBoardDecision sezStatusBoardDecision =
				(SezStatusBoardDecision)result;

			if (!Objects.equals(uuid, sezStatusBoardDecision.getUuid()) ||
				(groupId != sezStatusBoardDecision.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_SEZSTATUSBOARDDECISION_WHERE);

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

				List<SezStatusBoardDecision> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					SezStatusBoardDecision sezStatusBoardDecision = list.get(0);

					result = sezStatusBoardDecision;

					cacheResult(sezStatusBoardDecision);
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
			return (SezStatusBoardDecision)result;
		}
	}

	/**
	 * Removes the sez status board decision where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the sez status board decision that was removed
	 */
	@Override
	public SezStatusBoardDecision removeByUUID_G(String uuid, long groupId)
		throws NoSuchSezStatusBoardDecisionException {

		SezStatusBoardDecision sezStatusBoardDecision = findByUUID_G(
			uuid, groupId);

		return remove(sezStatusBoardDecision);
	}

	/**
	 * Returns the number of sez status board decisions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching sez status board decisions
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_SEZSTATUSBOARDDECISION_WHERE);

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
		"sezStatusBoardDecision.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(sezStatusBoardDecision.uuid IS NULL OR sezStatusBoardDecision.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"sezStatusBoardDecision.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the sez status board decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching sez status board decisions
	 */
	@Override
	public List<SezStatusBoardDecision> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status board decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status board decisions
	 * @param end the upper bound of the range of sez status board decisions (not inclusive)
	 * @return the range of matching sez status board decisions
	 */
	@Override
	public List<SezStatusBoardDecision> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status board decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status board decisions
	 * @param end the upper bound of the range of sez status board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status board decisions
	 */
	@Override
	public List<SezStatusBoardDecision> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SezStatusBoardDecision> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status board decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status board decisions
	 * @param end the upper bound of the range of sez status board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status board decisions
	 */
	@Override
	public List<SezStatusBoardDecision> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SezStatusBoardDecision> orderByComparator,
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

		List<SezStatusBoardDecision> list = null;

		if (useFinderCache) {
			list = (List<SezStatusBoardDecision>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezStatusBoardDecision sezStatusBoardDecision : list) {
					if (!uuid.equals(sezStatusBoardDecision.getUuid()) ||
						(companyId != sezStatusBoardDecision.getCompanyId())) {

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

			sb.append(_SQL_SELECT_SEZSTATUSBOARDDECISION_WHERE);

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
				sb.append(SezStatusBoardDecisionModelImpl.ORDER_BY_JPQL);
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

				list = (List<SezStatusBoardDecision>)QueryUtil.list(
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
	 * Returns the first sez status board decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status board decision
	 * @throws NoSuchSezStatusBoardDecisionException if a matching sez status board decision could not be found
	 */
	@Override
	public SezStatusBoardDecision findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<SezStatusBoardDecision> orderByComparator)
		throws NoSuchSezStatusBoardDecisionException {

		SezStatusBoardDecision sezStatusBoardDecision = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (sezStatusBoardDecision != null) {
			return sezStatusBoardDecision;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchSezStatusBoardDecisionException(sb.toString());
	}

	/**
	 * Returns the first sez status board decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status board decision, or <code>null</code> if a matching sez status board decision could not be found
	 */
	@Override
	public SezStatusBoardDecision fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<SezStatusBoardDecision> orderByComparator) {

		List<SezStatusBoardDecision> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez status board decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status board decision
	 * @throws NoSuchSezStatusBoardDecisionException if a matching sez status board decision could not be found
	 */
	@Override
	public SezStatusBoardDecision findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<SezStatusBoardDecision> orderByComparator)
		throws NoSuchSezStatusBoardDecisionException {

		SezStatusBoardDecision sezStatusBoardDecision = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (sezStatusBoardDecision != null) {
			return sezStatusBoardDecision;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchSezStatusBoardDecisionException(sb.toString());
	}

	/**
	 * Returns the last sez status board decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status board decision, or <code>null</code> if a matching sez status board decision could not be found
	 */
	@Override
	public SezStatusBoardDecision fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<SezStatusBoardDecision> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<SezStatusBoardDecision> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez status board decisions before and after the current sez status board decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param sezStatusBoardId the primary key of the current sez status board decision
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status board decision
	 * @throws NoSuchSezStatusBoardDecisionException if a sez status board decision with the primary key could not be found
	 */
	@Override
	public SezStatusBoardDecision[] findByUuid_C_PrevAndNext(
			long sezStatusBoardId, String uuid, long companyId,
			OrderByComparator<SezStatusBoardDecision> orderByComparator)
		throws NoSuchSezStatusBoardDecisionException {

		uuid = Objects.toString(uuid, "");

		SezStatusBoardDecision sezStatusBoardDecision = findByPrimaryKey(
			sezStatusBoardId);

		Session session = null;

		try {
			session = openSession();

			SezStatusBoardDecision[] array = new SezStatusBoardDecisionImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, sezStatusBoardDecision, uuid, companyId,
				orderByComparator, true);

			array[1] = sezStatusBoardDecision;

			array[2] = getByUuid_C_PrevAndNext(
				session, sezStatusBoardDecision, uuid, companyId,
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

	protected SezStatusBoardDecision getByUuid_C_PrevAndNext(
		Session session, SezStatusBoardDecision sezStatusBoardDecision,
		String uuid, long companyId,
		OrderByComparator<SezStatusBoardDecision> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZSTATUSBOARDDECISION_WHERE);

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
			sb.append(SezStatusBoardDecisionModelImpl.ORDER_BY_JPQL);
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
						sezStatusBoardDecision)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezStatusBoardDecision> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez status board decisions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (SezStatusBoardDecision sezStatusBoardDecision :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(sezStatusBoardDecision);
		}
	}

	/**
	 * Returns the number of sez status board decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching sez status board decisions
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_SEZSTATUSBOARDDECISION_WHERE);

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
		"sezStatusBoardDecision.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(sezStatusBoardDecision.uuid IS NULL OR sezStatusBoardDecision.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"sezStatusBoardDecision.companyId = ?";

	private FinderPath _finderPathFetchBygetSezStatus_Board_Decision_By_CI;
	private FinderPath _finderPathCountBygetSezStatus_Board_Decision_By_CI;

	/**
	 * Returns the sez status board decision where caseId = &#63; or throws a <code>NoSuchSezStatusBoardDecisionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status board decision
	 * @throws NoSuchSezStatusBoardDecisionException if a matching sez status board decision could not be found
	 */
	@Override
	public SezStatusBoardDecision findBygetSezStatus_Board_Decision_By_CI(
			String caseId)
		throws NoSuchSezStatusBoardDecisionException {

		SezStatusBoardDecision sezStatusBoardDecision =
			fetchBygetSezStatus_Board_Decision_By_CI(caseId);

		if (sezStatusBoardDecision == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezStatusBoardDecisionException(sb.toString());
		}

		return sezStatusBoardDecision;
	}

	/**
	 * Returns the sez status board decision where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status board decision, or <code>null</code> if a matching sez status board decision could not be found
	 */
	@Override
	public SezStatusBoardDecision fetchBygetSezStatus_Board_Decision_By_CI(
		String caseId) {

		return fetchBygetSezStatus_Board_Decision_By_CI(caseId, true);
	}

	/**
	 * Returns the sez status board decision where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status board decision, or <code>null</code> if a matching sez status board decision could not be found
	 */
	@Override
	public SezStatusBoardDecision fetchBygetSezStatus_Board_Decision_By_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetSezStatus_Board_Decision_By_CI, finderArgs,
				this);
		}

		if (result instanceof SezStatusBoardDecision) {
			SezStatusBoardDecision sezStatusBoardDecision =
				(SezStatusBoardDecision)result;

			if (!Objects.equals(caseId, sezStatusBoardDecision.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZSTATUSBOARDDECISION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETSEZSTATUS_BOARD_DECISION_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETSEZSTATUS_BOARD_DECISION_BY_CI_CASEID_2);
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

				List<SezStatusBoardDecision> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetSezStatus_Board_Decision_By_CI,
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
								"SezStatusBoardDecisionPersistenceImpl.fetchBygetSezStatus_Board_Decision_By_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezStatusBoardDecision sezStatusBoardDecision = list.get(0);

					result = sezStatusBoardDecision;

					cacheResult(sezStatusBoardDecision);
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
			return (SezStatusBoardDecision)result;
		}
	}

	/**
	 * Removes the sez status board decision where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the sez status board decision that was removed
	 */
	@Override
	public SezStatusBoardDecision removeBygetSezStatus_Board_Decision_By_CI(
			String caseId)
		throws NoSuchSezStatusBoardDecisionException {

		SezStatusBoardDecision sezStatusBoardDecision =
			findBygetSezStatus_Board_Decision_By_CI(caseId);

		return remove(sezStatusBoardDecision);
	}

	/**
	 * Returns the number of sez status board decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching sez status board decisions
	 */
	@Override
	public int countBygetSezStatus_Board_Decision_By_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath =
			_finderPathCountBygetSezStatus_Board_Decision_By_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZSTATUSBOARDDECISION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETSEZSTATUS_BOARD_DECISION_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETSEZSTATUS_BOARD_DECISION_BY_CI_CASEID_2);
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
		_FINDER_COLUMN_GETSEZSTATUS_BOARD_DECISION_BY_CI_CASEID_2 =
			"sezStatusBoardDecision.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETSEZSTATUS_BOARD_DECISION_BY_CI_CASEID_3 =
			"(sezStatusBoardDecision.caseId IS NULL OR sezStatusBoardDecision.caseId = '')";

	public SezStatusBoardDecisionPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(SezStatusBoardDecision.class);

		setModelImplClass(SezStatusBoardDecisionImpl.class);
		setModelPKClass(long.class);

		setTable(SezStatusBoardDecisionTable.INSTANCE);
	}

	/**
	 * Caches the sez status board decision in the entity cache if it is enabled.
	 *
	 * @param sezStatusBoardDecision the sez status board decision
	 */
	@Override
	public void cacheResult(SezStatusBoardDecision sezStatusBoardDecision) {
		entityCache.putResult(
			SezStatusBoardDecisionImpl.class,
			sezStatusBoardDecision.getPrimaryKey(), sezStatusBoardDecision);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				sezStatusBoardDecision.getUuid(),
				sezStatusBoardDecision.getGroupId()
			},
			sezStatusBoardDecision);

		finderCache.putResult(
			_finderPathFetchBygetSezStatus_Board_Decision_By_CI,
			new Object[] {sezStatusBoardDecision.getCaseId()},
			sezStatusBoardDecision);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez status board decisions in the entity cache if it is enabled.
	 *
	 * @param sezStatusBoardDecisions the sez status board decisions
	 */
	@Override
	public void cacheResult(
		List<SezStatusBoardDecision> sezStatusBoardDecisions) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezStatusBoardDecisions.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezStatusBoardDecision sezStatusBoardDecision :
				sezStatusBoardDecisions) {

			if (entityCache.getResult(
					SezStatusBoardDecisionImpl.class,
					sezStatusBoardDecision.getPrimaryKey()) == null) {

				cacheResult(sezStatusBoardDecision);
			}
		}
	}

	/**
	 * Clears the cache for all sez status board decisions.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezStatusBoardDecisionImpl.class);

		finderCache.clearCache(SezStatusBoardDecisionImpl.class);
	}

	/**
	 * Clears the cache for the sez status board decision.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SezStatusBoardDecision sezStatusBoardDecision) {
		entityCache.removeResult(
			SezStatusBoardDecisionImpl.class, sezStatusBoardDecision);
	}

	@Override
	public void clearCache(
		List<SezStatusBoardDecision> sezStatusBoardDecisions) {

		for (SezStatusBoardDecision sezStatusBoardDecision :
				sezStatusBoardDecisions) {

			entityCache.removeResult(
				SezStatusBoardDecisionImpl.class, sezStatusBoardDecision);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezStatusBoardDecisionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezStatusBoardDecisionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezStatusBoardDecisionModelImpl sezStatusBoardDecisionModelImpl) {

		Object[] args = new Object[] {
			sezStatusBoardDecisionModelImpl.getUuid(),
			sezStatusBoardDecisionModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, sezStatusBoardDecisionModelImpl);

		args = new Object[] {sezStatusBoardDecisionModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetSezStatus_Board_Decision_By_CI, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatus_Board_Decision_By_CI, args,
			sezStatusBoardDecisionModelImpl);
	}

	/**
	 * Creates a new sez status board decision with the primary key. Does not add the sez status board decision to the database.
	 *
	 * @param sezStatusBoardId the primary key for the new sez status board decision
	 * @return the new sez status board decision
	 */
	@Override
	public SezStatusBoardDecision create(long sezStatusBoardId) {
		SezStatusBoardDecision sezStatusBoardDecision =
			new SezStatusBoardDecisionImpl();

		sezStatusBoardDecision.setNew(true);
		sezStatusBoardDecision.setPrimaryKey(sezStatusBoardId);

		String uuid = PortalUUIDUtil.generate();

		sezStatusBoardDecision.setUuid(uuid);

		sezStatusBoardDecision.setCompanyId(CompanyThreadLocal.getCompanyId());

		return sezStatusBoardDecision;
	}

	/**
	 * Removes the sez status board decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezStatusBoardId the primary key of the sez status board decision
	 * @return the sez status board decision that was removed
	 * @throws NoSuchSezStatusBoardDecisionException if a sez status board decision with the primary key could not be found
	 */
	@Override
	public SezStatusBoardDecision remove(long sezStatusBoardId)
		throws NoSuchSezStatusBoardDecisionException {

		return remove((Serializable)sezStatusBoardId);
	}

	/**
	 * Removes the sez status board decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez status board decision
	 * @return the sez status board decision that was removed
	 * @throws NoSuchSezStatusBoardDecisionException if a sez status board decision with the primary key could not be found
	 */
	@Override
	public SezStatusBoardDecision remove(Serializable primaryKey)
		throws NoSuchSezStatusBoardDecisionException {

		Session session = null;

		try {
			session = openSession();

			SezStatusBoardDecision sezStatusBoardDecision =
				(SezStatusBoardDecision)session.get(
					SezStatusBoardDecisionImpl.class, primaryKey);

			if (sezStatusBoardDecision == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezStatusBoardDecisionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezStatusBoardDecision);
		}
		catch (NoSuchSezStatusBoardDecisionException noSuchEntityException) {
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
	protected SezStatusBoardDecision removeImpl(
		SezStatusBoardDecision sezStatusBoardDecision) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezStatusBoardDecision)) {
				sezStatusBoardDecision = (SezStatusBoardDecision)session.get(
					SezStatusBoardDecisionImpl.class,
					sezStatusBoardDecision.getPrimaryKeyObj());
			}

			if (sezStatusBoardDecision != null) {
				session.delete(sezStatusBoardDecision);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezStatusBoardDecision != null) {
			clearCache(sezStatusBoardDecision);
		}

		return sezStatusBoardDecision;
	}

	@Override
	public SezStatusBoardDecision updateImpl(
		SezStatusBoardDecision sezStatusBoardDecision) {

		boolean isNew = sezStatusBoardDecision.isNew();

		if (!(sezStatusBoardDecision instanceof
				SezStatusBoardDecisionModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezStatusBoardDecision.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezStatusBoardDecision);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezStatusBoardDecision proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezStatusBoardDecision implementation " +
					sezStatusBoardDecision.getClass());
		}

		SezStatusBoardDecisionModelImpl sezStatusBoardDecisionModelImpl =
			(SezStatusBoardDecisionModelImpl)sezStatusBoardDecision;

		if (Validator.isNull(sezStatusBoardDecision.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			sezStatusBoardDecision.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezStatusBoardDecision.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezStatusBoardDecision.setCreateDate(date);
			}
			else {
				sezStatusBoardDecision.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezStatusBoardDecisionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezStatusBoardDecision.setModifiedDate(date);
			}
			else {
				sezStatusBoardDecision.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezStatusBoardDecision);
			}
			else {
				sezStatusBoardDecision = (SezStatusBoardDecision)session.merge(
					sezStatusBoardDecision);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezStatusBoardDecisionImpl.class, sezStatusBoardDecisionModelImpl,
			false, true);

		cacheUniqueFindersCache(sezStatusBoardDecisionModelImpl);

		if (isNew) {
			sezStatusBoardDecision.setNew(false);
		}

		sezStatusBoardDecision.resetOriginalValues();

		return sezStatusBoardDecision;
	}

	/**
	 * Returns the sez status board decision with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez status board decision
	 * @return the sez status board decision
	 * @throws NoSuchSezStatusBoardDecisionException if a sez status board decision with the primary key could not be found
	 */
	@Override
	public SezStatusBoardDecision findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezStatusBoardDecisionException {

		SezStatusBoardDecision sezStatusBoardDecision = fetchByPrimaryKey(
			primaryKey);

		if (sezStatusBoardDecision == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezStatusBoardDecisionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezStatusBoardDecision;
	}

	/**
	 * Returns the sez status board decision with the primary key or throws a <code>NoSuchSezStatusBoardDecisionException</code> if it could not be found.
	 *
	 * @param sezStatusBoardId the primary key of the sez status board decision
	 * @return the sez status board decision
	 * @throws NoSuchSezStatusBoardDecisionException if a sez status board decision with the primary key could not be found
	 */
	@Override
	public SezStatusBoardDecision findByPrimaryKey(long sezStatusBoardId)
		throws NoSuchSezStatusBoardDecisionException {

		return findByPrimaryKey((Serializable)sezStatusBoardId);
	}

	/**
	 * Returns the sez status board decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezStatusBoardId the primary key of the sez status board decision
	 * @return the sez status board decision, or <code>null</code> if a sez status board decision with the primary key could not be found
	 */
	@Override
	public SezStatusBoardDecision fetchByPrimaryKey(long sezStatusBoardId) {
		return fetchByPrimaryKey((Serializable)sezStatusBoardId);
	}

	/**
	 * Returns all the sez status board decisions.
	 *
	 * @return the sez status board decisions
	 */
	@Override
	public List<SezStatusBoardDecision> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status board decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status board decisions
	 * @param end the upper bound of the range of sez status board decisions (not inclusive)
	 * @return the range of sez status board decisions
	 */
	@Override
	public List<SezStatusBoardDecision> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status board decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status board decisions
	 * @param end the upper bound of the range of sez status board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status board decisions
	 */
	@Override
	public List<SezStatusBoardDecision> findAll(
		int start, int end,
		OrderByComparator<SezStatusBoardDecision> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status board decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status board decisions
	 * @param end the upper bound of the range of sez status board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status board decisions
	 */
	@Override
	public List<SezStatusBoardDecision> findAll(
		int start, int end,
		OrderByComparator<SezStatusBoardDecision> orderByComparator,
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

		List<SezStatusBoardDecision> list = null;

		if (useFinderCache) {
			list = (List<SezStatusBoardDecision>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZSTATUSBOARDDECISION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZSTATUSBOARDDECISION;

				sql = sql.concat(SezStatusBoardDecisionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezStatusBoardDecision>)QueryUtil.list(
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
	 * Removes all the sez status board decisions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezStatusBoardDecision sezStatusBoardDecision : findAll()) {
			remove(sezStatusBoardDecision);
		}
	}

	/**
	 * Returns the number of sez status board decisions.
	 *
	 * @return the number of sez status board decisions
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
					_SQL_COUNT_SEZSTATUSBOARDDECISION);

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
		return "sezStatusBoardId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZSTATUSBOARDDECISION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezStatusBoardDecisionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez status board decision persistence.
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

		_finderPathFetchBygetSezStatus_Board_Decision_By_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY,
			"fetchBygetSezStatus_Board_Decision_By_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetSezStatus_Board_Decision_By_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSezStatus_Board_Decision_By_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		SezStatusBoardDecisionUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezStatusBoardDecisionUtil.setPersistence(null);

		entityCache.removeCache(SezStatusBoardDecisionImpl.class.getName());
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

	private static final String _SQL_SELECT_SEZSTATUSBOARDDECISION =
		"SELECT sezStatusBoardDecision FROM SezStatusBoardDecision sezStatusBoardDecision";

	private static final String _SQL_SELECT_SEZSTATUSBOARDDECISION_WHERE =
		"SELECT sezStatusBoardDecision FROM SezStatusBoardDecision sezStatusBoardDecision WHERE ";

	private static final String _SQL_COUNT_SEZSTATUSBOARDDECISION =
		"SELECT COUNT(sezStatusBoardDecision) FROM SezStatusBoardDecision sezStatusBoardDecision";

	private static final String _SQL_COUNT_SEZSTATUSBOARDDECISION_WHERE =
		"SELECT COUNT(sezStatusBoardDecision) FROM SezStatusBoardDecision sezStatusBoardDecision WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezStatusBoardDecision.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezStatusBoardDecision exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezStatusBoardDecision exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezStatusBoardDecisionPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}