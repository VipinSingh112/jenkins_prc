/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.jtb.application.stage.services.service.persistence.impl;

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
import com.liferay.portal.kernel.service.persistence.BasePersistence;
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

import com.nbp.jtb.application.stage.services.exception.NoSuchJtbApplicationStagesException;
import com.nbp.jtb.application.stage.services.model.JtbApplicationStages;
import com.nbp.jtb.application.stage.services.model.JtbApplicationStagesTable;
import com.nbp.jtb.application.stage.services.model.impl.JtbApplicationStagesImpl;
import com.nbp.jtb.application.stage.services.model.impl.JtbApplicationStagesModelImpl;
import com.nbp.jtb.application.stage.services.service.persistence.JtbApplicationStagesPersistence;
import com.nbp.jtb.application.stage.services.service.persistence.JtbApplicationStagesUtil;
import com.nbp.jtb.application.stage.services.service.persistence.impl.constants.JTB_APPLICATION_STAGEPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
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
 * The persistence implementation for the jtb application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = {JtbApplicationStagesPersistence.class, BasePersistence.class}
)
public class JtbApplicationStagesPersistenceImpl
	extends BasePersistenceImpl<JtbApplicationStages>
	implements JtbApplicationStagesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JtbApplicationStagesUtil</code> to access the jtb application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JtbApplicationStagesImpl.class.getName();

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
	 * Returns all the jtb application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jtb application stageses
	 */
	@Override
	public List<JtbApplicationStages> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jtb application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @return the range of matching jtb application stageses
	 */
	@Override
	public List<JtbApplicationStages> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jtb application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb application stageses
	 */
	@Override
	public List<JtbApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JtbApplicationStages> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jtb application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb application stageses
	 */
	@Override
	public List<JtbApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JtbApplicationStages> orderByComparator,
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

		List<JtbApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<JtbApplicationStages>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (JtbApplicationStages jtbApplicationStages : list) {
					if (!uuid.equals(jtbApplicationStages.getUuid())) {
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

			sb.append(_SQL_SELECT_JTBAPPLICATIONSTAGES_WHERE);

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
				sb.append(JtbApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<JtbApplicationStages>)QueryUtil.list(
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
	 * Returns the first jtb application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	@Override
	public JtbApplicationStages findByUuid_First(
			String uuid,
			OrderByComparator<JtbApplicationStages> orderByComparator)
		throws NoSuchJtbApplicationStagesException {

		JtbApplicationStages jtbApplicationStages = fetchByUuid_First(
			uuid, orderByComparator);

		if (jtbApplicationStages != null) {
			return jtbApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchJtbApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first jtb application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	@Override
	public JtbApplicationStages fetchByUuid_First(
		String uuid,
		OrderByComparator<JtbApplicationStages> orderByComparator) {

		List<JtbApplicationStages> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jtb application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	@Override
	public JtbApplicationStages findByUuid_Last(
			String uuid,
			OrderByComparator<JtbApplicationStages> orderByComparator)
		throws NoSuchJtbApplicationStagesException {

		JtbApplicationStages jtbApplicationStages = fetchByUuid_Last(
			uuid, orderByComparator);

		if (jtbApplicationStages != null) {
			return jtbApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchJtbApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last jtb application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	@Override
	public JtbApplicationStages fetchByUuid_Last(
		String uuid,
		OrderByComparator<JtbApplicationStages> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<JtbApplicationStages> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jtb application stageses before and after the current jtb application stages in the ordered set where uuid = &#63;.
	 *
	 * @param jtbApplicationStagesId the primary key of the current jtb application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a jtb application stages with the primary key could not be found
	 */
	@Override
	public JtbApplicationStages[] findByUuid_PrevAndNext(
			long jtbApplicationStagesId, String uuid,
			OrderByComparator<JtbApplicationStages> orderByComparator)
		throws NoSuchJtbApplicationStagesException {

		uuid = Objects.toString(uuid, "");

		JtbApplicationStages jtbApplicationStages = findByPrimaryKey(
			jtbApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			JtbApplicationStages[] array = new JtbApplicationStagesImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, jtbApplicationStages, uuid, orderByComparator, true);

			array[1] = jtbApplicationStages;

			array[2] = getByUuid_PrevAndNext(
				session, jtbApplicationStages, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected JtbApplicationStages getByUuid_PrevAndNext(
		Session session, JtbApplicationStages jtbApplicationStages, String uuid,
		OrderByComparator<JtbApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_JTBAPPLICATIONSTAGES_WHERE);

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
			sb.append(JtbApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						jtbApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JtbApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jtb application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (JtbApplicationStages jtbApplicationStages :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(jtbApplicationStages);
		}
	}

	/**
	 * Returns the number of jtb application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jtb application stageses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JTBAPPLICATIONSTAGES_WHERE);

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
		"jtbApplicationStages.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(jtbApplicationStages.uuid IS NULL OR jtbApplicationStages.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the jtb application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJtbApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	@Override
	public JtbApplicationStages findByUUID_G(String uuid, long groupId)
		throws NoSuchJtbApplicationStagesException {

		JtbApplicationStages jtbApplicationStages = fetchByUUID_G(
			uuid, groupId);

		if (jtbApplicationStages == null) {
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

			throw new NoSuchJtbApplicationStagesException(sb.toString());
		}

		return jtbApplicationStages;
	}

	/**
	 * Returns the jtb application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	@Override
	public JtbApplicationStages fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the jtb application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	@Override
	public JtbApplicationStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {uuid, groupId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByUUID_G, finderArgs,this);
		}

		if (result instanceof JtbApplicationStages) {
			JtbApplicationStages jtbApplicationStages =
				(JtbApplicationStages)result;

			if (!Objects.equals(uuid, jtbApplicationStages.getUuid()) ||
				(groupId != jtbApplicationStages.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_JTBAPPLICATIONSTAGES_WHERE);

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

				List<JtbApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					JtbApplicationStages jtbApplicationStages = list.get(0);

					result = jtbApplicationStages;

					cacheResult(jtbApplicationStages);
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
			return (JtbApplicationStages)result;
		}
	}

	/**
	 * Removes the jtb application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jtb application stages that was removed
	 */
	@Override
	public JtbApplicationStages removeByUUID_G(String uuid, long groupId)
		throws NoSuchJtbApplicationStagesException {

		JtbApplicationStages jtbApplicationStages = findByUUID_G(uuid, groupId);

		return remove(jtbApplicationStages);
	}

	/**
	 * Returns the number of jtb application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jtb application stageses
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JTBAPPLICATIONSTAGES_WHERE);

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
		"jtbApplicationStages.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(jtbApplicationStages.uuid IS NULL OR jtbApplicationStages.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"jtbApplicationStages.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the jtb application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jtb application stageses
	 */
	@Override
	public List<JtbApplicationStages> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jtb application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @return the range of matching jtb application stageses
	 */
	@Override
	public List<JtbApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jtb application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb application stageses
	 */
	@Override
	public List<JtbApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JtbApplicationStages> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jtb application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb application stageses
	 */
	@Override
	public List<JtbApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JtbApplicationStages> orderByComparator,
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

		List<JtbApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<JtbApplicationStages>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (JtbApplicationStages jtbApplicationStages : list) {
					if (!uuid.equals(jtbApplicationStages.getUuid()) ||
						(companyId != jtbApplicationStages.getCompanyId())) {

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

			sb.append(_SQL_SELECT_JTBAPPLICATIONSTAGES_WHERE);

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
				sb.append(JtbApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<JtbApplicationStages>)QueryUtil.list(
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
	 * Returns the first jtb application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	@Override
	public JtbApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<JtbApplicationStages> orderByComparator)
		throws NoSuchJtbApplicationStagesException {

		JtbApplicationStages jtbApplicationStages = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (jtbApplicationStages != null) {
			return jtbApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchJtbApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first jtb application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	@Override
	public JtbApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<JtbApplicationStages> orderByComparator) {

		List<JtbApplicationStages> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jtb application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	@Override
	public JtbApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<JtbApplicationStages> orderByComparator)
		throws NoSuchJtbApplicationStagesException {

		JtbApplicationStages jtbApplicationStages = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (jtbApplicationStages != null) {
			return jtbApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchJtbApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last jtb application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	@Override
	public JtbApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<JtbApplicationStages> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<JtbApplicationStages> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jtb application stageses before and after the current jtb application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jtbApplicationStagesId the primary key of the current jtb application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a jtb application stages with the primary key could not be found
	 */
	@Override
	public JtbApplicationStages[] findByUuid_C_PrevAndNext(
			long jtbApplicationStagesId, String uuid, long companyId,
			OrderByComparator<JtbApplicationStages> orderByComparator)
		throws NoSuchJtbApplicationStagesException {

		uuid = Objects.toString(uuid, "");

		JtbApplicationStages jtbApplicationStages = findByPrimaryKey(
			jtbApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			JtbApplicationStages[] array = new JtbApplicationStagesImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, jtbApplicationStages, uuid, companyId,
				orderByComparator, true);

			array[1] = jtbApplicationStages;

			array[2] = getByUuid_C_PrevAndNext(
				session, jtbApplicationStages, uuid, companyId,
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

	protected JtbApplicationStages getByUuid_C_PrevAndNext(
		Session session, JtbApplicationStages jtbApplicationStages, String uuid,
		long companyId,
		OrderByComparator<JtbApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_JTBAPPLICATIONSTAGES_WHERE);

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
			sb.append(JtbApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						jtbApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JtbApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jtb application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (JtbApplicationStages jtbApplicationStages :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(jtbApplicationStages);
		}
	}

	/**
	 * Returns the number of jtb application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jtb application stageses
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JTBAPPLICATIONSTAGES_WHERE);

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
		"jtbApplicationStages.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(jtbApplicationStages.uuid IS NULL OR jtbApplicationStages.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"jtbApplicationStages.companyId = ?";

	private FinderPath _finderPathFetchBygetJtb_By_AI;
	private FinderPath _finderPathCountBygetJtb_By_AI;

	/**
	 * Returns the jtb application stages where jtbApplicationId = &#63; or throws a <code>NoSuchJtbApplicationStagesException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	@Override
	public JtbApplicationStages findBygetJtb_By_AI(long jtbApplicationId)
		throws NoSuchJtbApplicationStagesException {

		JtbApplicationStages jtbApplicationStages = fetchBygetJtb_By_AI(
			jtbApplicationId);

		if (jtbApplicationStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jtbApplicationId=");
			sb.append(jtbApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJtbApplicationStagesException(sb.toString());
		}

		return jtbApplicationStages;
	}

	/**
	 * Returns the jtb application stages where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	@Override
	public JtbApplicationStages fetchBygetJtb_By_AI(long jtbApplicationId) {
		return fetchBygetJtb_By_AI(jtbApplicationId, true);
	}

	/**
	 * Returns the jtb application stages where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	@Override
	public JtbApplicationStages fetchBygetJtb_By_AI(
		long jtbApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {jtbApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJtb_By_AI, finderArgs,this);
		}

		if (result instanceof JtbApplicationStages) {
			JtbApplicationStages jtbApplicationStages =
				(JtbApplicationStages)result;

			if (jtbApplicationId !=
					jtbApplicationStages.getJtbApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JTBAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BY_AI_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				List<JtbApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJtb_By_AI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {jtbApplicationId};
							}

							_log.warn(
								"JtbApplicationStagesPersistenceImpl.fetchBygetJtb_By_AI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JtbApplicationStages jtbApplicationStages = list.get(0);

					result = jtbApplicationStages;

					cacheResult(jtbApplicationStages);
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
			return (JtbApplicationStages)result;
		}
	}

	/**
	 * Removes the jtb application stages where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the jtb application stages that was removed
	 */
	@Override
	public JtbApplicationStages removeBygetJtb_By_AI(long jtbApplicationId)
		throws NoSuchJtbApplicationStagesException {

		JtbApplicationStages jtbApplicationStages = findBygetJtb_By_AI(
			jtbApplicationId);

		return remove(jtbApplicationStages);
	}

	/**
	 * Returns the number of jtb application stageses where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb application stageses
	 */
	@Override
	public int countBygetJtb_By_AI(long jtbApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJtb_By_AI;

		Object[] finderArgs = new Object[] {jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JTBAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BY_AI_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

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

	private static final String _FINDER_COLUMN_GETJTB_BY_AI_JTBAPPLICATIONID_2 =
		"jtbApplicationStages.jtbApplicationId = ?";

	private FinderPath _finderPathFetchBygetJtb_By_CaseIdStageName;
	private FinderPath _finderPathCountBygetJtb_By_CaseIdStageName;

	/**
	 * Returns the jtb application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchJtbApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	@Override
	public JtbApplicationStages findBygetJtb_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchJtbApplicationStagesException {

		JtbApplicationStages jtbApplicationStages =
			fetchBygetJtb_By_CaseIdStageName(caseId, stageName);

		if (jtbApplicationStages == null) {
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

			throw new NoSuchJtbApplicationStagesException(sb.toString());
		}

		return jtbApplicationStages;
	}

	/**
	 * Returns the jtb application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	@Override
	public JtbApplicationStages fetchBygetJtb_By_CaseIdStageName(
		String caseId, String stageName) {

		return fetchBygetJtb_By_CaseIdStageName(caseId, stageName, true);
	}

	/**
	 * Returns the jtb application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	@Override
	public JtbApplicationStages fetchBygetJtb_By_CaseIdStageName(
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
				_finderPathFetchBygetJtb_By_CaseIdStageName, finderArgs,this);
		}

		if (result instanceof JtbApplicationStages) {
			JtbApplicationStages jtbApplicationStages =
				(JtbApplicationStages)result;

			if (!Objects.equals(caseId, jtbApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, jtbApplicationStages.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_JTBAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTB_BY_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJTB_BY_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTB_BY_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETJTB_BY_CASEIDSTAGENAME_STAGENAME_2);
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

				List<JtbApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJtb_By_CaseIdStageName,
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
								"JtbApplicationStagesPersistenceImpl.fetchBygetJtb_By_CaseIdStageName(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JtbApplicationStages jtbApplicationStages = list.get(0);

					result = jtbApplicationStages;

					cacheResult(jtbApplicationStages);
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
			return (JtbApplicationStages)result;
		}
	}

	/**
	 * Removes the jtb application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the jtb application stages that was removed
	 */
	@Override
	public JtbApplicationStages removeBygetJtb_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchJtbApplicationStagesException {

		JtbApplicationStages jtbApplicationStages =
			findBygetJtb_By_CaseIdStageName(caseId, stageName);

		return remove(jtbApplicationStages);
	}

	/**
	 * Returns the number of jtb application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching jtb application stageses
	 */
	@Override
	public int countBygetJtb_By_CaseIdStageName(
		String caseId, String stageName) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetJtb_By_CaseIdStageName;

		Object[] finderArgs = new Object[] {caseId, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JTBAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTB_BY_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJTB_BY_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTB_BY_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETJTB_BY_CASEIDSTAGENAME_STAGENAME_2);
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
		_FINDER_COLUMN_GETJTB_BY_CASEIDSTAGENAME_CASEID_2 =
			"jtbApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETJTB_BY_CASEIDSTAGENAME_CASEID_3 =
			"(jtbApplicationStages.caseId IS NULL OR jtbApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETJTB_BY_CASEIDSTAGENAME_STAGENAME_2 =
			"jtbApplicationStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETJTB_BY_CASEIDSTAGENAME_STAGENAME_3 =
			"(jtbApplicationStages.stageName IS NULL OR jtbApplicationStages.stageName = '')";

	private FinderPath _finderPathFetchBygetJtb_By_CI;
	private FinderPath _finderPathCountBygetJtb_By_CI;

	/**
	 * Returns the jtb application stages where caseId = &#63; or throws a <code>NoSuchJtbApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	@Override
	public JtbApplicationStages findBygetJtb_By_CI(String caseId)
		throws NoSuchJtbApplicationStagesException {

		JtbApplicationStages jtbApplicationStages = fetchBygetJtb_By_CI(caseId);

		if (jtbApplicationStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJtbApplicationStagesException(sb.toString());
		}

		return jtbApplicationStages;
	}

	/**
	 * Returns the jtb application stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	@Override
	public JtbApplicationStages fetchBygetJtb_By_CI(String caseId) {
		return fetchBygetJtb_By_CI(caseId, true);
	}

	/**
	 * Returns the jtb application stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	@Override
	public JtbApplicationStages fetchBygetJtb_By_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJtb_By_CI, finderArgs,this);
		}

		if (result instanceof JtbApplicationStages) {
			JtbApplicationStages jtbApplicationStages =
				(JtbApplicationStages)result;

			if (!Objects.equals(caseId, jtbApplicationStages.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JTBAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTB_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJTB_BY_CI_CASEID_2);
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

				List<JtbApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJtb_By_CI, finderArgs, list);
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
								"JtbApplicationStagesPersistenceImpl.fetchBygetJtb_By_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JtbApplicationStages jtbApplicationStages = list.get(0);

					result = jtbApplicationStages;

					cacheResult(jtbApplicationStages);
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
			return (JtbApplicationStages)result;
		}
	}

	/**
	 * Removes the jtb application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jtb application stages that was removed
	 */
	@Override
	public JtbApplicationStages removeBygetJtb_By_CI(String caseId)
		throws NoSuchJtbApplicationStagesException {

		JtbApplicationStages jtbApplicationStages = findBygetJtb_By_CI(caseId);

		return remove(jtbApplicationStages);
	}

	/**
	 * Returns the number of jtb application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jtb application stageses
	 */
	@Override
	public int countBygetJtb_By_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetJtb_By_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JTBAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTB_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJTB_BY_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETJTB_BY_CI_CASEID_2 =
		"jtbApplicationStages.caseId = ?";

	private static final String _FINDER_COLUMN_GETJTB_BY_CI_CASEID_3 =
		"(jtbApplicationStages.caseId IS NULL OR jtbApplicationStages.caseId = '')";

	private FinderPath _finderPathFetchBygetJtb_By_CaseIdStageStatus;
	private FinderPath _finderPathCountBygetJtb_By_CaseIdStageStatus;

	/**
	 * Returns the jtb application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchJtbApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	@Override
	public JtbApplicationStages findBygetJtb_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchJtbApplicationStagesException {

		JtbApplicationStages jtbApplicationStages =
			fetchBygetJtb_By_CaseIdStageStatus(caseId, stageStatus, stageName);

		if (jtbApplicationStages == null) {
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

			throw new NoSuchJtbApplicationStagesException(sb.toString());
		}

		return jtbApplicationStages;
	}

	/**
	 * Returns the jtb application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	@Override
	public JtbApplicationStages fetchBygetJtb_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		return fetchBygetJtb_By_CaseIdStageStatus(
			caseId, stageStatus, stageName, true);
	}

	/**
	 * Returns the jtb application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	@Override
	public JtbApplicationStages fetchBygetJtb_By_CaseIdStageStatus(
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
				_finderPathFetchBygetJtb_By_CaseIdStageStatus, finderArgs,this);
		}

		if (result instanceof JtbApplicationStages) {
			JtbApplicationStages jtbApplicationStages =
				(JtbApplicationStages)result;

			if (!Objects.equals(caseId, jtbApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageStatus, jtbApplicationStages.getStageStatus()) ||
				!Objects.equals(
					stageName, jtbApplicationStages.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_JTBAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTB_BY_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJTB_BY_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJTB_BY_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETJTB_BY_CASEIDSTAGESTATUS_STAGESTATUS_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJTB_BY_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETJTB_BY_CASEIDSTAGESTATUS_STAGENAME_2);
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

				List<JtbApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJtb_By_CaseIdStageStatus,
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
								"JtbApplicationStagesPersistenceImpl.fetchBygetJtb_By_CaseIdStageStatus(String, String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JtbApplicationStages jtbApplicationStages = list.get(0);

					result = jtbApplicationStages;

					cacheResult(jtbApplicationStages);
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
			return (JtbApplicationStages)result;
		}
	}

	/**
	 * Removes the jtb application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the jtb application stages that was removed
	 */
	@Override
	public JtbApplicationStages removeBygetJtb_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchJtbApplicationStagesException {

		JtbApplicationStages jtbApplicationStages =
			findBygetJtb_By_CaseIdStageStatus(caseId, stageStatus, stageName);

		return remove(jtbApplicationStages);
	}

	/**
	 * Returns the number of jtb application stageses where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching jtb application stageses
	 */
	@Override
	public int countBygetJtb_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetJtb_By_CaseIdStageStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_JTBAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTB_BY_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJTB_BY_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJTB_BY_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETJTB_BY_CASEIDSTAGESTATUS_STAGESTATUS_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJTB_BY_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETJTB_BY_CASEIDSTAGESTATUS_STAGENAME_2);
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
		_FINDER_COLUMN_GETJTB_BY_CASEIDSTAGESTATUS_CASEID_2 =
			"jtbApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETJTB_BY_CASEIDSTAGESTATUS_CASEID_3 =
			"(jtbApplicationStages.caseId IS NULL OR jtbApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETJTB_BY_CASEIDSTAGESTATUS_STAGESTATUS_2 =
			"jtbApplicationStages.stageStatus = ? AND ";

	private static final String
		_FINDER_COLUMN_GETJTB_BY_CASEIDSTAGESTATUS_STAGESTATUS_3 =
			"(jtbApplicationStages.stageStatus IS NULL OR jtbApplicationStages.stageStatus = '') AND ";

	private static final String
		_FINDER_COLUMN_GETJTB_BY_CASEIDSTAGESTATUS_STAGENAME_2 =
			"jtbApplicationStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETJTB_BY_CASEIDSTAGESTATUS_STAGENAME_3 =
			"(jtbApplicationStages.stageName IS NULL OR jtbApplicationStages.stageName = '')";

	private FinderPath _finderPathFetchBygetJtb_By_CaseIdAndStatus;
	private FinderPath _finderPathCountBygetJtb_By_CaseIdAndStatus;

	/**
	 * Returns the jtb application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchJtbApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	@Override
	public JtbApplicationStages findBygetJtb_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchJtbApplicationStagesException {

		JtbApplicationStages jtbApplicationStages =
			fetchBygetJtb_By_CaseIdAndStatus(caseId, stageStatus);

		if (jtbApplicationStages == null) {
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

			throw new NoSuchJtbApplicationStagesException(sb.toString());
		}

		return jtbApplicationStages;
	}

	/**
	 * Returns the jtb application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	@Override
	public JtbApplicationStages fetchBygetJtb_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return fetchBygetJtb_By_CaseIdAndStatus(caseId, stageStatus, true);
	}

	/**
	 * Returns the jtb application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	@Override
	public JtbApplicationStages fetchBygetJtb_By_CaseIdAndStatus(
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
				_finderPathFetchBygetJtb_By_CaseIdAndStatus, finderArgs,this);
		}

		if (result instanceof JtbApplicationStages) {
			JtbApplicationStages jtbApplicationStages =
				(JtbApplicationStages)result;

			if (!Objects.equals(caseId, jtbApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageStatus, jtbApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_JTBAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTB_BY_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJTB_BY_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJTB_BY_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETJTB_BY_CASEIDANDSTATUS_STAGESTATUS_2);
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

				List<JtbApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJtb_By_CaseIdAndStatus,
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
								"JtbApplicationStagesPersistenceImpl.fetchBygetJtb_By_CaseIdAndStatus(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JtbApplicationStages jtbApplicationStages = list.get(0);

					result = jtbApplicationStages;

					cacheResult(jtbApplicationStages);
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
			return (JtbApplicationStages)result;
		}
	}

	/**
	 * Removes the jtb application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the jtb application stages that was removed
	 */
	@Override
	public JtbApplicationStages removeBygetJtb_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchJtbApplicationStagesException {

		JtbApplicationStages jtbApplicationStages =
			findBygetJtb_By_CaseIdAndStatus(caseId, stageStatus);

		return remove(jtbApplicationStages);
	}

	/**
	 * Returns the number of jtb application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching jtb application stageses
	 */
	@Override
	public int countBygetJtb_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetJtb_By_CaseIdAndStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JTBAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTB_BY_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJTB_BY_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJTB_BY_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETJTB_BY_CASEIDANDSTATUS_STAGESTATUS_2);
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
		_FINDER_COLUMN_GETJTB_BY_CASEIDANDSTATUS_CASEID_2 =
			"jtbApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETJTB_BY_CASEIDANDSTATUS_CASEID_3 =
			"(jtbApplicationStages.caseId IS NULL OR jtbApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETJTB_BY_CASEIDANDSTATUS_STAGESTATUS_2 =
			"jtbApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETJTB_BY_CASEIDANDSTATUS_STAGESTATUS_3 =
			"(jtbApplicationStages.stageStatus IS NULL OR jtbApplicationStages.stageStatus = '')";

	private FinderPath _finderPathWithPaginationFindBygetJtb_By_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetJtb_By_CaseId;
	private FinderPath _finderPathCountBygetJtb_By_CaseId;

	/**
	 * Returns all the jtb application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb application stageses
	 */
	@Override
	public List<JtbApplicationStages> findBygetJtb_By_CaseId(String caseId) {
		return findBygetJtb_By_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jtb application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @return the range of matching jtb application stageses
	 */
	@Override
	public List<JtbApplicationStages> findBygetJtb_By_CaseId(
		String caseId, int start, int end) {

		return findBygetJtb_By_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jtb application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb application stageses
	 */
	@Override
	public List<JtbApplicationStages> findBygetJtb_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<JtbApplicationStages> orderByComparator) {

		return findBygetJtb_By_CaseId(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jtb application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb application stageses
	 */
	@Override
	public List<JtbApplicationStages> findBygetJtb_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<JtbApplicationStages> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetJtb_By_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJtb_By_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<JtbApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<JtbApplicationStages>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (JtbApplicationStages jtbApplicationStages : list) {
					if (!caseId.equals(jtbApplicationStages.getCaseId())) {
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

			sb.append(_SQL_SELECT_JTBAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTB_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJTB_BY_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JtbApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<JtbApplicationStages>)QueryUtil.list(
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
	 * Returns the first jtb application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	@Override
	public JtbApplicationStages findBygetJtb_By_CaseId_First(
			String caseId,
			OrderByComparator<JtbApplicationStages> orderByComparator)
		throws NoSuchJtbApplicationStagesException {

		JtbApplicationStages jtbApplicationStages =
			fetchBygetJtb_By_CaseId_First(caseId, orderByComparator);

		if (jtbApplicationStages != null) {
			return jtbApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchJtbApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first jtb application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	@Override
	public JtbApplicationStages fetchBygetJtb_By_CaseId_First(
		String caseId,
		OrderByComparator<JtbApplicationStages> orderByComparator) {

		List<JtbApplicationStages> list = findBygetJtb_By_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jtb application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	@Override
	public JtbApplicationStages findBygetJtb_By_CaseId_Last(
			String caseId,
			OrderByComparator<JtbApplicationStages> orderByComparator)
		throws NoSuchJtbApplicationStagesException {

		JtbApplicationStages jtbApplicationStages =
			fetchBygetJtb_By_CaseId_Last(caseId, orderByComparator);

		if (jtbApplicationStages != null) {
			return jtbApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchJtbApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last jtb application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	@Override
	public JtbApplicationStages fetchBygetJtb_By_CaseId_Last(
		String caseId,
		OrderByComparator<JtbApplicationStages> orderByComparator) {

		int count = countBygetJtb_By_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<JtbApplicationStages> list = findBygetJtb_By_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jtb application stageses before and after the current jtb application stages in the ordered set where caseId = &#63;.
	 *
	 * @param jtbApplicationStagesId the primary key of the current jtb application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a jtb application stages with the primary key could not be found
	 */
	@Override
	public JtbApplicationStages[] findBygetJtb_By_CaseId_PrevAndNext(
			long jtbApplicationStagesId, String caseId,
			OrderByComparator<JtbApplicationStages> orderByComparator)
		throws NoSuchJtbApplicationStagesException {

		caseId = Objects.toString(caseId, "");

		JtbApplicationStages jtbApplicationStages = findByPrimaryKey(
			jtbApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			JtbApplicationStages[] array = new JtbApplicationStagesImpl[3];

			array[0] = getBygetJtb_By_CaseId_PrevAndNext(
				session, jtbApplicationStages, caseId, orderByComparator, true);

			array[1] = jtbApplicationStages;

			array[2] = getBygetJtb_By_CaseId_PrevAndNext(
				session, jtbApplicationStages, caseId, orderByComparator,
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

	protected JtbApplicationStages getBygetJtb_By_CaseId_PrevAndNext(
		Session session, JtbApplicationStages jtbApplicationStages,
		String caseId,
		OrderByComparator<JtbApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_JTBAPPLICATIONSTAGES_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETJTB_BY_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETJTB_BY_CASEID_CASEID_2);
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
			sb.append(JtbApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						jtbApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JtbApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jtb application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetJtb_By_CaseId(String caseId) {
		for (JtbApplicationStages jtbApplicationStages :
				findBygetJtb_By_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(jtbApplicationStages);
		}
	}

	/**
	 * Returns the number of jtb application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jtb application stageses
	 */
	@Override
	public int countBygetJtb_By_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetJtb_By_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JTBAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTB_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJTB_BY_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETJTB_BY_CASEID_CASEID_2 =
		"jtbApplicationStages.caseId = ?";

	private static final String _FINDER_COLUMN_GETJTB_BY_CASEID_CASEID_3 =
		"(jtbApplicationStages.caseId IS NULL OR jtbApplicationStages.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetJtb_By_StageName;
	private FinderPath _finderPathWithoutPaginationFindBygetJtb_By_StageName;
	private FinderPath _finderPathCountBygetJtb_By_StageName;

	/**
	 * Returns all the jtb application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching jtb application stageses
	 */
	@Override
	public List<JtbApplicationStages> findBygetJtb_By_StageName(
		String stageName) {

		return findBygetJtb_By_StageName(
			stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jtb application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @return the range of matching jtb application stageses
	 */
	@Override
	public List<JtbApplicationStages> findBygetJtb_By_StageName(
		String stageName, int start, int end) {

		return findBygetJtb_By_StageName(stageName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jtb application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb application stageses
	 */
	@Override
	public List<JtbApplicationStages> findBygetJtb_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<JtbApplicationStages> orderByComparator) {

		return findBygetJtb_By_StageName(
			stageName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jtb application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb application stageses
	 */
	@Override
	public List<JtbApplicationStages> findBygetJtb_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<JtbApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetJtb_By_StageName;
				finderArgs = new Object[] {stageName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJtb_By_StageName;
			finderArgs = new Object[] {
				stageName, start, end, orderByComparator
			};
		}

		List<JtbApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<JtbApplicationStages>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (JtbApplicationStages jtbApplicationStages : list) {
					if (!stageName.equals(
							jtbApplicationStages.getStageName())) {

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

			sb.append(_SQL_SELECT_JTBAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTB_BY_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETJTB_BY_STAGENAME_STAGENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JtbApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<JtbApplicationStages>)QueryUtil.list(
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
	 * Returns the first jtb application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	@Override
	public JtbApplicationStages findBygetJtb_By_StageName_First(
			String stageName,
			OrderByComparator<JtbApplicationStages> orderByComparator)
		throws NoSuchJtbApplicationStagesException {

		JtbApplicationStages jtbApplicationStages =
			fetchBygetJtb_By_StageName_First(stageName, orderByComparator);

		if (jtbApplicationStages != null) {
			return jtbApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchJtbApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first jtb application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	@Override
	public JtbApplicationStages fetchBygetJtb_By_StageName_First(
		String stageName,
		OrderByComparator<JtbApplicationStages> orderByComparator) {

		List<JtbApplicationStages> list = findBygetJtb_By_StageName(
			stageName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jtb application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	@Override
	public JtbApplicationStages findBygetJtb_By_StageName_Last(
			String stageName,
			OrderByComparator<JtbApplicationStages> orderByComparator)
		throws NoSuchJtbApplicationStagesException {

		JtbApplicationStages jtbApplicationStages =
			fetchBygetJtb_By_StageName_Last(stageName, orderByComparator);

		if (jtbApplicationStages != null) {
			return jtbApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchJtbApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last jtb application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	@Override
	public JtbApplicationStages fetchBygetJtb_By_StageName_Last(
		String stageName,
		OrderByComparator<JtbApplicationStages> orderByComparator) {

		int count = countBygetJtb_By_StageName(stageName);

		if (count == 0) {
			return null;
		}

		List<JtbApplicationStages> list = findBygetJtb_By_StageName(
			stageName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jtb application stageses before and after the current jtb application stages in the ordered set where stageName = &#63;.
	 *
	 * @param jtbApplicationStagesId the primary key of the current jtb application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a jtb application stages with the primary key could not be found
	 */
	@Override
	public JtbApplicationStages[] findBygetJtb_By_StageName_PrevAndNext(
			long jtbApplicationStagesId, String stageName,
			OrderByComparator<JtbApplicationStages> orderByComparator)
		throws NoSuchJtbApplicationStagesException {

		stageName = Objects.toString(stageName, "");

		JtbApplicationStages jtbApplicationStages = findByPrimaryKey(
			jtbApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			JtbApplicationStages[] array = new JtbApplicationStagesImpl[3];

			array[0] = getBygetJtb_By_StageName_PrevAndNext(
				session, jtbApplicationStages, stageName, orderByComparator,
				true);

			array[1] = jtbApplicationStages;

			array[2] = getBygetJtb_By_StageName_PrevAndNext(
				session, jtbApplicationStages, stageName, orderByComparator,
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

	protected JtbApplicationStages getBygetJtb_By_StageName_PrevAndNext(
		Session session, JtbApplicationStages jtbApplicationStages,
		String stageName,
		OrderByComparator<JtbApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_JTBAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETJTB_BY_STAGENAME_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETJTB_BY_STAGENAME_STAGENAME_2);
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
			sb.append(JtbApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						jtbApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JtbApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jtb application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	@Override
	public void removeBygetJtb_By_StageName(String stageName) {
		for (JtbApplicationStages jtbApplicationStages :
				findBygetJtb_By_StageName(
					stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(jtbApplicationStages);
		}
	}

	/**
	 * Returns the number of jtb application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching jtb application stageses
	 */
	@Override
	public int countBygetJtb_By_StageName(String stageName) {
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetJtb_By_StageName;

		Object[] finderArgs = new Object[] {stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JTBAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTB_BY_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETJTB_BY_STAGENAME_STAGENAME_2);
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

	private static final String _FINDER_COLUMN_GETJTB_BY_STAGENAME_STAGENAME_2 =
		"jtbApplicationStages.stageName = ?";

	private static final String _FINDER_COLUMN_GETJTB_BY_STAGENAME_STAGENAME_3 =
		"(jtbApplicationStages.stageName IS NULL OR jtbApplicationStages.stageName = '')";

	public JtbApplicationStagesPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(JtbApplicationStages.class);

		setModelImplClass(JtbApplicationStagesImpl.class);
		setModelPKClass(long.class);

		setTable(JtbApplicationStagesTable.INSTANCE);
	}

	/**
	 * Caches the jtb application stages in the entity cache if it is enabled.
	 *
	 * @param jtbApplicationStages the jtb application stages
	 */
	@Override
	public void cacheResult(JtbApplicationStages jtbApplicationStages) {
		entityCache.putResult(
			JtbApplicationStagesImpl.class,
			jtbApplicationStages.getPrimaryKey(), jtbApplicationStages);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				jtbApplicationStages.getUuid(),
				jtbApplicationStages.getGroupId()
			},
			jtbApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetJtb_By_AI,
			new Object[] {jtbApplicationStages.getJtbApplicationId()},
			jtbApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetJtb_By_CaseIdStageName,
			new Object[] {
				jtbApplicationStages.getCaseId(),
				jtbApplicationStages.getStageName()
			},
			jtbApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetJtb_By_CI,
			new Object[] {jtbApplicationStages.getCaseId()},
			jtbApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetJtb_By_CaseIdStageStatus,
			new Object[] {
				jtbApplicationStages.getCaseId(),
				jtbApplicationStages.getStageStatus(),
				jtbApplicationStages.getStageName()
			},
			jtbApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetJtb_By_CaseIdAndStatus,
			new Object[] {
				jtbApplicationStages.getCaseId(),
				jtbApplicationStages.getStageStatus()
			},
			jtbApplicationStages);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the jtb application stageses in the entity cache if it is enabled.
	 *
	 * @param jtbApplicationStageses the jtb application stageses
	 */
	@Override
	public void cacheResult(List<JtbApplicationStages> jtbApplicationStageses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (jtbApplicationStageses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JtbApplicationStages jtbApplicationStages :
				jtbApplicationStageses) {

			if (entityCache.getResult(
					JtbApplicationStagesImpl.class,
					jtbApplicationStages.getPrimaryKey()) == null) {

				cacheResult(jtbApplicationStages);
			}
		}
	}

	/**
	 * Clears the cache for all jtb application stageses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JtbApplicationStagesImpl.class);

		finderCache.clearCache(JtbApplicationStagesImpl.class);
	}

	/**
	 * Clears the cache for the jtb application stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JtbApplicationStages jtbApplicationStages) {
		entityCache.removeResult(
			JtbApplicationStagesImpl.class, jtbApplicationStages);
	}

	@Override
	public void clearCache(List<JtbApplicationStages> jtbApplicationStageses) {
		for (JtbApplicationStages jtbApplicationStages :
				jtbApplicationStageses) {

			entityCache.removeResult(
				JtbApplicationStagesImpl.class, jtbApplicationStages);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JtbApplicationStagesImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				JtbApplicationStagesImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		JtbApplicationStagesModelImpl jtbApplicationStagesModelImpl) {

		Object[] args = new Object[] {
			jtbApplicationStagesModelImpl.getUuid(),
			jtbApplicationStagesModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, jtbApplicationStagesModelImpl);

		args = new Object[] {
			jtbApplicationStagesModelImpl.getJtbApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetJtb_By_AI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJtb_By_AI, args,
			jtbApplicationStagesModelImpl);

		args = new Object[] {
			jtbApplicationStagesModelImpl.getCaseId(),
			jtbApplicationStagesModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetJtb_By_CaseIdStageName, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJtb_By_CaseIdStageName, args,
			jtbApplicationStagesModelImpl);

		args = new Object[] {jtbApplicationStagesModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetJtb_By_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJtb_By_CI, args,
			jtbApplicationStagesModelImpl);

		args = new Object[] {
			jtbApplicationStagesModelImpl.getCaseId(),
			jtbApplicationStagesModelImpl.getStageStatus(),
			jtbApplicationStagesModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetJtb_By_CaseIdStageStatus, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJtb_By_CaseIdStageStatus, args,
			jtbApplicationStagesModelImpl);

		args = new Object[] {
			jtbApplicationStagesModelImpl.getCaseId(),
			jtbApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetJtb_By_CaseIdAndStatus, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJtb_By_CaseIdAndStatus, args,
			jtbApplicationStagesModelImpl);
	}

	/**
	 * Creates a new jtb application stages with the primary key. Does not add the jtb application stages to the database.
	 *
	 * @param jtbApplicationStagesId the primary key for the new jtb application stages
	 * @return the new jtb application stages
	 */
	@Override
	public JtbApplicationStages create(long jtbApplicationStagesId) {
		JtbApplicationStages jtbApplicationStages =
			new JtbApplicationStagesImpl();

		jtbApplicationStages.setNew(true);
		jtbApplicationStages.setPrimaryKey(jtbApplicationStagesId);

		String uuid = PortalUUIDUtil.generate();

		jtbApplicationStages.setUuid(uuid);

		jtbApplicationStages.setCompanyId(CompanyThreadLocal.getCompanyId());

		return jtbApplicationStages;
	}

	/**
	 * Removes the jtb application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jtbApplicationStagesId the primary key of the jtb application stages
	 * @return the jtb application stages that was removed
	 * @throws NoSuchJtbApplicationStagesException if a jtb application stages with the primary key could not be found
	 */
	@Override
	public JtbApplicationStages remove(long jtbApplicationStagesId)
		throws NoSuchJtbApplicationStagesException {

		return remove((Serializable)jtbApplicationStagesId);
	}

	/**
	 * Removes the jtb application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jtb application stages
	 * @return the jtb application stages that was removed
	 * @throws NoSuchJtbApplicationStagesException if a jtb application stages with the primary key could not be found
	 */
	@Override
	public JtbApplicationStages remove(Serializable primaryKey)
		throws NoSuchJtbApplicationStagesException {

		Session session = null;

		try {
			session = openSession();

			JtbApplicationStages jtbApplicationStages =
				(JtbApplicationStages)session.get(
					JtbApplicationStagesImpl.class, primaryKey);

			if (jtbApplicationStages == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJtbApplicationStagesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(jtbApplicationStages);
		}
		catch (NoSuchJtbApplicationStagesException noSuchEntityException) {
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
	protected JtbApplicationStages removeImpl(
		JtbApplicationStages jtbApplicationStages) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jtbApplicationStages)) {
				jtbApplicationStages = (JtbApplicationStages)session.get(
					JtbApplicationStagesImpl.class,
					jtbApplicationStages.getPrimaryKeyObj());
			}

			if (jtbApplicationStages != null) {
				session.delete(jtbApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (jtbApplicationStages != null) {
			clearCache(jtbApplicationStages);
		}

		return jtbApplicationStages;
	}

	@Override
	public JtbApplicationStages updateImpl(
		JtbApplicationStages jtbApplicationStages) {

		boolean isNew = jtbApplicationStages.isNew();

		if (!(jtbApplicationStages instanceof JtbApplicationStagesModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(jtbApplicationStages.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					jtbApplicationStages);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in jtbApplicationStages proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JtbApplicationStages implementation " +
					jtbApplicationStages.getClass());
		}

		JtbApplicationStagesModelImpl jtbApplicationStagesModelImpl =
			(JtbApplicationStagesModelImpl)jtbApplicationStages;

		if (Validator.isNull(jtbApplicationStages.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			jtbApplicationStages.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (jtbApplicationStages.getCreateDate() == null)) {
			if (serviceContext == null) {
				jtbApplicationStages.setCreateDate(date);
			}
			else {
				jtbApplicationStages.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!jtbApplicationStagesModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				jtbApplicationStages.setModifiedDate(date);
			}
			else {
				jtbApplicationStages.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(jtbApplicationStages);
			}
			else {
				jtbApplicationStages = (JtbApplicationStages)session.merge(
					jtbApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JtbApplicationStagesImpl.class, jtbApplicationStagesModelImpl,
			false, true);

		cacheUniqueFindersCache(jtbApplicationStagesModelImpl);

		if (isNew) {
			jtbApplicationStages.setNew(false);
		}

		jtbApplicationStages.resetOriginalValues();

		return jtbApplicationStages;
	}

	/**
	 * Returns the jtb application stages with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jtb application stages
	 * @return the jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a jtb application stages with the primary key could not be found
	 */
	@Override
	public JtbApplicationStages findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJtbApplicationStagesException {

		JtbApplicationStages jtbApplicationStages = fetchByPrimaryKey(
			primaryKey);

		if (jtbApplicationStages == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJtbApplicationStagesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return jtbApplicationStages;
	}

	/**
	 * Returns the jtb application stages with the primary key or throws a <code>NoSuchJtbApplicationStagesException</code> if it could not be found.
	 *
	 * @param jtbApplicationStagesId the primary key of the jtb application stages
	 * @return the jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a jtb application stages with the primary key could not be found
	 */
	@Override
	public JtbApplicationStages findByPrimaryKey(long jtbApplicationStagesId)
		throws NoSuchJtbApplicationStagesException {

		return findByPrimaryKey((Serializable)jtbApplicationStagesId);
	}

	/**
	 * Returns the jtb application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jtbApplicationStagesId the primary key of the jtb application stages
	 * @return the jtb application stages, or <code>null</code> if a jtb application stages with the primary key could not be found
	 */
	@Override
	public JtbApplicationStages fetchByPrimaryKey(long jtbApplicationStagesId) {
		return fetchByPrimaryKey((Serializable)jtbApplicationStagesId);
	}

	/**
	 * Returns all the jtb application stageses.
	 *
	 * @return the jtb application stageses
	 */
	@Override
	public List<JtbApplicationStages> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jtb application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @return the range of jtb application stageses
	 */
	@Override
	public List<JtbApplicationStages> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the jtb application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb application stageses
	 */
	@Override
	public List<JtbApplicationStages> findAll(
		int start, int end,
		OrderByComparator<JtbApplicationStages> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jtb application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb application stageses
	 */
	@Override
	public List<JtbApplicationStages> findAll(
		int start, int end,
		OrderByComparator<JtbApplicationStages> orderByComparator,
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

		List<JtbApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<JtbApplicationStages>)finderCache.getResult(
				finderPath, finderArgs,this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JTBAPPLICATIONSTAGES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JTBAPPLICATIONSTAGES;

				sql = sql.concat(JtbApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JtbApplicationStages>)QueryUtil.list(
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
	 * Removes all the jtb application stageses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JtbApplicationStages jtbApplicationStages : findAll()) {
			remove(jtbApplicationStages);
		}
	}

	/**
	 * Returns the number of jtb application stageses.
	 *
	 * @return the number of jtb application stageses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY,this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_JTBAPPLICATIONSTAGES);

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
		return "jtbApplicationStagesId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JTBAPPLICATIONSTAGES;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JtbApplicationStagesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the jtb application stages persistence.
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

		_finderPathFetchBygetJtb_By_AI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJtb_By_AI",
			new String[] {Long.class.getName()},
			new String[] {"jtbApplicationId"}, true);

		_finderPathCountBygetJtb_By_AI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJtb_By_AI",
			new String[] {Long.class.getName()},
			new String[] {"jtbApplicationId"}, false);

		_finderPathFetchBygetJtb_By_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJtb_By_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, true);

		_finderPathCountBygetJtb_By_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJtb_By_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, false);

		_finderPathFetchBygetJtb_By_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJtb_By_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetJtb_By_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJtb_By_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathFetchBygetJtb_By_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJtb_By_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageStatus", "stageName"}, true);

		_finderPathCountBygetJtb_By_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJtb_By_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageStatus", "stageName"}, false);

		_finderPathFetchBygetJtb_By_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJtb_By_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, true);

		_finderPathCountBygetJtb_By_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJtb_By_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, false);

		_finderPathWithPaginationFindBygetJtb_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJtb_By_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetJtb_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetJtb_By_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetJtb_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJtb_By_CaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		_finderPathWithPaginationFindBygetJtb_By_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJtb_By_StageName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"stageName"}, true);

		_finderPathWithoutPaginationFindBygetJtb_By_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetJtb_By_StageName", new String[] {String.class.getName()},
			new String[] {"stageName"}, true);

		_finderPathCountBygetJtb_By_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJtb_By_StageName", new String[] {String.class.getName()},
			new String[] {"stageName"}, false);

		_setJtbApplicationStagesUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setJtbApplicationStagesUtilPersistence(null);

		entityCache.removeCache(JtbApplicationStagesImpl.class.getName());
	}

	private void _setJtbApplicationStagesUtilPersistence(
		JtbApplicationStagesPersistence jtbApplicationStagesPersistence) {

		try {
			Field field = JtbApplicationStagesUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, jtbApplicationStagesPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_STAGEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_JTBAPPLICATIONSTAGES =
		"SELECT jtbApplicationStages FROM JtbApplicationStages jtbApplicationStages";

	private static final String _SQL_SELECT_JTBAPPLICATIONSTAGES_WHERE =
		"SELECT jtbApplicationStages FROM JtbApplicationStages jtbApplicationStages WHERE ";

	private static final String _SQL_COUNT_JTBAPPLICATIONSTAGES =
		"SELECT COUNT(jtbApplicationStages) FROM JtbApplicationStages jtbApplicationStages";

	private static final String _SQL_COUNT_JTBAPPLICATIONSTAGES_WHERE =
		"SELECT COUNT(jtbApplicationStages) FROM JtbApplicationStages jtbApplicationStages WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"jtbApplicationStages.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JtbApplicationStages exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JtbApplicationStages exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JtbApplicationStagesPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private JtbApplicationStagesModelArgumentsResolver
		_jtbApplicationStagesModelArgumentsResolver;

}