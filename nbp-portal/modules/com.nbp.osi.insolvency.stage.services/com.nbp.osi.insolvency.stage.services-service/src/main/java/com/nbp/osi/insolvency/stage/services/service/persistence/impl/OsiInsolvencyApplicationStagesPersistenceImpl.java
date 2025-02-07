/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.service.persistence.impl;

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

import com.nbp.osi.insolvency.stage.services.exception.NoSuchOsiInsolvencyApplicationStagesException;
import com.nbp.osi.insolvency.stage.services.model.OsiInsolvencyApplicationStages;
import com.nbp.osi.insolvency.stage.services.model.OsiInsolvencyApplicationStagesTable;
import com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolvencyApplicationStagesImpl;
import com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolvencyApplicationStagesModelImpl;
import com.nbp.osi.insolvency.stage.services.service.persistence.OsiInsolvencyApplicationStagesPersistence;
import com.nbp.osi.insolvency.stage.services.service.persistence.OsiInsolvencyApplicationStagesUtil;
import com.nbp.osi.insolvency.stage.services.service.persistence.impl.constants.OSI_INSOLVENCY_STAGESPersistenceConstants;

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
 * The persistence implementation for the osi insolvency application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OsiInsolvencyApplicationStagesPersistence.class)
public class OsiInsolvencyApplicationStagesPersistenceImpl
	extends BasePersistenceImpl<OsiInsolvencyApplicationStages>
	implements OsiInsolvencyApplicationStagesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OsiInsolvencyApplicationStagesUtil</code> to access the osi insolvency application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OsiInsolvencyApplicationStagesImpl.class.getName();

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
	 * Returns all the osi insolvency application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching osi insolvency application stageses
	 */
	@Override
	public List<OsiInsolvencyApplicationStages> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi insolvency application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @return the range of matching osi insolvency application stageses
	 */
	@Override
	public List<OsiInsolvencyApplicationStages> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi insolvency application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi insolvency application stageses
	 */
	@Override
	public List<OsiInsolvencyApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi insolvency application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi insolvency application stageses
	 */
	@Override
	public List<OsiInsolvencyApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator,
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

		List<OsiInsolvencyApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<OsiInsolvencyApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiInsolvencyApplicationStages
						osiInsolvencyApplicationStages : list) {

					if (!uuid.equals(
							osiInsolvencyApplicationStages.getUuid())) {

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

			sb.append(_SQL_SELECT_OSIINSOLVENCYAPPLICATIONSTAGES_WHERE);

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
					OsiInsolvencyApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<OsiInsolvencyApplicationStages>)QueryUtil.list(
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
	 * Returns the first osi insolvency application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages findByUuid_First(
			String uuid,
			OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationStagesException {

		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages =
			fetchByUuid_First(uuid, orderByComparator);

		if (osiInsolvencyApplicationStages != null) {
			return osiInsolvencyApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchOsiInsolvencyApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first osi insolvency application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages fetchByUuid_First(
		String uuid,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator) {

		List<OsiInsolvencyApplicationStages> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi insolvency application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages findByUuid_Last(
			String uuid,
			OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationStagesException {

		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages =
			fetchByUuid_Last(uuid, orderByComparator);

		if (osiInsolvencyApplicationStages != null) {
			return osiInsolvencyApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchOsiInsolvencyApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last osi insolvency application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages fetchByUuid_Last(
		String uuid,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<OsiInsolvencyApplicationStages> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi insolvency application stageses before and after the current osi insolvency application stages in the ordered set where uuid = &#63;.
	 *
	 * @param osiInsolveApplicationStagesId the primary key of the current osi insolvency application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a osi insolvency application stages with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages[] findByUuid_PrevAndNext(
			long osiInsolveApplicationStagesId, String uuid,
			OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationStagesException {

		uuid = Objects.toString(uuid, "");

		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages =
			findByPrimaryKey(osiInsolveApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			OsiInsolvencyApplicationStages[] array =
				new OsiInsolvencyApplicationStagesImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, osiInsolvencyApplicationStages, uuid,
				orderByComparator, true);

			array[1] = osiInsolvencyApplicationStages;

			array[2] = getByUuid_PrevAndNext(
				session, osiInsolvencyApplicationStages, uuid,
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

	protected OsiInsolvencyApplicationStages getByUuid_PrevAndNext(
		Session session,
		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages,
		String uuid,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_OSIINSOLVENCYAPPLICATIONSTAGES_WHERE);

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
			sb.append(OsiInsolvencyApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						osiInsolvencyApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiInsolvencyApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi insolvency application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (OsiInsolvencyApplicationStages osiInsolvencyApplicationStages :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(osiInsolvencyApplicationStages);
		}
	}

	/**
	 * Returns the number of osi insolvency application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching osi insolvency application stageses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSIINSOLVENCYAPPLICATIONSTAGES_WHERE);

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
		"osiInsolvencyApplicationStages.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(osiInsolvencyApplicationStages.uuid IS NULL OR osiInsolvencyApplicationStages.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the osi insolvency application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOsiInsolvencyApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages findByUUID_G(
			String uuid, long groupId)
		throws NoSuchOsiInsolvencyApplicationStagesException {

		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages =
			fetchByUUID_G(uuid, groupId);

		if (osiInsolvencyApplicationStages == null) {
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

			throw new NoSuchOsiInsolvencyApplicationStagesException(
				sb.toString());
		}

		return osiInsolvencyApplicationStages;
	}

	/**
	 * Returns the osi insolvency application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages fetchByUUID_G(
		String uuid, long groupId) {

		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the osi insolvency application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages fetchByUUID_G(
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

		if (result instanceof OsiInsolvencyApplicationStages) {
			OsiInsolvencyApplicationStages osiInsolvencyApplicationStages =
				(OsiInsolvencyApplicationStages)result;

			if (!Objects.equals(
					uuid, osiInsolvencyApplicationStages.getUuid()) ||
				(groupId != osiInsolvencyApplicationStages.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_OSIINSOLVENCYAPPLICATIONSTAGES_WHERE);

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

				List<OsiInsolvencyApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					OsiInsolvencyApplicationStages
						osiInsolvencyApplicationStages = list.get(0);

					result = osiInsolvencyApplicationStages;

					cacheResult(osiInsolvencyApplicationStages);
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
			return (OsiInsolvencyApplicationStages)result;
		}
	}

	/**
	 * Removes the osi insolvency application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the osi insolvency application stages that was removed
	 */
	@Override
	public OsiInsolvencyApplicationStages removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchOsiInsolvencyApplicationStagesException {

		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages =
			findByUUID_G(uuid, groupId);

		return remove(osiInsolvencyApplicationStages);
	}

	/**
	 * Returns the number of osi insolvency application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching osi insolvency application stageses
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSIINSOLVENCYAPPLICATIONSTAGES_WHERE);

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
		"osiInsolvencyApplicationStages.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(osiInsolvencyApplicationStages.uuid IS NULL OR osiInsolvencyApplicationStages.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"osiInsolvencyApplicationStages.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the osi insolvency application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching osi insolvency application stageses
	 */
	@Override
	public List<OsiInsolvencyApplicationStages> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi insolvency application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @return the range of matching osi insolvency application stageses
	 */
	@Override
	public List<OsiInsolvencyApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi insolvency application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi insolvency application stageses
	 */
	@Override
	public List<OsiInsolvencyApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi insolvency application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi insolvency application stageses
	 */
	@Override
	public List<OsiInsolvencyApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator,
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

		List<OsiInsolvencyApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<OsiInsolvencyApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiInsolvencyApplicationStages
						osiInsolvencyApplicationStages : list) {

					if (!uuid.equals(
							osiInsolvencyApplicationStages.getUuid()) ||
						(companyId !=
							osiInsolvencyApplicationStages.getCompanyId())) {

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

			sb.append(_SQL_SELECT_OSIINSOLVENCYAPPLICATIONSTAGES_WHERE);

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
					OsiInsolvencyApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<OsiInsolvencyApplicationStages>)QueryUtil.list(
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
	 * Returns the first osi insolvency application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationStagesException {

		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages =
			fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (osiInsolvencyApplicationStages != null) {
			return osiInsolvencyApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchOsiInsolvencyApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first osi insolvency application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator) {

		List<OsiInsolvencyApplicationStages> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi insolvency application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationStagesException {

		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages =
			fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (osiInsolvencyApplicationStages != null) {
			return osiInsolvencyApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchOsiInsolvencyApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last osi insolvency application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<OsiInsolvencyApplicationStages> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi insolvency application stageses before and after the current osi insolvency application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param osiInsolveApplicationStagesId the primary key of the current osi insolvency application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a osi insolvency application stages with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages[] findByUuid_C_PrevAndNext(
			long osiInsolveApplicationStagesId, String uuid, long companyId,
			OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationStagesException {

		uuid = Objects.toString(uuid, "");

		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages =
			findByPrimaryKey(osiInsolveApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			OsiInsolvencyApplicationStages[] array =
				new OsiInsolvencyApplicationStagesImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, osiInsolvencyApplicationStages, uuid, companyId,
				orderByComparator, true);

			array[1] = osiInsolvencyApplicationStages;

			array[2] = getByUuid_C_PrevAndNext(
				session, osiInsolvencyApplicationStages, uuid, companyId,
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

	protected OsiInsolvencyApplicationStages getByUuid_C_PrevAndNext(
		Session session,
		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages,
		String uuid, long companyId,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_OSIINSOLVENCYAPPLICATIONSTAGES_WHERE);

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
			sb.append(OsiInsolvencyApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						osiInsolvencyApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiInsolvencyApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi insolvency application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (OsiInsolvencyApplicationStages osiInsolvencyApplicationStages :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(osiInsolvencyApplicationStages);
		}
	}

	/**
	 * Returns the number of osi insolvency application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching osi insolvency application stageses
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSIINSOLVENCYAPPLICATIONSTAGES_WHERE);

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
		"osiInsolvencyApplicationStages.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(osiInsolvencyApplicationStages.uuid IS NULL OR osiInsolvencyApplicationStages.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"osiInsolvencyApplicationStages.companyId = ?";

	private FinderPath _finderPathFetchBygetOIAS_OAI;
	private FinderPath _finderPathCountBygetOIAS_OAI;

	/**
	 * Returns the osi insolvency application stages where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiInsolvencyApplicationStagesException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages findBygetOIAS_OAI(
			long osiInsolvencyId)
		throws NoSuchOsiInsolvencyApplicationStagesException {

		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages =
			fetchBygetOIAS_OAI(osiInsolvencyId);

		if (osiInsolvencyApplicationStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiInsolvencyId=");
			sb.append(osiInsolvencyId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiInsolvencyApplicationStagesException(
				sb.toString());
		}

		return osiInsolvencyApplicationStages;
	}

	/**
	 * Returns the osi insolvency application stages where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages fetchBygetOIAS_OAI(
		long osiInsolvencyId) {

		return fetchBygetOIAS_OAI(osiInsolvencyId, true);
	}

	/**
	 * Returns the osi insolvency application stages where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages fetchBygetOIAS_OAI(
		long osiInsolvencyId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {osiInsolvencyId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOIAS_OAI, finderArgs, this);
		}

		if (result instanceof OsiInsolvencyApplicationStages) {
			OsiInsolvencyApplicationStages osiInsolvencyApplicationStages =
				(OsiInsolvencyApplicationStages)result;

			if (osiInsolvencyId !=
					osiInsolvencyApplicationStages.getOsiInsolvencyId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSIINSOLVENCYAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETOIAS_OAI_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				List<OsiInsolvencyApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOIAS_OAI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {osiInsolvencyId};
							}

							_log.warn(
								"OsiInsolvencyApplicationStagesPersistenceImpl.fetchBygetOIAS_OAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiInsolvencyApplicationStages
						osiInsolvencyApplicationStages = list.get(0);

					result = osiInsolvencyApplicationStages;

					cacheResult(osiInsolvencyApplicationStages);
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
			return (OsiInsolvencyApplicationStages)result;
		}
	}

	/**
	 * Removes the osi insolvency application stages where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi insolvency application stages that was removed
	 */
	@Override
	public OsiInsolvencyApplicationStages removeBygetOIAS_OAI(
			long osiInsolvencyId)
		throws NoSuchOsiInsolvencyApplicationStagesException {

		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages =
			findBygetOIAS_OAI(osiInsolvencyId);

		return remove(osiInsolvencyApplicationStages);
	}

	/**
	 * Returns the number of osi insolvency application stageses where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi insolvency application stageses
	 */
	@Override
	public int countBygetOIAS_OAI(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOIAS_OAI;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSIINSOLVENCYAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETOIAS_OAI_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

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

	private static final String _FINDER_COLUMN_GETOIAS_OAI_OSIINSOLVENCYID_2 =
		"osiInsolvencyApplicationStages.osiInsolvencyId = ?";

	private FinderPath _finderPathFetchBygetCAS_CaseIdStageName;
	private FinderPath _finderPathCountBygetCAS_CaseIdStageName;

	/**
	 * Returns the osi insolvency application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchOsiInsolvencyApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages findBygetCAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchOsiInsolvencyApplicationStagesException {

		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages =
			fetchBygetCAS_CaseIdStageName(caseId, stageName);

		if (osiInsolvencyApplicationStages == null) {
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

			throw new NoSuchOsiInsolvencyApplicationStagesException(
				sb.toString());
		}

		return osiInsolvencyApplicationStages;
	}

	/**
	 * Returns the osi insolvency application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages fetchBygetCAS_CaseIdStageName(
		String caseId, String stageName) {

		return fetchBygetCAS_CaseIdStageName(caseId, stageName, true);
	}

	/**
	 * Returns the osi insolvency application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages fetchBygetCAS_CaseIdStageName(
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

		if (result instanceof OsiInsolvencyApplicationStages) {
			OsiInsolvencyApplicationStages osiInsolvencyApplicationStages =
				(OsiInsolvencyApplicationStages)result;

			if (!Objects.equals(
					caseId, osiInsolvencyApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, osiInsolvencyApplicationStages.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_OSIINSOLVENCYAPPLICATIONSTAGES_WHERE);

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

				List<OsiInsolvencyApplicationStages> list = query.list();

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
								"OsiInsolvencyApplicationStagesPersistenceImpl.fetchBygetCAS_CaseIdStageName(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiInsolvencyApplicationStages
						osiInsolvencyApplicationStages = list.get(0);

					result = osiInsolvencyApplicationStages;

					cacheResult(osiInsolvencyApplicationStages);
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
			return (OsiInsolvencyApplicationStages)result;
		}
	}

	/**
	 * Removes the osi insolvency application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the osi insolvency application stages that was removed
	 */
	@Override
	public OsiInsolvencyApplicationStages removeBygetCAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchOsiInsolvencyApplicationStagesException {

		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages =
			findBygetCAS_CaseIdStageName(caseId, stageName);

		return remove(osiInsolvencyApplicationStages);
	}

	/**
	 * Returns the number of osi insolvency application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching osi insolvency application stageses
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

			sb.append(_SQL_COUNT_OSIINSOLVENCYAPPLICATIONSTAGES_WHERE);

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
		"osiInsolvencyApplicationStages.caseId = ? AND ";

	private static final String _FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_CASEID_3 =
		"(osiInsolvencyApplicationStages.caseId IS NULL OR osiInsolvencyApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_STAGENAME_2 =
			"osiInsolvencyApplicationStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_STAGENAME_3 =
			"(osiInsolvencyApplicationStages.stageName IS NULL OR osiInsolvencyApplicationStages.stageName = '')";

	private FinderPath _finderPathWithPaginationFindBygetOIAS_StageName;
	private FinderPath _finderPathWithoutPaginationFindBygetOIAS_StageName;
	private FinderPath _finderPathCountBygetOIAS_StageName;

	/**
	 * Returns all the osi insolvency application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching osi insolvency application stageses
	 */
	@Override
	public List<OsiInsolvencyApplicationStages> findBygetOIAS_StageName(
		String stageName) {

		return findBygetOIAS_StageName(
			stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi insolvency application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @return the range of matching osi insolvency application stageses
	 */
	@Override
	public List<OsiInsolvencyApplicationStages> findBygetOIAS_StageName(
		String stageName, int start, int end) {

		return findBygetOIAS_StageName(stageName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi insolvency application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi insolvency application stageses
	 */
	@Override
	public List<OsiInsolvencyApplicationStages> findBygetOIAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator) {

		return findBygetOIAS_StageName(
			stageName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi insolvency application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi insolvency application stageses
	 */
	@Override
	public List<OsiInsolvencyApplicationStages> findBygetOIAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetOIAS_StageName;
				finderArgs = new Object[] {stageName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetOIAS_StageName;
			finderArgs = new Object[] {
				stageName, start, end, orderByComparator
			};
		}

		List<OsiInsolvencyApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<OsiInsolvencyApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiInsolvencyApplicationStages
						osiInsolvencyApplicationStages : list) {

					if (!stageName.equals(
							osiInsolvencyApplicationStages.getStageName())) {

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

			sb.append(_SQL_SELECT_OSIINSOLVENCYAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOIAS_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETOIAS_STAGENAME_STAGENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					OsiInsolvencyApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<OsiInsolvencyApplicationStages>)QueryUtil.list(
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
	 * Returns the first osi insolvency application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages findBygetOIAS_StageName_First(
			String stageName,
			OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationStagesException {

		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages =
			fetchBygetOIAS_StageName_First(stageName, orderByComparator);

		if (osiInsolvencyApplicationStages != null) {
			return osiInsolvencyApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchOsiInsolvencyApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first osi insolvency application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages fetchBygetOIAS_StageName_First(
		String stageName,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator) {

		List<OsiInsolvencyApplicationStages> list = findBygetOIAS_StageName(
			stageName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi insolvency application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages findBygetOIAS_StageName_Last(
			String stageName,
			OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationStagesException {

		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages =
			fetchBygetOIAS_StageName_Last(stageName, orderByComparator);

		if (osiInsolvencyApplicationStages != null) {
			return osiInsolvencyApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchOsiInsolvencyApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last osi insolvency application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages fetchBygetOIAS_StageName_Last(
		String stageName,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator) {

		int count = countBygetOIAS_StageName(stageName);

		if (count == 0) {
			return null;
		}

		List<OsiInsolvencyApplicationStages> list = findBygetOIAS_StageName(
			stageName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi insolvency application stageses before and after the current osi insolvency application stages in the ordered set where stageName = &#63;.
	 *
	 * @param osiInsolveApplicationStagesId the primary key of the current osi insolvency application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a osi insolvency application stages with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages[] findBygetOIAS_StageName_PrevAndNext(
			long osiInsolveApplicationStagesId, String stageName,
			OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationStagesException {

		stageName = Objects.toString(stageName, "");

		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages =
			findByPrimaryKey(osiInsolveApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			OsiInsolvencyApplicationStages[] array =
				new OsiInsolvencyApplicationStagesImpl[3];

			array[0] = getBygetOIAS_StageName_PrevAndNext(
				session, osiInsolvencyApplicationStages, stageName,
				orderByComparator, true);

			array[1] = osiInsolvencyApplicationStages;

			array[2] = getBygetOIAS_StageName_PrevAndNext(
				session, osiInsolvencyApplicationStages, stageName,
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

	protected OsiInsolvencyApplicationStages getBygetOIAS_StageName_PrevAndNext(
		Session session,
		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages,
		String stageName,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_OSIINSOLVENCYAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETOIAS_STAGENAME_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETOIAS_STAGENAME_STAGENAME_2);
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
			sb.append(OsiInsolvencyApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						osiInsolvencyApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiInsolvencyApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi insolvency application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	@Override
	public void removeBygetOIAS_StageName(String stageName) {
		for (OsiInsolvencyApplicationStages osiInsolvencyApplicationStages :
				findBygetOIAS_StageName(
					stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(osiInsolvencyApplicationStages);
		}
	}

	/**
	 * Returns the number of osi insolvency application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching osi insolvency application stageses
	 */
	@Override
	public int countBygetOIAS_StageName(String stageName) {
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetOIAS_StageName;

		Object[] finderArgs = new Object[] {stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSIINSOLVENCYAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOIAS_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETOIAS_STAGENAME_STAGENAME_2);
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

	private static final String _FINDER_COLUMN_GETOIAS_STAGENAME_STAGENAME_2 =
		"osiInsolvencyApplicationStages.stageName = ?";

	private static final String _FINDER_COLUMN_GETOIAS_STAGENAME_STAGENAME_3 =
		"(osiInsolvencyApplicationStages.stageName IS NULL OR osiInsolvencyApplicationStages.stageName = '')";

	private FinderPath
		_finderPathWithPaginationFindBygetOIAS_StageName_StageStatus;
	private FinderPath
		_finderPathWithoutPaginationFindBygetOIAS_StageName_StageStatus;
	private FinderPath _finderPathCountBygetOIAS_StageName_StageStatus;

	/**
	 * Returns all the osi insolvency application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching osi insolvency application stageses
	 */
	@Override
	public List<OsiInsolvencyApplicationStages>
		findBygetOIAS_StageName_StageStatus(
			String stageName, String stageStatus) {

		return findBygetOIAS_StageName_StageStatus(
			stageName, stageStatus, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi insolvency application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @return the range of matching osi insolvency application stageses
	 */
	@Override
	public List<OsiInsolvencyApplicationStages>
		findBygetOIAS_StageName_StageStatus(
			String stageName, String stageStatus, int start, int end) {

		return findBygetOIAS_StageName_StageStatus(
			stageName, stageStatus, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi insolvency application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi insolvency application stageses
	 */
	@Override
	public List<OsiInsolvencyApplicationStages>
		findBygetOIAS_StageName_StageStatus(
			String stageName, String stageStatus, int start, int end,
			OrderByComparator<OsiInsolvencyApplicationStages>
				orderByComparator) {

		return findBygetOIAS_StageName_StageStatus(
			stageName, stageStatus, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi insolvency application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi insolvency application stageses
	 */
	@Override
	public List<OsiInsolvencyApplicationStages>
		findBygetOIAS_StageName_StageStatus(
			String stageName, String stageStatus, int start, int end,
			OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator,
			boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetOIAS_StageName_StageStatus;
				finderArgs = new Object[] {stageName, stageStatus};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetOIAS_StageName_StageStatus;
			finderArgs = new Object[] {
				stageName, stageStatus, start, end, orderByComparator
			};
		}

		List<OsiInsolvencyApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<OsiInsolvencyApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiInsolvencyApplicationStages
						osiInsolvencyApplicationStages : list) {

					if (!stageName.equals(
							osiInsolvencyApplicationStages.getStageName()) ||
						!stageStatus.equals(
							osiInsolvencyApplicationStages.getStageStatus())) {

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

			sb.append(_SQL_SELECT_OSIINSOLVENCYAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOIAS_STAGENAME_STAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETOIAS_STAGENAME_STAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOIAS_STAGENAME_STAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETOIAS_STAGENAME_STAGESTATUS_STAGESTATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					OsiInsolvencyApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<OsiInsolvencyApplicationStages>)QueryUtil.list(
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
	 * Returns the first osi insolvency application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages
			findBygetOIAS_StageName_StageStatus_First(
				String stageName, String stageStatus,
				OrderByComparator<OsiInsolvencyApplicationStages>
					orderByComparator)
		throws NoSuchOsiInsolvencyApplicationStagesException {

		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages =
			fetchBygetOIAS_StageName_StageStatus_First(
				stageName, stageStatus, orderByComparator);

		if (osiInsolvencyApplicationStages != null) {
			return osiInsolvencyApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append(", stageStatus=");
		sb.append(stageStatus);

		sb.append("}");

		throw new NoSuchOsiInsolvencyApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first osi insolvency application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages
		fetchBygetOIAS_StageName_StageStatus_First(
			String stageName, String stageStatus,
			OrderByComparator<OsiInsolvencyApplicationStages>
				orderByComparator) {

		List<OsiInsolvencyApplicationStages> list =
			findBygetOIAS_StageName_StageStatus(
				stageName, stageStatus, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi insolvency application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages
			findBygetOIAS_StageName_StageStatus_Last(
				String stageName, String stageStatus,
				OrderByComparator<OsiInsolvencyApplicationStages>
					orderByComparator)
		throws NoSuchOsiInsolvencyApplicationStagesException {

		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages =
			fetchBygetOIAS_StageName_StageStatus_Last(
				stageName, stageStatus, orderByComparator);

		if (osiInsolvencyApplicationStages != null) {
			return osiInsolvencyApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append(", stageStatus=");
		sb.append(stageStatus);

		sb.append("}");

		throw new NoSuchOsiInsolvencyApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last osi insolvency application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages
		fetchBygetOIAS_StageName_StageStatus_Last(
			String stageName, String stageStatus,
			OrderByComparator<OsiInsolvencyApplicationStages>
				orderByComparator) {

		int count = countBygetOIAS_StageName_StageStatus(
			stageName, stageStatus);

		if (count == 0) {
			return null;
		}

		List<OsiInsolvencyApplicationStages> list =
			findBygetOIAS_StageName_StageStatus(
				stageName, stageStatus, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi insolvency application stageses before and after the current osi insolvency application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param osiInsolveApplicationStagesId the primary key of the current osi insolvency application stages
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a osi insolvency application stages with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages[]
			findBygetOIAS_StageName_StageStatus_PrevAndNext(
				long osiInsolveApplicationStagesId, String stageName,
				String stageStatus,
				OrderByComparator<OsiInsolvencyApplicationStages>
					orderByComparator)
		throws NoSuchOsiInsolvencyApplicationStagesException {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages =
			findByPrimaryKey(osiInsolveApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			OsiInsolvencyApplicationStages[] array =
				new OsiInsolvencyApplicationStagesImpl[3];

			array[0] = getBygetOIAS_StageName_StageStatus_PrevAndNext(
				session, osiInsolvencyApplicationStages, stageName, stageStatus,
				orderByComparator, true);

			array[1] = osiInsolvencyApplicationStages;

			array[2] = getBygetOIAS_StageName_StageStatus_PrevAndNext(
				session, osiInsolvencyApplicationStages, stageName, stageStatus,
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

	protected OsiInsolvencyApplicationStages
		getBygetOIAS_StageName_StageStatus_PrevAndNext(
			Session session,
			OsiInsolvencyApplicationStages osiInsolvencyApplicationStages,
			String stageName, String stageStatus,
			OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_OSIINSOLVENCYAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETOIAS_STAGENAME_STAGESTATUS_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETOIAS_STAGENAME_STAGESTATUS_STAGENAME_2);
		}

		boolean bindStageStatus = false;

		if (stageStatus.isEmpty()) {
			sb.append(
				_FINDER_COLUMN_GETOIAS_STAGENAME_STAGESTATUS_STAGESTATUS_3);
		}
		else {
			bindStageStatus = true;

			sb.append(
				_FINDER_COLUMN_GETOIAS_STAGENAME_STAGESTATUS_STAGESTATUS_2);
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
			sb.append(OsiInsolvencyApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						osiInsolvencyApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiInsolvencyApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi insolvency application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	@Override
	public void removeBygetOIAS_StageName_StageStatus(
		String stageName, String stageStatus) {

		for (OsiInsolvencyApplicationStages osiInsolvencyApplicationStages :
				findBygetOIAS_StageName_StageStatus(
					stageName, stageStatus, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(osiInsolvencyApplicationStages);
		}
	}

	/**
	 * Returns the number of osi insolvency application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching osi insolvency application stageses
	 */
	@Override
	public int countBygetOIAS_StageName_StageStatus(
		String stageName, String stageStatus) {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetOIAS_StageName_StageStatus;

		Object[] finderArgs = new Object[] {stageName, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSIINSOLVENCYAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOIAS_STAGENAME_STAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETOIAS_STAGENAME_STAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOIAS_STAGENAME_STAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETOIAS_STAGENAME_STAGESTATUS_STAGESTATUS_2);
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
		_FINDER_COLUMN_GETOIAS_STAGENAME_STAGESTATUS_STAGENAME_2 =
			"osiInsolvencyApplicationStages.stageName = ? AND ";

	private static final String
		_FINDER_COLUMN_GETOIAS_STAGENAME_STAGESTATUS_STAGENAME_3 =
			"(osiInsolvencyApplicationStages.stageName IS NULL OR osiInsolvencyApplicationStages.stageName = '') AND ";

	private static final String
		_FINDER_COLUMN_GETOIAS_STAGENAME_STAGESTATUS_STAGESTATUS_2 =
			"osiInsolvencyApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETOIAS_STAGENAME_STAGESTATUS_STAGESTATUS_3 =
			"(osiInsolvencyApplicationStages.stageStatus IS NULL OR osiInsolvencyApplicationStages.stageStatus = '')";

	private FinderPath _finderPathFetchBygetOIAS_CaseIdStageStatus;
	private FinderPath _finderPathCountBygetOIAS_CaseIdStageStatus;

	/**
	 * Returns the osi insolvency application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchOsiInsolvencyApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages findBygetOIAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchOsiInsolvencyApplicationStagesException {

		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages =
			fetchBygetOIAS_CaseIdStageStatus(caseId, stageName, stageStatus);

		if (osiInsolvencyApplicationStages == null) {
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

			throw new NoSuchOsiInsolvencyApplicationStagesException(
				sb.toString());
		}

		return osiInsolvencyApplicationStages;
	}

	/**
	 * Returns the osi insolvency application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages fetchBygetOIAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return fetchBygetOIAS_CaseIdStageStatus(
			caseId, stageName, stageStatus, true);
	}

	/**
	 * Returns the osi insolvency application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages fetchBygetOIAS_CaseIdStageStatus(
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
				_finderPathFetchBygetOIAS_CaseIdStageStatus, finderArgs, this);
		}

		if (result instanceof OsiInsolvencyApplicationStages) {
			OsiInsolvencyApplicationStages osiInsolvencyApplicationStages =
				(OsiInsolvencyApplicationStages)result;

			if (!Objects.equals(
					caseId, osiInsolvencyApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, osiInsolvencyApplicationStages.getStageName()) ||
				!Objects.equals(
					stageStatus,
					osiInsolvencyApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_OSIINSOLVENCYAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOIAS_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOIAS_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOIAS_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETOIAS_CASEIDSTAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOIAS_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETOIAS_CASEIDSTAGESTATUS_STAGESTATUS_2);
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

				List<OsiInsolvencyApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOIAS_CaseIdStageStatus,
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
								"OsiInsolvencyApplicationStagesPersistenceImpl.fetchBygetOIAS_CaseIdStageStatus(String, String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiInsolvencyApplicationStages
						osiInsolvencyApplicationStages = list.get(0);

					result = osiInsolvencyApplicationStages;

					cacheResult(osiInsolvencyApplicationStages);
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
			return (OsiInsolvencyApplicationStages)result;
		}
	}

	/**
	 * Removes the osi insolvency application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the osi insolvency application stages that was removed
	 */
	@Override
	public OsiInsolvencyApplicationStages removeBygetOIAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchOsiInsolvencyApplicationStagesException {

		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages =
			findBygetOIAS_CaseIdStageStatus(caseId, stageName, stageStatus);

		return remove(osiInsolvencyApplicationStages);
	}

	/**
	 * Returns the number of osi insolvency application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching osi insolvency application stageses
	 */
	@Override
	public int countBygetOIAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetOIAS_CaseIdStageStatus;

		Object[] finderArgs = new Object[] {caseId, stageName, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_OSIINSOLVENCYAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOIAS_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOIAS_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOIAS_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETOIAS_CASEIDSTAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOIAS_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETOIAS_CASEIDSTAGESTATUS_STAGESTATUS_2);
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
		_FINDER_COLUMN_GETOIAS_CASEIDSTAGESTATUS_CASEID_2 =
			"osiInsolvencyApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETOIAS_CASEIDSTAGESTATUS_CASEID_3 =
			"(osiInsolvencyApplicationStages.caseId IS NULL OR osiInsolvencyApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETOIAS_CASEIDSTAGESTATUS_STAGENAME_2 =
			"osiInsolvencyApplicationStages.stageName = ? AND ";

	private static final String
		_FINDER_COLUMN_GETOIAS_CASEIDSTAGESTATUS_STAGENAME_3 =
			"(osiInsolvencyApplicationStages.stageName IS NULL OR osiInsolvencyApplicationStages.stageName = '') AND ";

	private static final String
		_FINDER_COLUMN_GETOIAS_CASEIDSTAGESTATUS_STAGESTATUS_2 =
			"osiInsolvencyApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETOIAS_CASEIDSTAGESTATUS_STAGESTATUS_3 =
			"(osiInsolvencyApplicationStages.stageStatus IS NULL OR osiInsolvencyApplicationStages.stageStatus = '')";

	private FinderPath _finderPathFetchBygetOIAS_CaseIdAndStatus;
	private FinderPath _finderPathCountBygetOIAS_CaseIdAndStatus;

	/**
	 * Returns the osi insolvency application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchOsiInsolvencyApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages findBygetOIAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchOsiInsolvencyApplicationStagesException {

		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages =
			fetchBygetOIAS_CaseIdAndStatus(caseId, stageStatus);

		if (osiInsolvencyApplicationStages == null) {
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

			throw new NoSuchOsiInsolvencyApplicationStagesException(
				sb.toString());
		}

		return osiInsolvencyApplicationStages;
	}

	/**
	 * Returns the osi insolvency application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages fetchBygetOIAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return fetchBygetOIAS_CaseIdAndStatus(caseId, stageStatus, true);
	}

	/**
	 * Returns the osi insolvency application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages fetchBygetOIAS_CaseIdAndStatus(
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
				_finderPathFetchBygetOIAS_CaseIdAndStatus, finderArgs, this);
		}

		if (result instanceof OsiInsolvencyApplicationStages) {
			OsiInsolvencyApplicationStages osiInsolvencyApplicationStages =
				(OsiInsolvencyApplicationStages)result;

			if (!Objects.equals(
					caseId, osiInsolvencyApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageStatus,
					osiInsolvencyApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_OSIINSOLVENCYAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOIAS_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOIAS_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOIAS_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETOIAS_CASEIDANDSTATUS_STAGESTATUS_2);
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

				List<OsiInsolvencyApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOIAS_CaseIdAndStatus,
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
								"OsiInsolvencyApplicationStagesPersistenceImpl.fetchBygetOIAS_CaseIdAndStatus(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiInsolvencyApplicationStages
						osiInsolvencyApplicationStages = list.get(0);

					result = osiInsolvencyApplicationStages;

					cacheResult(osiInsolvencyApplicationStages);
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
			return (OsiInsolvencyApplicationStages)result;
		}
	}

	/**
	 * Removes the osi insolvency application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the osi insolvency application stages that was removed
	 */
	@Override
	public OsiInsolvencyApplicationStages removeBygetOIAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchOsiInsolvencyApplicationStagesException {

		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages =
			findBygetOIAS_CaseIdAndStatus(caseId, stageStatus);

		return remove(osiInsolvencyApplicationStages);
	}

	/**
	 * Returns the number of osi insolvency application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching osi insolvency application stageses
	 */
	@Override
	public int countBygetOIAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetOIAS_CaseIdAndStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSIINSOLVENCYAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOIAS_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOIAS_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOIAS_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETOIAS_CASEIDANDSTATUS_STAGESTATUS_2);
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
		_FINDER_COLUMN_GETOIAS_CASEIDANDSTATUS_CASEID_2 =
			"osiInsolvencyApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETOIAS_CASEIDANDSTATUS_CASEID_3 =
			"(osiInsolvencyApplicationStages.caseId IS NULL OR osiInsolvencyApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETOIAS_CASEIDANDSTATUS_STAGESTATUS_2 =
			"osiInsolvencyApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETOIAS_CASEIDANDSTATUS_STAGESTATUS_3 =
			"(osiInsolvencyApplicationStages.stageStatus IS NULL OR osiInsolvencyApplicationStages.stageStatus = '')";

	private FinderPath _finderPathWithPaginationFindBygetOIAS_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetOIAS_CaseId;
	private FinderPath _finderPathCountBygetOIAS_CaseId;

	/**
	 * Returns all the osi insolvency application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching osi insolvency application stageses
	 */
	@Override
	public List<OsiInsolvencyApplicationStages> findBygetOIAS_CaseId(
		String caseId) {

		return findBygetOIAS_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi insolvency application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @return the range of matching osi insolvency application stageses
	 */
	@Override
	public List<OsiInsolvencyApplicationStages> findBygetOIAS_CaseId(
		String caseId, int start, int end) {

		return findBygetOIAS_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi insolvency application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi insolvency application stageses
	 */
	@Override
	public List<OsiInsolvencyApplicationStages> findBygetOIAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator) {

		return findBygetOIAS_CaseId(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi insolvency application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi insolvency application stageses
	 */
	@Override
	public List<OsiInsolvencyApplicationStages> findBygetOIAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetOIAS_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetOIAS_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<OsiInsolvencyApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<OsiInsolvencyApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiInsolvencyApplicationStages
						osiInsolvencyApplicationStages : list) {

					if (!caseId.equals(
							osiInsolvencyApplicationStages.getCaseId())) {

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

			sb.append(_SQL_SELECT_OSIINSOLVENCYAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOIAS_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOIAS_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					OsiInsolvencyApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<OsiInsolvencyApplicationStages>)QueryUtil.list(
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
	 * Returns the first osi insolvency application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages findBygetOIAS_CaseId_First(
			String caseId,
			OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationStagesException {

		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages =
			fetchBygetOIAS_CaseId_First(caseId, orderByComparator);

		if (osiInsolvencyApplicationStages != null) {
			return osiInsolvencyApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchOsiInsolvencyApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first osi insolvency application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages fetchBygetOIAS_CaseId_First(
		String caseId,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator) {

		List<OsiInsolvencyApplicationStages> list = findBygetOIAS_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi insolvency application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages findBygetOIAS_CaseId_Last(
			String caseId,
			OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationStagesException {

		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages =
			fetchBygetOIAS_CaseId_Last(caseId, orderByComparator);

		if (osiInsolvencyApplicationStages != null) {
			return osiInsolvencyApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchOsiInsolvencyApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last osi insolvency application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages fetchBygetOIAS_CaseId_Last(
		String caseId,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator) {

		int count = countBygetOIAS_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<OsiInsolvencyApplicationStages> list = findBygetOIAS_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi insolvency application stageses before and after the current osi insolvency application stages in the ordered set where caseId = &#63;.
	 *
	 * @param osiInsolveApplicationStagesId the primary key of the current osi insolvency application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a osi insolvency application stages with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages[] findBygetOIAS_CaseId_PrevAndNext(
			long osiInsolveApplicationStagesId, String caseId,
			OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationStagesException {

		caseId = Objects.toString(caseId, "");

		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages =
			findByPrimaryKey(osiInsolveApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			OsiInsolvencyApplicationStages[] array =
				new OsiInsolvencyApplicationStagesImpl[3];

			array[0] = getBygetOIAS_CaseId_PrevAndNext(
				session, osiInsolvencyApplicationStages, caseId,
				orderByComparator, true);

			array[1] = osiInsolvencyApplicationStages;

			array[2] = getBygetOIAS_CaseId_PrevAndNext(
				session, osiInsolvencyApplicationStages, caseId,
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

	protected OsiInsolvencyApplicationStages getBygetOIAS_CaseId_PrevAndNext(
		Session session,
		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages,
		String caseId,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_OSIINSOLVENCYAPPLICATIONSTAGES_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETOIAS_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETOIAS_CASEID_CASEID_2);
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
			sb.append(OsiInsolvencyApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						osiInsolvencyApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiInsolvencyApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi insolvency application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetOIAS_CaseId(String caseId) {
		for (OsiInsolvencyApplicationStages osiInsolvencyApplicationStages :
				findBygetOIAS_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(osiInsolvencyApplicationStages);
		}
	}

	/**
	 * Returns the number of osi insolvency application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi insolvency application stageses
	 */
	@Override
	public int countBygetOIAS_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetOIAS_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSIINSOLVENCYAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOIAS_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOIAS_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETOIAS_CASEID_CASEID_2 =
		"osiInsolvencyApplicationStages.caseId = ?";

	private static final String _FINDER_COLUMN_GETOIAS_CASEID_CASEID_3 =
		"(osiInsolvencyApplicationStages.caseId IS NULL OR osiInsolvencyApplicationStages.caseId = '')";

	public OsiInsolvencyApplicationStagesPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(OsiInsolvencyApplicationStages.class);

		setModelImplClass(OsiInsolvencyApplicationStagesImpl.class);
		setModelPKClass(long.class);

		setTable(OsiInsolvencyApplicationStagesTable.INSTANCE);
	}

	/**
	 * Caches the osi insolvency application stages in the entity cache if it is enabled.
	 *
	 * @param osiInsolvencyApplicationStages the osi insolvency application stages
	 */
	@Override
	public void cacheResult(
		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages) {

		entityCache.putResult(
			OsiInsolvencyApplicationStagesImpl.class,
			osiInsolvencyApplicationStages.getPrimaryKey(),
			osiInsolvencyApplicationStages);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				osiInsolvencyApplicationStages.getUuid(),
				osiInsolvencyApplicationStages.getGroupId()
			},
			osiInsolvencyApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetOIAS_OAI,
			new Object[] {osiInsolvencyApplicationStages.getOsiInsolvencyId()},
			osiInsolvencyApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetCAS_CaseIdStageName,
			new Object[] {
				osiInsolvencyApplicationStages.getCaseId(),
				osiInsolvencyApplicationStages.getStageName()
			},
			osiInsolvencyApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetOIAS_CaseIdStageStatus,
			new Object[] {
				osiInsolvencyApplicationStages.getCaseId(),
				osiInsolvencyApplicationStages.getStageName(),
				osiInsolvencyApplicationStages.getStageStatus()
			},
			osiInsolvencyApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetOIAS_CaseIdAndStatus,
			new Object[] {
				osiInsolvencyApplicationStages.getCaseId(),
				osiInsolvencyApplicationStages.getStageStatus()
			},
			osiInsolvencyApplicationStages);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the osi insolvency application stageses in the entity cache if it is enabled.
	 *
	 * @param osiInsolvencyApplicationStageses the osi insolvency application stageses
	 */
	@Override
	public void cacheResult(
		List<OsiInsolvencyApplicationStages> osiInsolvencyApplicationStageses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (osiInsolvencyApplicationStageses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OsiInsolvencyApplicationStages osiInsolvencyApplicationStages :
				osiInsolvencyApplicationStageses) {

			if (entityCache.getResult(
					OsiInsolvencyApplicationStagesImpl.class,
					osiInsolvencyApplicationStages.getPrimaryKey()) == null) {

				cacheResult(osiInsolvencyApplicationStages);
			}
		}
	}

	/**
	 * Clears the cache for all osi insolvency application stageses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OsiInsolvencyApplicationStagesImpl.class);

		finderCache.clearCache(OsiInsolvencyApplicationStagesImpl.class);
	}

	/**
	 * Clears the cache for the osi insolvency application stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages) {

		entityCache.removeResult(
			OsiInsolvencyApplicationStagesImpl.class,
			osiInsolvencyApplicationStages);
	}

	@Override
	public void clearCache(
		List<OsiInsolvencyApplicationStages> osiInsolvencyApplicationStageses) {

		for (OsiInsolvencyApplicationStages osiInsolvencyApplicationStages :
				osiInsolvencyApplicationStageses) {

			entityCache.removeResult(
				OsiInsolvencyApplicationStagesImpl.class,
				osiInsolvencyApplicationStages);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OsiInsolvencyApplicationStagesImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				OsiInsolvencyApplicationStagesImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OsiInsolvencyApplicationStagesModelImpl
			osiInsolvencyApplicationStagesModelImpl) {

		Object[] args = new Object[] {
			osiInsolvencyApplicationStagesModelImpl.getUuid(),
			osiInsolvencyApplicationStagesModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args,
			osiInsolvencyApplicationStagesModelImpl);

		args = new Object[] {
			osiInsolvencyApplicationStagesModelImpl.getOsiInsolvencyId()
		};

		finderCache.putResult(
			_finderPathCountBygetOIAS_OAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOIAS_OAI, args,
			osiInsolvencyApplicationStagesModelImpl);

		args = new Object[] {
			osiInsolvencyApplicationStagesModelImpl.getCaseId(),
			osiInsolvencyApplicationStagesModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetCAS_CaseIdStageName, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCAS_CaseIdStageName, args,
			osiInsolvencyApplicationStagesModelImpl);

		args = new Object[] {
			osiInsolvencyApplicationStagesModelImpl.getCaseId(),
			osiInsolvencyApplicationStagesModelImpl.getStageName(),
			osiInsolvencyApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetOIAS_CaseIdStageStatus, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOIAS_CaseIdStageStatus, args,
			osiInsolvencyApplicationStagesModelImpl);

		args = new Object[] {
			osiInsolvencyApplicationStagesModelImpl.getCaseId(),
			osiInsolvencyApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetOIAS_CaseIdAndStatus, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOIAS_CaseIdAndStatus, args,
			osiInsolvencyApplicationStagesModelImpl);
	}

	/**
	 * Creates a new osi insolvency application stages with the primary key. Does not add the osi insolvency application stages to the database.
	 *
	 * @param osiInsolveApplicationStagesId the primary key for the new osi insolvency application stages
	 * @return the new osi insolvency application stages
	 */
	@Override
	public OsiInsolvencyApplicationStages create(
		long osiInsolveApplicationStagesId) {

		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages =
			new OsiInsolvencyApplicationStagesImpl();

		osiInsolvencyApplicationStages.setNew(true);
		osiInsolvencyApplicationStages.setPrimaryKey(
			osiInsolveApplicationStagesId);

		String uuid = PortalUUIDUtil.generate();

		osiInsolvencyApplicationStages.setUuid(uuid);

		osiInsolvencyApplicationStages.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return osiInsolvencyApplicationStages;
	}

	/**
	 * Removes the osi insolvency application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiInsolveApplicationStagesId the primary key of the osi insolvency application stages
	 * @return the osi insolvency application stages that was removed
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a osi insolvency application stages with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages remove(
			long osiInsolveApplicationStagesId)
		throws NoSuchOsiInsolvencyApplicationStagesException {

		return remove((Serializable)osiInsolveApplicationStagesId);
	}

	/**
	 * Removes the osi insolvency application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the osi insolvency application stages
	 * @return the osi insolvency application stages that was removed
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a osi insolvency application stages with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages remove(Serializable primaryKey)
		throws NoSuchOsiInsolvencyApplicationStagesException {

		Session session = null;

		try {
			session = openSession();

			OsiInsolvencyApplicationStages osiInsolvencyApplicationStages =
				(OsiInsolvencyApplicationStages)session.get(
					OsiInsolvencyApplicationStagesImpl.class, primaryKey);

			if (osiInsolvencyApplicationStages == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOsiInsolvencyApplicationStagesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(osiInsolvencyApplicationStages);
		}
		catch (NoSuchOsiInsolvencyApplicationStagesException
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
	protected OsiInsolvencyApplicationStages removeImpl(
		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(osiInsolvencyApplicationStages)) {
				osiInsolvencyApplicationStages =
					(OsiInsolvencyApplicationStages)session.get(
						OsiInsolvencyApplicationStagesImpl.class,
						osiInsolvencyApplicationStages.getPrimaryKeyObj());
			}

			if (osiInsolvencyApplicationStages != null) {
				session.delete(osiInsolvencyApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (osiInsolvencyApplicationStages != null) {
			clearCache(osiInsolvencyApplicationStages);
		}

		return osiInsolvencyApplicationStages;
	}

	@Override
	public OsiInsolvencyApplicationStages updateImpl(
		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages) {

		boolean isNew = osiInsolvencyApplicationStages.isNew();

		if (!(osiInsolvencyApplicationStages instanceof
				OsiInsolvencyApplicationStagesModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					osiInsolvencyApplicationStages.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					osiInsolvencyApplicationStages);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in osiInsolvencyApplicationStages proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OsiInsolvencyApplicationStages implementation " +
					osiInsolvencyApplicationStages.getClass());
		}

		OsiInsolvencyApplicationStagesModelImpl
			osiInsolvencyApplicationStagesModelImpl =
				(OsiInsolvencyApplicationStagesModelImpl)
					osiInsolvencyApplicationStages;

		if (Validator.isNull(osiInsolvencyApplicationStages.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			osiInsolvencyApplicationStages.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (osiInsolvencyApplicationStages.getCreateDate() == null)) {
			if (serviceContext == null) {
				osiInsolvencyApplicationStages.setCreateDate(date);
			}
			else {
				osiInsolvencyApplicationStages.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!osiInsolvencyApplicationStagesModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				osiInsolvencyApplicationStages.setModifiedDate(date);
			}
			else {
				osiInsolvencyApplicationStages.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(osiInsolvencyApplicationStages);
			}
			else {
				osiInsolvencyApplicationStages =
					(OsiInsolvencyApplicationStages)session.merge(
						osiInsolvencyApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OsiInsolvencyApplicationStagesImpl.class,
			osiInsolvencyApplicationStagesModelImpl, false, true);

		cacheUniqueFindersCache(osiInsolvencyApplicationStagesModelImpl);

		if (isNew) {
			osiInsolvencyApplicationStages.setNew(false);
		}

		osiInsolvencyApplicationStages.resetOriginalValues();

		return osiInsolvencyApplicationStages;
	}

	/**
	 * Returns the osi insolvency application stages with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the osi insolvency application stages
	 * @return the osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a osi insolvency application stages with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchOsiInsolvencyApplicationStagesException {

		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages =
			fetchByPrimaryKey(primaryKey);

		if (osiInsolvencyApplicationStages == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOsiInsolvencyApplicationStagesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return osiInsolvencyApplicationStages;
	}

	/**
	 * Returns the osi insolvency application stages with the primary key or throws a <code>NoSuchOsiInsolvencyApplicationStagesException</code> if it could not be found.
	 *
	 * @param osiInsolveApplicationStagesId the primary key of the osi insolvency application stages
	 * @return the osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a osi insolvency application stages with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages findByPrimaryKey(
			long osiInsolveApplicationStagesId)
		throws NoSuchOsiInsolvencyApplicationStagesException {

		return findByPrimaryKey((Serializable)osiInsolveApplicationStagesId);
	}

	/**
	 * Returns the osi insolvency application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiInsolveApplicationStagesId the primary key of the osi insolvency application stages
	 * @return the osi insolvency application stages, or <code>null</code> if a osi insolvency application stages with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyApplicationStages fetchByPrimaryKey(
		long osiInsolveApplicationStagesId) {

		return fetchByPrimaryKey((Serializable)osiInsolveApplicationStagesId);
	}

	/**
	 * Returns all the osi insolvency application stageses.
	 *
	 * @return the osi insolvency application stageses
	 */
	@Override
	public List<OsiInsolvencyApplicationStages> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi insolvency application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @return the range of osi insolvency application stageses
	 */
	@Override
	public List<OsiInsolvencyApplicationStages> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi insolvency application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi insolvency application stageses
	 */
	@Override
	public List<OsiInsolvencyApplicationStages> findAll(
		int start, int end,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi insolvency application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi insolvency application stageses
	 */
	@Override
	public List<OsiInsolvencyApplicationStages> findAll(
		int start, int end,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator,
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

		List<OsiInsolvencyApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<OsiInsolvencyApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OSIINSOLVENCYAPPLICATIONSTAGES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OSIINSOLVENCYAPPLICATIONSTAGES;

				sql = sql.concat(
					OsiInsolvencyApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OsiInsolvencyApplicationStages>)QueryUtil.list(
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
	 * Removes all the osi insolvency application stageses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OsiInsolvencyApplicationStages osiInsolvencyApplicationStages :
				findAll()) {

			remove(osiInsolvencyApplicationStages);
		}
	}

	/**
	 * Returns the number of osi insolvency application stageses.
	 *
	 * @return the number of osi insolvency application stageses
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
					_SQL_COUNT_OSIINSOLVENCYAPPLICATIONSTAGES);

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
		return "osiInsolveApplicationStagesId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OSIINSOLVENCYAPPLICATIONSTAGES;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OsiInsolvencyApplicationStagesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the osi insolvency application stages persistence.
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

		_finderPathFetchBygetOIAS_OAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOIAS_OAI",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, true);

		_finderPathCountBygetOIAS_OAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOIAS_OAI",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, false);

		_finderPathFetchBygetCAS_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCAS_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, true);

		_finderPathCountBygetCAS_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCAS_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, false);

		_finderPathWithPaginationFindBygetOIAS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetOIAS_StageName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"stageName"}, true);

		_finderPathWithoutPaginationFindBygetOIAS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetOIAS_StageName", new String[] {String.class.getName()},
			new String[] {"stageName"}, true);

		_finderPathCountBygetOIAS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOIAS_StageName", new String[] {String.class.getName()},
			new String[] {"stageName"}, false);

		_finderPathWithPaginationFindBygetOIAS_StageName_StageStatus =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetOIAS_StageName_StageStatus",
				new String[] {
					String.class.getName(), String.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"stageName", "stageStatus"}, true);

		_finderPathWithoutPaginationFindBygetOIAS_StageName_StageStatus =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetOIAS_StageName_StageStatus",
				new String[] {String.class.getName(), String.class.getName()},
				new String[] {"stageName", "stageStatus"}, true);

		_finderPathCountBygetOIAS_StageName_StageStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOIAS_StageName_StageStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"stageName", "stageStatus"}, false);

		_finderPathFetchBygetOIAS_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOIAS_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageName", "stageStatus"}, true);

		_finderPathCountBygetOIAS_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOIAS_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageName", "stageStatus"}, false);

		_finderPathFetchBygetOIAS_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOIAS_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, true);

		_finderPathCountBygetOIAS_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOIAS_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, false);

		_finderPathWithPaginationFindBygetOIAS_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetOIAS_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetOIAS_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetOIAS_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetOIAS_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOIAS_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		OsiInsolvencyApplicationStagesUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OsiInsolvencyApplicationStagesUtil.setPersistence(null);

		entityCache.removeCache(
			OsiInsolvencyApplicationStagesImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCY_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCY_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCY_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_OSIINSOLVENCYAPPLICATIONSTAGES =
		"SELECT osiInsolvencyApplicationStages FROM OsiInsolvencyApplicationStages osiInsolvencyApplicationStages";

	private static final String
		_SQL_SELECT_OSIINSOLVENCYAPPLICATIONSTAGES_WHERE =
			"SELECT osiInsolvencyApplicationStages FROM OsiInsolvencyApplicationStages osiInsolvencyApplicationStages WHERE ";

	private static final String _SQL_COUNT_OSIINSOLVENCYAPPLICATIONSTAGES =
		"SELECT COUNT(osiInsolvencyApplicationStages) FROM OsiInsolvencyApplicationStages osiInsolvencyApplicationStages";

	private static final String
		_SQL_COUNT_OSIINSOLVENCYAPPLICATIONSTAGES_WHERE =
			"SELECT COUNT(osiInsolvencyApplicationStages) FROM OsiInsolvencyApplicationStages osiInsolvencyApplicationStages WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"osiInsolvencyApplicationStages.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OsiInsolvencyApplicationStages exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OsiInsolvencyApplicationStages exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OsiInsolvencyApplicationStagesPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}