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

import com.nbp.explosives.competency.stages.service.exception.NoSuchExplosiveApplicationStagesException;
import com.nbp.explosives.competency.stages.service.model.ExplosiveApplicationStages;
import com.nbp.explosives.competency.stages.service.model.ExplosiveApplicationStagesTable;
import com.nbp.explosives.competency.stages.service.model.impl.ExplosiveApplicationStagesImpl;
import com.nbp.explosives.competency.stages.service.model.impl.ExplosiveApplicationStagesModelImpl;
import com.nbp.explosives.competency.stages.service.service.persistence.ExplosiveApplicationStagesPersistence;
import com.nbp.explosives.competency.stages.service.service.persistence.ExplosiveApplicationStagesUtil;
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
 * The persistence implementation for the explosive application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ExplosiveApplicationStagesPersistence.class)
public class ExplosiveApplicationStagesPersistenceImpl
	extends BasePersistenceImpl<ExplosiveApplicationStages>
	implements ExplosiveApplicationStagesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ExplosiveApplicationStagesUtil</code> to access the explosive application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ExplosiveApplicationStagesImpl.class.getName();

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
	 * Returns all the explosive application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching explosive application stageses
	 */
	@Override
	public List<ExplosiveApplicationStages> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the explosive application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @return the range of matching explosive application stageses
	 */
	@Override
	public List<ExplosiveApplicationStages> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the explosive application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive application stageses
	 */
	@Override
	public List<ExplosiveApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the explosive application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive application stageses
	 */
	@Override
	public List<ExplosiveApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator,
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

		List<ExplosiveApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<ExplosiveApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ExplosiveApplicationStages explosiveApplicationStages :
						list) {

					if (!uuid.equals(explosiveApplicationStages.getUuid())) {
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

			sb.append(_SQL_SELECT_EXPLOSIVEAPPLICATIONSTAGES_WHERE);

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
				sb.append(ExplosiveApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<ExplosiveApplicationStages>)QueryUtil.list(
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
	 * Returns the first explosive application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages findByUuid_First(
			String uuid,
			OrderByComparator<ExplosiveApplicationStages> orderByComparator)
		throws NoSuchExplosiveApplicationStagesException {

		ExplosiveApplicationStages explosiveApplicationStages =
			fetchByUuid_First(uuid, orderByComparator);

		if (explosiveApplicationStages != null) {
			return explosiveApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchExplosiveApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first explosive application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages fetchByUuid_First(
		String uuid,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator) {

		List<ExplosiveApplicationStages> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last explosive application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages findByUuid_Last(
			String uuid,
			OrderByComparator<ExplosiveApplicationStages> orderByComparator)
		throws NoSuchExplosiveApplicationStagesException {

		ExplosiveApplicationStages explosiveApplicationStages =
			fetchByUuid_Last(uuid, orderByComparator);

		if (explosiveApplicationStages != null) {
			return explosiveApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchExplosiveApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last explosive application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages fetchByUuid_Last(
		String uuid,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<ExplosiveApplicationStages> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the explosive application stageses before and after the current explosive application stages in the ordered set where uuid = &#63;.
	 *
	 * @param expApplicationStagesId the primary key of the current explosive application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a explosive application stages with the primary key could not be found
	 */
	@Override
	public ExplosiveApplicationStages[] findByUuid_PrevAndNext(
			long expApplicationStagesId, String uuid,
			OrderByComparator<ExplosiveApplicationStages> orderByComparator)
		throws NoSuchExplosiveApplicationStagesException {

		uuid = Objects.toString(uuid, "");

		ExplosiveApplicationStages explosiveApplicationStages =
			findByPrimaryKey(expApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			ExplosiveApplicationStages[] array =
				new ExplosiveApplicationStagesImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, explosiveApplicationStages, uuid, orderByComparator,
				true);

			array[1] = explosiveApplicationStages;

			array[2] = getByUuid_PrevAndNext(
				session, explosiveApplicationStages, uuid, orderByComparator,
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

	protected ExplosiveApplicationStages getByUuid_PrevAndNext(
		Session session, ExplosiveApplicationStages explosiveApplicationStages,
		String uuid,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_EXPLOSIVEAPPLICATIONSTAGES_WHERE);

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
			sb.append(ExplosiveApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						explosiveApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ExplosiveApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the explosive application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (ExplosiveApplicationStages explosiveApplicationStages :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(explosiveApplicationStages);
		}
	}

	/**
	 * Returns the number of explosive application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching explosive application stageses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EXPLOSIVEAPPLICATIONSTAGES_WHERE);

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
		"explosiveApplicationStages.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(explosiveApplicationStages.uuid IS NULL OR explosiveApplicationStages.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the explosive application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchExplosiveApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages findByUUID_G(String uuid, long groupId)
		throws NoSuchExplosiveApplicationStagesException {

		ExplosiveApplicationStages explosiveApplicationStages = fetchByUUID_G(
			uuid, groupId);

		if (explosiveApplicationStages == null) {
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

			throw new NoSuchExplosiveApplicationStagesException(sb.toString());
		}

		return explosiveApplicationStages;
	}

	/**
	 * Returns the explosive application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the explosive application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages fetchByUUID_G(
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

		if (result instanceof ExplosiveApplicationStages) {
			ExplosiveApplicationStages explosiveApplicationStages =
				(ExplosiveApplicationStages)result;

			if (!Objects.equals(uuid, explosiveApplicationStages.getUuid()) ||
				(groupId != explosiveApplicationStages.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_EXPLOSIVEAPPLICATIONSTAGES_WHERE);

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

				List<ExplosiveApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					ExplosiveApplicationStages explosiveApplicationStages =
						list.get(0);

					result = explosiveApplicationStages;

					cacheResult(explosiveApplicationStages);
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
			return (ExplosiveApplicationStages)result;
		}
	}

	/**
	 * Removes the explosive application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the explosive application stages that was removed
	 */
	@Override
	public ExplosiveApplicationStages removeByUUID_G(String uuid, long groupId)
		throws NoSuchExplosiveApplicationStagesException {

		ExplosiveApplicationStages explosiveApplicationStages = findByUUID_G(
			uuid, groupId);

		return remove(explosiveApplicationStages);
	}

	/**
	 * Returns the number of explosive application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching explosive application stageses
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_EXPLOSIVEAPPLICATIONSTAGES_WHERE);

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
		"explosiveApplicationStages.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(explosiveApplicationStages.uuid IS NULL OR explosiveApplicationStages.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"explosiveApplicationStages.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the explosive application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching explosive application stageses
	 */
	@Override
	public List<ExplosiveApplicationStages> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the explosive application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @return the range of matching explosive application stageses
	 */
	@Override
	public List<ExplosiveApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the explosive application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive application stageses
	 */
	@Override
	public List<ExplosiveApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the explosive application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive application stageses
	 */
	@Override
	public List<ExplosiveApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator,
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

		List<ExplosiveApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<ExplosiveApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ExplosiveApplicationStages explosiveApplicationStages :
						list) {

					if (!uuid.equals(explosiveApplicationStages.getUuid()) ||
						(companyId !=
							explosiveApplicationStages.getCompanyId())) {

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

			sb.append(_SQL_SELECT_EXPLOSIVEAPPLICATIONSTAGES_WHERE);

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
				sb.append(ExplosiveApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<ExplosiveApplicationStages>)QueryUtil.list(
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
	 * Returns the first explosive application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<ExplosiveApplicationStages> orderByComparator)
		throws NoSuchExplosiveApplicationStagesException {

		ExplosiveApplicationStages explosiveApplicationStages =
			fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (explosiveApplicationStages != null) {
			return explosiveApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchExplosiveApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first explosive application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator) {

		List<ExplosiveApplicationStages> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last explosive application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<ExplosiveApplicationStages> orderByComparator)
		throws NoSuchExplosiveApplicationStagesException {

		ExplosiveApplicationStages explosiveApplicationStages =
			fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (explosiveApplicationStages != null) {
			return explosiveApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchExplosiveApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last explosive application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<ExplosiveApplicationStages> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the explosive application stageses before and after the current explosive application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param expApplicationStagesId the primary key of the current explosive application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a explosive application stages with the primary key could not be found
	 */
	@Override
	public ExplosiveApplicationStages[] findByUuid_C_PrevAndNext(
			long expApplicationStagesId, String uuid, long companyId,
			OrderByComparator<ExplosiveApplicationStages> orderByComparator)
		throws NoSuchExplosiveApplicationStagesException {

		uuid = Objects.toString(uuid, "");

		ExplosiveApplicationStages explosiveApplicationStages =
			findByPrimaryKey(expApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			ExplosiveApplicationStages[] array =
				new ExplosiveApplicationStagesImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, explosiveApplicationStages, uuid, companyId,
				orderByComparator, true);

			array[1] = explosiveApplicationStages;

			array[2] = getByUuid_C_PrevAndNext(
				session, explosiveApplicationStages, uuid, companyId,
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

	protected ExplosiveApplicationStages getByUuid_C_PrevAndNext(
		Session session, ExplosiveApplicationStages explosiveApplicationStages,
		String uuid, long companyId,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_EXPLOSIVEAPPLICATIONSTAGES_WHERE);

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
			sb.append(ExplosiveApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						explosiveApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ExplosiveApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the explosive application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (ExplosiveApplicationStages explosiveApplicationStages :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(explosiveApplicationStages);
		}
	}

	/**
	 * Returns the number of explosive application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching explosive application stageses
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_EXPLOSIVEAPPLICATIONSTAGES_WHERE);

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
		"explosiveApplicationStages.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(explosiveApplicationStages.uuid IS NULL OR explosiveApplicationStages.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"explosiveApplicationStages.companyId = ?";

	private FinderPath _finderPathFetchBygetEXP_CAI;
	private FinderPath _finderPathCountBygetEXP_CAI;

	/**
	 * Returns the explosive application stages where explosiveApplicationId = &#63; or throws a <code>NoSuchExplosiveApplicationStagesException</code> if it could not be found.
	 *
	 * @param explosiveApplicationId the explosive application ID
	 * @return the matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages findBygetEXP_CAI(
			long explosiveApplicationId)
		throws NoSuchExplosiveApplicationStagesException {

		ExplosiveApplicationStages explosiveApplicationStages =
			fetchBygetEXP_CAI(explosiveApplicationId);

		if (explosiveApplicationStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("explosiveApplicationId=");
			sb.append(explosiveApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchExplosiveApplicationStagesException(sb.toString());
		}

		return explosiveApplicationStages;
	}

	/**
	 * Returns the explosive application stages where explosiveApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param explosiveApplicationId the explosive application ID
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages fetchBygetEXP_CAI(
		long explosiveApplicationId) {

		return fetchBygetEXP_CAI(explosiveApplicationId, true);
	}

	/**
	 * Returns the explosive application stages where explosiveApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param explosiveApplicationId the explosive application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages fetchBygetEXP_CAI(
		long explosiveApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {explosiveApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetEXP_CAI, finderArgs, this);
		}

		if (result instanceof ExplosiveApplicationStages) {
			ExplosiveApplicationStages explosiveApplicationStages =
				(ExplosiveApplicationStages)result;

			if (explosiveApplicationId !=
					explosiveApplicationStages.getExplosiveApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_EXPLOSIVEAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETEXP_CAI_EXPLOSIVEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(explosiveApplicationId);

				List<ExplosiveApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetEXP_CAI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									explosiveApplicationId
								};
							}

							_log.warn(
								"ExplosiveApplicationStagesPersistenceImpl.fetchBygetEXP_CAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ExplosiveApplicationStages explosiveApplicationStages =
						list.get(0);

					result = explosiveApplicationStages;

					cacheResult(explosiveApplicationStages);
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
			return (ExplosiveApplicationStages)result;
		}
	}

	/**
	 * Removes the explosive application stages where explosiveApplicationId = &#63; from the database.
	 *
	 * @param explosiveApplicationId the explosive application ID
	 * @return the explosive application stages that was removed
	 */
	@Override
	public ExplosiveApplicationStages removeBygetEXP_CAI(
			long explosiveApplicationId)
		throws NoSuchExplosiveApplicationStagesException {

		ExplosiveApplicationStages explosiveApplicationStages =
			findBygetEXP_CAI(explosiveApplicationId);

		return remove(explosiveApplicationStages);
	}

	/**
	 * Returns the number of explosive application stageses where explosiveApplicationId = &#63;.
	 *
	 * @param explosiveApplicationId the explosive application ID
	 * @return the number of matching explosive application stageses
	 */
	@Override
	public int countBygetEXP_CAI(long explosiveApplicationId) {
		FinderPath finderPath = _finderPathCountBygetEXP_CAI;

		Object[] finderArgs = new Object[] {explosiveApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EXPLOSIVEAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETEXP_CAI_EXPLOSIVEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(explosiveApplicationId);

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
		_FINDER_COLUMN_GETEXP_CAI_EXPLOSIVEAPPLICATIONID_2 =
			"explosiveApplicationStages.explosiveApplicationId = ?";

	private FinderPath _finderPathFetchBygetEXP_CaseIdStageName;
	private FinderPath _finderPathCountBygetEXP_CaseIdStageName;

	/**
	 * Returns the explosive application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchExplosiveApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages findBygetEXP_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchExplosiveApplicationStagesException {

		ExplosiveApplicationStages explosiveApplicationStages =
			fetchBygetEXP_CaseIdStageName(caseId, stageName);

		if (explosiveApplicationStages == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append(", stageName=");
			sb.append(stageName);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchExplosiveApplicationStagesException(sb.toString());
		}

		return explosiveApplicationStages;
	}

	/**
	 * Returns the explosive application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages fetchBygetEXP_CaseIdStageName(
		String caseId, String stageName) {

		return fetchBygetEXP_CaseIdStageName(caseId, stageName, true);
	}

	/**
	 * Returns the explosive application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages fetchBygetEXP_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId, stageName};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetEXP_CaseIdStageName, finderArgs, this);
		}

		if (result instanceof ExplosiveApplicationStages) {
			ExplosiveApplicationStages explosiveApplicationStages =
				(ExplosiveApplicationStages)result;

			if (!Objects.equals(
					caseId, explosiveApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, explosiveApplicationStages.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_EXPLOSIVEAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETEXP_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETEXP_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETEXP_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETEXP_CASEIDSTAGENAME_STAGENAME_2);
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

				if (bindStageName) {
					queryPos.add(stageName);
				}

				List<ExplosiveApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetEXP_CaseIdStageName,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId, stageName};
							}

							_log.warn(
								"ExplosiveApplicationStagesPersistenceImpl.fetchBygetEXP_CaseIdStageName(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ExplosiveApplicationStages explosiveApplicationStages =
						list.get(0);

					result = explosiveApplicationStages;

					cacheResult(explosiveApplicationStages);
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
			return (ExplosiveApplicationStages)result;
		}
	}

	/**
	 * Removes the explosive application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the explosive application stages that was removed
	 */
	@Override
	public ExplosiveApplicationStages removeBygetEXP_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchExplosiveApplicationStagesException {

		ExplosiveApplicationStages explosiveApplicationStages =
			findBygetEXP_CaseIdStageName(caseId, stageName);

		return remove(explosiveApplicationStages);
	}

	/**
	 * Returns the number of explosive application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching explosive application stageses
	 */
	@Override
	public int countBygetEXP_CaseIdStageName(String caseId, String stageName) {
		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetEXP_CaseIdStageName;

		Object[] finderArgs = new Object[] {caseId, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_EXPLOSIVEAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETEXP_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETEXP_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETEXP_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETEXP_CASEIDSTAGENAME_STAGENAME_2);
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

				if (bindStageName) {
					queryPos.add(stageName);
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

	private static final String _FINDER_COLUMN_GETEXP_CASEIDSTAGENAME_CASEID_2 =
		"explosiveApplicationStages.caseId = ? AND ";

	private static final String _FINDER_COLUMN_GETEXP_CASEIDSTAGENAME_CASEID_3 =
		"(explosiveApplicationStages.caseId IS NULL OR explosiveApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETEXP_CASEIDSTAGENAME_STAGENAME_2 =
			"explosiveApplicationStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETEXP_CASEIDSTAGENAME_STAGENAME_3 =
			"(explosiveApplicationStages.stageName IS NULL OR explosiveApplicationStages.stageName = '')";

	private FinderPath _finderPathWithPaginationFindBygetEXP_StageName;
	private FinderPath _finderPathWithoutPaginationFindBygetEXP_StageName;
	private FinderPath _finderPathCountBygetEXP_StageName;

	/**
	 * Returns all the explosive application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching explosive application stageses
	 */
	@Override
	public List<ExplosiveApplicationStages> findBygetEXP_StageName(
		String stageName) {

		return findBygetEXP_StageName(
			stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the explosive application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @return the range of matching explosive application stageses
	 */
	@Override
	public List<ExplosiveApplicationStages> findBygetEXP_StageName(
		String stageName, int start, int end) {

		return findBygetEXP_StageName(stageName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the explosive application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive application stageses
	 */
	@Override
	public List<ExplosiveApplicationStages> findBygetEXP_StageName(
		String stageName, int start, int end,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator) {

		return findBygetEXP_StageName(
			stageName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the explosive application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive application stageses
	 */
	@Override
	public List<ExplosiveApplicationStages> findBygetEXP_StageName(
		String stageName, int start, int end,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetEXP_StageName;
				finderArgs = new Object[] {stageName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetEXP_StageName;
			finderArgs = new Object[] {
				stageName, start, end, orderByComparator
			};
		}

		List<ExplosiveApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<ExplosiveApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ExplosiveApplicationStages explosiveApplicationStages :
						list) {

					if (!stageName.equals(
							explosiveApplicationStages.getStageName())) {

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

			sb.append(_SQL_SELECT_EXPLOSIVEAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETEXP_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETEXP_STAGENAME_STAGENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ExplosiveApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStageName) {
					queryPos.add(stageName);
				}

				list = (List<ExplosiveApplicationStages>)QueryUtil.list(
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
	 * Returns the first explosive application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages findBygetEXP_StageName_First(
			String stageName,
			OrderByComparator<ExplosiveApplicationStages> orderByComparator)
		throws NoSuchExplosiveApplicationStagesException {

		ExplosiveApplicationStages explosiveApplicationStages =
			fetchBygetEXP_StageName_First(stageName, orderByComparator);

		if (explosiveApplicationStages != null) {
			return explosiveApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchExplosiveApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first explosive application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages fetchBygetEXP_StageName_First(
		String stageName,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator) {

		List<ExplosiveApplicationStages> list = findBygetEXP_StageName(
			stageName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last explosive application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages findBygetEXP_StageName_Last(
			String stageName,
			OrderByComparator<ExplosiveApplicationStages> orderByComparator)
		throws NoSuchExplosiveApplicationStagesException {

		ExplosiveApplicationStages explosiveApplicationStages =
			fetchBygetEXP_StageName_Last(stageName, orderByComparator);

		if (explosiveApplicationStages != null) {
			return explosiveApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchExplosiveApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last explosive application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages fetchBygetEXP_StageName_Last(
		String stageName,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator) {

		int count = countBygetEXP_StageName(stageName);

		if (count == 0) {
			return null;
		}

		List<ExplosiveApplicationStages> list = findBygetEXP_StageName(
			stageName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the explosive application stageses before and after the current explosive application stages in the ordered set where stageName = &#63;.
	 *
	 * @param expApplicationStagesId the primary key of the current explosive application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a explosive application stages with the primary key could not be found
	 */
	@Override
	public ExplosiveApplicationStages[] findBygetEXP_StageName_PrevAndNext(
			long expApplicationStagesId, String stageName,
			OrderByComparator<ExplosiveApplicationStages> orderByComparator)
		throws NoSuchExplosiveApplicationStagesException {

		stageName = Objects.toString(stageName, "");

		ExplosiveApplicationStages explosiveApplicationStages =
			findByPrimaryKey(expApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			ExplosiveApplicationStages[] array =
				new ExplosiveApplicationStagesImpl[3];

			array[0] = getBygetEXP_StageName_PrevAndNext(
				session, explosiveApplicationStages, stageName,
				orderByComparator, true);

			array[1] = explosiveApplicationStages;

			array[2] = getBygetEXP_StageName_PrevAndNext(
				session, explosiveApplicationStages, stageName,
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

	protected ExplosiveApplicationStages getBygetEXP_StageName_PrevAndNext(
		Session session, ExplosiveApplicationStages explosiveApplicationStages,
		String stageName,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_EXPLOSIVEAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETEXP_STAGENAME_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETEXP_STAGENAME_STAGENAME_2);
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
			sb.append(ExplosiveApplicationStagesModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStageName) {
			queryPos.add(stageName);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						explosiveApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ExplosiveApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the explosive application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	@Override
	public void removeBygetEXP_StageName(String stageName) {
		for (ExplosiveApplicationStages explosiveApplicationStages :
				findBygetEXP_StageName(
					stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(explosiveApplicationStages);
		}
	}

	/**
	 * Returns the number of explosive application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching explosive application stageses
	 */
	@Override
	public int countBygetEXP_StageName(String stageName) {
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetEXP_StageName;

		Object[] finderArgs = new Object[] {stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EXPLOSIVEAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETEXP_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETEXP_STAGENAME_STAGENAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStageName) {
					queryPos.add(stageName);
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

	private static final String _FINDER_COLUMN_GETEXP_STAGENAME_STAGENAME_2 =
		"explosiveApplicationStages.stageName = ?";

	private static final String _FINDER_COLUMN_GETEXP_STAGENAME_STAGENAME_3 =
		"(explosiveApplicationStages.stageName IS NULL OR explosiveApplicationStages.stageName = '')";

	private FinderPath _finderPathFetchBygetEXP_CaseIdStageStatus;
	private FinderPath _finderPathCountBygetEXP_CaseIdStageStatus;

	/**
	 * Returns the explosive application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchExplosiveApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages findBygetEXP_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchExplosiveApplicationStagesException {

		ExplosiveApplicationStages explosiveApplicationStages =
			fetchBygetEXP_CaseIdStageStatus(caseId, stageName, stageStatus);

		if (explosiveApplicationStages == null) {
			StringBundler sb = new StringBundler(8);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append(", stageName=");
			sb.append(stageName);

			sb.append(", stageStatus=");
			sb.append(stageStatus);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchExplosiveApplicationStagesException(sb.toString());
		}

		return explosiveApplicationStages;
	}

	/**
	 * Returns the explosive application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages fetchBygetEXP_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return fetchBygetEXP_CaseIdStageStatus(
			caseId, stageName, stageStatus, true);
	}

	/**
	 * Returns the explosive application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages fetchBygetEXP_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId, stageName, stageStatus};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetEXP_CaseIdStageStatus, finderArgs, this);
		}

		if (result instanceof ExplosiveApplicationStages) {
			ExplosiveApplicationStages explosiveApplicationStages =
				(ExplosiveApplicationStages)result;

			if (!Objects.equals(
					caseId, explosiveApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, explosiveApplicationStages.getStageName()) ||
				!Objects.equals(
					stageStatus, explosiveApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_EXPLOSIVEAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETEXP_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETEXP_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETEXP_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETEXP_CASEIDSTAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETEXP_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETEXP_CASEIDSTAGESTATUS_STAGESTATUS_2);
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

				if (bindStageName) {
					queryPos.add(stageName);
				}

				if (bindStageStatus) {
					queryPos.add(stageStatus);
				}

				List<ExplosiveApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetEXP_CaseIdStageStatus,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									caseId, stageName, stageStatus
								};
							}

							_log.warn(
								"ExplosiveApplicationStagesPersistenceImpl.fetchBygetEXP_CaseIdStageStatus(String, String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ExplosiveApplicationStages explosiveApplicationStages =
						list.get(0);

					result = explosiveApplicationStages;

					cacheResult(explosiveApplicationStages);
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
			return (ExplosiveApplicationStages)result;
		}
	}

	/**
	 * Removes the explosive application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the explosive application stages that was removed
	 */
	@Override
	public ExplosiveApplicationStages removeBygetEXP_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchExplosiveApplicationStagesException {

		ExplosiveApplicationStages explosiveApplicationStages =
			findBygetEXP_CaseIdStageStatus(caseId, stageName, stageStatus);

		return remove(explosiveApplicationStages);
	}

	/**
	 * Returns the number of explosive application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching explosive application stageses
	 */
	@Override
	public int countBygetEXP_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetEXP_CaseIdStageStatus;

		Object[] finderArgs = new Object[] {caseId, stageName, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_EXPLOSIVEAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETEXP_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETEXP_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETEXP_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETEXP_CASEIDSTAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETEXP_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETEXP_CASEIDSTAGESTATUS_STAGESTATUS_2);
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

				if (bindStageName) {
					queryPos.add(stageName);
				}

				if (bindStageStatus) {
					queryPos.add(stageStatus);
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
		_FINDER_COLUMN_GETEXP_CASEIDSTAGESTATUS_CASEID_2 =
			"explosiveApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETEXP_CASEIDSTAGESTATUS_CASEID_3 =
			"(explosiveApplicationStages.caseId IS NULL OR explosiveApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETEXP_CASEIDSTAGESTATUS_STAGENAME_2 =
			"explosiveApplicationStages.stageName = ? AND ";

	private static final String
		_FINDER_COLUMN_GETEXP_CASEIDSTAGESTATUS_STAGENAME_3 =
			"(explosiveApplicationStages.stageName IS NULL OR explosiveApplicationStages.stageName = '') AND ";

	private static final String
		_FINDER_COLUMN_GETEXP_CASEIDSTAGESTATUS_STAGESTATUS_2 =
			"explosiveApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETEXP_CASEIDSTAGESTATUS_STAGESTATUS_3 =
			"(explosiveApplicationStages.stageStatus IS NULL OR explosiveApplicationStages.stageStatus = '')";

	private FinderPath _finderPathFetchBygetEXP_CaseIdAndStatus;
	private FinderPath _finderPathCountBygetEXP_CaseIdAndStatus;

	/**
	 * Returns the explosive application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchExplosiveApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages findBygetEXP_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchExplosiveApplicationStagesException {

		ExplosiveApplicationStages explosiveApplicationStages =
			fetchBygetEXP_CaseIdAndStatus(caseId, stageStatus);

		if (explosiveApplicationStages == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append(", stageStatus=");
			sb.append(stageStatus);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchExplosiveApplicationStagesException(sb.toString());
		}

		return explosiveApplicationStages;
	}

	/**
	 * Returns the explosive application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages fetchBygetEXP_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return fetchBygetEXP_CaseIdAndStatus(caseId, stageStatus, true);
	}

	/**
	 * Returns the explosive application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages fetchBygetEXP_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId, stageStatus};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetEXP_CaseIdAndStatus, finderArgs, this);
		}

		if (result instanceof ExplosiveApplicationStages) {
			ExplosiveApplicationStages explosiveApplicationStages =
				(ExplosiveApplicationStages)result;

			if (!Objects.equals(
					caseId, explosiveApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageStatus, explosiveApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_EXPLOSIVEAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETEXP_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETEXP_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETEXP_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETEXP_CASEIDANDSTATUS_STAGESTATUS_2);
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

				if (bindStageStatus) {
					queryPos.add(stageStatus);
				}

				List<ExplosiveApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetEXP_CaseIdAndStatus,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId, stageStatus};
							}

							_log.warn(
								"ExplosiveApplicationStagesPersistenceImpl.fetchBygetEXP_CaseIdAndStatus(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ExplosiveApplicationStages explosiveApplicationStages =
						list.get(0);

					result = explosiveApplicationStages;

					cacheResult(explosiveApplicationStages);
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
			return (ExplosiveApplicationStages)result;
		}
	}

	/**
	 * Removes the explosive application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the explosive application stages that was removed
	 */
	@Override
	public ExplosiveApplicationStages removeBygetEXP_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchExplosiveApplicationStagesException {

		ExplosiveApplicationStages explosiveApplicationStages =
			findBygetEXP_CaseIdAndStatus(caseId, stageStatus);

		return remove(explosiveApplicationStages);
	}

	/**
	 * Returns the number of explosive application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching explosive application stageses
	 */
	@Override
	public int countBygetEXP_CaseIdAndStatus(
		String caseId, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetEXP_CaseIdAndStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_EXPLOSIVEAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETEXP_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETEXP_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETEXP_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETEXP_CASEIDANDSTATUS_STAGESTATUS_2);
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

				if (bindStageStatus) {
					queryPos.add(stageStatus);
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

	private static final String _FINDER_COLUMN_GETEXP_CASEIDANDSTATUS_CASEID_2 =
		"explosiveApplicationStages.caseId = ? AND ";

	private static final String _FINDER_COLUMN_GETEXP_CASEIDANDSTATUS_CASEID_3 =
		"(explosiveApplicationStages.caseId IS NULL OR explosiveApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETEXP_CASEIDANDSTATUS_STAGESTATUS_2 =
			"explosiveApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETEXP_CASEIDANDSTATUS_STAGESTATUS_3 =
			"(explosiveApplicationStages.stageStatus IS NULL OR explosiveApplicationStages.stageStatus = '')";

	private FinderPath _finderPathWithPaginationFindBygetEXP_SNAndSS;
	private FinderPath _finderPathWithoutPaginationFindBygetEXP_SNAndSS;
	private FinderPath _finderPathCountBygetEXP_SNAndSS;

	/**
	 * Returns all the explosive application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching explosive application stageses
	 */
	@Override
	public List<ExplosiveApplicationStages> findBygetEXP_SNAndSS(
		String stageName, String stageStatus) {

		return findBygetEXP_SNAndSS(
			stageName, stageStatus, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the explosive application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @return the range of matching explosive application stageses
	 */
	@Override
	public List<ExplosiveApplicationStages> findBygetEXP_SNAndSS(
		String stageName, String stageStatus, int start, int end) {

		return findBygetEXP_SNAndSS(stageName, stageStatus, start, end, null);
	}

	/**
	 * Returns an ordered range of all the explosive application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive application stageses
	 */
	@Override
	public List<ExplosiveApplicationStages> findBygetEXP_SNAndSS(
		String stageName, String stageStatus, int start, int end,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator) {

		return findBygetEXP_SNAndSS(
			stageName, stageStatus, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the explosive application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive application stageses
	 */
	@Override
	public List<ExplosiveApplicationStages> findBygetEXP_SNAndSS(
		String stageName, String stageStatus, int start, int end,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetEXP_SNAndSS;
				finderArgs = new Object[] {stageName, stageStatus};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetEXP_SNAndSS;
			finderArgs = new Object[] {
				stageName, stageStatus, start, end, orderByComparator
			};
		}

		List<ExplosiveApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<ExplosiveApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ExplosiveApplicationStages explosiveApplicationStages :
						list) {

					if (!stageName.equals(
							explosiveApplicationStages.getStageName()) ||
						!stageStatus.equals(
							explosiveApplicationStages.getStageStatus())) {

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

			sb.append(_SQL_SELECT_EXPLOSIVEAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETEXP_SNANDSS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETEXP_SNANDSS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETEXP_SNANDSS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETEXP_SNANDSS_STAGESTATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ExplosiveApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStageName) {
					queryPos.add(stageName);
				}

				if (bindStageStatus) {
					queryPos.add(stageStatus);
				}

				list = (List<ExplosiveApplicationStages>)QueryUtil.list(
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
	 * Returns the first explosive application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages findBygetEXP_SNAndSS_First(
			String stageName, String stageStatus,
			OrderByComparator<ExplosiveApplicationStages> orderByComparator)
		throws NoSuchExplosiveApplicationStagesException {

		ExplosiveApplicationStages explosiveApplicationStages =
			fetchBygetEXP_SNAndSS_First(
				stageName, stageStatus, orderByComparator);

		if (explosiveApplicationStages != null) {
			return explosiveApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append(", stageStatus=");
		sb.append(stageStatus);

		sb.append("}");

		throw new NoSuchExplosiveApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first explosive application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages fetchBygetEXP_SNAndSS_First(
		String stageName, String stageStatus,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator) {

		List<ExplosiveApplicationStages> list = findBygetEXP_SNAndSS(
			stageName, stageStatus, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last explosive application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages findBygetEXP_SNAndSS_Last(
			String stageName, String stageStatus,
			OrderByComparator<ExplosiveApplicationStages> orderByComparator)
		throws NoSuchExplosiveApplicationStagesException {

		ExplosiveApplicationStages explosiveApplicationStages =
			fetchBygetEXP_SNAndSS_Last(
				stageName, stageStatus, orderByComparator);

		if (explosiveApplicationStages != null) {
			return explosiveApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append(", stageStatus=");
		sb.append(stageStatus);

		sb.append("}");

		throw new NoSuchExplosiveApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last explosive application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages fetchBygetEXP_SNAndSS_Last(
		String stageName, String stageStatus,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator) {

		int count = countBygetEXP_SNAndSS(stageName, stageStatus);

		if (count == 0) {
			return null;
		}

		List<ExplosiveApplicationStages> list = findBygetEXP_SNAndSS(
			stageName, stageStatus, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the explosive application stageses before and after the current explosive application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param expApplicationStagesId the primary key of the current explosive application stages
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a explosive application stages with the primary key could not be found
	 */
	@Override
	public ExplosiveApplicationStages[] findBygetEXP_SNAndSS_PrevAndNext(
			long expApplicationStagesId, String stageName, String stageStatus,
			OrderByComparator<ExplosiveApplicationStages> orderByComparator)
		throws NoSuchExplosiveApplicationStagesException {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		ExplosiveApplicationStages explosiveApplicationStages =
			findByPrimaryKey(expApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			ExplosiveApplicationStages[] array =
				new ExplosiveApplicationStagesImpl[3];

			array[0] = getBygetEXP_SNAndSS_PrevAndNext(
				session, explosiveApplicationStages, stageName, stageStatus,
				orderByComparator, true);

			array[1] = explosiveApplicationStages;

			array[2] = getBygetEXP_SNAndSS_PrevAndNext(
				session, explosiveApplicationStages, stageName, stageStatus,
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

	protected ExplosiveApplicationStages getBygetEXP_SNAndSS_PrevAndNext(
		Session session, ExplosiveApplicationStages explosiveApplicationStages,
		String stageName, String stageStatus,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_EXPLOSIVEAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETEXP_SNANDSS_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETEXP_SNANDSS_STAGENAME_2);
		}

		boolean bindStageStatus = false;

		if (stageStatus.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETEXP_SNANDSS_STAGESTATUS_3);
		}
		else {
			bindStageStatus = true;

			sb.append(_FINDER_COLUMN_GETEXP_SNANDSS_STAGESTATUS_2);
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
			sb.append(ExplosiveApplicationStagesModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStageName) {
			queryPos.add(stageName);
		}

		if (bindStageStatus) {
			queryPos.add(stageStatus);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						explosiveApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ExplosiveApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the explosive application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	@Override
	public void removeBygetEXP_SNAndSS(String stageName, String stageStatus) {
		for (ExplosiveApplicationStages explosiveApplicationStages :
				findBygetEXP_SNAndSS(
					stageName, stageStatus, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(explosiveApplicationStages);
		}
	}

	/**
	 * Returns the number of explosive application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching explosive application stageses
	 */
	@Override
	public int countBygetEXP_SNAndSS(String stageName, String stageStatus) {
		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetEXP_SNAndSS;

		Object[] finderArgs = new Object[] {stageName, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_EXPLOSIVEAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETEXP_SNANDSS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETEXP_SNANDSS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETEXP_SNANDSS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETEXP_SNANDSS_STAGESTATUS_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStageName) {
					queryPos.add(stageName);
				}

				if (bindStageStatus) {
					queryPos.add(stageStatus);
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

	private static final String _FINDER_COLUMN_GETEXP_SNANDSS_STAGENAME_2 =
		"explosiveApplicationStages.stageName = ? AND ";

	private static final String _FINDER_COLUMN_GETEXP_SNANDSS_STAGENAME_3 =
		"(explosiveApplicationStages.stageName IS NULL OR explosiveApplicationStages.stageName = '') AND ";

	private static final String _FINDER_COLUMN_GETEXP_SNANDSS_STAGESTATUS_2 =
		"explosiveApplicationStages.stageStatus = ?";

	private static final String _FINDER_COLUMN_GETEXP_SNANDSS_STAGESTATUS_3 =
		"(explosiveApplicationStages.stageStatus IS NULL OR explosiveApplicationStages.stageStatus = '')";

	private FinderPath _finderPathWithPaginationFindBygetEXP_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetEXP_CaseId;
	private FinderPath _finderPathCountBygetEXP_CaseId;

	/**
	 * Returns all the explosive application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching explosive application stageses
	 */
	@Override
	public List<ExplosiveApplicationStages> findBygetEXP_CaseId(String caseId) {
		return findBygetEXP_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the explosive application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @return the range of matching explosive application stageses
	 */
	@Override
	public List<ExplosiveApplicationStages> findBygetEXP_CaseId(
		String caseId, int start, int end) {

		return findBygetEXP_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the explosive application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive application stageses
	 */
	@Override
	public List<ExplosiveApplicationStages> findBygetEXP_CaseId(
		String caseId, int start, int end,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator) {

		return findBygetEXP_CaseId(caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the explosive application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive application stageses
	 */
	@Override
	public List<ExplosiveApplicationStages> findBygetEXP_CaseId(
		String caseId, int start, int end,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetEXP_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetEXP_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<ExplosiveApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<ExplosiveApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ExplosiveApplicationStages explosiveApplicationStages :
						list) {

					if (!caseId.equals(
							explosiveApplicationStages.getCaseId())) {

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

			sb.append(_SQL_SELECT_EXPLOSIVEAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETEXP_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETEXP_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ExplosiveApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<ExplosiveApplicationStages>)QueryUtil.list(
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
	 * Returns the first explosive application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages findBygetEXP_CaseId_First(
			String caseId,
			OrderByComparator<ExplosiveApplicationStages> orderByComparator)
		throws NoSuchExplosiveApplicationStagesException {

		ExplosiveApplicationStages explosiveApplicationStages =
			fetchBygetEXP_CaseId_First(caseId, orderByComparator);

		if (explosiveApplicationStages != null) {
			return explosiveApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchExplosiveApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first explosive application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages fetchBygetEXP_CaseId_First(
		String caseId,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator) {

		List<ExplosiveApplicationStages> list = findBygetEXP_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last explosive application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages findBygetEXP_CaseId_Last(
			String caseId,
			OrderByComparator<ExplosiveApplicationStages> orderByComparator)
		throws NoSuchExplosiveApplicationStagesException {

		ExplosiveApplicationStages explosiveApplicationStages =
			fetchBygetEXP_CaseId_Last(caseId, orderByComparator);

		if (explosiveApplicationStages != null) {
			return explosiveApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchExplosiveApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last explosive application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages fetchBygetEXP_CaseId_Last(
		String caseId,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator) {

		int count = countBygetEXP_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<ExplosiveApplicationStages> list = findBygetEXP_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the explosive application stageses before and after the current explosive application stages in the ordered set where caseId = &#63;.
	 *
	 * @param expApplicationStagesId the primary key of the current explosive application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a explosive application stages with the primary key could not be found
	 */
	@Override
	public ExplosiveApplicationStages[] findBygetEXP_CaseId_PrevAndNext(
			long expApplicationStagesId, String caseId,
			OrderByComparator<ExplosiveApplicationStages> orderByComparator)
		throws NoSuchExplosiveApplicationStagesException {

		caseId = Objects.toString(caseId, "");

		ExplosiveApplicationStages explosiveApplicationStages =
			findByPrimaryKey(expApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			ExplosiveApplicationStages[] array =
				new ExplosiveApplicationStagesImpl[3];

			array[0] = getBygetEXP_CaseId_PrevAndNext(
				session, explosiveApplicationStages, caseId, orderByComparator,
				true);

			array[1] = explosiveApplicationStages;

			array[2] = getBygetEXP_CaseId_PrevAndNext(
				session, explosiveApplicationStages, caseId, orderByComparator,
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

	protected ExplosiveApplicationStages getBygetEXP_CaseId_PrevAndNext(
		Session session, ExplosiveApplicationStages explosiveApplicationStages,
		String caseId,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_EXPLOSIVEAPPLICATIONSTAGES_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETEXP_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETEXP_CASEID_CASEID_2);
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
			sb.append(ExplosiveApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						explosiveApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ExplosiveApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the explosive application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetEXP_CaseId(String caseId) {
		for (ExplosiveApplicationStages explosiveApplicationStages :
				findBygetEXP_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(explosiveApplicationStages);
		}
	}

	/**
	 * Returns the number of explosive application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching explosive application stageses
	 */
	@Override
	public int countBygetEXP_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetEXP_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EXPLOSIVEAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETEXP_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETEXP_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETEXP_CASEID_CASEID_2 =
		"explosiveApplicationStages.caseId = ?";

	private static final String _FINDER_COLUMN_GETEXP_CASEID_CASEID_3 =
		"(explosiveApplicationStages.caseId IS NULL OR explosiveApplicationStages.caseId = '')";

	private FinderPath _finderPathFetchBygetEXP_By_CaseId;
	private FinderPath _finderPathCountBygetEXP_By_CaseId;

	/**
	 * Returns the explosive application stages where caseId = &#63; or throws a <code>NoSuchExplosiveApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages findBygetEXP_By_CaseId(String caseId)
		throws NoSuchExplosiveApplicationStagesException {

		ExplosiveApplicationStages explosiveApplicationStages =
			fetchBygetEXP_By_CaseId(caseId);

		if (explosiveApplicationStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchExplosiveApplicationStagesException(sb.toString());
		}

		return explosiveApplicationStages;
	}

	/**
	 * Returns the explosive application stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages fetchBygetEXP_By_CaseId(String caseId) {
		return fetchBygetEXP_By_CaseId(caseId, true);
	}

	/**
	 * Returns the explosive application stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	@Override
	public ExplosiveApplicationStages fetchBygetEXP_By_CaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetEXP_By_CaseId, finderArgs, this);
		}

		if (result instanceof ExplosiveApplicationStages) {
			ExplosiveApplicationStages explosiveApplicationStages =
				(ExplosiveApplicationStages)result;

			if (!Objects.equals(
					caseId, explosiveApplicationStages.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_EXPLOSIVEAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETEXP_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETEXP_BY_CASEID_CASEID_2);
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

				List<ExplosiveApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetEXP_By_CaseId, finderArgs,
							list);
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
								"ExplosiveApplicationStagesPersistenceImpl.fetchBygetEXP_By_CaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ExplosiveApplicationStages explosiveApplicationStages =
						list.get(0);

					result = explosiveApplicationStages;

					cacheResult(explosiveApplicationStages);
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
			return (ExplosiveApplicationStages)result;
		}
	}

	/**
	 * Removes the explosive application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the explosive application stages that was removed
	 */
	@Override
	public ExplosiveApplicationStages removeBygetEXP_By_CaseId(String caseId)
		throws NoSuchExplosiveApplicationStagesException {

		ExplosiveApplicationStages explosiveApplicationStages =
			findBygetEXP_By_CaseId(caseId);

		return remove(explosiveApplicationStages);
	}

	/**
	 * Returns the number of explosive application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching explosive application stageses
	 */
	@Override
	public int countBygetEXP_By_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetEXP_By_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EXPLOSIVEAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETEXP_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETEXP_BY_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETEXP_BY_CASEID_CASEID_2 =
		"explosiveApplicationStages.caseId = ?";

	private static final String _FINDER_COLUMN_GETEXP_BY_CASEID_CASEID_3 =
		"(explosiveApplicationStages.caseId IS NULL OR explosiveApplicationStages.caseId = '')";

	public ExplosiveApplicationStagesPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(ExplosiveApplicationStages.class);

		setModelImplClass(ExplosiveApplicationStagesImpl.class);
		setModelPKClass(long.class);

		setTable(ExplosiveApplicationStagesTable.INSTANCE);
	}

	/**
	 * Caches the explosive application stages in the entity cache if it is enabled.
	 *
	 * @param explosiveApplicationStages the explosive application stages
	 */
	@Override
	public void cacheResult(
		ExplosiveApplicationStages explosiveApplicationStages) {

		entityCache.putResult(
			ExplosiveApplicationStagesImpl.class,
			explosiveApplicationStages.getPrimaryKey(),
			explosiveApplicationStages);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				explosiveApplicationStages.getUuid(),
				explosiveApplicationStages.getGroupId()
			},
			explosiveApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetEXP_CAI,
			new Object[] {
				explosiveApplicationStages.getExplosiveApplicationId()
			},
			explosiveApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetEXP_CaseIdStageName,
			new Object[] {
				explosiveApplicationStages.getCaseId(),
				explosiveApplicationStages.getStageName()
			},
			explosiveApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetEXP_CaseIdStageStatus,
			new Object[] {
				explosiveApplicationStages.getCaseId(),
				explosiveApplicationStages.getStageName(),
				explosiveApplicationStages.getStageStatus()
			},
			explosiveApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetEXP_CaseIdAndStatus,
			new Object[] {
				explosiveApplicationStages.getCaseId(),
				explosiveApplicationStages.getStageStatus()
			},
			explosiveApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetEXP_By_CaseId,
			new Object[] {explosiveApplicationStages.getCaseId()},
			explosiveApplicationStages);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the explosive application stageses in the entity cache if it is enabled.
	 *
	 * @param explosiveApplicationStageses the explosive application stageses
	 */
	@Override
	public void cacheResult(
		List<ExplosiveApplicationStages> explosiveApplicationStageses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (explosiveApplicationStageses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (ExplosiveApplicationStages explosiveApplicationStages :
				explosiveApplicationStageses) {

			if (entityCache.getResult(
					ExplosiveApplicationStagesImpl.class,
					explosiveApplicationStages.getPrimaryKey()) == null) {

				cacheResult(explosiveApplicationStages);
			}
		}
	}

	/**
	 * Clears the cache for all explosive application stageses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ExplosiveApplicationStagesImpl.class);

		finderCache.clearCache(ExplosiveApplicationStagesImpl.class);
	}

	/**
	 * Clears the cache for the explosive application stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		ExplosiveApplicationStages explosiveApplicationStages) {

		entityCache.removeResult(
			ExplosiveApplicationStagesImpl.class, explosiveApplicationStages);
	}

	@Override
	public void clearCache(
		List<ExplosiveApplicationStages> explosiveApplicationStageses) {

		for (ExplosiveApplicationStages explosiveApplicationStages :
				explosiveApplicationStageses) {

			entityCache.removeResult(
				ExplosiveApplicationStagesImpl.class,
				explosiveApplicationStages);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ExplosiveApplicationStagesImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				ExplosiveApplicationStagesImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		ExplosiveApplicationStagesModelImpl
			explosiveApplicationStagesModelImpl) {

		Object[] args = new Object[] {
			explosiveApplicationStagesModelImpl.getUuid(),
			explosiveApplicationStagesModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args,
			explosiveApplicationStagesModelImpl);

		args = new Object[] {
			explosiveApplicationStagesModelImpl.getExplosiveApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetEXP_CAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetEXP_CAI, args,
			explosiveApplicationStagesModelImpl);

		args = new Object[] {
			explosiveApplicationStagesModelImpl.getCaseId(),
			explosiveApplicationStagesModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetEXP_CaseIdStageName, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetEXP_CaseIdStageName, args,
			explosiveApplicationStagesModelImpl);

		args = new Object[] {
			explosiveApplicationStagesModelImpl.getCaseId(),
			explosiveApplicationStagesModelImpl.getStageName(),
			explosiveApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetEXP_CaseIdStageStatus, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetEXP_CaseIdStageStatus, args,
			explosiveApplicationStagesModelImpl);

		args = new Object[] {
			explosiveApplicationStagesModelImpl.getCaseId(),
			explosiveApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetEXP_CaseIdAndStatus, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetEXP_CaseIdAndStatus, args,
			explosiveApplicationStagesModelImpl);

		args = new Object[] {explosiveApplicationStagesModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetEXP_By_CaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetEXP_By_CaseId, args,
			explosiveApplicationStagesModelImpl);
	}

	/**
	 * Creates a new explosive application stages with the primary key. Does not add the explosive application stages to the database.
	 *
	 * @param expApplicationStagesId the primary key for the new explosive application stages
	 * @return the new explosive application stages
	 */
	@Override
	public ExplosiveApplicationStages create(long expApplicationStagesId) {
		ExplosiveApplicationStages explosiveApplicationStages =
			new ExplosiveApplicationStagesImpl();

		explosiveApplicationStages.setNew(true);
		explosiveApplicationStages.setPrimaryKey(expApplicationStagesId);

		String uuid = PortalUUIDUtil.generate();

		explosiveApplicationStages.setUuid(uuid);

		explosiveApplicationStages.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return explosiveApplicationStages;
	}

	/**
	 * Removes the explosive application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param expApplicationStagesId the primary key of the explosive application stages
	 * @return the explosive application stages that was removed
	 * @throws NoSuchExplosiveApplicationStagesException if a explosive application stages with the primary key could not be found
	 */
	@Override
	public ExplosiveApplicationStages remove(long expApplicationStagesId)
		throws NoSuchExplosiveApplicationStagesException {

		return remove((Serializable)expApplicationStagesId);
	}

	/**
	 * Removes the explosive application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the explosive application stages
	 * @return the explosive application stages that was removed
	 * @throws NoSuchExplosiveApplicationStagesException if a explosive application stages with the primary key could not be found
	 */
	@Override
	public ExplosiveApplicationStages remove(Serializable primaryKey)
		throws NoSuchExplosiveApplicationStagesException {

		Session session = null;

		try {
			session = openSession();

			ExplosiveApplicationStages explosiveApplicationStages =
				(ExplosiveApplicationStages)session.get(
					ExplosiveApplicationStagesImpl.class, primaryKey);

			if (explosiveApplicationStages == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchExplosiveApplicationStagesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(explosiveApplicationStages);
		}
		catch (NoSuchExplosiveApplicationStagesException
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
	protected ExplosiveApplicationStages removeImpl(
		ExplosiveApplicationStages explosiveApplicationStages) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(explosiveApplicationStages)) {
				explosiveApplicationStages =
					(ExplosiveApplicationStages)session.get(
						ExplosiveApplicationStagesImpl.class,
						explosiveApplicationStages.getPrimaryKeyObj());
			}

			if (explosiveApplicationStages != null) {
				session.delete(explosiveApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (explosiveApplicationStages != null) {
			clearCache(explosiveApplicationStages);
		}

		return explosiveApplicationStages;
	}

	@Override
	public ExplosiveApplicationStages updateImpl(
		ExplosiveApplicationStages explosiveApplicationStages) {

		boolean isNew = explosiveApplicationStages.isNew();

		if (!(explosiveApplicationStages instanceof
				ExplosiveApplicationStagesModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(explosiveApplicationStages.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					explosiveApplicationStages);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in explosiveApplicationStages proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ExplosiveApplicationStages implementation " +
					explosiveApplicationStages.getClass());
		}

		ExplosiveApplicationStagesModelImpl
			explosiveApplicationStagesModelImpl =
				(ExplosiveApplicationStagesModelImpl)explosiveApplicationStages;

		if (Validator.isNull(explosiveApplicationStages.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			explosiveApplicationStages.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (explosiveApplicationStages.getCreateDate() == null)) {
			if (serviceContext == null) {
				explosiveApplicationStages.setCreateDate(date);
			}
			else {
				explosiveApplicationStages.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!explosiveApplicationStagesModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				explosiveApplicationStages.setModifiedDate(date);
			}
			else {
				explosiveApplicationStages.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(explosiveApplicationStages);
			}
			else {
				explosiveApplicationStages =
					(ExplosiveApplicationStages)session.merge(
						explosiveApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ExplosiveApplicationStagesImpl.class,
			explosiveApplicationStagesModelImpl, false, true);

		cacheUniqueFindersCache(explosiveApplicationStagesModelImpl);

		if (isNew) {
			explosiveApplicationStages.setNew(false);
		}

		explosiveApplicationStages.resetOriginalValues();

		return explosiveApplicationStages;
	}

	/**
	 * Returns the explosive application stages with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the explosive application stages
	 * @return the explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a explosive application stages with the primary key could not be found
	 */
	@Override
	public ExplosiveApplicationStages findByPrimaryKey(Serializable primaryKey)
		throws NoSuchExplosiveApplicationStagesException {

		ExplosiveApplicationStages explosiveApplicationStages =
			fetchByPrimaryKey(primaryKey);

		if (explosiveApplicationStages == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchExplosiveApplicationStagesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return explosiveApplicationStages;
	}

	/**
	 * Returns the explosive application stages with the primary key or throws a <code>NoSuchExplosiveApplicationStagesException</code> if it could not be found.
	 *
	 * @param expApplicationStagesId the primary key of the explosive application stages
	 * @return the explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a explosive application stages with the primary key could not be found
	 */
	@Override
	public ExplosiveApplicationStages findByPrimaryKey(
			long expApplicationStagesId)
		throws NoSuchExplosiveApplicationStagesException {

		return findByPrimaryKey((Serializable)expApplicationStagesId);
	}

	/**
	 * Returns the explosive application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param expApplicationStagesId the primary key of the explosive application stages
	 * @return the explosive application stages, or <code>null</code> if a explosive application stages with the primary key could not be found
	 */
	@Override
	public ExplosiveApplicationStages fetchByPrimaryKey(
		long expApplicationStagesId) {

		return fetchByPrimaryKey((Serializable)expApplicationStagesId);
	}

	/**
	 * Returns all the explosive application stageses.
	 *
	 * @return the explosive application stageses
	 */
	@Override
	public List<ExplosiveApplicationStages> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the explosive application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @return the range of explosive application stageses
	 */
	@Override
	public List<ExplosiveApplicationStages> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the explosive application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of explosive application stageses
	 */
	@Override
	public List<ExplosiveApplicationStages> findAll(
		int start, int end,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the explosive application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of explosive application stageses
	 */
	@Override
	public List<ExplosiveApplicationStages> findAll(
		int start, int end,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator,
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

		List<ExplosiveApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<ExplosiveApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_EXPLOSIVEAPPLICATIONSTAGES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_EXPLOSIVEAPPLICATIONSTAGES;

				sql = sql.concat(
					ExplosiveApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ExplosiveApplicationStages>)QueryUtil.list(
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
	 * Removes all the explosive application stageses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ExplosiveApplicationStages explosiveApplicationStages :
				findAll()) {

			remove(explosiveApplicationStages);
		}
	}

	/**
	 * Returns the number of explosive application stageses.
	 *
	 * @return the number of explosive application stageses
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
					_SQL_COUNT_EXPLOSIVEAPPLICATIONSTAGES);

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
		return "expApplicationStagesId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_EXPLOSIVEAPPLICATIONSTAGES;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ExplosiveApplicationStagesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the explosive application stages persistence.
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

		_finderPathFetchBygetEXP_CAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetEXP_CAI",
			new String[] {Long.class.getName()},
			new String[] {"explosiveApplicationId"}, true);

		_finderPathCountBygetEXP_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetEXP_CAI",
			new String[] {Long.class.getName()},
			new String[] {"explosiveApplicationId"}, false);

		_finderPathFetchBygetEXP_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetEXP_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, true);

		_finderPathCountBygetEXP_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetEXP_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, false);

		_finderPathWithPaginationFindBygetEXP_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetEXP_StageName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"stageName"}, true);

		_finderPathWithoutPaginationFindBygetEXP_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetEXP_StageName",
			new String[] {String.class.getName()}, new String[] {"stageName"},
			true);

		_finderPathCountBygetEXP_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetEXP_StageName", new String[] {String.class.getName()},
			new String[] {"stageName"}, false);

		_finderPathFetchBygetEXP_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetEXP_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageName", "stageStatus"}, true);

		_finderPathCountBygetEXP_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetEXP_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageName", "stageStatus"}, false);

		_finderPathFetchBygetEXP_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetEXP_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, true);

		_finderPathCountBygetEXP_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetEXP_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, false);

		_finderPathWithPaginationFindBygetEXP_SNAndSS = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetEXP_SNAndSS",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"stageName", "stageStatus"}, true);

		_finderPathWithoutPaginationFindBygetEXP_SNAndSS = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetEXP_SNAndSS",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"stageName", "stageStatus"}, true);

		_finderPathCountBygetEXP_SNAndSS = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetEXP_SNAndSS",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"stageName", "stageStatus"}, false);

		_finderPathWithPaginationFindBygetEXP_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetEXP_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetEXP_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetEXP_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetEXP_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetEXP_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathFetchBygetEXP_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetEXP_By_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetEXP_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetEXP_By_CaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		ExplosiveApplicationStagesUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		ExplosiveApplicationStagesUtil.setPersistence(null);

		entityCache.removeCache(ExplosiveApplicationStagesImpl.class.getName());
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

	private static final String _SQL_SELECT_EXPLOSIVEAPPLICATIONSTAGES =
		"SELECT explosiveApplicationStages FROM ExplosiveApplicationStages explosiveApplicationStages";

	private static final String _SQL_SELECT_EXPLOSIVEAPPLICATIONSTAGES_WHERE =
		"SELECT explosiveApplicationStages FROM ExplosiveApplicationStages explosiveApplicationStages WHERE ";

	private static final String _SQL_COUNT_EXPLOSIVEAPPLICATIONSTAGES =
		"SELECT COUNT(explosiveApplicationStages) FROM ExplosiveApplicationStages explosiveApplicationStages";

	private static final String _SQL_COUNT_EXPLOSIVEAPPLICATIONSTAGES_WHERE =
		"SELECT COUNT(explosiveApplicationStages) FROM ExplosiveApplicationStages explosiveApplicationStages WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"explosiveApplicationStages.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ExplosiveApplicationStages exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ExplosiveApplicationStages exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ExplosiveApplicationStagesPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}