/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service.persistence.impl;

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

import com.nbp.wra.application.form.service.exception.NoSuchWRAAppCurrentStageException;
import com.nbp.wra.application.form.service.model.WRAAppCurrentStage;
import com.nbp.wra.application.form.service.model.WRAAppCurrentStageTable;
import com.nbp.wra.application.form.service.model.impl.WRAAppCurrentStageImpl;
import com.nbp.wra.application.form.service.model.impl.WRAAppCurrentStageModelImpl;
import com.nbp.wra.application.form.service.service.persistence.WRAAppCurrentStagePersistence;
import com.nbp.wra.application.form.service.service.persistence.WRAAppCurrentStageUtil;
import com.nbp.wra.application.form.service.service.persistence.impl.constants.WRA_APPLICATIONPersistenceConstants;

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
 * The persistence implementation for the wra app current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = WRAAppCurrentStagePersistence.class)
public class WRAAppCurrentStagePersistenceImpl
	extends BasePersistenceImpl<WRAAppCurrentStage>
	implements WRAAppCurrentStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>WRAAppCurrentStageUtil</code> to access the wra app current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		WRAAppCurrentStageImpl.class.getName();

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
	 * Returns all the wra app current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching wra app current stages
	 */
	@Override
	public List<WRAAppCurrentStage> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wra app current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of wra app current stages
	 * @param end the upper bound of the range of wra app current stages (not inclusive)
	 * @return the range of matching wra app current stages
	 */
	@Override
	public List<WRAAppCurrentStage> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the wra app current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of wra app current stages
	 * @param end the upper bound of the range of wra app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra app current stages
	 */
	@Override
	public List<WRAAppCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<WRAAppCurrentStage> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the wra app current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of wra app current stages
	 * @param end the upper bound of the range of wra app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra app current stages
	 */
	@Override
	public List<WRAAppCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<WRAAppCurrentStage> orderByComparator,
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

		List<WRAAppCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<WRAAppCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (WRAAppCurrentStage wraAppCurrentStage : list) {
					if (!uuid.equals(wraAppCurrentStage.getUuid())) {
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

			sb.append(_SQL_SELECT_WRAAPPCURRENTSTAGE_WHERE);

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
				sb.append(WRAAppCurrentStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<WRAAppCurrentStage>)QueryUtil.list(
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
	 * Returns the first wra app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra app current stage
	 * @throws NoSuchWRAAppCurrentStageException if a matching wra app current stage could not be found
	 */
	@Override
	public WRAAppCurrentStage findByUuid_First(
			String uuid,
			OrderByComparator<WRAAppCurrentStage> orderByComparator)
		throws NoSuchWRAAppCurrentStageException {

		WRAAppCurrentStage wraAppCurrentStage = fetchByUuid_First(
			uuid, orderByComparator);

		if (wraAppCurrentStage != null) {
			return wraAppCurrentStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchWRAAppCurrentStageException(sb.toString());
	}

	/**
	 * Returns the first wra app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra app current stage, or <code>null</code> if a matching wra app current stage could not be found
	 */
	@Override
	public WRAAppCurrentStage fetchByUuid_First(
		String uuid, OrderByComparator<WRAAppCurrentStage> orderByComparator) {

		List<WRAAppCurrentStage> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last wra app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra app current stage
	 * @throws NoSuchWRAAppCurrentStageException if a matching wra app current stage could not be found
	 */
	@Override
	public WRAAppCurrentStage findByUuid_Last(
			String uuid,
			OrderByComparator<WRAAppCurrentStage> orderByComparator)
		throws NoSuchWRAAppCurrentStageException {

		WRAAppCurrentStage wraAppCurrentStage = fetchByUuid_Last(
			uuid, orderByComparator);

		if (wraAppCurrentStage != null) {
			return wraAppCurrentStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchWRAAppCurrentStageException(sb.toString());
	}

	/**
	 * Returns the last wra app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra app current stage, or <code>null</code> if a matching wra app current stage could not be found
	 */
	@Override
	public WRAAppCurrentStage fetchByUuid_Last(
		String uuid, OrderByComparator<WRAAppCurrentStage> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<WRAAppCurrentStage> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the wra app current stages before and after the current wra app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param wraAppCurrentStageId the primary key of the current wra app current stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra app current stage
	 * @throws NoSuchWRAAppCurrentStageException if a wra app current stage with the primary key could not be found
	 */
	@Override
	public WRAAppCurrentStage[] findByUuid_PrevAndNext(
			long wraAppCurrentStageId, String uuid,
			OrderByComparator<WRAAppCurrentStage> orderByComparator)
		throws NoSuchWRAAppCurrentStageException {

		uuid = Objects.toString(uuid, "");

		WRAAppCurrentStage wraAppCurrentStage = findByPrimaryKey(
			wraAppCurrentStageId);

		Session session = null;

		try {
			session = openSession();

			WRAAppCurrentStage[] array = new WRAAppCurrentStageImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, wraAppCurrentStage, uuid, orderByComparator, true);

			array[1] = wraAppCurrentStage;

			array[2] = getByUuid_PrevAndNext(
				session, wraAppCurrentStage, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected WRAAppCurrentStage getByUuid_PrevAndNext(
		Session session, WRAAppCurrentStage wraAppCurrentStage, String uuid,
		OrderByComparator<WRAAppCurrentStage> orderByComparator,
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

		sb.append(_SQL_SELECT_WRAAPPCURRENTSTAGE_WHERE);

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
			sb.append(WRAAppCurrentStageModelImpl.ORDER_BY_JPQL);
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
						wraAppCurrentStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<WRAAppCurrentStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the wra app current stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (WRAAppCurrentStage wraAppCurrentStage :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(wraAppCurrentStage);
		}
	}

	/**
	 * Returns the number of wra app current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching wra app current stages
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_WRAAPPCURRENTSTAGE_WHERE);

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
		"wraAppCurrentStage.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(wraAppCurrentStage.uuid IS NULL OR wraAppCurrentStage.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the wra app current stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchWRAAppCurrentStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching wra app current stage
	 * @throws NoSuchWRAAppCurrentStageException if a matching wra app current stage could not be found
	 */
	@Override
	public WRAAppCurrentStage findByUUID_G(String uuid, long groupId)
		throws NoSuchWRAAppCurrentStageException {

		WRAAppCurrentStage wraAppCurrentStage = fetchByUUID_G(uuid, groupId);

		if (wraAppCurrentStage == null) {
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

			throw new NoSuchWRAAppCurrentStageException(sb.toString());
		}

		return wraAppCurrentStage;
	}

	/**
	 * Returns the wra app current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching wra app current stage, or <code>null</code> if a matching wra app current stage could not be found
	 */
	@Override
	public WRAAppCurrentStage fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the wra app current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra app current stage, or <code>null</code> if a matching wra app current stage could not be found
	 */
	@Override
	public WRAAppCurrentStage fetchByUUID_G(
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

		if (result instanceof WRAAppCurrentStage) {
			WRAAppCurrentStage wraAppCurrentStage = (WRAAppCurrentStage)result;

			if (!Objects.equals(uuid, wraAppCurrentStage.getUuid()) ||
				(groupId != wraAppCurrentStage.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_WRAAPPCURRENTSTAGE_WHERE);

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

				List<WRAAppCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					WRAAppCurrentStage wraAppCurrentStage = list.get(0);

					result = wraAppCurrentStage;

					cacheResult(wraAppCurrentStage);
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
			return (WRAAppCurrentStage)result;
		}
	}

	/**
	 * Removes the wra app current stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the wra app current stage that was removed
	 */
	@Override
	public WRAAppCurrentStage removeByUUID_G(String uuid, long groupId)
		throws NoSuchWRAAppCurrentStageException {

		WRAAppCurrentStage wraAppCurrentStage = findByUUID_G(uuid, groupId);

		return remove(wraAppCurrentStage);
	}

	/**
	 * Returns the number of wra app current stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching wra app current stages
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_WRAAPPCURRENTSTAGE_WHERE);

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
		"wraAppCurrentStage.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(wraAppCurrentStage.uuid IS NULL OR wraAppCurrentStage.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"wraAppCurrentStage.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the wra app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching wra app current stages
	 */
	@Override
	public List<WRAAppCurrentStage> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wra app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of wra app current stages
	 * @param end the upper bound of the range of wra app current stages (not inclusive)
	 * @return the range of matching wra app current stages
	 */
	@Override
	public List<WRAAppCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the wra app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of wra app current stages
	 * @param end the upper bound of the range of wra app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra app current stages
	 */
	@Override
	public List<WRAAppCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<WRAAppCurrentStage> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the wra app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of wra app current stages
	 * @param end the upper bound of the range of wra app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra app current stages
	 */
	@Override
	public List<WRAAppCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<WRAAppCurrentStage> orderByComparator,
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

		List<WRAAppCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<WRAAppCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (WRAAppCurrentStage wraAppCurrentStage : list) {
					if (!uuid.equals(wraAppCurrentStage.getUuid()) ||
						(companyId != wraAppCurrentStage.getCompanyId())) {

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

			sb.append(_SQL_SELECT_WRAAPPCURRENTSTAGE_WHERE);

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
				sb.append(WRAAppCurrentStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<WRAAppCurrentStage>)QueryUtil.list(
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
	 * Returns the first wra app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra app current stage
	 * @throws NoSuchWRAAppCurrentStageException if a matching wra app current stage could not be found
	 */
	@Override
	public WRAAppCurrentStage findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<WRAAppCurrentStage> orderByComparator)
		throws NoSuchWRAAppCurrentStageException {

		WRAAppCurrentStage wraAppCurrentStage = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (wraAppCurrentStage != null) {
			return wraAppCurrentStage;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchWRAAppCurrentStageException(sb.toString());
	}

	/**
	 * Returns the first wra app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra app current stage, or <code>null</code> if a matching wra app current stage could not be found
	 */
	@Override
	public WRAAppCurrentStage fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<WRAAppCurrentStage> orderByComparator) {

		List<WRAAppCurrentStage> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last wra app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra app current stage
	 * @throws NoSuchWRAAppCurrentStageException if a matching wra app current stage could not be found
	 */
	@Override
	public WRAAppCurrentStage findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<WRAAppCurrentStage> orderByComparator)
		throws NoSuchWRAAppCurrentStageException {

		WRAAppCurrentStage wraAppCurrentStage = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (wraAppCurrentStage != null) {
			return wraAppCurrentStage;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchWRAAppCurrentStageException(sb.toString());
	}

	/**
	 * Returns the last wra app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra app current stage, or <code>null</code> if a matching wra app current stage could not be found
	 */
	@Override
	public WRAAppCurrentStage fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<WRAAppCurrentStage> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<WRAAppCurrentStage> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the wra app current stages before and after the current wra app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param wraAppCurrentStageId the primary key of the current wra app current stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra app current stage
	 * @throws NoSuchWRAAppCurrentStageException if a wra app current stage with the primary key could not be found
	 */
	@Override
	public WRAAppCurrentStage[] findByUuid_C_PrevAndNext(
			long wraAppCurrentStageId, String uuid, long companyId,
			OrderByComparator<WRAAppCurrentStage> orderByComparator)
		throws NoSuchWRAAppCurrentStageException {

		uuid = Objects.toString(uuid, "");

		WRAAppCurrentStage wraAppCurrentStage = findByPrimaryKey(
			wraAppCurrentStageId);

		Session session = null;

		try {
			session = openSession();

			WRAAppCurrentStage[] array = new WRAAppCurrentStageImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, wraAppCurrentStage, uuid, companyId, orderByComparator,
				true);

			array[1] = wraAppCurrentStage;

			array[2] = getByUuid_C_PrevAndNext(
				session, wraAppCurrentStage, uuid, companyId, orderByComparator,
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

	protected WRAAppCurrentStage getByUuid_C_PrevAndNext(
		Session session, WRAAppCurrentStage wraAppCurrentStage, String uuid,
		long companyId, OrderByComparator<WRAAppCurrentStage> orderByComparator,
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

		sb.append(_SQL_SELECT_WRAAPPCURRENTSTAGE_WHERE);

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
			sb.append(WRAAppCurrentStageModelImpl.ORDER_BY_JPQL);
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
						wraAppCurrentStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<WRAAppCurrentStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the wra app current stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (WRAAppCurrentStage wraAppCurrentStage :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(wraAppCurrentStage);
		}
	}

	/**
	 * Returns the number of wra app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching wra app current stages
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_WRAAPPCURRENTSTAGE_WHERE);

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
		"wraAppCurrentStage.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(wraAppCurrentStage.uuid IS NULL OR wraAppCurrentStage.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"wraAppCurrentStage.companyId = ?";

	private FinderPath _finderPathFetchBygetByWRA_Stage;
	private FinderPath _finderPathCountBygetByWRA_Stage;

	/**
	 * Returns the wra app current stage where wraApplicationId = &#63; or throws a <code>NoSuchWRAAppCurrentStageException</code> if it could not be found.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra app current stage
	 * @throws NoSuchWRAAppCurrentStageException if a matching wra app current stage could not be found
	 */
	@Override
	public WRAAppCurrentStage findBygetByWRA_Stage(long wraApplicationId)
		throws NoSuchWRAAppCurrentStageException {

		WRAAppCurrentStage wraAppCurrentStage = fetchBygetByWRA_Stage(
			wraApplicationId);

		if (wraAppCurrentStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("wraApplicationId=");
			sb.append(wraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchWRAAppCurrentStageException(sb.toString());
		}

		return wraAppCurrentStage;
	}

	/**
	 * Returns the wra app current stage where wraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra app current stage, or <code>null</code> if a matching wra app current stage could not be found
	 */
	@Override
	public WRAAppCurrentStage fetchBygetByWRA_Stage(long wraApplicationId) {
		return fetchBygetByWRA_Stage(wraApplicationId, true);
	}

	/**
	 * Returns the wra app current stage where wraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra app current stage, or <code>null</code> if a matching wra app current stage could not be found
	 */
	@Override
	public WRAAppCurrentStage fetchBygetByWRA_Stage(
		long wraApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {wraApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetByWRA_Stage, finderArgs, this);
		}

		if (result instanceof WRAAppCurrentStage) {
			WRAAppCurrentStage wraAppCurrentStage = (WRAAppCurrentStage)result;

			if (wraApplicationId != wraAppCurrentStage.getWraApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_WRAAPPCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETBYWRA_STAGE_WRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(wraApplicationId);

				List<WRAAppCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetByWRA_Stage, finderArgs, list);
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
								"WRAAppCurrentStagePersistenceImpl.fetchBygetByWRA_Stage(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					WRAAppCurrentStage wraAppCurrentStage = list.get(0);

					result = wraAppCurrentStage;

					cacheResult(wraAppCurrentStage);
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
			return (WRAAppCurrentStage)result;
		}
	}

	/**
	 * Removes the wra app current stage where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the wra app current stage that was removed
	 */
	@Override
	public WRAAppCurrentStage removeBygetByWRA_Stage(long wraApplicationId)
		throws NoSuchWRAAppCurrentStageException {

		WRAAppCurrentStage wraAppCurrentStage = findBygetByWRA_Stage(
			wraApplicationId);

		return remove(wraAppCurrentStage);
	}

	/**
	 * Returns the number of wra app current stages where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching wra app current stages
	 */
	@Override
	public int countBygetByWRA_Stage(long wraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetByWRA_Stage;

		Object[] finderArgs = new Object[] {wraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_WRAAPPCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETBYWRA_STAGE_WRAAPPLICATIONID_2);

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

	private static final String
		_FINDER_COLUMN_GETBYWRA_STAGE_WRAAPPLICATIONID_2 =
			"wraAppCurrentStage.wraApplicationId = ?";

	public WRAAppCurrentStagePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(WRAAppCurrentStage.class);

		setModelImplClass(WRAAppCurrentStageImpl.class);
		setModelPKClass(long.class);

		setTable(WRAAppCurrentStageTable.INSTANCE);
	}

	/**
	 * Caches the wra app current stage in the entity cache if it is enabled.
	 *
	 * @param wraAppCurrentStage the wra app current stage
	 */
	@Override
	public void cacheResult(WRAAppCurrentStage wraAppCurrentStage) {
		entityCache.putResult(
			WRAAppCurrentStageImpl.class, wraAppCurrentStage.getPrimaryKey(),
			wraAppCurrentStage);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				wraAppCurrentStage.getUuid(), wraAppCurrentStage.getGroupId()
			},
			wraAppCurrentStage);

		finderCache.putResult(
			_finderPathFetchBygetByWRA_Stage,
			new Object[] {wraAppCurrentStage.getWraApplicationId()},
			wraAppCurrentStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the wra app current stages in the entity cache if it is enabled.
	 *
	 * @param wraAppCurrentStages the wra app current stages
	 */
	@Override
	public void cacheResult(List<WRAAppCurrentStage> wraAppCurrentStages) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (wraAppCurrentStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (WRAAppCurrentStage wraAppCurrentStage : wraAppCurrentStages) {
			if (entityCache.getResult(
					WRAAppCurrentStageImpl.class,
					wraAppCurrentStage.getPrimaryKey()) == null) {

				cacheResult(wraAppCurrentStage);
			}
		}
	}

	/**
	 * Clears the cache for all wra app current stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(WRAAppCurrentStageImpl.class);

		finderCache.clearCache(WRAAppCurrentStageImpl.class);
	}

	/**
	 * Clears the cache for the wra app current stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(WRAAppCurrentStage wraAppCurrentStage) {
		entityCache.removeResult(
			WRAAppCurrentStageImpl.class, wraAppCurrentStage);
	}

	@Override
	public void clearCache(List<WRAAppCurrentStage> wraAppCurrentStages) {
		for (WRAAppCurrentStage wraAppCurrentStage : wraAppCurrentStages) {
			entityCache.removeResult(
				WRAAppCurrentStageImpl.class, wraAppCurrentStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(WRAAppCurrentStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(WRAAppCurrentStageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		WRAAppCurrentStageModelImpl wraAppCurrentStageModelImpl) {

		Object[] args = new Object[] {
			wraAppCurrentStageModelImpl.getUuid(),
			wraAppCurrentStageModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, wraAppCurrentStageModelImpl);

		args = new Object[] {wraAppCurrentStageModelImpl.getWraApplicationId()};

		finderCache.putResult(
			_finderPathCountBygetByWRA_Stage, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetByWRA_Stage, args,
			wraAppCurrentStageModelImpl);
	}

	/**
	 * Creates a new wra app current stage with the primary key. Does not add the wra app current stage to the database.
	 *
	 * @param wraAppCurrentStageId the primary key for the new wra app current stage
	 * @return the new wra app current stage
	 */
	@Override
	public WRAAppCurrentStage create(long wraAppCurrentStageId) {
		WRAAppCurrentStage wraAppCurrentStage = new WRAAppCurrentStageImpl();

		wraAppCurrentStage.setNew(true);
		wraAppCurrentStage.setPrimaryKey(wraAppCurrentStageId);

		String uuid = PortalUUIDUtil.generate();

		wraAppCurrentStage.setUuid(uuid);

		wraAppCurrentStage.setCompanyId(CompanyThreadLocal.getCompanyId());

		return wraAppCurrentStage;
	}

	/**
	 * Removes the wra app current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wraAppCurrentStageId the primary key of the wra app current stage
	 * @return the wra app current stage that was removed
	 * @throws NoSuchWRAAppCurrentStageException if a wra app current stage with the primary key could not be found
	 */
	@Override
	public WRAAppCurrentStage remove(long wraAppCurrentStageId)
		throws NoSuchWRAAppCurrentStageException {

		return remove((Serializable)wraAppCurrentStageId);
	}

	/**
	 * Removes the wra app current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the wra app current stage
	 * @return the wra app current stage that was removed
	 * @throws NoSuchWRAAppCurrentStageException if a wra app current stage with the primary key could not be found
	 */
	@Override
	public WRAAppCurrentStage remove(Serializable primaryKey)
		throws NoSuchWRAAppCurrentStageException {

		Session session = null;

		try {
			session = openSession();

			WRAAppCurrentStage wraAppCurrentStage =
				(WRAAppCurrentStage)session.get(
					WRAAppCurrentStageImpl.class, primaryKey);

			if (wraAppCurrentStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchWRAAppCurrentStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(wraAppCurrentStage);
		}
		catch (NoSuchWRAAppCurrentStageException noSuchEntityException) {
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
	protected WRAAppCurrentStage removeImpl(
		WRAAppCurrentStage wraAppCurrentStage) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(wraAppCurrentStage)) {
				wraAppCurrentStage = (WRAAppCurrentStage)session.get(
					WRAAppCurrentStageImpl.class,
					wraAppCurrentStage.getPrimaryKeyObj());
			}

			if (wraAppCurrentStage != null) {
				session.delete(wraAppCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (wraAppCurrentStage != null) {
			clearCache(wraAppCurrentStage);
		}

		return wraAppCurrentStage;
	}

	@Override
	public WRAAppCurrentStage updateImpl(
		WRAAppCurrentStage wraAppCurrentStage) {

		boolean isNew = wraAppCurrentStage.isNew();

		if (!(wraAppCurrentStage instanceof WRAAppCurrentStageModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(wraAppCurrentStage.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					wraAppCurrentStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in wraAppCurrentStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom WRAAppCurrentStage implementation " +
					wraAppCurrentStage.getClass());
		}

		WRAAppCurrentStageModelImpl wraAppCurrentStageModelImpl =
			(WRAAppCurrentStageModelImpl)wraAppCurrentStage;

		if (Validator.isNull(wraAppCurrentStage.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			wraAppCurrentStage.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (wraAppCurrentStage.getCreateDate() == null)) {
			if (serviceContext == null) {
				wraAppCurrentStage.setCreateDate(date);
			}
			else {
				wraAppCurrentStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!wraAppCurrentStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				wraAppCurrentStage.setModifiedDate(date);
			}
			else {
				wraAppCurrentStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(wraAppCurrentStage);
			}
			else {
				wraAppCurrentStage = (WRAAppCurrentStage)session.merge(
					wraAppCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			WRAAppCurrentStageImpl.class, wraAppCurrentStageModelImpl, false,
			true);

		cacheUniqueFindersCache(wraAppCurrentStageModelImpl);

		if (isNew) {
			wraAppCurrentStage.setNew(false);
		}

		wraAppCurrentStage.resetOriginalValues();

		return wraAppCurrentStage;
	}

	/**
	 * Returns the wra app current stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the wra app current stage
	 * @return the wra app current stage
	 * @throws NoSuchWRAAppCurrentStageException if a wra app current stage with the primary key could not be found
	 */
	@Override
	public WRAAppCurrentStage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchWRAAppCurrentStageException {

		WRAAppCurrentStage wraAppCurrentStage = fetchByPrimaryKey(primaryKey);

		if (wraAppCurrentStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchWRAAppCurrentStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return wraAppCurrentStage;
	}

	/**
	 * Returns the wra app current stage with the primary key or throws a <code>NoSuchWRAAppCurrentStageException</code> if it could not be found.
	 *
	 * @param wraAppCurrentStageId the primary key of the wra app current stage
	 * @return the wra app current stage
	 * @throws NoSuchWRAAppCurrentStageException if a wra app current stage with the primary key could not be found
	 */
	@Override
	public WRAAppCurrentStage findByPrimaryKey(long wraAppCurrentStageId)
		throws NoSuchWRAAppCurrentStageException {

		return findByPrimaryKey((Serializable)wraAppCurrentStageId);
	}

	/**
	 * Returns the wra app current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wraAppCurrentStageId the primary key of the wra app current stage
	 * @return the wra app current stage, or <code>null</code> if a wra app current stage with the primary key could not be found
	 */
	@Override
	public WRAAppCurrentStage fetchByPrimaryKey(long wraAppCurrentStageId) {
		return fetchByPrimaryKey((Serializable)wraAppCurrentStageId);
	}

	/**
	 * Returns all the wra app current stages.
	 *
	 * @return the wra app current stages
	 */
	@Override
	public List<WRAAppCurrentStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wra app current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra app current stages
	 * @param end the upper bound of the range of wra app current stages (not inclusive)
	 * @return the range of wra app current stages
	 */
	@Override
	public List<WRAAppCurrentStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the wra app current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra app current stages
	 * @param end the upper bound of the range of wra app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wra app current stages
	 */
	@Override
	public List<WRAAppCurrentStage> findAll(
		int start, int end,
		OrderByComparator<WRAAppCurrentStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the wra app current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra app current stages
	 * @param end the upper bound of the range of wra app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of wra app current stages
	 */
	@Override
	public List<WRAAppCurrentStage> findAll(
		int start, int end,
		OrderByComparator<WRAAppCurrentStage> orderByComparator,
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

		List<WRAAppCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<WRAAppCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_WRAAPPCURRENTSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_WRAAPPCURRENTSTAGE;

				sql = sql.concat(WRAAppCurrentStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<WRAAppCurrentStage>)QueryUtil.list(
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
	 * Removes all the wra app current stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (WRAAppCurrentStage wraAppCurrentStage : findAll()) {
			remove(wraAppCurrentStage);
		}
	}

	/**
	 * Returns the number of wra app current stages.
	 *
	 * @return the number of wra app current stages
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
					_SQL_COUNT_WRAAPPCURRENTSTAGE);

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
		return "wraAppCurrentStageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_WRAAPPCURRENTSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return WRAAppCurrentStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the wra app current stage persistence.
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

		_finderPathFetchBygetByWRA_Stage = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetByWRA_Stage",
			new String[] {Long.class.getName()},
			new String[] {"wraApplicationId"}, true);

		_finderPathCountBygetByWRA_Stage = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetByWRA_Stage",
			new String[] {Long.class.getName()},
			new String[] {"wraApplicationId"}, false);

		WRAAppCurrentStageUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		WRAAppCurrentStageUtil.setPersistence(null);

		entityCache.removeCache(WRAAppCurrentStageImpl.class.getName());
	}

	@Override
	@Reference(
		target = WRA_APPLICATIONPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = WRA_APPLICATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = WRA_APPLICATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_WRAAPPCURRENTSTAGE =
		"SELECT wraAppCurrentStage FROM WRAAppCurrentStage wraAppCurrentStage";

	private static final String _SQL_SELECT_WRAAPPCURRENTSTAGE_WHERE =
		"SELECT wraAppCurrentStage FROM WRAAppCurrentStage wraAppCurrentStage WHERE ";

	private static final String _SQL_COUNT_WRAAPPCURRENTSTAGE =
		"SELECT COUNT(wraAppCurrentStage) FROM WRAAppCurrentStage wraAppCurrentStage";

	private static final String _SQL_COUNT_WRAAPPCURRENTSTAGE_WHERE =
		"SELECT COUNT(wraAppCurrentStage) FROM WRAAppCurrentStage wraAppCurrentStage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "wraAppCurrentStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No WRAAppCurrentStage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No WRAAppCurrentStage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		WRAAppCurrentStagePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}