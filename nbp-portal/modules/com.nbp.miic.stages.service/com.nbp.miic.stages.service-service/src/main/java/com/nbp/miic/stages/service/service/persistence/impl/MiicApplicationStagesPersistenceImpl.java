/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.stages.service.service.persistence.impl;

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

import com.nbp.miic.stages.service.exception.NoSuchMiicApplicationStagesException;
import com.nbp.miic.stages.service.model.MiicApplicationStages;
import com.nbp.miic.stages.service.model.MiicApplicationStagesTable;
import com.nbp.miic.stages.service.model.impl.MiicApplicationStagesImpl;
import com.nbp.miic.stages.service.model.impl.MiicApplicationStagesModelImpl;
import com.nbp.miic.stages.service.service.persistence.MiicApplicationStagesPersistence;
import com.nbp.miic.stages.service.service.persistence.MiicApplicationStagesUtil;
import com.nbp.miic.stages.service.service.persistence.impl.constants.MIIC_APPLICATION_STAGEPersistenceConstants;

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
 * The persistence implementation for the miic application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MiicApplicationStagesPersistence.class)
public class MiicApplicationStagesPersistenceImpl
	extends BasePersistenceImpl<MiicApplicationStages>
	implements MiicApplicationStagesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MiicApplicationStagesUtil</code> to access the miic application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MiicApplicationStagesImpl.class.getName();

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
	 * Returns all the miic application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching miic application stageses
	 */
	@Override
	public List<MiicApplicationStages> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the miic application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @return the range of matching miic application stageses
	 */
	@Override
	public List<MiicApplicationStages> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the miic application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic application stageses
	 */
	@Override
	public List<MiicApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MiicApplicationStages> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the miic application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic application stageses
	 */
	@Override
	public List<MiicApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MiicApplicationStages> orderByComparator,
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

		List<MiicApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<MiicApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MiicApplicationStages miicApplicationStages : list) {
					if (!uuid.equals(miicApplicationStages.getUuid())) {
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

			sb.append(_SQL_SELECT_MIICAPPLICATIONSTAGES_WHERE);

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
				sb.append(MiicApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<MiicApplicationStages>)QueryUtil.list(
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
	 * Returns the first miic application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	@Override
	public MiicApplicationStages findByUuid_First(
			String uuid,
			OrderByComparator<MiicApplicationStages> orderByComparator)
		throws NoSuchMiicApplicationStagesException {

		MiicApplicationStages miicApplicationStages = fetchByUuid_First(
			uuid, orderByComparator);

		if (miicApplicationStages != null) {
			return miicApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMiicApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first miic application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	@Override
	public MiicApplicationStages fetchByUuid_First(
		String uuid,
		OrderByComparator<MiicApplicationStages> orderByComparator) {

		List<MiicApplicationStages> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last miic application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	@Override
	public MiicApplicationStages findByUuid_Last(
			String uuid,
			OrderByComparator<MiicApplicationStages> orderByComparator)
		throws NoSuchMiicApplicationStagesException {

		MiicApplicationStages miicApplicationStages = fetchByUuid_Last(
			uuid, orderByComparator);

		if (miicApplicationStages != null) {
			return miicApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMiicApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last miic application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	@Override
	public MiicApplicationStages fetchByUuid_Last(
		String uuid,
		OrderByComparator<MiicApplicationStages> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<MiicApplicationStages> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the miic application stageses before and after the current miic application stages in the ordered set where uuid = &#63;.
	 *
	 * @param miicApplicationStagesId the primary key of the current miic application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a miic application stages with the primary key could not be found
	 */
	@Override
	public MiicApplicationStages[] findByUuid_PrevAndNext(
			long miicApplicationStagesId, String uuid,
			OrderByComparator<MiicApplicationStages> orderByComparator)
		throws NoSuchMiicApplicationStagesException {

		uuid = Objects.toString(uuid, "");

		MiicApplicationStages miicApplicationStages = findByPrimaryKey(
			miicApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			MiicApplicationStages[] array = new MiicApplicationStagesImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, miicApplicationStages, uuid, orderByComparator, true);

			array[1] = miicApplicationStages;

			array[2] = getByUuid_PrevAndNext(
				session, miicApplicationStages, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected MiicApplicationStages getByUuid_PrevAndNext(
		Session session, MiicApplicationStages miicApplicationStages,
		String uuid, OrderByComparator<MiicApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_MIICAPPLICATIONSTAGES_WHERE);

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
			sb.append(MiicApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						miicApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MiicApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the miic application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (MiicApplicationStages miicApplicationStages :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(miicApplicationStages);
		}
	}

	/**
	 * Returns the number of miic application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching miic application stageses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MIICAPPLICATIONSTAGES_WHERE);

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
		"miicApplicationStages.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(miicApplicationStages.uuid IS NULL OR miicApplicationStages.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the miic application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMiicApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	@Override
	public MiicApplicationStages findByUUID_G(String uuid, long groupId)
		throws NoSuchMiicApplicationStagesException {

		MiicApplicationStages miicApplicationStages = fetchByUUID_G(
			uuid, groupId);

		if (miicApplicationStages == null) {
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

			throw new NoSuchMiicApplicationStagesException(sb.toString());
		}

		return miicApplicationStages;
	}

	/**
	 * Returns the miic application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	@Override
	public MiicApplicationStages fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the miic application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	@Override
	public MiicApplicationStages fetchByUUID_G(
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

		if (result instanceof MiicApplicationStages) {
			MiicApplicationStages miicApplicationStages =
				(MiicApplicationStages)result;

			if (!Objects.equals(uuid, miicApplicationStages.getUuid()) ||
				(groupId != miicApplicationStages.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_MIICAPPLICATIONSTAGES_WHERE);

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

				List<MiicApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					MiicApplicationStages miicApplicationStages = list.get(0);

					result = miicApplicationStages;

					cacheResult(miicApplicationStages);
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
			return (MiicApplicationStages)result;
		}
	}

	/**
	 * Removes the miic application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the miic application stages that was removed
	 */
	@Override
	public MiicApplicationStages removeByUUID_G(String uuid, long groupId)
		throws NoSuchMiicApplicationStagesException {

		MiicApplicationStages miicApplicationStages = findByUUID_G(
			uuid, groupId);

		return remove(miicApplicationStages);
	}

	/**
	 * Returns the number of miic application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching miic application stageses
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MIICAPPLICATIONSTAGES_WHERE);

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
		"miicApplicationStages.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(miicApplicationStages.uuid IS NULL OR miicApplicationStages.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"miicApplicationStages.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the miic application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching miic application stageses
	 */
	@Override
	public List<MiicApplicationStages> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the miic application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @return the range of matching miic application stageses
	 */
	@Override
	public List<MiicApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the miic application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic application stageses
	 */
	@Override
	public List<MiicApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MiicApplicationStages> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the miic application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic application stageses
	 */
	@Override
	public List<MiicApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MiicApplicationStages> orderByComparator,
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

		List<MiicApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<MiicApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MiicApplicationStages miicApplicationStages : list) {
					if (!uuid.equals(miicApplicationStages.getUuid()) ||
						(companyId != miicApplicationStages.getCompanyId())) {

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

			sb.append(_SQL_SELECT_MIICAPPLICATIONSTAGES_WHERE);

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
				sb.append(MiicApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<MiicApplicationStages>)QueryUtil.list(
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
	 * Returns the first miic application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	@Override
	public MiicApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MiicApplicationStages> orderByComparator)
		throws NoSuchMiicApplicationStagesException {

		MiicApplicationStages miicApplicationStages = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (miicApplicationStages != null) {
			return miicApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMiicApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first miic application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	@Override
	public MiicApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MiicApplicationStages> orderByComparator) {

		List<MiicApplicationStages> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last miic application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	@Override
	public MiicApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MiicApplicationStages> orderByComparator)
		throws NoSuchMiicApplicationStagesException {

		MiicApplicationStages miicApplicationStages = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (miicApplicationStages != null) {
			return miicApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMiicApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last miic application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	@Override
	public MiicApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MiicApplicationStages> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<MiicApplicationStages> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the miic application stageses before and after the current miic application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param miicApplicationStagesId the primary key of the current miic application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a miic application stages with the primary key could not be found
	 */
	@Override
	public MiicApplicationStages[] findByUuid_C_PrevAndNext(
			long miicApplicationStagesId, String uuid, long companyId,
			OrderByComparator<MiicApplicationStages> orderByComparator)
		throws NoSuchMiicApplicationStagesException {

		uuid = Objects.toString(uuid, "");

		MiicApplicationStages miicApplicationStages = findByPrimaryKey(
			miicApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			MiicApplicationStages[] array = new MiicApplicationStagesImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, miicApplicationStages, uuid, companyId,
				orderByComparator, true);

			array[1] = miicApplicationStages;

			array[2] = getByUuid_C_PrevAndNext(
				session, miicApplicationStages, uuid, companyId,
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

	protected MiicApplicationStages getByUuid_C_PrevAndNext(
		Session session, MiicApplicationStages miicApplicationStages,
		String uuid, long companyId,
		OrderByComparator<MiicApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_MIICAPPLICATIONSTAGES_WHERE);

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
			sb.append(MiicApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						miicApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MiicApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the miic application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (MiicApplicationStages miicApplicationStages :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(miicApplicationStages);
		}
	}

	/**
	 * Returns the number of miic application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching miic application stageses
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MIICAPPLICATIONSTAGES_WHERE);

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
		"miicApplicationStages.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(miicApplicationStages.uuid IS NULL OR miicApplicationStages.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"miicApplicationStages.companyId = ?";

	private FinderPath _finderPathFetchBygetMIIC_CAI;
	private FinderPath _finderPathCountBygetMIIC_CAI;

	/**
	 * Returns the miic application stages where miicApplicationId = &#63; or throws a <code>NoSuchMiicApplicationStagesException</code> if it could not be found.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	@Override
	public MiicApplicationStages findBygetMIIC_CAI(long miicApplicationId)
		throws NoSuchMiicApplicationStagesException {

		MiicApplicationStages miicApplicationStages = fetchBygetMIIC_CAI(
			miicApplicationId);

		if (miicApplicationStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("miicApplicationId=");
			sb.append(miicApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMiicApplicationStagesException(sb.toString());
		}

		return miicApplicationStages;
	}

	/**
	 * Returns the miic application stages where miicApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	@Override
	public MiicApplicationStages fetchBygetMIIC_CAI(long miicApplicationId) {
		return fetchBygetMIIC_CAI(miicApplicationId, true);
	}

	/**
	 * Returns the miic application stages where miicApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	@Override
	public MiicApplicationStages fetchBygetMIIC_CAI(
		long miicApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {miicApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMIIC_CAI, finderArgs, this);
		}

		if (result instanceof MiicApplicationStages) {
			MiicApplicationStages miicApplicationStages =
				(MiicApplicationStages)result;

			if (miicApplicationId !=
					miicApplicationStages.getMiicApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MIICAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETMIIC_CAI_MIICAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(miicApplicationId);

				List<MiicApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMIIC_CAI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {miicApplicationId};
							}

							_log.warn(
								"MiicApplicationStagesPersistenceImpl.fetchBygetMIIC_CAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MiicApplicationStages miicApplicationStages = list.get(0);

					result = miicApplicationStages;

					cacheResult(miicApplicationStages);
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
			return (MiicApplicationStages)result;
		}
	}

	/**
	 * Removes the miic application stages where miicApplicationId = &#63; from the database.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the miic application stages that was removed
	 */
	@Override
	public MiicApplicationStages removeBygetMIIC_CAI(long miicApplicationId)
		throws NoSuchMiicApplicationStagesException {

		MiicApplicationStages miicApplicationStages = findBygetMIIC_CAI(
			miicApplicationId);

		return remove(miicApplicationStages);
	}

	/**
	 * Returns the number of miic application stageses where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the number of matching miic application stageses
	 */
	@Override
	public int countBygetMIIC_CAI(long miicApplicationId) {
		FinderPath finderPath = _finderPathCountBygetMIIC_CAI;

		Object[] finderArgs = new Object[] {miicApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MIICAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETMIIC_CAI_MIICAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(miicApplicationId);

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

	private static final String _FINDER_COLUMN_GETMIIC_CAI_MIICAPPLICATIONID_2 =
		"miicApplicationStages.miicApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetMIIC_StageName;
	private FinderPath _finderPathWithoutPaginationFindBygetMIIC_StageName;
	private FinderPath _finderPathCountBygetMIIC_StageName;

	/**
	 * Returns all the miic application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching miic application stageses
	 */
	@Override
	public List<MiicApplicationStages> findBygetMIIC_StageName(
		String stageName) {

		return findBygetMIIC_StageName(
			stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the miic application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @return the range of matching miic application stageses
	 */
	@Override
	public List<MiicApplicationStages> findBygetMIIC_StageName(
		String stageName, int start, int end) {

		return findBygetMIIC_StageName(stageName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the miic application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic application stageses
	 */
	@Override
	public List<MiicApplicationStages> findBygetMIIC_StageName(
		String stageName, int start, int end,
		OrderByComparator<MiicApplicationStages> orderByComparator) {

		return findBygetMIIC_StageName(
			stageName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the miic application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic application stageses
	 */
	@Override
	public List<MiicApplicationStages> findBygetMIIC_StageName(
		String stageName, int start, int end,
		OrderByComparator<MiicApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetMIIC_StageName;
				finderArgs = new Object[] {stageName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMIIC_StageName;
			finderArgs = new Object[] {
				stageName, start, end, orderByComparator
			};
		}

		List<MiicApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<MiicApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MiicApplicationStages miicApplicationStages : list) {
					if (!stageName.equals(
							miicApplicationStages.getStageName())) {

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

			sb.append(_SQL_SELECT_MIICAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIIC_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETMIIC_STAGENAME_STAGENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MiicApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<MiicApplicationStages>)QueryUtil.list(
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
	 * Returns the first miic application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	@Override
	public MiicApplicationStages findBygetMIIC_StageName_First(
			String stageName,
			OrderByComparator<MiicApplicationStages> orderByComparator)
		throws NoSuchMiicApplicationStagesException {

		MiicApplicationStages miicApplicationStages =
			fetchBygetMIIC_StageName_First(stageName, orderByComparator);

		if (miicApplicationStages != null) {
			return miicApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchMiicApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first miic application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	@Override
	public MiicApplicationStages fetchBygetMIIC_StageName_First(
		String stageName,
		OrderByComparator<MiicApplicationStages> orderByComparator) {

		List<MiicApplicationStages> list = findBygetMIIC_StageName(
			stageName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last miic application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	@Override
	public MiicApplicationStages findBygetMIIC_StageName_Last(
			String stageName,
			OrderByComparator<MiicApplicationStages> orderByComparator)
		throws NoSuchMiicApplicationStagesException {

		MiicApplicationStages miicApplicationStages =
			fetchBygetMIIC_StageName_Last(stageName, orderByComparator);

		if (miicApplicationStages != null) {
			return miicApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchMiicApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last miic application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	@Override
	public MiicApplicationStages fetchBygetMIIC_StageName_Last(
		String stageName,
		OrderByComparator<MiicApplicationStages> orderByComparator) {

		int count = countBygetMIIC_StageName(stageName);

		if (count == 0) {
			return null;
		}

		List<MiicApplicationStages> list = findBygetMIIC_StageName(
			stageName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the miic application stageses before and after the current miic application stages in the ordered set where stageName = &#63;.
	 *
	 * @param miicApplicationStagesId the primary key of the current miic application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a miic application stages with the primary key could not be found
	 */
	@Override
	public MiicApplicationStages[] findBygetMIIC_StageName_PrevAndNext(
			long miicApplicationStagesId, String stageName,
			OrderByComparator<MiicApplicationStages> orderByComparator)
		throws NoSuchMiicApplicationStagesException {

		stageName = Objects.toString(stageName, "");

		MiicApplicationStages miicApplicationStages = findByPrimaryKey(
			miicApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			MiicApplicationStages[] array = new MiicApplicationStagesImpl[3];

			array[0] = getBygetMIIC_StageName_PrevAndNext(
				session, miicApplicationStages, stageName, orderByComparator,
				true);

			array[1] = miicApplicationStages;

			array[2] = getBygetMIIC_StageName_PrevAndNext(
				session, miicApplicationStages, stageName, orderByComparator,
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

	protected MiicApplicationStages getBygetMIIC_StageName_PrevAndNext(
		Session session, MiicApplicationStages miicApplicationStages,
		String stageName,
		OrderByComparator<MiicApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_MIICAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETMIIC_STAGENAME_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETMIIC_STAGENAME_STAGENAME_2);
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
			sb.append(MiicApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						miicApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MiicApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the miic application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	@Override
	public void removeBygetMIIC_StageName(String stageName) {
		for (MiicApplicationStages miicApplicationStages :
				findBygetMIIC_StageName(
					stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(miicApplicationStages);
		}
	}

	/**
	 * Returns the number of miic application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching miic application stageses
	 */
	@Override
	public int countBygetMIIC_StageName(String stageName) {
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetMIIC_StageName;

		Object[] finderArgs = new Object[] {stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MIICAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIIC_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETMIIC_STAGENAME_STAGENAME_2);
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

	private static final String _FINDER_COLUMN_GETMIIC_STAGENAME_STAGENAME_2 =
		"miicApplicationStages.stageName = ?";

	private static final String _FINDER_COLUMN_GETMIIC_STAGENAME_STAGENAME_3 =
		"(miicApplicationStages.stageName IS NULL OR miicApplicationStages.stageName = '')";

	private FinderPath _finderPathFetchBygetMIIC_CaseIdStageName;
	private FinderPath _finderPathCountBygetMIIC_CaseIdStageName;

	/**
	 * Returns the miic application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchMiicApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	@Override
	public MiicApplicationStages findBygetMIIC_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchMiicApplicationStagesException {

		MiicApplicationStages miicApplicationStages =
			fetchBygetMIIC_CaseIdStageName(caseId, stageName);

		if (miicApplicationStages == null) {
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

			throw new NoSuchMiicApplicationStagesException(sb.toString());
		}

		return miicApplicationStages;
	}

	/**
	 * Returns the miic application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	@Override
	public MiicApplicationStages fetchBygetMIIC_CaseIdStageName(
		String caseId, String stageName) {

		return fetchBygetMIIC_CaseIdStageName(caseId, stageName, true);
	}

	/**
	 * Returns the miic application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	@Override
	public MiicApplicationStages fetchBygetMIIC_CaseIdStageName(
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
				_finderPathFetchBygetMIIC_CaseIdStageName, finderArgs, this);
		}

		if (result instanceof MiicApplicationStages) {
			MiicApplicationStages miicApplicationStages =
				(MiicApplicationStages)result;

			if (!Objects.equals(caseId, miicApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, miicApplicationStages.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_MIICAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIIC_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMIIC_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIIC_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETMIIC_CASEIDSTAGENAME_STAGENAME_2);
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

				List<MiicApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMIIC_CaseIdStageName,
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
								"MiicApplicationStagesPersistenceImpl.fetchBygetMIIC_CaseIdStageName(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MiicApplicationStages miicApplicationStages = list.get(0);

					result = miicApplicationStages;

					cacheResult(miicApplicationStages);
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
			return (MiicApplicationStages)result;
		}
	}

	/**
	 * Removes the miic application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the miic application stages that was removed
	 */
	@Override
	public MiicApplicationStages removeBygetMIIC_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchMiicApplicationStagesException {

		MiicApplicationStages miicApplicationStages =
			findBygetMIIC_CaseIdStageName(caseId, stageName);

		return remove(miicApplicationStages);
	}

	/**
	 * Returns the number of miic application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching miic application stageses
	 */
	@Override
	public int countBygetMIIC_CaseIdStageName(String caseId, String stageName) {
		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetMIIC_CaseIdStageName;

		Object[] finderArgs = new Object[] {caseId, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MIICAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIIC_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMIIC_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIIC_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETMIIC_CASEIDSTAGENAME_STAGENAME_2);
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
		_FINDER_COLUMN_GETMIIC_CASEIDSTAGENAME_CASEID_2 =
			"miicApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETMIIC_CASEIDSTAGENAME_CASEID_3 =
			"(miicApplicationStages.caseId IS NULL OR miicApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETMIIC_CASEIDSTAGENAME_STAGENAME_2 =
			"miicApplicationStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETMIIC_CASEIDSTAGENAME_STAGENAME_3 =
			"(miicApplicationStages.stageName IS NULL OR miicApplicationStages.stageName = '')";

	private FinderPath _finderPathFetchBygetMIIC_CaseIdStageStatus;
	private FinderPath _finderPathCountBygetMIIC_CaseIdStageStatus;

	/**
	 * Returns the miic application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchMiicApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	@Override
	public MiicApplicationStages findBygetMIIC_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchMiicApplicationStagesException {

		MiicApplicationStages miicApplicationStages =
			fetchBygetMIIC_CaseIdStageStatus(caseId, stageName, stageStatus);

		if (miicApplicationStages == null) {
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

			throw new NoSuchMiicApplicationStagesException(sb.toString());
		}

		return miicApplicationStages;
	}

	/**
	 * Returns the miic application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	@Override
	public MiicApplicationStages fetchBygetMIIC_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return fetchBygetMIIC_CaseIdStageStatus(
			caseId, stageName, stageStatus, true);
	}

	/**
	 * Returns the miic application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	@Override
	public MiicApplicationStages fetchBygetMIIC_CaseIdStageStatus(
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
				_finderPathFetchBygetMIIC_CaseIdStageStatus, finderArgs, this);
		}

		if (result instanceof MiicApplicationStages) {
			MiicApplicationStages miicApplicationStages =
				(MiicApplicationStages)result;

			if (!Objects.equals(caseId, miicApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, miicApplicationStages.getStageName()) ||
				!Objects.equals(
					stageStatus, miicApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_MIICAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIIC_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMIIC_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIIC_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETMIIC_CASEIDSTAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMIIC_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETMIIC_CASEIDSTAGESTATUS_STAGESTATUS_2);
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

				List<MiicApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMIIC_CaseIdStageStatus,
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
								"MiicApplicationStagesPersistenceImpl.fetchBygetMIIC_CaseIdStageStatus(String, String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MiicApplicationStages miicApplicationStages = list.get(0);

					result = miicApplicationStages;

					cacheResult(miicApplicationStages);
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
			return (MiicApplicationStages)result;
		}
	}

	/**
	 * Removes the miic application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the miic application stages that was removed
	 */
	@Override
	public MiicApplicationStages removeBygetMIIC_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchMiicApplicationStagesException {

		MiicApplicationStages miicApplicationStages =
			findBygetMIIC_CaseIdStageStatus(caseId, stageName, stageStatus);

		return remove(miicApplicationStages);
	}

	/**
	 * Returns the number of miic application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching miic application stageses
	 */
	@Override
	public int countBygetMIIC_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetMIIC_CaseIdStageStatus;

		Object[] finderArgs = new Object[] {caseId, stageName, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_MIICAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIIC_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMIIC_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIIC_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETMIIC_CASEIDSTAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMIIC_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETMIIC_CASEIDSTAGESTATUS_STAGESTATUS_2);
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
		_FINDER_COLUMN_GETMIIC_CASEIDSTAGESTATUS_CASEID_2 =
			"miicApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETMIIC_CASEIDSTAGESTATUS_CASEID_3 =
			"(miicApplicationStages.caseId IS NULL OR miicApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETMIIC_CASEIDSTAGESTATUS_STAGENAME_2 =
			"miicApplicationStages.stageName = ? AND ";

	private static final String
		_FINDER_COLUMN_GETMIIC_CASEIDSTAGESTATUS_STAGENAME_3 =
			"(miicApplicationStages.stageName IS NULL OR miicApplicationStages.stageName = '') AND ";

	private static final String
		_FINDER_COLUMN_GETMIIC_CASEIDSTAGESTATUS_STAGESTATUS_2 =
			"miicApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETMIIC_CASEIDSTAGESTATUS_STAGESTATUS_3 =
			"(miicApplicationStages.stageStatus IS NULL OR miicApplicationStages.stageStatus = '')";

	private FinderPath _finderPathFetchBygetMIIC_CaseIdAndStatus;
	private FinderPath _finderPathCountBygetMIIC_CaseIdAndStatus;

	/**
	 * Returns the miic application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchMiicApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	@Override
	public MiicApplicationStages findBygetMIIC_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchMiicApplicationStagesException {

		MiicApplicationStages miicApplicationStages =
			fetchBygetMIIC_CaseIdAndStatus(caseId, stageStatus);

		if (miicApplicationStages == null) {
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

			throw new NoSuchMiicApplicationStagesException(sb.toString());
		}

		return miicApplicationStages;
	}

	/**
	 * Returns the miic application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	@Override
	public MiicApplicationStages fetchBygetMIIC_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return fetchBygetMIIC_CaseIdAndStatus(caseId, stageStatus, true);
	}

	/**
	 * Returns the miic application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	@Override
	public MiicApplicationStages fetchBygetMIIC_CaseIdAndStatus(
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
				_finderPathFetchBygetMIIC_CaseIdAndStatus, finderArgs, this);
		}

		if (result instanceof MiicApplicationStages) {
			MiicApplicationStages miicApplicationStages =
				(MiicApplicationStages)result;

			if (!Objects.equals(caseId, miicApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageStatus, miicApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_MIICAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIIC_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMIIC_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIIC_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETMIIC_CASEIDANDSTATUS_STAGESTATUS_2);
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

				List<MiicApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMIIC_CaseIdAndStatus,
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
								"MiicApplicationStagesPersistenceImpl.fetchBygetMIIC_CaseIdAndStatus(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MiicApplicationStages miicApplicationStages = list.get(0);

					result = miicApplicationStages;

					cacheResult(miicApplicationStages);
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
			return (MiicApplicationStages)result;
		}
	}

	/**
	 * Removes the miic application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the miic application stages that was removed
	 */
	@Override
	public MiicApplicationStages removeBygetMIIC_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchMiicApplicationStagesException {

		MiicApplicationStages miicApplicationStages =
			findBygetMIIC_CaseIdAndStatus(caseId, stageStatus);

		return remove(miicApplicationStages);
	}

	/**
	 * Returns the number of miic application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching miic application stageses
	 */
	@Override
	public int countBygetMIIC_CaseIdAndStatus(
		String caseId, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetMIIC_CaseIdAndStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MIICAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIIC_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMIIC_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIIC_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETMIIC_CASEIDANDSTATUS_STAGESTATUS_2);
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
		_FINDER_COLUMN_GETMIIC_CASEIDANDSTATUS_CASEID_2 =
			"miicApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETMIIC_CASEIDANDSTATUS_CASEID_3 =
			"(miicApplicationStages.caseId IS NULL OR miicApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETMIIC_CASEIDANDSTATUS_STAGESTATUS_2 =
			"miicApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETMIIC_CASEIDANDSTATUS_STAGESTATUS_3 =
			"(miicApplicationStages.stageStatus IS NULL OR miicApplicationStages.stageStatus = '')";

	private FinderPath _finderPathWithPaginationFindBygetMIIC_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetMIIC_CaseId;
	private FinderPath _finderPathCountBygetMIIC_CaseId;

	/**
	 * Returns all the miic application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching miic application stageses
	 */
	@Override
	public List<MiicApplicationStages> findBygetMIIC_CaseId(String caseId) {
		return findBygetMIIC_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the miic application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @return the range of matching miic application stageses
	 */
	@Override
	public List<MiicApplicationStages> findBygetMIIC_CaseId(
		String caseId, int start, int end) {

		return findBygetMIIC_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the miic application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic application stageses
	 */
	@Override
	public List<MiicApplicationStages> findBygetMIIC_CaseId(
		String caseId, int start, int end,
		OrderByComparator<MiicApplicationStages> orderByComparator) {

		return findBygetMIIC_CaseId(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the miic application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic application stageses
	 */
	@Override
	public List<MiicApplicationStages> findBygetMIIC_CaseId(
		String caseId, int start, int end,
		OrderByComparator<MiicApplicationStages> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetMIIC_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMIIC_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<MiicApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<MiicApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MiicApplicationStages miicApplicationStages : list) {
					if (!caseId.equals(miicApplicationStages.getCaseId())) {
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

			sb.append(_SQL_SELECT_MIICAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIIC_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMIIC_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MiicApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<MiicApplicationStages>)QueryUtil.list(
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
	 * Returns the first miic application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	@Override
	public MiicApplicationStages findBygetMIIC_CaseId_First(
			String caseId,
			OrderByComparator<MiicApplicationStages> orderByComparator)
		throws NoSuchMiicApplicationStagesException {

		MiicApplicationStages miicApplicationStages =
			fetchBygetMIIC_CaseId_First(caseId, orderByComparator);

		if (miicApplicationStages != null) {
			return miicApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchMiicApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first miic application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	@Override
	public MiicApplicationStages fetchBygetMIIC_CaseId_First(
		String caseId,
		OrderByComparator<MiicApplicationStages> orderByComparator) {

		List<MiicApplicationStages> list = findBygetMIIC_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last miic application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	@Override
	public MiicApplicationStages findBygetMIIC_CaseId_Last(
			String caseId,
			OrderByComparator<MiicApplicationStages> orderByComparator)
		throws NoSuchMiicApplicationStagesException {

		MiicApplicationStages miicApplicationStages =
			fetchBygetMIIC_CaseId_Last(caseId, orderByComparator);

		if (miicApplicationStages != null) {
			return miicApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchMiicApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last miic application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	@Override
	public MiicApplicationStages fetchBygetMIIC_CaseId_Last(
		String caseId,
		OrderByComparator<MiicApplicationStages> orderByComparator) {

		int count = countBygetMIIC_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<MiicApplicationStages> list = findBygetMIIC_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the miic application stageses before and after the current miic application stages in the ordered set where caseId = &#63;.
	 *
	 * @param miicApplicationStagesId the primary key of the current miic application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a miic application stages with the primary key could not be found
	 */
	@Override
	public MiicApplicationStages[] findBygetMIIC_CaseId_PrevAndNext(
			long miicApplicationStagesId, String caseId,
			OrderByComparator<MiicApplicationStages> orderByComparator)
		throws NoSuchMiicApplicationStagesException {

		caseId = Objects.toString(caseId, "");

		MiicApplicationStages miicApplicationStages = findByPrimaryKey(
			miicApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			MiicApplicationStages[] array = new MiicApplicationStagesImpl[3];

			array[0] = getBygetMIIC_CaseId_PrevAndNext(
				session, miicApplicationStages, caseId, orderByComparator,
				true);

			array[1] = miicApplicationStages;

			array[2] = getBygetMIIC_CaseId_PrevAndNext(
				session, miicApplicationStages, caseId, orderByComparator,
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

	protected MiicApplicationStages getBygetMIIC_CaseId_PrevAndNext(
		Session session, MiicApplicationStages miicApplicationStages,
		String caseId,
		OrderByComparator<MiicApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_MIICAPPLICATIONSTAGES_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETMIIC_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETMIIC_CASEID_CASEID_2);
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
			sb.append(MiicApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						miicApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MiicApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the miic application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetMIIC_CaseId(String caseId) {
		for (MiicApplicationStages miicApplicationStages :
				findBygetMIIC_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(miicApplicationStages);
		}
	}

	/**
	 * Returns the number of miic application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching miic application stageses
	 */
	@Override
	public int countBygetMIIC_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetMIIC_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MIICAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIIC_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMIIC_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETMIIC_CASEID_CASEID_2 =
		"miicApplicationStages.caseId = ?";

	private static final String _FINDER_COLUMN_GETMIIC_CASEID_CASEID_3 =
		"(miicApplicationStages.caseId IS NULL OR miicApplicationStages.caseId = '')";

	private FinderPath _finderPathFetchBygetMIIC_By_CaseId;
	private FinderPath _finderPathCountBygetMIIC_By_CaseId;

	/**
	 * Returns the miic application stages where caseId = &#63; or throws a <code>NoSuchMiicApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	@Override
	public MiicApplicationStages findBygetMIIC_By_CaseId(String caseId)
		throws NoSuchMiicApplicationStagesException {

		MiicApplicationStages miicApplicationStages = fetchBygetMIIC_By_CaseId(
			caseId);

		if (miicApplicationStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMiicApplicationStagesException(sb.toString());
		}

		return miicApplicationStages;
	}

	/**
	 * Returns the miic application stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	@Override
	public MiicApplicationStages fetchBygetMIIC_By_CaseId(String caseId) {
		return fetchBygetMIIC_By_CaseId(caseId, true);
	}

	/**
	 * Returns the miic application stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	@Override
	public MiicApplicationStages fetchBygetMIIC_By_CaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMIIC_By_CaseId, finderArgs, this);
		}

		if (result instanceof MiicApplicationStages) {
			MiicApplicationStages miicApplicationStages =
				(MiicApplicationStages)result;

			if (!Objects.equals(caseId, miicApplicationStages.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MIICAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIIC_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMIIC_BY_CASEID_CASEID_2);
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

				List<MiicApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMIIC_By_CaseId, finderArgs,
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
								"MiicApplicationStagesPersistenceImpl.fetchBygetMIIC_By_CaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MiicApplicationStages miicApplicationStages = list.get(0);

					result = miicApplicationStages;

					cacheResult(miicApplicationStages);
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
			return (MiicApplicationStages)result;
		}
	}

	/**
	 * Removes the miic application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the miic application stages that was removed
	 */
	@Override
	public MiicApplicationStages removeBygetMIIC_By_CaseId(String caseId)
		throws NoSuchMiicApplicationStagesException {

		MiicApplicationStages miicApplicationStages = findBygetMIIC_By_CaseId(
			caseId);

		return remove(miicApplicationStages);
	}

	/**
	 * Returns the number of miic application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching miic application stageses
	 */
	@Override
	public int countBygetMIIC_By_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetMIIC_By_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MIICAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIIC_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMIIC_BY_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETMIIC_BY_CASEID_CASEID_2 =
		"miicApplicationStages.caseId = ?";

	private static final String _FINDER_COLUMN_GETMIIC_BY_CASEID_CASEID_3 =
		"(miicApplicationStages.caseId IS NULL OR miicApplicationStages.caseId = '')";

	public MiicApplicationStagesPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(MiicApplicationStages.class);

		setModelImplClass(MiicApplicationStagesImpl.class);
		setModelPKClass(long.class);

		setTable(MiicApplicationStagesTable.INSTANCE);
	}

	/**
	 * Caches the miic application stages in the entity cache if it is enabled.
	 *
	 * @param miicApplicationStages the miic application stages
	 */
	@Override
	public void cacheResult(MiicApplicationStages miicApplicationStages) {
		entityCache.putResult(
			MiicApplicationStagesImpl.class,
			miicApplicationStages.getPrimaryKey(), miicApplicationStages);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				miicApplicationStages.getUuid(),
				miicApplicationStages.getGroupId()
			},
			miicApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetMIIC_CAI,
			new Object[] {miicApplicationStages.getMiicApplicationId()},
			miicApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetMIIC_CaseIdStageName,
			new Object[] {
				miicApplicationStages.getCaseId(),
				miicApplicationStages.getStageName()
			},
			miicApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetMIIC_CaseIdStageStatus,
			new Object[] {
				miicApplicationStages.getCaseId(),
				miicApplicationStages.getStageName(),
				miicApplicationStages.getStageStatus()
			},
			miicApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetMIIC_CaseIdAndStatus,
			new Object[] {
				miicApplicationStages.getCaseId(),
				miicApplicationStages.getStageStatus()
			},
			miicApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetMIIC_By_CaseId,
			new Object[] {miicApplicationStages.getCaseId()},
			miicApplicationStages);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the miic application stageses in the entity cache if it is enabled.
	 *
	 * @param miicApplicationStageses the miic application stageses
	 */
	@Override
	public void cacheResult(
		List<MiicApplicationStages> miicApplicationStageses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (miicApplicationStageses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MiicApplicationStages miicApplicationStages :
				miicApplicationStageses) {

			if (entityCache.getResult(
					MiicApplicationStagesImpl.class,
					miicApplicationStages.getPrimaryKey()) == null) {

				cacheResult(miicApplicationStages);
			}
		}
	}

	/**
	 * Clears the cache for all miic application stageses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MiicApplicationStagesImpl.class);

		finderCache.clearCache(MiicApplicationStagesImpl.class);
	}

	/**
	 * Clears the cache for the miic application stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MiicApplicationStages miicApplicationStages) {
		entityCache.removeResult(
			MiicApplicationStagesImpl.class, miicApplicationStages);
	}

	@Override
	public void clearCache(
		List<MiicApplicationStages> miicApplicationStageses) {

		for (MiicApplicationStages miicApplicationStages :
				miicApplicationStageses) {

			entityCache.removeResult(
				MiicApplicationStagesImpl.class, miicApplicationStages);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MiicApplicationStagesImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MiicApplicationStagesImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MiicApplicationStagesModelImpl miicApplicationStagesModelImpl) {

		Object[] args = new Object[] {
			miicApplicationStagesModelImpl.getUuid(),
			miicApplicationStagesModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, miicApplicationStagesModelImpl);

		args = new Object[] {
			miicApplicationStagesModelImpl.getMiicApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetMIIC_CAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMIIC_CAI, args,
			miicApplicationStagesModelImpl);

		args = new Object[] {
			miicApplicationStagesModelImpl.getCaseId(),
			miicApplicationStagesModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetMIIC_CaseIdStageName, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMIIC_CaseIdStageName, args,
			miicApplicationStagesModelImpl);

		args = new Object[] {
			miicApplicationStagesModelImpl.getCaseId(),
			miicApplicationStagesModelImpl.getStageName(),
			miicApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetMIIC_CaseIdStageStatus, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMIIC_CaseIdStageStatus, args,
			miicApplicationStagesModelImpl);

		args = new Object[] {
			miicApplicationStagesModelImpl.getCaseId(),
			miicApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetMIIC_CaseIdAndStatus, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMIIC_CaseIdAndStatus, args,
			miicApplicationStagesModelImpl);

		args = new Object[] {miicApplicationStagesModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetMIIC_By_CaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMIIC_By_CaseId, args,
			miicApplicationStagesModelImpl);
	}

	/**
	 * Creates a new miic application stages with the primary key. Does not add the miic application stages to the database.
	 *
	 * @param miicApplicationStagesId the primary key for the new miic application stages
	 * @return the new miic application stages
	 */
	@Override
	public MiicApplicationStages create(long miicApplicationStagesId) {
		MiicApplicationStages miicApplicationStages =
			new MiicApplicationStagesImpl();

		miicApplicationStages.setNew(true);
		miicApplicationStages.setPrimaryKey(miicApplicationStagesId);

		String uuid = PortalUUIDUtil.generate();

		miicApplicationStages.setUuid(uuid);

		miicApplicationStages.setCompanyId(CompanyThreadLocal.getCompanyId());

		return miicApplicationStages;
	}

	/**
	 * Removes the miic application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miicApplicationStagesId the primary key of the miic application stages
	 * @return the miic application stages that was removed
	 * @throws NoSuchMiicApplicationStagesException if a miic application stages with the primary key could not be found
	 */
	@Override
	public MiicApplicationStages remove(long miicApplicationStagesId)
		throws NoSuchMiicApplicationStagesException {

		return remove((Serializable)miicApplicationStagesId);
	}

	/**
	 * Removes the miic application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the miic application stages
	 * @return the miic application stages that was removed
	 * @throws NoSuchMiicApplicationStagesException if a miic application stages with the primary key could not be found
	 */
	@Override
	public MiicApplicationStages remove(Serializable primaryKey)
		throws NoSuchMiicApplicationStagesException {

		Session session = null;

		try {
			session = openSession();

			MiicApplicationStages miicApplicationStages =
				(MiicApplicationStages)session.get(
					MiicApplicationStagesImpl.class, primaryKey);

			if (miicApplicationStages == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMiicApplicationStagesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(miicApplicationStages);
		}
		catch (NoSuchMiicApplicationStagesException noSuchEntityException) {
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
	protected MiicApplicationStages removeImpl(
		MiicApplicationStages miicApplicationStages) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(miicApplicationStages)) {
				miicApplicationStages = (MiicApplicationStages)session.get(
					MiicApplicationStagesImpl.class,
					miicApplicationStages.getPrimaryKeyObj());
			}

			if (miicApplicationStages != null) {
				session.delete(miicApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (miicApplicationStages != null) {
			clearCache(miicApplicationStages);
		}

		return miicApplicationStages;
	}

	@Override
	public MiicApplicationStages updateImpl(
		MiicApplicationStages miicApplicationStages) {

		boolean isNew = miicApplicationStages.isNew();

		if (!(miicApplicationStages instanceof
				MiicApplicationStagesModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(miicApplicationStages.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					miicApplicationStages);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in miicApplicationStages proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MiicApplicationStages implementation " +
					miicApplicationStages.getClass());
		}

		MiicApplicationStagesModelImpl miicApplicationStagesModelImpl =
			(MiicApplicationStagesModelImpl)miicApplicationStages;

		if (Validator.isNull(miicApplicationStages.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			miicApplicationStages.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (miicApplicationStages.getCreateDate() == null)) {
			if (serviceContext == null) {
				miicApplicationStages.setCreateDate(date);
			}
			else {
				miicApplicationStages.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!miicApplicationStagesModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				miicApplicationStages.setModifiedDate(date);
			}
			else {
				miicApplicationStages.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(miicApplicationStages);
			}
			else {
				miicApplicationStages = (MiicApplicationStages)session.merge(
					miicApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MiicApplicationStagesImpl.class, miicApplicationStagesModelImpl,
			false, true);

		cacheUniqueFindersCache(miicApplicationStagesModelImpl);

		if (isNew) {
			miicApplicationStages.setNew(false);
		}

		miicApplicationStages.resetOriginalValues();

		return miicApplicationStages;
	}

	/**
	 * Returns the miic application stages with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the miic application stages
	 * @return the miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a miic application stages with the primary key could not be found
	 */
	@Override
	public MiicApplicationStages findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMiicApplicationStagesException {

		MiicApplicationStages miicApplicationStages = fetchByPrimaryKey(
			primaryKey);

		if (miicApplicationStages == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMiicApplicationStagesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return miicApplicationStages;
	}

	/**
	 * Returns the miic application stages with the primary key or throws a <code>NoSuchMiicApplicationStagesException</code> if it could not be found.
	 *
	 * @param miicApplicationStagesId the primary key of the miic application stages
	 * @return the miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a miic application stages with the primary key could not be found
	 */
	@Override
	public MiicApplicationStages findByPrimaryKey(long miicApplicationStagesId)
		throws NoSuchMiicApplicationStagesException {

		return findByPrimaryKey((Serializable)miicApplicationStagesId);
	}

	/**
	 * Returns the miic application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miicApplicationStagesId the primary key of the miic application stages
	 * @return the miic application stages, or <code>null</code> if a miic application stages with the primary key could not be found
	 */
	@Override
	public MiicApplicationStages fetchByPrimaryKey(
		long miicApplicationStagesId) {

		return fetchByPrimaryKey((Serializable)miicApplicationStagesId);
	}

	/**
	 * Returns all the miic application stageses.
	 *
	 * @return the miic application stageses
	 */
	@Override
	public List<MiicApplicationStages> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the miic application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @return the range of miic application stageses
	 */
	@Override
	public List<MiicApplicationStages> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the miic application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of miic application stageses
	 */
	@Override
	public List<MiicApplicationStages> findAll(
		int start, int end,
		OrderByComparator<MiicApplicationStages> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the miic application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of miic application stageses
	 */
	@Override
	public List<MiicApplicationStages> findAll(
		int start, int end,
		OrderByComparator<MiicApplicationStages> orderByComparator,
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

		List<MiicApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<MiicApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MIICAPPLICATIONSTAGES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MIICAPPLICATIONSTAGES;

				sql = sql.concat(MiicApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MiicApplicationStages>)QueryUtil.list(
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
	 * Removes all the miic application stageses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MiicApplicationStages miicApplicationStages : findAll()) {
			remove(miicApplicationStages);
		}
	}

	/**
	 * Returns the number of miic application stageses.
	 *
	 * @return the number of miic application stageses
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
					_SQL_COUNT_MIICAPPLICATIONSTAGES);

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
		return "miicApplicationStagesId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MIICAPPLICATIONSTAGES;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MiicApplicationStagesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the miic application stages persistence.
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

		_finderPathFetchBygetMIIC_CAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMIIC_CAI",
			new String[] {Long.class.getName()},
			new String[] {"miicApplicationId"}, true);

		_finderPathCountBygetMIIC_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMIIC_CAI",
			new String[] {Long.class.getName()},
			new String[] {"miicApplicationId"}, false);

		_finderPathWithPaginationFindBygetMIIC_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMIIC_StageName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"stageName"}, true);

		_finderPathWithoutPaginationFindBygetMIIC_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetMIIC_StageName", new String[] {String.class.getName()},
			new String[] {"stageName"}, true);

		_finderPathCountBygetMIIC_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMIIC_StageName", new String[] {String.class.getName()},
			new String[] {"stageName"}, false);

		_finderPathFetchBygetMIIC_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMIIC_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, true);

		_finderPathCountBygetMIIC_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMIIC_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, false);

		_finderPathFetchBygetMIIC_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMIIC_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageName", "stageStatus"}, true);

		_finderPathCountBygetMIIC_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMIIC_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageName", "stageStatus"}, false);

		_finderPathFetchBygetMIIC_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMIIC_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, true);

		_finderPathCountBygetMIIC_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMIIC_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, false);

		_finderPathWithPaginationFindBygetMIIC_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMIIC_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetMIIC_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetMIIC_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetMIIC_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMIIC_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathFetchBygetMIIC_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMIIC_By_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetMIIC_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMIIC_By_CaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		MiicApplicationStagesUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MiicApplicationStagesUtil.setPersistence(null);

		entityCache.removeCache(MiicApplicationStagesImpl.class.getName());
	}

	@Override
	@Reference(
		target = MIIC_APPLICATION_STAGEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MIIC_APPLICATION_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MIIC_APPLICATION_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MIICAPPLICATIONSTAGES =
		"SELECT miicApplicationStages FROM MiicApplicationStages miicApplicationStages";

	private static final String _SQL_SELECT_MIICAPPLICATIONSTAGES_WHERE =
		"SELECT miicApplicationStages FROM MiicApplicationStages miicApplicationStages WHERE ";

	private static final String _SQL_COUNT_MIICAPPLICATIONSTAGES =
		"SELECT COUNT(miicApplicationStages) FROM MiicApplicationStages miicApplicationStages";

	private static final String _SQL_COUNT_MIICAPPLICATIONSTAGES_WHERE =
		"SELECT COUNT(miicApplicationStages) FROM MiicApplicationStages miicApplicationStages WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"miicApplicationStages.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MiicApplicationStages exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MiicApplicationStages exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MiicApplicationStagesPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}