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

import com.nbp.sez.status.application.stage.services.exception.NoSuchSezStatusApplicationStagesException;
import com.nbp.sez.status.application.stage.services.model.SezStatusApplicationStages;
import com.nbp.sez.status.application.stage.services.model.SezStatusApplicationStagesTable;
import com.nbp.sez.status.application.stage.services.model.impl.SezStatusApplicationStagesImpl;
import com.nbp.sez.status.application.stage.services.model.impl.SezStatusApplicationStagesModelImpl;
import com.nbp.sez.status.application.stage.services.service.persistence.SezStatusApplicationStagesPersistence;
import com.nbp.sez.status.application.stage.services.service.persistence.SezStatusApplicationStagesUtil;
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
 * The persistence implementation for the sez status application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezStatusApplicationStagesPersistence.class)
public class SezStatusApplicationStagesPersistenceImpl
	extends BasePersistenceImpl<SezStatusApplicationStages>
	implements SezStatusApplicationStagesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezStatusApplicationStagesUtil</code> to access the sez status application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezStatusApplicationStagesImpl.class.getName();

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
	 * Returns all the sez status application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching sez status application stageses
	 */
	@Override
	public List<SezStatusApplicationStages> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @return the range of matching sez status application stageses
	 */
	@Override
	public List<SezStatusApplicationStages> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status application stageses
	 */
	@Override
	public List<SezStatusApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SezStatusApplicationStages> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status application stageses
	 */
	@Override
	public List<SezStatusApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SezStatusApplicationStages> orderByComparator,
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

		List<SezStatusApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<SezStatusApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezStatusApplicationStages sezStatusApplicationStages :
						list) {

					if (!uuid.equals(sezStatusApplicationStages.getUuid())) {
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

			sb.append(_SQL_SELECT_SEZSTATUSAPPLICATIONSTAGES_WHERE);

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
				sb.append(SezStatusApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<SezStatusApplicationStages>)QueryUtil.list(
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
	 * Returns the first sez status application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	@Override
	public SezStatusApplicationStages findByUuid_First(
			String uuid,
			OrderByComparator<SezStatusApplicationStages> orderByComparator)
		throws NoSuchSezStatusApplicationStagesException {

		SezStatusApplicationStages sezStatusApplicationStages =
			fetchByUuid_First(uuid, orderByComparator);

		if (sezStatusApplicationStages != null) {
			return sezStatusApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchSezStatusApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first sez status application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	@Override
	public SezStatusApplicationStages fetchByUuid_First(
		String uuid,
		OrderByComparator<SezStatusApplicationStages> orderByComparator) {

		List<SezStatusApplicationStages> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez status application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	@Override
	public SezStatusApplicationStages findByUuid_Last(
			String uuid,
			OrderByComparator<SezStatusApplicationStages> orderByComparator)
		throws NoSuchSezStatusApplicationStagesException {

		SezStatusApplicationStages sezStatusApplicationStages =
			fetchByUuid_Last(uuid, orderByComparator);

		if (sezStatusApplicationStages != null) {
			return sezStatusApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchSezStatusApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last sez status application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	@Override
	public SezStatusApplicationStages fetchByUuid_Last(
		String uuid,
		OrderByComparator<SezStatusApplicationStages> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<SezStatusApplicationStages> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez status application stageses before and after the current sez status application stages in the ordered set where uuid = &#63;.
	 *
	 * @param SezStatusApplicationStagesId the primary key of the current sez status application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a sez status application stages with the primary key could not be found
	 */
	@Override
	public SezStatusApplicationStages[] findByUuid_PrevAndNext(
			long SezStatusApplicationStagesId, String uuid,
			OrderByComparator<SezStatusApplicationStages> orderByComparator)
		throws NoSuchSezStatusApplicationStagesException {

		uuid = Objects.toString(uuid, "");

		SezStatusApplicationStages sezStatusApplicationStages =
			findByPrimaryKey(SezStatusApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			SezStatusApplicationStages[] array =
				new SezStatusApplicationStagesImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, sezStatusApplicationStages, uuid, orderByComparator,
				true);

			array[1] = sezStatusApplicationStages;

			array[2] = getByUuid_PrevAndNext(
				session, sezStatusApplicationStages, uuid, orderByComparator,
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

	protected SezStatusApplicationStages getByUuid_PrevAndNext(
		Session session, SezStatusApplicationStages sezStatusApplicationStages,
		String uuid,
		OrderByComparator<SezStatusApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZSTATUSAPPLICATIONSTAGES_WHERE);

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
			sb.append(SezStatusApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						sezStatusApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezStatusApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez status application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (SezStatusApplicationStages sezStatusApplicationStages :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(sezStatusApplicationStages);
		}
	}

	/**
	 * Returns the number of sez status application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching sez status application stageses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZSTATUSAPPLICATIONSTAGES_WHERE);

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
		"sezStatusApplicationStages.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(sezStatusApplicationStages.uuid IS NULL OR sezStatusApplicationStages.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the sez status application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSezStatusApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	@Override
	public SezStatusApplicationStages findByUUID_G(String uuid, long groupId)
		throws NoSuchSezStatusApplicationStagesException {

		SezStatusApplicationStages sezStatusApplicationStages = fetchByUUID_G(
			uuid, groupId);

		if (sezStatusApplicationStages == null) {
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

			throw new NoSuchSezStatusApplicationStagesException(sb.toString());
		}

		return sezStatusApplicationStages;
	}

	/**
	 * Returns the sez status application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	@Override
	public SezStatusApplicationStages fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the sez status application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	@Override
	public SezStatusApplicationStages fetchByUUID_G(
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

		if (result instanceof SezStatusApplicationStages) {
			SezStatusApplicationStages sezStatusApplicationStages =
				(SezStatusApplicationStages)result;

			if (!Objects.equals(uuid, sezStatusApplicationStages.getUuid()) ||
				(groupId != sezStatusApplicationStages.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_SEZSTATUSAPPLICATIONSTAGES_WHERE);

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

				List<SezStatusApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					SezStatusApplicationStages sezStatusApplicationStages =
						list.get(0);

					result = sezStatusApplicationStages;

					cacheResult(sezStatusApplicationStages);
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
			return (SezStatusApplicationStages)result;
		}
	}

	/**
	 * Removes the sez status application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the sez status application stages that was removed
	 */
	@Override
	public SezStatusApplicationStages removeByUUID_G(String uuid, long groupId)
		throws NoSuchSezStatusApplicationStagesException {

		SezStatusApplicationStages sezStatusApplicationStages = findByUUID_G(
			uuid, groupId);

		return remove(sezStatusApplicationStages);
	}

	/**
	 * Returns the number of sez status application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching sez status application stageses
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_SEZSTATUSAPPLICATIONSTAGES_WHERE);

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
		"sezStatusApplicationStages.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(sezStatusApplicationStages.uuid IS NULL OR sezStatusApplicationStages.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"sezStatusApplicationStages.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the sez status application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching sez status application stageses
	 */
	@Override
	public List<SezStatusApplicationStages> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @return the range of matching sez status application stageses
	 */
	@Override
	public List<SezStatusApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status application stageses
	 */
	@Override
	public List<SezStatusApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SezStatusApplicationStages> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status application stageses
	 */
	@Override
	public List<SezStatusApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SezStatusApplicationStages> orderByComparator,
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

		List<SezStatusApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<SezStatusApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezStatusApplicationStages sezStatusApplicationStages :
						list) {

					if (!uuid.equals(sezStatusApplicationStages.getUuid()) ||
						(companyId !=
							sezStatusApplicationStages.getCompanyId())) {

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

			sb.append(_SQL_SELECT_SEZSTATUSAPPLICATIONSTAGES_WHERE);

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
				sb.append(SezStatusApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<SezStatusApplicationStages>)QueryUtil.list(
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
	 * Returns the first sez status application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	@Override
	public SezStatusApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<SezStatusApplicationStages> orderByComparator)
		throws NoSuchSezStatusApplicationStagesException {

		SezStatusApplicationStages sezStatusApplicationStages =
			fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (sezStatusApplicationStages != null) {
			return sezStatusApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchSezStatusApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first sez status application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	@Override
	public SezStatusApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<SezStatusApplicationStages> orderByComparator) {

		List<SezStatusApplicationStages> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez status application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	@Override
	public SezStatusApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<SezStatusApplicationStages> orderByComparator)
		throws NoSuchSezStatusApplicationStagesException {

		SezStatusApplicationStages sezStatusApplicationStages =
			fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (sezStatusApplicationStages != null) {
			return sezStatusApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchSezStatusApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last sez status application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	@Override
	public SezStatusApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<SezStatusApplicationStages> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<SezStatusApplicationStages> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez status application stageses before and after the current sez status application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param SezStatusApplicationStagesId the primary key of the current sez status application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a sez status application stages with the primary key could not be found
	 */
	@Override
	public SezStatusApplicationStages[] findByUuid_C_PrevAndNext(
			long SezStatusApplicationStagesId, String uuid, long companyId,
			OrderByComparator<SezStatusApplicationStages> orderByComparator)
		throws NoSuchSezStatusApplicationStagesException {

		uuid = Objects.toString(uuid, "");

		SezStatusApplicationStages sezStatusApplicationStages =
			findByPrimaryKey(SezStatusApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			SezStatusApplicationStages[] array =
				new SezStatusApplicationStagesImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, sezStatusApplicationStages, uuid, companyId,
				orderByComparator, true);

			array[1] = sezStatusApplicationStages;

			array[2] = getByUuid_C_PrevAndNext(
				session, sezStatusApplicationStages, uuid, companyId,
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

	protected SezStatusApplicationStages getByUuid_C_PrevAndNext(
		Session session, SezStatusApplicationStages sezStatusApplicationStages,
		String uuid, long companyId,
		OrderByComparator<SezStatusApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZSTATUSAPPLICATIONSTAGES_WHERE);

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
			sb.append(SezStatusApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						sezStatusApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezStatusApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez status application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (SezStatusApplicationStages sezStatusApplicationStages :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(sezStatusApplicationStages);
		}
	}

	/**
	 * Returns the number of sez status application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching sez status application stageses
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_SEZSTATUSAPPLICATIONSTAGES_WHERE);

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
		"sezStatusApplicationStages.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(sezStatusApplicationStages.uuid IS NULL OR sezStatusApplicationStages.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"sezStatusApplicationStages.companyId = ?";

	private FinderPath _finderPathFetchBygetSAS_SAI;
	private FinderPath _finderPathCountBygetSAS_SAI;

	/**
	 * Returns the sez status application stages where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezStatusApplicationStagesException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	@Override
	public SezStatusApplicationStages findBygetSAS_SAI(
			long sezStatusApplicationId)
		throws NoSuchSezStatusApplicationStagesException {

		SezStatusApplicationStages sezStatusApplicationStages =
			fetchBygetSAS_SAI(sezStatusApplicationId);

		if (sezStatusApplicationStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sezStatusApplicationId=");
			sb.append(sezStatusApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezStatusApplicationStagesException(sb.toString());
		}

		return sezStatusApplicationStages;
	}

	/**
	 * Returns the sez status application stages where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	@Override
	public SezStatusApplicationStages fetchBygetSAS_SAI(
		long sezStatusApplicationId) {

		return fetchBygetSAS_SAI(sezStatusApplicationId, true);
	}

	/**
	 * Returns the sez status application stages where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	@Override
	public SezStatusApplicationStages fetchBygetSAS_SAI(
		long sezStatusApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {sezStatusApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetSAS_SAI, finderArgs, this);
		}

		if (result instanceof SezStatusApplicationStages) {
			SezStatusApplicationStages sezStatusApplicationStages =
				(SezStatusApplicationStages)result;

			if (sezStatusApplicationId !=
					sezStatusApplicationStages.getSezStatusApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZSTATUSAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETSAS_SAI_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				List<SezStatusApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetSAS_SAI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									sezStatusApplicationId
								};
							}

							_log.warn(
								"SezStatusApplicationStagesPersistenceImpl.fetchBygetSAS_SAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezStatusApplicationStages sezStatusApplicationStages =
						list.get(0);

					result = sezStatusApplicationStages;

					cacheResult(sezStatusApplicationStages);
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
			return (SezStatusApplicationStages)result;
		}
	}

	/**
	 * Removes the sez status application stages where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez status application stages that was removed
	 */
	@Override
	public SezStatusApplicationStages removeBygetSAS_SAI(
			long sezStatusApplicationId)
		throws NoSuchSezStatusApplicationStagesException {

		SezStatusApplicationStages sezStatusApplicationStages =
			findBygetSAS_SAI(sezStatusApplicationId);

		return remove(sezStatusApplicationStages);
	}

	/**
	 * Returns the number of sez status application stageses where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez status application stageses
	 */
	@Override
	public int countBygetSAS_SAI(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSAS_SAI;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZSTATUSAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETSAS_SAI_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

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
		_FINDER_COLUMN_GETSAS_SAI_SEZSTATUSAPPLICATIONID_2 =
			"sezStatusApplicationStages.sezStatusApplicationId = ?";

	private FinderPath _finderPathFetchBygetSAS_CaseIdStageName;
	private FinderPath _finderPathCountBygetSAS_CaseIdStageName;

	/**
	 * Returns the sez status application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchSezStatusApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	@Override
	public SezStatusApplicationStages findBygetSAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchSezStatusApplicationStagesException {

		SezStatusApplicationStages sezStatusApplicationStages =
			fetchBygetSAS_CaseIdStageName(caseId, stageName);

		if (sezStatusApplicationStages == null) {
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

			throw new NoSuchSezStatusApplicationStagesException(sb.toString());
		}

		return sezStatusApplicationStages;
	}

	/**
	 * Returns the sez status application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	@Override
	public SezStatusApplicationStages fetchBygetSAS_CaseIdStageName(
		String caseId, String stageName) {

		return fetchBygetSAS_CaseIdStageName(caseId, stageName, true);
	}

	/**
	 * Returns the sez status application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	@Override
	public SezStatusApplicationStages fetchBygetSAS_CaseIdStageName(
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
				_finderPathFetchBygetSAS_CaseIdStageName, finderArgs, this);
		}

		if (result instanceof SezStatusApplicationStages) {
			SezStatusApplicationStages sezStatusApplicationStages =
				(SezStatusApplicationStages)result;

			if (!Objects.equals(
					caseId, sezStatusApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, sezStatusApplicationStages.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_SEZSTATUSAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSAS_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETSAS_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSAS_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETSAS_CASEIDSTAGENAME_STAGENAME_2);
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

				List<SezStatusApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetSAS_CaseIdStageName,
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
								"SezStatusApplicationStagesPersistenceImpl.fetchBygetSAS_CaseIdStageName(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezStatusApplicationStages sezStatusApplicationStages =
						list.get(0);

					result = sezStatusApplicationStages;

					cacheResult(sezStatusApplicationStages);
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
			return (SezStatusApplicationStages)result;
		}
	}

	/**
	 * Removes the sez status application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the sez status application stages that was removed
	 */
	@Override
	public SezStatusApplicationStages removeBygetSAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchSezStatusApplicationStagesException {

		SezStatusApplicationStages sezStatusApplicationStages =
			findBygetSAS_CaseIdStageName(caseId, stageName);

		return remove(sezStatusApplicationStages);
	}

	/**
	 * Returns the number of sez status application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching sez status application stageses
	 */
	@Override
	public int countBygetSAS_CaseIdStageName(String caseId, String stageName) {
		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetSAS_CaseIdStageName;

		Object[] finderArgs = new Object[] {caseId, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_SEZSTATUSAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSAS_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETSAS_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSAS_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETSAS_CASEIDSTAGENAME_STAGENAME_2);
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

	private static final String _FINDER_COLUMN_GETSAS_CASEIDSTAGENAME_CASEID_2 =
		"sezStatusApplicationStages.caseId = ? AND ";

	private static final String _FINDER_COLUMN_GETSAS_CASEIDSTAGENAME_CASEID_3 =
		"(sezStatusApplicationStages.caseId IS NULL OR sezStatusApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETSAS_CASEIDSTAGENAME_STAGENAME_2 =
			"sezStatusApplicationStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETSAS_CASEIDSTAGENAME_STAGENAME_3 =
			"(sezStatusApplicationStages.stageName IS NULL OR sezStatusApplicationStages.stageName = '')";

	private FinderPath _finderPathWithPaginationFindBygetSAS_StageName;
	private FinderPath _finderPathWithoutPaginationFindBygetSAS_StageName;
	private FinderPath _finderPathCountBygetSAS_StageName;

	/**
	 * Returns all the sez status application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching sez status application stageses
	 */
	@Override
	public List<SezStatusApplicationStages> findBygetSAS_StageName(
		String stageName) {

		return findBygetSAS_StageName(
			stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @return the range of matching sez status application stageses
	 */
	@Override
	public List<SezStatusApplicationStages> findBygetSAS_StageName(
		String stageName, int start, int end) {

		return findBygetSAS_StageName(stageName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status application stageses
	 */
	@Override
	public List<SezStatusApplicationStages> findBygetSAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<SezStatusApplicationStages> orderByComparator) {

		return findBygetSAS_StageName(
			stageName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status application stageses
	 */
	@Override
	public List<SezStatusApplicationStages> findBygetSAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<SezStatusApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetSAS_StageName;
				finderArgs = new Object[] {stageName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetSAS_StageName;
			finderArgs = new Object[] {
				stageName, start, end, orderByComparator
			};
		}

		List<SezStatusApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<SezStatusApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezStatusApplicationStages sezStatusApplicationStages :
						list) {

					if (!stageName.equals(
							sezStatusApplicationStages.getStageName())) {

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

			sb.append(_SQL_SELECT_SEZSTATUSAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSAS_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETSAS_STAGENAME_STAGENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SezStatusApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<SezStatusApplicationStages>)QueryUtil.list(
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
	 * Returns the first sez status application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	@Override
	public SezStatusApplicationStages findBygetSAS_StageName_First(
			String stageName,
			OrderByComparator<SezStatusApplicationStages> orderByComparator)
		throws NoSuchSezStatusApplicationStagesException {

		SezStatusApplicationStages sezStatusApplicationStages =
			fetchBygetSAS_StageName_First(stageName, orderByComparator);

		if (sezStatusApplicationStages != null) {
			return sezStatusApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchSezStatusApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first sez status application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	@Override
	public SezStatusApplicationStages fetchBygetSAS_StageName_First(
		String stageName,
		OrderByComparator<SezStatusApplicationStages> orderByComparator) {

		List<SezStatusApplicationStages> list = findBygetSAS_StageName(
			stageName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez status application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	@Override
	public SezStatusApplicationStages findBygetSAS_StageName_Last(
			String stageName,
			OrderByComparator<SezStatusApplicationStages> orderByComparator)
		throws NoSuchSezStatusApplicationStagesException {

		SezStatusApplicationStages sezStatusApplicationStages =
			fetchBygetSAS_StageName_Last(stageName, orderByComparator);

		if (sezStatusApplicationStages != null) {
			return sezStatusApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchSezStatusApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last sez status application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	@Override
	public SezStatusApplicationStages fetchBygetSAS_StageName_Last(
		String stageName,
		OrderByComparator<SezStatusApplicationStages> orderByComparator) {

		int count = countBygetSAS_StageName(stageName);

		if (count == 0) {
			return null;
		}

		List<SezStatusApplicationStages> list = findBygetSAS_StageName(
			stageName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez status application stageses before and after the current sez status application stages in the ordered set where stageName = &#63;.
	 *
	 * @param SezStatusApplicationStagesId the primary key of the current sez status application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a sez status application stages with the primary key could not be found
	 */
	@Override
	public SezStatusApplicationStages[] findBygetSAS_StageName_PrevAndNext(
			long SezStatusApplicationStagesId, String stageName,
			OrderByComparator<SezStatusApplicationStages> orderByComparator)
		throws NoSuchSezStatusApplicationStagesException {

		stageName = Objects.toString(stageName, "");

		SezStatusApplicationStages sezStatusApplicationStages =
			findByPrimaryKey(SezStatusApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			SezStatusApplicationStages[] array =
				new SezStatusApplicationStagesImpl[3];

			array[0] = getBygetSAS_StageName_PrevAndNext(
				session, sezStatusApplicationStages, stageName,
				orderByComparator, true);

			array[1] = sezStatusApplicationStages;

			array[2] = getBygetSAS_StageName_PrevAndNext(
				session, sezStatusApplicationStages, stageName,
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

	protected SezStatusApplicationStages getBygetSAS_StageName_PrevAndNext(
		Session session, SezStatusApplicationStages sezStatusApplicationStages,
		String stageName,
		OrderByComparator<SezStatusApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZSTATUSAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETSAS_STAGENAME_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETSAS_STAGENAME_STAGENAME_2);
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
			sb.append(SezStatusApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						sezStatusApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezStatusApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez status application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	@Override
	public void removeBygetSAS_StageName(String stageName) {
		for (SezStatusApplicationStages sezStatusApplicationStages :
				findBygetSAS_StageName(
					stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(sezStatusApplicationStages);
		}
	}

	/**
	 * Returns the number of sez status application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching sez status application stageses
	 */
	@Override
	public int countBygetSAS_StageName(String stageName) {
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetSAS_StageName;

		Object[] finderArgs = new Object[] {stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZSTATUSAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSAS_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETSAS_STAGENAME_STAGENAME_2);
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

	private static final String _FINDER_COLUMN_GETSAS_STAGENAME_STAGENAME_2 =
		"sezStatusApplicationStages.stageName = ?";

	private static final String _FINDER_COLUMN_GETSAS_STAGENAME_STAGENAME_3 =
		"(sezStatusApplicationStages.stageName IS NULL OR sezStatusApplicationStages.stageName = '')";

	private FinderPath _finderPathFetchBygetSAS_CaseIdStageStatus;
	private FinderPath _finderPathCountBygetSAS_CaseIdStageStatus;

	/**
	 * Returns the sez status application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchSezStatusApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	@Override
	public SezStatusApplicationStages findBygetSAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchSezStatusApplicationStagesException {

		SezStatusApplicationStages sezStatusApplicationStages =
			fetchBygetSAS_CaseIdStageStatus(caseId, stageName, stageStatus);

		if (sezStatusApplicationStages == null) {
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

			throw new NoSuchSezStatusApplicationStagesException(sb.toString());
		}

		return sezStatusApplicationStages;
	}

	/**
	 * Returns the sez status application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	@Override
	public SezStatusApplicationStages fetchBygetSAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return fetchBygetSAS_CaseIdStageStatus(
			caseId, stageName, stageStatus, true);
	}

	/**
	 * Returns the sez status application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	@Override
	public SezStatusApplicationStages fetchBygetSAS_CaseIdStageStatus(
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
				_finderPathFetchBygetSAS_CaseIdStageStatus, finderArgs, this);
		}

		if (result instanceof SezStatusApplicationStages) {
			SezStatusApplicationStages sezStatusApplicationStages =
				(SezStatusApplicationStages)result;

			if (!Objects.equals(
					caseId, sezStatusApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, sezStatusApplicationStages.getStageName()) ||
				!Objects.equals(
					stageStatus, sezStatusApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_SEZSTATUSAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_STAGESTATUS_2);
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

				List<SezStatusApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetSAS_CaseIdStageStatus,
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
								"SezStatusApplicationStagesPersistenceImpl.fetchBygetSAS_CaseIdStageStatus(String, String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezStatusApplicationStages sezStatusApplicationStages =
						list.get(0);

					result = sezStatusApplicationStages;

					cacheResult(sezStatusApplicationStages);
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
			return (SezStatusApplicationStages)result;
		}
	}

	/**
	 * Removes the sez status application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the sez status application stages that was removed
	 */
	@Override
	public SezStatusApplicationStages removeBygetSAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchSezStatusApplicationStagesException {

		SezStatusApplicationStages sezStatusApplicationStages =
			findBygetSAS_CaseIdStageStatus(caseId, stageName, stageStatus);

		return remove(sezStatusApplicationStages);
	}

	/**
	 * Returns the number of sez status application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching sez status application stageses
	 */
	@Override
	public int countBygetSAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetSAS_CaseIdStageStatus;

		Object[] finderArgs = new Object[] {caseId, stageName, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_SEZSTATUSAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_STAGESTATUS_2);
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
		_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_CASEID_2 =
			"sezStatusApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_CASEID_3 =
			"(sezStatusApplicationStages.caseId IS NULL OR sezStatusApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_STAGENAME_2 =
			"sezStatusApplicationStages.stageName = ? AND ";

	private static final String
		_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_STAGENAME_3 =
			"(sezStatusApplicationStages.stageName IS NULL OR sezStatusApplicationStages.stageName = '') AND ";

	private static final String
		_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_STAGESTATUS_2 =
			"sezStatusApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_STAGESTATUS_3 =
			"(sezStatusApplicationStages.stageStatus IS NULL OR sezStatusApplicationStages.stageStatus = '')";

	private FinderPath _finderPathFetchBygetSAS_CaseIdAndStatus;
	private FinderPath _finderPathCountBygetSAS_CaseIdAndStatus;

	/**
	 * Returns the sez status application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchSezStatusApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	@Override
	public SezStatusApplicationStages findBygetSAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchSezStatusApplicationStagesException {

		SezStatusApplicationStages sezStatusApplicationStages =
			fetchBygetSAS_CaseIdAndStatus(caseId, stageStatus);

		if (sezStatusApplicationStages == null) {
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

			throw new NoSuchSezStatusApplicationStagesException(sb.toString());
		}

		return sezStatusApplicationStages;
	}

	/**
	 * Returns the sez status application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	@Override
	public SezStatusApplicationStages fetchBygetSAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return fetchBygetSAS_CaseIdAndStatus(caseId, stageStatus, true);
	}

	/**
	 * Returns the sez status application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	@Override
	public SezStatusApplicationStages fetchBygetSAS_CaseIdAndStatus(
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
				_finderPathFetchBygetSAS_CaseIdAndStatus, finderArgs, this);
		}

		if (result instanceof SezStatusApplicationStages) {
			SezStatusApplicationStages sezStatusApplicationStages =
				(SezStatusApplicationStages)result;

			if (!Objects.equals(
					caseId, sezStatusApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageStatus, sezStatusApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_SEZSTATUSAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSAS_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETSAS_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSAS_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETSAS_CASEIDANDSTATUS_STAGESTATUS_2);
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

				List<SezStatusApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetSAS_CaseIdAndStatus,
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
								"SezStatusApplicationStagesPersistenceImpl.fetchBygetSAS_CaseIdAndStatus(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezStatusApplicationStages sezStatusApplicationStages =
						list.get(0);

					result = sezStatusApplicationStages;

					cacheResult(sezStatusApplicationStages);
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
			return (SezStatusApplicationStages)result;
		}
	}

	/**
	 * Removes the sez status application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the sez status application stages that was removed
	 */
	@Override
	public SezStatusApplicationStages removeBygetSAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchSezStatusApplicationStagesException {

		SezStatusApplicationStages sezStatusApplicationStages =
			findBygetSAS_CaseIdAndStatus(caseId, stageStatus);

		return remove(sezStatusApplicationStages);
	}

	/**
	 * Returns the number of sez status application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching sez status application stageses
	 */
	@Override
	public int countBygetSAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetSAS_CaseIdAndStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_SEZSTATUSAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSAS_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETSAS_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSAS_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETSAS_CASEIDANDSTATUS_STAGESTATUS_2);
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

	private static final String _FINDER_COLUMN_GETSAS_CASEIDANDSTATUS_CASEID_2 =
		"sezStatusApplicationStages.caseId = ? AND ";

	private static final String _FINDER_COLUMN_GETSAS_CASEIDANDSTATUS_CASEID_3 =
		"(sezStatusApplicationStages.caseId IS NULL OR sezStatusApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETSAS_CASEIDANDSTATUS_STAGESTATUS_2 =
			"sezStatusApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETSAS_CASEIDANDSTATUS_STAGESTATUS_3 =
			"(sezStatusApplicationStages.stageStatus IS NULL OR sezStatusApplicationStages.stageStatus = '')";

	private FinderPath _finderPathWithPaginationFindBygetSAS_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetSAS_CaseId;
	private FinderPath _finderPathCountBygetSAS_CaseId;

	/**
	 * Returns all the sez status application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status application stageses
	 */
	@Override
	public List<SezStatusApplicationStages> findBygetSAS_CaseId(String caseId) {
		return findBygetSAS_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @return the range of matching sez status application stageses
	 */
	@Override
	public List<SezStatusApplicationStages> findBygetSAS_CaseId(
		String caseId, int start, int end) {

		return findBygetSAS_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status application stageses
	 */
	@Override
	public List<SezStatusApplicationStages> findBygetSAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<SezStatusApplicationStages> orderByComparator) {

		return findBygetSAS_CaseId(caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status application stageses
	 */
	@Override
	public List<SezStatusApplicationStages> findBygetSAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<SezStatusApplicationStages> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetSAS_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetSAS_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<SezStatusApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<SezStatusApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezStatusApplicationStages sezStatusApplicationStages :
						list) {

					if (!caseId.equals(
							sezStatusApplicationStages.getCaseId())) {

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

			sb.append(_SQL_SELECT_SEZSTATUSAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSAS_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETSAS_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SezStatusApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<SezStatusApplicationStages>)QueryUtil.list(
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
	 * Returns the first sez status application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	@Override
	public SezStatusApplicationStages findBygetSAS_CaseId_First(
			String caseId,
			OrderByComparator<SezStatusApplicationStages> orderByComparator)
		throws NoSuchSezStatusApplicationStagesException {

		SezStatusApplicationStages sezStatusApplicationStages =
			fetchBygetSAS_CaseId_First(caseId, orderByComparator);

		if (sezStatusApplicationStages != null) {
			return sezStatusApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchSezStatusApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first sez status application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	@Override
	public SezStatusApplicationStages fetchBygetSAS_CaseId_First(
		String caseId,
		OrderByComparator<SezStatusApplicationStages> orderByComparator) {

		List<SezStatusApplicationStages> list = findBygetSAS_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez status application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	@Override
	public SezStatusApplicationStages findBygetSAS_CaseId_Last(
			String caseId,
			OrderByComparator<SezStatusApplicationStages> orderByComparator)
		throws NoSuchSezStatusApplicationStagesException {

		SezStatusApplicationStages sezStatusApplicationStages =
			fetchBygetSAS_CaseId_Last(caseId, orderByComparator);

		if (sezStatusApplicationStages != null) {
			return sezStatusApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchSezStatusApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last sez status application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	@Override
	public SezStatusApplicationStages fetchBygetSAS_CaseId_Last(
		String caseId,
		OrderByComparator<SezStatusApplicationStages> orderByComparator) {

		int count = countBygetSAS_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<SezStatusApplicationStages> list = findBygetSAS_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez status application stageses before and after the current sez status application stages in the ordered set where caseId = &#63;.
	 *
	 * @param SezStatusApplicationStagesId the primary key of the current sez status application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a sez status application stages with the primary key could not be found
	 */
	@Override
	public SezStatusApplicationStages[] findBygetSAS_CaseId_PrevAndNext(
			long SezStatusApplicationStagesId, String caseId,
			OrderByComparator<SezStatusApplicationStages> orderByComparator)
		throws NoSuchSezStatusApplicationStagesException {

		caseId = Objects.toString(caseId, "");

		SezStatusApplicationStages sezStatusApplicationStages =
			findByPrimaryKey(SezStatusApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			SezStatusApplicationStages[] array =
				new SezStatusApplicationStagesImpl[3];

			array[0] = getBygetSAS_CaseId_PrevAndNext(
				session, sezStatusApplicationStages, caseId, orderByComparator,
				true);

			array[1] = sezStatusApplicationStages;

			array[2] = getBygetSAS_CaseId_PrevAndNext(
				session, sezStatusApplicationStages, caseId, orderByComparator,
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

	protected SezStatusApplicationStages getBygetSAS_CaseId_PrevAndNext(
		Session session, SezStatusApplicationStages sezStatusApplicationStages,
		String caseId,
		OrderByComparator<SezStatusApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZSTATUSAPPLICATIONSTAGES_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETSAS_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETSAS_CASEID_CASEID_2);
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
			sb.append(SezStatusApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						sezStatusApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezStatusApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez status application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetSAS_CaseId(String caseId) {
		for (SezStatusApplicationStages sezStatusApplicationStages :
				findBygetSAS_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(sezStatusApplicationStages);
		}
	}

	/**
	 * Returns the number of sez status application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching sez status application stageses
	 */
	@Override
	public int countBygetSAS_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetSAS_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZSTATUSAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSAS_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETSAS_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETSAS_CASEID_CASEID_2 =
		"sezStatusApplicationStages.caseId = ?";

	private static final String _FINDER_COLUMN_GETSAS_CASEID_CASEID_3 =
		"(sezStatusApplicationStages.caseId IS NULL OR sezStatusApplicationStages.caseId = '')";

	private FinderPath _finderPathFetchBygetSAS_By_CaseId;
	private FinderPath _finderPathCountBygetSAS_By_CaseId;

	/**
	 * Returns the sez status application stages where caseId = &#63; or throws a <code>NoSuchSezStatusApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	@Override
	public SezStatusApplicationStages findBygetSAS_By_CaseId(String caseId)
		throws NoSuchSezStatusApplicationStagesException {

		SezStatusApplicationStages sezStatusApplicationStages =
			fetchBygetSAS_By_CaseId(caseId);

		if (sezStatusApplicationStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezStatusApplicationStagesException(sb.toString());
		}

		return sezStatusApplicationStages;
	}

	/**
	 * Returns the sez status application stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	@Override
	public SezStatusApplicationStages fetchBygetSAS_By_CaseId(String caseId) {
		return fetchBygetSAS_By_CaseId(caseId, true);
	}

	/**
	 * Returns the sez status application stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	@Override
	public SezStatusApplicationStages fetchBygetSAS_By_CaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetSAS_By_CaseId, finderArgs, this);
		}

		if (result instanceof SezStatusApplicationStages) {
			SezStatusApplicationStages sezStatusApplicationStages =
				(SezStatusApplicationStages)result;

			if (!Objects.equals(
					caseId, sezStatusApplicationStages.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZSTATUSAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSAS_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETSAS_BY_CASEID_CASEID_2);
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

				List<SezStatusApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetSAS_By_CaseId, finderArgs,
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
								"SezStatusApplicationStagesPersistenceImpl.fetchBygetSAS_By_CaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezStatusApplicationStages sezStatusApplicationStages =
						list.get(0);

					result = sezStatusApplicationStages;

					cacheResult(sezStatusApplicationStages);
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
			return (SezStatusApplicationStages)result;
		}
	}

	/**
	 * Removes the sez status application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the sez status application stages that was removed
	 */
	@Override
	public SezStatusApplicationStages removeBygetSAS_By_CaseId(String caseId)
		throws NoSuchSezStatusApplicationStagesException {

		SezStatusApplicationStages sezStatusApplicationStages =
			findBygetSAS_By_CaseId(caseId);

		return remove(sezStatusApplicationStages);
	}

	/**
	 * Returns the number of sez status application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching sez status application stageses
	 */
	@Override
	public int countBygetSAS_By_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetSAS_By_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZSTATUSAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSAS_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETSAS_BY_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETSAS_BY_CASEID_CASEID_2 =
		"sezStatusApplicationStages.caseId = ?";

	private static final String _FINDER_COLUMN_GETSAS_BY_CASEID_CASEID_3 =
		"(sezStatusApplicationStages.caseId IS NULL OR sezStatusApplicationStages.caseId = '')";

	public SezStatusApplicationStagesPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(SezStatusApplicationStages.class);

		setModelImplClass(SezStatusApplicationStagesImpl.class);
		setModelPKClass(long.class);

		setTable(SezStatusApplicationStagesTable.INSTANCE);
	}

	/**
	 * Caches the sez status application stages in the entity cache if it is enabled.
	 *
	 * @param sezStatusApplicationStages the sez status application stages
	 */
	@Override
	public void cacheResult(
		SezStatusApplicationStages sezStatusApplicationStages) {

		entityCache.putResult(
			SezStatusApplicationStagesImpl.class,
			sezStatusApplicationStages.getPrimaryKey(),
			sezStatusApplicationStages);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				sezStatusApplicationStages.getUuid(),
				sezStatusApplicationStages.getGroupId()
			},
			sezStatusApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetSAS_SAI,
			new Object[] {
				sezStatusApplicationStages.getSezStatusApplicationId()
			},
			sezStatusApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetSAS_CaseIdStageName,
			new Object[] {
				sezStatusApplicationStages.getCaseId(),
				sezStatusApplicationStages.getStageName()
			},
			sezStatusApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetSAS_CaseIdStageStatus,
			new Object[] {
				sezStatusApplicationStages.getCaseId(),
				sezStatusApplicationStages.getStageName(),
				sezStatusApplicationStages.getStageStatus()
			},
			sezStatusApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetSAS_CaseIdAndStatus,
			new Object[] {
				sezStatusApplicationStages.getCaseId(),
				sezStatusApplicationStages.getStageStatus()
			},
			sezStatusApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetSAS_By_CaseId,
			new Object[] {sezStatusApplicationStages.getCaseId()},
			sezStatusApplicationStages);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez status application stageses in the entity cache if it is enabled.
	 *
	 * @param sezStatusApplicationStageses the sez status application stageses
	 */
	@Override
	public void cacheResult(
		List<SezStatusApplicationStages> sezStatusApplicationStageses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezStatusApplicationStageses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezStatusApplicationStages sezStatusApplicationStages :
				sezStatusApplicationStageses) {

			if (entityCache.getResult(
					SezStatusApplicationStagesImpl.class,
					sezStatusApplicationStages.getPrimaryKey()) == null) {

				cacheResult(sezStatusApplicationStages);
			}
		}
	}

	/**
	 * Clears the cache for all sez status application stageses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezStatusApplicationStagesImpl.class);

		finderCache.clearCache(SezStatusApplicationStagesImpl.class);
	}

	/**
	 * Clears the cache for the sez status application stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SezStatusApplicationStages sezStatusApplicationStages) {

		entityCache.removeResult(
			SezStatusApplicationStagesImpl.class, sezStatusApplicationStages);
	}

	@Override
	public void clearCache(
		List<SezStatusApplicationStages> sezStatusApplicationStageses) {

		for (SezStatusApplicationStages sezStatusApplicationStages :
				sezStatusApplicationStageses) {

			entityCache.removeResult(
				SezStatusApplicationStagesImpl.class,
				sezStatusApplicationStages);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezStatusApplicationStagesImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezStatusApplicationStagesImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezStatusApplicationStagesModelImpl
			sezStatusApplicationStagesModelImpl) {

		Object[] args = new Object[] {
			sezStatusApplicationStagesModelImpl.getUuid(),
			sezStatusApplicationStagesModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args,
			sezStatusApplicationStagesModelImpl);

		args = new Object[] {
			sezStatusApplicationStagesModelImpl.getSezStatusApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetSAS_SAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSAS_SAI, args,
			sezStatusApplicationStagesModelImpl);

		args = new Object[] {
			sezStatusApplicationStagesModelImpl.getCaseId(),
			sezStatusApplicationStagesModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetSAS_CaseIdStageName, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSAS_CaseIdStageName, args,
			sezStatusApplicationStagesModelImpl);

		args = new Object[] {
			sezStatusApplicationStagesModelImpl.getCaseId(),
			sezStatusApplicationStagesModelImpl.getStageName(),
			sezStatusApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetSAS_CaseIdStageStatus, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSAS_CaseIdStageStatus, args,
			sezStatusApplicationStagesModelImpl);

		args = new Object[] {
			sezStatusApplicationStagesModelImpl.getCaseId(),
			sezStatusApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetSAS_CaseIdAndStatus, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSAS_CaseIdAndStatus, args,
			sezStatusApplicationStagesModelImpl);

		args = new Object[] {sezStatusApplicationStagesModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetSAS_By_CaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSAS_By_CaseId, args,
			sezStatusApplicationStagesModelImpl);
	}

	/**
	 * Creates a new sez status application stages with the primary key. Does not add the sez status application stages to the database.
	 *
	 * @param SezStatusApplicationStagesId the primary key for the new sez status application stages
	 * @return the new sez status application stages
	 */
	@Override
	public SezStatusApplicationStages create(
		long SezStatusApplicationStagesId) {

		SezStatusApplicationStages sezStatusApplicationStages =
			new SezStatusApplicationStagesImpl();

		sezStatusApplicationStages.setNew(true);
		sezStatusApplicationStages.setPrimaryKey(SezStatusApplicationStagesId);

		String uuid = PortalUUIDUtil.generate();

		sezStatusApplicationStages.setUuid(uuid);

		sezStatusApplicationStages.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezStatusApplicationStages;
	}

	/**
	 * Removes the sez status application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param SezStatusApplicationStagesId the primary key of the sez status application stages
	 * @return the sez status application stages that was removed
	 * @throws NoSuchSezStatusApplicationStagesException if a sez status application stages with the primary key could not be found
	 */
	@Override
	public SezStatusApplicationStages remove(long SezStatusApplicationStagesId)
		throws NoSuchSezStatusApplicationStagesException {

		return remove((Serializable)SezStatusApplicationStagesId);
	}

	/**
	 * Removes the sez status application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez status application stages
	 * @return the sez status application stages that was removed
	 * @throws NoSuchSezStatusApplicationStagesException if a sez status application stages with the primary key could not be found
	 */
	@Override
	public SezStatusApplicationStages remove(Serializable primaryKey)
		throws NoSuchSezStatusApplicationStagesException {

		Session session = null;

		try {
			session = openSession();

			SezStatusApplicationStages sezStatusApplicationStages =
				(SezStatusApplicationStages)session.get(
					SezStatusApplicationStagesImpl.class, primaryKey);

			if (sezStatusApplicationStages == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezStatusApplicationStagesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezStatusApplicationStages);
		}
		catch (NoSuchSezStatusApplicationStagesException
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
	protected SezStatusApplicationStages removeImpl(
		SezStatusApplicationStages sezStatusApplicationStages) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezStatusApplicationStages)) {
				sezStatusApplicationStages =
					(SezStatusApplicationStages)session.get(
						SezStatusApplicationStagesImpl.class,
						sezStatusApplicationStages.getPrimaryKeyObj());
			}

			if (sezStatusApplicationStages != null) {
				session.delete(sezStatusApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezStatusApplicationStages != null) {
			clearCache(sezStatusApplicationStages);
		}

		return sezStatusApplicationStages;
	}

	@Override
	public SezStatusApplicationStages updateImpl(
		SezStatusApplicationStages sezStatusApplicationStages) {

		boolean isNew = sezStatusApplicationStages.isNew();

		if (!(sezStatusApplicationStages instanceof
				SezStatusApplicationStagesModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezStatusApplicationStages.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezStatusApplicationStages);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezStatusApplicationStages proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezStatusApplicationStages implementation " +
					sezStatusApplicationStages.getClass());
		}

		SezStatusApplicationStagesModelImpl
			sezStatusApplicationStagesModelImpl =
				(SezStatusApplicationStagesModelImpl)sezStatusApplicationStages;

		if (Validator.isNull(sezStatusApplicationStages.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			sezStatusApplicationStages.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezStatusApplicationStages.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezStatusApplicationStages.setCreateDate(date);
			}
			else {
				sezStatusApplicationStages.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezStatusApplicationStagesModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezStatusApplicationStages.setModifiedDate(date);
			}
			else {
				sezStatusApplicationStages.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezStatusApplicationStages);
			}
			else {
				sezStatusApplicationStages =
					(SezStatusApplicationStages)session.merge(
						sezStatusApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezStatusApplicationStagesImpl.class,
			sezStatusApplicationStagesModelImpl, false, true);

		cacheUniqueFindersCache(sezStatusApplicationStagesModelImpl);

		if (isNew) {
			sezStatusApplicationStages.setNew(false);
		}

		sezStatusApplicationStages.resetOriginalValues();

		return sezStatusApplicationStages;
	}

	/**
	 * Returns the sez status application stages with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez status application stages
	 * @return the sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a sez status application stages with the primary key could not be found
	 */
	@Override
	public SezStatusApplicationStages findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezStatusApplicationStagesException {

		SezStatusApplicationStages sezStatusApplicationStages =
			fetchByPrimaryKey(primaryKey);

		if (sezStatusApplicationStages == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezStatusApplicationStagesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezStatusApplicationStages;
	}

	/**
	 * Returns the sez status application stages with the primary key or throws a <code>NoSuchSezStatusApplicationStagesException</code> if it could not be found.
	 *
	 * @param SezStatusApplicationStagesId the primary key of the sez status application stages
	 * @return the sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a sez status application stages with the primary key could not be found
	 */
	@Override
	public SezStatusApplicationStages findByPrimaryKey(
			long SezStatusApplicationStagesId)
		throws NoSuchSezStatusApplicationStagesException {

		return findByPrimaryKey((Serializable)SezStatusApplicationStagesId);
	}

	/**
	 * Returns the sez status application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param SezStatusApplicationStagesId the primary key of the sez status application stages
	 * @return the sez status application stages, or <code>null</code> if a sez status application stages with the primary key could not be found
	 */
	@Override
	public SezStatusApplicationStages fetchByPrimaryKey(
		long SezStatusApplicationStagesId) {

		return fetchByPrimaryKey((Serializable)SezStatusApplicationStagesId);
	}

	/**
	 * Returns all the sez status application stageses.
	 *
	 * @return the sez status application stageses
	 */
	@Override
	public List<SezStatusApplicationStages> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @return the range of sez status application stageses
	 */
	@Override
	public List<SezStatusApplicationStages> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status application stageses
	 */
	@Override
	public List<SezStatusApplicationStages> findAll(
		int start, int end,
		OrderByComparator<SezStatusApplicationStages> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status application stageses
	 */
	@Override
	public List<SezStatusApplicationStages> findAll(
		int start, int end,
		OrderByComparator<SezStatusApplicationStages> orderByComparator,
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

		List<SezStatusApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<SezStatusApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZSTATUSAPPLICATIONSTAGES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZSTATUSAPPLICATIONSTAGES;

				sql = sql.concat(
					SezStatusApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezStatusApplicationStages>)QueryUtil.list(
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
	 * Removes all the sez status application stageses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezStatusApplicationStages sezStatusApplicationStages :
				findAll()) {

			remove(sezStatusApplicationStages);
		}
	}

	/**
	 * Returns the number of sez status application stageses.
	 *
	 * @return the number of sez status application stageses
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
					_SQL_COUNT_SEZSTATUSAPPLICATIONSTAGES);

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
		return "SezStatusApplicationStagesId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZSTATUSAPPLICATIONSTAGES;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezStatusApplicationStagesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez status application stages persistence.
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

		_finderPathFetchBygetSAS_SAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetSAS_SAI",
			new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, true);

		_finderPathCountBygetSAS_SAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetSAS_SAI",
			new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, false);

		_finderPathFetchBygetSAS_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetSAS_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, true);

		_finderPathCountBygetSAS_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSAS_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, false);

		_finderPathWithPaginationFindBygetSAS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetSAS_StageName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"stageName"}, true);

		_finderPathWithoutPaginationFindBygetSAS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetSAS_StageName",
			new String[] {String.class.getName()}, new String[] {"stageName"},
			true);

		_finderPathCountBygetSAS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSAS_StageName", new String[] {String.class.getName()},
			new String[] {"stageName"}, false);

		_finderPathFetchBygetSAS_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetSAS_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageName", "stageStatus"}, true);

		_finderPathCountBygetSAS_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSAS_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageName", "stageStatus"}, false);

		_finderPathFetchBygetSAS_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetSAS_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, true);

		_finderPathCountBygetSAS_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSAS_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, false);

		_finderPathWithPaginationFindBygetSAS_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetSAS_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetSAS_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetSAS_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetSAS_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetSAS_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathFetchBygetSAS_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetSAS_By_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetSAS_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSAS_By_CaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		SezStatusApplicationStagesUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezStatusApplicationStagesUtil.setPersistence(null);

		entityCache.removeCache(SezStatusApplicationStagesImpl.class.getName());
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

	private static final String _SQL_SELECT_SEZSTATUSAPPLICATIONSTAGES =
		"SELECT sezStatusApplicationStages FROM SezStatusApplicationStages sezStatusApplicationStages";

	private static final String _SQL_SELECT_SEZSTATUSAPPLICATIONSTAGES_WHERE =
		"SELECT sezStatusApplicationStages FROM SezStatusApplicationStages sezStatusApplicationStages WHERE ";

	private static final String _SQL_COUNT_SEZSTATUSAPPLICATIONSTAGES =
		"SELECT COUNT(sezStatusApplicationStages) FROM SezStatusApplicationStages sezStatusApplicationStages";

	private static final String _SQL_COUNT_SEZSTATUSAPPLICATIONSTAGES_WHERE =
		"SELECT COUNT(sezStatusApplicationStages) FROM SezStatusApplicationStages sezStatusApplicationStages WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezStatusApplicationStages.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezStatusApplicationStages exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezStatusApplicationStages exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezStatusApplicationStagesPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}