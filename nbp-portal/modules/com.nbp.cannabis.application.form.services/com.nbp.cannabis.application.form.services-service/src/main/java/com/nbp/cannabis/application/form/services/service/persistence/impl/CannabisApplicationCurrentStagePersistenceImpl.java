/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence.impl;

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

import com.nbp.cannabis.application.form.services.exception.NoSuchCannabisApplicationCurrentStageException;
import com.nbp.cannabis.application.form.services.model.CannabisApplicationCurrentStage;
import com.nbp.cannabis.application.form.services.model.CannabisApplicationCurrentStageTable;
import com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCurrentStageImpl;
import com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCurrentStageModelImpl;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisApplicationCurrentStagePersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisApplicationCurrentStageUtil;
import com.nbp.cannabis.application.form.services.service.persistence.impl.constants.CANNABISPersistenceConstants;

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
 * The persistence implementation for the cannabis application current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CannabisApplicationCurrentStagePersistence.class)
public class CannabisApplicationCurrentStagePersistenceImpl
	extends BasePersistenceImpl<CannabisApplicationCurrentStage>
	implements CannabisApplicationCurrentStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CannabisApplicationCurrentStageUtil</code> to access the cannabis application current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CannabisApplicationCurrentStageImpl.class.getName();

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
	 * Returns all the cannabis application current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cannabis application current stages
	 */
	@Override
	public List<CannabisApplicationCurrentStage> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis application current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application current stages
	 * @param end the upper bound of the range of cannabis application current stages (not inclusive)
	 * @return the range of matching cannabis application current stages
	 */
	@Override
	public List<CannabisApplicationCurrentStage> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis application current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application current stages
	 * @param end the upper bound of the range of cannabis application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application current stages
	 */
	@Override
	public List<CannabisApplicationCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisApplicationCurrentStage> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis application current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application current stages
	 * @param end the upper bound of the range of cannabis application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application current stages
	 */
	@Override
	public List<CannabisApplicationCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisApplicationCurrentStage> orderByComparator,
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

		List<CannabisApplicationCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<CannabisApplicationCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisApplicationCurrentStage
						cannabisApplicationCurrentStage : list) {

					if (!uuid.equals(
							cannabisApplicationCurrentStage.getUuid())) {

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

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONCURRENTSTAGE_WHERE);

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
					CannabisApplicationCurrentStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<CannabisApplicationCurrentStage>)QueryUtil.list(
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
	 * Returns the first cannabis application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application current stage
	 * @throws NoSuchCannabisApplicationCurrentStageException if a matching cannabis application current stage could not be found
	 */
	@Override
	public CannabisApplicationCurrentStage findByUuid_First(
			String uuid,
			OrderByComparator<CannabisApplicationCurrentStage>
				orderByComparator)
		throws NoSuchCannabisApplicationCurrentStageException {

		CannabisApplicationCurrentStage cannabisApplicationCurrentStage =
			fetchByUuid_First(uuid, orderByComparator);

		if (cannabisApplicationCurrentStage != null) {
			return cannabisApplicationCurrentStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchCannabisApplicationCurrentStageException(sb.toString());
	}

	/**
	 * Returns the first cannabis application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application current stage, or <code>null</code> if a matching cannabis application current stage could not be found
	 */
	@Override
	public CannabisApplicationCurrentStage fetchByUuid_First(
		String uuid,
		OrderByComparator<CannabisApplicationCurrentStage> orderByComparator) {

		List<CannabisApplicationCurrentStage> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application current stage
	 * @throws NoSuchCannabisApplicationCurrentStageException if a matching cannabis application current stage could not be found
	 */
	@Override
	public CannabisApplicationCurrentStage findByUuid_Last(
			String uuid,
			OrderByComparator<CannabisApplicationCurrentStage>
				orderByComparator)
		throws NoSuchCannabisApplicationCurrentStageException {

		CannabisApplicationCurrentStage cannabisApplicationCurrentStage =
			fetchByUuid_Last(uuid, orderByComparator);

		if (cannabisApplicationCurrentStage != null) {
			return cannabisApplicationCurrentStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchCannabisApplicationCurrentStageException(sb.toString());
	}

	/**
	 * Returns the last cannabis application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application current stage, or <code>null</code> if a matching cannabis application current stage could not be found
	 */
	@Override
	public CannabisApplicationCurrentStage fetchByUuid_Last(
		String uuid,
		OrderByComparator<CannabisApplicationCurrentStage> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<CannabisApplicationCurrentStage> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis application current stages before and after the current cannabis application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param cannabisStageId the primary key of the current cannabis application current stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application current stage
	 * @throws NoSuchCannabisApplicationCurrentStageException if a cannabis application current stage with the primary key could not be found
	 */
	@Override
	public CannabisApplicationCurrentStage[] findByUuid_PrevAndNext(
			long cannabisStageId, String uuid,
			OrderByComparator<CannabisApplicationCurrentStage>
				orderByComparator)
		throws NoSuchCannabisApplicationCurrentStageException {

		uuid = Objects.toString(uuid, "");

		CannabisApplicationCurrentStage cannabisApplicationCurrentStage =
			findByPrimaryKey(cannabisStageId);

		Session session = null;

		try {
			session = openSession();

			CannabisApplicationCurrentStage[] array =
				new CannabisApplicationCurrentStageImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, cannabisApplicationCurrentStage, uuid,
				orderByComparator, true);

			array[1] = cannabisApplicationCurrentStage;

			array[2] = getByUuid_PrevAndNext(
				session, cannabisApplicationCurrentStage, uuid,
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

	protected CannabisApplicationCurrentStage getByUuid_PrevAndNext(
		Session session,
		CannabisApplicationCurrentStage cannabisApplicationCurrentStage,
		String uuid,
		OrderByComparator<CannabisApplicationCurrentStage> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISAPPLICATIONCURRENTSTAGE_WHERE);

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
			sb.append(CannabisApplicationCurrentStageModelImpl.ORDER_BY_JPQL);
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
						cannabisApplicationCurrentStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisApplicationCurrentStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis application current stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (CannabisApplicationCurrentStage cannabisApplicationCurrentStage :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(cannabisApplicationCurrentStage);
		}
	}

	/**
	 * Returns the number of cannabis application current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cannabis application current stages
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONCURRENTSTAGE_WHERE);

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
		"cannabisApplicationCurrentStage.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(cannabisApplicationCurrentStage.uuid IS NULL OR cannabisApplicationCurrentStage.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the cannabis application current stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCannabisApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis application current stage
	 * @throws NoSuchCannabisApplicationCurrentStageException if a matching cannabis application current stage could not be found
	 */
	@Override
	public CannabisApplicationCurrentStage findByUUID_G(
			String uuid, long groupId)
		throws NoSuchCannabisApplicationCurrentStageException {

		CannabisApplicationCurrentStage cannabisApplicationCurrentStage =
			fetchByUUID_G(uuid, groupId);

		if (cannabisApplicationCurrentStage == null) {
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

			throw new NoSuchCannabisApplicationCurrentStageException(
				sb.toString());
		}

		return cannabisApplicationCurrentStage;
	}

	/**
	 * Returns the cannabis application current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis application current stage, or <code>null</code> if a matching cannabis application current stage could not be found
	 */
	@Override
	public CannabisApplicationCurrentStage fetchByUUID_G(
		String uuid, long groupId) {

		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the cannabis application current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application current stage, or <code>null</code> if a matching cannabis application current stage could not be found
	 */
	@Override
	public CannabisApplicationCurrentStage fetchByUUID_G(
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

		if (result instanceof CannabisApplicationCurrentStage) {
			CannabisApplicationCurrentStage cannabisApplicationCurrentStage =
				(CannabisApplicationCurrentStage)result;

			if (!Objects.equals(
					uuid, cannabisApplicationCurrentStage.getUuid()) ||
				(groupId != cannabisApplicationCurrentStage.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONCURRENTSTAGE_WHERE);

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

				List<CannabisApplicationCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					CannabisApplicationCurrentStage
						cannabisApplicationCurrentStage = list.get(0);

					result = cannabisApplicationCurrentStage;

					cacheResult(cannabisApplicationCurrentStage);
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
			return (CannabisApplicationCurrentStage)result;
		}
	}

	/**
	 * Removes the cannabis application current stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the cannabis application current stage that was removed
	 */
	@Override
	public CannabisApplicationCurrentStage removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchCannabisApplicationCurrentStageException {

		CannabisApplicationCurrentStage cannabisApplicationCurrentStage =
			findByUUID_G(uuid, groupId);

		return remove(cannabisApplicationCurrentStage);
	}

	/**
	 * Returns the number of cannabis application current stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cannabis application current stages
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONCURRENTSTAGE_WHERE);

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
		"cannabisApplicationCurrentStage.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(cannabisApplicationCurrentStage.uuid IS NULL OR cannabisApplicationCurrentStage.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"cannabisApplicationCurrentStage.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the cannabis application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cannabis application current stages
	 */
	@Override
	public List<CannabisApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application current stages
	 * @param end the upper bound of the range of cannabis application current stages (not inclusive)
	 * @return the range of matching cannabis application current stages
	 */
	@Override
	public List<CannabisApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application current stages
	 * @param end the upper bound of the range of cannabis application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application current stages
	 */
	@Override
	public List<CannabisApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisApplicationCurrentStage> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application current stages
	 * @param end the upper bound of the range of cannabis application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application current stages
	 */
	@Override
	public List<CannabisApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisApplicationCurrentStage> orderByComparator,
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

		List<CannabisApplicationCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<CannabisApplicationCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisApplicationCurrentStage
						cannabisApplicationCurrentStage : list) {

					if (!uuid.equals(
							cannabisApplicationCurrentStage.getUuid()) ||
						(companyId !=
							cannabisApplicationCurrentStage.getCompanyId())) {

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

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONCURRENTSTAGE_WHERE);

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
					CannabisApplicationCurrentStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<CannabisApplicationCurrentStage>)QueryUtil.list(
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
	 * Returns the first cannabis application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application current stage
	 * @throws NoSuchCannabisApplicationCurrentStageException if a matching cannabis application current stage could not be found
	 */
	@Override
	public CannabisApplicationCurrentStage findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CannabisApplicationCurrentStage>
				orderByComparator)
		throws NoSuchCannabisApplicationCurrentStageException {

		CannabisApplicationCurrentStage cannabisApplicationCurrentStage =
			fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (cannabisApplicationCurrentStage != null) {
			return cannabisApplicationCurrentStage;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchCannabisApplicationCurrentStageException(sb.toString());
	}

	/**
	 * Returns the first cannabis application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application current stage, or <code>null</code> if a matching cannabis application current stage could not be found
	 */
	@Override
	public CannabisApplicationCurrentStage fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CannabisApplicationCurrentStage> orderByComparator) {

		List<CannabisApplicationCurrentStage> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application current stage
	 * @throws NoSuchCannabisApplicationCurrentStageException if a matching cannabis application current stage could not be found
	 */
	@Override
	public CannabisApplicationCurrentStage findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CannabisApplicationCurrentStage>
				orderByComparator)
		throws NoSuchCannabisApplicationCurrentStageException {

		CannabisApplicationCurrentStage cannabisApplicationCurrentStage =
			fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (cannabisApplicationCurrentStage != null) {
			return cannabisApplicationCurrentStage;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchCannabisApplicationCurrentStageException(sb.toString());
	}

	/**
	 * Returns the last cannabis application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application current stage, or <code>null</code> if a matching cannabis application current stage could not be found
	 */
	@Override
	public CannabisApplicationCurrentStage fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CannabisApplicationCurrentStage> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<CannabisApplicationCurrentStage> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis application current stages before and after the current cannabis application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param cannabisStageId the primary key of the current cannabis application current stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application current stage
	 * @throws NoSuchCannabisApplicationCurrentStageException if a cannabis application current stage with the primary key could not be found
	 */
	@Override
	public CannabisApplicationCurrentStage[] findByUuid_C_PrevAndNext(
			long cannabisStageId, String uuid, long companyId,
			OrderByComparator<CannabisApplicationCurrentStage>
				orderByComparator)
		throws NoSuchCannabisApplicationCurrentStageException {

		uuid = Objects.toString(uuid, "");

		CannabisApplicationCurrentStage cannabisApplicationCurrentStage =
			findByPrimaryKey(cannabisStageId);

		Session session = null;

		try {
			session = openSession();

			CannabisApplicationCurrentStage[] array =
				new CannabisApplicationCurrentStageImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, cannabisApplicationCurrentStage, uuid, companyId,
				orderByComparator, true);

			array[1] = cannabisApplicationCurrentStage;

			array[2] = getByUuid_C_PrevAndNext(
				session, cannabisApplicationCurrentStage, uuid, companyId,
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

	protected CannabisApplicationCurrentStage getByUuid_C_PrevAndNext(
		Session session,
		CannabisApplicationCurrentStage cannabisApplicationCurrentStage,
		String uuid, long companyId,
		OrderByComparator<CannabisApplicationCurrentStage> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISAPPLICATIONCURRENTSTAGE_WHERE);

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
			sb.append(CannabisApplicationCurrentStageModelImpl.ORDER_BY_JPQL);
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
						cannabisApplicationCurrentStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisApplicationCurrentStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis application current stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (CannabisApplicationCurrentStage cannabisApplicationCurrentStage :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(cannabisApplicationCurrentStage);
		}
	}

	/**
	 * Returns the number of cannabis application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cannabis application current stages
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONCURRENTSTAGE_WHERE);

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
		"cannabisApplicationCurrentStage.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(cannabisApplicationCurrentStage.uuid IS NULL OR cannabisApplicationCurrentStage.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"cannabisApplicationCurrentStage.companyId = ?";

	private FinderPath _finderPathFetchBygetCA_Stage_CAI;
	private FinderPath _finderPathCountBygetCA_Stage_CAI;

	/**
	 * Returns the cannabis application current stage where cannabisApplicationId = &#63; or throws a <code>NoSuchCannabisApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application current stage
	 * @throws NoSuchCannabisApplicationCurrentStageException if a matching cannabis application current stage could not be found
	 */
	@Override
	public CannabisApplicationCurrentStage findBygetCA_Stage_CAI(
			long cannabisApplicationId)
		throws NoSuchCannabisApplicationCurrentStageException {

		CannabisApplicationCurrentStage cannabisApplicationCurrentStage =
			fetchBygetCA_Stage_CAI(cannabisApplicationId);

		if (cannabisApplicationCurrentStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("cannabisApplicationId=");
			sb.append(cannabisApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCannabisApplicationCurrentStageException(
				sb.toString());
		}

		return cannabisApplicationCurrentStage;
	}

	/**
	 * Returns the cannabis application current stage where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application current stage, or <code>null</code> if a matching cannabis application current stage could not be found
	 */
	@Override
	public CannabisApplicationCurrentStage fetchBygetCA_Stage_CAI(
		long cannabisApplicationId) {

		return fetchBygetCA_Stage_CAI(cannabisApplicationId, true);
	}

	/**
	 * Returns the cannabis application current stage where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application current stage, or <code>null</code> if a matching cannabis application current stage could not be found
	 */
	@Override
	public CannabisApplicationCurrentStage fetchBygetCA_Stage_CAI(
		long cannabisApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {cannabisApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetCA_Stage_CAI, finderArgs, this);
		}

		if (result instanceof CannabisApplicationCurrentStage) {
			CannabisApplicationCurrentStage cannabisApplicationCurrentStage =
				(CannabisApplicationCurrentStage)result;

			if (cannabisApplicationId !=
					cannabisApplicationCurrentStage.
						getCannabisApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETCA_STAGE_CAI_CANNABISAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(cannabisApplicationId);

				List<CannabisApplicationCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCA_Stage_CAI, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									cannabisApplicationId
								};
							}

							_log.warn(
								"CannabisApplicationCurrentStagePersistenceImpl.fetchBygetCA_Stage_CAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CannabisApplicationCurrentStage
						cannabisApplicationCurrentStage = list.get(0);

					result = cannabisApplicationCurrentStage;

					cacheResult(cannabisApplicationCurrentStage);
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
			return (CannabisApplicationCurrentStage)result;
		}
	}

	/**
	 * Removes the cannabis application current stage where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the cannabis application current stage that was removed
	 */
	@Override
	public CannabisApplicationCurrentStage removeBygetCA_Stage_CAI(
			long cannabisApplicationId)
		throws NoSuchCannabisApplicationCurrentStageException {

		CannabisApplicationCurrentStage cannabisApplicationCurrentStage =
			findBygetCA_Stage_CAI(cannabisApplicationId);

		return remove(cannabisApplicationCurrentStage);
	}

	/**
	 * Returns the number of cannabis application current stages where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis application current stages
	 */
	@Override
	public int countBygetCA_Stage_CAI(long cannabisApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCA_Stage_CAI;

		Object[] finderArgs = new Object[] {cannabisApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETCA_STAGE_CAI_CANNABISAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(cannabisApplicationId);

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
		_FINDER_COLUMN_GETCA_STAGE_CAI_CANNABISAPPLICATIONID_2 =
			"cannabisApplicationCurrentStage.cannabisApplicationId = ?";

	public CannabisApplicationCurrentStagePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(CannabisApplicationCurrentStage.class);

		setModelImplClass(CannabisApplicationCurrentStageImpl.class);
		setModelPKClass(long.class);

		setTable(CannabisApplicationCurrentStageTable.INSTANCE);
	}

	/**
	 * Caches the cannabis application current stage in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationCurrentStage the cannabis application current stage
	 */
	@Override
	public void cacheResult(
		CannabisApplicationCurrentStage cannabisApplicationCurrentStage) {

		entityCache.putResult(
			CannabisApplicationCurrentStageImpl.class,
			cannabisApplicationCurrentStage.getPrimaryKey(),
			cannabisApplicationCurrentStage);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				cannabisApplicationCurrentStage.getUuid(),
				cannabisApplicationCurrentStage.getGroupId()
			},
			cannabisApplicationCurrentStage);

		finderCache.putResult(
			_finderPathFetchBygetCA_Stage_CAI,
			new Object[] {
				cannabisApplicationCurrentStage.getCannabisApplicationId()
			},
			cannabisApplicationCurrentStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the cannabis application current stages in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationCurrentStages the cannabis application current stages
	 */
	@Override
	public void cacheResult(
		List<CannabisApplicationCurrentStage>
			cannabisApplicationCurrentStages) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (cannabisApplicationCurrentStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CannabisApplicationCurrentStage cannabisApplicationCurrentStage :
				cannabisApplicationCurrentStages) {

			if (entityCache.getResult(
					CannabisApplicationCurrentStageImpl.class,
					cannabisApplicationCurrentStage.getPrimaryKey()) == null) {

				cacheResult(cannabisApplicationCurrentStage);
			}
		}
	}

	/**
	 * Clears the cache for all cannabis application current stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CannabisApplicationCurrentStageImpl.class);

		finderCache.clearCache(CannabisApplicationCurrentStageImpl.class);
	}

	/**
	 * Clears the cache for the cannabis application current stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CannabisApplicationCurrentStage cannabisApplicationCurrentStage) {

		entityCache.removeResult(
			CannabisApplicationCurrentStageImpl.class,
			cannabisApplicationCurrentStage);
	}

	@Override
	public void clearCache(
		List<CannabisApplicationCurrentStage>
			cannabisApplicationCurrentStages) {

		for (CannabisApplicationCurrentStage cannabisApplicationCurrentStage :
				cannabisApplicationCurrentStages) {

			entityCache.removeResult(
				CannabisApplicationCurrentStageImpl.class,
				cannabisApplicationCurrentStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CannabisApplicationCurrentStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CannabisApplicationCurrentStageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CannabisApplicationCurrentStageModelImpl
			cannabisApplicationCurrentStageModelImpl) {

		Object[] args = new Object[] {
			cannabisApplicationCurrentStageModelImpl.getUuid(),
			cannabisApplicationCurrentStageModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args,
			cannabisApplicationCurrentStageModelImpl);

		args = new Object[] {
			cannabisApplicationCurrentStageModelImpl.getCannabisApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetCA_Stage_CAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCA_Stage_CAI, args,
			cannabisApplicationCurrentStageModelImpl);
	}

	/**
	 * Creates a new cannabis application current stage with the primary key. Does not add the cannabis application current stage to the database.
	 *
	 * @param cannabisStageId the primary key for the new cannabis application current stage
	 * @return the new cannabis application current stage
	 */
	@Override
	public CannabisApplicationCurrentStage create(long cannabisStageId) {
		CannabisApplicationCurrentStage cannabisApplicationCurrentStage =
			new CannabisApplicationCurrentStageImpl();

		cannabisApplicationCurrentStage.setNew(true);
		cannabisApplicationCurrentStage.setPrimaryKey(cannabisStageId);

		String uuid = PortalUUIDUtil.generate();

		cannabisApplicationCurrentStage.setUuid(uuid);

		cannabisApplicationCurrentStage.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return cannabisApplicationCurrentStage;
	}

	/**
	 * Removes the cannabis application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisStageId the primary key of the cannabis application current stage
	 * @return the cannabis application current stage that was removed
	 * @throws NoSuchCannabisApplicationCurrentStageException if a cannabis application current stage with the primary key could not be found
	 */
	@Override
	public CannabisApplicationCurrentStage remove(long cannabisStageId)
		throws NoSuchCannabisApplicationCurrentStageException {

		return remove((Serializable)cannabisStageId);
	}

	/**
	 * Removes the cannabis application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cannabis application current stage
	 * @return the cannabis application current stage that was removed
	 * @throws NoSuchCannabisApplicationCurrentStageException if a cannabis application current stage with the primary key could not be found
	 */
	@Override
	public CannabisApplicationCurrentStage remove(Serializable primaryKey)
		throws NoSuchCannabisApplicationCurrentStageException {

		Session session = null;

		try {
			session = openSession();

			CannabisApplicationCurrentStage cannabisApplicationCurrentStage =
				(CannabisApplicationCurrentStage)session.get(
					CannabisApplicationCurrentStageImpl.class, primaryKey);

			if (cannabisApplicationCurrentStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCannabisApplicationCurrentStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(cannabisApplicationCurrentStage);
		}
		catch (NoSuchCannabisApplicationCurrentStageException
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
	protected CannabisApplicationCurrentStage removeImpl(
		CannabisApplicationCurrentStage cannabisApplicationCurrentStage) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cannabisApplicationCurrentStage)) {
				cannabisApplicationCurrentStage =
					(CannabisApplicationCurrentStage)session.get(
						CannabisApplicationCurrentStageImpl.class,
						cannabisApplicationCurrentStage.getPrimaryKeyObj());
			}

			if (cannabisApplicationCurrentStage != null) {
				session.delete(cannabisApplicationCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (cannabisApplicationCurrentStage != null) {
			clearCache(cannabisApplicationCurrentStage);
		}

		return cannabisApplicationCurrentStage;
	}

	@Override
	public CannabisApplicationCurrentStage updateImpl(
		CannabisApplicationCurrentStage cannabisApplicationCurrentStage) {

		boolean isNew = cannabisApplicationCurrentStage.isNew();

		if (!(cannabisApplicationCurrentStage instanceof
				CannabisApplicationCurrentStageModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					cannabisApplicationCurrentStage.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					cannabisApplicationCurrentStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cannabisApplicationCurrentStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CannabisApplicationCurrentStage implementation " +
					cannabisApplicationCurrentStage.getClass());
		}

		CannabisApplicationCurrentStageModelImpl
			cannabisApplicationCurrentStageModelImpl =
				(CannabisApplicationCurrentStageModelImpl)
					cannabisApplicationCurrentStage;

		if (Validator.isNull(cannabisApplicationCurrentStage.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			cannabisApplicationCurrentStage.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(cannabisApplicationCurrentStage.getCreateDate() == null)) {

			if (serviceContext == null) {
				cannabisApplicationCurrentStage.setCreateDate(date);
			}
			else {
				cannabisApplicationCurrentStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!cannabisApplicationCurrentStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				cannabisApplicationCurrentStage.setModifiedDate(date);
			}
			else {
				cannabisApplicationCurrentStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(cannabisApplicationCurrentStage);
			}
			else {
				cannabisApplicationCurrentStage =
					(CannabisApplicationCurrentStage)session.merge(
						cannabisApplicationCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CannabisApplicationCurrentStageImpl.class,
			cannabisApplicationCurrentStageModelImpl, false, true);

		cacheUniqueFindersCache(cannabisApplicationCurrentStageModelImpl);

		if (isNew) {
			cannabisApplicationCurrentStage.setNew(false);
		}

		cannabisApplicationCurrentStage.resetOriginalValues();

		return cannabisApplicationCurrentStage;
	}

	/**
	 * Returns the cannabis application current stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cannabis application current stage
	 * @return the cannabis application current stage
	 * @throws NoSuchCannabisApplicationCurrentStageException if a cannabis application current stage with the primary key could not be found
	 */
	@Override
	public CannabisApplicationCurrentStage findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchCannabisApplicationCurrentStageException {

		CannabisApplicationCurrentStage cannabisApplicationCurrentStage =
			fetchByPrimaryKey(primaryKey);

		if (cannabisApplicationCurrentStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCannabisApplicationCurrentStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return cannabisApplicationCurrentStage;
	}

	/**
	 * Returns the cannabis application current stage with the primary key or throws a <code>NoSuchCannabisApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param cannabisStageId the primary key of the cannabis application current stage
	 * @return the cannabis application current stage
	 * @throws NoSuchCannabisApplicationCurrentStageException if a cannabis application current stage with the primary key could not be found
	 */
	@Override
	public CannabisApplicationCurrentStage findByPrimaryKey(
			long cannabisStageId)
		throws NoSuchCannabisApplicationCurrentStageException {

		return findByPrimaryKey((Serializable)cannabisStageId);
	}

	/**
	 * Returns the cannabis application current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisStageId the primary key of the cannabis application current stage
	 * @return the cannabis application current stage, or <code>null</code> if a cannabis application current stage with the primary key could not be found
	 */
	@Override
	public CannabisApplicationCurrentStage fetchByPrimaryKey(
		long cannabisStageId) {

		return fetchByPrimaryKey((Serializable)cannabisStageId);
	}

	/**
	 * Returns all the cannabis application current stages.
	 *
	 * @return the cannabis application current stages
	 */
	@Override
	public List<CannabisApplicationCurrentStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application current stages
	 * @param end the upper bound of the range of cannabis application current stages (not inclusive)
	 * @return the range of cannabis application current stages
	 */
	@Override
	public List<CannabisApplicationCurrentStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application current stages
	 * @param end the upper bound of the range of cannabis application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis application current stages
	 */
	@Override
	public List<CannabisApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationCurrentStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application current stages
	 * @param end the upper bound of the range of cannabis application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis application current stages
	 */
	@Override
	public List<CannabisApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationCurrentStage> orderByComparator,
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

		List<CannabisApplicationCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<CannabisApplicationCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CANNABISAPPLICATIONCURRENTSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CANNABISAPPLICATIONCURRENTSTAGE;

				sql = sql.concat(
					CannabisApplicationCurrentStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CannabisApplicationCurrentStage>)QueryUtil.list(
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
	 * Removes all the cannabis application current stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CannabisApplicationCurrentStage cannabisApplicationCurrentStage :
				findAll()) {

			remove(cannabisApplicationCurrentStage);
		}
	}

	/**
	 * Returns the number of cannabis application current stages.
	 *
	 * @return the number of cannabis application current stages
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
					_SQL_COUNT_CANNABISAPPLICATIONCURRENTSTAGE);

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
		return "cannabisStageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CANNABISAPPLICATIONCURRENTSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CannabisApplicationCurrentStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cannabis application current stage persistence.
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

		_finderPathFetchBygetCA_Stage_CAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCA_Stage_CAI",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, true);

		_finderPathCountBygetCA_Stage_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCA_Stage_CAI",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, false);

		CannabisApplicationCurrentStageUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CannabisApplicationCurrentStageUtil.setPersistence(null);

		entityCache.removeCache(
			CannabisApplicationCurrentStageImpl.class.getName());
	}

	@Override
	@Reference(
		target = CANNABISPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = CANNABISPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = CANNABISPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_CANNABISAPPLICATIONCURRENTSTAGE =
		"SELECT cannabisApplicationCurrentStage FROM CannabisApplicationCurrentStage cannabisApplicationCurrentStage";

	private static final String
		_SQL_SELECT_CANNABISAPPLICATIONCURRENTSTAGE_WHERE =
			"SELECT cannabisApplicationCurrentStage FROM CannabisApplicationCurrentStage cannabisApplicationCurrentStage WHERE ";

	private static final String _SQL_COUNT_CANNABISAPPLICATIONCURRENTSTAGE =
		"SELECT COUNT(cannabisApplicationCurrentStage) FROM CannabisApplicationCurrentStage cannabisApplicationCurrentStage";

	private static final String
		_SQL_COUNT_CANNABISAPPLICATIONCURRENTSTAGE_WHERE =
			"SELECT COUNT(cannabisApplicationCurrentStage) FROM CannabisApplicationCurrentStage cannabisApplicationCurrentStage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"cannabisApplicationCurrentStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CannabisApplicationCurrentStage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CannabisApplicationCurrentStage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CannabisApplicationCurrentStagePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}