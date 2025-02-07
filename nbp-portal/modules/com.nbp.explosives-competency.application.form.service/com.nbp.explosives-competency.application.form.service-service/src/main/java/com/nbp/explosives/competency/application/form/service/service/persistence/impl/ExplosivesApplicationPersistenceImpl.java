/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.service.persistence.impl;

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

import com.nbp.explosives.competency.application.form.service.exception.NoSuchExplosivesApplicationException;
import com.nbp.explosives.competency.application.form.service.model.ExplosivesApplication;
import com.nbp.explosives.competency.application.form.service.model.ExplosivesApplicationTable;
import com.nbp.explosives.competency.application.form.service.model.impl.ExplosivesApplicationImpl;
import com.nbp.explosives.competency.application.form.service.model.impl.ExplosivesApplicationModelImpl;
import com.nbp.explosives.competency.application.form.service.service.persistence.ExplosivesApplicationPersistence;
import com.nbp.explosives.competency.application.form.service.service.persistence.ExplosivesApplicationUtil;
import com.nbp.explosives.competency.application.form.service.service.persistence.impl.constants.EXPLOSIVEPersistenceConstants;

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
 * The persistence implementation for the explosives application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ExplosivesApplicationPersistence.class)
public class ExplosivesApplicationPersistenceImpl
	extends BasePersistenceImpl<ExplosivesApplication>
	implements ExplosivesApplicationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ExplosivesApplicationUtil</code> to access the explosives application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ExplosivesApplicationImpl.class.getName();

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
	 * Returns all the explosives applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching explosives applications
	 */
	@Override
	public List<ExplosivesApplication> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the explosives applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @return the range of matching explosives applications
	 */
	@Override
	public List<ExplosivesApplication> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the explosives applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosives applications
	 */
	@Override
	public List<ExplosivesApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ExplosivesApplication> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the explosives applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosives applications
	 */
	@Override
	public List<ExplosivesApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ExplosivesApplication> orderByComparator,
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

		List<ExplosivesApplication> list = null;

		if (useFinderCache) {
			list = (List<ExplosivesApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ExplosivesApplication explosivesApplication : list) {
					if (!uuid.equals(explosivesApplication.getUuid())) {
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

			sb.append(_SQL_SELECT_EXPLOSIVESAPPLICATION_WHERE);

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
				sb.append(ExplosivesApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<ExplosivesApplication>)QueryUtil.list(
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
	 * Returns the first explosives application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	@Override
	public ExplosivesApplication findByUuid_First(
			String uuid,
			OrderByComparator<ExplosivesApplication> orderByComparator)
		throws NoSuchExplosivesApplicationException {

		ExplosivesApplication explosivesApplication = fetchByUuid_First(
			uuid, orderByComparator);

		if (explosivesApplication != null) {
			return explosivesApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchExplosivesApplicationException(sb.toString());
	}

	/**
	 * Returns the first explosives application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	@Override
	public ExplosivesApplication fetchByUuid_First(
		String uuid,
		OrderByComparator<ExplosivesApplication> orderByComparator) {

		List<ExplosivesApplication> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last explosives application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	@Override
	public ExplosivesApplication findByUuid_Last(
			String uuid,
			OrderByComparator<ExplosivesApplication> orderByComparator)
		throws NoSuchExplosivesApplicationException {

		ExplosivesApplication explosivesApplication = fetchByUuid_Last(
			uuid, orderByComparator);

		if (explosivesApplication != null) {
			return explosivesApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchExplosivesApplicationException(sb.toString());
	}

	/**
	 * Returns the last explosives application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	@Override
	public ExplosivesApplication fetchByUuid_Last(
		String uuid,
		OrderByComparator<ExplosivesApplication> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<ExplosivesApplication> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the explosives applications before and after the current explosives application in the ordered set where uuid = &#63;.
	 *
	 * @param explosivesApplicationId the primary key of the current explosives application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosives application
	 * @throws NoSuchExplosivesApplicationException if a explosives application with the primary key could not be found
	 */
	@Override
	public ExplosivesApplication[] findByUuid_PrevAndNext(
			long explosivesApplicationId, String uuid,
			OrderByComparator<ExplosivesApplication> orderByComparator)
		throws NoSuchExplosivesApplicationException {

		uuid = Objects.toString(uuid, "");

		ExplosivesApplication explosivesApplication = findByPrimaryKey(
			explosivesApplicationId);

		Session session = null;

		try {
			session = openSession();

			ExplosivesApplication[] array = new ExplosivesApplicationImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, explosivesApplication, uuid, orderByComparator, true);

			array[1] = explosivesApplication;

			array[2] = getByUuid_PrevAndNext(
				session, explosivesApplication, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ExplosivesApplication getByUuid_PrevAndNext(
		Session session, ExplosivesApplication explosivesApplication,
		String uuid, OrderByComparator<ExplosivesApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_EXPLOSIVESAPPLICATION_WHERE);

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
			sb.append(ExplosivesApplicationModelImpl.ORDER_BY_JPQL);
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
						explosivesApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ExplosivesApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the explosives applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (ExplosivesApplication explosivesApplication :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(explosivesApplication);
		}
	}

	/**
	 * Returns the number of explosives applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching explosives applications
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EXPLOSIVESAPPLICATION_WHERE);

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
		"explosivesApplication.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(explosivesApplication.uuid IS NULL OR explosivesApplication.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the explosives application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchExplosivesApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	@Override
	public ExplosivesApplication findByUUID_G(String uuid, long groupId)
		throws NoSuchExplosivesApplicationException {

		ExplosivesApplication explosivesApplication = fetchByUUID_G(
			uuid, groupId);

		if (explosivesApplication == null) {
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

			throw new NoSuchExplosivesApplicationException(sb.toString());
		}

		return explosivesApplication;
	}

	/**
	 * Returns the explosives application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	@Override
	public ExplosivesApplication fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the explosives application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	@Override
	public ExplosivesApplication fetchByUUID_G(
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

		if (result instanceof ExplosivesApplication) {
			ExplosivesApplication explosivesApplication =
				(ExplosivesApplication)result;

			if (!Objects.equals(uuid, explosivesApplication.getUuid()) ||
				(groupId != explosivesApplication.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_EXPLOSIVESAPPLICATION_WHERE);

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

				List<ExplosivesApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					ExplosivesApplication explosivesApplication = list.get(0);

					result = explosivesApplication;

					cacheResult(explosivesApplication);
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
			return (ExplosivesApplication)result;
		}
	}

	/**
	 * Removes the explosives application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the explosives application that was removed
	 */
	@Override
	public ExplosivesApplication removeByUUID_G(String uuid, long groupId)
		throws NoSuchExplosivesApplicationException {

		ExplosivesApplication explosivesApplication = findByUUID_G(
			uuid, groupId);

		return remove(explosivesApplication);
	}

	/**
	 * Returns the number of explosives applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching explosives applications
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_EXPLOSIVESAPPLICATION_WHERE);

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
		"explosivesApplication.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(explosivesApplication.uuid IS NULL OR explosivesApplication.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"explosivesApplication.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the explosives applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching explosives applications
	 */
	@Override
	public List<ExplosivesApplication> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the explosives applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @return the range of matching explosives applications
	 */
	@Override
	public List<ExplosivesApplication> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the explosives applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosives applications
	 */
	@Override
	public List<ExplosivesApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ExplosivesApplication> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the explosives applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosives applications
	 */
	@Override
	public List<ExplosivesApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ExplosivesApplication> orderByComparator,
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

		List<ExplosivesApplication> list = null;

		if (useFinderCache) {
			list = (List<ExplosivesApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ExplosivesApplication explosivesApplication : list) {
					if (!uuid.equals(explosivesApplication.getUuid()) ||
						(companyId != explosivesApplication.getCompanyId())) {

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

			sb.append(_SQL_SELECT_EXPLOSIVESAPPLICATION_WHERE);

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
				sb.append(ExplosivesApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<ExplosivesApplication>)QueryUtil.list(
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
	 * Returns the first explosives application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	@Override
	public ExplosivesApplication findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<ExplosivesApplication> orderByComparator)
		throws NoSuchExplosivesApplicationException {

		ExplosivesApplication explosivesApplication = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (explosivesApplication != null) {
			return explosivesApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchExplosivesApplicationException(sb.toString());
	}

	/**
	 * Returns the first explosives application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	@Override
	public ExplosivesApplication fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<ExplosivesApplication> orderByComparator) {

		List<ExplosivesApplication> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last explosives application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	@Override
	public ExplosivesApplication findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<ExplosivesApplication> orderByComparator)
		throws NoSuchExplosivesApplicationException {

		ExplosivesApplication explosivesApplication = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (explosivesApplication != null) {
			return explosivesApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchExplosivesApplicationException(sb.toString());
	}

	/**
	 * Returns the last explosives application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	@Override
	public ExplosivesApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<ExplosivesApplication> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<ExplosivesApplication> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the explosives applications before and after the current explosives application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param explosivesApplicationId the primary key of the current explosives application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosives application
	 * @throws NoSuchExplosivesApplicationException if a explosives application with the primary key could not be found
	 */
	@Override
	public ExplosivesApplication[] findByUuid_C_PrevAndNext(
			long explosivesApplicationId, String uuid, long companyId,
			OrderByComparator<ExplosivesApplication> orderByComparator)
		throws NoSuchExplosivesApplicationException {

		uuid = Objects.toString(uuid, "");

		ExplosivesApplication explosivesApplication = findByPrimaryKey(
			explosivesApplicationId);

		Session session = null;

		try {
			session = openSession();

			ExplosivesApplication[] array = new ExplosivesApplicationImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, explosivesApplication, uuid, companyId,
				orderByComparator, true);

			array[1] = explosivesApplication;

			array[2] = getByUuid_C_PrevAndNext(
				session, explosivesApplication, uuid, companyId,
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

	protected ExplosivesApplication getByUuid_C_PrevAndNext(
		Session session, ExplosivesApplication explosivesApplication,
		String uuid, long companyId,
		OrderByComparator<ExplosivesApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_EXPLOSIVESAPPLICATION_WHERE);

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
			sb.append(ExplosivesApplicationModelImpl.ORDER_BY_JPQL);
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
						explosivesApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ExplosivesApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the explosives applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (ExplosivesApplication explosivesApplication :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(explosivesApplication);
		}
	}

	/**
	 * Returns the number of explosives applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching explosives applications
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_EXPLOSIVESAPPLICATION_WHERE);

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
		"explosivesApplication.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(explosivesApplication.uuid IS NULL OR explosivesApplication.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"explosivesApplication.companyId = ?";

	private FinderPath _finderPathFetchBygetExplosiveById;
	private FinderPath _finderPathCountBygetExplosiveById;

	/**
	 * Returns the explosives application where explosivesApplicationId = &#63; or throws a <code>NoSuchExplosivesApplicationException</code> if it could not be found.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	@Override
	public ExplosivesApplication findBygetExplosiveById(
			long explosivesApplicationId)
		throws NoSuchExplosivesApplicationException {

		ExplosivesApplication explosivesApplication = fetchBygetExplosiveById(
			explosivesApplicationId);

		if (explosivesApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("explosivesApplicationId=");
			sb.append(explosivesApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchExplosivesApplicationException(sb.toString());
		}

		return explosivesApplication;
	}

	/**
	 * Returns the explosives application where explosivesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	@Override
	public ExplosivesApplication fetchBygetExplosiveById(
		long explosivesApplicationId) {

		return fetchBygetExplosiveById(explosivesApplicationId, true);
	}

	/**
	 * Returns the explosives application where explosivesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	@Override
	public ExplosivesApplication fetchBygetExplosiveById(
		long explosivesApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {explosivesApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetExplosiveById, finderArgs, this);
		}

		if (result instanceof ExplosivesApplication) {
			ExplosivesApplication explosivesApplication =
				(ExplosivesApplication)result;

			if (explosivesApplicationId !=
					explosivesApplication.getExplosivesApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_EXPLOSIVESAPPLICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETEXPLOSIVEBYID_EXPLOSIVESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(explosivesApplicationId);

				List<ExplosivesApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetExplosiveById, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									explosivesApplicationId
								};
							}

							_log.warn(
								"ExplosivesApplicationPersistenceImpl.fetchBygetExplosiveById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ExplosivesApplication explosivesApplication = list.get(0);

					result = explosivesApplication;

					cacheResult(explosivesApplication);
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
			return (ExplosivesApplication)result;
		}
	}

	/**
	 * Removes the explosives application where explosivesApplicationId = &#63; from the database.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the explosives application that was removed
	 */
	@Override
	public ExplosivesApplication removeBygetExplosiveById(
			long explosivesApplicationId)
		throws NoSuchExplosivesApplicationException {

		ExplosivesApplication explosivesApplication = findBygetExplosiveById(
			explosivesApplicationId);

		return remove(explosivesApplication);
	}

	/**
	 * Returns the number of explosives applications where explosivesApplicationId = &#63;.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the number of matching explosives applications
	 */
	@Override
	public int countBygetExplosiveById(long explosivesApplicationId) {
		FinderPath finderPath = _finderPathCountBygetExplosiveById;

		Object[] finderArgs = new Object[] {explosivesApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EXPLOSIVESAPPLICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETEXPLOSIVEBYID_EXPLOSIVESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(explosivesApplicationId);

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
		_FINDER_COLUMN_GETEXPLOSIVEBYID_EXPLOSIVESAPPLICATIONID_2 =
			"explosivesApplication.explosivesApplicationId = ?";

	private FinderPath
		_finderPathWithPaginationFindBygetExplosiveAppByStatusUser;
	private FinderPath
		_finderPathWithoutPaginationFindBygetExplosiveAppByStatusUser;
	private FinderPath _finderPathCountBygetExplosiveAppByStatusUser;

	/**
	 * Returns all the explosives applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching explosives applications
	 */
	@Override
	public List<ExplosivesApplication> findBygetExplosiveAppByStatusUser(
		int status, long userId) {

		return findBygetExplosiveAppByStatusUser(
			status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the explosives applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @return the range of matching explosives applications
	 */
	@Override
	public List<ExplosivesApplication> findBygetExplosiveAppByStatusUser(
		int status, long userId, int start, int end) {

		return findBygetExplosiveAppByStatusUser(
			status, userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the explosives applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosives applications
	 */
	@Override
	public List<ExplosivesApplication> findBygetExplosiveAppByStatusUser(
		int status, long userId, int start, int end,
		OrderByComparator<ExplosivesApplication> orderByComparator) {

		return findBygetExplosiveAppByStatusUser(
			status, userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the explosives applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosives applications
	 */
	@Override
	public List<ExplosivesApplication> findBygetExplosiveAppByStatusUser(
		int status, long userId, int start, int end,
		OrderByComparator<ExplosivesApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetExplosiveAppByStatusUser;
				finderArgs = new Object[] {status, userId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetExplosiveAppByStatusUser;
			finderArgs = new Object[] {
				status, userId, start, end, orderByComparator
			};
		}

		List<ExplosivesApplication> list = null;

		if (useFinderCache) {
			list = (List<ExplosivesApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ExplosivesApplication explosivesApplication : list) {
					if ((status != explosivesApplication.getStatus()) ||
						(userId != explosivesApplication.getUserId())) {

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

			sb.append(_SQL_SELECT_EXPLOSIVESAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETEXPLOSIVEAPPBYSTATUSUSER_STATUS_2);

			sb.append(_FINDER_COLUMN_GETEXPLOSIVEAPPBYSTATUSUSER_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ExplosivesApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				queryPos.add(userId);

				list = (List<ExplosivesApplication>)QueryUtil.list(
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
	 * Returns the first explosives application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	@Override
	public ExplosivesApplication findBygetExplosiveAppByStatusUser_First(
			int status, long userId,
			OrderByComparator<ExplosivesApplication> orderByComparator)
		throws NoSuchExplosivesApplicationException {

		ExplosivesApplication explosivesApplication =
			fetchBygetExplosiveAppByStatusUser_First(
				status, userId, orderByComparator);

		if (explosivesApplication != null) {
			return explosivesApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchExplosivesApplicationException(sb.toString());
	}

	/**
	 * Returns the first explosives application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	@Override
	public ExplosivesApplication fetchBygetExplosiveAppByStatusUser_First(
		int status, long userId,
		OrderByComparator<ExplosivesApplication> orderByComparator) {

		List<ExplosivesApplication> list = findBygetExplosiveAppByStatusUser(
			status, userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last explosives application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	@Override
	public ExplosivesApplication findBygetExplosiveAppByStatusUser_Last(
			int status, long userId,
			OrderByComparator<ExplosivesApplication> orderByComparator)
		throws NoSuchExplosivesApplicationException {

		ExplosivesApplication explosivesApplication =
			fetchBygetExplosiveAppByStatusUser_Last(
				status, userId, orderByComparator);

		if (explosivesApplication != null) {
			return explosivesApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchExplosivesApplicationException(sb.toString());
	}

	/**
	 * Returns the last explosives application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	@Override
	public ExplosivesApplication fetchBygetExplosiveAppByStatusUser_Last(
		int status, long userId,
		OrderByComparator<ExplosivesApplication> orderByComparator) {

		int count = countBygetExplosiveAppByStatusUser(status, userId);

		if (count == 0) {
			return null;
		}

		List<ExplosivesApplication> list = findBygetExplosiveAppByStatusUser(
			status, userId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the explosives applications before and after the current explosives application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param explosivesApplicationId the primary key of the current explosives application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosives application
	 * @throws NoSuchExplosivesApplicationException if a explosives application with the primary key could not be found
	 */
	@Override
	public ExplosivesApplication[]
			findBygetExplosiveAppByStatusUser_PrevAndNext(
				long explosivesApplicationId, int status, long userId,
				OrderByComparator<ExplosivesApplication> orderByComparator)
		throws NoSuchExplosivesApplicationException {

		ExplosivesApplication explosivesApplication = findByPrimaryKey(
			explosivesApplicationId);

		Session session = null;

		try {
			session = openSession();

			ExplosivesApplication[] array = new ExplosivesApplicationImpl[3];

			array[0] = getBygetExplosiveAppByStatusUser_PrevAndNext(
				session, explosivesApplication, status, userId,
				orderByComparator, true);

			array[1] = explosivesApplication;

			array[2] = getBygetExplosiveAppByStatusUser_PrevAndNext(
				session, explosivesApplication, status, userId,
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

	protected ExplosivesApplication
		getBygetExplosiveAppByStatusUser_PrevAndNext(
			Session session, ExplosivesApplication explosivesApplication,
			int status, long userId,
			OrderByComparator<ExplosivesApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_EXPLOSIVESAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETEXPLOSIVEAPPBYSTATUSUSER_STATUS_2);

		sb.append(_FINDER_COLUMN_GETEXPLOSIVEAPPBYSTATUSUSER_USERID_2);

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
			sb.append(ExplosivesApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(status);

		queryPos.add(userId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						explosivesApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ExplosivesApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the explosives applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	@Override
	public void removeBygetExplosiveAppByStatusUser(int status, long userId) {
		for (ExplosivesApplication explosivesApplication :
				findBygetExplosiveAppByStatusUser(
					status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(explosivesApplication);
		}
	}

	/**
	 * Returns the number of explosives applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching explosives applications
	 */
	@Override
	public int countBygetExplosiveAppByStatusUser(int status, long userId) {
		FinderPath finderPath = _finderPathCountBygetExplosiveAppByStatusUser;

		Object[] finderArgs = new Object[] {status, userId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_EXPLOSIVESAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETEXPLOSIVEAPPBYSTATUSUSER_STATUS_2);

			sb.append(_FINDER_COLUMN_GETEXPLOSIVEAPPBYSTATUSUSER_USERID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				queryPos.add(userId);

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
		_FINDER_COLUMN_GETEXPLOSIVEAPPBYSTATUSUSER_STATUS_2 =
			"explosivesApplication.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETEXPLOSIVEAPPBYSTATUSUSER_USERID_2 =
			"explosivesApplication.userId = ?";

	private FinderPath _finderPathWithPaginationFindBygetExplosiveByStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetExplosiveByStatus;
	private FinderPath _finderPathCountBygetExplosiveByStatus;

	/**
	 * Returns all the explosives applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching explosives applications
	 */
	@Override
	public List<ExplosivesApplication> findBygetExplosiveByStatus(int status) {
		return findBygetExplosiveByStatus(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the explosives applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @return the range of matching explosives applications
	 */
	@Override
	public List<ExplosivesApplication> findBygetExplosiveByStatus(
		int status, int start, int end) {

		return findBygetExplosiveByStatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the explosives applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosives applications
	 */
	@Override
	public List<ExplosivesApplication> findBygetExplosiveByStatus(
		int status, int start, int end,
		OrderByComparator<ExplosivesApplication> orderByComparator) {

		return findBygetExplosiveByStatus(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the explosives applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosives applications
	 */
	@Override
	public List<ExplosivesApplication> findBygetExplosiveByStatus(
		int status, int start, int end,
		OrderByComparator<ExplosivesApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetExplosiveByStatus;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetExplosiveByStatus;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<ExplosivesApplication> list = null;

		if (useFinderCache) {
			list = (List<ExplosivesApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ExplosivesApplication explosivesApplication : list) {
					if (status != explosivesApplication.getStatus()) {
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

			sb.append(_SQL_SELECT_EXPLOSIVESAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETEXPLOSIVEBYSTATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ExplosivesApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				list = (List<ExplosivesApplication>)QueryUtil.list(
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
	 * Returns the first explosives application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	@Override
	public ExplosivesApplication findBygetExplosiveByStatus_First(
			int status,
			OrderByComparator<ExplosivesApplication> orderByComparator)
		throws NoSuchExplosivesApplicationException {

		ExplosivesApplication explosivesApplication =
			fetchBygetExplosiveByStatus_First(status, orderByComparator);

		if (explosivesApplication != null) {
			return explosivesApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchExplosivesApplicationException(sb.toString());
	}

	/**
	 * Returns the first explosives application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	@Override
	public ExplosivesApplication fetchBygetExplosiveByStatus_First(
		int status,
		OrderByComparator<ExplosivesApplication> orderByComparator) {

		List<ExplosivesApplication> list = findBygetExplosiveByStatus(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last explosives application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	@Override
	public ExplosivesApplication findBygetExplosiveByStatus_Last(
			int status,
			OrderByComparator<ExplosivesApplication> orderByComparator)
		throws NoSuchExplosivesApplicationException {

		ExplosivesApplication explosivesApplication =
			fetchBygetExplosiveByStatus_Last(status, orderByComparator);

		if (explosivesApplication != null) {
			return explosivesApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchExplosivesApplicationException(sb.toString());
	}

	/**
	 * Returns the last explosives application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	@Override
	public ExplosivesApplication fetchBygetExplosiveByStatus_Last(
		int status,
		OrderByComparator<ExplosivesApplication> orderByComparator) {

		int count = countBygetExplosiveByStatus(status);

		if (count == 0) {
			return null;
		}

		List<ExplosivesApplication> list = findBygetExplosiveByStatus(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the explosives applications before and after the current explosives application in the ordered set where status = &#63;.
	 *
	 * @param explosivesApplicationId the primary key of the current explosives application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosives application
	 * @throws NoSuchExplosivesApplicationException if a explosives application with the primary key could not be found
	 */
	@Override
	public ExplosivesApplication[] findBygetExplosiveByStatus_PrevAndNext(
			long explosivesApplicationId, int status,
			OrderByComparator<ExplosivesApplication> orderByComparator)
		throws NoSuchExplosivesApplicationException {

		ExplosivesApplication explosivesApplication = findByPrimaryKey(
			explosivesApplicationId);

		Session session = null;

		try {
			session = openSession();

			ExplosivesApplication[] array = new ExplosivesApplicationImpl[3];

			array[0] = getBygetExplosiveByStatus_PrevAndNext(
				session, explosivesApplication, status, orderByComparator,
				true);

			array[1] = explosivesApplication;

			array[2] = getBygetExplosiveByStatus_PrevAndNext(
				session, explosivesApplication, status, orderByComparator,
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

	protected ExplosivesApplication getBygetExplosiveByStatus_PrevAndNext(
		Session session, ExplosivesApplication explosivesApplication,
		int status, OrderByComparator<ExplosivesApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_EXPLOSIVESAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETEXPLOSIVEBYSTATUS_STATUS_2);

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
			sb.append(ExplosivesApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(status);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						explosivesApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ExplosivesApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the explosives applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetExplosiveByStatus(int status) {
		for (ExplosivesApplication explosivesApplication :
				findBygetExplosiveByStatus(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(explosivesApplication);
		}
	}

	/**
	 * Returns the number of explosives applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching explosives applications
	 */
	@Override
	public int countBygetExplosiveByStatus(int status) {
		FinderPath finderPath = _finderPathCountBygetExplosiveByStatus;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EXPLOSIVESAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETEXPLOSIVEBYSTATUS_STATUS_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

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

	private static final String _FINDER_COLUMN_GETEXPLOSIVEBYSTATUS_STATUS_2 =
		"explosivesApplication.status = ?";

	private FinderPath _finderPathFetchBygetExplosiveByAppNo;
	private FinderPath _finderPathCountBygetExplosiveByAppNo;

	/**
	 * Returns the explosives application where applicationNumber = &#63; or throws a <code>NoSuchExplosivesApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	@Override
	public ExplosivesApplication findBygetExplosiveByAppNo(
			String applicationNumber)
		throws NoSuchExplosivesApplicationException {

		ExplosivesApplication explosivesApplication =
			fetchBygetExplosiveByAppNo(applicationNumber);

		if (explosivesApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("applicationNumber=");
			sb.append(applicationNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchExplosivesApplicationException(sb.toString());
		}

		return explosivesApplication;
	}

	/**
	 * Returns the explosives application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	@Override
	public ExplosivesApplication fetchBygetExplosiveByAppNo(
		String applicationNumber) {

		return fetchBygetExplosiveByAppNo(applicationNumber, true);
	}

	/**
	 * Returns the explosives application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	@Override
	public ExplosivesApplication fetchBygetExplosiveByAppNo(
		String applicationNumber, boolean useFinderCache) {

		applicationNumber = Objects.toString(applicationNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {applicationNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetExplosiveByAppNo, finderArgs, this);
		}

		if (result instanceof ExplosivesApplication) {
			ExplosivesApplication explosivesApplication =
				(ExplosivesApplication)result;

			if (!Objects.equals(
					applicationNumber,
					explosivesApplication.getApplicationNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_EXPLOSIVESAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETEXPLOSIVEBYAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(
					_FINDER_COLUMN_GETEXPLOSIVEBYAPPNO_APPLICATIONNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindApplicationNumber) {
					queryPos.add(applicationNumber);
				}

				List<ExplosivesApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetExplosiveByAppNo, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {applicationNumber};
							}

							_log.warn(
								"ExplosivesApplicationPersistenceImpl.fetchBygetExplosiveByAppNo(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ExplosivesApplication explosivesApplication = list.get(0);

					result = explosivesApplication;

					cacheResult(explosivesApplication);
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
			return (ExplosivesApplication)result;
		}
	}

	/**
	 * Removes the explosives application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the explosives application that was removed
	 */
	@Override
	public ExplosivesApplication removeBygetExplosiveByAppNo(
			String applicationNumber)
		throws NoSuchExplosivesApplicationException {

		ExplosivesApplication explosivesApplication = findBygetExplosiveByAppNo(
			applicationNumber);

		return remove(explosivesApplication);
	}

	/**
	 * Returns the number of explosives applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching explosives applications
	 */
	@Override
	public int countBygetExplosiveByAppNo(String applicationNumber) {
		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath = _finderPathCountBygetExplosiveByAppNo;

		Object[] finderArgs = new Object[] {applicationNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EXPLOSIVESAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETEXPLOSIVEBYAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(
					_FINDER_COLUMN_GETEXPLOSIVEBYAPPNO_APPLICATIONNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindApplicationNumber) {
					queryPos.add(applicationNumber);
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
		_FINDER_COLUMN_GETEXPLOSIVEBYAPPNO_APPLICATIONNUMBER_2 =
			"explosivesApplication.applicationNumber = ?";

	private static final String
		_FINDER_COLUMN_GETEXPLOSIVEBYAPPNO_APPLICATIONNUMBER_3 =
			"(explosivesApplication.applicationNumber IS NULL OR explosivesApplication.applicationNumber = '')";

	private FinderPath _finderPathFetchBygetExplosiveByCaseId;
	private FinderPath _finderPathCountBygetExplosiveByCaseId;

	/**
	 * Returns the explosives application where caseId = &#63; or throws a <code>NoSuchExplosivesApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	@Override
	public ExplosivesApplication findBygetExplosiveByCaseId(String caseId)
		throws NoSuchExplosivesApplicationException {

		ExplosivesApplication explosivesApplication =
			fetchBygetExplosiveByCaseId(caseId);

		if (explosivesApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchExplosivesApplicationException(sb.toString());
		}

		return explosivesApplication;
	}

	/**
	 * Returns the explosives application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	@Override
	public ExplosivesApplication fetchBygetExplosiveByCaseId(String caseId) {
		return fetchBygetExplosiveByCaseId(caseId, true);
	}

	/**
	 * Returns the explosives application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	@Override
	public ExplosivesApplication fetchBygetExplosiveByCaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetExplosiveByCaseId, finderArgs, this);
		}

		if (result instanceof ExplosivesApplication) {
			ExplosivesApplication explosivesApplication =
				(ExplosivesApplication)result;

			if (!Objects.equals(caseId, explosivesApplication.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_EXPLOSIVESAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETEXPLOSIVEBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETEXPLOSIVEBYCASEID_CASEID_2);
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

				List<ExplosivesApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetExplosiveByCaseId, finderArgs,
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
								"ExplosivesApplicationPersistenceImpl.fetchBygetExplosiveByCaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ExplosivesApplication explosivesApplication = list.get(0);

					result = explosivesApplication;

					cacheResult(explosivesApplication);
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
			return (ExplosivesApplication)result;
		}
	}

	/**
	 * Removes the explosives application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the explosives application that was removed
	 */
	@Override
	public ExplosivesApplication removeBygetExplosiveByCaseId(String caseId)
		throws NoSuchExplosivesApplicationException {

		ExplosivesApplication explosivesApplication =
			findBygetExplosiveByCaseId(caseId);

		return remove(explosivesApplication);
	}

	/**
	 * Returns the number of explosives applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching explosives applications
	 */
	@Override
	public int countBygetExplosiveByCaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetExplosiveByCaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EXPLOSIVESAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETEXPLOSIVEBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETEXPLOSIVEBYCASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETEXPLOSIVEBYCASEID_CASEID_2 =
		"explosivesApplication.caseId = ?";

	private static final String _FINDER_COLUMN_GETEXPLOSIVEBYCASEID_CASEID_3 =
		"(explosivesApplication.caseId IS NULL OR explosivesApplication.caseId = '')";

	private FinderPath _finderPathFetchBygetExplosiveRegstBy_CaseId;
	private FinderPath _finderPathCountBygetExplosiveRegstBy_CaseId;

	/**
	 * Returns the explosives application where caseId = &#63; or throws a <code>NoSuchExplosivesApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	@Override
	public ExplosivesApplication findBygetExplosiveRegstBy_CaseId(String caseId)
		throws NoSuchExplosivesApplicationException {

		ExplosivesApplication explosivesApplication =
			fetchBygetExplosiveRegstBy_CaseId(caseId);

		if (explosivesApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchExplosivesApplicationException(sb.toString());
		}

		return explosivesApplication;
	}

	/**
	 * Returns the explosives application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	@Override
	public ExplosivesApplication fetchBygetExplosiveRegstBy_CaseId(
		String caseId) {

		return fetchBygetExplosiveRegstBy_CaseId(caseId, true);
	}

	/**
	 * Returns the explosives application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	@Override
	public ExplosivesApplication fetchBygetExplosiveRegstBy_CaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetExplosiveRegstBy_CaseId, finderArgs, this);
		}

		if (result instanceof ExplosivesApplication) {
			ExplosivesApplication explosivesApplication =
				(ExplosivesApplication)result;

			if (!Objects.equals(caseId, explosivesApplication.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_EXPLOSIVESAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETEXPLOSIVEREGSTBY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETEXPLOSIVEREGSTBY_CASEID_CASEID_2);
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

				List<ExplosivesApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetExplosiveRegstBy_CaseId,
							finderArgs, list);
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
								"ExplosivesApplicationPersistenceImpl.fetchBygetExplosiveRegstBy_CaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ExplosivesApplication explosivesApplication = list.get(0);

					result = explosivesApplication;

					cacheResult(explosivesApplication);
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
			return (ExplosivesApplication)result;
		}
	}

	/**
	 * Removes the explosives application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the explosives application that was removed
	 */
	@Override
	public ExplosivesApplication removeBygetExplosiveRegstBy_CaseId(
			String caseId)
		throws NoSuchExplosivesApplicationException {

		ExplosivesApplication explosivesApplication =
			findBygetExplosiveRegstBy_CaseId(caseId);

		return remove(explosivesApplication);
	}

	/**
	 * Returns the number of explosives applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching explosives applications
	 */
	@Override
	public int countBygetExplosiveRegstBy_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetExplosiveRegstBy_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EXPLOSIVESAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETEXPLOSIVEREGSTBY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETEXPLOSIVEREGSTBY_CASEID_CASEID_2);
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

	private static final String
		_FINDER_COLUMN_GETEXPLOSIVEREGSTBY_CASEID_CASEID_2 =
			"explosivesApplication.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETEXPLOSIVEREGSTBY_CASEID_CASEID_3 =
			"(explosivesApplication.caseId IS NULL OR explosivesApplication.caseId = '')";

	private FinderPath _finderPathFetchBygetExplosiveRegstByAT_AppNo;
	private FinderPath _finderPathCountBygetExplosiveRegstByAT_AppNo;

	/**
	 * Returns the explosives application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchExplosivesApplicationException</code> if it could not be found.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	@Override
	public ExplosivesApplication findBygetExplosiveRegstByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws NoSuchExplosivesApplicationException {

		ExplosivesApplication explosivesApplication =
			fetchBygetExplosiveRegstByAT_AppNo(
				typeOfTransaction, expiredLicenseAppNumber);

		if (explosivesApplication == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("typeOfTransaction=");
			sb.append(typeOfTransaction);

			sb.append(", expiredLicenseAppNumber=");
			sb.append(expiredLicenseAppNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchExplosivesApplicationException(sb.toString());
		}

		return explosivesApplication;
	}

	/**
	 * Returns the explosives application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	@Override
	public ExplosivesApplication fetchBygetExplosiveRegstByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber) {

		return fetchBygetExplosiveRegstByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber, true);
	}

	/**
	 * Returns the explosives application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	@Override
	public ExplosivesApplication fetchBygetExplosiveRegstByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber,
		boolean useFinderCache) {

		typeOfTransaction = Objects.toString(typeOfTransaction, "");
		expiredLicenseAppNumber = Objects.toString(expiredLicenseAppNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {
				typeOfTransaction, expiredLicenseAppNumber
			};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetExplosiveRegstByAT_AppNo, finderArgs,
				this);
		}

		if (result instanceof ExplosivesApplication) {
			ExplosivesApplication explosivesApplication =
				(ExplosivesApplication)result;

			if (!Objects.equals(
					typeOfTransaction,
					explosivesApplication.getTypeOfTransaction()) ||
				!Objects.equals(
					expiredLicenseAppNumber,
					explosivesApplication.getExpiredLicenseAppNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_EXPLOSIVESAPPLICATION_WHERE);

			boolean bindTypeOfTransaction = false;

			if (typeOfTransaction.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETEXPLOSIVEREGSTBYAT_APPNO_TYPEOFTRANSACTION_3);
			}
			else {
				bindTypeOfTransaction = true;

				sb.append(
					_FINDER_COLUMN_GETEXPLOSIVEREGSTBYAT_APPNO_TYPEOFTRANSACTION_2);
			}

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETEXPLOSIVEREGSTBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETEXPLOSIVEREGSTBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindTypeOfTransaction) {
					queryPos.add(typeOfTransaction);
				}

				if (bindExpiredLicenseAppNumber) {
					queryPos.add(expiredLicenseAppNumber);
				}

				List<ExplosivesApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetExplosiveRegstByAT_AppNo,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									typeOfTransaction, expiredLicenseAppNumber
								};
							}

							_log.warn(
								"ExplosivesApplicationPersistenceImpl.fetchBygetExplosiveRegstByAT_AppNo(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ExplosivesApplication explosivesApplication = list.get(0);

					result = explosivesApplication;

					cacheResult(explosivesApplication);
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
			return (ExplosivesApplication)result;
		}
	}

	/**
	 * Removes the explosives application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the explosives application that was removed
	 */
	@Override
	public ExplosivesApplication removeBygetExplosiveRegstByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws NoSuchExplosivesApplicationException {

		ExplosivesApplication explosivesApplication =
			findBygetExplosiveRegstByAT_AppNo(
				typeOfTransaction, expiredLicenseAppNumber);

		return remove(explosivesApplication);
	}

	/**
	 * Returns the number of explosives applications where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching explosives applications
	 */
	@Override
	public int countBygetExplosiveRegstByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber) {

		typeOfTransaction = Objects.toString(typeOfTransaction, "");
		expiredLicenseAppNumber = Objects.toString(expiredLicenseAppNumber, "");

		FinderPath finderPath = _finderPathCountBygetExplosiveRegstByAT_AppNo;

		Object[] finderArgs = new Object[] {
			typeOfTransaction, expiredLicenseAppNumber
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_EXPLOSIVESAPPLICATION_WHERE);

			boolean bindTypeOfTransaction = false;

			if (typeOfTransaction.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETEXPLOSIVEREGSTBYAT_APPNO_TYPEOFTRANSACTION_3);
			}
			else {
				bindTypeOfTransaction = true;

				sb.append(
					_FINDER_COLUMN_GETEXPLOSIVEREGSTBYAT_APPNO_TYPEOFTRANSACTION_2);
			}

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETEXPLOSIVEREGSTBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETEXPLOSIVEREGSTBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindTypeOfTransaction) {
					queryPos.add(typeOfTransaction);
				}

				if (bindExpiredLicenseAppNumber) {
					queryPos.add(expiredLicenseAppNumber);
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
		_FINDER_COLUMN_GETEXPLOSIVEREGSTBYAT_APPNO_TYPEOFTRANSACTION_2 =
			"explosivesApplication.typeOfTransaction = ? AND ";

	private static final String
		_FINDER_COLUMN_GETEXPLOSIVEREGSTBYAT_APPNO_TYPEOFTRANSACTION_3 =
			"(explosivesApplication.typeOfTransaction IS NULL OR explosivesApplication.typeOfTransaction = '') AND ";

	private static final String
		_FINDER_COLUMN_GETEXPLOSIVEREGSTBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_2 =
			"explosivesApplication.expiredLicenseAppNumber = ?";

	private static final String
		_FINDER_COLUMN_GETEXPLOSIVEREGSTBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_3 =
			"(explosivesApplication.expiredLicenseAppNumber IS NULL OR explosivesApplication.expiredLicenseAppNumber = '')";

	public ExplosivesApplicationPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(ExplosivesApplication.class);

		setModelImplClass(ExplosivesApplicationImpl.class);
		setModelPKClass(long.class);

		setTable(ExplosivesApplicationTable.INSTANCE);
	}

	/**
	 * Caches the explosives application in the entity cache if it is enabled.
	 *
	 * @param explosivesApplication the explosives application
	 */
	@Override
	public void cacheResult(ExplosivesApplication explosivesApplication) {
		entityCache.putResult(
			ExplosivesApplicationImpl.class,
			explosivesApplication.getPrimaryKey(), explosivesApplication);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				explosivesApplication.getUuid(),
				explosivesApplication.getGroupId()
			},
			explosivesApplication);

		finderCache.putResult(
			_finderPathFetchBygetExplosiveById,
			new Object[] {explosivesApplication.getExplosivesApplicationId()},
			explosivesApplication);

		finderCache.putResult(
			_finderPathFetchBygetExplosiveByAppNo,
			new Object[] {explosivesApplication.getApplicationNumber()},
			explosivesApplication);

		finderCache.putResult(
			_finderPathFetchBygetExplosiveByCaseId,
			new Object[] {explosivesApplication.getCaseId()},
			explosivesApplication);

		finderCache.putResult(
			_finderPathFetchBygetExplosiveRegstBy_CaseId,
			new Object[] {explosivesApplication.getCaseId()},
			explosivesApplication);

		finderCache.putResult(
			_finderPathFetchBygetExplosiveRegstByAT_AppNo,
			new Object[] {
				explosivesApplication.getTypeOfTransaction(),
				explosivesApplication.getExpiredLicenseAppNumber()
			},
			explosivesApplication);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the explosives applications in the entity cache if it is enabled.
	 *
	 * @param explosivesApplications the explosives applications
	 */
	@Override
	public void cacheResult(
		List<ExplosivesApplication> explosivesApplications) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (explosivesApplications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (ExplosivesApplication explosivesApplication :
				explosivesApplications) {

			if (entityCache.getResult(
					ExplosivesApplicationImpl.class,
					explosivesApplication.getPrimaryKey()) == null) {

				cacheResult(explosivesApplication);
			}
		}
	}

	/**
	 * Clears the cache for all explosives applications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ExplosivesApplicationImpl.class);

		finderCache.clearCache(ExplosivesApplicationImpl.class);
	}

	/**
	 * Clears the cache for the explosives application.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ExplosivesApplication explosivesApplication) {
		entityCache.removeResult(
			ExplosivesApplicationImpl.class, explosivesApplication);
	}

	@Override
	public void clearCache(List<ExplosivesApplication> explosivesApplications) {
		for (ExplosivesApplication explosivesApplication :
				explosivesApplications) {

			entityCache.removeResult(
				ExplosivesApplicationImpl.class, explosivesApplication);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ExplosivesApplicationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				ExplosivesApplicationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		ExplosivesApplicationModelImpl explosivesApplicationModelImpl) {

		Object[] args = new Object[] {
			explosivesApplicationModelImpl.getUuid(),
			explosivesApplicationModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, explosivesApplicationModelImpl);

		args = new Object[] {
			explosivesApplicationModelImpl.getExplosivesApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetExplosiveById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetExplosiveById, args,
			explosivesApplicationModelImpl);

		args = new Object[] {
			explosivesApplicationModelImpl.getApplicationNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetExplosiveByAppNo, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetExplosiveByAppNo, args,
			explosivesApplicationModelImpl);

		args = new Object[] {explosivesApplicationModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetExplosiveByCaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetExplosiveByCaseId, args,
			explosivesApplicationModelImpl);

		args = new Object[] {explosivesApplicationModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetExplosiveRegstBy_CaseId, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetExplosiveRegstBy_CaseId, args,
			explosivesApplicationModelImpl);

		args = new Object[] {
			explosivesApplicationModelImpl.getTypeOfTransaction(),
			explosivesApplicationModelImpl.getExpiredLicenseAppNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetExplosiveRegstByAT_AppNo, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetExplosiveRegstByAT_AppNo, args,
			explosivesApplicationModelImpl);
	}

	/**
	 * Creates a new explosives application with the primary key. Does not add the explosives application to the database.
	 *
	 * @param explosivesApplicationId the primary key for the new explosives application
	 * @return the new explosives application
	 */
	@Override
	public ExplosivesApplication create(long explosivesApplicationId) {
		ExplosivesApplication explosivesApplication =
			new ExplosivesApplicationImpl();

		explosivesApplication.setNew(true);
		explosivesApplication.setPrimaryKey(explosivesApplicationId);

		String uuid = PortalUUIDUtil.generate();

		explosivesApplication.setUuid(uuid);

		explosivesApplication.setCompanyId(CompanyThreadLocal.getCompanyId());

		return explosivesApplication;
	}

	/**
	 * Removes the explosives application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param explosivesApplicationId the primary key of the explosives application
	 * @return the explosives application that was removed
	 * @throws NoSuchExplosivesApplicationException if a explosives application with the primary key could not be found
	 */
	@Override
	public ExplosivesApplication remove(long explosivesApplicationId)
		throws NoSuchExplosivesApplicationException {

		return remove((Serializable)explosivesApplicationId);
	}

	/**
	 * Removes the explosives application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the explosives application
	 * @return the explosives application that was removed
	 * @throws NoSuchExplosivesApplicationException if a explosives application with the primary key could not be found
	 */
	@Override
	public ExplosivesApplication remove(Serializable primaryKey)
		throws NoSuchExplosivesApplicationException {

		Session session = null;

		try {
			session = openSession();

			ExplosivesApplication explosivesApplication =
				(ExplosivesApplication)session.get(
					ExplosivesApplicationImpl.class, primaryKey);

			if (explosivesApplication == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchExplosivesApplicationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(explosivesApplication);
		}
		catch (NoSuchExplosivesApplicationException noSuchEntityException) {
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
	protected ExplosivesApplication removeImpl(
		ExplosivesApplication explosivesApplication) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(explosivesApplication)) {
				explosivesApplication = (ExplosivesApplication)session.get(
					ExplosivesApplicationImpl.class,
					explosivesApplication.getPrimaryKeyObj());
			}

			if (explosivesApplication != null) {
				session.delete(explosivesApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (explosivesApplication != null) {
			clearCache(explosivesApplication);
		}

		return explosivesApplication;
	}

	@Override
	public ExplosivesApplication updateImpl(
		ExplosivesApplication explosivesApplication) {

		boolean isNew = explosivesApplication.isNew();

		if (!(explosivesApplication instanceof
				ExplosivesApplicationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(explosivesApplication.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					explosivesApplication);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in explosivesApplication proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ExplosivesApplication implementation " +
					explosivesApplication.getClass());
		}

		ExplosivesApplicationModelImpl explosivesApplicationModelImpl =
			(ExplosivesApplicationModelImpl)explosivesApplication;

		if (Validator.isNull(explosivesApplication.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			explosivesApplication.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (explosivesApplication.getCreateDate() == null)) {
			if (serviceContext == null) {
				explosivesApplication.setCreateDate(date);
			}
			else {
				explosivesApplication.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!explosivesApplicationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				explosivesApplication.setModifiedDate(date);
			}
			else {
				explosivesApplication.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(explosivesApplication);
			}
			else {
				explosivesApplication = (ExplosivesApplication)session.merge(
					explosivesApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ExplosivesApplicationImpl.class, explosivesApplicationModelImpl,
			false, true);

		cacheUniqueFindersCache(explosivesApplicationModelImpl);

		if (isNew) {
			explosivesApplication.setNew(false);
		}

		explosivesApplication.resetOriginalValues();

		return explosivesApplication;
	}

	/**
	 * Returns the explosives application with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the explosives application
	 * @return the explosives application
	 * @throws NoSuchExplosivesApplicationException if a explosives application with the primary key could not be found
	 */
	@Override
	public ExplosivesApplication findByPrimaryKey(Serializable primaryKey)
		throws NoSuchExplosivesApplicationException {

		ExplosivesApplication explosivesApplication = fetchByPrimaryKey(
			primaryKey);

		if (explosivesApplication == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchExplosivesApplicationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return explosivesApplication;
	}

	/**
	 * Returns the explosives application with the primary key or throws a <code>NoSuchExplosivesApplicationException</code> if it could not be found.
	 *
	 * @param explosivesApplicationId the primary key of the explosives application
	 * @return the explosives application
	 * @throws NoSuchExplosivesApplicationException if a explosives application with the primary key could not be found
	 */
	@Override
	public ExplosivesApplication findByPrimaryKey(long explosivesApplicationId)
		throws NoSuchExplosivesApplicationException {

		return findByPrimaryKey((Serializable)explosivesApplicationId);
	}

	/**
	 * Returns the explosives application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param explosivesApplicationId the primary key of the explosives application
	 * @return the explosives application, or <code>null</code> if a explosives application with the primary key could not be found
	 */
	@Override
	public ExplosivesApplication fetchByPrimaryKey(
		long explosivesApplicationId) {

		return fetchByPrimaryKey((Serializable)explosivesApplicationId);
	}

	/**
	 * Returns all the explosives applications.
	 *
	 * @return the explosives applications
	 */
	@Override
	public List<ExplosivesApplication> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the explosives applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @return the range of explosives applications
	 */
	@Override
	public List<ExplosivesApplication> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the explosives applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of explosives applications
	 */
	@Override
	public List<ExplosivesApplication> findAll(
		int start, int end,
		OrderByComparator<ExplosivesApplication> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the explosives applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of explosives applications
	 */
	@Override
	public List<ExplosivesApplication> findAll(
		int start, int end,
		OrderByComparator<ExplosivesApplication> orderByComparator,
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

		List<ExplosivesApplication> list = null;

		if (useFinderCache) {
			list = (List<ExplosivesApplication>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_EXPLOSIVESAPPLICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_EXPLOSIVESAPPLICATION;

				sql = sql.concat(ExplosivesApplicationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ExplosivesApplication>)QueryUtil.list(
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
	 * Removes all the explosives applications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ExplosivesApplication explosivesApplication : findAll()) {
			remove(explosivesApplication);
		}
	}

	/**
	 * Returns the number of explosives applications.
	 *
	 * @return the number of explosives applications
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
					_SQL_COUNT_EXPLOSIVESAPPLICATION);

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
		return "explosivesApplicationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_EXPLOSIVESAPPLICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ExplosivesApplicationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the explosives application persistence.
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

		_finderPathFetchBygetExplosiveById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetExplosiveById",
			new String[] {Long.class.getName()},
			new String[] {"explosivesApplicationId"}, true);

		_finderPathCountBygetExplosiveById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetExplosiveById", new String[] {Long.class.getName()},
			new String[] {"explosivesApplicationId"}, false);

		_finderPathWithPaginationFindBygetExplosiveAppByStatusUser =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetExplosiveAppByStatusUser",
				new String[] {
					Integer.class.getName(), Long.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"status", "userId"}, true);

		_finderPathWithoutPaginationFindBygetExplosiveAppByStatusUser =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetExplosiveAppByStatusUser",
				new String[] {Integer.class.getName(), Long.class.getName()},
				new String[] {"status", "userId"}, true);

		_finderPathCountBygetExplosiveAppByStatusUser = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetExplosiveAppByStatusUser",
			new String[] {Integer.class.getName(), Long.class.getName()},
			new String[] {"status", "userId"}, false);

		_finderPathWithPaginationFindBygetExplosiveByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetExplosiveByStatus",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetExplosiveByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetExplosiveByStatus",
			new String[] {Integer.class.getName()}, new String[] {"status"},
			true);

		_finderPathCountBygetExplosiveByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetExplosiveByStatus",
			new String[] {Integer.class.getName()}, new String[] {"status"},
			false);

		_finderPathFetchBygetExplosiveByAppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetExplosiveByAppNo",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, true);

		_finderPathCountBygetExplosiveByAppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetExplosiveByAppNo", new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, false);

		_finderPathFetchBygetExplosiveByCaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetExplosiveByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetExplosiveByCaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetExplosiveByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathFetchBygetExplosiveRegstBy_CaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetExplosiveRegstBy_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetExplosiveRegstBy_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetExplosiveRegstBy_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathFetchBygetExplosiveRegstByAT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetExplosiveRegstByAT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"typeOfTransaction", "expiredLicenseAppNumber"},
			true);

		_finderPathCountBygetExplosiveRegstByAT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetExplosiveRegstByAT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"typeOfTransaction", "expiredLicenseAppNumber"},
			false);

		ExplosivesApplicationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		ExplosivesApplicationUtil.setPersistence(null);

		entityCache.removeCache(ExplosivesApplicationImpl.class.getName());
	}

	@Override
	@Reference(
		target = EXPLOSIVEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = EXPLOSIVEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = EXPLOSIVEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_EXPLOSIVESAPPLICATION =
		"SELECT explosivesApplication FROM ExplosivesApplication explosivesApplication";

	private static final String _SQL_SELECT_EXPLOSIVESAPPLICATION_WHERE =
		"SELECT explosivesApplication FROM ExplosivesApplication explosivesApplication WHERE ";

	private static final String _SQL_COUNT_EXPLOSIVESAPPLICATION =
		"SELECT COUNT(explosivesApplication) FROM ExplosivesApplication explosivesApplication";

	private static final String _SQL_COUNT_EXPLOSIVESAPPLICATION_WHERE =
		"SELECT COUNT(explosivesApplication) FROM ExplosivesApplication explosivesApplication WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"explosivesApplication.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ExplosivesApplication exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ExplosivesApplication exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ExplosivesApplicationPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}