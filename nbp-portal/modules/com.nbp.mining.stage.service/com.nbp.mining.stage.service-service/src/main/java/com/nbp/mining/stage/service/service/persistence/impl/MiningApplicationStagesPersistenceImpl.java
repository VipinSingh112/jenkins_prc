/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.service.persistence.impl;

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

import com.nbp.mining.stage.service.exception.NoSuchMiningApplicationStagesException;
import com.nbp.mining.stage.service.model.MiningApplicationStages;
import com.nbp.mining.stage.service.model.MiningApplicationStagesTable;
import com.nbp.mining.stage.service.model.impl.MiningApplicationStagesImpl;
import com.nbp.mining.stage.service.model.impl.MiningApplicationStagesModelImpl;
import com.nbp.mining.stage.service.service.persistence.MiningApplicationStagesPersistence;
import com.nbp.mining.stage.service.service.persistence.MiningApplicationStagesUtil;
import com.nbp.mining.stage.service.service.persistence.impl.constants.MINING_STAGESPersistenceConstants;

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
 * The persistence implementation for the mining application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MiningApplicationStagesPersistence.class)
public class MiningApplicationStagesPersistenceImpl
	extends BasePersistenceImpl<MiningApplicationStages>
	implements MiningApplicationStagesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MiningApplicationStagesUtil</code> to access the mining application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MiningApplicationStagesImpl.class.getName();

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
	 * Returns all the mining application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching mining application stageses
	 */
	@Override
	public List<MiningApplicationStages> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mining application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @return the range of matching mining application stageses
	 */
	@Override
	public List<MiningApplicationStages> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mining application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application stageses
	 */
	@Override
	public List<MiningApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MiningApplicationStages> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the mining application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application stageses
	 */
	@Override
	public List<MiningApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MiningApplicationStages> orderByComparator,
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

		List<MiningApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<MiningApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MiningApplicationStages miningApplicationStages : list) {
					if (!uuid.equals(miningApplicationStages.getUuid())) {
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

			sb.append(_SQL_SELECT_MININGAPPLICATIONSTAGES_WHERE);

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
				sb.append(MiningApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<MiningApplicationStages>)QueryUtil.list(
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
	 * Returns the first mining application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	@Override
	public MiningApplicationStages findByUuid_First(
			String uuid,
			OrderByComparator<MiningApplicationStages> orderByComparator)
		throws NoSuchMiningApplicationStagesException {

		MiningApplicationStages miningApplicationStages = fetchByUuid_First(
			uuid, orderByComparator);

		if (miningApplicationStages != null) {
			return miningApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMiningApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first mining application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	@Override
	public MiningApplicationStages fetchByUuid_First(
		String uuid,
		OrderByComparator<MiningApplicationStages> orderByComparator) {

		List<MiningApplicationStages> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mining application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	@Override
	public MiningApplicationStages findByUuid_Last(
			String uuid,
			OrderByComparator<MiningApplicationStages> orderByComparator)
		throws NoSuchMiningApplicationStagesException {

		MiningApplicationStages miningApplicationStages = fetchByUuid_Last(
			uuid, orderByComparator);

		if (miningApplicationStages != null) {
			return miningApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMiningApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last mining application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	@Override
	public MiningApplicationStages fetchByUuid_Last(
		String uuid,
		OrderByComparator<MiningApplicationStages> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<MiningApplicationStages> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mining application stageses before and after the current mining application stages in the ordered set where uuid = &#63;.
	 *
	 * @param miningStagesId the primary key of the current mining application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a mining application stages with the primary key could not be found
	 */
	@Override
	public MiningApplicationStages[] findByUuid_PrevAndNext(
			long miningStagesId, String uuid,
			OrderByComparator<MiningApplicationStages> orderByComparator)
		throws NoSuchMiningApplicationStagesException {

		uuid = Objects.toString(uuid, "");

		MiningApplicationStages miningApplicationStages = findByPrimaryKey(
			miningStagesId);

		Session session = null;

		try {
			session = openSession();

			MiningApplicationStages[] array =
				new MiningApplicationStagesImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, miningApplicationStages, uuid, orderByComparator,
				true);

			array[1] = miningApplicationStages;

			array[2] = getByUuid_PrevAndNext(
				session, miningApplicationStages, uuid, orderByComparator,
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

	protected MiningApplicationStages getByUuid_PrevAndNext(
		Session session, MiningApplicationStages miningApplicationStages,
		String uuid,
		OrderByComparator<MiningApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_MININGAPPLICATIONSTAGES_WHERE);

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
			sb.append(MiningApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						miningApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MiningApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mining application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (MiningApplicationStages miningApplicationStages :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(miningApplicationStages);
		}
	}

	/**
	 * Returns the number of mining application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching mining application stageses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MININGAPPLICATIONSTAGES_WHERE);

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
		"miningApplicationStages.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(miningApplicationStages.uuid IS NULL OR miningApplicationStages.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the mining application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMiningApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	@Override
	public MiningApplicationStages findByUUID_G(String uuid, long groupId)
		throws NoSuchMiningApplicationStagesException {

		MiningApplicationStages miningApplicationStages = fetchByUUID_G(
			uuid, groupId);

		if (miningApplicationStages == null) {
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

			throw new NoSuchMiningApplicationStagesException(sb.toString());
		}

		return miningApplicationStages;
	}

	/**
	 * Returns the mining application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	@Override
	public MiningApplicationStages fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the mining application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	@Override
	public MiningApplicationStages fetchByUUID_G(
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

		if (result instanceof MiningApplicationStages) {
			MiningApplicationStages miningApplicationStages =
				(MiningApplicationStages)result;

			if (!Objects.equals(uuid, miningApplicationStages.getUuid()) ||
				(groupId != miningApplicationStages.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_MININGAPPLICATIONSTAGES_WHERE);

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

				List<MiningApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					MiningApplicationStages miningApplicationStages = list.get(
						0);

					result = miningApplicationStages;

					cacheResult(miningApplicationStages);
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
			return (MiningApplicationStages)result;
		}
	}

	/**
	 * Removes the mining application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the mining application stages that was removed
	 */
	@Override
	public MiningApplicationStages removeByUUID_G(String uuid, long groupId)
		throws NoSuchMiningApplicationStagesException {

		MiningApplicationStages miningApplicationStages = findByUUID_G(
			uuid, groupId);

		return remove(miningApplicationStages);
	}

	/**
	 * Returns the number of mining application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching mining application stageses
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MININGAPPLICATIONSTAGES_WHERE);

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
		"miningApplicationStages.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(miningApplicationStages.uuid IS NULL OR miningApplicationStages.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"miningApplicationStages.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the mining application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching mining application stageses
	 */
	@Override
	public List<MiningApplicationStages> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mining application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @return the range of matching mining application stageses
	 */
	@Override
	public List<MiningApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mining application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application stageses
	 */
	@Override
	public List<MiningApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MiningApplicationStages> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the mining application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application stageses
	 */
	@Override
	public List<MiningApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MiningApplicationStages> orderByComparator,
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

		List<MiningApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<MiningApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MiningApplicationStages miningApplicationStages : list) {
					if (!uuid.equals(miningApplicationStages.getUuid()) ||
						(companyId != miningApplicationStages.getCompanyId())) {

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

			sb.append(_SQL_SELECT_MININGAPPLICATIONSTAGES_WHERE);

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
				sb.append(MiningApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<MiningApplicationStages>)QueryUtil.list(
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
	 * Returns the first mining application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	@Override
	public MiningApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MiningApplicationStages> orderByComparator)
		throws NoSuchMiningApplicationStagesException {

		MiningApplicationStages miningApplicationStages = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (miningApplicationStages != null) {
			return miningApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMiningApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first mining application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	@Override
	public MiningApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MiningApplicationStages> orderByComparator) {

		List<MiningApplicationStages> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mining application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	@Override
	public MiningApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MiningApplicationStages> orderByComparator)
		throws NoSuchMiningApplicationStagesException {

		MiningApplicationStages miningApplicationStages = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (miningApplicationStages != null) {
			return miningApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMiningApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last mining application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	@Override
	public MiningApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MiningApplicationStages> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<MiningApplicationStages> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mining application stageses before and after the current mining application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param miningStagesId the primary key of the current mining application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a mining application stages with the primary key could not be found
	 */
	@Override
	public MiningApplicationStages[] findByUuid_C_PrevAndNext(
			long miningStagesId, String uuid, long companyId,
			OrderByComparator<MiningApplicationStages> orderByComparator)
		throws NoSuchMiningApplicationStagesException {

		uuid = Objects.toString(uuid, "");

		MiningApplicationStages miningApplicationStages = findByPrimaryKey(
			miningStagesId);

		Session session = null;

		try {
			session = openSession();

			MiningApplicationStages[] array =
				new MiningApplicationStagesImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, miningApplicationStages, uuid, companyId,
				orderByComparator, true);

			array[1] = miningApplicationStages;

			array[2] = getByUuid_C_PrevAndNext(
				session, miningApplicationStages, uuid, companyId,
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

	protected MiningApplicationStages getByUuid_C_PrevAndNext(
		Session session, MiningApplicationStages miningApplicationStages,
		String uuid, long companyId,
		OrderByComparator<MiningApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_MININGAPPLICATIONSTAGES_WHERE);

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
			sb.append(MiningApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						miningApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MiningApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mining application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (MiningApplicationStages miningApplicationStages :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(miningApplicationStages);
		}
	}

	/**
	 * Returns the number of mining application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching mining application stageses
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MININGAPPLICATIONSTAGES_WHERE);

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
		"miningApplicationStages.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(miningApplicationStages.uuid IS NULL OR miningApplicationStages.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"miningApplicationStages.companyId = ?";

	private FinderPath _finderPathFetchBygetMining_By_AI;
	private FinderPath _finderPathCountBygetMining_By_AI;

	/**
	 * Returns the mining application stages where miningApplicationId = &#63; or throws a <code>NoSuchMiningApplicationStagesException</code> if it could not be found.
	 *
	 * @param miningApplicationId the mining application ID
	 * @return the matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	@Override
	public MiningApplicationStages findBygetMining_By_AI(
			long miningApplicationId)
		throws NoSuchMiningApplicationStagesException {

		MiningApplicationStages miningApplicationStages =
			fetchBygetMining_By_AI(miningApplicationId);

		if (miningApplicationStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("miningApplicationId=");
			sb.append(miningApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMiningApplicationStagesException(sb.toString());
		}

		return miningApplicationStages;
	}

	/**
	 * Returns the mining application stages where miningApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miningApplicationId the mining application ID
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	@Override
	public MiningApplicationStages fetchBygetMining_By_AI(
		long miningApplicationId) {

		return fetchBygetMining_By_AI(miningApplicationId, true);
	}

	/**
	 * Returns the mining application stages where miningApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miningApplicationId the mining application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	@Override
	public MiningApplicationStages fetchBygetMining_By_AI(
		long miningApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {miningApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMining_By_AI, finderArgs, this);
		}

		if (result instanceof MiningApplicationStages) {
			MiningApplicationStages miningApplicationStages =
				(MiningApplicationStages)result;

			if (miningApplicationId !=
					miningApplicationStages.getMiningApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MININGAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETMINING_BY_AI_MININGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(miningApplicationId);

				List<MiningApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMining_By_AI, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {miningApplicationId};
							}

							_log.warn(
								"MiningApplicationStagesPersistenceImpl.fetchBygetMining_By_AI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MiningApplicationStages miningApplicationStages = list.get(
						0);

					result = miningApplicationStages;

					cacheResult(miningApplicationStages);
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
			return (MiningApplicationStages)result;
		}
	}

	/**
	 * Removes the mining application stages where miningApplicationId = &#63; from the database.
	 *
	 * @param miningApplicationId the mining application ID
	 * @return the mining application stages that was removed
	 */
	@Override
	public MiningApplicationStages removeBygetMining_By_AI(
			long miningApplicationId)
		throws NoSuchMiningApplicationStagesException {

		MiningApplicationStages miningApplicationStages = findBygetMining_By_AI(
			miningApplicationId);

		return remove(miningApplicationStages);
	}

	/**
	 * Returns the number of mining application stageses where miningApplicationId = &#63;.
	 *
	 * @param miningApplicationId the mining application ID
	 * @return the number of matching mining application stageses
	 */
	@Override
	public int countBygetMining_By_AI(long miningApplicationId) {
		FinderPath finderPath = _finderPathCountBygetMining_By_AI;

		Object[] finderArgs = new Object[] {miningApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MININGAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETMINING_BY_AI_MININGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(miningApplicationId);

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
		_FINDER_COLUMN_GETMINING_BY_AI_MININGAPPLICATIONID_2 =
			"miningApplicationStages.miningApplicationId = ?";

	private FinderPath _finderPathFetchBygetMining_By_CaseIdStageName;
	private FinderPath _finderPathCountBygetMining_By_CaseIdStageName;

	/**
	 * Returns the mining application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchMiningApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	@Override
	public MiningApplicationStages findBygetMining_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchMiningApplicationStagesException {

		MiningApplicationStages miningApplicationStages =
			fetchBygetMining_By_CaseIdStageName(caseId, stageName);

		if (miningApplicationStages == null) {
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

			throw new NoSuchMiningApplicationStagesException(sb.toString());
		}

		return miningApplicationStages;
	}

	/**
	 * Returns the mining application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	@Override
	public MiningApplicationStages fetchBygetMining_By_CaseIdStageName(
		String caseId, String stageName) {

		return fetchBygetMining_By_CaseIdStageName(caseId, stageName, true);
	}

	/**
	 * Returns the mining application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	@Override
	public MiningApplicationStages fetchBygetMining_By_CaseIdStageName(
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
				_finderPathFetchBygetMining_By_CaseIdStageName, finderArgs,
				this);
		}

		if (result instanceof MiningApplicationStages) {
			MiningApplicationStages miningApplicationStages =
				(MiningApplicationStages)result;

			if (!Objects.equals(caseId, miningApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, miningApplicationStages.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_MININGAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMINING_BY_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMINING_BY_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMINING_BY_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETMINING_BY_CASEIDSTAGENAME_STAGENAME_2);
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

				List<MiningApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMining_By_CaseIdStageName,
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
								"MiningApplicationStagesPersistenceImpl.fetchBygetMining_By_CaseIdStageName(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MiningApplicationStages miningApplicationStages = list.get(
						0);

					result = miningApplicationStages;

					cacheResult(miningApplicationStages);
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
			return (MiningApplicationStages)result;
		}
	}

	/**
	 * Removes the mining application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the mining application stages that was removed
	 */
	@Override
	public MiningApplicationStages removeBygetMining_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchMiningApplicationStagesException {

		MiningApplicationStages miningApplicationStages =
			findBygetMining_By_CaseIdStageName(caseId, stageName);

		return remove(miningApplicationStages);
	}

	/**
	 * Returns the number of mining application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching mining application stageses
	 */
	@Override
	public int countBygetMining_By_CaseIdStageName(
		String caseId, String stageName) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetMining_By_CaseIdStageName;

		Object[] finderArgs = new Object[] {caseId, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MININGAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMINING_BY_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMINING_BY_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMINING_BY_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETMINING_BY_CASEIDSTAGENAME_STAGENAME_2);
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

	private static final String
		_FINDER_COLUMN_GETMINING_BY_CASEIDSTAGENAME_CASEID_2 =
			"miningApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETMINING_BY_CASEIDSTAGENAME_CASEID_3 =
			"(miningApplicationStages.caseId IS NULL OR miningApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETMINING_BY_CASEIDSTAGENAME_STAGENAME_2 =
			"miningApplicationStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETMINING_BY_CASEIDSTAGENAME_STAGENAME_3 =
			"(miningApplicationStages.stageName IS NULL OR miningApplicationStages.stageName = '')";

	private FinderPath _finderPathFetchBygetMining_By_CaseIdStageStatus;
	private FinderPath _finderPathCountBygetMining_By_CaseIdStageStatus;

	/**
	 * Returns the mining application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchMiningApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	@Override
	public MiningApplicationStages findBygetMining_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchMiningApplicationStagesException {

		MiningApplicationStages miningApplicationStages =
			fetchBygetMining_By_CaseIdStageStatus(
				caseId, stageStatus, stageName);

		if (miningApplicationStages == null) {
			StringBundler sb = new StringBundler(8);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append(", stageStatus=");
			sb.append(stageStatus);

			sb.append(", stageName=");
			sb.append(stageName);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMiningApplicationStagesException(sb.toString());
		}

		return miningApplicationStages;
	}

	/**
	 * Returns the mining application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	@Override
	public MiningApplicationStages fetchBygetMining_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		return fetchBygetMining_By_CaseIdStageStatus(
			caseId, stageStatus, stageName, true);
	}

	/**
	 * Returns the mining application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	@Override
	public MiningApplicationStages fetchBygetMining_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");
		stageName = Objects.toString(stageName, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId, stageStatus, stageName};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMining_By_CaseIdStageStatus, finderArgs,
				this);
		}

		if (result instanceof MiningApplicationStages) {
			MiningApplicationStages miningApplicationStages =
				(MiningApplicationStages)result;

			if (!Objects.equals(caseId, miningApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageStatus, miningApplicationStages.getStageStatus()) ||
				!Objects.equals(
					stageName, miningApplicationStages.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_MININGAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMINING_BY_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETMINING_BY_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMINING_BY_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETMINING_BY_CASEIDSTAGESTATUS_STAGESTATUS_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMINING_BY_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETMINING_BY_CASEIDSTAGESTATUS_STAGENAME_2);
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

				if (bindStageName) {
					queryPos.add(stageName);
				}

				List<MiningApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMining_By_CaseIdStageStatus,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									caseId, stageStatus, stageName
								};
							}

							_log.warn(
								"MiningApplicationStagesPersistenceImpl.fetchBygetMining_By_CaseIdStageStatus(String, String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MiningApplicationStages miningApplicationStages = list.get(
						0);

					result = miningApplicationStages;

					cacheResult(miningApplicationStages);
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
			return (MiningApplicationStages)result;
		}
	}

	/**
	 * Removes the mining application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the mining application stages that was removed
	 */
	@Override
	public MiningApplicationStages removeBygetMining_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchMiningApplicationStagesException {

		MiningApplicationStages miningApplicationStages =
			findBygetMining_By_CaseIdStageStatus(
				caseId, stageStatus, stageName);

		return remove(miningApplicationStages);
	}

	/**
	 * Returns the number of mining application stageses where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching mining application stageses
	 */
	@Override
	public int countBygetMining_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath =
			_finderPathCountBygetMining_By_CaseIdStageStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_MININGAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMINING_BY_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETMINING_BY_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMINING_BY_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETMINING_BY_CASEIDSTAGESTATUS_STAGESTATUS_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMINING_BY_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETMINING_BY_CASEIDSTAGESTATUS_STAGENAME_2);
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

	private static final String
		_FINDER_COLUMN_GETMINING_BY_CASEIDSTAGESTATUS_CASEID_2 =
			"miningApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETMINING_BY_CASEIDSTAGESTATUS_CASEID_3 =
			"(miningApplicationStages.caseId IS NULL OR miningApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETMINING_BY_CASEIDSTAGESTATUS_STAGESTATUS_2 =
			"miningApplicationStages.stageStatus = ? AND ";

	private static final String
		_FINDER_COLUMN_GETMINING_BY_CASEIDSTAGESTATUS_STAGESTATUS_3 =
			"(miningApplicationStages.stageStatus IS NULL OR miningApplicationStages.stageStatus = '') AND ";

	private static final String
		_FINDER_COLUMN_GETMINING_BY_CASEIDSTAGESTATUS_STAGENAME_2 =
			"miningApplicationStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETMINING_BY_CASEIDSTAGESTATUS_STAGENAME_3 =
			"(miningApplicationStages.stageName IS NULL OR miningApplicationStages.stageName = '')";

	private FinderPath _finderPathFetchBygetMining_By_CaseIdAndStatus;
	private FinderPath _finderPathCountBygetMining_By_CaseIdAndStatus;

	/**
	 * Returns the mining application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchMiningApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	@Override
	public MiningApplicationStages findBygetMining_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchMiningApplicationStagesException {

		MiningApplicationStages miningApplicationStages =
			fetchBygetMining_By_CaseIdAndStatus(caseId, stageStatus);

		if (miningApplicationStages == null) {
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

			throw new NoSuchMiningApplicationStagesException(sb.toString());
		}

		return miningApplicationStages;
	}

	/**
	 * Returns the mining application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	@Override
	public MiningApplicationStages fetchBygetMining_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return fetchBygetMining_By_CaseIdAndStatus(caseId, stageStatus, true);
	}

	/**
	 * Returns the mining application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	@Override
	public MiningApplicationStages fetchBygetMining_By_CaseIdAndStatus(
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
				_finderPathFetchBygetMining_By_CaseIdAndStatus, finderArgs,
				this);
		}

		if (result instanceof MiningApplicationStages) {
			MiningApplicationStages miningApplicationStages =
				(MiningApplicationStages)result;

			if (!Objects.equals(caseId, miningApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageStatus, miningApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_MININGAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMINING_BY_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMINING_BY_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMINING_BY_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETMINING_BY_CASEIDANDSTATUS_STAGESTATUS_2);
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

				List<MiningApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMining_By_CaseIdAndStatus,
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
								"MiningApplicationStagesPersistenceImpl.fetchBygetMining_By_CaseIdAndStatus(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MiningApplicationStages miningApplicationStages = list.get(
						0);

					result = miningApplicationStages;

					cacheResult(miningApplicationStages);
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
			return (MiningApplicationStages)result;
		}
	}

	/**
	 * Removes the mining application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the mining application stages that was removed
	 */
	@Override
	public MiningApplicationStages removeBygetMining_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchMiningApplicationStagesException {

		MiningApplicationStages miningApplicationStages =
			findBygetMining_By_CaseIdAndStatus(caseId, stageStatus);

		return remove(miningApplicationStages);
	}

	/**
	 * Returns the number of mining application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching mining application stageses
	 */
	@Override
	public int countBygetMining_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetMining_By_CaseIdAndStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MININGAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMINING_BY_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMINING_BY_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMINING_BY_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETMINING_BY_CASEIDANDSTATUS_STAGESTATUS_2);
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

	private static final String
		_FINDER_COLUMN_GETMINING_BY_CASEIDANDSTATUS_CASEID_2 =
			"miningApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETMINING_BY_CASEIDANDSTATUS_CASEID_3 =
			"(miningApplicationStages.caseId IS NULL OR miningApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETMINING_BY_CASEIDANDSTATUS_STAGESTATUS_2 =
			"miningApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETMINING_BY_CASEIDANDSTATUS_STAGESTATUS_3 =
			"(miningApplicationStages.stageStatus IS NULL OR miningApplicationStages.stageStatus = '')";

	private FinderPath _finderPathWithPaginationFindBygetMining_By_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetMining_By_CaseId;
	private FinderPath _finderPathCountBygetMining_By_CaseId;

	/**
	 * Returns all the mining application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching mining application stageses
	 */
	@Override
	public List<MiningApplicationStages> findBygetMining_By_CaseId(
		String caseId) {

		return findBygetMining_By_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mining application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @return the range of matching mining application stageses
	 */
	@Override
	public List<MiningApplicationStages> findBygetMining_By_CaseId(
		String caseId, int start, int end) {

		return findBygetMining_By_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mining application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application stageses
	 */
	@Override
	public List<MiningApplicationStages> findBygetMining_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<MiningApplicationStages> orderByComparator) {

		return findBygetMining_By_CaseId(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the mining application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application stageses
	 */
	@Override
	public List<MiningApplicationStages> findBygetMining_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<MiningApplicationStages> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetMining_By_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMining_By_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<MiningApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<MiningApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MiningApplicationStages miningApplicationStages : list) {
					if (!caseId.equals(miningApplicationStages.getCaseId())) {
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

			sb.append(_SQL_SELECT_MININGAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMINING_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMINING_BY_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MiningApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<MiningApplicationStages>)QueryUtil.list(
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
	 * Returns the first mining application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	@Override
	public MiningApplicationStages findBygetMining_By_CaseId_First(
			String caseId,
			OrderByComparator<MiningApplicationStages> orderByComparator)
		throws NoSuchMiningApplicationStagesException {

		MiningApplicationStages miningApplicationStages =
			fetchBygetMining_By_CaseId_First(caseId, orderByComparator);

		if (miningApplicationStages != null) {
			return miningApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchMiningApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first mining application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	@Override
	public MiningApplicationStages fetchBygetMining_By_CaseId_First(
		String caseId,
		OrderByComparator<MiningApplicationStages> orderByComparator) {

		List<MiningApplicationStages> list = findBygetMining_By_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mining application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	@Override
	public MiningApplicationStages findBygetMining_By_CaseId_Last(
			String caseId,
			OrderByComparator<MiningApplicationStages> orderByComparator)
		throws NoSuchMiningApplicationStagesException {

		MiningApplicationStages miningApplicationStages =
			fetchBygetMining_By_CaseId_Last(caseId, orderByComparator);

		if (miningApplicationStages != null) {
			return miningApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchMiningApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last mining application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	@Override
	public MiningApplicationStages fetchBygetMining_By_CaseId_Last(
		String caseId,
		OrderByComparator<MiningApplicationStages> orderByComparator) {

		int count = countBygetMining_By_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<MiningApplicationStages> list = findBygetMining_By_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mining application stageses before and after the current mining application stages in the ordered set where caseId = &#63;.
	 *
	 * @param miningStagesId the primary key of the current mining application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a mining application stages with the primary key could not be found
	 */
	@Override
	public MiningApplicationStages[] findBygetMining_By_CaseId_PrevAndNext(
			long miningStagesId, String caseId,
			OrderByComparator<MiningApplicationStages> orderByComparator)
		throws NoSuchMiningApplicationStagesException {

		caseId = Objects.toString(caseId, "");

		MiningApplicationStages miningApplicationStages = findByPrimaryKey(
			miningStagesId);

		Session session = null;

		try {
			session = openSession();

			MiningApplicationStages[] array =
				new MiningApplicationStagesImpl[3];

			array[0] = getBygetMining_By_CaseId_PrevAndNext(
				session, miningApplicationStages, caseId, orderByComparator,
				true);

			array[1] = miningApplicationStages;

			array[2] = getBygetMining_By_CaseId_PrevAndNext(
				session, miningApplicationStages, caseId, orderByComparator,
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

	protected MiningApplicationStages getBygetMining_By_CaseId_PrevAndNext(
		Session session, MiningApplicationStages miningApplicationStages,
		String caseId,
		OrderByComparator<MiningApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_MININGAPPLICATIONSTAGES_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETMINING_BY_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETMINING_BY_CASEID_CASEID_2);
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
			sb.append(MiningApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						miningApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MiningApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mining application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetMining_By_CaseId(String caseId) {
		for (MiningApplicationStages miningApplicationStages :
				findBygetMining_By_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(miningApplicationStages);
		}
	}

	/**
	 * Returns the number of mining application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching mining application stageses
	 */
	@Override
	public int countBygetMining_By_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetMining_By_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MININGAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMINING_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMINING_BY_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETMINING_BY_CASEID_CASEID_2 =
		"miningApplicationStages.caseId = ?";

	private static final String _FINDER_COLUMN_GETMINING_BY_CASEID_CASEID_3 =
		"(miningApplicationStages.caseId IS NULL OR miningApplicationStages.caseId = '')";

	private FinderPath _finderPathFetchBygetMiningBy_Case_Id;
	private FinderPath _finderPathCountBygetMiningBy_Case_Id;

	/**
	 * Returns the mining application stages where caseId = &#63; or throws a <code>NoSuchMiningApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	@Override
	public MiningApplicationStages findBygetMiningBy_Case_Id(String caseId)
		throws NoSuchMiningApplicationStagesException {

		MiningApplicationStages miningApplicationStages =
			fetchBygetMiningBy_Case_Id(caseId);

		if (miningApplicationStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMiningApplicationStagesException(sb.toString());
		}

		return miningApplicationStages;
	}

	/**
	 * Returns the mining application stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	@Override
	public MiningApplicationStages fetchBygetMiningBy_Case_Id(String caseId) {
		return fetchBygetMiningBy_Case_Id(caseId, true);
	}

	/**
	 * Returns the mining application stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	@Override
	public MiningApplicationStages fetchBygetMiningBy_Case_Id(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMiningBy_Case_Id, finderArgs, this);
		}

		if (result instanceof MiningApplicationStages) {
			MiningApplicationStages miningApplicationStages =
				(MiningApplicationStages)result;

			if (!Objects.equals(caseId, miningApplicationStages.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MININGAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMININGBY_CASE_ID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMININGBY_CASE_ID_CASEID_2);
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

				List<MiningApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMiningBy_Case_Id, finderArgs,
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
								"MiningApplicationStagesPersistenceImpl.fetchBygetMiningBy_Case_Id(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MiningApplicationStages miningApplicationStages = list.get(
						0);

					result = miningApplicationStages;

					cacheResult(miningApplicationStages);
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
			return (MiningApplicationStages)result;
		}
	}

	/**
	 * Removes the mining application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the mining application stages that was removed
	 */
	@Override
	public MiningApplicationStages removeBygetMiningBy_Case_Id(String caseId)
		throws NoSuchMiningApplicationStagesException {

		MiningApplicationStages miningApplicationStages =
			findBygetMiningBy_Case_Id(caseId);

		return remove(miningApplicationStages);
	}

	/**
	 * Returns the number of mining application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching mining application stageses
	 */
	@Override
	public int countBygetMiningBy_Case_Id(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetMiningBy_Case_Id;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MININGAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMININGBY_CASE_ID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMININGBY_CASE_ID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETMININGBY_CASE_ID_CASEID_2 =
		"miningApplicationStages.caseId = ?";

	private static final String _FINDER_COLUMN_GETMININGBY_CASE_ID_CASEID_3 =
		"(miningApplicationStages.caseId IS NULL OR miningApplicationStages.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetMining_By_StageName;
	private FinderPath _finderPathWithoutPaginationFindBygetMining_By_StageName;
	private FinderPath _finderPathCountBygetMining_By_StageName;

	/**
	 * Returns all the mining application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching mining application stageses
	 */
	@Override
	public List<MiningApplicationStages> findBygetMining_By_StageName(
		String stageName) {

		return findBygetMining_By_StageName(
			stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mining application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @return the range of matching mining application stageses
	 */
	@Override
	public List<MiningApplicationStages> findBygetMining_By_StageName(
		String stageName, int start, int end) {

		return findBygetMining_By_StageName(stageName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mining application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application stageses
	 */
	@Override
	public List<MiningApplicationStages> findBygetMining_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<MiningApplicationStages> orderByComparator) {

		return findBygetMining_By_StageName(
			stageName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the mining application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application stageses
	 */
	@Override
	public List<MiningApplicationStages> findBygetMining_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<MiningApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetMining_By_StageName;
				finderArgs = new Object[] {stageName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMining_By_StageName;
			finderArgs = new Object[] {
				stageName, start, end, orderByComparator
			};
		}

		List<MiningApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<MiningApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MiningApplicationStages miningApplicationStages : list) {
					if (!stageName.equals(
							miningApplicationStages.getStageName())) {

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

			sb.append(_SQL_SELECT_MININGAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMINING_BY_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETMINING_BY_STAGENAME_STAGENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MiningApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<MiningApplicationStages>)QueryUtil.list(
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
	 * Returns the first mining application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	@Override
	public MiningApplicationStages findBygetMining_By_StageName_First(
			String stageName,
			OrderByComparator<MiningApplicationStages> orderByComparator)
		throws NoSuchMiningApplicationStagesException {

		MiningApplicationStages miningApplicationStages =
			fetchBygetMining_By_StageName_First(stageName, orderByComparator);

		if (miningApplicationStages != null) {
			return miningApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchMiningApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first mining application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	@Override
	public MiningApplicationStages fetchBygetMining_By_StageName_First(
		String stageName,
		OrderByComparator<MiningApplicationStages> orderByComparator) {

		List<MiningApplicationStages> list = findBygetMining_By_StageName(
			stageName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mining application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	@Override
	public MiningApplicationStages findBygetMining_By_StageName_Last(
			String stageName,
			OrderByComparator<MiningApplicationStages> orderByComparator)
		throws NoSuchMiningApplicationStagesException {

		MiningApplicationStages miningApplicationStages =
			fetchBygetMining_By_StageName_Last(stageName, orderByComparator);

		if (miningApplicationStages != null) {
			return miningApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchMiningApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last mining application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	@Override
	public MiningApplicationStages fetchBygetMining_By_StageName_Last(
		String stageName,
		OrderByComparator<MiningApplicationStages> orderByComparator) {

		int count = countBygetMining_By_StageName(stageName);

		if (count == 0) {
			return null;
		}

		List<MiningApplicationStages> list = findBygetMining_By_StageName(
			stageName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mining application stageses before and after the current mining application stages in the ordered set where stageName = &#63;.
	 *
	 * @param miningStagesId the primary key of the current mining application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a mining application stages with the primary key could not be found
	 */
	@Override
	public MiningApplicationStages[] findBygetMining_By_StageName_PrevAndNext(
			long miningStagesId, String stageName,
			OrderByComparator<MiningApplicationStages> orderByComparator)
		throws NoSuchMiningApplicationStagesException {

		stageName = Objects.toString(stageName, "");

		MiningApplicationStages miningApplicationStages = findByPrimaryKey(
			miningStagesId);

		Session session = null;

		try {
			session = openSession();

			MiningApplicationStages[] array =
				new MiningApplicationStagesImpl[3];

			array[0] = getBygetMining_By_StageName_PrevAndNext(
				session, miningApplicationStages, stageName, orderByComparator,
				true);

			array[1] = miningApplicationStages;

			array[2] = getBygetMining_By_StageName_PrevAndNext(
				session, miningApplicationStages, stageName, orderByComparator,
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

	protected MiningApplicationStages getBygetMining_By_StageName_PrevAndNext(
		Session session, MiningApplicationStages miningApplicationStages,
		String stageName,
		OrderByComparator<MiningApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_MININGAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETMINING_BY_STAGENAME_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETMINING_BY_STAGENAME_STAGENAME_2);
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
			sb.append(MiningApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						miningApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MiningApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mining application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	@Override
	public void removeBygetMining_By_StageName(String stageName) {
		for (MiningApplicationStages miningApplicationStages :
				findBygetMining_By_StageName(
					stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(miningApplicationStages);
		}
	}

	/**
	 * Returns the number of mining application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching mining application stageses
	 */
	@Override
	public int countBygetMining_By_StageName(String stageName) {
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetMining_By_StageName;

		Object[] finderArgs = new Object[] {stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MININGAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMINING_BY_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETMINING_BY_STAGENAME_STAGENAME_2);
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

	private static final String
		_FINDER_COLUMN_GETMINING_BY_STAGENAME_STAGENAME_2 =
			"miningApplicationStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETMINING_BY_STAGENAME_STAGENAME_3 =
			"(miningApplicationStages.stageName IS NULL OR miningApplicationStages.stageName = '')";

	public MiningApplicationStagesPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(MiningApplicationStages.class);

		setModelImplClass(MiningApplicationStagesImpl.class);
		setModelPKClass(long.class);

		setTable(MiningApplicationStagesTable.INSTANCE);
	}

	/**
	 * Caches the mining application stages in the entity cache if it is enabled.
	 *
	 * @param miningApplicationStages the mining application stages
	 */
	@Override
	public void cacheResult(MiningApplicationStages miningApplicationStages) {
		entityCache.putResult(
			MiningApplicationStagesImpl.class,
			miningApplicationStages.getPrimaryKey(), miningApplicationStages);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				miningApplicationStages.getUuid(),
				miningApplicationStages.getGroupId()
			},
			miningApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetMining_By_AI,
			new Object[] {miningApplicationStages.getMiningApplicationId()},
			miningApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetMining_By_CaseIdStageName,
			new Object[] {
				miningApplicationStages.getCaseId(),
				miningApplicationStages.getStageName()
			},
			miningApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetMining_By_CaseIdStageStatus,
			new Object[] {
				miningApplicationStages.getCaseId(),
				miningApplicationStages.getStageStatus(),
				miningApplicationStages.getStageName()
			},
			miningApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetMining_By_CaseIdAndStatus,
			new Object[] {
				miningApplicationStages.getCaseId(),
				miningApplicationStages.getStageStatus()
			},
			miningApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetMiningBy_Case_Id,
			new Object[] {miningApplicationStages.getCaseId()},
			miningApplicationStages);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the mining application stageses in the entity cache if it is enabled.
	 *
	 * @param miningApplicationStageses the mining application stageses
	 */
	@Override
	public void cacheResult(
		List<MiningApplicationStages> miningApplicationStageses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (miningApplicationStageses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MiningApplicationStages miningApplicationStages :
				miningApplicationStageses) {

			if (entityCache.getResult(
					MiningApplicationStagesImpl.class,
					miningApplicationStages.getPrimaryKey()) == null) {

				cacheResult(miningApplicationStages);
			}
		}
	}

	/**
	 * Clears the cache for all mining application stageses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MiningApplicationStagesImpl.class);

		finderCache.clearCache(MiningApplicationStagesImpl.class);
	}

	/**
	 * Clears the cache for the mining application stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MiningApplicationStages miningApplicationStages) {
		entityCache.removeResult(
			MiningApplicationStagesImpl.class, miningApplicationStages);
	}

	@Override
	public void clearCache(
		List<MiningApplicationStages> miningApplicationStageses) {

		for (MiningApplicationStages miningApplicationStages :
				miningApplicationStageses) {

			entityCache.removeResult(
				MiningApplicationStagesImpl.class, miningApplicationStages);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MiningApplicationStagesImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MiningApplicationStagesImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MiningApplicationStagesModelImpl miningApplicationStagesModelImpl) {

		Object[] args = new Object[] {
			miningApplicationStagesModelImpl.getUuid(),
			miningApplicationStagesModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, miningApplicationStagesModelImpl);

		args = new Object[] {
			miningApplicationStagesModelImpl.getMiningApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetMining_By_AI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMining_By_AI, args,
			miningApplicationStagesModelImpl);

		args = new Object[] {
			miningApplicationStagesModelImpl.getCaseId(),
			miningApplicationStagesModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetMining_By_CaseIdStageName, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMining_By_CaseIdStageName, args,
			miningApplicationStagesModelImpl);

		args = new Object[] {
			miningApplicationStagesModelImpl.getCaseId(),
			miningApplicationStagesModelImpl.getStageStatus(),
			miningApplicationStagesModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetMining_By_CaseIdStageStatus, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMining_By_CaseIdStageStatus, args,
			miningApplicationStagesModelImpl);

		args = new Object[] {
			miningApplicationStagesModelImpl.getCaseId(),
			miningApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetMining_By_CaseIdAndStatus, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMining_By_CaseIdAndStatus, args,
			miningApplicationStagesModelImpl);

		args = new Object[] {miningApplicationStagesModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetMiningBy_Case_Id, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMiningBy_Case_Id, args,
			miningApplicationStagesModelImpl);
	}

	/**
	 * Creates a new mining application stages with the primary key. Does not add the mining application stages to the database.
	 *
	 * @param miningStagesId the primary key for the new mining application stages
	 * @return the new mining application stages
	 */
	@Override
	public MiningApplicationStages create(long miningStagesId) {
		MiningApplicationStages miningApplicationStages =
			new MiningApplicationStagesImpl();

		miningApplicationStages.setNew(true);
		miningApplicationStages.setPrimaryKey(miningStagesId);

		String uuid = PortalUUIDUtil.generate();

		miningApplicationStages.setUuid(uuid);

		miningApplicationStages.setCompanyId(CompanyThreadLocal.getCompanyId());

		return miningApplicationStages;
	}

	/**
	 * Removes the mining application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningStagesId the primary key of the mining application stages
	 * @return the mining application stages that was removed
	 * @throws NoSuchMiningApplicationStagesException if a mining application stages with the primary key could not be found
	 */
	@Override
	public MiningApplicationStages remove(long miningStagesId)
		throws NoSuchMiningApplicationStagesException {

		return remove((Serializable)miningStagesId);
	}

	/**
	 * Removes the mining application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mining application stages
	 * @return the mining application stages that was removed
	 * @throws NoSuchMiningApplicationStagesException if a mining application stages with the primary key could not be found
	 */
	@Override
	public MiningApplicationStages remove(Serializable primaryKey)
		throws NoSuchMiningApplicationStagesException {

		Session session = null;

		try {
			session = openSession();

			MiningApplicationStages miningApplicationStages =
				(MiningApplicationStages)session.get(
					MiningApplicationStagesImpl.class, primaryKey);

			if (miningApplicationStages == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMiningApplicationStagesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(miningApplicationStages);
		}
		catch (NoSuchMiningApplicationStagesException noSuchEntityException) {
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
	protected MiningApplicationStages removeImpl(
		MiningApplicationStages miningApplicationStages) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(miningApplicationStages)) {
				miningApplicationStages = (MiningApplicationStages)session.get(
					MiningApplicationStagesImpl.class,
					miningApplicationStages.getPrimaryKeyObj());
			}

			if (miningApplicationStages != null) {
				session.delete(miningApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (miningApplicationStages != null) {
			clearCache(miningApplicationStages);
		}

		return miningApplicationStages;
	}

	@Override
	public MiningApplicationStages updateImpl(
		MiningApplicationStages miningApplicationStages) {

		boolean isNew = miningApplicationStages.isNew();

		if (!(miningApplicationStages instanceof
				MiningApplicationStagesModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(miningApplicationStages.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					miningApplicationStages);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in miningApplicationStages proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MiningApplicationStages implementation " +
					miningApplicationStages.getClass());
		}

		MiningApplicationStagesModelImpl miningApplicationStagesModelImpl =
			(MiningApplicationStagesModelImpl)miningApplicationStages;

		if (Validator.isNull(miningApplicationStages.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			miningApplicationStages.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (miningApplicationStages.getCreateDate() == null)) {
			if (serviceContext == null) {
				miningApplicationStages.setCreateDate(date);
			}
			else {
				miningApplicationStages.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!miningApplicationStagesModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				miningApplicationStages.setModifiedDate(date);
			}
			else {
				miningApplicationStages.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(miningApplicationStages);
			}
			else {
				miningApplicationStages =
					(MiningApplicationStages)session.merge(
						miningApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MiningApplicationStagesImpl.class, miningApplicationStagesModelImpl,
			false, true);

		cacheUniqueFindersCache(miningApplicationStagesModelImpl);

		if (isNew) {
			miningApplicationStages.setNew(false);
		}

		miningApplicationStages.resetOriginalValues();

		return miningApplicationStages;
	}

	/**
	 * Returns the mining application stages with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mining application stages
	 * @return the mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a mining application stages with the primary key could not be found
	 */
	@Override
	public MiningApplicationStages findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMiningApplicationStagesException {

		MiningApplicationStages miningApplicationStages = fetchByPrimaryKey(
			primaryKey);

		if (miningApplicationStages == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMiningApplicationStagesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return miningApplicationStages;
	}

	/**
	 * Returns the mining application stages with the primary key or throws a <code>NoSuchMiningApplicationStagesException</code> if it could not be found.
	 *
	 * @param miningStagesId the primary key of the mining application stages
	 * @return the mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a mining application stages with the primary key could not be found
	 */
	@Override
	public MiningApplicationStages findByPrimaryKey(long miningStagesId)
		throws NoSuchMiningApplicationStagesException {

		return findByPrimaryKey((Serializable)miningStagesId);
	}

	/**
	 * Returns the mining application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningStagesId the primary key of the mining application stages
	 * @return the mining application stages, or <code>null</code> if a mining application stages with the primary key could not be found
	 */
	@Override
	public MiningApplicationStages fetchByPrimaryKey(long miningStagesId) {
		return fetchByPrimaryKey((Serializable)miningStagesId);
	}

	/**
	 * Returns all the mining application stageses.
	 *
	 * @return the mining application stageses
	 */
	@Override
	public List<MiningApplicationStages> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mining application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @return the range of mining application stageses
	 */
	@Override
	public List<MiningApplicationStages> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the mining application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining application stageses
	 */
	@Override
	public List<MiningApplicationStages> findAll(
		int start, int end,
		OrderByComparator<MiningApplicationStages> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the mining application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining application stageses
	 */
	@Override
	public List<MiningApplicationStages> findAll(
		int start, int end,
		OrderByComparator<MiningApplicationStages> orderByComparator,
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

		List<MiningApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<MiningApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MININGAPPLICATIONSTAGES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MININGAPPLICATIONSTAGES;

				sql = sql.concat(
					MiningApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MiningApplicationStages>)QueryUtil.list(
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
	 * Removes all the mining application stageses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MiningApplicationStages miningApplicationStages : findAll()) {
			remove(miningApplicationStages);
		}
	}

	/**
	 * Returns the number of mining application stageses.
	 *
	 * @return the number of mining application stageses
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
					_SQL_COUNT_MININGAPPLICATIONSTAGES);

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
		return "miningStagesId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MININGAPPLICATIONSTAGES;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MiningApplicationStagesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the mining application stages persistence.
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

		_finderPathFetchBygetMining_By_AI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMining_By_AI",
			new String[] {Long.class.getName()},
			new String[] {"miningApplicationId"}, true);

		_finderPathCountBygetMining_By_AI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMining_By_AI",
			new String[] {Long.class.getName()},
			new String[] {"miningApplicationId"}, false);

		_finderPathFetchBygetMining_By_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMining_By_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, true);

		_finderPathCountBygetMining_By_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMining_By_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, false);

		_finderPathFetchBygetMining_By_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMining_By_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageStatus", "stageName"}, true);

		_finderPathCountBygetMining_By_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMining_By_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageStatus", "stageName"}, false);

		_finderPathFetchBygetMining_By_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMining_By_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, true);

		_finderPathCountBygetMining_By_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMining_By_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, false);

		_finderPathWithPaginationFindBygetMining_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMining_By_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetMining_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetMining_By_CaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, true);

		_finderPathCountBygetMining_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMining_By_CaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		_finderPathFetchBygetMiningBy_Case_Id = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMiningBy_Case_Id",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetMiningBy_Case_Id = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMiningBy_Case_Id", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		_finderPathWithPaginationFindBygetMining_By_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetMining_By_StageName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"stageName"}, true);

		_finderPathWithoutPaginationFindBygetMining_By_StageName =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetMining_By_StageName",
				new String[] {String.class.getName()},
				new String[] {"stageName"}, true);

		_finderPathCountBygetMining_By_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMining_By_StageName",
			new String[] {String.class.getName()}, new String[] {"stageName"},
			false);

		MiningApplicationStagesUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MiningApplicationStagesUtil.setPersistence(null);

		entityCache.removeCache(MiningApplicationStagesImpl.class.getName());
	}

	@Override
	@Reference(
		target = MINING_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MINING_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MINING_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MININGAPPLICATIONSTAGES =
		"SELECT miningApplicationStages FROM MiningApplicationStages miningApplicationStages";

	private static final String _SQL_SELECT_MININGAPPLICATIONSTAGES_WHERE =
		"SELECT miningApplicationStages FROM MiningApplicationStages miningApplicationStages WHERE ";

	private static final String _SQL_COUNT_MININGAPPLICATIONSTAGES =
		"SELECT COUNT(miningApplicationStages) FROM MiningApplicationStages miningApplicationStages";

	private static final String _SQL_COUNT_MININGAPPLICATIONSTAGES_WHERE =
		"SELECT COUNT(miningApplicationStages) FROM MiningApplicationStages miningApplicationStages WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"miningApplicationStages.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MiningApplicationStages exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MiningApplicationStages exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MiningApplicationStagesPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}