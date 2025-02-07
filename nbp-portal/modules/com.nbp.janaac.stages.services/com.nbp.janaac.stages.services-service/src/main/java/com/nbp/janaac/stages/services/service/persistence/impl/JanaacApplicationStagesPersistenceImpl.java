/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.service.persistence.impl;

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

import com.nbp.janaac.stages.services.exception.NoSuchJanaacApplicationStagesException;
import com.nbp.janaac.stages.services.model.JanaacApplicationStages;
import com.nbp.janaac.stages.services.model.JanaacApplicationStagesTable;
import com.nbp.janaac.stages.services.model.impl.JanaacApplicationStagesImpl;
import com.nbp.janaac.stages.services.model.impl.JanaacApplicationStagesModelImpl;
import com.nbp.janaac.stages.services.service.persistence.JanaacApplicationStagesPersistence;
import com.nbp.janaac.stages.services.service.persistence.JanaacApplicationStagesUtil;
import com.nbp.janaac.stages.services.service.persistence.impl.constants.JANAAC_STAGESPersistenceConstants;

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
 * The persistence implementation for the janaac application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = JanaacApplicationStagesPersistence.class)
public class JanaacApplicationStagesPersistenceImpl
	extends BasePersistenceImpl<JanaacApplicationStages>
	implements JanaacApplicationStagesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JanaacApplicationStagesUtil</code> to access the janaac application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JanaacApplicationStagesImpl.class.getName();

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
	 * Returns all the janaac application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching janaac application stageses
	 */
	@Override
	public List<JanaacApplicationStages> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the janaac application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @return the range of matching janaac application stageses
	 */
	@Override
	public List<JanaacApplicationStages> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the janaac application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac application stageses
	 */
	@Override
	public List<JanaacApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JanaacApplicationStages> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the janaac application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac application stageses
	 */
	@Override
	public List<JanaacApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JanaacApplicationStages> orderByComparator,
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

		List<JanaacApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<JanaacApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JanaacApplicationStages janaacApplicationStages : list) {
					if (!uuid.equals(janaacApplicationStages.getUuid())) {
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

			sb.append(_SQL_SELECT_JANAACAPPLICATIONSTAGES_WHERE);

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
				sb.append(JanaacApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<JanaacApplicationStages>)QueryUtil.list(
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
	 * Returns the first janaac application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	@Override
	public JanaacApplicationStages findByUuid_First(
			String uuid,
			OrderByComparator<JanaacApplicationStages> orderByComparator)
		throws NoSuchJanaacApplicationStagesException {

		JanaacApplicationStages janaacApplicationStages = fetchByUuid_First(
			uuid, orderByComparator);

		if (janaacApplicationStages != null) {
			return janaacApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchJanaacApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first janaac application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	@Override
	public JanaacApplicationStages fetchByUuid_First(
		String uuid,
		OrderByComparator<JanaacApplicationStages> orderByComparator) {

		List<JanaacApplicationStages> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last janaac application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	@Override
	public JanaacApplicationStages findByUuid_Last(
			String uuid,
			OrderByComparator<JanaacApplicationStages> orderByComparator)
		throws NoSuchJanaacApplicationStagesException {

		JanaacApplicationStages janaacApplicationStages = fetchByUuid_Last(
			uuid, orderByComparator);

		if (janaacApplicationStages != null) {
			return janaacApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchJanaacApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last janaac application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	@Override
	public JanaacApplicationStages fetchByUuid_Last(
		String uuid,
		OrderByComparator<JanaacApplicationStages> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<JanaacApplicationStages> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the janaac application stageses before and after the current janaac application stages in the ordered set where uuid = &#63;.
	 *
	 * @param janaacApplicationStagesId the primary key of the current janaac application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a janaac application stages with the primary key could not be found
	 */
	@Override
	public JanaacApplicationStages[] findByUuid_PrevAndNext(
			long janaacApplicationStagesId, String uuid,
			OrderByComparator<JanaacApplicationStages> orderByComparator)
		throws NoSuchJanaacApplicationStagesException {

		uuid = Objects.toString(uuid, "");

		JanaacApplicationStages janaacApplicationStages = findByPrimaryKey(
			janaacApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			JanaacApplicationStages[] array =
				new JanaacApplicationStagesImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, janaacApplicationStages, uuid, orderByComparator,
				true);

			array[1] = janaacApplicationStages;

			array[2] = getByUuid_PrevAndNext(
				session, janaacApplicationStages, uuid, orderByComparator,
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

	protected JanaacApplicationStages getByUuid_PrevAndNext(
		Session session, JanaacApplicationStages janaacApplicationStages,
		String uuid,
		OrderByComparator<JanaacApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_JANAACAPPLICATIONSTAGES_WHERE);

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
			sb.append(JanaacApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						janaacApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JanaacApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the janaac application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (JanaacApplicationStages janaacApplicationStages :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(janaacApplicationStages);
		}
	}

	/**
	 * Returns the number of janaac application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching janaac application stageses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JANAACAPPLICATIONSTAGES_WHERE);

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
		"janaacApplicationStages.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(janaacApplicationStages.uuid IS NULL OR janaacApplicationStages.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the janaac application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJanaacApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	@Override
	public JanaacApplicationStages findByUUID_G(String uuid, long groupId)
		throws NoSuchJanaacApplicationStagesException {

		JanaacApplicationStages janaacApplicationStages = fetchByUUID_G(
			uuid, groupId);

		if (janaacApplicationStages == null) {
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

			throw new NoSuchJanaacApplicationStagesException(sb.toString());
		}

		return janaacApplicationStages;
	}

	/**
	 * Returns the janaac application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	@Override
	public JanaacApplicationStages fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the janaac application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	@Override
	public JanaacApplicationStages fetchByUUID_G(
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

		if (result instanceof JanaacApplicationStages) {
			JanaacApplicationStages janaacApplicationStages =
				(JanaacApplicationStages)result;

			if (!Objects.equals(uuid, janaacApplicationStages.getUuid()) ||
				(groupId != janaacApplicationStages.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_JANAACAPPLICATIONSTAGES_WHERE);

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

				List<JanaacApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					JanaacApplicationStages janaacApplicationStages = list.get(
						0);

					result = janaacApplicationStages;

					cacheResult(janaacApplicationStages);
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
			return (JanaacApplicationStages)result;
		}
	}

	/**
	 * Removes the janaac application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the janaac application stages that was removed
	 */
	@Override
	public JanaacApplicationStages removeByUUID_G(String uuid, long groupId)
		throws NoSuchJanaacApplicationStagesException {

		JanaacApplicationStages janaacApplicationStages = findByUUID_G(
			uuid, groupId);

		return remove(janaacApplicationStages);
	}

	/**
	 * Returns the number of janaac application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching janaac application stageses
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JANAACAPPLICATIONSTAGES_WHERE);

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
		"janaacApplicationStages.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(janaacApplicationStages.uuid IS NULL OR janaacApplicationStages.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"janaacApplicationStages.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the janaac application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching janaac application stageses
	 */
	@Override
	public List<JanaacApplicationStages> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the janaac application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @return the range of matching janaac application stageses
	 */
	@Override
	public List<JanaacApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the janaac application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac application stageses
	 */
	@Override
	public List<JanaacApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JanaacApplicationStages> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the janaac application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac application stageses
	 */
	@Override
	public List<JanaacApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JanaacApplicationStages> orderByComparator,
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

		List<JanaacApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<JanaacApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JanaacApplicationStages janaacApplicationStages : list) {
					if (!uuid.equals(janaacApplicationStages.getUuid()) ||
						(companyId != janaacApplicationStages.getCompanyId())) {

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

			sb.append(_SQL_SELECT_JANAACAPPLICATIONSTAGES_WHERE);

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
				sb.append(JanaacApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<JanaacApplicationStages>)QueryUtil.list(
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
	 * Returns the first janaac application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	@Override
	public JanaacApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<JanaacApplicationStages> orderByComparator)
		throws NoSuchJanaacApplicationStagesException {

		JanaacApplicationStages janaacApplicationStages = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (janaacApplicationStages != null) {
			return janaacApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchJanaacApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first janaac application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	@Override
	public JanaacApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<JanaacApplicationStages> orderByComparator) {

		List<JanaacApplicationStages> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last janaac application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	@Override
	public JanaacApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<JanaacApplicationStages> orderByComparator)
		throws NoSuchJanaacApplicationStagesException {

		JanaacApplicationStages janaacApplicationStages = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (janaacApplicationStages != null) {
			return janaacApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchJanaacApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last janaac application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	@Override
	public JanaacApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<JanaacApplicationStages> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<JanaacApplicationStages> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the janaac application stageses before and after the current janaac application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param janaacApplicationStagesId the primary key of the current janaac application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a janaac application stages with the primary key could not be found
	 */
	@Override
	public JanaacApplicationStages[] findByUuid_C_PrevAndNext(
			long janaacApplicationStagesId, String uuid, long companyId,
			OrderByComparator<JanaacApplicationStages> orderByComparator)
		throws NoSuchJanaacApplicationStagesException {

		uuid = Objects.toString(uuid, "");

		JanaacApplicationStages janaacApplicationStages = findByPrimaryKey(
			janaacApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			JanaacApplicationStages[] array =
				new JanaacApplicationStagesImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, janaacApplicationStages, uuid, companyId,
				orderByComparator, true);

			array[1] = janaacApplicationStages;

			array[2] = getByUuid_C_PrevAndNext(
				session, janaacApplicationStages, uuid, companyId,
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

	protected JanaacApplicationStages getByUuid_C_PrevAndNext(
		Session session, JanaacApplicationStages janaacApplicationStages,
		String uuid, long companyId,
		OrderByComparator<JanaacApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_JANAACAPPLICATIONSTAGES_WHERE);

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
			sb.append(JanaacApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						janaacApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JanaacApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the janaac application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (JanaacApplicationStages janaacApplicationStages :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(janaacApplicationStages);
		}
	}

	/**
	 * Returns the number of janaac application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching janaac application stageses
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JANAACAPPLICATIONSTAGES_WHERE);

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
		"janaacApplicationStages.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(janaacApplicationStages.uuid IS NULL OR janaacApplicationStages.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"janaacApplicationStages.companyId = ?";

	private FinderPath _finderPathFetchBygetJanaac_By_AI;
	private FinderPath _finderPathCountBygetJanaac_By_AI;

	/**
	 * Returns the janaac application stages where janaacApplicationId = &#63; or throws a <code>NoSuchJanaacApplicationStagesException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	@Override
	public JanaacApplicationStages findBygetJanaac_By_AI(
			long janaacApplicationId)
		throws NoSuchJanaacApplicationStagesException {

		JanaacApplicationStages janaacApplicationStages =
			fetchBygetJanaac_By_AI(janaacApplicationId);

		if (janaacApplicationStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("janaacApplicationId=");
			sb.append(janaacApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJanaacApplicationStagesException(sb.toString());
		}

		return janaacApplicationStages;
	}

	/**
	 * Returns the janaac application stages where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	@Override
	public JanaacApplicationStages fetchBygetJanaac_By_AI(
		long janaacApplicationId) {

		return fetchBygetJanaac_By_AI(janaacApplicationId, true);
	}

	/**
	 * Returns the janaac application stages where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	@Override
	public JanaacApplicationStages fetchBygetJanaac_By_AI(
		long janaacApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {janaacApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJanaac_By_AI, finderArgs, this);
		}

		if (result instanceof JanaacApplicationStages) {
			JanaacApplicationStages janaacApplicationStages =
				(JanaacApplicationStages)result;

			if (janaacApplicationId !=
					janaacApplicationStages.getJanaacApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JANAACAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAAC_BY_AI_JANAACAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				List<JanaacApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJanaac_By_AI, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {janaacApplicationId};
							}

							_log.warn(
								"JanaacApplicationStagesPersistenceImpl.fetchBygetJanaac_By_AI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JanaacApplicationStages janaacApplicationStages = list.get(
						0);

					result = janaacApplicationStages;

					cacheResult(janaacApplicationStages);
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
			return (JanaacApplicationStages)result;
		}
	}

	/**
	 * Removes the janaac application stages where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the janaac application stages that was removed
	 */
	@Override
	public JanaacApplicationStages removeBygetJanaac_By_AI(
			long janaacApplicationId)
		throws NoSuchJanaacApplicationStagesException {

		JanaacApplicationStages janaacApplicationStages = findBygetJanaac_By_AI(
			janaacApplicationId);

		return remove(janaacApplicationStages);
	}

	/**
	 * Returns the number of janaac application stageses where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching janaac application stageses
	 */
	@Override
	public int countBygetJanaac_By_AI(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaac_By_AI;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JANAACAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAAC_BY_AI_JANAACAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

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
		_FINDER_COLUMN_GETJANAAC_BY_AI_JANAACAPPLICATIONID_2 =
			"janaacApplicationStages.janaacApplicationId = ?";

	private FinderPath _finderPathFetchBygetJanaac_By_CaseIdStageName;
	private FinderPath _finderPathCountBygetJanaac_By_CaseIdStageName;

	/**
	 * Returns the janaac application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchJanaacApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	@Override
	public JanaacApplicationStages findBygetJanaac_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchJanaacApplicationStagesException {

		JanaacApplicationStages janaacApplicationStages =
			fetchBygetJanaac_By_CaseIdStageName(caseId, stageName);

		if (janaacApplicationStages == null) {
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

			throw new NoSuchJanaacApplicationStagesException(sb.toString());
		}

		return janaacApplicationStages;
	}

	/**
	 * Returns the janaac application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	@Override
	public JanaacApplicationStages fetchBygetJanaac_By_CaseIdStageName(
		String caseId, String stageName) {

		return fetchBygetJanaac_By_CaseIdStageName(caseId, stageName, true);
	}

	/**
	 * Returns the janaac application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	@Override
	public JanaacApplicationStages fetchBygetJanaac_By_CaseIdStageName(
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
				_finderPathFetchBygetJanaac_By_CaseIdStageName, finderArgs,
				this);
		}

		if (result instanceof JanaacApplicationStages) {
			JanaacApplicationStages janaacApplicationStages =
				(JanaacApplicationStages)result;

			if (!Objects.equals(caseId, janaacApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, janaacApplicationStages.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_JANAACAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJANAAC_BY_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJANAAC_BY_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJANAAC_BY_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETJANAAC_BY_CASEIDSTAGENAME_STAGENAME_2);
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

				List<JanaacApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJanaac_By_CaseIdStageName,
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
								"JanaacApplicationStagesPersistenceImpl.fetchBygetJanaac_By_CaseIdStageName(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JanaacApplicationStages janaacApplicationStages = list.get(
						0);

					result = janaacApplicationStages;

					cacheResult(janaacApplicationStages);
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
			return (JanaacApplicationStages)result;
		}
	}

	/**
	 * Removes the janaac application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the janaac application stages that was removed
	 */
	@Override
	public JanaacApplicationStages removeBygetJanaac_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchJanaacApplicationStagesException {

		JanaacApplicationStages janaacApplicationStages =
			findBygetJanaac_By_CaseIdStageName(caseId, stageName);

		return remove(janaacApplicationStages);
	}

	/**
	 * Returns the number of janaac application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching janaac application stageses
	 */
	@Override
	public int countBygetJanaac_By_CaseIdStageName(
		String caseId, String stageName) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetJanaac_By_CaseIdStageName;

		Object[] finderArgs = new Object[] {caseId, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JANAACAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJANAAC_BY_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJANAAC_BY_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJANAAC_BY_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETJANAAC_BY_CASEIDSTAGENAME_STAGENAME_2);
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
		_FINDER_COLUMN_GETJANAAC_BY_CASEIDSTAGENAME_CASEID_2 =
			"janaacApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETJANAAC_BY_CASEIDSTAGENAME_CASEID_3 =
			"(janaacApplicationStages.caseId IS NULL OR janaacApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETJANAAC_BY_CASEIDSTAGENAME_STAGENAME_2 =
			"janaacApplicationStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETJANAAC_BY_CASEIDSTAGENAME_STAGENAME_3 =
			"(janaacApplicationStages.stageName IS NULL OR janaacApplicationStages.stageName = '')";

	private FinderPath _finderPathFetchBygetJanaac_By_CaseIdStageStatus;
	private FinderPath _finderPathCountBygetJanaac_By_CaseIdStageStatus;

	/**
	 * Returns the janaac application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchJanaacApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	@Override
	public JanaacApplicationStages findBygetJanaac_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchJanaacApplicationStagesException {

		JanaacApplicationStages janaacApplicationStages =
			fetchBygetJanaac_By_CaseIdStageStatus(
				caseId, stageStatus, stageName);

		if (janaacApplicationStages == null) {
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

			throw new NoSuchJanaacApplicationStagesException(sb.toString());
		}

		return janaacApplicationStages;
	}

	/**
	 * Returns the janaac application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	@Override
	public JanaacApplicationStages fetchBygetJanaac_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		return fetchBygetJanaac_By_CaseIdStageStatus(
			caseId, stageStatus, stageName, true);
	}

	/**
	 * Returns the janaac application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	@Override
	public JanaacApplicationStages fetchBygetJanaac_By_CaseIdStageStatus(
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
				_finderPathFetchBygetJanaac_By_CaseIdStageStatus, finderArgs,
				this);
		}

		if (result instanceof JanaacApplicationStages) {
			JanaacApplicationStages janaacApplicationStages =
				(JanaacApplicationStages)result;

			if (!Objects.equals(caseId, janaacApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageStatus, janaacApplicationStages.getStageStatus()) ||
				!Objects.equals(
					stageName, janaacApplicationStages.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_JANAACAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJANAAC_BY_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETJANAAC_BY_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJANAAC_BY_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETJANAAC_BY_CASEIDSTAGESTATUS_STAGESTATUS_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJANAAC_BY_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETJANAAC_BY_CASEIDSTAGESTATUS_STAGENAME_2);
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

				List<JanaacApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJanaac_By_CaseIdStageStatus,
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
								"JanaacApplicationStagesPersistenceImpl.fetchBygetJanaac_By_CaseIdStageStatus(String, String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JanaacApplicationStages janaacApplicationStages = list.get(
						0);

					result = janaacApplicationStages;

					cacheResult(janaacApplicationStages);
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
			return (JanaacApplicationStages)result;
		}
	}

	/**
	 * Removes the janaac application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the janaac application stages that was removed
	 */
	@Override
	public JanaacApplicationStages removeBygetJanaac_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchJanaacApplicationStagesException {

		JanaacApplicationStages janaacApplicationStages =
			findBygetJanaac_By_CaseIdStageStatus(
				caseId, stageStatus, stageName);

		return remove(janaacApplicationStages);
	}

	/**
	 * Returns the number of janaac application stageses where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching janaac application stageses
	 */
	@Override
	public int countBygetJanaac_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath =
			_finderPathCountBygetJanaac_By_CaseIdStageStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_JANAACAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJANAAC_BY_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETJANAAC_BY_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJANAAC_BY_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETJANAAC_BY_CASEIDSTAGESTATUS_STAGESTATUS_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJANAAC_BY_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETJANAAC_BY_CASEIDSTAGESTATUS_STAGENAME_2);
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
		_FINDER_COLUMN_GETJANAAC_BY_CASEIDSTAGESTATUS_CASEID_2 =
			"janaacApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETJANAAC_BY_CASEIDSTAGESTATUS_CASEID_3 =
			"(janaacApplicationStages.caseId IS NULL OR janaacApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETJANAAC_BY_CASEIDSTAGESTATUS_STAGESTATUS_2 =
			"janaacApplicationStages.stageStatus = ? AND ";

	private static final String
		_FINDER_COLUMN_GETJANAAC_BY_CASEIDSTAGESTATUS_STAGESTATUS_3 =
			"(janaacApplicationStages.stageStatus IS NULL OR janaacApplicationStages.stageStatus = '') AND ";

	private static final String
		_FINDER_COLUMN_GETJANAAC_BY_CASEIDSTAGESTATUS_STAGENAME_2 =
			"janaacApplicationStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETJANAAC_BY_CASEIDSTAGESTATUS_STAGENAME_3 =
			"(janaacApplicationStages.stageName IS NULL OR janaacApplicationStages.stageName = '')";

	private FinderPath _finderPathFetchBygetJanaac_By_CaseIdAndStatus;
	private FinderPath _finderPathCountBygetJanaac_By_CaseIdAndStatus;

	/**
	 * Returns the janaac application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchJanaacApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	@Override
	public JanaacApplicationStages findBygetJanaac_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchJanaacApplicationStagesException {

		JanaacApplicationStages janaacApplicationStages =
			fetchBygetJanaac_By_CaseIdAndStatus(caseId, stageStatus);

		if (janaacApplicationStages == null) {
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

			throw new NoSuchJanaacApplicationStagesException(sb.toString());
		}

		return janaacApplicationStages;
	}

	/**
	 * Returns the janaac application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	@Override
	public JanaacApplicationStages fetchBygetJanaac_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return fetchBygetJanaac_By_CaseIdAndStatus(caseId, stageStatus, true);
	}

	/**
	 * Returns the janaac application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	@Override
	public JanaacApplicationStages fetchBygetJanaac_By_CaseIdAndStatus(
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
				_finderPathFetchBygetJanaac_By_CaseIdAndStatus, finderArgs,
				this);
		}

		if (result instanceof JanaacApplicationStages) {
			JanaacApplicationStages janaacApplicationStages =
				(JanaacApplicationStages)result;

			if (!Objects.equals(caseId, janaacApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageStatus, janaacApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_JANAACAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJANAAC_BY_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJANAAC_BY_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJANAAC_BY_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETJANAAC_BY_CASEIDANDSTATUS_STAGESTATUS_2);
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

				List<JanaacApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJanaac_By_CaseIdAndStatus,
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
								"JanaacApplicationStagesPersistenceImpl.fetchBygetJanaac_By_CaseIdAndStatus(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JanaacApplicationStages janaacApplicationStages = list.get(
						0);

					result = janaacApplicationStages;

					cacheResult(janaacApplicationStages);
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
			return (JanaacApplicationStages)result;
		}
	}

	/**
	 * Removes the janaac application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the janaac application stages that was removed
	 */
	@Override
	public JanaacApplicationStages removeBygetJanaac_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchJanaacApplicationStagesException {

		JanaacApplicationStages janaacApplicationStages =
			findBygetJanaac_By_CaseIdAndStatus(caseId, stageStatus);

		return remove(janaacApplicationStages);
	}

	/**
	 * Returns the number of janaac application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching janaac application stageses
	 */
	@Override
	public int countBygetJanaac_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetJanaac_By_CaseIdAndStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JANAACAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJANAAC_BY_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJANAAC_BY_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJANAAC_BY_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETJANAAC_BY_CASEIDANDSTATUS_STAGESTATUS_2);
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
		_FINDER_COLUMN_GETJANAAC_BY_CASEIDANDSTATUS_CASEID_2 =
			"janaacApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETJANAAC_BY_CASEIDANDSTATUS_CASEID_3 =
			"(janaacApplicationStages.caseId IS NULL OR janaacApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETJANAAC_BY_CASEIDANDSTATUS_STAGESTATUS_2 =
			"janaacApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETJANAAC_BY_CASEIDANDSTATUS_STAGESTATUS_3 =
			"(janaacApplicationStages.stageStatus IS NULL OR janaacApplicationStages.stageStatus = '')";

	private FinderPath _finderPathWithPaginationFindBygetJanaac_By_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetJanaac_By_CaseId;
	private FinderPath _finderPathCountBygetJanaac_By_CaseId;

	/**
	 * Returns all the janaac application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac application stageses
	 */
	@Override
	public List<JanaacApplicationStages> findBygetJanaac_By_CaseId(
		String caseId) {

		return findBygetJanaac_By_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the janaac application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @return the range of matching janaac application stageses
	 */
	@Override
	public List<JanaacApplicationStages> findBygetJanaac_By_CaseId(
		String caseId, int start, int end) {

		return findBygetJanaac_By_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the janaac application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac application stageses
	 */
	@Override
	public List<JanaacApplicationStages> findBygetJanaac_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<JanaacApplicationStages> orderByComparator) {

		return findBygetJanaac_By_CaseId(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the janaac application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac application stageses
	 */
	@Override
	public List<JanaacApplicationStages> findBygetJanaac_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<JanaacApplicationStages> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetJanaac_By_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJanaac_By_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<JanaacApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<JanaacApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JanaacApplicationStages janaacApplicationStages : list) {
					if (!caseId.equals(janaacApplicationStages.getCaseId())) {
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

			sb.append(_SQL_SELECT_JANAACAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJANAAC_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJANAAC_BY_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JanaacApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<JanaacApplicationStages>)QueryUtil.list(
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
	 * Returns the first janaac application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	@Override
	public JanaacApplicationStages findBygetJanaac_By_CaseId_First(
			String caseId,
			OrderByComparator<JanaacApplicationStages> orderByComparator)
		throws NoSuchJanaacApplicationStagesException {

		JanaacApplicationStages janaacApplicationStages =
			fetchBygetJanaac_By_CaseId_First(caseId, orderByComparator);

		if (janaacApplicationStages != null) {
			return janaacApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchJanaacApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first janaac application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	@Override
	public JanaacApplicationStages fetchBygetJanaac_By_CaseId_First(
		String caseId,
		OrderByComparator<JanaacApplicationStages> orderByComparator) {

		List<JanaacApplicationStages> list = findBygetJanaac_By_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last janaac application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	@Override
	public JanaacApplicationStages findBygetJanaac_By_CaseId_Last(
			String caseId,
			OrderByComparator<JanaacApplicationStages> orderByComparator)
		throws NoSuchJanaacApplicationStagesException {

		JanaacApplicationStages janaacApplicationStages =
			fetchBygetJanaac_By_CaseId_Last(caseId, orderByComparator);

		if (janaacApplicationStages != null) {
			return janaacApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchJanaacApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last janaac application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	@Override
	public JanaacApplicationStages fetchBygetJanaac_By_CaseId_Last(
		String caseId,
		OrderByComparator<JanaacApplicationStages> orderByComparator) {

		int count = countBygetJanaac_By_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<JanaacApplicationStages> list = findBygetJanaac_By_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the janaac application stageses before and after the current janaac application stages in the ordered set where caseId = &#63;.
	 *
	 * @param janaacApplicationStagesId the primary key of the current janaac application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a janaac application stages with the primary key could not be found
	 */
	@Override
	public JanaacApplicationStages[] findBygetJanaac_By_CaseId_PrevAndNext(
			long janaacApplicationStagesId, String caseId,
			OrderByComparator<JanaacApplicationStages> orderByComparator)
		throws NoSuchJanaacApplicationStagesException {

		caseId = Objects.toString(caseId, "");

		JanaacApplicationStages janaacApplicationStages = findByPrimaryKey(
			janaacApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			JanaacApplicationStages[] array =
				new JanaacApplicationStagesImpl[3];

			array[0] = getBygetJanaac_By_CaseId_PrevAndNext(
				session, janaacApplicationStages, caseId, orderByComparator,
				true);

			array[1] = janaacApplicationStages;

			array[2] = getBygetJanaac_By_CaseId_PrevAndNext(
				session, janaacApplicationStages, caseId, orderByComparator,
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

	protected JanaacApplicationStages getBygetJanaac_By_CaseId_PrevAndNext(
		Session session, JanaacApplicationStages janaacApplicationStages,
		String caseId,
		OrderByComparator<JanaacApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_JANAACAPPLICATIONSTAGES_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETJANAAC_BY_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETJANAAC_BY_CASEID_CASEID_2);
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
			sb.append(JanaacApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						janaacApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JanaacApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the janaac application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetJanaac_By_CaseId(String caseId) {
		for (JanaacApplicationStages janaacApplicationStages :
				findBygetJanaac_By_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(janaacApplicationStages);
		}
	}

	/**
	 * Returns the number of janaac application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching janaac application stageses
	 */
	@Override
	public int countBygetJanaac_By_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetJanaac_By_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JANAACAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJANAAC_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJANAAC_BY_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETJANAAC_BY_CASEID_CASEID_2 =
		"janaacApplicationStages.caseId = ?";

	private static final String _FINDER_COLUMN_GETJANAAC_BY_CASEID_CASEID_3 =
		"(janaacApplicationStages.caseId IS NULL OR janaacApplicationStages.caseId = '')";

	private FinderPath _finderPathFetchBygetJanaac_ByCaseId;
	private FinderPath _finderPathCountBygetJanaac_ByCaseId;

	/**
	 * Returns the janaac application stages where caseId = &#63; or throws a <code>NoSuchJanaacApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	@Override
	public JanaacApplicationStages findBygetJanaac_ByCaseId(String caseId)
		throws NoSuchJanaacApplicationStagesException {

		JanaacApplicationStages janaacApplicationStages =
			fetchBygetJanaac_ByCaseId(caseId);

		if (janaacApplicationStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJanaacApplicationStagesException(sb.toString());
		}

		return janaacApplicationStages;
	}

	/**
	 * Returns the janaac application stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	@Override
	public JanaacApplicationStages fetchBygetJanaac_ByCaseId(String caseId) {
		return fetchBygetJanaac_ByCaseId(caseId, true);
	}

	/**
	 * Returns the janaac application stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	@Override
	public JanaacApplicationStages fetchBygetJanaac_ByCaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJanaac_ByCaseId, finderArgs, this);
		}

		if (result instanceof JanaacApplicationStages) {
			JanaacApplicationStages janaacApplicationStages =
				(JanaacApplicationStages)result;

			if (!Objects.equals(caseId, janaacApplicationStages.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JANAACAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJANAAC_BYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJANAAC_BYCASEID_CASEID_2);
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

				List<JanaacApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJanaac_ByCaseId, finderArgs,
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
								"JanaacApplicationStagesPersistenceImpl.fetchBygetJanaac_ByCaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JanaacApplicationStages janaacApplicationStages = list.get(
						0);

					result = janaacApplicationStages;

					cacheResult(janaacApplicationStages);
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
			return (JanaacApplicationStages)result;
		}
	}

	/**
	 * Removes the janaac application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the janaac application stages that was removed
	 */
	@Override
	public JanaacApplicationStages removeBygetJanaac_ByCaseId(String caseId)
		throws NoSuchJanaacApplicationStagesException {

		JanaacApplicationStages janaacApplicationStages =
			findBygetJanaac_ByCaseId(caseId);

		return remove(janaacApplicationStages);
	}

	/**
	 * Returns the number of janaac application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching janaac application stageses
	 */
	@Override
	public int countBygetJanaac_ByCaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetJanaac_ByCaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JANAACAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJANAAC_BYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJANAAC_BYCASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETJANAAC_BYCASEID_CASEID_2 =
		"janaacApplicationStages.caseId = ?";

	private static final String _FINDER_COLUMN_GETJANAAC_BYCASEID_CASEID_3 =
		"(janaacApplicationStages.caseId IS NULL OR janaacApplicationStages.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetJanaac_By_StageName;
	private FinderPath _finderPathWithoutPaginationFindBygetJanaac_By_StageName;
	private FinderPath _finderPathCountBygetJanaac_By_StageName;

	/**
	 * Returns all the janaac application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching janaac application stageses
	 */
	@Override
	public List<JanaacApplicationStages> findBygetJanaac_By_StageName(
		String stageName) {

		return findBygetJanaac_By_StageName(
			stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the janaac application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @return the range of matching janaac application stageses
	 */
	@Override
	public List<JanaacApplicationStages> findBygetJanaac_By_StageName(
		String stageName, int start, int end) {

		return findBygetJanaac_By_StageName(stageName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the janaac application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac application stageses
	 */
	@Override
	public List<JanaacApplicationStages> findBygetJanaac_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<JanaacApplicationStages> orderByComparator) {

		return findBygetJanaac_By_StageName(
			stageName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the janaac application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac application stageses
	 */
	@Override
	public List<JanaacApplicationStages> findBygetJanaac_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<JanaacApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetJanaac_By_StageName;
				finderArgs = new Object[] {stageName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJanaac_By_StageName;
			finderArgs = new Object[] {
				stageName, start, end, orderByComparator
			};
		}

		List<JanaacApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<JanaacApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JanaacApplicationStages janaacApplicationStages : list) {
					if (!stageName.equals(
							janaacApplicationStages.getStageName())) {

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

			sb.append(_SQL_SELECT_JANAACAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJANAAC_BY_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETJANAAC_BY_STAGENAME_STAGENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JanaacApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<JanaacApplicationStages>)QueryUtil.list(
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
	 * Returns the first janaac application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	@Override
	public JanaacApplicationStages findBygetJanaac_By_StageName_First(
			String stageName,
			OrderByComparator<JanaacApplicationStages> orderByComparator)
		throws NoSuchJanaacApplicationStagesException {

		JanaacApplicationStages janaacApplicationStages =
			fetchBygetJanaac_By_StageName_First(stageName, orderByComparator);

		if (janaacApplicationStages != null) {
			return janaacApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchJanaacApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first janaac application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	@Override
	public JanaacApplicationStages fetchBygetJanaac_By_StageName_First(
		String stageName,
		OrderByComparator<JanaacApplicationStages> orderByComparator) {

		List<JanaacApplicationStages> list = findBygetJanaac_By_StageName(
			stageName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last janaac application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	@Override
	public JanaacApplicationStages findBygetJanaac_By_StageName_Last(
			String stageName,
			OrderByComparator<JanaacApplicationStages> orderByComparator)
		throws NoSuchJanaacApplicationStagesException {

		JanaacApplicationStages janaacApplicationStages =
			fetchBygetJanaac_By_StageName_Last(stageName, orderByComparator);

		if (janaacApplicationStages != null) {
			return janaacApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchJanaacApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last janaac application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	@Override
	public JanaacApplicationStages fetchBygetJanaac_By_StageName_Last(
		String stageName,
		OrderByComparator<JanaacApplicationStages> orderByComparator) {

		int count = countBygetJanaac_By_StageName(stageName);

		if (count == 0) {
			return null;
		}

		List<JanaacApplicationStages> list = findBygetJanaac_By_StageName(
			stageName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the janaac application stageses before and after the current janaac application stages in the ordered set where stageName = &#63;.
	 *
	 * @param janaacApplicationStagesId the primary key of the current janaac application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a janaac application stages with the primary key could not be found
	 */
	@Override
	public JanaacApplicationStages[] findBygetJanaac_By_StageName_PrevAndNext(
			long janaacApplicationStagesId, String stageName,
			OrderByComparator<JanaacApplicationStages> orderByComparator)
		throws NoSuchJanaacApplicationStagesException {

		stageName = Objects.toString(stageName, "");

		JanaacApplicationStages janaacApplicationStages = findByPrimaryKey(
			janaacApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			JanaacApplicationStages[] array =
				new JanaacApplicationStagesImpl[3];

			array[0] = getBygetJanaac_By_StageName_PrevAndNext(
				session, janaacApplicationStages, stageName, orderByComparator,
				true);

			array[1] = janaacApplicationStages;

			array[2] = getBygetJanaac_By_StageName_PrevAndNext(
				session, janaacApplicationStages, stageName, orderByComparator,
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

	protected JanaacApplicationStages getBygetJanaac_By_StageName_PrevAndNext(
		Session session, JanaacApplicationStages janaacApplicationStages,
		String stageName,
		OrderByComparator<JanaacApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_JANAACAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETJANAAC_BY_STAGENAME_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETJANAAC_BY_STAGENAME_STAGENAME_2);
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
			sb.append(JanaacApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						janaacApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JanaacApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the janaac application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	@Override
	public void removeBygetJanaac_By_StageName(String stageName) {
		for (JanaacApplicationStages janaacApplicationStages :
				findBygetJanaac_By_StageName(
					stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(janaacApplicationStages);
		}
	}

	/**
	 * Returns the number of janaac application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching janaac application stageses
	 */
	@Override
	public int countBygetJanaac_By_StageName(String stageName) {
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetJanaac_By_StageName;

		Object[] finderArgs = new Object[] {stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JANAACAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJANAAC_BY_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETJANAAC_BY_STAGENAME_STAGENAME_2);
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
		_FINDER_COLUMN_GETJANAAC_BY_STAGENAME_STAGENAME_2 =
			"janaacApplicationStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETJANAAC_BY_STAGENAME_STAGENAME_3 =
			"(janaacApplicationStages.stageName IS NULL OR janaacApplicationStages.stageName = '')";

	public JanaacApplicationStagesPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(JanaacApplicationStages.class);

		setModelImplClass(JanaacApplicationStagesImpl.class);
		setModelPKClass(long.class);

		setTable(JanaacApplicationStagesTable.INSTANCE);
	}

	/**
	 * Caches the janaac application stages in the entity cache if it is enabled.
	 *
	 * @param janaacApplicationStages the janaac application stages
	 */
	@Override
	public void cacheResult(JanaacApplicationStages janaacApplicationStages) {
		entityCache.putResult(
			JanaacApplicationStagesImpl.class,
			janaacApplicationStages.getPrimaryKey(), janaacApplicationStages);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				janaacApplicationStages.getUuid(),
				janaacApplicationStages.getGroupId()
			},
			janaacApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetJanaac_By_AI,
			new Object[] {janaacApplicationStages.getJanaacApplicationId()},
			janaacApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetJanaac_By_CaseIdStageName,
			new Object[] {
				janaacApplicationStages.getCaseId(),
				janaacApplicationStages.getStageName()
			},
			janaacApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetJanaac_By_CaseIdStageStatus,
			new Object[] {
				janaacApplicationStages.getCaseId(),
				janaacApplicationStages.getStageStatus(),
				janaacApplicationStages.getStageName()
			},
			janaacApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetJanaac_By_CaseIdAndStatus,
			new Object[] {
				janaacApplicationStages.getCaseId(),
				janaacApplicationStages.getStageStatus()
			},
			janaacApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetJanaac_ByCaseId,
			new Object[] {janaacApplicationStages.getCaseId()},
			janaacApplicationStages);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the janaac application stageses in the entity cache if it is enabled.
	 *
	 * @param janaacApplicationStageses the janaac application stageses
	 */
	@Override
	public void cacheResult(
		List<JanaacApplicationStages> janaacApplicationStageses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (janaacApplicationStageses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JanaacApplicationStages janaacApplicationStages :
				janaacApplicationStageses) {

			if (entityCache.getResult(
					JanaacApplicationStagesImpl.class,
					janaacApplicationStages.getPrimaryKey()) == null) {

				cacheResult(janaacApplicationStages);
			}
		}
	}

	/**
	 * Clears the cache for all janaac application stageses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JanaacApplicationStagesImpl.class);

		finderCache.clearCache(JanaacApplicationStagesImpl.class);
	}

	/**
	 * Clears the cache for the janaac application stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JanaacApplicationStages janaacApplicationStages) {
		entityCache.removeResult(
			JanaacApplicationStagesImpl.class, janaacApplicationStages);
	}

	@Override
	public void clearCache(
		List<JanaacApplicationStages> janaacApplicationStageses) {

		for (JanaacApplicationStages janaacApplicationStages :
				janaacApplicationStageses) {

			entityCache.removeResult(
				JanaacApplicationStagesImpl.class, janaacApplicationStages);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JanaacApplicationStagesImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				JanaacApplicationStagesImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		JanaacApplicationStagesModelImpl janaacApplicationStagesModelImpl) {

		Object[] args = new Object[] {
			janaacApplicationStagesModelImpl.getUuid(),
			janaacApplicationStagesModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, janaacApplicationStagesModelImpl);

		args = new Object[] {
			janaacApplicationStagesModelImpl.getJanaacApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetJanaac_By_AI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJanaac_By_AI, args,
			janaacApplicationStagesModelImpl);

		args = new Object[] {
			janaacApplicationStagesModelImpl.getCaseId(),
			janaacApplicationStagesModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetJanaac_By_CaseIdStageName, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJanaac_By_CaseIdStageName, args,
			janaacApplicationStagesModelImpl);

		args = new Object[] {
			janaacApplicationStagesModelImpl.getCaseId(),
			janaacApplicationStagesModelImpl.getStageStatus(),
			janaacApplicationStagesModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetJanaac_By_CaseIdStageStatus, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJanaac_By_CaseIdStageStatus, args,
			janaacApplicationStagesModelImpl);

		args = new Object[] {
			janaacApplicationStagesModelImpl.getCaseId(),
			janaacApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetJanaac_By_CaseIdAndStatus, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJanaac_By_CaseIdAndStatus, args,
			janaacApplicationStagesModelImpl);

		args = new Object[] {janaacApplicationStagesModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetJanaac_ByCaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJanaac_ByCaseId, args,
			janaacApplicationStagesModelImpl);
	}

	/**
	 * Creates a new janaac application stages with the primary key. Does not add the janaac application stages to the database.
	 *
	 * @param janaacApplicationStagesId the primary key for the new janaac application stages
	 * @return the new janaac application stages
	 */
	@Override
	public JanaacApplicationStages create(long janaacApplicationStagesId) {
		JanaacApplicationStages janaacApplicationStages =
			new JanaacApplicationStagesImpl();

		janaacApplicationStages.setNew(true);
		janaacApplicationStages.setPrimaryKey(janaacApplicationStagesId);

		String uuid = PortalUUIDUtil.generate();

		janaacApplicationStages.setUuid(uuid);

		janaacApplicationStages.setCompanyId(CompanyThreadLocal.getCompanyId());

		return janaacApplicationStages;
	}

	/**
	 * Removes the janaac application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param janaacApplicationStagesId the primary key of the janaac application stages
	 * @return the janaac application stages that was removed
	 * @throws NoSuchJanaacApplicationStagesException if a janaac application stages with the primary key could not be found
	 */
	@Override
	public JanaacApplicationStages remove(long janaacApplicationStagesId)
		throws NoSuchJanaacApplicationStagesException {

		return remove((Serializable)janaacApplicationStagesId);
	}

	/**
	 * Removes the janaac application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the janaac application stages
	 * @return the janaac application stages that was removed
	 * @throws NoSuchJanaacApplicationStagesException if a janaac application stages with the primary key could not be found
	 */
	@Override
	public JanaacApplicationStages remove(Serializable primaryKey)
		throws NoSuchJanaacApplicationStagesException {

		Session session = null;

		try {
			session = openSession();

			JanaacApplicationStages janaacApplicationStages =
				(JanaacApplicationStages)session.get(
					JanaacApplicationStagesImpl.class, primaryKey);

			if (janaacApplicationStages == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJanaacApplicationStagesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(janaacApplicationStages);
		}
		catch (NoSuchJanaacApplicationStagesException noSuchEntityException) {
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
	protected JanaacApplicationStages removeImpl(
		JanaacApplicationStages janaacApplicationStages) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(janaacApplicationStages)) {
				janaacApplicationStages = (JanaacApplicationStages)session.get(
					JanaacApplicationStagesImpl.class,
					janaacApplicationStages.getPrimaryKeyObj());
			}

			if (janaacApplicationStages != null) {
				session.delete(janaacApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (janaacApplicationStages != null) {
			clearCache(janaacApplicationStages);
		}

		return janaacApplicationStages;
	}

	@Override
	public JanaacApplicationStages updateImpl(
		JanaacApplicationStages janaacApplicationStages) {

		boolean isNew = janaacApplicationStages.isNew();

		if (!(janaacApplicationStages instanceof
				JanaacApplicationStagesModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(janaacApplicationStages.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					janaacApplicationStages);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in janaacApplicationStages proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JanaacApplicationStages implementation " +
					janaacApplicationStages.getClass());
		}

		JanaacApplicationStagesModelImpl janaacApplicationStagesModelImpl =
			(JanaacApplicationStagesModelImpl)janaacApplicationStages;

		if (Validator.isNull(janaacApplicationStages.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			janaacApplicationStages.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (janaacApplicationStages.getCreateDate() == null)) {
			if (serviceContext == null) {
				janaacApplicationStages.setCreateDate(date);
			}
			else {
				janaacApplicationStages.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!janaacApplicationStagesModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				janaacApplicationStages.setModifiedDate(date);
			}
			else {
				janaacApplicationStages.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(janaacApplicationStages);
			}
			else {
				janaacApplicationStages =
					(JanaacApplicationStages)session.merge(
						janaacApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JanaacApplicationStagesImpl.class, janaacApplicationStagesModelImpl,
			false, true);

		cacheUniqueFindersCache(janaacApplicationStagesModelImpl);

		if (isNew) {
			janaacApplicationStages.setNew(false);
		}

		janaacApplicationStages.resetOriginalValues();

		return janaacApplicationStages;
	}

	/**
	 * Returns the janaac application stages with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the janaac application stages
	 * @return the janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a janaac application stages with the primary key could not be found
	 */
	@Override
	public JanaacApplicationStages findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJanaacApplicationStagesException {

		JanaacApplicationStages janaacApplicationStages = fetchByPrimaryKey(
			primaryKey);

		if (janaacApplicationStages == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJanaacApplicationStagesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return janaacApplicationStages;
	}

	/**
	 * Returns the janaac application stages with the primary key or throws a <code>NoSuchJanaacApplicationStagesException</code> if it could not be found.
	 *
	 * @param janaacApplicationStagesId the primary key of the janaac application stages
	 * @return the janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a janaac application stages with the primary key could not be found
	 */
	@Override
	public JanaacApplicationStages findByPrimaryKey(
			long janaacApplicationStagesId)
		throws NoSuchJanaacApplicationStagesException {

		return findByPrimaryKey((Serializable)janaacApplicationStagesId);
	}

	/**
	 * Returns the janaac application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param janaacApplicationStagesId the primary key of the janaac application stages
	 * @return the janaac application stages, or <code>null</code> if a janaac application stages with the primary key could not be found
	 */
	@Override
	public JanaacApplicationStages fetchByPrimaryKey(
		long janaacApplicationStagesId) {

		return fetchByPrimaryKey((Serializable)janaacApplicationStagesId);
	}

	/**
	 * Returns all the janaac application stageses.
	 *
	 * @return the janaac application stageses
	 */
	@Override
	public List<JanaacApplicationStages> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the janaac application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @return the range of janaac application stageses
	 */
	@Override
	public List<JanaacApplicationStages> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the janaac application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of janaac application stageses
	 */
	@Override
	public List<JanaacApplicationStages> findAll(
		int start, int end,
		OrderByComparator<JanaacApplicationStages> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the janaac application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of janaac application stageses
	 */
	@Override
	public List<JanaacApplicationStages> findAll(
		int start, int end,
		OrderByComparator<JanaacApplicationStages> orderByComparator,
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

		List<JanaacApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<JanaacApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JANAACAPPLICATIONSTAGES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JANAACAPPLICATIONSTAGES;

				sql = sql.concat(
					JanaacApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JanaacApplicationStages>)QueryUtil.list(
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
	 * Removes all the janaac application stageses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JanaacApplicationStages janaacApplicationStages : findAll()) {
			remove(janaacApplicationStages);
		}
	}

	/**
	 * Returns the number of janaac application stageses.
	 *
	 * @return the number of janaac application stageses
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
					_SQL_COUNT_JANAACAPPLICATIONSTAGES);

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
		return "janaacApplicationStagesId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JANAACAPPLICATIONSTAGES;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JanaacApplicationStagesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the janaac application stages persistence.
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

		_finderPathFetchBygetJanaac_By_AI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJanaac_By_AI",
			new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, true);

		_finderPathCountBygetJanaac_By_AI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJanaac_By_AI",
			new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, false);

		_finderPathFetchBygetJanaac_By_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJanaac_By_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, true);

		_finderPathCountBygetJanaac_By_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJanaac_By_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, false);

		_finderPathFetchBygetJanaac_By_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJanaac_By_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageStatus", "stageName"}, true);

		_finderPathCountBygetJanaac_By_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJanaac_By_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageStatus", "stageName"}, false);

		_finderPathFetchBygetJanaac_By_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJanaac_By_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, true);

		_finderPathCountBygetJanaac_By_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJanaac_By_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, false);

		_finderPathWithPaginationFindBygetJanaac_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJanaac_By_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetJanaac_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetJanaac_By_CaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, true);

		_finderPathCountBygetJanaac_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJanaac_By_CaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		_finderPathFetchBygetJanaac_ByCaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJanaac_ByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetJanaac_ByCaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJanaac_ByCaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		_finderPathWithPaginationFindBygetJanaac_By_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetJanaac_By_StageName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"stageName"}, true);

		_finderPathWithoutPaginationFindBygetJanaac_By_StageName =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetJanaac_By_StageName",
				new String[] {String.class.getName()},
				new String[] {"stageName"}, true);

		_finderPathCountBygetJanaac_By_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJanaac_By_StageName",
			new String[] {String.class.getName()}, new String[] {"stageName"},
			false);

		JanaacApplicationStagesUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		JanaacApplicationStagesUtil.setPersistence(null);

		entityCache.removeCache(JanaacApplicationStagesImpl.class.getName());
	}

	@Override
	@Reference(
		target = JANAAC_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JANAAC_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JANAAC_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_JANAACAPPLICATIONSTAGES =
		"SELECT janaacApplicationStages FROM JanaacApplicationStages janaacApplicationStages";

	private static final String _SQL_SELECT_JANAACAPPLICATIONSTAGES_WHERE =
		"SELECT janaacApplicationStages FROM JanaacApplicationStages janaacApplicationStages WHERE ";

	private static final String _SQL_COUNT_JANAACAPPLICATIONSTAGES =
		"SELECT COUNT(janaacApplicationStages) FROM JanaacApplicationStages janaacApplicationStages";

	private static final String _SQL_COUNT_JANAACAPPLICATIONSTAGES_WHERE =
		"SELECT COUNT(janaacApplicationStages) FROM JanaacApplicationStages janaacApplicationStages WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"janaacApplicationStages.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JanaacApplicationStages exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JanaacApplicationStages exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JanaacApplicationStagesPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}