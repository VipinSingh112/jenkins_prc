/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.service.persistence.impl;

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

import com.nbp.quarry.stage.service.exception.NoSuchQuarryApplicationStageException;
import com.nbp.quarry.stage.service.model.QuarryApplicationStage;
import com.nbp.quarry.stage.service.model.QuarryApplicationStageTable;
import com.nbp.quarry.stage.service.model.impl.QuarryApplicationStageImpl;
import com.nbp.quarry.stage.service.model.impl.QuarryApplicationStageModelImpl;
import com.nbp.quarry.stage.service.service.persistence.QuarryApplicationStagePersistence;
import com.nbp.quarry.stage.service.service.persistence.QuarryApplicationStageUtil;
import com.nbp.quarry.stage.service.service.persistence.impl.constants.QUARRY_STAGEPersistenceConstants;

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
 * The persistence implementation for the quarry application stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = QuarryApplicationStagePersistence.class)
public class QuarryApplicationStagePersistenceImpl
	extends BasePersistenceImpl<QuarryApplicationStage>
	implements QuarryApplicationStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>QuarryApplicationStageUtil</code> to access the quarry application stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		QuarryApplicationStageImpl.class.getName();

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
	 * Returns all the quarry application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching quarry application stages
	 */
	@Override
	public List<QuarryApplicationStage> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarry application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @return the range of matching quarry application stages
	 */
	@Override
	public List<QuarryApplicationStage> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry application stages
	 */
	@Override
	public List<QuarryApplicationStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<QuarryApplicationStage> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarry application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry application stages
	 */
	@Override
	public List<QuarryApplicationStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<QuarryApplicationStage> orderByComparator,
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

		List<QuarryApplicationStage> list = null;

		if (useFinderCache) {
			list = (List<QuarryApplicationStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QuarryApplicationStage quarryApplicationStage : list) {
					if (!uuid.equals(quarryApplicationStage.getUuid())) {
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

			sb.append(_SQL_SELECT_QUARRYAPPLICATIONSTAGE_WHERE);

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
				sb.append(QuarryApplicationStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<QuarryApplicationStage>)QueryUtil.list(
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
	 * Returns the first quarry application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage findByUuid_First(
			String uuid,
			OrderByComparator<QuarryApplicationStage> orderByComparator)
		throws NoSuchQuarryApplicationStageException {

		QuarryApplicationStage quarryApplicationStage = fetchByUuid_First(
			uuid, orderByComparator);

		if (quarryApplicationStage != null) {
			return quarryApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchQuarryApplicationStageException(sb.toString());
	}

	/**
	 * Returns the first quarry application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage fetchByUuid_First(
		String uuid,
		OrderByComparator<QuarryApplicationStage> orderByComparator) {

		List<QuarryApplicationStage> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last quarry application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage findByUuid_Last(
			String uuid,
			OrderByComparator<QuarryApplicationStage> orderByComparator)
		throws NoSuchQuarryApplicationStageException {

		QuarryApplicationStage quarryApplicationStage = fetchByUuid_Last(
			uuid, orderByComparator);

		if (quarryApplicationStage != null) {
			return quarryApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchQuarryApplicationStageException(sb.toString());
	}

	/**
	 * Returns the last quarry application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage fetchByUuid_Last(
		String uuid,
		OrderByComparator<QuarryApplicationStage> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<QuarryApplicationStage> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the quarry application stages before and after the current quarry application stage in the ordered set where uuid = &#63;.
	 *
	 * @param quarryAppStagesId the primary key of the current quarry application stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a quarry application stage with the primary key could not be found
	 */
	@Override
	public QuarryApplicationStage[] findByUuid_PrevAndNext(
			long quarryAppStagesId, String uuid,
			OrderByComparator<QuarryApplicationStage> orderByComparator)
		throws NoSuchQuarryApplicationStageException {

		uuid = Objects.toString(uuid, "");

		QuarryApplicationStage quarryApplicationStage = findByPrimaryKey(
			quarryAppStagesId);

		Session session = null;

		try {
			session = openSession();

			QuarryApplicationStage[] array = new QuarryApplicationStageImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, quarryApplicationStage, uuid, orderByComparator, true);

			array[1] = quarryApplicationStage;

			array[2] = getByUuid_PrevAndNext(
				session, quarryApplicationStage, uuid, orderByComparator,
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

	protected QuarryApplicationStage getByUuid_PrevAndNext(
		Session session, QuarryApplicationStage quarryApplicationStage,
		String uuid,
		OrderByComparator<QuarryApplicationStage> orderByComparator,
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

		sb.append(_SQL_SELECT_QUARRYAPPLICATIONSTAGE_WHERE);

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
			sb.append(QuarryApplicationStageModelImpl.ORDER_BY_JPQL);
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
						quarryApplicationStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QuarryApplicationStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the quarry application stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (QuarryApplicationStage quarryApplicationStage :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(quarryApplicationStage);
		}
	}

	/**
	 * Returns the number of quarry application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching quarry application stages
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUARRYAPPLICATIONSTAGE_WHERE);

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
		"quarryApplicationStage.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(quarryApplicationStage.uuid IS NULL OR quarryApplicationStage.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the quarry application stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchQuarryApplicationStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage findByUUID_G(String uuid, long groupId)
		throws NoSuchQuarryApplicationStageException {

		QuarryApplicationStage quarryApplicationStage = fetchByUUID_G(
			uuid, groupId);

		if (quarryApplicationStage == null) {
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

			throw new NoSuchQuarryApplicationStageException(sb.toString());
		}

		return quarryApplicationStage;
	}

	/**
	 * Returns the quarry application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the quarry application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage fetchByUUID_G(
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

		if (result instanceof QuarryApplicationStage) {
			QuarryApplicationStage quarryApplicationStage =
				(QuarryApplicationStage)result;

			if (!Objects.equals(uuid, quarryApplicationStage.getUuid()) ||
				(groupId != quarryApplicationStage.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_QUARRYAPPLICATIONSTAGE_WHERE);

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

				List<QuarryApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					QuarryApplicationStage quarryApplicationStage = list.get(0);

					result = quarryApplicationStage;

					cacheResult(quarryApplicationStage);
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
			return (QuarryApplicationStage)result;
		}
	}

	/**
	 * Removes the quarry application stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the quarry application stage that was removed
	 */
	@Override
	public QuarryApplicationStage removeByUUID_G(String uuid, long groupId)
		throws NoSuchQuarryApplicationStageException {

		QuarryApplicationStage quarryApplicationStage = findByUUID_G(
			uuid, groupId);

		return remove(quarryApplicationStage);
	}

	/**
	 * Returns the number of quarry application stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching quarry application stages
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_QUARRYAPPLICATIONSTAGE_WHERE);

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
		"quarryApplicationStage.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(quarryApplicationStage.uuid IS NULL OR quarryApplicationStage.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"quarryApplicationStage.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the quarry application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching quarry application stages
	 */
	@Override
	public List<QuarryApplicationStage> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarry application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @return the range of matching quarry application stages
	 */
	@Override
	public List<QuarryApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry application stages
	 */
	@Override
	public List<QuarryApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<QuarryApplicationStage> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarry application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry application stages
	 */
	@Override
	public List<QuarryApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<QuarryApplicationStage> orderByComparator,
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

		List<QuarryApplicationStage> list = null;

		if (useFinderCache) {
			list = (List<QuarryApplicationStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QuarryApplicationStage quarryApplicationStage : list) {
					if (!uuid.equals(quarryApplicationStage.getUuid()) ||
						(companyId != quarryApplicationStage.getCompanyId())) {

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

			sb.append(_SQL_SELECT_QUARRYAPPLICATIONSTAGE_WHERE);

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
				sb.append(QuarryApplicationStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<QuarryApplicationStage>)QueryUtil.list(
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
	 * Returns the first quarry application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<QuarryApplicationStage> orderByComparator)
		throws NoSuchQuarryApplicationStageException {

		QuarryApplicationStage quarryApplicationStage = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (quarryApplicationStage != null) {
			return quarryApplicationStage;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchQuarryApplicationStageException(sb.toString());
	}

	/**
	 * Returns the first quarry application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<QuarryApplicationStage> orderByComparator) {

		List<QuarryApplicationStage> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last quarry application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<QuarryApplicationStage> orderByComparator)
		throws NoSuchQuarryApplicationStageException {

		QuarryApplicationStage quarryApplicationStage = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (quarryApplicationStage != null) {
			return quarryApplicationStage;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchQuarryApplicationStageException(sb.toString());
	}

	/**
	 * Returns the last quarry application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<QuarryApplicationStage> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<QuarryApplicationStage> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the quarry application stages before and after the current quarry application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param quarryAppStagesId the primary key of the current quarry application stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a quarry application stage with the primary key could not be found
	 */
	@Override
	public QuarryApplicationStage[] findByUuid_C_PrevAndNext(
			long quarryAppStagesId, String uuid, long companyId,
			OrderByComparator<QuarryApplicationStage> orderByComparator)
		throws NoSuchQuarryApplicationStageException {

		uuid = Objects.toString(uuid, "");

		QuarryApplicationStage quarryApplicationStage = findByPrimaryKey(
			quarryAppStagesId);

		Session session = null;

		try {
			session = openSession();

			QuarryApplicationStage[] array = new QuarryApplicationStageImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, quarryApplicationStage, uuid, companyId,
				orderByComparator, true);

			array[1] = quarryApplicationStage;

			array[2] = getByUuid_C_PrevAndNext(
				session, quarryApplicationStage, uuid, companyId,
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

	protected QuarryApplicationStage getByUuid_C_PrevAndNext(
		Session session, QuarryApplicationStage quarryApplicationStage,
		String uuid, long companyId,
		OrderByComparator<QuarryApplicationStage> orderByComparator,
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

		sb.append(_SQL_SELECT_QUARRYAPPLICATIONSTAGE_WHERE);

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
			sb.append(QuarryApplicationStageModelImpl.ORDER_BY_JPQL);
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
						quarryApplicationStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QuarryApplicationStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the quarry application stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (QuarryApplicationStage quarryApplicationStage :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(quarryApplicationStage);
		}
	}

	/**
	 * Returns the number of quarry application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching quarry application stages
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_QUARRYAPPLICATIONSTAGE_WHERE);

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
		"quarryApplicationStage.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(quarryApplicationStage.uuid IS NULL OR quarryApplicationStage.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"quarryApplicationStage.companyId = ?";

	private FinderPath _finderPathFetchBygetQuarry_AI;
	private FinderPath _finderPathCountBygetQuarry_AI;

	/**
	 * Returns the quarry application stage where quarryApplicationId = &#63; or throws a <code>NoSuchQuarryApplicationStageException</code> if it could not be found.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage findBygetQuarry_AI(long quarryApplicationId)
		throws NoSuchQuarryApplicationStageException {

		QuarryApplicationStage quarryApplicationStage = fetchBygetQuarry_AI(
			quarryApplicationId);

		if (quarryApplicationStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("quarryApplicationId=");
			sb.append(quarryApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchQuarryApplicationStageException(sb.toString());
		}

		return quarryApplicationStage;
	}

	/**
	 * Returns the quarry application stage where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage fetchBygetQuarry_AI(
		long quarryApplicationId) {

		return fetchBygetQuarry_AI(quarryApplicationId, true);
	}

	/**
	 * Returns the quarry application stage where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage fetchBygetQuarry_AI(
		long quarryApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {quarryApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetQuarry_AI, finderArgs, this);
		}

		if (result instanceof QuarryApplicationStage) {
			QuarryApplicationStage quarryApplicationStage =
				(QuarryApplicationStage)result;

			if (quarryApplicationId !=
					quarryApplicationStage.getQuarryApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_QUARRYAPPLICATIONSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETQUARRY_AI_QUARRYAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(quarryApplicationId);

				List<QuarryApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetQuarry_AI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {quarryApplicationId};
							}

							_log.warn(
								"QuarryApplicationStagePersistenceImpl.fetchBygetQuarry_AI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					QuarryApplicationStage quarryApplicationStage = list.get(0);

					result = quarryApplicationStage;

					cacheResult(quarryApplicationStage);
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
			return (QuarryApplicationStage)result;
		}
	}

	/**
	 * Removes the quarry application stage where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the quarry application stage that was removed
	 */
	@Override
	public QuarryApplicationStage removeBygetQuarry_AI(long quarryApplicationId)
		throws NoSuchQuarryApplicationStageException {

		QuarryApplicationStage quarryApplicationStage = findBygetQuarry_AI(
			quarryApplicationId);

		return remove(quarryApplicationStage);
	}

	/**
	 * Returns the number of quarry application stages where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry application stages
	 */
	@Override
	public int countBygetQuarry_AI(long quarryApplicationId) {
		FinderPath finderPath = _finderPathCountBygetQuarry_AI;

		Object[] finderArgs = new Object[] {quarryApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUARRYAPPLICATIONSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETQUARRY_AI_QUARRYAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(quarryApplicationId);

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
		_FINDER_COLUMN_GETQUARRY_AI_QUARRYAPPLICATIONID_2 =
			"quarryApplicationStage.quarryApplicationId = ?";

	private FinderPath _finderPathFetchBygetQuarry_By_CaseIdStageName;
	private FinderPath _finderPathCountBygetQuarry_By_CaseIdStageName;

	/**
	 * Returns the quarry application stage where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchQuarryApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage findBygetQuarry_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchQuarryApplicationStageException {

		QuarryApplicationStage quarryApplicationStage =
			fetchBygetQuarry_By_CaseIdStageName(caseId, stageName);

		if (quarryApplicationStage == null) {
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

			throw new NoSuchQuarryApplicationStageException(sb.toString());
		}

		return quarryApplicationStage;
	}

	/**
	 * Returns the quarry application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage fetchBygetQuarry_By_CaseIdStageName(
		String caseId, String stageName) {

		return fetchBygetQuarry_By_CaseIdStageName(caseId, stageName, true);
	}

	/**
	 * Returns the quarry application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage fetchBygetQuarry_By_CaseIdStageName(
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
				_finderPathFetchBygetQuarry_By_CaseIdStageName, finderArgs,
				this);
		}

		if (result instanceof QuarryApplicationStage) {
			QuarryApplicationStage quarryApplicationStage =
				(QuarryApplicationStage)result;

			if (!Objects.equals(caseId, quarryApplicationStage.getCaseId()) ||
				!Objects.equals(
					stageName, quarryApplicationStage.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_QUARRYAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRY_BY_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETQUARRY_BY_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETQUARRY_BY_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETQUARRY_BY_CASEIDSTAGENAME_STAGENAME_2);
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

				List<QuarryApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetQuarry_By_CaseIdStageName,
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
								"QuarryApplicationStagePersistenceImpl.fetchBygetQuarry_By_CaseIdStageName(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					QuarryApplicationStage quarryApplicationStage = list.get(0);

					result = quarryApplicationStage;

					cacheResult(quarryApplicationStage);
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
			return (QuarryApplicationStage)result;
		}
	}

	/**
	 * Removes the quarry application stage where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the quarry application stage that was removed
	 */
	@Override
	public QuarryApplicationStage removeBygetQuarry_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchQuarryApplicationStageException {

		QuarryApplicationStage quarryApplicationStage =
			findBygetQuarry_By_CaseIdStageName(caseId, stageName);

		return remove(quarryApplicationStage);
	}

	/**
	 * Returns the number of quarry application stages where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching quarry application stages
	 */
	@Override
	public int countBygetQuarry_By_CaseIdStageName(
		String caseId, String stageName) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetQuarry_By_CaseIdStageName;

		Object[] finderArgs = new Object[] {caseId, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_QUARRYAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRY_BY_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETQUARRY_BY_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETQUARRY_BY_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETQUARRY_BY_CASEIDSTAGENAME_STAGENAME_2);
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
		_FINDER_COLUMN_GETQUARRY_BY_CASEIDSTAGENAME_CASEID_2 =
			"quarryApplicationStage.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETQUARRY_BY_CASEIDSTAGENAME_CASEID_3 =
			"(quarryApplicationStage.caseId IS NULL OR quarryApplicationStage.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETQUARRY_BY_CASEIDSTAGENAME_STAGENAME_2 =
			"quarryApplicationStage.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETQUARRY_BY_CASEIDSTAGENAME_STAGENAME_3 =
			"(quarryApplicationStage.stageName IS NULL OR quarryApplicationStage.stageName = '')";

	private FinderPath _finderPathFetchBygetQuarry_By_CaseIdStageStatus;
	private FinderPath _finderPathCountBygetQuarry_By_CaseIdStageStatus;

	/**
	 * Returns the quarry application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchQuarryApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage findBygetQuarry_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchQuarryApplicationStageException {

		QuarryApplicationStage quarryApplicationStage =
			fetchBygetQuarry_By_CaseIdStageStatus(
				caseId, stageStatus, stageName);

		if (quarryApplicationStage == null) {
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

			throw new NoSuchQuarryApplicationStageException(sb.toString());
		}

		return quarryApplicationStage;
	}

	/**
	 * Returns the quarry application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage fetchBygetQuarry_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		return fetchBygetQuarry_By_CaseIdStageStatus(
			caseId, stageStatus, stageName, true);
	}

	/**
	 * Returns the quarry application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage fetchBygetQuarry_By_CaseIdStageStatus(
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
				_finderPathFetchBygetQuarry_By_CaseIdStageStatus, finderArgs,
				this);
		}

		if (result instanceof QuarryApplicationStage) {
			QuarryApplicationStage quarryApplicationStage =
				(QuarryApplicationStage)result;

			if (!Objects.equals(caseId, quarryApplicationStage.getCaseId()) ||
				!Objects.equals(
					stageStatus, quarryApplicationStage.getStageStatus()) ||
				!Objects.equals(
					stageName, quarryApplicationStage.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_QUARRYAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETQUARRY_BY_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETQUARRY_BY_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETQUARRY_BY_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETQUARRY_BY_CASEIDSTAGESTATUS_STAGESTATUS_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETQUARRY_BY_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETQUARRY_BY_CASEIDSTAGESTATUS_STAGENAME_2);
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

				List<QuarryApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetQuarry_By_CaseIdStageStatus,
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
								"QuarryApplicationStagePersistenceImpl.fetchBygetQuarry_By_CaseIdStageStatus(String, String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					QuarryApplicationStage quarryApplicationStage = list.get(0);

					result = quarryApplicationStage;

					cacheResult(quarryApplicationStage);
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
			return (QuarryApplicationStage)result;
		}
	}

	/**
	 * Removes the quarry application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the quarry application stage that was removed
	 */
	@Override
	public QuarryApplicationStage removeBygetQuarry_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchQuarryApplicationStageException {

		QuarryApplicationStage quarryApplicationStage =
			findBygetQuarry_By_CaseIdStageStatus(
				caseId, stageStatus, stageName);

		return remove(quarryApplicationStage);
	}

	/**
	 * Returns the number of quarry application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching quarry application stages
	 */
	@Override
	public int countBygetQuarry_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath =
			_finderPathCountBygetQuarry_By_CaseIdStageStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_QUARRYAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETQUARRY_BY_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETQUARRY_BY_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETQUARRY_BY_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETQUARRY_BY_CASEIDSTAGESTATUS_STAGESTATUS_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETQUARRY_BY_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETQUARRY_BY_CASEIDSTAGESTATUS_STAGENAME_2);
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
		_FINDER_COLUMN_GETQUARRY_BY_CASEIDSTAGESTATUS_CASEID_2 =
			"quarryApplicationStage.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETQUARRY_BY_CASEIDSTAGESTATUS_CASEID_3 =
			"(quarryApplicationStage.caseId IS NULL OR quarryApplicationStage.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETQUARRY_BY_CASEIDSTAGESTATUS_STAGESTATUS_2 =
			"quarryApplicationStage.stageStatus = ? AND ";

	private static final String
		_FINDER_COLUMN_GETQUARRY_BY_CASEIDSTAGESTATUS_STAGESTATUS_3 =
			"(quarryApplicationStage.stageStatus IS NULL OR quarryApplicationStage.stageStatus = '') AND ";

	private static final String
		_FINDER_COLUMN_GETQUARRY_BY_CASEIDSTAGESTATUS_STAGENAME_2 =
			"quarryApplicationStage.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETQUARRY_BY_CASEIDSTAGESTATUS_STAGENAME_3 =
			"(quarryApplicationStage.stageName IS NULL OR quarryApplicationStage.stageName = '')";

	private FinderPath _finderPathFetchBygetQuarry_By_CaseIdAndStatus;
	private FinderPath _finderPathCountBygetQuarry_By_CaseIdAndStatus;

	/**
	 * Returns the quarry application stage where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchQuarryApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage findBygetQuarry_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchQuarryApplicationStageException {

		QuarryApplicationStage quarryApplicationStage =
			fetchBygetQuarry_By_CaseIdAndStatus(caseId, stageStatus);

		if (quarryApplicationStage == null) {
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

			throw new NoSuchQuarryApplicationStageException(sb.toString());
		}

		return quarryApplicationStage;
	}

	/**
	 * Returns the quarry application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage fetchBygetQuarry_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return fetchBygetQuarry_By_CaseIdAndStatus(caseId, stageStatus, true);
	}

	/**
	 * Returns the quarry application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage fetchBygetQuarry_By_CaseIdAndStatus(
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
				_finderPathFetchBygetQuarry_By_CaseIdAndStatus, finderArgs,
				this);
		}

		if (result instanceof QuarryApplicationStage) {
			QuarryApplicationStage quarryApplicationStage =
				(QuarryApplicationStage)result;

			if (!Objects.equals(caseId, quarryApplicationStage.getCaseId()) ||
				!Objects.equals(
					stageStatus, quarryApplicationStage.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_QUARRYAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRY_BY_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETQUARRY_BY_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETQUARRY_BY_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETQUARRY_BY_CASEIDANDSTATUS_STAGESTATUS_2);
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

				List<QuarryApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetQuarry_By_CaseIdAndStatus,
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
								"QuarryApplicationStagePersistenceImpl.fetchBygetQuarry_By_CaseIdAndStatus(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					QuarryApplicationStage quarryApplicationStage = list.get(0);

					result = quarryApplicationStage;

					cacheResult(quarryApplicationStage);
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
			return (QuarryApplicationStage)result;
		}
	}

	/**
	 * Removes the quarry application stage where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the quarry application stage that was removed
	 */
	@Override
	public QuarryApplicationStage removeBygetQuarry_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchQuarryApplicationStageException {

		QuarryApplicationStage quarryApplicationStage =
			findBygetQuarry_By_CaseIdAndStatus(caseId, stageStatus);

		return remove(quarryApplicationStage);
	}

	/**
	 * Returns the number of quarry application stages where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching quarry application stages
	 */
	@Override
	public int countBygetQuarry_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetQuarry_By_CaseIdAndStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_QUARRYAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRY_BY_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETQUARRY_BY_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETQUARRY_BY_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETQUARRY_BY_CASEIDANDSTATUS_STAGESTATUS_2);
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
		_FINDER_COLUMN_GETQUARRY_BY_CASEIDANDSTATUS_CASEID_2 =
			"quarryApplicationStage.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETQUARRY_BY_CASEIDANDSTATUS_CASEID_3 =
			"(quarryApplicationStage.caseId IS NULL OR quarryApplicationStage.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETQUARRY_BY_CASEIDANDSTATUS_STAGESTATUS_2 =
			"quarryApplicationStage.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETQUARRY_BY_CASEIDANDSTATUS_STAGESTATUS_3 =
			"(quarryApplicationStage.stageStatus IS NULL OR quarryApplicationStage.stageStatus = '')";

	private FinderPath _finderPathWithPaginationFindBygetQuarry_By_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetQuarry_By_CaseId;
	private FinderPath _finderPathCountBygetQuarry_By_CaseId;

	/**
	 * Returns all the quarry application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry application stages
	 */
	@Override
	public List<QuarryApplicationStage> findBygetQuarry_By_CaseId(
		String caseId) {

		return findBygetQuarry_By_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarry application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @return the range of matching quarry application stages
	 */
	@Override
	public List<QuarryApplicationStage> findBygetQuarry_By_CaseId(
		String caseId, int start, int end) {

		return findBygetQuarry_By_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry application stages
	 */
	@Override
	public List<QuarryApplicationStage> findBygetQuarry_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<QuarryApplicationStage> orderByComparator) {

		return findBygetQuarry_By_CaseId(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarry application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry application stages
	 */
	@Override
	public List<QuarryApplicationStage> findBygetQuarry_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<QuarryApplicationStage> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetQuarry_By_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetQuarry_By_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<QuarryApplicationStage> list = null;

		if (useFinderCache) {
			list = (List<QuarryApplicationStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QuarryApplicationStage quarryApplicationStage : list) {
					if (!caseId.equals(quarryApplicationStage.getCaseId())) {
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

			sb.append(_SQL_SELECT_QUARRYAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRY_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETQUARRY_BY_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(QuarryApplicationStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<QuarryApplicationStage>)QueryUtil.list(
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
	 * Returns the first quarry application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage findBygetQuarry_By_CaseId_First(
			String caseId,
			OrderByComparator<QuarryApplicationStage> orderByComparator)
		throws NoSuchQuarryApplicationStageException {

		QuarryApplicationStage quarryApplicationStage =
			fetchBygetQuarry_By_CaseId_First(caseId, orderByComparator);

		if (quarryApplicationStage != null) {
			return quarryApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchQuarryApplicationStageException(sb.toString());
	}

	/**
	 * Returns the first quarry application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage fetchBygetQuarry_By_CaseId_First(
		String caseId,
		OrderByComparator<QuarryApplicationStage> orderByComparator) {

		List<QuarryApplicationStage> list = findBygetQuarry_By_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last quarry application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage findBygetQuarry_By_CaseId_Last(
			String caseId,
			OrderByComparator<QuarryApplicationStage> orderByComparator)
		throws NoSuchQuarryApplicationStageException {

		QuarryApplicationStage quarryApplicationStage =
			fetchBygetQuarry_By_CaseId_Last(caseId, orderByComparator);

		if (quarryApplicationStage != null) {
			return quarryApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchQuarryApplicationStageException(sb.toString());
	}

	/**
	 * Returns the last quarry application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage fetchBygetQuarry_By_CaseId_Last(
		String caseId,
		OrderByComparator<QuarryApplicationStage> orderByComparator) {

		int count = countBygetQuarry_By_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<QuarryApplicationStage> list = findBygetQuarry_By_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the quarry application stages before and after the current quarry application stage in the ordered set where caseId = &#63;.
	 *
	 * @param quarryAppStagesId the primary key of the current quarry application stage
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a quarry application stage with the primary key could not be found
	 */
	@Override
	public QuarryApplicationStage[] findBygetQuarry_By_CaseId_PrevAndNext(
			long quarryAppStagesId, String caseId,
			OrderByComparator<QuarryApplicationStage> orderByComparator)
		throws NoSuchQuarryApplicationStageException {

		caseId = Objects.toString(caseId, "");

		QuarryApplicationStage quarryApplicationStage = findByPrimaryKey(
			quarryAppStagesId);

		Session session = null;

		try {
			session = openSession();

			QuarryApplicationStage[] array = new QuarryApplicationStageImpl[3];

			array[0] = getBygetQuarry_By_CaseId_PrevAndNext(
				session, quarryApplicationStage, caseId, orderByComparator,
				true);

			array[1] = quarryApplicationStage;

			array[2] = getBygetQuarry_By_CaseId_PrevAndNext(
				session, quarryApplicationStage, caseId, orderByComparator,
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

	protected QuarryApplicationStage getBygetQuarry_By_CaseId_PrevAndNext(
		Session session, QuarryApplicationStage quarryApplicationStage,
		String caseId,
		OrderByComparator<QuarryApplicationStage> orderByComparator,
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

		sb.append(_SQL_SELECT_QUARRYAPPLICATIONSTAGE_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETQUARRY_BY_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETQUARRY_BY_CASEID_CASEID_2);
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
			sb.append(QuarryApplicationStageModelImpl.ORDER_BY_JPQL);
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
						quarryApplicationStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QuarryApplicationStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the quarry application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetQuarry_By_CaseId(String caseId) {
		for (QuarryApplicationStage quarryApplicationStage :
				findBygetQuarry_By_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(quarryApplicationStage);
		}
	}

	/**
	 * Returns the number of quarry application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching quarry application stages
	 */
	@Override
	public int countBygetQuarry_By_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetQuarry_By_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUARRYAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRY_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETQUARRY_BY_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETQUARRY_BY_CASEID_CASEID_2 =
		"quarryApplicationStage.caseId = ?";

	private static final String _FINDER_COLUMN_GETQUARRY_BY_CASEID_CASEID_3 =
		"(quarryApplicationStage.caseId IS NULL OR quarryApplicationStage.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetQuarry_By_StageName;
	private FinderPath _finderPathWithoutPaginationFindBygetQuarry_By_StageName;
	private FinderPath _finderPathCountBygetQuarry_By_StageName;

	/**
	 * Returns all the quarry application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching quarry application stages
	 */
	@Override
	public List<QuarryApplicationStage> findBygetQuarry_By_StageName(
		String stageName) {

		return findBygetQuarry_By_StageName(
			stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarry application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @return the range of matching quarry application stages
	 */
	@Override
	public List<QuarryApplicationStage> findBygetQuarry_By_StageName(
		String stageName, int start, int end) {

		return findBygetQuarry_By_StageName(stageName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry application stages
	 */
	@Override
	public List<QuarryApplicationStage> findBygetQuarry_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<QuarryApplicationStage> orderByComparator) {

		return findBygetQuarry_By_StageName(
			stageName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarry application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry application stages
	 */
	@Override
	public List<QuarryApplicationStage> findBygetQuarry_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<QuarryApplicationStage> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetQuarry_By_StageName;
				finderArgs = new Object[] {stageName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetQuarry_By_StageName;
			finderArgs = new Object[] {
				stageName, start, end, orderByComparator
			};
		}

		List<QuarryApplicationStage> list = null;

		if (useFinderCache) {
			list = (List<QuarryApplicationStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QuarryApplicationStage quarryApplicationStage : list) {
					if (!stageName.equals(
							quarryApplicationStage.getStageName())) {

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

			sb.append(_SQL_SELECT_QUARRYAPPLICATIONSTAGE_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRY_BY_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETQUARRY_BY_STAGENAME_STAGENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(QuarryApplicationStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<QuarryApplicationStage>)QueryUtil.list(
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
	 * Returns the first quarry application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage findBygetQuarry_By_StageName_First(
			String stageName,
			OrderByComparator<QuarryApplicationStage> orderByComparator)
		throws NoSuchQuarryApplicationStageException {

		QuarryApplicationStage quarryApplicationStage =
			fetchBygetQuarry_By_StageName_First(stageName, orderByComparator);

		if (quarryApplicationStage != null) {
			return quarryApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchQuarryApplicationStageException(sb.toString());
	}

	/**
	 * Returns the first quarry application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage fetchBygetQuarry_By_StageName_First(
		String stageName,
		OrderByComparator<QuarryApplicationStage> orderByComparator) {

		List<QuarryApplicationStage> list = findBygetQuarry_By_StageName(
			stageName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last quarry application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage findBygetQuarry_By_StageName_Last(
			String stageName,
			OrderByComparator<QuarryApplicationStage> orderByComparator)
		throws NoSuchQuarryApplicationStageException {

		QuarryApplicationStage quarryApplicationStage =
			fetchBygetQuarry_By_StageName_Last(stageName, orderByComparator);

		if (quarryApplicationStage != null) {
			return quarryApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchQuarryApplicationStageException(sb.toString());
	}

	/**
	 * Returns the last quarry application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage fetchBygetQuarry_By_StageName_Last(
		String stageName,
		OrderByComparator<QuarryApplicationStage> orderByComparator) {

		int count = countBygetQuarry_By_StageName(stageName);

		if (count == 0) {
			return null;
		}

		List<QuarryApplicationStage> list = findBygetQuarry_By_StageName(
			stageName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the quarry application stages before and after the current quarry application stage in the ordered set where stageName = &#63;.
	 *
	 * @param quarryAppStagesId the primary key of the current quarry application stage
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a quarry application stage with the primary key could not be found
	 */
	@Override
	public QuarryApplicationStage[] findBygetQuarry_By_StageName_PrevAndNext(
			long quarryAppStagesId, String stageName,
			OrderByComparator<QuarryApplicationStage> orderByComparator)
		throws NoSuchQuarryApplicationStageException {

		stageName = Objects.toString(stageName, "");

		QuarryApplicationStage quarryApplicationStage = findByPrimaryKey(
			quarryAppStagesId);

		Session session = null;

		try {
			session = openSession();

			QuarryApplicationStage[] array = new QuarryApplicationStageImpl[3];

			array[0] = getBygetQuarry_By_StageName_PrevAndNext(
				session, quarryApplicationStage, stageName, orderByComparator,
				true);

			array[1] = quarryApplicationStage;

			array[2] = getBygetQuarry_By_StageName_PrevAndNext(
				session, quarryApplicationStage, stageName, orderByComparator,
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

	protected QuarryApplicationStage getBygetQuarry_By_StageName_PrevAndNext(
		Session session, QuarryApplicationStage quarryApplicationStage,
		String stageName,
		OrderByComparator<QuarryApplicationStage> orderByComparator,
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

		sb.append(_SQL_SELECT_QUARRYAPPLICATIONSTAGE_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETQUARRY_BY_STAGENAME_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETQUARRY_BY_STAGENAME_STAGENAME_2);
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
			sb.append(QuarryApplicationStageModelImpl.ORDER_BY_JPQL);
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
						quarryApplicationStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QuarryApplicationStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the quarry application stages where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	@Override
	public void removeBygetQuarry_By_StageName(String stageName) {
		for (QuarryApplicationStage quarryApplicationStage :
				findBygetQuarry_By_StageName(
					stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(quarryApplicationStage);
		}
	}

	/**
	 * Returns the number of quarry application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching quarry application stages
	 */
	@Override
	public int countBygetQuarry_By_StageName(String stageName) {
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetQuarry_By_StageName;

		Object[] finderArgs = new Object[] {stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUARRYAPPLICATIONSTAGE_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRY_BY_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETQUARRY_BY_STAGENAME_STAGENAME_2);
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
		_FINDER_COLUMN_GETQUARRY_BY_STAGENAME_STAGENAME_2 =
			"quarryApplicationStage.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETQUARRY_BY_STAGENAME_STAGENAME_3 =
			"(quarryApplicationStage.stageName IS NULL OR quarryApplicationStage.stageName = '')";

	private FinderPath _finderPathFetchBygetQuarry_CaseId;
	private FinderPath _finderPathCountBygetQuarry_CaseId;

	/**
	 * Returns the quarry application stage where caseId = &#63; or throws a <code>NoSuchQuarryApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage findBygetQuarry_CaseId(String caseId)
		throws NoSuchQuarryApplicationStageException {

		QuarryApplicationStage quarryApplicationStage = fetchBygetQuarry_CaseId(
			caseId);

		if (quarryApplicationStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchQuarryApplicationStageException(sb.toString());
		}

		return quarryApplicationStage;
	}

	/**
	 * Returns the quarry application stage where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage fetchBygetQuarry_CaseId(String caseId) {
		return fetchBygetQuarry_CaseId(caseId, true);
	}

	/**
	 * Returns the quarry application stage where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage fetchBygetQuarry_CaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetQuarry_CaseId, finderArgs, this);
		}

		if (result instanceof QuarryApplicationStage) {
			QuarryApplicationStage quarryApplicationStage =
				(QuarryApplicationStage)result;

			if (!Objects.equals(caseId, quarryApplicationStage.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_QUARRYAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETQUARRY_CASEID_CASEID_2);
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

				List<QuarryApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetQuarry_CaseId, finderArgs,
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
								"QuarryApplicationStagePersistenceImpl.fetchBygetQuarry_CaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					QuarryApplicationStage quarryApplicationStage = list.get(0);

					result = quarryApplicationStage;

					cacheResult(quarryApplicationStage);
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
			return (QuarryApplicationStage)result;
		}
	}

	/**
	 * Removes the quarry application stage where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the quarry application stage that was removed
	 */
	@Override
	public QuarryApplicationStage removeBygetQuarry_CaseId(String caseId)
		throws NoSuchQuarryApplicationStageException {

		QuarryApplicationStage quarryApplicationStage = findBygetQuarry_CaseId(
			caseId);

		return remove(quarryApplicationStage);
	}

	/**
	 * Returns the number of quarry application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching quarry application stages
	 */
	@Override
	public int countBygetQuarry_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetQuarry_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUARRYAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETQUARRY_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETQUARRY_CASEID_CASEID_2 =
		"quarryApplicationStage.caseId = ?";

	private static final String _FINDER_COLUMN_GETQUARRY_CASEID_CASEID_3 =
		"(quarryApplicationStage.caseId IS NULL OR quarryApplicationStage.caseId = '')";

	public QuarryApplicationStagePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(QuarryApplicationStage.class);

		setModelImplClass(QuarryApplicationStageImpl.class);
		setModelPKClass(long.class);

		setTable(QuarryApplicationStageTable.INSTANCE);
	}

	/**
	 * Caches the quarry application stage in the entity cache if it is enabled.
	 *
	 * @param quarryApplicationStage the quarry application stage
	 */
	@Override
	public void cacheResult(QuarryApplicationStage quarryApplicationStage) {
		entityCache.putResult(
			QuarryApplicationStageImpl.class,
			quarryApplicationStage.getPrimaryKey(), quarryApplicationStage);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				quarryApplicationStage.getUuid(),
				quarryApplicationStage.getGroupId()
			},
			quarryApplicationStage);

		finderCache.putResult(
			_finderPathFetchBygetQuarry_AI,
			new Object[] {quarryApplicationStage.getQuarryApplicationId()},
			quarryApplicationStage);

		finderCache.putResult(
			_finderPathFetchBygetQuarry_By_CaseIdStageName,
			new Object[] {
				quarryApplicationStage.getCaseId(),
				quarryApplicationStage.getStageName()
			},
			quarryApplicationStage);

		finderCache.putResult(
			_finderPathFetchBygetQuarry_By_CaseIdStageStatus,
			new Object[] {
				quarryApplicationStage.getCaseId(),
				quarryApplicationStage.getStageStatus(),
				quarryApplicationStage.getStageName()
			},
			quarryApplicationStage);

		finderCache.putResult(
			_finderPathFetchBygetQuarry_By_CaseIdAndStatus,
			new Object[] {
				quarryApplicationStage.getCaseId(),
				quarryApplicationStage.getStageStatus()
			},
			quarryApplicationStage);

		finderCache.putResult(
			_finderPathFetchBygetQuarry_CaseId,
			new Object[] {quarryApplicationStage.getCaseId()},
			quarryApplicationStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the quarry application stages in the entity cache if it is enabled.
	 *
	 * @param quarryApplicationStages the quarry application stages
	 */
	@Override
	public void cacheResult(
		List<QuarryApplicationStage> quarryApplicationStages) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (quarryApplicationStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (QuarryApplicationStage quarryApplicationStage :
				quarryApplicationStages) {

			if (entityCache.getResult(
					QuarryApplicationStageImpl.class,
					quarryApplicationStage.getPrimaryKey()) == null) {

				cacheResult(quarryApplicationStage);
			}
		}
	}

	/**
	 * Clears the cache for all quarry application stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(QuarryApplicationStageImpl.class);

		finderCache.clearCache(QuarryApplicationStageImpl.class);
	}

	/**
	 * Clears the cache for the quarry application stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QuarryApplicationStage quarryApplicationStage) {
		entityCache.removeResult(
			QuarryApplicationStageImpl.class, quarryApplicationStage);
	}

	@Override
	public void clearCache(
		List<QuarryApplicationStage> quarryApplicationStages) {

		for (QuarryApplicationStage quarryApplicationStage :
				quarryApplicationStages) {

			entityCache.removeResult(
				QuarryApplicationStageImpl.class, quarryApplicationStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(QuarryApplicationStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				QuarryApplicationStageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		QuarryApplicationStageModelImpl quarryApplicationStageModelImpl) {

		Object[] args = new Object[] {
			quarryApplicationStageModelImpl.getUuid(),
			quarryApplicationStageModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, quarryApplicationStageModelImpl);

		args = new Object[] {
			quarryApplicationStageModelImpl.getQuarryApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetQuarry_AI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetQuarry_AI, args,
			quarryApplicationStageModelImpl);

		args = new Object[] {
			quarryApplicationStageModelImpl.getCaseId(),
			quarryApplicationStageModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetQuarry_By_CaseIdStageName, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetQuarry_By_CaseIdStageName, args,
			quarryApplicationStageModelImpl);

		args = new Object[] {
			quarryApplicationStageModelImpl.getCaseId(),
			quarryApplicationStageModelImpl.getStageStatus(),
			quarryApplicationStageModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetQuarry_By_CaseIdStageStatus, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetQuarry_By_CaseIdStageStatus, args,
			quarryApplicationStageModelImpl);

		args = new Object[] {
			quarryApplicationStageModelImpl.getCaseId(),
			quarryApplicationStageModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetQuarry_By_CaseIdAndStatus, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetQuarry_By_CaseIdAndStatus, args,
			quarryApplicationStageModelImpl);

		args = new Object[] {quarryApplicationStageModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetQuarry_CaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetQuarry_CaseId, args,
			quarryApplicationStageModelImpl);
	}

	/**
	 * Creates a new quarry application stage with the primary key. Does not add the quarry application stage to the database.
	 *
	 * @param quarryAppStagesId the primary key for the new quarry application stage
	 * @return the new quarry application stage
	 */
	@Override
	public QuarryApplicationStage create(long quarryAppStagesId) {
		QuarryApplicationStage quarryApplicationStage =
			new QuarryApplicationStageImpl();

		quarryApplicationStage.setNew(true);
		quarryApplicationStage.setPrimaryKey(quarryAppStagesId);

		String uuid = PortalUUIDUtil.generate();

		quarryApplicationStage.setUuid(uuid);

		quarryApplicationStage.setCompanyId(CompanyThreadLocal.getCompanyId());

		return quarryApplicationStage;
	}

	/**
	 * Removes the quarry application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param quarryAppStagesId the primary key of the quarry application stage
	 * @return the quarry application stage that was removed
	 * @throws NoSuchQuarryApplicationStageException if a quarry application stage with the primary key could not be found
	 */
	@Override
	public QuarryApplicationStage remove(long quarryAppStagesId)
		throws NoSuchQuarryApplicationStageException {

		return remove((Serializable)quarryAppStagesId);
	}

	/**
	 * Removes the quarry application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the quarry application stage
	 * @return the quarry application stage that was removed
	 * @throws NoSuchQuarryApplicationStageException if a quarry application stage with the primary key could not be found
	 */
	@Override
	public QuarryApplicationStage remove(Serializable primaryKey)
		throws NoSuchQuarryApplicationStageException {

		Session session = null;

		try {
			session = openSession();

			QuarryApplicationStage quarryApplicationStage =
				(QuarryApplicationStage)session.get(
					QuarryApplicationStageImpl.class, primaryKey);

			if (quarryApplicationStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQuarryApplicationStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(quarryApplicationStage);
		}
		catch (NoSuchQuarryApplicationStageException noSuchEntityException) {
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
	protected QuarryApplicationStage removeImpl(
		QuarryApplicationStage quarryApplicationStage) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(quarryApplicationStage)) {
				quarryApplicationStage = (QuarryApplicationStage)session.get(
					QuarryApplicationStageImpl.class,
					quarryApplicationStage.getPrimaryKeyObj());
			}

			if (quarryApplicationStage != null) {
				session.delete(quarryApplicationStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (quarryApplicationStage != null) {
			clearCache(quarryApplicationStage);
		}

		return quarryApplicationStage;
	}

	@Override
	public QuarryApplicationStage updateImpl(
		QuarryApplicationStage quarryApplicationStage) {

		boolean isNew = quarryApplicationStage.isNew();

		if (!(quarryApplicationStage instanceof
				QuarryApplicationStageModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(quarryApplicationStage.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					quarryApplicationStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in quarryApplicationStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom QuarryApplicationStage implementation " +
					quarryApplicationStage.getClass());
		}

		QuarryApplicationStageModelImpl quarryApplicationStageModelImpl =
			(QuarryApplicationStageModelImpl)quarryApplicationStage;

		if (Validator.isNull(quarryApplicationStage.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			quarryApplicationStage.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (quarryApplicationStage.getCreateDate() == null)) {
			if (serviceContext == null) {
				quarryApplicationStage.setCreateDate(date);
			}
			else {
				quarryApplicationStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!quarryApplicationStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				quarryApplicationStage.setModifiedDate(date);
			}
			else {
				quarryApplicationStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(quarryApplicationStage);
			}
			else {
				quarryApplicationStage = (QuarryApplicationStage)session.merge(
					quarryApplicationStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			QuarryApplicationStageImpl.class, quarryApplicationStageModelImpl,
			false, true);

		cacheUniqueFindersCache(quarryApplicationStageModelImpl);

		if (isNew) {
			quarryApplicationStage.setNew(false);
		}

		quarryApplicationStage.resetOriginalValues();

		return quarryApplicationStage;
	}

	/**
	 * Returns the quarry application stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the quarry application stage
	 * @return the quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a quarry application stage with the primary key could not be found
	 */
	@Override
	public QuarryApplicationStage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQuarryApplicationStageException {

		QuarryApplicationStage quarryApplicationStage = fetchByPrimaryKey(
			primaryKey);

		if (quarryApplicationStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQuarryApplicationStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return quarryApplicationStage;
	}

	/**
	 * Returns the quarry application stage with the primary key or throws a <code>NoSuchQuarryApplicationStageException</code> if it could not be found.
	 *
	 * @param quarryAppStagesId the primary key of the quarry application stage
	 * @return the quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a quarry application stage with the primary key could not be found
	 */
	@Override
	public QuarryApplicationStage findByPrimaryKey(long quarryAppStagesId)
		throws NoSuchQuarryApplicationStageException {

		return findByPrimaryKey((Serializable)quarryAppStagesId);
	}

	/**
	 * Returns the quarry application stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param quarryAppStagesId the primary key of the quarry application stage
	 * @return the quarry application stage, or <code>null</code> if a quarry application stage with the primary key could not be found
	 */
	@Override
	public QuarryApplicationStage fetchByPrimaryKey(long quarryAppStagesId) {
		return fetchByPrimaryKey((Serializable)quarryAppStagesId);
	}

	/**
	 * Returns all the quarry application stages.
	 *
	 * @return the quarry application stages
	 */
	@Override
	public List<QuarryApplicationStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarry application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @return the range of quarry application stages
	 */
	@Override
	public List<QuarryApplicationStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry application stages
	 */
	@Override
	public List<QuarryApplicationStage> findAll(
		int start, int end,
		OrderByComparator<QuarryApplicationStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarry application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry application stages
	 */
	@Override
	public List<QuarryApplicationStage> findAll(
		int start, int end,
		OrderByComparator<QuarryApplicationStage> orderByComparator,
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

		List<QuarryApplicationStage> list = null;

		if (useFinderCache) {
			list = (List<QuarryApplicationStage>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_QUARRYAPPLICATIONSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_QUARRYAPPLICATIONSTAGE;

				sql = sql.concat(QuarryApplicationStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<QuarryApplicationStage>)QueryUtil.list(
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
	 * Removes all the quarry application stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (QuarryApplicationStage quarryApplicationStage : findAll()) {
			remove(quarryApplicationStage);
		}
	}

	/**
	 * Returns the number of quarry application stages.
	 *
	 * @return the number of quarry application stages
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
					_SQL_COUNT_QUARRYAPPLICATIONSTAGE);

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
		return "quarryAppStagesId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_QUARRYAPPLICATIONSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return QuarryApplicationStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the quarry application stage persistence.
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

		_finderPathFetchBygetQuarry_AI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetQuarry_AI",
			new String[] {Long.class.getName()},
			new String[] {"quarryApplicationId"}, true);

		_finderPathCountBygetQuarry_AI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetQuarry_AI",
			new String[] {Long.class.getName()},
			new String[] {"quarryApplicationId"}, false);

		_finderPathFetchBygetQuarry_By_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetQuarry_By_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, true);

		_finderPathCountBygetQuarry_By_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetQuarry_By_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, false);

		_finderPathFetchBygetQuarry_By_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetQuarry_By_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageStatus", "stageName"}, true);

		_finderPathCountBygetQuarry_By_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetQuarry_By_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageStatus", "stageName"}, false);

		_finderPathFetchBygetQuarry_By_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetQuarry_By_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, true);

		_finderPathCountBygetQuarry_By_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetQuarry_By_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, false);

		_finderPathWithPaginationFindBygetQuarry_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetQuarry_By_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetQuarry_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetQuarry_By_CaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, true);

		_finderPathCountBygetQuarry_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetQuarry_By_CaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		_finderPathWithPaginationFindBygetQuarry_By_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetQuarry_By_StageName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"stageName"}, true);

		_finderPathWithoutPaginationFindBygetQuarry_By_StageName =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetQuarry_By_StageName",
				new String[] {String.class.getName()},
				new String[] {"stageName"}, true);

		_finderPathCountBygetQuarry_By_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetQuarry_By_StageName",
			new String[] {String.class.getName()}, new String[] {"stageName"},
			false);

		_finderPathFetchBygetQuarry_CaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetQuarry_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetQuarry_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetQuarry_CaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		QuarryApplicationStageUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		QuarryApplicationStageUtil.setPersistence(null);

		entityCache.removeCache(QuarryApplicationStageImpl.class.getName());
	}

	@Override
	@Reference(
		target = QUARRY_STAGEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = QUARRY_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = QUARRY_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_QUARRYAPPLICATIONSTAGE =
		"SELECT quarryApplicationStage FROM QuarryApplicationStage quarryApplicationStage";

	private static final String _SQL_SELECT_QUARRYAPPLICATIONSTAGE_WHERE =
		"SELECT quarryApplicationStage FROM QuarryApplicationStage quarryApplicationStage WHERE ";

	private static final String _SQL_COUNT_QUARRYAPPLICATIONSTAGE =
		"SELECT COUNT(quarryApplicationStage) FROM QuarryApplicationStage quarryApplicationStage";

	private static final String _SQL_COUNT_QUARRYAPPLICATIONSTAGE_WHERE =
		"SELECT COUNT(quarryApplicationStage) FROM QuarryApplicationStage quarryApplicationStage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"quarryApplicationStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No QuarryApplicationStage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No QuarryApplicationStage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		QuarryApplicationStagePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}