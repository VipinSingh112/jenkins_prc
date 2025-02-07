/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.collaboration.services.service.persistence.impl;

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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import com.nbp.collaboration.services.exception.NoSuchCollobartionException;
import com.nbp.collaboration.services.model.Collobartion;
import com.nbp.collaboration.services.model.CollobartionTable;
import com.nbp.collaboration.services.model.impl.CollobartionImpl;
import com.nbp.collaboration.services.model.impl.CollobartionModelImpl;
import com.nbp.collaboration.services.service.persistence.CollobartionPersistence;
import com.nbp.collaboration.services.service.persistence.CollobartionUtil;
import com.nbp.collaboration.services.service.persistence.impl.constants.COLLABORATIONPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

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
 * The persistence implementation for the collobartion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CollobartionPersistence.class)
public class CollobartionPersistenceImpl
	extends BasePersistenceImpl<Collobartion>
	implements CollobartionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CollobartionUtil</code> to access the collobartion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CollobartionImpl.class.getName();

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
	 * Returns all the collobartions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching collobartions
	 */
	@Override
	public List<Collobartion> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the collobartions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @return the range of matching collobartions
	 */
	@Override
	public List<Collobartion> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the collobartions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching collobartions
	 */
	@Override
	public List<Collobartion> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Collobartion> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the collobartions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching collobartions
	 */
	@Override
	public List<Collobartion> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Collobartion> orderByComparator,
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

		List<Collobartion> list = null;

		if (useFinderCache) {
			list = (List<Collobartion>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Collobartion collobartion : list) {
					if (!uuid.equals(collobartion.getUuid())) {
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

			sb.append(_SQL_SELECT_COLLOBARTION_WHERE);

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
				sb.append(CollobartionModelImpl.ORDER_BY_JPQL);
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

				list = (List<Collobartion>)QueryUtil.list(
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
	 * Returns the first collobartion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	@Override
	public Collobartion findByUuid_First(
			String uuid, OrderByComparator<Collobartion> orderByComparator)
		throws NoSuchCollobartionException {

		Collobartion collobartion = fetchByUuid_First(uuid, orderByComparator);

		if (collobartion != null) {
			return collobartion;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchCollobartionException(sb.toString());
	}

	/**
	 * Returns the first collobartion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	@Override
	public Collobartion fetchByUuid_First(
		String uuid, OrderByComparator<Collobartion> orderByComparator) {

		List<Collobartion> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last collobartion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	@Override
	public Collobartion findByUuid_Last(
			String uuid, OrderByComparator<Collobartion> orderByComparator)
		throws NoSuchCollobartionException {

		Collobartion collobartion = fetchByUuid_Last(uuid, orderByComparator);

		if (collobartion != null) {
			return collobartion;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchCollobartionException(sb.toString());
	}

	/**
	 * Returns the last collobartion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	@Override
	public Collobartion fetchByUuid_Last(
		String uuid, OrderByComparator<Collobartion> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Collobartion> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the collobartions before and after the current collobartion in the ordered set where uuid = &#63;.
	 *
	 * @param collaborationId the primary key of the current collobartion
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next collobartion
	 * @throws NoSuchCollobartionException if a collobartion with the primary key could not be found
	 */
	@Override
	public Collobartion[] findByUuid_PrevAndNext(
			long collaborationId, String uuid,
			OrderByComparator<Collobartion> orderByComparator)
		throws NoSuchCollobartionException {

		uuid = Objects.toString(uuid, "");

		Collobartion collobartion = findByPrimaryKey(collaborationId);

		Session session = null;

		try {
			session = openSession();

			Collobartion[] array = new CollobartionImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, collobartion, uuid, orderByComparator, true);

			array[1] = collobartion;

			array[2] = getByUuid_PrevAndNext(
				session, collobartion, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Collobartion getByUuid_PrevAndNext(
		Session session, Collobartion collobartion, String uuid,
		OrderByComparator<Collobartion> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_COLLOBARTION_WHERE);

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
			sb.append(CollobartionModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(collobartion)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Collobartion> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the collobartions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Collobartion collobartion :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(collobartion);
		}
	}

	/**
	 * Returns the number of collobartions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching collobartions
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_COLLOBARTION_WHERE);

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
		"collobartion.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(collobartion.uuid IS NULL OR collobartion.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the collobartion where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCollobartionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	@Override
	public Collobartion findByUUID_G(String uuid, long groupId)
		throws NoSuchCollobartionException {

		Collobartion collobartion = fetchByUUID_G(uuid, groupId);

		if (collobartion == null) {
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

			throw new NoSuchCollobartionException(sb.toString());
		}

		return collobartion;
	}

	/**
	 * Returns the collobartion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	@Override
	public Collobartion fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the collobartion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	@Override
	public Collobartion fetchByUUID_G(
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

		if (result instanceof Collobartion) {
			Collobartion collobartion = (Collobartion)result;

			if (!Objects.equals(uuid, collobartion.getUuid()) ||
				(groupId != collobartion.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_COLLOBARTION_WHERE);

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

				List<Collobartion> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					Collobartion collobartion = list.get(0);

					result = collobartion;

					cacheResult(collobartion);
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
			return (Collobartion)result;
		}
	}

	/**
	 * Removes the collobartion where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the collobartion that was removed
	 */
	@Override
	public Collobartion removeByUUID_G(String uuid, long groupId)
		throws NoSuchCollobartionException {

		Collobartion collobartion = findByUUID_G(uuid, groupId);

		return remove(collobartion);
	}

	/**
	 * Returns the number of collobartions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching collobartions
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_COLLOBARTION_WHERE);

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
		"collobartion.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(collobartion.uuid IS NULL OR collobartion.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"collobartion.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the collobartions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching collobartions
	 */
	@Override
	public List<Collobartion> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the collobartions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @return the range of matching collobartions
	 */
	@Override
	public List<Collobartion> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the collobartions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching collobartions
	 */
	@Override
	public List<Collobartion> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Collobartion> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the collobartions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching collobartions
	 */
	@Override
	public List<Collobartion> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Collobartion> orderByComparator,
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

		List<Collobartion> list = null;

		if (useFinderCache) {
			list = (List<Collobartion>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Collobartion collobartion : list) {
					if (!uuid.equals(collobartion.getUuid()) ||
						(companyId != collobartion.getCompanyId())) {

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

			sb.append(_SQL_SELECT_COLLOBARTION_WHERE);

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
				sb.append(CollobartionModelImpl.ORDER_BY_JPQL);
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

				list = (List<Collobartion>)QueryUtil.list(
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
	 * Returns the first collobartion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	@Override
	public Collobartion findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Collobartion> orderByComparator)
		throws NoSuchCollobartionException {

		Collobartion collobartion = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (collobartion != null) {
			return collobartion;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchCollobartionException(sb.toString());
	}

	/**
	 * Returns the first collobartion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	@Override
	public Collobartion fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Collobartion> orderByComparator) {

		List<Collobartion> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last collobartion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	@Override
	public Collobartion findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Collobartion> orderByComparator)
		throws NoSuchCollobartionException {

		Collobartion collobartion = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (collobartion != null) {
			return collobartion;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchCollobartionException(sb.toString());
	}

	/**
	 * Returns the last collobartion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	@Override
	public Collobartion fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Collobartion> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<Collobartion> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the collobartions before and after the current collobartion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param collaborationId the primary key of the current collobartion
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next collobartion
	 * @throws NoSuchCollobartionException if a collobartion with the primary key could not be found
	 */
	@Override
	public Collobartion[] findByUuid_C_PrevAndNext(
			long collaborationId, String uuid, long companyId,
			OrderByComparator<Collobartion> orderByComparator)
		throws NoSuchCollobartionException {

		uuid = Objects.toString(uuid, "");

		Collobartion collobartion = findByPrimaryKey(collaborationId);

		Session session = null;

		try {
			session = openSession();

			Collobartion[] array = new CollobartionImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, collobartion, uuid, companyId, orderByComparator,
				true);

			array[1] = collobartion;

			array[2] = getByUuid_C_PrevAndNext(
				session, collobartion, uuid, companyId, orderByComparator,
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

	protected Collobartion getByUuid_C_PrevAndNext(
		Session session, Collobartion collobartion, String uuid, long companyId,
		OrderByComparator<Collobartion> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_COLLOBARTION_WHERE);

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
			sb.append(CollobartionModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(collobartion)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Collobartion> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the collobartions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (Collobartion collobartion :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(collobartion);
		}
	}

	/**
	 * Returns the number of collobartions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching collobartions
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_COLLOBARTION_WHERE);

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
		"collobartion.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(collobartion.uuid IS NULL OR collobartion.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"collobartion.companyId = ?";

	private FinderPath _finderPathWithPaginationFindBycaseId;
	private FinderPath _finderPathWithoutPaginationFindBycaseId;
	private FinderPath _finderPathCountBycaseId;

	/**
	 * Returns all the collobartions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching collobartions
	 */
	@Override
	public List<Collobartion> findBycaseId(String caseId) {
		return findBycaseId(caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the collobartions where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @return the range of matching collobartions
	 */
	@Override
	public List<Collobartion> findBycaseId(String caseId, int start, int end) {
		return findBycaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the collobartions where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching collobartions
	 */
	@Override
	public List<Collobartion> findBycaseId(
		String caseId, int start, int end,
		OrderByComparator<Collobartion> orderByComparator) {

		return findBycaseId(caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the collobartions where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching collobartions
	 */
	@Override
	public List<Collobartion> findBycaseId(
		String caseId, int start, int end,
		OrderByComparator<Collobartion> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBycaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBycaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<Collobartion> list = null;

		if (useFinderCache) {
			list = (List<Collobartion>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Collobartion collobartion : list) {
					if (!caseId.equals(collobartion.getCaseId())) {
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

			sb.append(_SQL_SELECT_COLLOBARTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CollobartionModelImpl.ORDER_BY_JPQL);
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

				list = (List<Collobartion>)QueryUtil.list(
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
	 * Returns the first collobartion in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	@Override
	public Collobartion findBycaseId_First(
			String caseId, OrderByComparator<Collobartion> orderByComparator)
		throws NoSuchCollobartionException {

		Collobartion collobartion = fetchBycaseId_First(
			caseId, orderByComparator);

		if (collobartion != null) {
			return collobartion;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchCollobartionException(sb.toString());
	}

	/**
	 * Returns the first collobartion in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	@Override
	public Collobartion fetchBycaseId_First(
		String caseId, OrderByComparator<Collobartion> orderByComparator) {

		List<Collobartion> list = findBycaseId(caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last collobartion in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	@Override
	public Collobartion findBycaseId_Last(
			String caseId, OrderByComparator<Collobartion> orderByComparator)
		throws NoSuchCollobartionException {

		Collobartion collobartion = fetchBycaseId_Last(
			caseId, orderByComparator);

		if (collobartion != null) {
			return collobartion;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchCollobartionException(sb.toString());
	}

	/**
	 * Returns the last collobartion in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	@Override
	public Collobartion fetchBycaseId_Last(
		String caseId, OrderByComparator<Collobartion> orderByComparator) {

		int count = countBycaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<Collobartion> list = findBycaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the collobartions before and after the current collobartion in the ordered set where caseId = &#63;.
	 *
	 * @param collaborationId the primary key of the current collobartion
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next collobartion
	 * @throws NoSuchCollobartionException if a collobartion with the primary key could not be found
	 */
	@Override
	public Collobartion[] findBycaseId_PrevAndNext(
			long collaborationId, String caseId,
			OrderByComparator<Collobartion> orderByComparator)
		throws NoSuchCollobartionException {

		caseId = Objects.toString(caseId, "");

		Collobartion collobartion = findByPrimaryKey(collaborationId);

		Session session = null;

		try {
			session = openSession();

			Collobartion[] array = new CollobartionImpl[3];

			array[0] = getBycaseId_PrevAndNext(
				session, collobartion, caseId, orderByComparator, true);

			array[1] = collobartion;

			array[2] = getBycaseId_PrevAndNext(
				session, collobartion, caseId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Collobartion getBycaseId_PrevAndNext(
		Session session, Collobartion collobartion, String caseId,
		OrderByComparator<Collobartion> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_COLLOBARTION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_CASEID_CASEID_2);
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
			sb.append(CollobartionModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(collobartion)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Collobartion> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the collobartions where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBycaseId(String caseId) {
		for (Collobartion collobartion :
				findBycaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(collobartion);
		}
	}

	/**
	 * Returns the number of collobartions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching collobartions
	 */
	@Override
	public int countBycaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBycaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_COLLOBARTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_CASEID_CASEID_2 =
		"collobartion.caseId = ?";

	private static final String _FINDER_COLUMN_CASEID_CASEID_3 =
		"(collobartion.caseId IS NULL OR collobartion.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBystageName_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBystageName_CaseId;
	private FinderPath _finderPathCountBystageName_CaseId;

	/**
	 * Returns all the collobartions where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching collobartions
	 */
	@Override
	public List<Collobartion> findBystageName_CaseId(
		String caseId, String stageName) {

		return findBystageName_CaseId(
			caseId, stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the collobartions where caseId = &#63; and stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @return the range of matching collobartions
	 */
	@Override
	public List<Collobartion> findBystageName_CaseId(
		String caseId, String stageName, int start, int end) {

		return findBystageName_CaseId(caseId, stageName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the collobartions where caseId = &#63; and stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching collobartions
	 */
	@Override
	public List<Collobartion> findBystageName_CaseId(
		String caseId, String stageName, int start, int end,
		OrderByComparator<Collobartion> orderByComparator) {

		return findBystageName_CaseId(
			caseId, stageName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the collobartions where caseId = &#63; and stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching collobartions
	 */
	@Override
	public List<Collobartion> findBystageName_CaseId(
		String caseId, String stageName, int start, int end,
		OrderByComparator<Collobartion> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBystageName_CaseId;
				finderArgs = new Object[] {caseId, stageName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBystageName_CaseId;
			finderArgs = new Object[] {
				caseId, stageName, start, end, orderByComparator
			};
		}

		List<Collobartion> list = null;

		if (useFinderCache) {
			list = (List<Collobartion>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Collobartion collobartion : list) {
					if (!caseId.equals(collobartion.getCaseId()) ||
						!stageName.equals(collobartion.getStageName())) {

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

			sb.append(_SQL_SELECT_COLLOBARTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_STAGENAME_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_STAGENAME_CASEID_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_STAGENAME_CASEID_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_STAGENAME_CASEID_STAGENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CollobartionModelImpl.ORDER_BY_JPQL);
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

				list = (List<Collobartion>)QueryUtil.list(
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
	 * Returns the first collobartion in the ordered set where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	@Override
	public Collobartion findBystageName_CaseId_First(
			String caseId, String stageName,
			OrderByComparator<Collobartion> orderByComparator)
		throws NoSuchCollobartionException {

		Collobartion collobartion = fetchBystageName_CaseId_First(
			caseId, stageName, orderByComparator);

		if (collobartion != null) {
			return collobartion;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append(", stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchCollobartionException(sb.toString());
	}

	/**
	 * Returns the first collobartion in the ordered set where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	@Override
	public Collobartion fetchBystageName_CaseId_First(
		String caseId, String stageName,
		OrderByComparator<Collobartion> orderByComparator) {

		List<Collobartion> list = findBystageName_CaseId(
			caseId, stageName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last collobartion in the ordered set where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	@Override
	public Collobartion findBystageName_CaseId_Last(
			String caseId, String stageName,
			OrderByComparator<Collobartion> orderByComparator)
		throws NoSuchCollobartionException {

		Collobartion collobartion = fetchBystageName_CaseId_Last(
			caseId, stageName, orderByComparator);

		if (collobartion != null) {
			return collobartion;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append(", stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchCollobartionException(sb.toString());
	}

	/**
	 * Returns the last collobartion in the ordered set where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	@Override
	public Collobartion fetchBystageName_CaseId_Last(
		String caseId, String stageName,
		OrderByComparator<Collobartion> orderByComparator) {

		int count = countBystageName_CaseId(caseId, stageName);

		if (count == 0) {
			return null;
		}

		List<Collobartion> list = findBystageName_CaseId(
			caseId, stageName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the collobartions before and after the current collobartion in the ordered set where caseId = &#63; and stageName = &#63;.
	 *
	 * @param collaborationId the primary key of the current collobartion
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next collobartion
	 * @throws NoSuchCollobartionException if a collobartion with the primary key could not be found
	 */
	@Override
	public Collobartion[] findBystageName_CaseId_PrevAndNext(
			long collaborationId, String caseId, String stageName,
			OrderByComparator<Collobartion> orderByComparator)
		throws NoSuchCollobartionException {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		Collobartion collobartion = findByPrimaryKey(collaborationId);

		Session session = null;

		try {
			session = openSession();

			Collobartion[] array = new CollobartionImpl[3];

			array[0] = getBystageName_CaseId_PrevAndNext(
				session, collobartion, caseId, stageName, orderByComparator,
				true);

			array[1] = collobartion;

			array[2] = getBystageName_CaseId_PrevAndNext(
				session, collobartion, caseId, stageName, orderByComparator,
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

	protected Collobartion getBystageName_CaseId_PrevAndNext(
		Session session, Collobartion collobartion, String caseId,
		String stageName, OrderByComparator<Collobartion> orderByComparator,
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

		sb.append(_SQL_SELECT_COLLOBARTION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_STAGENAME_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_STAGENAME_CASEID_CASEID_2);
		}

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_STAGENAME_CASEID_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_STAGENAME_CASEID_STAGENAME_2);
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
			sb.append(CollobartionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindCaseId) {
			queryPos.add(caseId);
		}

		if (bindStageName) {
			queryPos.add(stageName);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(collobartion)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Collobartion> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the collobartions where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 */
	@Override
	public void removeBystageName_CaseId(String caseId, String stageName) {
		for (Collobartion collobartion :
				findBystageName_CaseId(
					caseId, stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(collobartion);
		}
	}

	/**
	 * Returns the number of collobartions where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching collobartions
	 */
	@Override
	public int countBystageName_CaseId(String caseId, String stageName) {
		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBystageName_CaseId;

		Object[] finderArgs = new Object[] {caseId, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_COLLOBARTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_STAGENAME_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_STAGENAME_CASEID_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_STAGENAME_CASEID_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_STAGENAME_CASEID_STAGENAME_2);
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

	private static final String _FINDER_COLUMN_STAGENAME_CASEID_CASEID_2 =
		"collobartion.caseId = ? AND ";

	private static final String _FINDER_COLUMN_STAGENAME_CASEID_CASEID_3 =
		"(collobartion.caseId IS NULL OR collobartion.caseId = '') AND ";

	private static final String _FINDER_COLUMN_STAGENAME_CASEID_STAGENAME_2 =
		"collobartion.stageName = ?";

	private static final String _FINDER_COLUMN_STAGENAME_CASEID_STAGENAME_3 =
		"(collobartion.stageName IS NULL OR collobartion.stageName = '')";

	private FinderPath _finderPathWithPaginationFindByStage_CU;
	private FinderPath _finderPathWithoutPaginationFindByStage_CU;
	private FinderPath _finderPathCountByStage_CU;

	/**
	 * Returns all the collobartions where caseId = &#63; and stageName = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @return the matching collobartions
	 */
	@Override
	public List<Collobartion> findByStage_CU(
		String caseId, String stageName, String userType) {

		return findByStage_CU(
			caseId, stageName, userType, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the collobartions where caseId = &#63; and stageName = &#63; and userType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @return the range of matching collobartions
	 */
	@Override
	public List<Collobartion> findByStage_CU(
		String caseId, String stageName, String userType, int start, int end) {

		return findByStage_CU(caseId, stageName, userType, start, end, null);
	}

	/**
	 * Returns an ordered range of all the collobartions where caseId = &#63; and stageName = &#63; and userType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching collobartions
	 */
	@Override
	public List<Collobartion> findByStage_CU(
		String caseId, String stageName, String userType, int start, int end,
		OrderByComparator<Collobartion> orderByComparator) {

		return findByStage_CU(
			caseId, stageName, userType, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the collobartions where caseId = &#63; and stageName = &#63; and userType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching collobartions
	 */
	@Override
	public List<Collobartion> findByStage_CU(
		String caseId, String stageName, String userType, int start, int end,
		OrderByComparator<Collobartion> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");
		userType = Objects.toString(userType, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByStage_CU;
				finderArgs = new Object[] {caseId, stageName, userType};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByStage_CU;
			finderArgs = new Object[] {
				caseId, stageName, userType, start, end, orderByComparator
			};
		}

		List<Collobartion> list = null;

		if (useFinderCache) {
			list = (List<Collobartion>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Collobartion collobartion : list) {
					if (!caseId.equals(collobartion.getCaseId()) ||
						!stageName.equals(collobartion.getStageName()) ||
						!userType.equals(collobartion.getUserType())) {

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
					5 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(5);
			}

			sb.append(_SQL_SELECT_COLLOBARTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_STAGE_CU_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_STAGE_CU_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_STAGE_CU_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_STAGE_CU_STAGENAME_2);
			}

			boolean bindUserType = false;

			if (userType.isEmpty()) {
				sb.append(_FINDER_COLUMN_STAGE_CU_USERTYPE_3);
			}
			else {
				bindUserType = true;

				sb.append(_FINDER_COLUMN_STAGE_CU_USERTYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CollobartionModelImpl.ORDER_BY_JPQL);
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

				if (bindUserType) {
					queryPos.add(userType);
				}

				list = (List<Collobartion>)QueryUtil.list(
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
	 * Returns the first collobartion in the ordered set where caseId = &#63; and stageName = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	@Override
	public Collobartion findByStage_CU_First(
			String caseId, String stageName, String userType,
			OrderByComparator<Collobartion> orderByComparator)
		throws NoSuchCollobartionException {

		Collobartion collobartion = fetchByStage_CU_First(
			caseId, stageName, userType, orderByComparator);

		if (collobartion != null) {
			return collobartion;
		}

		StringBundler sb = new StringBundler(8);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append(", stageName=");
		sb.append(stageName);

		sb.append(", userType=");
		sb.append(userType);

		sb.append("}");

		throw new NoSuchCollobartionException(sb.toString());
	}

	/**
	 * Returns the first collobartion in the ordered set where caseId = &#63; and stageName = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	@Override
	public Collobartion fetchByStage_CU_First(
		String caseId, String stageName, String userType,
		OrderByComparator<Collobartion> orderByComparator) {

		List<Collobartion> list = findByStage_CU(
			caseId, stageName, userType, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last collobartion in the ordered set where caseId = &#63; and stageName = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	@Override
	public Collobartion findByStage_CU_Last(
			String caseId, String stageName, String userType,
			OrderByComparator<Collobartion> orderByComparator)
		throws NoSuchCollobartionException {

		Collobartion collobartion = fetchByStage_CU_Last(
			caseId, stageName, userType, orderByComparator);

		if (collobartion != null) {
			return collobartion;
		}

		StringBundler sb = new StringBundler(8);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append(", stageName=");
		sb.append(stageName);

		sb.append(", userType=");
		sb.append(userType);

		sb.append("}");

		throw new NoSuchCollobartionException(sb.toString());
	}

	/**
	 * Returns the last collobartion in the ordered set where caseId = &#63; and stageName = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	@Override
	public Collobartion fetchByStage_CU_Last(
		String caseId, String stageName, String userType,
		OrderByComparator<Collobartion> orderByComparator) {

		int count = countByStage_CU(caseId, stageName, userType);

		if (count == 0) {
			return null;
		}

		List<Collobartion> list = findByStage_CU(
			caseId, stageName, userType, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the collobartions before and after the current collobartion in the ordered set where caseId = &#63; and stageName = &#63; and userType = &#63;.
	 *
	 * @param collaborationId the primary key of the current collobartion
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next collobartion
	 * @throws NoSuchCollobartionException if a collobartion with the primary key could not be found
	 */
	@Override
	public Collobartion[] findByStage_CU_PrevAndNext(
			long collaborationId, String caseId, String stageName,
			String userType, OrderByComparator<Collobartion> orderByComparator)
		throws NoSuchCollobartionException {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");
		userType = Objects.toString(userType, "");

		Collobartion collobartion = findByPrimaryKey(collaborationId);

		Session session = null;

		try {
			session = openSession();

			Collobartion[] array = new CollobartionImpl[3];

			array[0] = getByStage_CU_PrevAndNext(
				session, collobartion, caseId, stageName, userType,
				orderByComparator, true);

			array[1] = collobartion;

			array[2] = getByStage_CU_PrevAndNext(
				session, collobartion, caseId, stageName, userType,
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

	protected Collobartion getByStage_CU_PrevAndNext(
		Session session, Collobartion collobartion, String caseId,
		String stageName, String userType,
		OrderByComparator<Collobartion> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				6 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(5);
		}

		sb.append(_SQL_SELECT_COLLOBARTION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_STAGE_CU_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_STAGE_CU_CASEID_2);
		}

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_STAGE_CU_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_STAGE_CU_STAGENAME_2);
		}

		boolean bindUserType = false;

		if (userType.isEmpty()) {
			sb.append(_FINDER_COLUMN_STAGE_CU_USERTYPE_3);
		}
		else {
			bindUserType = true;

			sb.append(_FINDER_COLUMN_STAGE_CU_USERTYPE_2);
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
			sb.append(CollobartionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindCaseId) {
			queryPos.add(caseId);
		}

		if (bindStageName) {
			queryPos.add(stageName);
		}

		if (bindUserType) {
			queryPos.add(userType);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(collobartion)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Collobartion> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the collobartions where caseId = &#63; and stageName = &#63; and userType = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 */
	@Override
	public void removeByStage_CU(
		String caseId, String stageName, String userType) {

		for (Collobartion collobartion :
				findByStage_CU(
					caseId, stageName, userType, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(collobartion);
		}
	}

	/**
	 * Returns the number of collobartions where caseId = &#63; and stageName = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @return the number of matching collobartions
	 */
	@Override
	public int countByStage_CU(
		String caseId, String stageName, String userType) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");
		userType = Objects.toString(userType, "");

		FinderPath finderPath = _finderPathCountByStage_CU;

		Object[] finderArgs = new Object[] {caseId, stageName, userType};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_COLLOBARTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_STAGE_CU_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_STAGE_CU_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_STAGE_CU_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_STAGE_CU_STAGENAME_2);
			}

			boolean bindUserType = false;

			if (userType.isEmpty()) {
				sb.append(_FINDER_COLUMN_STAGE_CU_USERTYPE_3);
			}
			else {
				bindUserType = true;

				sb.append(_FINDER_COLUMN_STAGE_CU_USERTYPE_2);
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

				if (bindUserType) {
					queryPos.add(userType);
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

	private static final String _FINDER_COLUMN_STAGE_CU_CASEID_2 =
		"collobartion.caseId = ? AND ";

	private static final String _FINDER_COLUMN_STAGE_CU_CASEID_3 =
		"(collobartion.caseId IS NULL OR collobartion.caseId = '') AND ";

	private static final String _FINDER_COLUMN_STAGE_CU_STAGENAME_2 =
		"collobartion.stageName = ? AND ";

	private static final String _FINDER_COLUMN_STAGE_CU_STAGENAME_3 =
		"(collobartion.stageName IS NULL OR collobartion.stageName = '') AND ";

	private static final String _FINDER_COLUMN_STAGE_CU_USERTYPE_2 =
		"collobartion.userType = ?";

	private static final String _FINDER_COLUMN_STAGE_CU_USERTYPE_3 =
		"(collobartion.userType IS NULL OR collobartion.userType = '')";

	private FinderPath _finderPathWithPaginationFindByStage_CUA;
	private FinderPath _finderPathWithoutPaginationFindByStage_CUA;
	private FinderPath _finderPathCountByStage_CUA;

	/**
	 * Returns all the collobartions where caseId = &#63; and stageName = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param archived the archived
	 * @return the matching collobartions
	 */
	@Override
	public List<Collobartion> findByStage_CUA(
		String caseId, String stageName, String userType, int archived) {

		return findByStage_CUA(
			caseId, stageName, userType, archived, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the collobartions where caseId = &#63; and stageName = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param archived the archived
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @return the range of matching collobartions
	 */
	@Override
	public List<Collobartion> findByStage_CUA(
		String caseId, String stageName, String userType, int archived,
		int start, int end) {

		return findByStage_CUA(
			caseId, stageName, userType, archived, start, end, null);
	}

	/**
	 * Returns an ordered range of all the collobartions where caseId = &#63; and stageName = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param archived the archived
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching collobartions
	 */
	@Override
	public List<Collobartion> findByStage_CUA(
		String caseId, String stageName, String userType, int archived,
		int start, int end, OrderByComparator<Collobartion> orderByComparator) {

		return findByStage_CUA(
			caseId, stageName, userType, archived, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the collobartions where caseId = &#63; and stageName = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param archived the archived
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching collobartions
	 */
	@Override
	public List<Collobartion> findByStage_CUA(
		String caseId, String stageName, String userType, int archived,
		int start, int end, OrderByComparator<Collobartion> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");
		userType = Objects.toString(userType, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByStage_CUA;
				finderArgs = new Object[] {
					caseId, stageName, userType, archived
				};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByStage_CUA;
			finderArgs = new Object[] {
				caseId, stageName, userType, archived, start, end,
				orderByComparator
			};
		}

		List<Collobartion> list = null;

		if (useFinderCache) {
			list = (List<Collobartion>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Collobartion collobartion : list) {
					if (!caseId.equals(collobartion.getCaseId()) ||
						!stageName.equals(collobartion.getStageName()) ||
						!userType.equals(collobartion.getUserType()) ||
						(archived != collobartion.getArchived())) {

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
					6 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(6);
			}

			sb.append(_SQL_SELECT_COLLOBARTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_STAGE_CUA_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_STAGE_CUA_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_STAGE_CUA_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_STAGE_CUA_STAGENAME_2);
			}

			boolean bindUserType = false;

			if (userType.isEmpty()) {
				sb.append(_FINDER_COLUMN_STAGE_CUA_USERTYPE_3);
			}
			else {
				bindUserType = true;

				sb.append(_FINDER_COLUMN_STAGE_CUA_USERTYPE_2);
			}

			sb.append(_FINDER_COLUMN_STAGE_CUA_ARCHIVED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CollobartionModelImpl.ORDER_BY_JPQL);
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

				if (bindUserType) {
					queryPos.add(userType);
				}

				queryPos.add(archived);

				list = (List<Collobartion>)QueryUtil.list(
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
	 * Returns the first collobartion in the ordered set where caseId = &#63; and stageName = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	@Override
	public Collobartion findByStage_CUA_First(
			String caseId, String stageName, String userType, int archived,
			OrderByComparator<Collobartion> orderByComparator)
		throws NoSuchCollobartionException {

		Collobartion collobartion = fetchByStage_CUA_First(
			caseId, stageName, userType, archived, orderByComparator);

		if (collobartion != null) {
			return collobartion;
		}

		StringBundler sb = new StringBundler(10);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append(", stageName=");
		sb.append(stageName);

		sb.append(", userType=");
		sb.append(userType);

		sb.append(", archived=");
		sb.append(archived);

		sb.append("}");

		throw new NoSuchCollobartionException(sb.toString());
	}

	/**
	 * Returns the first collobartion in the ordered set where caseId = &#63; and stageName = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	@Override
	public Collobartion fetchByStage_CUA_First(
		String caseId, String stageName, String userType, int archived,
		OrderByComparator<Collobartion> orderByComparator) {

		List<Collobartion> list = findByStage_CUA(
			caseId, stageName, userType, archived, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last collobartion in the ordered set where caseId = &#63; and stageName = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	@Override
	public Collobartion findByStage_CUA_Last(
			String caseId, String stageName, String userType, int archived,
			OrderByComparator<Collobartion> orderByComparator)
		throws NoSuchCollobartionException {

		Collobartion collobartion = fetchByStage_CUA_Last(
			caseId, stageName, userType, archived, orderByComparator);

		if (collobartion != null) {
			return collobartion;
		}

		StringBundler sb = new StringBundler(10);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append(", stageName=");
		sb.append(stageName);

		sb.append(", userType=");
		sb.append(userType);

		sb.append(", archived=");
		sb.append(archived);

		sb.append("}");

		throw new NoSuchCollobartionException(sb.toString());
	}

	/**
	 * Returns the last collobartion in the ordered set where caseId = &#63; and stageName = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	@Override
	public Collobartion fetchByStage_CUA_Last(
		String caseId, String stageName, String userType, int archived,
		OrderByComparator<Collobartion> orderByComparator) {

		int count = countByStage_CUA(caseId, stageName, userType, archived);

		if (count == 0) {
			return null;
		}

		List<Collobartion> list = findByStage_CUA(
			caseId, stageName, userType, archived, count - 1, count,
			orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the collobartions before and after the current collobartion in the ordered set where caseId = &#63; and stageName = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param collaborationId the primary key of the current collobartion
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next collobartion
	 * @throws NoSuchCollobartionException if a collobartion with the primary key could not be found
	 */
	@Override
	public Collobartion[] findByStage_CUA_PrevAndNext(
			long collaborationId, String caseId, String stageName,
			String userType, int archived,
			OrderByComparator<Collobartion> orderByComparator)
		throws NoSuchCollobartionException {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");
		userType = Objects.toString(userType, "");

		Collobartion collobartion = findByPrimaryKey(collaborationId);

		Session session = null;

		try {
			session = openSession();

			Collobartion[] array = new CollobartionImpl[3];

			array[0] = getByStage_CUA_PrevAndNext(
				session, collobartion, caseId, stageName, userType, archived,
				orderByComparator, true);

			array[1] = collobartion;

			array[2] = getByStage_CUA_PrevAndNext(
				session, collobartion, caseId, stageName, userType, archived,
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

	protected Collobartion getByStage_CUA_PrevAndNext(
		Session session, Collobartion collobartion, String caseId,
		String stageName, String userType, int archived,
		OrderByComparator<Collobartion> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				7 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(6);
		}

		sb.append(_SQL_SELECT_COLLOBARTION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_STAGE_CUA_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_STAGE_CUA_CASEID_2);
		}

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_STAGE_CUA_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_STAGE_CUA_STAGENAME_2);
		}

		boolean bindUserType = false;

		if (userType.isEmpty()) {
			sb.append(_FINDER_COLUMN_STAGE_CUA_USERTYPE_3);
		}
		else {
			bindUserType = true;

			sb.append(_FINDER_COLUMN_STAGE_CUA_USERTYPE_2);
		}

		sb.append(_FINDER_COLUMN_STAGE_CUA_ARCHIVED_2);

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
			sb.append(CollobartionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindCaseId) {
			queryPos.add(caseId);
		}

		if (bindStageName) {
			queryPos.add(stageName);
		}

		if (bindUserType) {
			queryPos.add(userType);
		}

		queryPos.add(archived);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(collobartion)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Collobartion> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the collobartions where caseId = &#63; and stageName = &#63; and userType = &#63; and archived = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param archived the archived
	 */
	@Override
	public void removeByStage_CUA(
		String caseId, String stageName, String userType, int archived) {

		for (Collobartion collobartion :
				findByStage_CUA(
					caseId, stageName, userType, archived, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(collobartion);
		}
	}

	/**
	 * Returns the number of collobartions where caseId = &#63; and stageName = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param archived the archived
	 * @return the number of matching collobartions
	 */
	@Override
	public int countByStage_CUA(
		String caseId, String stageName, String userType, int archived) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");
		userType = Objects.toString(userType, "");

		FinderPath finderPath = _finderPathCountByStage_CUA;

		Object[] finderArgs = new Object[] {
			caseId, stageName, userType, archived
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_COUNT_COLLOBARTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_STAGE_CUA_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_STAGE_CUA_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_STAGE_CUA_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_STAGE_CUA_STAGENAME_2);
			}

			boolean bindUserType = false;

			if (userType.isEmpty()) {
				sb.append(_FINDER_COLUMN_STAGE_CUA_USERTYPE_3);
			}
			else {
				bindUserType = true;

				sb.append(_FINDER_COLUMN_STAGE_CUA_USERTYPE_2);
			}

			sb.append(_FINDER_COLUMN_STAGE_CUA_ARCHIVED_2);

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

				if (bindUserType) {
					queryPos.add(userType);
				}

				queryPos.add(archived);

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

	private static final String _FINDER_COLUMN_STAGE_CUA_CASEID_2 =
		"collobartion.caseId = ? AND ";

	private static final String _FINDER_COLUMN_STAGE_CUA_CASEID_3 =
		"(collobartion.caseId IS NULL OR collobartion.caseId = '') AND ";

	private static final String _FINDER_COLUMN_STAGE_CUA_STAGENAME_2 =
		"collobartion.stageName = ? AND ";

	private static final String _FINDER_COLUMN_STAGE_CUA_STAGENAME_3 =
		"(collobartion.stageName IS NULL OR collobartion.stageName = '') AND ";

	private static final String _FINDER_COLUMN_STAGE_CUA_USERTYPE_2 =
		"collobartion.userType = ? AND ";

	private static final String _FINDER_COLUMN_STAGE_CUA_USERTYPE_3 =
		"(collobartion.userType IS NULL OR collobartion.userType = '') AND ";

	private static final String _FINDER_COLUMN_STAGE_CUA_ARCHIVED_2 =
		"collobartion.archived = ?";

	public CollobartionPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");
		dbColumnNames.put("comment", "comment_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Collobartion.class);

		setModelImplClass(CollobartionImpl.class);
		setModelPKClass(long.class);

		setTable(CollobartionTable.INSTANCE);
	}

	/**
	 * Caches the collobartion in the entity cache if it is enabled.
	 *
	 * @param collobartion the collobartion
	 */
	@Override
	public void cacheResult(Collobartion collobartion) {
		entityCache.putResult(
			CollobartionImpl.class, collobartion.getPrimaryKey(), collobartion);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {collobartion.getUuid(), collobartion.getGroupId()},
			collobartion);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the collobartions in the entity cache if it is enabled.
	 *
	 * @param collobartions the collobartions
	 */
	@Override
	public void cacheResult(List<Collobartion> collobartions) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (collobartions.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Collobartion collobartion : collobartions) {
			if (entityCache.getResult(
					CollobartionImpl.class, collobartion.getPrimaryKey()) ==
						null) {

				cacheResult(collobartion);
			}
		}
	}

	/**
	 * Clears the cache for all collobartions.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CollobartionImpl.class);

		finderCache.clearCache(CollobartionImpl.class);
	}

	/**
	 * Clears the cache for the collobartion.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Collobartion collobartion) {
		entityCache.removeResult(CollobartionImpl.class, collobartion);
	}

	@Override
	public void clearCache(List<Collobartion> collobartions) {
		for (Collobartion collobartion : collobartions) {
			entityCache.removeResult(CollobartionImpl.class, collobartion);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CollobartionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(CollobartionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CollobartionModelImpl collobartionModelImpl) {

		Object[] args = new Object[] {
			collobartionModelImpl.getUuid(), collobartionModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, collobartionModelImpl);
	}

	/**
	 * Creates a new collobartion with the primary key. Does not add the collobartion to the database.
	 *
	 * @param collaborationId the primary key for the new collobartion
	 * @return the new collobartion
	 */
	@Override
	public Collobartion create(long collaborationId) {
		Collobartion collobartion = new CollobartionImpl();

		collobartion.setNew(true);
		collobartion.setPrimaryKey(collaborationId);

		String uuid = PortalUUIDUtil.generate();

		collobartion.setUuid(uuid);

		collobartion.setCompanyId(CompanyThreadLocal.getCompanyId());

		return collobartion;
	}

	/**
	 * Removes the collobartion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param collaborationId the primary key of the collobartion
	 * @return the collobartion that was removed
	 * @throws NoSuchCollobartionException if a collobartion with the primary key could not be found
	 */
	@Override
	public Collobartion remove(long collaborationId)
		throws NoSuchCollobartionException {

		return remove((Serializable)collaborationId);
	}

	/**
	 * Removes the collobartion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the collobartion
	 * @return the collobartion that was removed
	 * @throws NoSuchCollobartionException if a collobartion with the primary key could not be found
	 */
	@Override
	public Collobartion remove(Serializable primaryKey)
		throws NoSuchCollobartionException {

		Session session = null;

		try {
			session = openSession();

			Collobartion collobartion = (Collobartion)session.get(
				CollobartionImpl.class, primaryKey);

			if (collobartion == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCollobartionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(collobartion);
		}
		catch (NoSuchCollobartionException noSuchEntityException) {
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
	protected Collobartion removeImpl(Collobartion collobartion) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(collobartion)) {
				collobartion = (Collobartion)session.get(
					CollobartionImpl.class, collobartion.getPrimaryKeyObj());
			}

			if (collobartion != null) {
				session.delete(collobartion);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (collobartion != null) {
			clearCache(collobartion);
		}

		return collobartion;
	}

	@Override
	public Collobartion updateImpl(Collobartion collobartion) {
		boolean isNew = collobartion.isNew();

		if (!(collobartion instanceof CollobartionModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(collobartion.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					collobartion);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in collobartion proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Collobartion implementation " +
					collobartion.getClass());
		}

		CollobartionModelImpl collobartionModelImpl =
			(CollobartionModelImpl)collobartion;

		if (Validator.isNull(collobartion.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			collobartion.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (collobartion.getCreateDate() == null)) {
			if (serviceContext == null) {
				collobartion.setCreateDate(date);
			}
			else {
				collobartion.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!collobartionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				collobartion.setModifiedDate(date);
			}
			else {
				collobartion.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(collobartion);
			}
			else {
				collobartion = (Collobartion)session.merge(collobartion);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CollobartionImpl.class, collobartionModelImpl, false, true);

		cacheUniqueFindersCache(collobartionModelImpl);

		if (isNew) {
			collobartion.setNew(false);
		}

		collobartion.resetOriginalValues();

		return collobartion;
	}

	/**
	 * Returns the collobartion with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the collobartion
	 * @return the collobartion
	 * @throws NoSuchCollobartionException if a collobartion with the primary key could not be found
	 */
	@Override
	public Collobartion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCollobartionException {

		Collobartion collobartion = fetchByPrimaryKey(primaryKey);

		if (collobartion == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCollobartionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return collobartion;
	}

	/**
	 * Returns the collobartion with the primary key or throws a <code>NoSuchCollobartionException</code> if it could not be found.
	 *
	 * @param collaborationId the primary key of the collobartion
	 * @return the collobartion
	 * @throws NoSuchCollobartionException if a collobartion with the primary key could not be found
	 */
	@Override
	public Collobartion findByPrimaryKey(long collaborationId)
		throws NoSuchCollobartionException {

		return findByPrimaryKey((Serializable)collaborationId);
	}

	/**
	 * Returns the collobartion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param collaborationId the primary key of the collobartion
	 * @return the collobartion, or <code>null</code> if a collobartion with the primary key could not be found
	 */
	@Override
	public Collobartion fetchByPrimaryKey(long collaborationId) {
		return fetchByPrimaryKey((Serializable)collaborationId);
	}

	/**
	 * Returns all the collobartions.
	 *
	 * @return the collobartions
	 */
	@Override
	public List<Collobartion> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the collobartions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @return the range of collobartions
	 */
	@Override
	public List<Collobartion> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the collobartions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of collobartions
	 */
	@Override
	public List<Collobartion> findAll(
		int start, int end, OrderByComparator<Collobartion> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the collobartions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of collobartions
	 */
	@Override
	public List<Collobartion> findAll(
		int start, int end, OrderByComparator<Collobartion> orderByComparator,
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

		List<Collobartion> list = null;

		if (useFinderCache) {
			list = (List<Collobartion>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_COLLOBARTION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_COLLOBARTION;

				sql = sql.concat(CollobartionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Collobartion>)QueryUtil.list(
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
	 * Removes all the collobartions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Collobartion collobartion : findAll()) {
			remove(collobartion);
		}
	}

	/**
	 * Returns the number of collobartions.
	 *
	 * @return the number of collobartions
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_COLLOBARTION);

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
		return "collaborationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_COLLOBARTION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CollobartionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the collobartion persistence.
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

		_finderPathWithPaginationFindBycaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBycaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBycaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBystageName_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBystageName_CaseId",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"caseId", "stageName"}, true);

		_finderPathWithoutPaginationFindBystageName_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBystageName_CaseId",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, true);

		_finderPathCountBystageName_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBystageName_CaseId",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, false);

		_finderPathWithPaginationFindByStage_CU = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStage_CU",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId", "stageName", "userType"}, true);

		_finderPathWithoutPaginationFindByStage_CU = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStage_CU",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageName", "userType"}, true);

		_finderPathCountByStage_CU = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStage_CU",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageName", "userType"}, false);

		_finderPathWithPaginationFindByStage_CUA = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStage_CUA",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"caseId", "stageName", "userType", "archived"}, true);

		_finderPathWithoutPaginationFindByStage_CUA = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStage_CUA",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			},
			new String[] {"caseId", "stageName", "userType", "archived"}, true);

		_finderPathCountByStage_CUA = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStage_CUA",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			},
			new String[] {"caseId", "stageName", "userType", "archived"},
			false);

		CollobartionUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CollobartionUtil.setPersistence(null);

		entityCache.removeCache(CollobartionImpl.class.getName());
	}

	@Override
	@Reference(
		target = COLLABORATIONPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = COLLABORATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = COLLABORATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_COLLOBARTION =
		"SELECT collobartion FROM Collobartion collobartion";

	private static final String _SQL_SELECT_COLLOBARTION_WHERE =
		"SELECT collobartion FROM Collobartion collobartion WHERE ";

	private static final String _SQL_COUNT_COLLOBARTION =
		"SELECT COUNT(collobartion) FROM Collobartion collobartion";

	private static final String _SQL_COUNT_COLLOBARTION_WHERE =
		"SELECT COUNT(collobartion) FROM Collobartion collobartion WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "collobartion.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Collobartion exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Collobartion exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CollobartionPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid", "comment"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}