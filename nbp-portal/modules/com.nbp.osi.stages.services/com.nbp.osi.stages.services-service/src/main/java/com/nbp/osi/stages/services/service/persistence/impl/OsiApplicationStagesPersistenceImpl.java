/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.service.persistence.impl;

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

import com.nbp.osi.stages.services.exception.NoSuchOsiApplicationStagesException;
import com.nbp.osi.stages.services.model.OsiApplicationStages;
import com.nbp.osi.stages.services.model.OsiApplicationStagesTable;
import com.nbp.osi.stages.services.model.impl.OsiApplicationStagesImpl;
import com.nbp.osi.stages.services.model.impl.OsiApplicationStagesModelImpl;
import com.nbp.osi.stages.services.service.persistence.OsiApplicationStagesPersistence;
import com.nbp.osi.stages.services.service.persistence.OsiApplicationStagesUtil;
import com.nbp.osi.stages.services.service.persistence.impl.constants.OSI_STAGESPersistenceConstants;

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
 * The persistence implementation for the osi application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OsiApplicationStagesPersistence.class)
public class OsiApplicationStagesPersistenceImpl
	extends BasePersistenceImpl<OsiApplicationStages>
	implements OsiApplicationStagesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OsiApplicationStagesUtil</code> to access the osi application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OsiApplicationStagesImpl.class.getName();

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
	 * Returns all the osi application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching osi application stageses
	 */
	@Override
	public List<OsiApplicationStages> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @return the range of matching osi application stageses
	 */
	@Override
	public List<OsiApplicationStages> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi application stageses
	 */
	@Override
	public List<OsiApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OsiApplicationStages> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi application stageses
	 */
	@Override
	public List<OsiApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OsiApplicationStages> orderByComparator,
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

		List<OsiApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<OsiApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiApplicationStages osiApplicationStages : list) {
					if (!uuid.equals(osiApplicationStages.getUuid())) {
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

			sb.append(_SQL_SELECT_OSIAPPLICATIONSTAGES_WHERE);

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
				sb.append(OsiApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<OsiApplicationStages>)QueryUtil.list(
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
	 * Returns the first osi application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages findByUuid_First(
			String uuid,
			OrderByComparator<OsiApplicationStages> orderByComparator)
		throws NoSuchOsiApplicationStagesException {

		OsiApplicationStages osiApplicationStages = fetchByUuid_First(
			uuid, orderByComparator);

		if (osiApplicationStages != null) {
			return osiApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchOsiApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first osi application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages fetchByUuid_First(
		String uuid,
		OrderByComparator<OsiApplicationStages> orderByComparator) {

		List<OsiApplicationStages> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages findByUuid_Last(
			String uuid,
			OrderByComparator<OsiApplicationStages> orderByComparator)
		throws NoSuchOsiApplicationStagesException {

		OsiApplicationStages osiApplicationStages = fetchByUuid_Last(
			uuid, orderByComparator);

		if (osiApplicationStages != null) {
			return osiApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchOsiApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last osi application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages fetchByUuid_Last(
		String uuid,
		OrderByComparator<OsiApplicationStages> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<OsiApplicationStages> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi application stageses before and after the current osi application stages in the ordered set where uuid = &#63;.
	 *
	 * @param OsiApplicationStagesId the primary key of the current osi application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a osi application stages with the primary key could not be found
	 */
	@Override
	public OsiApplicationStages[] findByUuid_PrevAndNext(
			long OsiApplicationStagesId, String uuid,
			OrderByComparator<OsiApplicationStages> orderByComparator)
		throws NoSuchOsiApplicationStagesException {

		uuid = Objects.toString(uuid, "");

		OsiApplicationStages osiApplicationStages = findByPrimaryKey(
			OsiApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			OsiApplicationStages[] array = new OsiApplicationStagesImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, osiApplicationStages, uuid, orderByComparator, true);

			array[1] = osiApplicationStages;

			array[2] = getByUuid_PrevAndNext(
				session, osiApplicationStages, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected OsiApplicationStages getByUuid_PrevAndNext(
		Session session, OsiApplicationStages osiApplicationStages, String uuid,
		OrderByComparator<OsiApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_OSIAPPLICATIONSTAGES_WHERE);

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
			sb.append(OsiApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						osiApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (OsiApplicationStages osiApplicationStages :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(osiApplicationStages);
		}
	}

	/**
	 * Returns the number of osi application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching osi application stageses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSIAPPLICATIONSTAGES_WHERE);

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
		"osiApplicationStages.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(osiApplicationStages.uuid IS NULL OR osiApplicationStages.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the osi application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOsiApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages findByUUID_G(String uuid, long groupId)
		throws NoSuchOsiApplicationStagesException {

		OsiApplicationStages osiApplicationStages = fetchByUUID_G(
			uuid, groupId);

		if (osiApplicationStages == null) {
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

			throw new NoSuchOsiApplicationStagesException(sb.toString());
		}

		return osiApplicationStages;
	}

	/**
	 * Returns the osi application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the osi application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages fetchByUUID_G(
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

		if (result instanceof OsiApplicationStages) {
			OsiApplicationStages osiApplicationStages =
				(OsiApplicationStages)result;

			if (!Objects.equals(uuid, osiApplicationStages.getUuid()) ||
				(groupId != osiApplicationStages.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_OSIAPPLICATIONSTAGES_WHERE);

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

				List<OsiApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					OsiApplicationStages osiApplicationStages = list.get(0);

					result = osiApplicationStages;

					cacheResult(osiApplicationStages);
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
			return (OsiApplicationStages)result;
		}
	}

	/**
	 * Removes the osi application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the osi application stages that was removed
	 */
	@Override
	public OsiApplicationStages removeByUUID_G(String uuid, long groupId)
		throws NoSuchOsiApplicationStagesException {

		OsiApplicationStages osiApplicationStages = findByUUID_G(uuid, groupId);

		return remove(osiApplicationStages);
	}

	/**
	 * Returns the number of osi application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching osi application stageses
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSIAPPLICATIONSTAGES_WHERE);

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
		"osiApplicationStages.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(osiApplicationStages.uuid IS NULL OR osiApplicationStages.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"osiApplicationStages.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the osi application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching osi application stageses
	 */
	@Override
	public List<OsiApplicationStages> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @return the range of matching osi application stageses
	 */
	@Override
	public List<OsiApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi application stageses
	 */
	@Override
	public List<OsiApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OsiApplicationStages> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi application stageses
	 */
	@Override
	public List<OsiApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OsiApplicationStages> orderByComparator,
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

		List<OsiApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<OsiApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiApplicationStages osiApplicationStages : list) {
					if (!uuid.equals(osiApplicationStages.getUuid()) ||
						(companyId != osiApplicationStages.getCompanyId())) {

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

			sb.append(_SQL_SELECT_OSIAPPLICATIONSTAGES_WHERE);

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
				sb.append(OsiApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<OsiApplicationStages>)QueryUtil.list(
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
	 * Returns the first osi application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<OsiApplicationStages> orderByComparator)
		throws NoSuchOsiApplicationStagesException {

		OsiApplicationStages osiApplicationStages = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (osiApplicationStages != null) {
			return osiApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchOsiApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first osi application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<OsiApplicationStages> orderByComparator) {

		List<OsiApplicationStages> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<OsiApplicationStages> orderByComparator)
		throws NoSuchOsiApplicationStagesException {

		OsiApplicationStages osiApplicationStages = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (osiApplicationStages != null) {
			return osiApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchOsiApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last osi application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<OsiApplicationStages> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<OsiApplicationStages> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi application stageses before and after the current osi application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param OsiApplicationStagesId the primary key of the current osi application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a osi application stages with the primary key could not be found
	 */
	@Override
	public OsiApplicationStages[] findByUuid_C_PrevAndNext(
			long OsiApplicationStagesId, String uuid, long companyId,
			OrderByComparator<OsiApplicationStages> orderByComparator)
		throws NoSuchOsiApplicationStagesException {

		uuid = Objects.toString(uuid, "");

		OsiApplicationStages osiApplicationStages = findByPrimaryKey(
			OsiApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			OsiApplicationStages[] array = new OsiApplicationStagesImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, osiApplicationStages, uuid, companyId,
				orderByComparator, true);

			array[1] = osiApplicationStages;

			array[2] = getByUuid_C_PrevAndNext(
				session, osiApplicationStages, uuid, companyId,
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

	protected OsiApplicationStages getByUuid_C_PrevAndNext(
		Session session, OsiApplicationStages osiApplicationStages, String uuid,
		long companyId,
		OrderByComparator<OsiApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_OSIAPPLICATIONSTAGES_WHERE);

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
			sb.append(OsiApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						osiApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (OsiApplicationStages osiApplicationStages :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(osiApplicationStages);
		}
	}

	/**
	 * Returns the number of osi application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching osi application stageses
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSIAPPLICATIONSTAGES_WHERE);

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
		"osiApplicationStages.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(osiApplicationStages.uuid IS NULL OR osiApplicationStages.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"osiApplicationStages.companyId = ?";

	private FinderPath _finderPathFetchBygetOAS_OAI;
	private FinderPath _finderPathCountBygetOAS_OAI;

	/**
	 * Returns the osi application stages where osiApplicationId = &#63; or throws a <code>NoSuchOsiApplicationStagesException</code> if it could not be found.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages findBygetOAS_OAI(long osiApplicationId)
		throws NoSuchOsiApplicationStagesException {

		OsiApplicationStages osiApplicationStages = fetchBygetOAS_OAI(
			osiApplicationId);

		if (osiApplicationStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiApplicationId=");
			sb.append(osiApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiApplicationStagesException(sb.toString());
		}

		return osiApplicationStages;
	}

	/**
	 * Returns the osi application stages where osiApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages fetchBygetOAS_OAI(long osiApplicationId) {
		return fetchBygetOAS_OAI(osiApplicationId, true);
	}

	/**
	 * Returns the osi application stages where osiApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages fetchBygetOAS_OAI(
		long osiApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {osiApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOAS_OAI, finderArgs, this);
		}

		if (result instanceof OsiApplicationStages) {
			OsiApplicationStages osiApplicationStages =
				(OsiApplicationStages)result;

			if (osiApplicationId !=
					osiApplicationStages.getOsiApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSIAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETOAS_OAI_OSIAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiApplicationId);

				List<OsiApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOAS_OAI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {osiApplicationId};
							}

							_log.warn(
								"OsiApplicationStagesPersistenceImpl.fetchBygetOAS_OAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiApplicationStages osiApplicationStages = list.get(0);

					result = osiApplicationStages;

					cacheResult(osiApplicationStages);
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
			return (OsiApplicationStages)result;
		}
	}

	/**
	 * Removes the osi application stages where osiApplicationId = &#63; from the database.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the osi application stages that was removed
	 */
	@Override
	public OsiApplicationStages removeBygetOAS_OAI(long osiApplicationId)
		throws NoSuchOsiApplicationStagesException {

		OsiApplicationStages osiApplicationStages = findBygetOAS_OAI(
			osiApplicationId);

		return remove(osiApplicationStages);
	}

	/**
	 * Returns the number of osi application stageses where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the number of matching osi application stageses
	 */
	@Override
	public int countBygetOAS_OAI(long osiApplicationId) {
		FinderPath finderPath = _finderPathCountBygetOAS_OAI;

		Object[] finderArgs = new Object[] {osiApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSIAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETOAS_OAI_OSIAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiApplicationId);

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

	private static final String _FINDER_COLUMN_GETOAS_OAI_OSIAPPLICATIONID_2 =
		"osiApplicationStages.osiApplicationId = ?";

	private FinderPath _finderPathFetchBygetCAS_CaseIdStageName;
	private FinderPath _finderPathCountBygetCAS_CaseIdStageName;

	/**
	 * Returns the osi application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchOsiApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages findBygetCAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchOsiApplicationStagesException {

		OsiApplicationStages osiApplicationStages =
			fetchBygetCAS_CaseIdStageName(caseId, stageName);

		if (osiApplicationStages == null) {
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

			throw new NoSuchOsiApplicationStagesException(sb.toString());
		}

		return osiApplicationStages;
	}

	/**
	 * Returns the osi application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages fetchBygetCAS_CaseIdStageName(
		String caseId, String stageName) {

		return fetchBygetCAS_CaseIdStageName(caseId, stageName, true);
	}

	/**
	 * Returns the osi application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages fetchBygetCAS_CaseIdStageName(
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
				_finderPathFetchBygetCAS_CaseIdStageName, finderArgs, this);
		}

		if (result instanceof OsiApplicationStages) {
			OsiApplicationStages osiApplicationStages =
				(OsiApplicationStages)result;

			if (!Objects.equals(caseId, osiApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, osiApplicationStages.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_OSIAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_STAGENAME_2);
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

				List<OsiApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCAS_CaseIdStageName,
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
								"OsiApplicationStagesPersistenceImpl.fetchBygetCAS_CaseIdStageName(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiApplicationStages osiApplicationStages = list.get(0);

					result = osiApplicationStages;

					cacheResult(osiApplicationStages);
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
			return (OsiApplicationStages)result;
		}
	}

	/**
	 * Removes the osi application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the osi application stages that was removed
	 */
	@Override
	public OsiApplicationStages removeBygetCAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchOsiApplicationStagesException {

		OsiApplicationStages osiApplicationStages =
			findBygetCAS_CaseIdStageName(caseId, stageName);

		return remove(osiApplicationStages);
	}

	/**
	 * Returns the number of osi application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching osi application stageses
	 */
	@Override
	public int countBygetCAS_CaseIdStageName(String caseId, String stageName) {
		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetCAS_CaseIdStageName;

		Object[] finderArgs = new Object[] {caseId, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSIAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_STAGENAME_2);
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

	private static final String _FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_CASEID_2 =
		"osiApplicationStages.caseId = ? AND ";

	private static final String _FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_CASEID_3 =
		"(osiApplicationStages.caseId IS NULL OR osiApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_STAGENAME_2 =
			"osiApplicationStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_STAGENAME_3 =
			"(osiApplicationStages.stageName IS NULL OR osiApplicationStages.stageName = '')";

	private FinderPath _finderPathWithPaginationFindBygetOAS_StageName;
	private FinderPath _finderPathWithoutPaginationFindBygetOAS_StageName;
	private FinderPath _finderPathCountBygetOAS_StageName;

	/**
	 * Returns all the osi application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching osi application stageses
	 */
	@Override
	public List<OsiApplicationStages> findBygetOAS_StageName(String stageName) {
		return findBygetOAS_StageName(
			stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @return the range of matching osi application stageses
	 */
	@Override
	public List<OsiApplicationStages> findBygetOAS_StageName(
		String stageName, int start, int end) {

		return findBygetOAS_StageName(stageName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi application stageses
	 */
	@Override
	public List<OsiApplicationStages> findBygetOAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<OsiApplicationStages> orderByComparator) {

		return findBygetOAS_StageName(
			stageName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi application stageses
	 */
	@Override
	public List<OsiApplicationStages> findBygetOAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<OsiApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetOAS_StageName;
				finderArgs = new Object[] {stageName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetOAS_StageName;
			finderArgs = new Object[] {
				stageName, start, end, orderByComparator
			};
		}

		List<OsiApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<OsiApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiApplicationStages osiApplicationStages : list) {
					if (!stageName.equals(
							osiApplicationStages.getStageName())) {

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

			sb.append(_SQL_SELECT_OSIAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOAS_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETOAS_STAGENAME_STAGENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(OsiApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<OsiApplicationStages>)QueryUtil.list(
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
	 * Returns the first osi application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages findBygetOAS_StageName_First(
			String stageName,
			OrderByComparator<OsiApplicationStages> orderByComparator)
		throws NoSuchOsiApplicationStagesException {

		OsiApplicationStages osiApplicationStages =
			fetchBygetOAS_StageName_First(stageName, orderByComparator);

		if (osiApplicationStages != null) {
			return osiApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchOsiApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first osi application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages fetchBygetOAS_StageName_First(
		String stageName,
		OrderByComparator<OsiApplicationStages> orderByComparator) {

		List<OsiApplicationStages> list = findBygetOAS_StageName(
			stageName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages findBygetOAS_StageName_Last(
			String stageName,
			OrderByComparator<OsiApplicationStages> orderByComparator)
		throws NoSuchOsiApplicationStagesException {

		OsiApplicationStages osiApplicationStages =
			fetchBygetOAS_StageName_Last(stageName, orderByComparator);

		if (osiApplicationStages != null) {
			return osiApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchOsiApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last osi application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages fetchBygetOAS_StageName_Last(
		String stageName,
		OrderByComparator<OsiApplicationStages> orderByComparator) {

		int count = countBygetOAS_StageName(stageName);

		if (count == 0) {
			return null;
		}

		List<OsiApplicationStages> list = findBygetOAS_StageName(
			stageName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi application stageses before and after the current osi application stages in the ordered set where stageName = &#63;.
	 *
	 * @param OsiApplicationStagesId the primary key of the current osi application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a osi application stages with the primary key could not be found
	 */
	@Override
	public OsiApplicationStages[] findBygetOAS_StageName_PrevAndNext(
			long OsiApplicationStagesId, String stageName,
			OrderByComparator<OsiApplicationStages> orderByComparator)
		throws NoSuchOsiApplicationStagesException {

		stageName = Objects.toString(stageName, "");

		OsiApplicationStages osiApplicationStages = findByPrimaryKey(
			OsiApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			OsiApplicationStages[] array = new OsiApplicationStagesImpl[3];

			array[0] = getBygetOAS_StageName_PrevAndNext(
				session, osiApplicationStages, stageName, orderByComparator,
				true);

			array[1] = osiApplicationStages;

			array[2] = getBygetOAS_StageName_PrevAndNext(
				session, osiApplicationStages, stageName, orderByComparator,
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

	protected OsiApplicationStages getBygetOAS_StageName_PrevAndNext(
		Session session, OsiApplicationStages osiApplicationStages,
		String stageName,
		OrderByComparator<OsiApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_OSIAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETOAS_STAGENAME_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETOAS_STAGENAME_STAGENAME_2);
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
			sb.append(OsiApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						osiApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	@Override
	public void removeBygetOAS_StageName(String stageName) {
		for (OsiApplicationStages osiApplicationStages :
				findBygetOAS_StageName(
					stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(osiApplicationStages);
		}
	}

	/**
	 * Returns the number of osi application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching osi application stageses
	 */
	@Override
	public int countBygetOAS_StageName(String stageName) {
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetOAS_StageName;

		Object[] finderArgs = new Object[] {stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSIAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOAS_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETOAS_STAGENAME_STAGENAME_2);
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

	private static final String _FINDER_COLUMN_GETOAS_STAGENAME_STAGENAME_2 =
		"osiApplicationStages.stageName = ?";

	private static final String _FINDER_COLUMN_GETOAS_STAGENAME_STAGENAME_3 =
		"(osiApplicationStages.stageName IS NULL OR osiApplicationStages.stageName = '')";

	private FinderPath _finderPathFetchBygetOAS_CaseIdStageStatus;
	private FinderPath _finderPathCountBygetOAS_CaseIdStageStatus;

	/**
	 * Returns the osi application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchOsiApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages findBygetOAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchOsiApplicationStagesException {

		OsiApplicationStages osiApplicationStages =
			fetchBygetOAS_CaseIdStageStatus(caseId, stageName, stageStatus);

		if (osiApplicationStages == null) {
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

			throw new NoSuchOsiApplicationStagesException(sb.toString());
		}

		return osiApplicationStages;
	}

	/**
	 * Returns the osi application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages fetchBygetOAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return fetchBygetOAS_CaseIdStageStatus(
			caseId, stageName, stageStatus, true);
	}

	/**
	 * Returns the osi application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages fetchBygetOAS_CaseIdStageStatus(
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
				_finderPathFetchBygetOAS_CaseIdStageStatus, finderArgs, this);
		}

		if (result instanceof OsiApplicationStages) {
			OsiApplicationStages osiApplicationStages =
				(OsiApplicationStages)result;

			if (!Objects.equals(caseId, osiApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, osiApplicationStages.getStageName()) ||
				!Objects.equals(
					stageStatus, osiApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_OSIAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOAS_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOAS_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOAS_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETOAS_CASEIDSTAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOAS_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETOAS_CASEIDSTAGESTATUS_STAGESTATUS_2);
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

				List<OsiApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOAS_CaseIdStageStatus,
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
								"OsiApplicationStagesPersistenceImpl.fetchBygetOAS_CaseIdStageStatus(String, String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiApplicationStages osiApplicationStages = list.get(0);

					result = osiApplicationStages;

					cacheResult(osiApplicationStages);
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
			return (OsiApplicationStages)result;
		}
	}

	/**
	 * Removes the osi application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the osi application stages that was removed
	 */
	@Override
	public OsiApplicationStages removeBygetOAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchOsiApplicationStagesException {

		OsiApplicationStages osiApplicationStages =
			findBygetOAS_CaseIdStageStatus(caseId, stageName, stageStatus);

		return remove(osiApplicationStages);
	}

	/**
	 * Returns the number of osi application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching osi application stageses
	 */
	@Override
	public int countBygetOAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetOAS_CaseIdStageStatus;

		Object[] finderArgs = new Object[] {caseId, stageName, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_OSIAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOAS_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOAS_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOAS_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETOAS_CASEIDSTAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOAS_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETOAS_CASEIDSTAGESTATUS_STAGESTATUS_2);
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
		_FINDER_COLUMN_GETOAS_CASEIDSTAGESTATUS_CASEID_2 =
			"osiApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETOAS_CASEIDSTAGESTATUS_CASEID_3 =
			"(osiApplicationStages.caseId IS NULL OR osiApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETOAS_CASEIDSTAGESTATUS_STAGENAME_2 =
			"osiApplicationStages.stageName = ? AND ";

	private static final String
		_FINDER_COLUMN_GETOAS_CASEIDSTAGESTATUS_STAGENAME_3 =
			"(osiApplicationStages.stageName IS NULL OR osiApplicationStages.stageName = '') AND ";

	private static final String
		_FINDER_COLUMN_GETOAS_CASEIDSTAGESTATUS_STAGESTATUS_2 =
			"osiApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETOAS_CASEIDSTAGESTATUS_STAGESTATUS_3 =
			"(osiApplicationStages.stageStatus IS NULL OR osiApplicationStages.stageStatus = '')";

	private FinderPath _finderPathFetchBygetOAS_CaseIdAndStatus;
	private FinderPath _finderPathCountBygetOAS_CaseIdAndStatus;

	/**
	 * Returns the osi application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchOsiApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages findBygetOAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchOsiApplicationStagesException {

		OsiApplicationStages osiApplicationStages =
			fetchBygetOAS_CaseIdAndStatus(caseId, stageStatus);

		if (osiApplicationStages == null) {
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

			throw new NoSuchOsiApplicationStagesException(sb.toString());
		}

		return osiApplicationStages;
	}

	/**
	 * Returns the osi application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages fetchBygetOAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return fetchBygetOAS_CaseIdAndStatus(caseId, stageStatus, true);
	}

	/**
	 * Returns the osi application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages fetchBygetOAS_CaseIdAndStatus(
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
				_finderPathFetchBygetOAS_CaseIdAndStatus, finderArgs, this);
		}

		if (result instanceof OsiApplicationStages) {
			OsiApplicationStages osiApplicationStages =
				(OsiApplicationStages)result;

			if (!Objects.equals(caseId, osiApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageStatus, osiApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_OSIAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOAS_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOAS_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOAS_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETOAS_CASEIDANDSTATUS_STAGESTATUS_2);
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

				List<OsiApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOAS_CaseIdAndStatus,
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
								"OsiApplicationStagesPersistenceImpl.fetchBygetOAS_CaseIdAndStatus(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiApplicationStages osiApplicationStages = list.get(0);

					result = osiApplicationStages;

					cacheResult(osiApplicationStages);
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
			return (OsiApplicationStages)result;
		}
	}

	/**
	 * Removes the osi application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the osi application stages that was removed
	 */
	@Override
	public OsiApplicationStages removeBygetOAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchOsiApplicationStagesException {

		OsiApplicationStages osiApplicationStages =
			findBygetOAS_CaseIdAndStatus(caseId, stageStatus);

		return remove(osiApplicationStages);
	}

	/**
	 * Returns the number of osi application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching osi application stageses
	 */
	@Override
	public int countBygetOAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetOAS_CaseIdAndStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSIAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOAS_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOAS_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOAS_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETOAS_CASEIDANDSTATUS_STAGESTATUS_2);
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

	private static final String _FINDER_COLUMN_GETOAS_CASEIDANDSTATUS_CASEID_2 =
		"osiApplicationStages.caseId = ? AND ";

	private static final String _FINDER_COLUMN_GETOAS_CASEIDANDSTATUS_CASEID_3 =
		"(osiApplicationStages.caseId IS NULL OR osiApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETOAS_CASEIDANDSTATUS_STAGESTATUS_2 =
			"osiApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETOAS_CASEIDANDSTATUS_STAGESTATUS_3 =
			"(osiApplicationStages.stageStatus IS NULL OR osiApplicationStages.stageStatus = '')";

	private FinderPath
		_finderPathWithPaginationFindBygetOAS_StageNamendStageStatus;
	private FinderPath
		_finderPathWithoutPaginationFindBygetOAS_StageNamendStageStatus;
	private FinderPath _finderPathCountBygetOAS_StageNamendStageStatus;

	/**
	 * Returns all the osi application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching osi application stageses
	 */
	@Override
	public List<OsiApplicationStages> findBygetOAS_StageNamendStageStatus(
		String stageName, String stageStatus) {

		return findBygetOAS_StageNamendStageStatus(
			stageName, stageStatus, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @return the range of matching osi application stageses
	 */
	@Override
	public List<OsiApplicationStages> findBygetOAS_StageNamendStageStatus(
		String stageName, String stageStatus, int start, int end) {

		return findBygetOAS_StageNamendStageStatus(
			stageName, stageStatus, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi application stageses
	 */
	@Override
	public List<OsiApplicationStages> findBygetOAS_StageNamendStageStatus(
		String stageName, String stageStatus, int start, int end,
		OrderByComparator<OsiApplicationStages> orderByComparator) {

		return findBygetOAS_StageNamendStageStatus(
			stageName, stageStatus, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi application stageses
	 */
	@Override
	public List<OsiApplicationStages> findBygetOAS_StageNamendStageStatus(
		String stageName, String stageStatus, int start, int end,
		OrderByComparator<OsiApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetOAS_StageNamendStageStatus;
				finderArgs = new Object[] {stageName, stageStatus};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetOAS_StageNamendStageStatus;
			finderArgs = new Object[] {
				stageName, stageStatus, start, end, orderByComparator
			};
		}

		List<OsiApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<OsiApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiApplicationStages osiApplicationStages : list) {
					if (!stageName.equals(
							osiApplicationStages.getStageName()) ||
						!stageStatus.equals(
							osiApplicationStages.getStageStatus())) {

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

			sb.append(_SQL_SELECT_OSIAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOAS_STAGENAMENDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETOAS_STAGENAMENDSTAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOAS_STAGENAMENDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETOAS_STAGENAMENDSTAGESTATUS_STAGESTATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(OsiApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<OsiApplicationStages>)QueryUtil.list(
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
	 * Returns the first osi application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages findBygetOAS_StageNamendStageStatus_First(
			String stageName, String stageStatus,
			OrderByComparator<OsiApplicationStages> orderByComparator)
		throws NoSuchOsiApplicationStagesException {

		OsiApplicationStages osiApplicationStages =
			fetchBygetOAS_StageNamendStageStatus_First(
				stageName, stageStatus, orderByComparator);

		if (osiApplicationStages != null) {
			return osiApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append(", stageStatus=");
		sb.append(stageStatus);

		sb.append("}");

		throw new NoSuchOsiApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first osi application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages fetchBygetOAS_StageNamendStageStatus_First(
		String stageName, String stageStatus,
		OrderByComparator<OsiApplicationStages> orderByComparator) {

		List<OsiApplicationStages> list = findBygetOAS_StageNamendStageStatus(
			stageName, stageStatus, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages findBygetOAS_StageNamendStageStatus_Last(
			String stageName, String stageStatus,
			OrderByComparator<OsiApplicationStages> orderByComparator)
		throws NoSuchOsiApplicationStagesException {

		OsiApplicationStages osiApplicationStages =
			fetchBygetOAS_StageNamendStageStatus_Last(
				stageName, stageStatus, orderByComparator);

		if (osiApplicationStages != null) {
			return osiApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append(", stageStatus=");
		sb.append(stageStatus);

		sb.append("}");

		throw new NoSuchOsiApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last osi application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages fetchBygetOAS_StageNamendStageStatus_Last(
		String stageName, String stageStatus,
		OrderByComparator<OsiApplicationStages> orderByComparator) {

		int count = countBygetOAS_StageNamendStageStatus(
			stageName, stageStatus);

		if (count == 0) {
			return null;
		}

		List<OsiApplicationStages> list = findBygetOAS_StageNamendStageStatus(
			stageName, stageStatus, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi application stageses before and after the current osi application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param OsiApplicationStagesId the primary key of the current osi application stages
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a osi application stages with the primary key could not be found
	 */
	@Override
	public OsiApplicationStages[]
			findBygetOAS_StageNamendStageStatus_PrevAndNext(
				long OsiApplicationStagesId, String stageName,
				String stageStatus,
				OrderByComparator<OsiApplicationStages> orderByComparator)
		throws NoSuchOsiApplicationStagesException {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		OsiApplicationStages osiApplicationStages = findByPrimaryKey(
			OsiApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			OsiApplicationStages[] array = new OsiApplicationStagesImpl[3];

			array[0] = getBygetOAS_StageNamendStageStatus_PrevAndNext(
				session, osiApplicationStages, stageName, stageStatus,
				orderByComparator, true);

			array[1] = osiApplicationStages;

			array[2] = getBygetOAS_StageNamendStageStatus_PrevAndNext(
				session, osiApplicationStages, stageName, stageStatus,
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

	protected OsiApplicationStages
		getBygetOAS_StageNamendStageStatus_PrevAndNext(
			Session session, OsiApplicationStages osiApplicationStages,
			String stageName, String stageStatus,
			OrderByComparator<OsiApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_OSIAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETOAS_STAGENAMENDSTAGESTATUS_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETOAS_STAGENAMENDSTAGESTATUS_STAGENAME_2);
		}

		boolean bindStageStatus = false;

		if (stageStatus.isEmpty()) {
			sb.append(
				_FINDER_COLUMN_GETOAS_STAGENAMENDSTAGESTATUS_STAGESTATUS_3);
		}
		else {
			bindStageStatus = true;

			sb.append(
				_FINDER_COLUMN_GETOAS_STAGENAMENDSTAGESTATUS_STAGESTATUS_2);
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
			sb.append(OsiApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						osiApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	@Override
	public void removeBygetOAS_StageNamendStageStatus(
		String stageName, String stageStatus) {

		for (OsiApplicationStages osiApplicationStages :
				findBygetOAS_StageNamendStageStatus(
					stageName, stageStatus, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(osiApplicationStages);
		}
	}

	/**
	 * Returns the number of osi application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching osi application stageses
	 */
	@Override
	public int countBygetOAS_StageNamendStageStatus(
		String stageName, String stageStatus) {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetOAS_StageNamendStageStatus;

		Object[] finderArgs = new Object[] {stageName, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSIAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOAS_STAGENAMENDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETOAS_STAGENAMENDSTAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOAS_STAGENAMENDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETOAS_STAGENAMENDSTAGESTATUS_STAGESTATUS_2);
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

	private static final String
		_FINDER_COLUMN_GETOAS_STAGENAMENDSTAGESTATUS_STAGENAME_2 =
			"osiApplicationStages.stageName = ? AND ";

	private static final String
		_FINDER_COLUMN_GETOAS_STAGENAMENDSTAGESTATUS_STAGENAME_3 =
			"(osiApplicationStages.stageName IS NULL OR osiApplicationStages.stageName = '') AND ";

	private static final String
		_FINDER_COLUMN_GETOAS_STAGENAMENDSTAGESTATUS_STAGESTATUS_2 =
			"osiApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETOAS_STAGENAMENDSTAGESTATUS_STAGESTATUS_3 =
			"(osiApplicationStages.stageStatus IS NULL OR osiApplicationStages.stageStatus = '')";

	private FinderPath _finderPathWithPaginationFindBygetOAS_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetOAS_CaseId;
	private FinderPath _finderPathCountBygetOAS_CaseId;

	/**
	 * Returns all the osi application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching osi application stageses
	 */
	@Override
	public List<OsiApplicationStages> findBygetOAS_CaseId(String caseId) {
		return findBygetOAS_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @return the range of matching osi application stageses
	 */
	@Override
	public List<OsiApplicationStages> findBygetOAS_CaseId(
		String caseId, int start, int end) {

		return findBygetOAS_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi application stageses
	 */
	@Override
	public List<OsiApplicationStages> findBygetOAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<OsiApplicationStages> orderByComparator) {

		return findBygetOAS_CaseId(caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi application stageses
	 */
	@Override
	public List<OsiApplicationStages> findBygetOAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<OsiApplicationStages> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetOAS_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetOAS_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<OsiApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<OsiApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiApplicationStages osiApplicationStages : list) {
					if (!caseId.equals(osiApplicationStages.getCaseId())) {
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

			sb.append(_SQL_SELECT_OSIAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOAS_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOAS_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(OsiApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<OsiApplicationStages>)QueryUtil.list(
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
	 * Returns the first osi application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages findBygetOAS_CaseId_First(
			String caseId,
			OrderByComparator<OsiApplicationStages> orderByComparator)
		throws NoSuchOsiApplicationStagesException {

		OsiApplicationStages osiApplicationStages = fetchBygetOAS_CaseId_First(
			caseId, orderByComparator);

		if (osiApplicationStages != null) {
			return osiApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchOsiApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first osi application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages fetchBygetOAS_CaseId_First(
		String caseId,
		OrderByComparator<OsiApplicationStages> orderByComparator) {

		List<OsiApplicationStages> list = findBygetOAS_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages findBygetOAS_CaseId_Last(
			String caseId,
			OrderByComparator<OsiApplicationStages> orderByComparator)
		throws NoSuchOsiApplicationStagesException {

		OsiApplicationStages osiApplicationStages = fetchBygetOAS_CaseId_Last(
			caseId, orderByComparator);

		if (osiApplicationStages != null) {
			return osiApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchOsiApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last osi application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	@Override
	public OsiApplicationStages fetchBygetOAS_CaseId_Last(
		String caseId,
		OrderByComparator<OsiApplicationStages> orderByComparator) {

		int count = countBygetOAS_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<OsiApplicationStages> list = findBygetOAS_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi application stageses before and after the current osi application stages in the ordered set where caseId = &#63;.
	 *
	 * @param OsiApplicationStagesId the primary key of the current osi application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a osi application stages with the primary key could not be found
	 */
	@Override
	public OsiApplicationStages[] findBygetOAS_CaseId_PrevAndNext(
			long OsiApplicationStagesId, String caseId,
			OrderByComparator<OsiApplicationStages> orderByComparator)
		throws NoSuchOsiApplicationStagesException {

		caseId = Objects.toString(caseId, "");

		OsiApplicationStages osiApplicationStages = findByPrimaryKey(
			OsiApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			OsiApplicationStages[] array = new OsiApplicationStagesImpl[3];

			array[0] = getBygetOAS_CaseId_PrevAndNext(
				session, osiApplicationStages, caseId, orderByComparator, true);

			array[1] = osiApplicationStages;

			array[2] = getBygetOAS_CaseId_PrevAndNext(
				session, osiApplicationStages, caseId, orderByComparator,
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

	protected OsiApplicationStages getBygetOAS_CaseId_PrevAndNext(
		Session session, OsiApplicationStages osiApplicationStages,
		String caseId,
		OrderByComparator<OsiApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_OSIAPPLICATIONSTAGES_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETOAS_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETOAS_CASEID_CASEID_2);
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
			sb.append(OsiApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						osiApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetOAS_CaseId(String caseId) {
		for (OsiApplicationStages osiApplicationStages :
				findBygetOAS_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(osiApplicationStages);
		}
	}

	/**
	 * Returns the number of osi application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi application stageses
	 */
	@Override
	public int countBygetOAS_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetOAS_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSIAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOAS_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOAS_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETOAS_CASEID_CASEID_2 =
		"osiApplicationStages.caseId = ?";

	private static final String _FINDER_COLUMN_GETOAS_CASEID_CASEID_3 =
		"(osiApplicationStages.caseId IS NULL OR osiApplicationStages.caseId = '')";

	public OsiApplicationStagesPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(OsiApplicationStages.class);

		setModelImplClass(OsiApplicationStagesImpl.class);
		setModelPKClass(long.class);

		setTable(OsiApplicationStagesTable.INSTANCE);
	}

	/**
	 * Caches the osi application stages in the entity cache if it is enabled.
	 *
	 * @param osiApplicationStages the osi application stages
	 */
	@Override
	public void cacheResult(OsiApplicationStages osiApplicationStages) {
		entityCache.putResult(
			OsiApplicationStagesImpl.class,
			osiApplicationStages.getPrimaryKey(), osiApplicationStages);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				osiApplicationStages.getUuid(),
				osiApplicationStages.getGroupId()
			},
			osiApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetOAS_OAI,
			new Object[] {osiApplicationStages.getOsiApplicationId()},
			osiApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetCAS_CaseIdStageName,
			new Object[] {
				osiApplicationStages.getCaseId(),
				osiApplicationStages.getStageName()
			},
			osiApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetOAS_CaseIdStageStatus,
			new Object[] {
				osiApplicationStages.getCaseId(),
				osiApplicationStages.getStageName(),
				osiApplicationStages.getStageStatus()
			},
			osiApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetOAS_CaseIdAndStatus,
			new Object[] {
				osiApplicationStages.getCaseId(),
				osiApplicationStages.getStageStatus()
			},
			osiApplicationStages);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the osi application stageses in the entity cache if it is enabled.
	 *
	 * @param osiApplicationStageses the osi application stageses
	 */
	@Override
	public void cacheResult(List<OsiApplicationStages> osiApplicationStageses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (osiApplicationStageses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OsiApplicationStages osiApplicationStages :
				osiApplicationStageses) {

			if (entityCache.getResult(
					OsiApplicationStagesImpl.class,
					osiApplicationStages.getPrimaryKey()) == null) {

				cacheResult(osiApplicationStages);
			}
		}
	}

	/**
	 * Clears the cache for all osi application stageses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OsiApplicationStagesImpl.class);

		finderCache.clearCache(OsiApplicationStagesImpl.class);
	}

	/**
	 * Clears the cache for the osi application stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OsiApplicationStages osiApplicationStages) {
		entityCache.removeResult(
			OsiApplicationStagesImpl.class, osiApplicationStages);
	}

	@Override
	public void clearCache(List<OsiApplicationStages> osiApplicationStageses) {
		for (OsiApplicationStages osiApplicationStages :
				osiApplicationStageses) {

			entityCache.removeResult(
				OsiApplicationStagesImpl.class, osiApplicationStages);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OsiApplicationStagesImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				OsiApplicationStagesImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OsiApplicationStagesModelImpl osiApplicationStagesModelImpl) {

		Object[] args = new Object[] {
			osiApplicationStagesModelImpl.getUuid(),
			osiApplicationStagesModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, osiApplicationStagesModelImpl);

		args = new Object[] {
			osiApplicationStagesModelImpl.getOsiApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetOAS_OAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOAS_OAI, args, osiApplicationStagesModelImpl);

		args = new Object[] {
			osiApplicationStagesModelImpl.getCaseId(),
			osiApplicationStagesModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetCAS_CaseIdStageName, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCAS_CaseIdStageName, args,
			osiApplicationStagesModelImpl);

		args = new Object[] {
			osiApplicationStagesModelImpl.getCaseId(),
			osiApplicationStagesModelImpl.getStageName(),
			osiApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetOAS_CaseIdStageStatus, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOAS_CaseIdStageStatus, args,
			osiApplicationStagesModelImpl);

		args = new Object[] {
			osiApplicationStagesModelImpl.getCaseId(),
			osiApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetOAS_CaseIdAndStatus, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOAS_CaseIdAndStatus, args,
			osiApplicationStagesModelImpl);
	}

	/**
	 * Creates a new osi application stages with the primary key. Does not add the osi application stages to the database.
	 *
	 * @param OsiApplicationStagesId the primary key for the new osi application stages
	 * @return the new osi application stages
	 */
	@Override
	public OsiApplicationStages create(long OsiApplicationStagesId) {
		OsiApplicationStages osiApplicationStages =
			new OsiApplicationStagesImpl();

		osiApplicationStages.setNew(true);
		osiApplicationStages.setPrimaryKey(OsiApplicationStagesId);

		String uuid = PortalUUIDUtil.generate();

		osiApplicationStages.setUuid(uuid);

		osiApplicationStages.setCompanyId(CompanyThreadLocal.getCompanyId());

		return osiApplicationStages;
	}

	/**
	 * Removes the osi application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param OsiApplicationStagesId the primary key of the osi application stages
	 * @return the osi application stages that was removed
	 * @throws NoSuchOsiApplicationStagesException if a osi application stages with the primary key could not be found
	 */
	@Override
	public OsiApplicationStages remove(long OsiApplicationStagesId)
		throws NoSuchOsiApplicationStagesException {

		return remove((Serializable)OsiApplicationStagesId);
	}

	/**
	 * Removes the osi application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the osi application stages
	 * @return the osi application stages that was removed
	 * @throws NoSuchOsiApplicationStagesException if a osi application stages with the primary key could not be found
	 */
	@Override
	public OsiApplicationStages remove(Serializable primaryKey)
		throws NoSuchOsiApplicationStagesException {

		Session session = null;

		try {
			session = openSession();

			OsiApplicationStages osiApplicationStages =
				(OsiApplicationStages)session.get(
					OsiApplicationStagesImpl.class, primaryKey);

			if (osiApplicationStages == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOsiApplicationStagesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(osiApplicationStages);
		}
		catch (NoSuchOsiApplicationStagesException noSuchEntityException) {
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
	protected OsiApplicationStages removeImpl(
		OsiApplicationStages osiApplicationStages) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(osiApplicationStages)) {
				osiApplicationStages = (OsiApplicationStages)session.get(
					OsiApplicationStagesImpl.class,
					osiApplicationStages.getPrimaryKeyObj());
			}

			if (osiApplicationStages != null) {
				session.delete(osiApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (osiApplicationStages != null) {
			clearCache(osiApplicationStages);
		}

		return osiApplicationStages;
	}

	@Override
	public OsiApplicationStages updateImpl(
		OsiApplicationStages osiApplicationStages) {

		boolean isNew = osiApplicationStages.isNew();

		if (!(osiApplicationStages instanceof OsiApplicationStagesModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(osiApplicationStages.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					osiApplicationStages);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in osiApplicationStages proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OsiApplicationStages implementation " +
					osiApplicationStages.getClass());
		}

		OsiApplicationStagesModelImpl osiApplicationStagesModelImpl =
			(OsiApplicationStagesModelImpl)osiApplicationStages;

		if (Validator.isNull(osiApplicationStages.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			osiApplicationStages.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (osiApplicationStages.getCreateDate() == null)) {
			if (serviceContext == null) {
				osiApplicationStages.setCreateDate(date);
			}
			else {
				osiApplicationStages.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!osiApplicationStagesModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				osiApplicationStages.setModifiedDate(date);
			}
			else {
				osiApplicationStages.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(osiApplicationStages);
			}
			else {
				osiApplicationStages = (OsiApplicationStages)session.merge(
					osiApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OsiApplicationStagesImpl.class, osiApplicationStagesModelImpl,
			false, true);

		cacheUniqueFindersCache(osiApplicationStagesModelImpl);

		if (isNew) {
			osiApplicationStages.setNew(false);
		}

		osiApplicationStages.resetOriginalValues();

		return osiApplicationStages;
	}

	/**
	 * Returns the osi application stages with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the osi application stages
	 * @return the osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a osi application stages with the primary key could not be found
	 */
	@Override
	public OsiApplicationStages findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOsiApplicationStagesException {

		OsiApplicationStages osiApplicationStages = fetchByPrimaryKey(
			primaryKey);

		if (osiApplicationStages == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOsiApplicationStagesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return osiApplicationStages;
	}

	/**
	 * Returns the osi application stages with the primary key or throws a <code>NoSuchOsiApplicationStagesException</code> if it could not be found.
	 *
	 * @param OsiApplicationStagesId the primary key of the osi application stages
	 * @return the osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a osi application stages with the primary key could not be found
	 */
	@Override
	public OsiApplicationStages findByPrimaryKey(long OsiApplicationStagesId)
		throws NoSuchOsiApplicationStagesException {

		return findByPrimaryKey((Serializable)OsiApplicationStagesId);
	}

	/**
	 * Returns the osi application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param OsiApplicationStagesId the primary key of the osi application stages
	 * @return the osi application stages, or <code>null</code> if a osi application stages with the primary key could not be found
	 */
	@Override
	public OsiApplicationStages fetchByPrimaryKey(long OsiApplicationStagesId) {
		return fetchByPrimaryKey((Serializable)OsiApplicationStagesId);
	}

	/**
	 * Returns all the osi application stageses.
	 *
	 * @return the osi application stageses
	 */
	@Override
	public List<OsiApplicationStages> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @return the range of osi application stageses
	 */
	@Override
	public List<OsiApplicationStages> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi application stageses
	 */
	@Override
	public List<OsiApplicationStages> findAll(
		int start, int end,
		OrderByComparator<OsiApplicationStages> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi application stageses
	 */
	@Override
	public List<OsiApplicationStages> findAll(
		int start, int end,
		OrderByComparator<OsiApplicationStages> orderByComparator,
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

		List<OsiApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<OsiApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OSIAPPLICATIONSTAGES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OSIAPPLICATIONSTAGES;

				sql = sql.concat(OsiApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OsiApplicationStages>)QueryUtil.list(
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
	 * Removes all the osi application stageses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OsiApplicationStages osiApplicationStages : findAll()) {
			remove(osiApplicationStages);
		}
	}

	/**
	 * Returns the number of osi application stageses.
	 *
	 * @return the number of osi application stageses
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
					_SQL_COUNT_OSIAPPLICATIONSTAGES);

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
		return "OsiApplicationStagesId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OSIAPPLICATIONSTAGES;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OsiApplicationStagesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the osi application stages persistence.
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

		_finderPathFetchBygetOAS_OAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOAS_OAI",
			new String[] {Long.class.getName()},
			new String[] {"osiApplicationId"}, true);

		_finderPathCountBygetOAS_OAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOAS_OAI",
			new String[] {Long.class.getName()},
			new String[] {"osiApplicationId"}, false);

		_finderPathFetchBygetCAS_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCAS_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, true);

		_finderPathCountBygetCAS_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCAS_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, false);

		_finderPathWithPaginationFindBygetOAS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetOAS_StageName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"stageName"}, true);

		_finderPathWithoutPaginationFindBygetOAS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetOAS_StageName",
			new String[] {String.class.getName()}, new String[] {"stageName"},
			true);

		_finderPathCountBygetOAS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOAS_StageName", new String[] {String.class.getName()},
			new String[] {"stageName"}, false);

		_finderPathFetchBygetOAS_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOAS_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageName", "stageStatus"}, true);

		_finderPathCountBygetOAS_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOAS_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageName", "stageStatus"}, false);

		_finderPathFetchBygetOAS_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOAS_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, true);

		_finderPathCountBygetOAS_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOAS_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, false);

		_finderPathWithPaginationFindBygetOAS_StageNamendStageStatus =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetOAS_StageNamendStageStatus",
				new String[] {
					String.class.getName(), String.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"stageName", "stageStatus"}, true);

		_finderPathWithoutPaginationFindBygetOAS_StageNamendStageStatus =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetOAS_StageNamendStageStatus",
				new String[] {String.class.getName(), String.class.getName()},
				new String[] {"stageName", "stageStatus"}, true);

		_finderPathCountBygetOAS_StageNamendStageStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOAS_StageNamendStageStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"stageName", "stageStatus"}, false);

		_finderPathWithPaginationFindBygetOAS_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetOAS_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetOAS_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetOAS_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetOAS_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOAS_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		OsiApplicationStagesUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OsiApplicationStagesUtil.setPersistence(null);

		entityCache.removeCache(OsiApplicationStagesImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSI_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSI_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSI_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_OSIAPPLICATIONSTAGES =
		"SELECT osiApplicationStages FROM OsiApplicationStages osiApplicationStages";

	private static final String _SQL_SELECT_OSIAPPLICATIONSTAGES_WHERE =
		"SELECT osiApplicationStages FROM OsiApplicationStages osiApplicationStages WHERE ";

	private static final String _SQL_COUNT_OSIAPPLICATIONSTAGES =
		"SELECT COUNT(osiApplicationStages) FROM OsiApplicationStages osiApplicationStages";

	private static final String _SQL_COUNT_OSIAPPLICATIONSTAGES_WHERE =
		"SELECT COUNT(osiApplicationStages) FROM OsiApplicationStages osiApplicationStages WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"osiApplicationStages.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OsiApplicationStages exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OsiApplicationStages exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OsiApplicationStagesPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}