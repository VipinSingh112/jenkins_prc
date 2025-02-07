/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.service.persistence.impl;

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

import com.nbp.wra.stage.service.exception.NoSuchWraApplicationStageException;
import com.nbp.wra.stage.service.model.WraApplicationStage;
import com.nbp.wra.stage.service.model.WraApplicationStageTable;
import com.nbp.wra.stage.service.model.impl.WraApplicationStageImpl;
import com.nbp.wra.stage.service.model.impl.WraApplicationStageModelImpl;
import com.nbp.wra.stage.service.service.persistence.WraApplicationStagePersistence;
import com.nbp.wra.stage.service.service.persistence.WraApplicationStageUtil;
import com.nbp.wra.stage.service.service.persistence.impl.constants.WRA_STAGESPersistenceConstants;

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
 * The persistence implementation for the wra application stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = WraApplicationStagePersistence.class)
public class WraApplicationStagePersistenceImpl
	extends BasePersistenceImpl<WraApplicationStage>
	implements WraApplicationStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>WraApplicationStageUtil</code> to access the wra application stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		WraApplicationStageImpl.class.getName();

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
	 * Returns all the wra application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching wra application stages
	 */
	@Override
	public List<WraApplicationStage> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wra application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @return the range of matching wra application stages
	 */
	@Override
	public List<WraApplicationStage> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the wra application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra application stages
	 */
	@Override
	public List<WraApplicationStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<WraApplicationStage> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the wra application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra application stages
	 */
	@Override
	public List<WraApplicationStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<WraApplicationStage> orderByComparator,
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

		List<WraApplicationStage> list = null;

		if (useFinderCache) {
			list = (List<WraApplicationStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (WraApplicationStage wraApplicationStage : list) {
					if (!uuid.equals(wraApplicationStage.getUuid())) {
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

			sb.append(_SQL_SELECT_WRAAPPLICATIONSTAGE_WHERE);

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
				sb.append(WraApplicationStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<WraApplicationStage>)QueryUtil.list(
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
	 * Returns the first wra application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	@Override
	public WraApplicationStage findByUuid_First(
			String uuid,
			OrderByComparator<WraApplicationStage> orderByComparator)
		throws NoSuchWraApplicationStageException {

		WraApplicationStage wraApplicationStage = fetchByUuid_First(
			uuid, orderByComparator);

		if (wraApplicationStage != null) {
			return wraApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchWraApplicationStageException(sb.toString());
	}

	/**
	 * Returns the first wra application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	@Override
	public WraApplicationStage fetchByUuid_First(
		String uuid, OrderByComparator<WraApplicationStage> orderByComparator) {

		List<WraApplicationStage> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last wra application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	@Override
	public WraApplicationStage findByUuid_Last(
			String uuid,
			OrderByComparator<WraApplicationStage> orderByComparator)
		throws NoSuchWraApplicationStageException {

		WraApplicationStage wraApplicationStage = fetchByUuid_Last(
			uuid, orderByComparator);

		if (wraApplicationStage != null) {
			return wraApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchWraApplicationStageException(sb.toString());
	}

	/**
	 * Returns the last wra application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	@Override
	public WraApplicationStage fetchByUuid_Last(
		String uuid, OrderByComparator<WraApplicationStage> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<WraApplicationStage> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the wra application stages before and after the current wra application stage in the ordered set where uuid = &#63;.
	 *
	 * @param wraApplicationStageId the primary key of the current wra application stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra application stage
	 * @throws NoSuchWraApplicationStageException if a wra application stage with the primary key could not be found
	 */
	@Override
	public WraApplicationStage[] findByUuid_PrevAndNext(
			long wraApplicationStageId, String uuid,
			OrderByComparator<WraApplicationStage> orderByComparator)
		throws NoSuchWraApplicationStageException {

		uuid = Objects.toString(uuid, "");

		WraApplicationStage wraApplicationStage = findByPrimaryKey(
			wraApplicationStageId);

		Session session = null;

		try {
			session = openSession();

			WraApplicationStage[] array = new WraApplicationStageImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, wraApplicationStage, uuid, orderByComparator, true);

			array[1] = wraApplicationStage;

			array[2] = getByUuid_PrevAndNext(
				session, wraApplicationStage, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected WraApplicationStage getByUuid_PrevAndNext(
		Session session, WraApplicationStage wraApplicationStage, String uuid,
		OrderByComparator<WraApplicationStage> orderByComparator,
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

		sb.append(_SQL_SELECT_WRAAPPLICATIONSTAGE_WHERE);

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
			sb.append(WraApplicationStageModelImpl.ORDER_BY_JPQL);
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
						wraApplicationStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<WraApplicationStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the wra application stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (WraApplicationStage wraApplicationStage :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(wraApplicationStage);
		}
	}

	/**
	 * Returns the number of wra application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching wra application stages
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_WRAAPPLICATIONSTAGE_WHERE);

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
		"wraApplicationStage.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(wraApplicationStage.uuid IS NULL OR wraApplicationStage.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the wra application stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchWraApplicationStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	@Override
	public WraApplicationStage findByUUID_G(String uuid, long groupId)
		throws NoSuchWraApplicationStageException {

		WraApplicationStage wraApplicationStage = fetchByUUID_G(uuid, groupId);

		if (wraApplicationStage == null) {
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

			throw new NoSuchWraApplicationStageException(sb.toString());
		}

		return wraApplicationStage;
	}

	/**
	 * Returns the wra application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	@Override
	public WraApplicationStage fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the wra application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	@Override
	public WraApplicationStage fetchByUUID_G(
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

		if (result instanceof WraApplicationStage) {
			WraApplicationStage wraApplicationStage =
				(WraApplicationStage)result;

			if (!Objects.equals(uuid, wraApplicationStage.getUuid()) ||
				(groupId != wraApplicationStage.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_WRAAPPLICATIONSTAGE_WHERE);

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

				List<WraApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					WraApplicationStage wraApplicationStage = list.get(0);

					result = wraApplicationStage;

					cacheResult(wraApplicationStage);
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
			return (WraApplicationStage)result;
		}
	}

	/**
	 * Removes the wra application stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the wra application stage that was removed
	 */
	@Override
	public WraApplicationStage removeByUUID_G(String uuid, long groupId)
		throws NoSuchWraApplicationStageException {

		WraApplicationStage wraApplicationStage = findByUUID_G(uuid, groupId);

		return remove(wraApplicationStage);
	}

	/**
	 * Returns the number of wra application stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching wra application stages
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_WRAAPPLICATIONSTAGE_WHERE);

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
		"wraApplicationStage.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(wraApplicationStage.uuid IS NULL OR wraApplicationStage.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"wraApplicationStage.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the wra application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching wra application stages
	 */
	@Override
	public List<WraApplicationStage> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wra application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @return the range of matching wra application stages
	 */
	@Override
	public List<WraApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the wra application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra application stages
	 */
	@Override
	public List<WraApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<WraApplicationStage> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the wra application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra application stages
	 */
	@Override
	public List<WraApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<WraApplicationStage> orderByComparator,
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

		List<WraApplicationStage> list = null;

		if (useFinderCache) {
			list = (List<WraApplicationStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (WraApplicationStage wraApplicationStage : list) {
					if (!uuid.equals(wraApplicationStage.getUuid()) ||
						(companyId != wraApplicationStage.getCompanyId())) {

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

			sb.append(_SQL_SELECT_WRAAPPLICATIONSTAGE_WHERE);

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
				sb.append(WraApplicationStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<WraApplicationStage>)QueryUtil.list(
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
	 * Returns the first wra application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	@Override
	public WraApplicationStage findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<WraApplicationStage> orderByComparator)
		throws NoSuchWraApplicationStageException {

		WraApplicationStage wraApplicationStage = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (wraApplicationStage != null) {
			return wraApplicationStage;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchWraApplicationStageException(sb.toString());
	}

	/**
	 * Returns the first wra application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	@Override
	public WraApplicationStage fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<WraApplicationStage> orderByComparator) {

		List<WraApplicationStage> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last wra application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	@Override
	public WraApplicationStage findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<WraApplicationStage> orderByComparator)
		throws NoSuchWraApplicationStageException {

		WraApplicationStage wraApplicationStage = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (wraApplicationStage != null) {
			return wraApplicationStage;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchWraApplicationStageException(sb.toString());
	}

	/**
	 * Returns the last wra application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	@Override
	public WraApplicationStage fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<WraApplicationStage> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<WraApplicationStage> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the wra application stages before and after the current wra application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param wraApplicationStageId the primary key of the current wra application stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra application stage
	 * @throws NoSuchWraApplicationStageException if a wra application stage with the primary key could not be found
	 */
	@Override
	public WraApplicationStage[] findByUuid_C_PrevAndNext(
			long wraApplicationStageId, String uuid, long companyId,
			OrderByComparator<WraApplicationStage> orderByComparator)
		throws NoSuchWraApplicationStageException {

		uuid = Objects.toString(uuid, "");

		WraApplicationStage wraApplicationStage = findByPrimaryKey(
			wraApplicationStageId);

		Session session = null;

		try {
			session = openSession();

			WraApplicationStage[] array = new WraApplicationStageImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, wraApplicationStage, uuid, companyId,
				orderByComparator, true);

			array[1] = wraApplicationStage;

			array[2] = getByUuid_C_PrevAndNext(
				session, wraApplicationStage, uuid, companyId,
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

	protected WraApplicationStage getByUuid_C_PrevAndNext(
		Session session, WraApplicationStage wraApplicationStage, String uuid,
		long companyId,
		OrderByComparator<WraApplicationStage> orderByComparator,
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

		sb.append(_SQL_SELECT_WRAAPPLICATIONSTAGE_WHERE);

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
			sb.append(WraApplicationStageModelImpl.ORDER_BY_JPQL);
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
						wraApplicationStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<WraApplicationStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the wra application stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (WraApplicationStage wraApplicationStage :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(wraApplicationStage);
		}
	}

	/**
	 * Returns the number of wra application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching wra application stages
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_WRAAPPLICATIONSTAGE_WHERE);

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
		"wraApplicationStage.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(wraApplicationStage.uuid IS NULL OR wraApplicationStage.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"wraApplicationStage.companyId = ?";

	private FinderPath _finderPathFetchBygetWra_By_AI;
	private FinderPath _finderPathCountBygetWra_By_AI;

	/**
	 * Returns the wra application stage where wraApplicationId = &#63; or throws a <code>NoSuchWraApplicationStageException</code> if it could not be found.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	@Override
	public WraApplicationStage findBygetWra_By_AI(long wraApplicationId)
		throws NoSuchWraApplicationStageException {

		WraApplicationStage wraApplicationStage = fetchBygetWra_By_AI(
			wraApplicationId);

		if (wraApplicationStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("wraApplicationId=");
			sb.append(wraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchWraApplicationStageException(sb.toString());
		}

		return wraApplicationStage;
	}

	/**
	 * Returns the wra application stage where wraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	@Override
	public WraApplicationStage fetchBygetWra_By_AI(long wraApplicationId) {
		return fetchBygetWra_By_AI(wraApplicationId, true);
	}

	/**
	 * Returns the wra application stage where wraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	@Override
	public WraApplicationStage fetchBygetWra_By_AI(
		long wraApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {wraApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetWra_By_AI, finderArgs, this);
		}

		if (result instanceof WraApplicationStage) {
			WraApplicationStage wraApplicationStage =
				(WraApplicationStage)result;

			if (wraApplicationId != wraApplicationStage.getWraApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_WRAAPPLICATIONSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETWRA_BY_AI_WRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(wraApplicationId);

				List<WraApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetWra_By_AI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {wraApplicationId};
							}

							_log.warn(
								"WraApplicationStagePersistenceImpl.fetchBygetWra_By_AI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					WraApplicationStage wraApplicationStage = list.get(0);

					result = wraApplicationStage;

					cacheResult(wraApplicationStage);
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
			return (WraApplicationStage)result;
		}
	}

	/**
	 * Removes the wra application stage where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the wra application stage that was removed
	 */
	@Override
	public WraApplicationStage removeBygetWra_By_AI(long wraApplicationId)
		throws NoSuchWraApplicationStageException {

		WraApplicationStage wraApplicationStage = findBygetWra_By_AI(
			wraApplicationId);

		return remove(wraApplicationStage);
	}

	/**
	 * Returns the number of wra application stages where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching wra application stages
	 */
	@Override
	public int countBygetWra_By_AI(long wraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetWra_By_AI;

		Object[] finderArgs = new Object[] {wraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_WRAAPPLICATIONSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETWRA_BY_AI_WRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(wraApplicationId);

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

	private static final String _FINDER_COLUMN_GETWRA_BY_AI_WRAAPPLICATIONID_2 =
		"wraApplicationStage.wraApplicationId = ?";

	private FinderPath _finderPathFetchBygetWra_By_CaseIdStageName;
	private FinderPath _finderPathCountBygetWra_By_CaseIdStageName;

	/**
	 * Returns the wra application stage where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchWraApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	@Override
	public WraApplicationStage findBygetWra_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchWraApplicationStageException {

		WraApplicationStage wraApplicationStage =
			fetchBygetWra_By_CaseIdStageName(caseId, stageName);

		if (wraApplicationStage == null) {
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

			throw new NoSuchWraApplicationStageException(sb.toString());
		}

		return wraApplicationStage;
	}

	/**
	 * Returns the wra application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	@Override
	public WraApplicationStage fetchBygetWra_By_CaseIdStageName(
		String caseId, String stageName) {

		return fetchBygetWra_By_CaseIdStageName(caseId, stageName, true);
	}

	/**
	 * Returns the wra application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	@Override
	public WraApplicationStage fetchBygetWra_By_CaseIdStageName(
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
				_finderPathFetchBygetWra_By_CaseIdStageName, finderArgs, this);
		}

		if (result instanceof WraApplicationStage) {
			WraApplicationStage wraApplicationStage =
				(WraApplicationStage)result;

			if (!Objects.equals(caseId, wraApplicationStage.getCaseId()) ||
				!Objects.equals(
					stageName, wraApplicationStage.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_WRAAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRA_BY_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETWRA_BY_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRA_BY_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETWRA_BY_CASEIDSTAGENAME_STAGENAME_2);
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

				List<WraApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetWra_By_CaseIdStageName,
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
								"WraApplicationStagePersistenceImpl.fetchBygetWra_By_CaseIdStageName(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					WraApplicationStage wraApplicationStage = list.get(0);

					result = wraApplicationStage;

					cacheResult(wraApplicationStage);
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
			return (WraApplicationStage)result;
		}
	}

	/**
	 * Removes the wra application stage where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the wra application stage that was removed
	 */
	@Override
	public WraApplicationStage removeBygetWra_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchWraApplicationStageException {

		WraApplicationStage wraApplicationStage =
			findBygetWra_By_CaseIdStageName(caseId, stageName);

		return remove(wraApplicationStage);
	}

	/**
	 * Returns the number of wra application stages where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching wra application stages
	 */
	@Override
	public int countBygetWra_By_CaseIdStageName(
		String caseId, String stageName) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetWra_By_CaseIdStageName;

		Object[] finderArgs = new Object[] {caseId, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_WRAAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRA_BY_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETWRA_BY_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRA_BY_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETWRA_BY_CASEIDSTAGENAME_STAGENAME_2);
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
		_FINDER_COLUMN_GETWRA_BY_CASEIDSTAGENAME_CASEID_2 =
			"wraApplicationStage.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETWRA_BY_CASEIDSTAGENAME_CASEID_3 =
			"(wraApplicationStage.caseId IS NULL OR wraApplicationStage.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETWRA_BY_CASEIDSTAGENAME_STAGENAME_2 =
			"wraApplicationStage.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETWRA_BY_CASEIDSTAGENAME_STAGENAME_3 =
			"(wraApplicationStage.stageName IS NULL OR wraApplicationStage.stageName = '')";

	private FinderPath _finderPathFetchBygetWra_By_CaseIdStageStatus;
	private FinderPath _finderPathCountBygetWra_By_CaseIdStageStatus;

	/**
	 * Returns the wra application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchWraApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	@Override
	public WraApplicationStage findBygetWra_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchWraApplicationStageException {

		WraApplicationStage wraApplicationStage =
			fetchBygetWra_By_CaseIdStageStatus(caseId, stageStatus, stageName);

		if (wraApplicationStage == null) {
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

			throw new NoSuchWraApplicationStageException(sb.toString());
		}

		return wraApplicationStage;
	}

	/**
	 * Returns the wra application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	@Override
	public WraApplicationStage fetchBygetWra_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		return fetchBygetWra_By_CaseIdStageStatus(
			caseId, stageStatus, stageName, true);
	}

	/**
	 * Returns the wra application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	@Override
	public WraApplicationStage fetchBygetWra_By_CaseIdStageStatus(
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
				_finderPathFetchBygetWra_By_CaseIdStageStatus, finderArgs,
				this);
		}

		if (result instanceof WraApplicationStage) {
			WraApplicationStage wraApplicationStage =
				(WraApplicationStage)result;

			if (!Objects.equals(caseId, wraApplicationStage.getCaseId()) ||
				!Objects.equals(
					stageStatus, wraApplicationStage.getStageStatus()) ||
				!Objects.equals(
					stageName, wraApplicationStage.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_WRAAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRA_BY_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETWRA_BY_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETWRA_BY_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETWRA_BY_CASEIDSTAGESTATUS_STAGESTATUS_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETWRA_BY_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETWRA_BY_CASEIDSTAGESTATUS_STAGENAME_2);
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

				List<WraApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetWra_By_CaseIdStageStatus,
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
								"WraApplicationStagePersistenceImpl.fetchBygetWra_By_CaseIdStageStatus(String, String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					WraApplicationStage wraApplicationStage = list.get(0);

					result = wraApplicationStage;

					cacheResult(wraApplicationStage);
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
			return (WraApplicationStage)result;
		}
	}

	/**
	 * Removes the wra application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the wra application stage that was removed
	 */
	@Override
	public WraApplicationStage removeBygetWra_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchWraApplicationStageException {

		WraApplicationStage wraApplicationStage =
			findBygetWra_By_CaseIdStageStatus(caseId, stageStatus, stageName);

		return remove(wraApplicationStage);
	}

	/**
	 * Returns the number of wra application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching wra application stages
	 */
	@Override
	public int countBygetWra_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetWra_By_CaseIdStageStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_WRAAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRA_BY_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETWRA_BY_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETWRA_BY_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETWRA_BY_CASEIDSTAGESTATUS_STAGESTATUS_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETWRA_BY_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETWRA_BY_CASEIDSTAGESTATUS_STAGENAME_2);
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
		_FINDER_COLUMN_GETWRA_BY_CASEIDSTAGESTATUS_CASEID_2 =
			"wraApplicationStage.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETWRA_BY_CASEIDSTAGESTATUS_CASEID_3 =
			"(wraApplicationStage.caseId IS NULL OR wraApplicationStage.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETWRA_BY_CASEIDSTAGESTATUS_STAGESTATUS_2 =
			"wraApplicationStage.stageStatus = ? AND ";

	private static final String
		_FINDER_COLUMN_GETWRA_BY_CASEIDSTAGESTATUS_STAGESTATUS_3 =
			"(wraApplicationStage.stageStatus IS NULL OR wraApplicationStage.stageStatus = '') AND ";

	private static final String
		_FINDER_COLUMN_GETWRA_BY_CASEIDSTAGESTATUS_STAGENAME_2 =
			"wraApplicationStage.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETWRA_BY_CASEIDSTAGESTATUS_STAGENAME_3 =
			"(wraApplicationStage.stageName IS NULL OR wraApplicationStage.stageName = '')";

	private FinderPath _finderPathFetchBygetWra_By_CaseIdAndStatus;
	private FinderPath _finderPathCountBygetWra_By_CaseIdAndStatus;

	/**
	 * Returns the wra application stage where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchWraApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	@Override
	public WraApplicationStage findBygetWra_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchWraApplicationStageException {

		WraApplicationStage wraApplicationStage =
			fetchBygetWra_By_CaseIdAndStatus(caseId, stageStatus);

		if (wraApplicationStage == null) {
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

			throw new NoSuchWraApplicationStageException(sb.toString());
		}

		return wraApplicationStage;
	}

	/**
	 * Returns the wra application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	@Override
	public WraApplicationStage fetchBygetWra_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return fetchBygetWra_By_CaseIdAndStatus(caseId, stageStatus, true);
	}

	/**
	 * Returns the wra application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	@Override
	public WraApplicationStage fetchBygetWra_By_CaseIdAndStatus(
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
				_finderPathFetchBygetWra_By_CaseIdAndStatus, finderArgs, this);
		}

		if (result instanceof WraApplicationStage) {
			WraApplicationStage wraApplicationStage =
				(WraApplicationStage)result;

			if (!Objects.equals(caseId, wraApplicationStage.getCaseId()) ||
				!Objects.equals(
					stageStatus, wraApplicationStage.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_WRAAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRA_BY_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETWRA_BY_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETWRA_BY_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETWRA_BY_CASEIDANDSTATUS_STAGESTATUS_2);
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

				List<WraApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetWra_By_CaseIdAndStatus,
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
								"WraApplicationStagePersistenceImpl.fetchBygetWra_By_CaseIdAndStatus(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					WraApplicationStage wraApplicationStage = list.get(0);

					result = wraApplicationStage;

					cacheResult(wraApplicationStage);
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
			return (WraApplicationStage)result;
		}
	}

	/**
	 * Removes the wra application stage where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the wra application stage that was removed
	 */
	@Override
	public WraApplicationStage removeBygetWra_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchWraApplicationStageException {

		WraApplicationStage wraApplicationStage =
			findBygetWra_By_CaseIdAndStatus(caseId, stageStatus);

		return remove(wraApplicationStage);
	}

	/**
	 * Returns the number of wra application stages where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching wra application stages
	 */
	@Override
	public int countBygetWra_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetWra_By_CaseIdAndStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_WRAAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRA_BY_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETWRA_BY_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETWRA_BY_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETWRA_BY_CASEIDANDSTATUS_STAGESTATUS_2);
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
		_FINDER_COLUMN_GETWRA_BY_CASEIDANDSTATUS_CASEID_2 =
			"wraApplicationStage.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETWRA_BY_CASEIDANDSTATUS_CASEID_3 =
			"(wraApplicationStage.caseId IS NULL OR wraApplicationStage.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETWRA_BY_CASEIDANDSTATUS_STAGESTATUS_2 =
			"wraApplicationStage.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETWRA_BY_CASEIDANDSTATUS_STAGESTATUS_3 =
			"(wraApplicationStage.stageStatus IS NULL OR wraApplicationStage.stageStatus = '')";

	private FinderPath _finderPathWithPaginationFindBygetWra_By_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetWra_By_CaseId;
	private FinderPath _finderPathCountBygetWra_By_CaseId;

	/**
	 * Returns all the wra application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching wra application stages
	 */
	@Override
	public List<WraApplicationStage> findBygetWra_By_CaseId(String caseId) {
		return findBygetWra_By_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wra application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @return the range of matching wra application stages
	 */
	@Override
	public List<WraApplicationStage> findBygetWra_By_CaseId(
		String caseId, int start, int end) {

		return findBygetWra_By_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the wra application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra application stages
	 */
	@Override
	public List<WraApplicationStage> findBygetWra_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<WraApplicationStage> orderByComparator) {

		return findBygetWra_By_CaseId(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the wra application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra application stages
	 */
	@Override
	public List<WraApplicationStage> findBygetWra_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<WraApplicationStage> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetWra_By_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetWra_By_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<WraApplicationStage> list = null;

		if (useFinderCache) {
			list = (List<WraApplicationStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (WraApplicationStage wraApplicationStage : list) {
					if (!caseId.equals(wraApplicationStage.getCaseId())) {
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

			sb.append(_SQL_SELECT_WRAAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRA_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETWRA_BY_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(WraApplicationStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<WraApplicationStage>)QueryUtil.list(
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
	 * Returns the first wra application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	@Override
	public WraApplicationStage findBygetWra_By_CaseId_First(
			String caseId,
			OrderByComparator<WraApplicationStage> orderByComparator)
		throws NoSuchWraApplicationStageException {

		WraApplicationStage wraApplicationStage = fetchBygetWra_By_CaseId_First(
			caseId, orderByComparator);

		if (wraApplicationStage != null) {
			return wraApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchWraApplicationStageException(sb.toString());
	}

	/**
	 * Returns the first wra application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	@Override
	public WraApplicationStage fetchBygetWra_By_CaseId_First(
		String caseId,
		OrderByComparator<WraApplicationStage> orderByComparator) {

		List<WraApplicationStage> list = findBygetWra_By_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last wra application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	@Override
	public WraApplicationStage findBygetWra_By_CaseId_Last(
			String caseId,
			OrderByComparator<WraApplicationStage> orderByComparator)
		throws NoSuchWraApplicationStageException {

		WraApplicationStage wraApplicationStage = fetchBygetWra_By_CaseId_Last(
			caseId, orderByComparator);

		if (wraApplicationStage != null) {
			return wraApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchWraApplicationStageException(sb.toString());
	}

	/**
	 * Returns the last wra application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	@Override
	public WraApplicationStage fetchBygetWra_By_CaseId_Last(
		String caseId,
		OrderByComparator<WraApplicationStage> orderByComparator) {

		int count = countBygetWra_By_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<WraApplicationStage> list = findBygetWra_By_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the wra application stages before and after the current wra application stage in the ordered set where caseId = &#63;.
	 *
	 * @param wraApplicationStageId the primary key of the current wra application stage
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra application stage
	 * @throws NoSuchWraApplicationStageException if a wra application stage with the primary key could not be found
	 */
	@Override
	public WraApplicationStage[] findBygetWra_By_CaseId_PrevAndNext(
			long wraApplicationStageId, String caseId,
			OrderByComparator<WraApplicationStage> orderByComparator)
		throws NoSuchWraApplicationStageException {

		caseId = Objects.toString(caseId, "");

		WraApplicationStage wraApplicationStage = findByPrimaryKey(
			wraApplicationStageId);

		Session session = null;

		try {
			session = openSession();

			WraApplicationStage[] array = new WraApplicationStageImpl[3];

			array[0] = getBygetWra_By_CaseId_PrevAndNext(
				session, wraApplicationStage, caseId, orderByComparator, true);

			array[1] = wraApplicationStage;

			array[2] = getBygetWra_By_CaseId_PrevAndNext(
				session, wraApplicationStage, caseId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected WraApplicationStage getBygetWra_By_CaseId_PrevAndNext(
		Session session, WraApplicationStage wraApplicationStage, String caseId,
		OrderByComparator<WraApplicationStage> orderByComparator,
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

		sb.append(_SQL_SELECT_WRAAPPLICATIONSTAGE_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETWRA_BY_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETWRA_BY_CASEID_CASEID_2);
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
			sb.append(WraApplicationStageModelImpl.ORDER_BY_JPQL);
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
						wraApplicationStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<WraApplicationStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the wra application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetWra_By_CaseId(String caseId) {
		for (WraApplicationStage wraApplicationStage :
				findBygetWra_By_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(wraApplicationStage);
		}
	}

	/**
	 * Returns the number of wra application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching wra application stages
	 */
	@Override
	public int countBygetWra_By_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetWra_By_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_WRAAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRA_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETWRA_BY_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETWRA_BY_CASEID_CASEID_2 =
		"wraApplicationStage.caseId = ?";

	private static final String _FINDER_COLUMN_GETWRA_BY_CASEID_CASEID_3 =
		"(wraApplicationStage.caseId IS NULL OR wraApplicationStage.caseId = '')";

	private FinderPath _finderPathFetchByget_Wra_By_CaseId;
	private FinderPath _finderPathCountByget_Wra_By_CaseId;

	/**
	 * Returns the wra application stage where caseId = &#63; or throws a <code>NoSuchWraApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	@Override
	public WraApplicationStage findByget_Wra_By_CaseId(String caseId)
		throws NoSuchWraApplicationStageException {

		WraApplicationStage wraApplicationStage = fetchByget_Wra_By_CaseId(
			caseId);

		if (wraApplicationStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchWraApplicationStageException(sb.toString());
		}

		return wraApplicationStage;
	}

	/**
	 * Returns the wra application stage where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	@Override
	public WraApplicationStage fetchByget_Wra_By_CaseId(String caseId) {
		return fetchByget_Wra_By_CaseId(caseId, true);
	}

	/**
	 * Returns the wra application stage where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	@Override
	public WraApplicationStage fetchByget_Wra_By_CaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByget_Wra_By_CaseId, finderArgs, this);
		}

		if (result instanceof WraApplicationStage) {
			WraApplicationStage wraApplicationStage =
				(WraApplicationStage)result;

			if (!Objects.equals(caseId, wraApplicationStage.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_WRAAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_WRA_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GET_WRA_BY_CASEID_CASEID_2);
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

				List<WraApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByget_Wra_By_CaseId, finderArgs,
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
								"WraApplicationStagePersistenceImpl.fetchByget_Wra_By_CaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					WraApplicationStage wraApplicationStage = list.get(0);

					result = wraApplicationStage;

					cacheResult(wraApplicationStage);
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
			return (WraApplicationStage)result;
		}
	}

	/**
	 * Removes the wra application stage where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the wra application stage that was removed
	 */
	@Override
	public WraApplicationStage removeByget_Wra_By_CaseId(String caseId)
		throws NoSuchWraApplicationStageException {

		WraApplicationStage wraApplicationStage = findByget_Wra_By_CaseId(
			caseId);

		return remove(wraApplicationStage);
	}

	/**
	 * Returns the number of wra application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching wra application stages
	 */
	@Override
	public int countByget_Wra_By_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountByget_Wra_By_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_WRAAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_WRA_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GET_WRA_BY_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GET_WRA_BY_CASEID_CASEID_2 =
		"wraApplicationStage.caseId = ?";

	private static final String _FINDER_COLUMN_GET_WRA_BY_CASEID_CASEID_3 =
		"(wraApplicationStage.caseId IS NULL OR wraApplicationStage.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetWra_By_StageName;
	private FinderPath _finderPathWithoutPaginationFindBygetWra_By_StageName;
	private FinderPath _finderPathCountBygetWra_By_StageName;

	/**
	 * Returns all the wra application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching wra application stages
	 */
	@Override
	public List<WraApplicationStage> findBygetWra_By_StageName(
		String stageName) {

		return findBygetWra_By_StageName(
			stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wra application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @return the range of matching wra application stages
	 */
	@Override
	public List<WraApplicationStage> findBygetWra_By_StageName(
		String stageName, int start, int end) {

		return findBygetWra_By_StageName(stageName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the wra application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra application stages
	 */
	@Override
	public List<WraApplicationStage> findBygetWra_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<WraApplicationStage> orderByComparator) {

		return findBygetWra_By_StageName(
			stageName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the wra application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra application stages
	 */
	@Override
	public List<WraApplicationStage> findBygetWra_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<WraApplicationStage> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetWra_By_StageName;
				finderArgs = new Object[] {stageName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetWra_By_StageName;
			finderArgs = new Object[] {
				stageName, start, end, orderByComparator
			};
		}

		List<WraApplicationStage> list = null;

		if (useFinderCache) {
			list = (List<WraApplicationStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (WraApplicationStage wraApplicationStage : list) {
					if (!stageName.equals(wraApplicationStage.getStageName())) {
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

			sb.append(_SQL_SELECT_WRAAPPLICATIONSTAGE_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRA_BY_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETWRA_BY_STAGENAME_STAGENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(WraApplicationStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<WraApplicationStage>)QueryUtil.list(
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
	 * Returns the first wra application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	@Override
	public WraApplicationStage findBygetWra_By_StageName_First(
			String stageName,
			OrderByComparator<WraApplicationStage> orderByComparator)
		throws NoSuchWraApplicationStageException {

		WraApplicationStage wraApplicationStage =
			fetchBygetWra_By_StageName_First(stageName, orderByComparator);

		if (wraApplicationStage != null) {
			return wraApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchWraApplicationStageException(sb.toString());
	}

	/**
	 * Returns the first wra application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	@Override
	public WraApplicationStage fetchBygetWra_By_StageName_First(
		String stageName,
		OrderByComparator<WraApplicationStage> orderByComparator) {

		List<WraApplicationStage> list = findBygetWra_By_StageName(
			stageName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last wra application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	@Override
	public WraApplicationStage findBygetWra_By_StageName_Last(
			String stageName,
			OrderByComparator<WraApplicationStage> orderByComparator)
		throws NoSuchWraApplicationStageException {

		WraApplicationStage wraApplicationStage =
			fetchBygetWra_By_StageName_Last(stageName, orderByComparator);

		if (wraApplicationStage != null) {
			return wraApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchWraApplicationStageException(sb.toString());
	}

	/**
	 * Returns the last wra application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	@Override
	public WraApplicationStage fetchBygetWra_By_StageName_Last(
		String stageName,
		OrderByComparator<WraApplicationStage> orderByComparator) {

		int count = countBygetWra_By_StageName(stageName);

		if (count == 0) {
			return null;
		}

		List<WraApplicationStage> list = findBygetWra_By_StageName(
			stageName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the wra application stages before and after the current wra application stage in the ordered set where stageName = &#63;.
	 *
	 * @param wraApplicationStageId the primary key of the current wra application stage
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra application stage
	 * @throws NoSuchWraApplicationStageException if a wra application stage with the primary key could not be found
	 */
	@Override
	public WraApplicationStage[] findBygetWra_By_StageName_PrevAndNext(
			long wraApplicationStageId, String stageName,
			OrderByComparator<WraApplicationStage> orderByComparator)
		throws NoSuchWraApplicationStageException {

		stageName = Objects.toString(stageName, "");

		WraApplicationStage wraApplicationStage = findByPrimaryKey(
			wraApplicationStageId);

		Session session = null;

		try {
			session = openSession();

			WraApplicationStage[] array = new WraApplicationStageImpl[3];

			array[0] = getBygetWra_By_StageName_PrevAndNext(
				session, wraApplicationStage, stageName, orderByComparator,
				true);

			array[1] = wraApplicationStage;

			array[2] = getBygetWra_By_StageName_PrevAndNext(
				session, wraApplicationStage, stageName, orderByComparator,
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

	protected WraApplicationStage getBygetWra_By_StageName_PrevAndNext(
		Session session, WraApplicationStage wraApplicationStage,
		String stageName,
		OrderByComparator<WraApplicationStage> orderByComparator,
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

		sb.append(_SQL_SELECT_WRAAPPLICATIONSTAGE_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETWRA_BY_STAGENAME_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETWRA_BY_STAGENAME_STAGENAME_2);
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
			sb.append(WraApplicationStageModelImpl.ORDER_BY_JPQL);
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
						wraApplicationStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<WraApplicationStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the wra application stages where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	@Override
	public void removeBygetWra_By_StageName(String stageName) {
		for (WraApplicationStage wraApplicationStage :
				findBygetWra_By_StageName(
					stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(wraApplicationStage);
		}
	}

	/**
	 * Returns the number of wra application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching wra application stages
	 */
	@Override
	public int countBygetWra_By_StageName(String stageName) {
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetWra_By_StageName;

		Object[] finderArgs = new Object[] {stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_WRAAPPLICATIONSTAGE_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRA_BY_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETWRA_BY_STAGENAME_STAGENAME_2);
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

	private static final String _FINDER_COLUMN_GETWRA_BY_STAGENAME_STAGENAME_2 =
		"wraApplicationStage.stageName = ?";

	private static final String _FINDER_COLUMN_GETWRA_BY_STAGENAME_STAGENAME_3 =
		"(wraApplicationStage.stageName IS NULL OR wraApplicationStage.stageName = '')";

	public WraApplicationStagePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(WraApplicationStage.class);

		setModelImplClass(WraApplicationStageImpl.class);
		setModelPKClass(long.class);

		setTable(WraApplicationStageTable.INSTANCE);
	}

	/**
	 * Caches the wra application stage in the entity cache if it is enabled.
	 *
	 * @param wraApplicationStage the wra application stage
	 */
	@Override
	public void cacheResult(WraApplicationStage wraApplicationStage) {
		entityCache.putResult(
			WraApplicationStageImpl.class, wraApplicationStage.getPrimaryKey(),
			wraApplicationStage);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				wraApplicationStage.getUuid(), wraApplicationStage.getGroupId()
			},
			wraApplicationStage);

		finderCache.putResult(
			_finderPathFetchBygetWra_By_AI,
			new Object[] {wraApplicationStage.getWraApplicationId()},
			wraApplicationStage);

		finderCache.putResult(
			_finderPathFetchBygetWra_By_CaseIdStageName,
			new Object[] {
				wraApplicationStage.getCaseId(),
				wraApplicationStage.getStageName()
			},
			wraApplicationStage);

		finderCache.putResult(
			_finderPathFetchBygetWra_By_CaseIdStageStatus,
			new Object[] {
				wraApplicationStage.getCaseId(),
				wraApplicationStage.getStageStatus(),
				wraApplicationStage.getStageName()
			},
			wraApplicationStage);

		finderCache.putResult(
			_finderPathFetchBygetWra_By_CaseIdAndStatus,
			new Object[] {
				wraApplicationStage.getCaseId(),
				wraApplicationStage.getStageStatus()
			},
			wraApplicationStage);

		finderCache.putResult(
			_finderPathFetchByget_Wra_By_CaseId,
			new Object[] {wraApplicationStage.getCaseId()},
			wraApplicationStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the wra application stages in the entity cache if it is enabled.
	 *
	 * @param wraApplicationStages the wra application stages
	 */
	@Override
	public void cacheResult(List<WraApplicationStage> wraApplicationStages) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (wraApplicationStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (WraApplicationStage wraApplicationStage : wraApplicationStages) {
			if (entityCache.getResult(
					WraApplicationStageImpl.class,
					wraApplicationStage.getPrimaryKey()) == null) {

				cacheResult(wraApplicationStage);
			}
		}
	}

	/**
	 * Clears the cache for all wra application stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(WraApplicationStageImpl.class);

		finderCache.clearCache(WraApplicationStageImpl.class);
	}

	/**
	 * Clears the cache for the wra application stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(WraApplicationStage wraApplicationStage) {
		entityCache.removeResult(
			WraApplicationStageImpl.class, wraApplicationStage);
	}

	@Override
	public void clearCache(List<WraApplicationStage> wraApplicationStages) {
		for (WraApplicationStage wraApplicationStage : wraApplicationStages) {
			entityCache.removeResult(
				WraApplicationStageImpl.class, wraApplicationStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(WraApplicationStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(WraApplicationStageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		WraApplicationStageModelImpl wraApplicationStageModelImpl) {

		Object[] args = new Object[] {
			wraApplicationStageModelImpl.getUuid(),
			wraApplicationStageModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, wraApplicationStageModelImpl);

		args = new Object[] {
			wraApplicationStageModelImpl.getWraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetWra_By_AI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetWra_By_AI, args, wraApplicationStageModelImpl);

		args = new Object[] {
			wraApplicationStageModelImpl.getCaseId(),
			wraApplicationStageModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetWra_By_CaseIdStageName, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetWra_By_CaseIdStageName, args,
			wraApplicationStageModelImpl);

		args = new Object[] {
			wraApplicationStageModelImpl.getCaseId(),
			wraApplicationStageModelImpl.getStageStatus(),
			wraApplicationStageModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetWra_By_CaseIdStageStatus, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetWra_By_CaseIdStageStatus, args,
			wraApplicationStageModelImpl);

		args = new Object[] {
			wraApplicationStageModelImpl.getCaseId(),
			wraApplicationStageModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetWra_By_CaseIdAndStatus, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetWra_By_CaseIdAndStatus, args,
			wraApplicationStageModelImpl);

		args = new Object[] {wraApplicationStageModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountByget_Wra_By_CaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByget_Wra_By_CaseId, args,
			wraApplicationStageModelImpl);
	}

	/**
	 * Creates a new wra application stage with the primary key. Does not add the wra application stage to the database.
	 *
	 * @param wraApplicationStageId the primary key for the new wra application stage
	 * @return the new wra application stage
	 */
	@Override
	public WraApplicationStage create(long wraApplicationStageId) {
		WraApplicationStage wraApplicationStage = new WraApplicationStageImpl();

		wraApplicationStage.setNew(true);
		wraApplicationStage.setPrimaryKey(wraApplicationStageId);

		String uuid = PortalUUIDUtil.generate();

		wraApplicationStage.setUuid(uuid);

		wraApplicationStage.setCompanyId(CompanyThreadLocal.getCompanyId());

		return wraApplicationStage;
	}

	/**
	 * Removes the wra application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wraApplicationStageId the primary key of the wra application stage
	 * @return the wra application stage that was removed
	 * @throws NoSuchWraApplicationStageException if a wra application stage with the primary key could not be found
	 */
	@Override
	public WraApplicationStage remove(long wraApplicationStageId)
		throws NoSuchWraApplicationStageException {

		return remove((Serializable)wraApplicationStageId);
	}

	/**
	 * Removes the wra application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the wra application stage
	 * @return the wra application stage that was removed
	 * @throws NoSuchWraApplicationStageException if a wra application stage with the primary key could not be found
	 */
	@Override
	public WraApplicationStage remove(Serializable primaryKey)
		throws NoSuchWraApplicationStageException {

		Session session = null;

		try {
			session = openSession();

			WraApplicationStage wraApplicationStage =
				(WraApplicationStage)session.get(
					WraApplicationStageImpl.class, primaryKey);

			if (wraApplicationStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchWraApplicationStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(wraApplicationStage);
		}
		catch (NoSuchWraApplicationStageException noSuchEntityException) {
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
	protected WraApplicationStage removeImpl(
		WraApplicationStage wraApplicationStage) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(wraApplicationStage)) {
				wraApplicationStage = (WraApplicationStage)session.get(
					WraApplicationStageImpl.class,
					wraApplicationStage.getPrimaryKeyObj());
			}

			if (wraApplicationStage != null) {
				session.delete(wraApplicationStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (wraApplicationStage != null) {
			clearCache(wraApplicationStage);
		}

		return wraApplicationStage;
	}

	@Override
	public WraApplicationStage updateImpl(
		WraApplicationStage wraApplicationStage) {

		boolean isNew = wraApplicationStage.isNew();

		if (!(wraApplicationStage instanceof WraApplicationStageModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(wraApplicationStage.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					wraApplicationStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in wraApplicationStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom WraApplicationStage implementation " +
					wraApplicationStage.getClass());
		}

		WraApplicationStageModelImpl wraApplicationStageModelImpl =
			(WraApplicationStageModelImpl)wraApplicationStage;

		if (Validator.isNull(wraApplicationStage.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			wraApplicationStage.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (wraApplicationStage.getCreateDate() == null)) {
			if (serviceContext == null) {
				wraApplicationStage.setCreateDate(date);
			}
			else {
				wraApplicationStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!wraApplicationStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				wraApplicationStage.setModifiedDate(date);
			}
			else {
				wraApplicationStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(wraApplicationStage);
			}
			else {
				wraApplicationStage = (WraApplicationStage)session.merge(
					wraApplicationStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			WraApplicationStageImpl.class, wraApplicationStageModelImpl, false,
			true);

		cacheUniqueFindersCache(wraApplicationStageModelImpl);

		if (isNew) {
			wraApplicationStage.setNew(false);
		}

		wraApplicationStage.resetOriginalValues();

		return wraApplicationStage;
	}

	/**
	 * Returns the wra application stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the wra application stage
	 * @return the wra application stage
	 * @throws NoSuchWraApplicationStageException if a wra application stage with the primary key could not be found
	 */
	@Override
	public WraApplicationStage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchWraApplicationStageException {

		WraApplicationStage wraApplicationStage = fetchByPrimaryKey(primaryKey);

		if (wraApplicationStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchWraApplicationStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return wraApplicationStage;
	}

	/**
	 * Returns the wra application stage with the primary key or throws a <code>NoSuchWraApplicationStageException</code> if it could not be found.
	 *
	 * @param wraApplicationStageId the primary key of the wra application stage
	 * @return the wra application stage
	 * @throws NoSuchWraApplicationStageException if a wra application stage with the primary key could not be found
	 */
	@Override
	public WraApplicationStage findByPrimaryKey(long wraApplicationStageId)
		throws NoSuchWraApplicationStageException {

		return findByPrimaryKey((Serializable)wraApplicationStageId);
	}

	/**
	 * Returns the wra application stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wraApplicationStageId the primary key of the wra application stage
	 * @return the wra application stage, or <code>null</code> if a wra application stage with the primary key could not be found
	 */
	@Override
	public WraApplicationStage fetchByPrimaryKey(long wraApplicationStageId) {
		return fetchByPrimaryKey((Serializable)wraApplicationStageId);
	}

	/**
	 * Returns all the wra application stages.
	 *
	 * @return the wra application stages
	 */
	@Override
	public List<WraApplicationStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wra application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @return the range of wra application stages
	 */
	@Override
	public List<WraApplicationStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the wra application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wra application stages
	 */
	@Override
	public List<WraApplicationStage> findAll(
		int start, int end,
		OrderByComparator<WraApplicationStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the wra application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of wra application stages
	 */
	@Override
	public List<WraApplicationStage> findAll(
		int start, int end,
		OrderByComparator<WraApplicationStage> orderByComparator,
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

		List<WraApplicationStage> list = null;

		if (useFinderCache) {
			list = (List<WraApplicationStage>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_WRAAPPLICATIONSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_WRAAPPLICATIONSTAGE;

				sql = sql.concat(WraApplicationStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<WraApplicationStage>)QueryUtil.list(
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
	 * Removes all the wra application stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (WraApplicationStage wraApplicationStage : findAll()) {
			remove(wraApplicationStage);
		}
	}

	/**
	 * Returns the number of wra application stages.
	 *
	 * @return the number of wra application stages
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
					_SQL_COUNT_WRAAPPLICATIONSTAGE);

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
		return "wraApplicationStageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_WRAAPPLICATIONSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return WraApplicationStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the wra application stage persistence.
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

		_finderPathFetchBygetWra_By_AI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetWra_By_AI",
			new String[] {Long.class.getName()},
			new String[] {"wraApplicationId"}, true);

		_finderPathCountBygetWra_By_AI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetWra_By_AI",
			new String[] {Long.class.getName()},
			new String[] {"wraApplicationId"}, false);

		_finderPathFetchBygetWra_By_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetWra_By_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, true);

		_finderPathCountBygetWra_By_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetWra_By_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, false);

		_finderPathFetchBygetWra_By_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetWra_By_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageStatus", "stageName"}, true);

		_finderPathCountBygetWra_By_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetWra_By_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageStatus", "stageName"}, false);

		_finderPathFetchBygetWra_By_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetWra_By_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, true);

		_finderPathCountBygetWra_By_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetWra_By_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, false);

		_finderPathWithPaginationFindBygetWra_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetWra_By_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetWra_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetWra_By_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetWra_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetWra_By_CaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		_finderPathFetchByget_Wra_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByget_Wra_By_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountByget_Wra_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByget_Wra_By_CaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		_finderPathWithPaginationFindBygetWra_By_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetWra_By_StageName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"stageName"}, true);

		_finderPathWithoutPaginationFindBygetWra_By_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetWra_By_StageName", new String[] {String.class.getName()},
			new String[] {"stageName"}, true);

		_finderPathCountBygetWra_By_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetWra_By_StageName", new String[] {String.class.getName()},
			new String[] {"stageName"}, false);

		WraApplicationStageUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		WraApplicationStageUtil.setPersistence(null);

		entityCache.removeCache(WraApplicationStageImpl.class.getName());
	}

	@Override
	@Reference(
		target = WRA_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = WRA_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = WRA_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_WRAAPPLICATIONSTAGE =
		"SELECT wraApplicationStage FROM WraApplicationStage wraApplicationStage";

	private static final String _SQL_SELECT_WRAAPPLICATIONSTAGE_WHERE =
		"SELECT wraApplicationStage FROM WraApplicationStage wraApplicationStage WHERE ";

	private static final String _SQL_COUNT_WRAAPPLICATIONSTAGE =
		"SELECT COUNT(wraApplicationStage) FROM WraApplicationStage wraApplicationStage";

	private static final String _SQL_COUNT_WRAAPPLICATIONSTAGE_WHERE =
		"SELECT COUNT(wraApplicationStage) FROM WraApplicationStage wraApplicationStage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "wraApplicationStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No WraApplicationStage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No WraApplicationStage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		WraApplicationStagePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}