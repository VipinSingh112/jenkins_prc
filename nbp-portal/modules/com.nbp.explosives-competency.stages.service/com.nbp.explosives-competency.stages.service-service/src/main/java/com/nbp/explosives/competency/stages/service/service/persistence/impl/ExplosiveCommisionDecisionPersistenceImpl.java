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

import com.nbp.explosives.competency.stages.service.exception.NoSuchExplosiveCommisionDecisionException;
import com.nbp.explosives.competency.stages.service.model.ExplosiveCommisionDecision;
import com.nbp.explosives.competency.stages.service.model.ExplosiveCommisionDecisionTable;
import com.nbp.explosives.competency.stages.service.model.impl.ExplosiveCommisionDecisionImpl;
import com.nbp.explosives.competency.stages.service.model.impl.ExplosiveCommisionDecisionModelImpl;
import com.nbp.explosives.competency.stages.service.service.persistence.ExplosiveCommisionDecisionPersistence;
import com.nbp.explosives.competency.stages.service.service.persistence.ExplosiveCommisionDecisionUtil;
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
 * The persistence implementation for the explosive commision decision service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ExplosiveCommisionDecisionPersistence.class)
public class ExplosiveCommisionDecisionPersistenceImpl
	extends BasePersistenceImpl<ExplosiveCommisionDecision>
	implements ExplosiveCommisionDecisionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ExplosiveCommisionDecisionUtil</code> to access the explosive commision decision persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ExplosiveCommisionDecisionImpl.class.getName();

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
	 * Returns all the explosive commision decisions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching explosive commision decisions
	 */
	@Override
	public List<ExplosiveCommisionDecision> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the explosive commision decisions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveCommisionDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive commision decisions
	 * @param end the upper bound of the range of explosive commision decisions (not inclusive)
	 * @return the range of matching explosive commision decisions
	 */
	@Override
	public List<ExplosiveCommisionDecision> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the explosive commision decisions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveCommisionDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive commision decisions
	 * @param end the upper bound of the range of explosive commision decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive commision decisions
	 */
	@Override
	public List<ExplosiveCommisionDecision> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ExplosiveCommisionDecision> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the explosive commision decisions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveCommisionDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive commision decisions
	 * @param end the upper bound of the range of explosive commision decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive commision decisions
	 */
	@Override
	public List<ExplosiveCommisionDecision> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ExplosiveCommisionDecision> orderByComparator,
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

		List<ExplosiveCommisionDecision> list = null;

		if (useFinderCache) {
			list = (List<ExplosiveCommisionDecision>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ExplosiveCommisionDecision explosiveCommisionDecision :
						list) {

					if (!uuid.equals(explosiveCommisionDecision.getUuid())) {
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

			sb.append(_SQL_SELECT_EXPLOSIVECOMMISIONDECISION_WHERE);

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
				sb.append(ExplosiveCommisionDecisionModelImpl.ORDER_BY_JPQL);
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

				list = (List<ExplosiveCommisionDecision>)QueryUtil.list(
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
	 * Returns the first explosive commision decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive commision decision
	 * @throws NoSuchExplosiveCommisionDecisionException if a matching explosive commision decision could not be found
	 */
	@Override
	public ExplosiveCommisionDecision findByUuid_First(
			String uuid,
			OrderByComparator<ExplosiveCommisionDecision> orderByComparator)
		throws NoSuchExplosiveCommisionDecisionException {

		ExplosiveCommisionDecision explosiveCommisionDecision =
			fetchByUuid_First(uuid, orderByComparator);

		if (explosiveCommisionDecision != null) {
			return explosiveCommisionDecision;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchExplosiveCommisionDecisionException(sb.toString());
	}

	/**
	 * Returns the first explosive commision decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive commision decision, or <code>null</code> if a matching explosive commision decision could not be found
	 */
	@Override
	public ExplosiveCommisionDecision fetchByUuid_First(
		String uuid,
		OrderByComparator<ExplosiveCommisionDecision> orderByComparator) {

		List<ExplosiveCommisionDecision> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last explosive commision decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive commision decision
	 * @throws NoSuchExplosiveCommisionDecisionException if a matching explosive commision decision could not be found
	 */
	@Override
	public ExplosiveCommisionDecision findByUuid_Last(
			String uuid,
			OrderByComparator<ExplosiveCommisionDecision> orderByComparator)
		throws NoSuchExplosiveCommisionDecisionException {

		ExplosiveCommisionDecision explosiveCommisionDecision =
			fetchByUuid_Last(uuid, orderByComparator);

		if (explosiveCommisionDecision != null) {
			return explosiveCommisionDecision;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchExplosiveCommisionDecisionException(sb.toString());
	}

	/**
	 * Returns the last explosive commision decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive commision decision, or <code>null</code> if a matching explosive commision decision could not be found
	 */
	@Override
	public ExplosiveCommisionDecision fetchByUuid_Last(
		String uuid,
		OrderByComparator<ExplosiveCommisionDecision> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<ExplosiveCommisionDecision> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the explosive commision decisions before and after the current explosive commision decision in the ordered set where uuid = &#63;.
	 *
	 * @param commisiondecId the primary key of the current explosive commision decision
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive commision decision
	 * @throws NoSuchExplosiveCommisionDecisionException if a explosive commision decision with the primary key could not be found
	 */
	@Override
	public ExplosiveCommisionDecision[] findByUuid_PrevAndNext(
			long commisiondecId, String uuid,
			OrderByComparator<ExplosiveCommisionDecision> orderByComparator)
		throws NoSuchExplosiveCommisionDecisionException {

		uuid = Objects.toString(uuid, "");

		ExplosiveCommisionDecision explosiveCommisionDecision =
			findByPrimaryKey(commisiondecId);

		Session session = null;

		try {
			session = openSession();

			ExplosiveCommisionDecision[] array =
				new ExplosiveCommisionDecisionImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, explosiveCommisionDecision, uuid, orderByComparator,
				true);

			array[1] = explosiveCommisionDecision;

			array[2] = getByUuid_PrevAndNext(
				session, explosiveCommisionDecision, uuid, orderByComparator,
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

	protected ExplosiveCommisionDecision getByUuid_PrevAndNext(
		Session session, ExplosiveCommisionDecision explosiveCommisionDecision,
		String uuid,
		OrderByComparator<ExplosiveCommisionDecision> orderByComparator,
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

		sb.append(_SQL_SELECT_EXPLOSIVECOMMISIONDECISION_WHERE);

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
			sb.append(ExplosiveCommisionDecisionModelImpl.ORDER_BY_JPQL);
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
						explosiveCommisionDecision)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ExplosiveCommisionDecision> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the explosive commision decisions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (ExplosiveCommisionDecision explosiveCommisionDecision :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(explosiveCommisionDecision);
		}
	}

	/**
	 * Returns the number of explosive commision decisions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching explosive commision decisions
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EXPLOSIVECOMMISIONDECISION_WHERE);

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
		"explosiveCommisionDecision.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(explosiveCommisionDecision.uuid IS NULL OR explosiveCommisionDecision.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the explosive commision decision where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchExplosiveCommisionDecisionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching explosive commision decision
	 * @throws NoSuchExplosiveCommisionDecisionException if a matching explosive commision decision could not be found
	 */
	@Override
	public ExplosiveCommisionDecision findByUUID_G(String uuid, long groupId)
		throws NoSuchExplosiveCommisionDecisionException {

		ExplosiveCommisionDecision explosiveCommisionDecision = fetchByUUID_G(
			uuid, groupId);

		if (explosiveCommisionDecision == null) {
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

			throw new NoSuchExplosiveCommisionDecisionException(sb.toString());
		}

		return explosiveCommisionDecision;
	}

	/**
	 * Returns the explosive commision decision where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching explosive commision decision, or <code>null</code> if a matching explosive commision decision could not be found
	 */
	@Override
	public ExplosiveCommisionDecision fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the explosive commision decision where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive commision decision, or <code>null</code> if a matching explosive commision decision could not be found
	 */
	@Override
	public ExplosiveCommisionDecision fetchByUUID_G(
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

		if (result instanceof ExplosiveCommisionDecision) {
			ExplosiveCommisionDecision explosiveCommisionDecision =
				(ExplosiveCommisionDecision)result;

			if (!Objects.equals(uuid, explosiveCommisionDecision.getUuid()) ||
				(groupId != explosiveCommisionDecision.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_EXPLOSIVECOMMISIONDECISION_WHERE);

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

				List<ExplosiveCommisionDecision> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					ExplosiveCommisionDecision explosiveCommisionDecision =
						list.get(0);

					result = explosiveCommisionDecision;

					cacheResult(explosiveCommisionDecision);
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
			return (ExplosiveCommisionDecision)result;
		}
	}

	/**
	 * Removes the explosive commision decision where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the explosive commision decision that was removed
	 */
	@Override
	public ExplosiveCommisionDecision removeByUUID_G(String uuid, long groupId)
		throws NoSuchExplosiveCommisionDecisionException {

		ExplosiveCommisionDecision explosiveCommisionDecision = findByUUID_G(
			uuid, groupId);

		return remove(explosiveCommisionDecision);
	}

	/**
	 * Returns the number of explosive commision decisions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching explosive commision decisions
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_EXPLOSIVECOMMISIONDECISION_WHERE);

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
		"explosiveCommisionDecision.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(explosiveCommisionDecision.uuid IS NULL OR explosiveCommisionDecision.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"explosiveCommisionDecision.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the explosive commision decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching explosive commision decisions
	 */
	@Override
	public List<ExplosiveCommisionDecision> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the explosive commision decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveCommisionDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive commision decisions
	 * @param end the upper bound of the range of explosive commision decisions (not inclusive)
	 * @return the range of matching explosive commision decisions
	 */
	@Override
	public List<ExplosiveCommisionDecision> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the explosive commision decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveCommisionDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive commision decisions
	 * @param end the upper bound of the range of explosive commision decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive commision decisions
	 */
	@Override
	public List<ExplosiveCommisionDecision> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ExplosiveCommisionDecision> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the explosive commision decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveCommisionDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive commision decisions
	 * @param end the upper bound of the range of explosive commision decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive commision decisions
	 */
	@Override
	public List<ExplosiveCommisionDecision> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ExplosiveCommisionDecision> orderByComparator,
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

		List<ExplosiveCommisionDecision> list = null;

		if (useFinderCache) {
			list = (List<ExplosiveCommisionDecision>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ExplosiveCommisionDecision explosiveCommisionDecision :
						list) {

					if (!uuid.equals(explosiveCommisionDecision.getUuid()) ||
						(companyId !=
							explosiveCommisionDecision.getCompanyId())) {

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

			sb.append(_SQL_SELECT_EXPLOSIVECOMMISIONDECISION_WHERE);

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
				sb.append(ExplosiveCommisionDecisionModelImpl.ORDER_BY_JPQL);
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

				list = (List<ExplosiveCommisionDecision>)QueryUtil.list(
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
	 * Returns the first explosive commision decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive commision decision
	 * @throws NoSuchExplosiveCommisionDecisionException if a matching explosive commision decision could not be found
	 */
	@Override
	public ExplosiveCommisionDecision findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<ExplosiveCommisionDecision> orderByComparator)
		throws NoSuchExplosiveCommisionDecisionException {

		ExplosiveCommisionDecision explosiveCommisionDecision =
			fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (explosiveCommisionDecision != null) {
			return explosiveCommisionDecision;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchExplosiveCommisionDecisionException(sb.toString());
	}

	/**
	 * Returns the first explosive commision decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive commision decision, or <code>null</code> if a matching explosive commision decision could not be found
	 */
	@Override
	public ExplosiveCommisionDecision fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<ExplosiveCommisionDecision> orderByComparator) {

		List<ExplosiveCommisionDecision> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last explosive commision decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive commision decision
	 * @throws NoSuchExplosiveCommisionDecisionException if a matching explosive commision decision could not be found
	 */
	@Override
	public ExplosiveCommisionDecision findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<ExplosiveCommisionDecision> orderByComparator)
		throws NoSuchExplosiveCommisionDecisionException {

		ExplosiveCommisionDecision explosiveCommisionDecision =
			fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (explosiveCommisionDecision != null) {
			return explosiveCommisionDecision;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchExplosiveCommisionDecisionException(sb.toString());
	}

	/**
	 * Returns the last explosive commision decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive commision decision, or <code>null</code> if a matching explosive commision decision could not be found
	 */
	@Override
	public ExplosiveCommisionDecision fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<ExplosiveCommisionDecision> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<ExplosiveCommisionDecision> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the explosive commision decisions before and after the current explosive commision decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param commisiondecId the primary key of the current explosive commision decision
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive commision decision
	 * @throws NoSuchExplosiveCommisionDecisionException if a explosive commision decision with the primary key could not be found
	 */
	@Override
	public ExplosiveCommisionDecision[] findByUuid_C_PrevAndNext(
			long commisiondecId, String uuid, long companyId,
			OrderByComparator<ExplosiveCommisionDecision> orderByComparator)
		throws NoSuchExplosiveCommisionDecisionException {

		uuid = Objects.toString(uuid, "");

		ExplosiveCommisionDecision explosiveCommisionDecision =
			findByPrimaryKey(commisiondecId);

		Session session = null;

		try {
			session = openSession();

			ExplosiveCommisionDecision[] array =
				new ExplosiveCommisionDecisionImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, explosiveCommisionDecision, uuid, companyId,
				orderByComparator, true);

			array[1] = explosiveCommisionDecision;

			array[2] = getByUuid_C_PrevAndNext(
				session, explosiveCommisionDecision, uuid, companyId,
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

	protected ExplosiveCommisionDecision getByUuid_C_PrevAndNext(
		Session session, ExplosiveCommisionDecision explosiveCommisionDecision,
		String uuid, long companyId,
		OrderByComparator<ExplosiveCommisionDecision> orderByComparator,
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

		sb.append(_SQL_SELECT_EXPLOSIVECOMMISIONDECISION_WHERE);

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
			sb.append(ExplosiveCommisionDecisionModelImpl.ORDER_BY_JPQL);
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
						explosiveCommisionDecision)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ExplosiveCommisionDecision> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the explosive commision decisions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (ExplosiveCommisionDecision explosiveCommisionDecision :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(explosiveCommisionDecision);
		}
	}

	/**
	 * Returns the number of explosive commision decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching explosive commision decisions
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_EXPLOSIVECOMMISIONDECISION_WHERE);

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
		"explosiveCommisionDecision.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(explosiveCommisionDecision.uuid IS NULL OR explosiveCommisionDecision.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"explosiveCommisionDecision.companyId = ?";

	private FinderPath _finderPathFetchBygetEXP_CD_CI;
	private FinderPath _finderPathCountBygetEXP_CD_CI;

	/**
	 * Returns the explosive commision decision where caseId = &#63; or throws a <code>NoSuchExplosiveCommisionDecisionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching explosive commision decision
	 * @throws NoSuchExplosiveCommisionDecisionException if a matching explosive commision decision could not be found
	 */
	@Override
	public ExplosiveCommisionDecision findBygetEXP_CD_CI(String caseId)
		throws NoSuchExplosiveCommisionDecisionException {

		ExplosiveCommisionDecision explosiveCommisionDecision =
			fetchBygetEXP_CD_CI(caseId);

		if (explosiveCommisionDecision == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchExplosiveCommisionDecisionException(sb.toString());
		}

		return explosiveCommisionDecision;
	}

	/**
	 * Returns the explosive commision decision where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching explosive commision decision, or <code>null</code> if a matching explosive commision decision could not be found
	 */
	@Override
	public ExplosiveCommisionDecision fetchBygetEXP_CD_CI(String caseId) {
		return fetchBygetEXP_CD_CI(caseId, true);
	}

	/**
	 * Returns the explosive commision decision where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive commision decision, or <code>null</code> if a matching explosive commision decision could not be found
	 */
	@Override
	public ExplosiveCommisionDecision fetchBygetEXP_CD_CI(
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

		if (result instanceof ExplosiveCommisionDecision) {
			ExplosiveCommisionDecision explosiveCommisionDecision =
				(ExplosiveCommisionDecision)result;

			if (!Objects.equals(
					caseId, explosiveCommisionDecision.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_EXPLOSIVECOMMISIONDECISION_WHERE);

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

				List<ExplosiveCommisionDecision> list = query.list();

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
								"ExplosiveCommisionDecisionPersistenceImpl.fetchBygetEXP_CD_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ExplosiveCommisionDecision explosiveCommisionDecision =
						list.get(0);

					result = explosiveCommisionDecision;

					cacheResult(explosiveCommisionDecision);
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
			return (ExplosiveCommisionDecision)result;
		}
	}

	/**
	 * Removes the explosive commision decision where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the explosive commision decision that was removed
	 */
	@Override
	public ExplosiveCommisionDecision removeBygetEXP_CD_CI(String caseId)
		throws NoSuchExplosiveCommisionDecisionException {

		ExplosiveCommisionDecision explosiveCommisionDecision =
			findBygetEXP_CD_CI(caseId);

		return remove(explosiveCommisionDecision);
	}

	/**
	 * Returns the number of explosive commision decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching explosive commision decisions
	 */
	@Override
	public int countBygetEXP_CD_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetEXP_CD_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EXPLOSIVECOMMISIONDECISION_WHERE);

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
		"explosiveCommisionDecision.caseId = ?";

	private static final String _FINDER_COLUMN_GETEXP_CD_CI_CASEID_3 =
		"(explosiveCommisionDecision.caseId IS NULL OR explosiveCommisionDecision.caseId = '')";

	public ExplosiveCommisionDecisionPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(ExplosiveCommisionDecision.class);

		setModelImplClass(ExplosiveCommisionDecisionImpl.class);
		setModelPKClass(long.class);

		setTable(ExplosiveCommisionDecisionTable.INSTANCE);
	}

	/**
	 * Caches the explosive commision decision in the entity cache if it is enabled.
	 *
	 * @param explosiveCommisionDecision the explosive commision decision
	 */
	@Override
	public void cacheResult(
		ExplosiveCommisionDecision explosiveCommisionDecision) {

		entityCache.putResult(
			ExplosiveCommisionDecisionImpl.class,
			explosiveCommisionDecision.getPrimaryKey(),
			explosiveCommisionDecision);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				explosiveCommisionDecision.getUuid(),
				explosiveCommisionDecision.getGroupId()
			},
			explosiveCommisionDecision);

		finderCache.putResult(
			_finderPathFetchBygetEXP_CD_CI,
			new Object[] {explosiveCommisionDecision.getCaseId()},
			explosiveCommisionDecision);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the explosive commision decisions in the entity cache if it is enabled.
	 *
	 * @param explosiveCommisionDecisions the explosive commision decisions
	 */
	@Override
	public void cacheResult(
		List<ExplosiveCommisionDecision> explosiveCommisionDecisions) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (explosiveCommisionDecisions.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (ExplosiveCommisionDecision explosiveCommisionDecision :
				explosiveCommisionDecisions) {

			if (entityCache.getResult(
					ExplosiveCommisionDecisionImpl.class,
					explosiveCommisionDecision.getPrimaryKey()) == null) {

				cacheResult(explosiveCommisionDecision);
			}
		}
	}

	/**
	 * Clears the cache for all explosive commision decisions.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ExplosiveCommisionDecisionImpl.class);

		finderCache.clearCache(ExplosiveCommisionDecisionImpl.class);
	}

	/**
	 * Clears the cache for the explosive commision decision.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		ExplosiveCommisionDecision explosiveCommisionDecision) {

		entityCache.removeResult(
			ExplosiveCommisionDecisionImpl.class, explosiveCommisionDecision);
	}

	@Override
	public void clearCache(
		List<ExplosiveCommisionDecision> explosiveCommisionDecisions) {

		for (ExplosiveCommisionDecision explosiveCommisionDecision :
				explosiveCommisionDecisions) {

			entityCache.removeResult(
				ExplosiveCommisionDecisionImpl.class,
				explosiveCommisionDecision);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ExplosiveCommisionDecisionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				ExplosiveCommisionDecisionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		ExplosiveCommisionDecisionModelImpl
			explosiveCommisionDecisionModelImpl) {

		Object[] args = new Object[] {
			explosiveCommisionDecisionModelImpl.getUuid(),
			explosiveCommisionDecisionModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args,
			explosiveCommisionDecisionModelImpl);

		args = new Object[] {explosiveCommisionDecisionModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetEXP_CD_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetEXP_CD_CI, args,
			explosiveCommisionDecisionModelImpl);
	}

	/**
	 * Creates a new explosive commision decision with the primary key. Does not add the explosive commision decision to the database.
	 *
	 * @param commisiondecId the primary key for the new explosive commision decision
	 * @return the new explosive commision decision
	 */
	@Override
	public ExplosiveCommisionDecision create(long commisiondecId) {
		ExplosiveCommisionDecision explosiveCommisionDecision =
			new ExplosiveCommisionDecisionImpl();

		explosiveCommisionDecision.setNew(true);
		explosiveCommisionDecision.setPrimaryKey(commisiondecId);

		String uuid = PortalUUIDUtil.generate();

		explosiveCommisionDecision.setUuid(uuid);

		explosiveCommisionDecision.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return explosiveCommisionDecision;
	}

	/**
	 * Removes the explosive commision decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param commisiondecId the primary key of the explosive commision decision
	 * @return the explosive commision decision that was removed
	 * @throws NoSuchExplosiveCommisionDecisionException if a explosive commision decision with the primary key could not be found
	 */
	@Override
	public ExplosiveCommisionDecision remove(long commisiondecId)
		throws NoSuchExplosiveCommisionDecisionException {

		return remove((Serializable)commisiondecId);
	}

	/**
	 * Removes the explosive commision decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the explosive commision decision
	 * @return the explosive commision decision that was removed
	 * @throws NoSuchExplosiveCommisionDecisionException if a explosive commision decision with the primary key could not be found
	 */
	@Override
	public ExplosiveCommisionDecision remove(Serializable primaryKey)
		throws NoSuchExplosiveCommisionDecisionException {

		Session session = null;

		try {
			session = openSession();

			ExplosiveCommisionDecision explosiveCommisionDecision =
				(ExplosiveCommisionDecision)session.get(
					ExplosiveCommisionDecisionImpl.class, primaryKey);

			if (explosiveCommisionDecision == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchExplosiveCommisionDecisionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(explosiveCommisionDecision);
		}
		catch (NoSuchExplosiveCommisionDecisionException
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
	protected ExplosiveCommisionDecision removeImpl(
		ExplosiveCommisionDecision explosiveCommisionDecision) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(explosiveCommisionDecision)) {
				explosiveCommisionDecision =
					(ExplosiveCommisionDecision)session.get(
						ExplosiveCommisionDecisionImpl.class,
						explosiveCommisionDecision.getPrimaryKeyObj());
			}

			if (explosiveCommisionDecision != null) {
				session.delete(explosiveCommisionDecision);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (explosiveCommisionDecision != null) {
			clearCache(explosiveCommisionDecision);
		}

		return explosiveCommisionDecision;
	}

	@Override
	public ExplosiveCommisionDecision updateImpl(
		ExplosiveCommisionDecision explosiveCommisionDecision) {

		boolean isNew = explosiveCommisionDecision.isNew();

		if (!(explosiveCommisionDecision instanceof
				ExplosiveCommisionDecisionModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(explosiveCommisionDecision.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					explosiveCommisionDecision);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in explosiveCommisionDecision proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ExplosiveCommisionDecision implementation " +
					explosiveCommisionDecision.getClass());
		}

		ExplosiveCommisionDecisionModelImpl
			explosiveCommisionDecisionModelImpl =
				(ExplosiveCommisionDecisionModelImpl)explosiveCommisionDecision;

		if (Validator.isNull(explosiveCommisionDecision.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			explosiveCommisionDecision.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (explosiveCommisionDecision.getCreateDate() == null)) {
			if (serviceContext == null) {
				explosiveCommisionDecision.setCreateDate(date);
			}
			else {
				explosiveCommisionDecision.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!explosiveCommisionDecisionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				explosiveCommisionDecision.setModifiedDate(date);
			}
			else {
				explosiveCommisionDecision.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(explosiveCommisionDecision);
			}
			else {
				explosiveCommisionDecision =
					(ExplosiveCommisionDecision)session.merge(
						explosiveCommisionDecision);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ExplosiveCommisionDecisionImpl.class,
			explosiveCommisionDecisionModelImpl, false, true);

		cacheUniqueFindersCache(explosiveCommisionDecisionModelImpl);

		if (isNew) {
			explosiveCommisionDecision.setNew(false);
		}

		explosiveCommisionDecision.resetOriginalValues();

		return explosiveCommisionDecision;
	}

	/**
	 * Returns the explosive commision decision with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the explosive commision decision
	 * @return the explosive commision decision
	 * @throws NoSuchExplosiveCommisionDecisionException if a explosive commision decision with the primary key could not be found
	 */
	@Override
	public ExplosiveCommisionDecision findByPrimaryKey(Serializable primaryKey)
		throws NoSuchExplosiveCommisionDecisionException {

		ExplosiveCommisionDecision explosiveCommisionDecision =
			fetchByPrimaryKey(primaryKey);

		if (explosiveCommisionDecision == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchExplosiveCommisionDecisionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return explosiveCommisionDecision;
	}

	/**
	 * Returns the explosive commision decision with the primary key or throws a <code>NoSuchExplosiveCommisionDecisionException</code> if it could not be found.
	 *
	 * @param commisiondecId the primary key of the explosive commision decision
	 * @return the explosive commision decision
	 * @throws NoSuchExplosiveCommisionDecisionException if a explosive commision decision with the primary key could not be found
	 */
	@Override
	public ExplosiveCommisionDecision findByPrimaryKey(long commisiondecId)
		throws NoSuchExplosiveCommisionDecisionException {

		return findByPrimaryKey((Serializable)commisiondecId);
	}

	/**
	 * Returns the explosive commision decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param commisiondecId the primary key of the explosive commision decision
	 * @return the explosive commision decision, or <code>null</code> if a explosive commision decision with the primary key could not be found
	 */
	@Override
	public ExplosiveCommisionDecision fetchByPrimaryKey(long commisiondecId) {
		return fetchByPrimaryKey((Serializable)commisiondecId);
	}

	/**
	 * Returns all the explosive commision decisions.
	 *
	 * @return the explosive commision decisions
	 */
	@Override
	public List<ExplosiveCommisionDecision> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the explosive commision decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveCommisionDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive commision decisions
	 * @param end the upper bound of the range of explosive commision decisions (not inclusive)
	 * @return the range of explosive commision decisions
	 */
	@Override
	public List<ExplosiveCommisionDecision> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the explosive commision decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveCommisionDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive commision decisions
	 * @param end the upper bound of the range of explosive commision decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of explosive commision decisions
	 */
	@Override
	public List<ExplosiveCommisionDecision> findAll(
		int start, int end,
		OrderByComparator<ExplosiveCommisionDecision> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the explosive commision decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveCommisionDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive commision decisions
	 * @param end the upper bound of the range of explosive commision decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of explosive commision decisions
	 */
	@Override
	public List<ExplosiveCommisionDecision> findAll(
		int start, int end,
		OrderByComparator<ExplosiveCommisionDecision> orderByComparator,
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

		List<ExplosiveCommisionDecision> list = null;

		if (useFinderCache) {
			list = (List<ExplosiveCommisionDecision>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_EXPLOSIVECOMMISIONDECISION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_EXPLOSIVECOMMISIONDECISION;

				sql = sql.concat(
					ExplosiveCommisionDecisionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ExplosiveCommisionDecision>)QueryUtil.list(
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
	 * Removes all the explosive commision decisions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ExplosiveCommisionDecision explosiveCommisionDecision :
				findAll()) {

			remove(explosiveCommisionDecision);
		}
	}

	/**
	 * Returns the number of explosive commision decisions.
	 *
	 * @return the number of explosive commision decisions
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
					_SQL_COUNT_EXPLOSIVECOMMISIONDECISION);

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
		return "commisiondecId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_EXPLOSIVECOMMISIONDECISION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ExplosiveCommisionDecisionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the explosive commision decision persistence.
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

		ExplosiveCommisionDecisionUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		ExplosiveCommisionDecisionUtil.setPersistence(null);

		entityCache.removeCache(ExplosiveCommisionDecisionImpl.class.getName());
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

	private static final String _SQL_SELECT_EXPLOSIVECOMMISIONDECISION =
		"SELECT explosiveCommisionDecision FROM ExplosiveCommisionDecision explosiveCommisionDecision";

	private static final String _SQL_SELECT_EXPLOSIVECOMMISIONDECISION_WHERE =
		"SELECT explosiveCommisionDecision FROM ExplosiveCommisionDecision explosiveCommisionDecision WHERE ";

	private static final String _SQL_COUNT_EXPLOSIVECOMMISIONDECISION =
		"SELECT COUNT(explosiveCommisionDecision) FROM ExplosiveCommisionDecision explosiveCommisionDecision";

	private static final String _SQL_COUNT_EXPLOSIVECOMMISIONDECISION_WHERE =
		"SELECT COUNT(explosiveCommisionDecision) FROM ExplosiveCommisionDecision explosiveCommisionDecision WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"explosiveCommisionDecision.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ExplosiveCommisionDecision exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ExplosiveCommisionDecision exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ExplosiveCommisionDecisionPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}