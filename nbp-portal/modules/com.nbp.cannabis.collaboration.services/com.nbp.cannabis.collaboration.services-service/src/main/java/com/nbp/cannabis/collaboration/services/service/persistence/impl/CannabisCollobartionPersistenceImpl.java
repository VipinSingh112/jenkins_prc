/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.collaboration.services.service.persistence.impl;

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

import com.nbp.cannabis.collaboration.services.exception.NoSuchCannabisCollobartionException;
import com.nbp.cannabis.collaboration.services.model.CannabisCollobartion;
import com.nbp.cannabis.collaboration.services.model.CannabisCollobartionTable;
import com.nbp.cannabis.collaboration.services.model.impl.CannabisCollobartionImpl;
import com.nbp.cannabis.collaboration.services.model.impl.CannabisCollobartionModelImpl;
import com.nbp.cannabis.collaboration.services.service.persistence.CannabisCollobartionPersistence;
import com.nbp.cannabis.collaboration.services.service.persistence.CannabisCollobartionUtil;
import com.nbp.cannabis.collaboration.services.service.persistence.impl.constants.CANNABIS_COLLABORATIONPersistenceConstants;

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
 * The persistence implementation for the cannabis collobartion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CannabisCollobartionPersistence.class)
public class CannabisCollobartionPersistenceImpl
	extends BasePersistenceImpl<CannabisCollobartion>
	implements CannabisCollobartionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CannabisCollobartionUtil</code> to access the cannabis collobartion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CannabisCollobartionImpl.class.getName();

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
	 * Returns all the cannabis collobartions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cannabis collobartions
	 */
	@Override
	public List<CannabisCollobartion> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis collobartions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @return the range of matching cannabis collobartions
	 */
	@Override
	public List<CannabisCollobartion> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis collobartions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis collobartions
	 */
	@Override
	public List<CannabisCollobartion> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis collobartions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis collobartions
	 */
	@Override
	public List<CannabisCollobartion> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisCollobartion> orderByComparator,
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

		List<CannabisCollobartion> list = null;

		if (useFinderCache) {
			list = (List<CannabisCollobartion>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisCollobartion cannabisCollobartion : list) {
					if (!uuid.equals(cannabisCollobartion.getUuid())) {
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

			sb.append(_SQL_SELECT_CANNABISCOLLOBARTION_WHERE);

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
				sb.append(CannabisCollobartionModelImpl.ORDER_BY_JPQL);
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

				list = (List<CannabisCollobartion>)QueryUtil.list(
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
	 * Returns the first cannabis collobartion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	@Override
	public CannabisCollobartion findByUuid_First(
			String uuid,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException {

		CannabisCollobartion cannabisCollobartion = fetchByUuid_First(
			uuid, orderByComparator);

		if (cannabisCollobartion != null) {
			return cannabisCollobartion;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchCannabisCollobartionException(sb.toString());
	}

	/**
	 * Returns the first cannabis collobartion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	@Override
	public CannabisCollobartion fetchByUuid_First(
		String uuid,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		List<CannabisCollobartion> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis collobartion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	@Override
	public CannabisCollobartion findByUuid_Last(
			String uuid,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException {

		CannabisCollobartion cannabisCollobartion = fetchByUuid_Last(
			uuid, orderByComparator);

		if (cannabisCollobartion != null) {
			return cannabisCollobartion;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchCannabisCollobartionException(sb.toString());
	}

	/**
	 * Returns the last cannabis collobartion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	@Override
	public CannabisCollobartion fetchByUuid_Last(
		String uuid,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<CannabisCollobartion> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis collobartions before and after the current cannabis collobartion in the ordered set where uuid = &#63;.
	 *
	 * @param cannabisCollaborationId the primary key of the current cannabis collobartion
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a cannabis collobartion with the primary key could not be found
	 */
	@Override
	public CannabisCollobartion[] findByUuid_PrevAndNext(
			long cannabisCollaborationId, String uuid,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException {

		uuid = Objects.toString(uuid, "");

		CannabisCollobartion cannabisCollobartion = findByPrimaryKey(
			cannabisCollaborationId);

		Session session = null;

		try {
			session = openSession();

			CannabisCollobartion[] array = new CannabisCollobartionImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, cannabisCollobartion, uuid, orderByComparator, true);

			array[1] = cannabisCollobartion;

			array[2] = getByUuid_PrevAndNext(
				session, cannabisCollobartion, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected CannabisCollobartion getByUuid_PrevAndNext(
		Session session, CannabisCollobartion cannabisCollobartion, String uuid,
		OrderByComparator<CannabisCollobartion> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISCOLLOBARTION_WHERE);

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
			sb.append(CannabisCollobartionModelImpl.ORDER_BY_JPQL);
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
						cannabisCollobartion)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisCollobartion> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis collobartions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (CannabisCollobartion cannabisCollobartion :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(cannabisCollobartion);
		}
	}

	/**
	 * Returns the number of cannabis collobartions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cannabis collobartions
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISCOLLOBARTION_WHERE);

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
		"cannabisCollobartion.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(cannabisCollobartion.uuid IS NULL OR cannabisCollobartion.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the cannabis collobartion where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCannabisCollobartionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	@Override
	public CannabisCollobartion findByUUID_G(String uuid, long groupId)
		throws NoSuchCannabisCollobartionException {

		CannabisCollobartion cannabisCollobartion = fetchByUUID_G(
			uuid, groupId);

		if (cannabisCollobartion == null) {
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

			throw new NoSuchCannabisCollobartionException(sb.toString());
		}

		return cannabisCollobartion;
	}

	/**
	 * Returns the cannabis collobartion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	@Override
	public CannabisCollobartion fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the cannabis collobartion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	@Override
	public CannabisCollobartion fetchByUUID_G(
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

		if (result instanceof CannabisCollobartion) {
			CannabisCollobartion cannabisCollobartion =
				(CannabisCollobartion)result;

			if (!Objects.equals(uuid, cannabisCollobartion.getUuid()) ||
				(groupId != cannabisCollobartion.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_CANNABISCOLLOBARTION_WHERE);

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

				List<CannabisCollobartion> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					CannabisCollobartion cannabisCollobartion = list.get(0);

					result = cannabisCollobartion;

					cacheResult(cannabisCollobartion);
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
			return (CannabisCollobartion)result;
		}
	}

	/**
	 * Removes the cannabis collobartion where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the cannabis collobartion that was removed
	 */
	@Override
	public CannabisCollobartion removeByUUID_G(String uuid, long groupId)
		throws NoSuchCannabisCollobartionException {

		CannabisCollobartion cannabisCollobartion = findByUUID_G(uuid, groupId);

		return remove(cannabisCollobartion);
	}

	/**
	 * Returns the number of cannabis collobartions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cannabis collobartions
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISCOLLOBARTION_WHERE);

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
		"cannabisCollobartion.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(cannabisCollobartion.uuid IS NULL OR cannabisCollobartion.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"cannabisCollobartion.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the cannabis collobartions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cannabis collobartions
	 */
	@Override
	public List<CannabisCollobartion> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis collobartions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @return the range of matching cannabis collobartions
	 */
	@Override
	public List<CannabisCollobartion> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis collobartions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis collobartions
	 */
	@Override
	public List<CannabisCollobartion> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis collobartions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis collobartions
	 */
	@Override
	public List<CannabisCollobartion> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisCollobartion> orderByComparator,
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

		List<CannabisCollobartion> list = null;

		if (useFinderCache) {
			list = (List<CannabisCollobartion>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisCollobartion cannabisCollobartion : list) {
					if (!uuid.equals(cannabisCollobartion.getUuid()) ||
						(companyId != cannabisCollobartion.getCompanyId())) {

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

			sb.append(_SQL_SELECT_CANNABISCOLLOBARTION_WHERE);

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
				sb.append(CannabisCollobartionModelImpl.ORDER_BY_JPQL);
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

				list = (List<CannabisCollobartion>)QueryUtil.list(
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
	 * Returns the first cannabis collobartion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	@Override
	public CannabisCollobartion findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException {

		CannabisCollobartion cannabisCollobartion = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (cannabisCollobartion != null) {
			return cannabisCollobartion;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchCannabisCollobartionException(sb.toString());
	}

	/**
	 * Returns the first cannabis collobartion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	@Override
	public CannabisCollobartion fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		List<CannabisCollobartion> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis collobartion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	@Override
	public CannabisCollobartion findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException {

		CannabisCollobartion cannabisCollobartion = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (cannabisCollobartion != null) {
			return cannabisCollobartion;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchCannabisCollobartionException(sb.toString());
	}

	/**
	 * Returns the last cannabis collobartion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	@Override
	public CannabisCollobartion fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<CannabisCollobartion> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis collobartions before and after the current cannabis collobartion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param cannabisCollaborationId the primary key of the current cannabis collobartion
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a cannabis collobartion with the primary key could not be found
	 */
	@Override
	public CannabisCollobartion[] findByUuid_C_PrevAndNext(
			long cannabisCollaborationId, String uuid, long companyId,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException {

		uuid = Objects.toString(uuid, "");

		CannabisCollobartion cannabisCollobartion = findByPrimaryKey(
			cannabisCollaborationId);

		Session session = null;

		try {
			session = openSession();

			CannabisCollobartion[] array = new CannabisCollobartionImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, cannabisCollobartion, uuid, companyId,
				orderByComparator, true);

			array[1] = cannabisCollobartion;

			array[2] = getByUuid_C_PrevAndNext(
				session, cannabisCollobartion, uuid, companyId,
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

	protected CannabisCollobartion getByUuid_C_PrevAndNext(
		Session session, CannabisCollobartion cannabisCollobartion, String uuid,
		long companyId,
		OrderByComparator<CannabisCollobartion> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISCOLLOBARTION_WHERE);

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
			sb.append(CannabisCollobartionModelImpl.ORDER_BY_JPQL);
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
						cannabisCollobartion)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisCollobartion> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis collobartions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (CannabisCollobartion cannabisCollobartion :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(cannabisCollobartion);
		}
	}

	/**
	 * Returns the number of cannabis collobartions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cannabis collobartions
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISCOLLOBARTION_WHERE);

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
		"cannabisCollobartion.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(cannabisCollobartion.uuid IS NULL OR cannabisCollobartion.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"cannabisCollobartion.companyId = ?";

	private FinderPath _finderPathWithPaginationFindBycaseId;
	private FinderPath _finderPathWithoutPaginationFindBycaseId;
	private FinderPath _finderPathCountBycaseId;

	/**
	 * Returns all the cannabis collobartions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis collobartions
	 */
	@Override
	public List<CannabisCollobartion> findBycaseId(String caseId) {
		return findBycaseId(caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis collobartions where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @return the range of matching cannabis collobartions
	 */
	@Override
	public List<CannabisCollobartion> findBycaseId(
		String caseId, int start, int end) {

		return findBycaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis collobartions where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis collobartions
	 */
	@Override
	public List<CannabisCollobartion> findBycaseId(
		String caseId, int start, int end,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		return findBycaseId(caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis collobartions where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis collobartions
	 */
	@Override
	public List<CannabisCollobartion> findBycaseId(
		String caseId, int start, int end,
		OrderByComparator<CannabisCollobartion> orderByComparator,
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

		List<CannabisCollobartion> list = null;

		if (useFinderCache) {
			list = (List<CannabisCollobartion>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisCollobartion cannabisCollobartion : list) {
					if (!caseId.equals(cannabisCollobartion.getCaseId())) {
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

			sb.append(_SQL_SELECT_CANNABISCOLLOBARTION_WHERE);

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
				sb.append(CannabisCollobartionModelImpl.ORDER_BY_JPQL);
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

				list = (List<CannabisCollobartion>)QueryUtil.list(
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
	 * Returns the first cannabis collobartion in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	@Override
	public CannabisCollobartion findBycaseId_First(
			String caseId,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException {

		CannabisCollobartion cannabisCollobartion = fetchBycaseId_First(
			caseId, orderByComparator);

		if (cannabisCollobartion != null) {
			return cannabisCollobartion;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchCannabisCollobartionException(sb.toString());
	}

	/**
	 * Returns the first cannabis collobartion in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	@Override
	public CannabisCollobartion fetchBycaseId_First(
		String caseId,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		List<CannabisCollobartion> list = findBycaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis collobartion in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	@Override
	public CannabisCollobartion findBycaseId_Last(
			String caseId,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException {

		CannabisCollobartion cannabisCollobartion = fetchBycaseId_Last(
			caseId, orderByComparator);

		if (cannabisCollobartion != null) {
			return cannabisCollobartion;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchCannabisCollobartionException(sb.toString());
	}

	/**
	 * Returns the last cannabis collobartion in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	@Override
	public CannabisCollobartion fetchBycaseId_Last(
		String caseId,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		int count = countBycaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<CannabisCollobartion> list = findBycaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis collobartions before and after the current cannabis collobartion in the ordered set where caseId = &#63;.
	 *
	 * @param cannabisCollaborationId the primary key of the current cannabis collobartion
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a cannabis collobartion with the primary key could not be found
	 */
	@Override
	public CannabisCollobartion[] findBycaseId_PrevAndNext(
			long cannabisCollaborationId, String caseId,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException {

		caseId = Objects.toString(caseId, "");

		CannabisCollobartion cannabisCollobartion = findByPrimaryKey(
			cannabisCollaborationId);

		Session session = null;

		try {
			session = openSession();

			CannabisCollobartion[] array = new CannabisCollobartionImpl[3];

			array[0] = getBycaseId_PrevAndNext(
				session, cannabisCollobartion, caseId, orderByComparator, true);

			array[1] = cannabisCollobartion;

			array[2] = getBycaseId_PrevAndNext(
				session, cannabisCollobartion, caseId, orderByComparator,
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

	protected CannabisCollobartion getBycaseId_PrevAndNext(
		Session session, CannabisCollobartion cannabisCollobartion,
		String caseId,
		OrderByComparator<CannabisCollobartion> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISCOLLOBARTION_WHERE);

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
			sb.append(CannabisCollobartionModelImpl.ORDER_BY_JPQL);
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
						cannabisCollobartion)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisCollobartion> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis collobartions where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBycaseId(String caseId) {
		for (CannabisCollobartion cannabisCollobartion :
				findBycaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(cannabisCollobartion);
		}
	}

	/**
	 * Returns the number of cannabis collobartions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis collobartions
	 */
	@Override
	public int countBycaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBycaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISCOLLOBARTION_WHERE);

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
		"cannabisCollobartion.caseId = ?";

	private static final String _FINDER_COLUMN_CASEID_CASEID_3 =
		"(cannabisCollobartion.caseId IS NULL OR cannabisCollobartion.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBycannabisStage_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBycannabisStage_CaseId;
	private FinderPath _finderPathCountBycannabisStage_CaseId;

	/**
	 * Returns all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @return the matching cannabis collobartions
	 */
	@Override
	public List<CannabisCollobartion> findBycannabisStage_CaseId(
		String caseId, String cannabisStage) {

		return findBycannabisStage_CaseId(
			caseId, cannabisStage, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @return the range of matching cannabis collobartions
	 */
	@Override
	public List<CannabisCollobartion> findBycannabisStage_CaseId(
		String caseId, String cannabisStage, int start, int end) {

		return findBycannabisStage_CaseId(
			caseId, cannabisStage, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis collobartions
	 */
	@Override
	public List<CannabisCollobartion> findBycannabisStage_CaseId(
		String caseId, String cannabisStage, int start, int end,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		return findBycannabisStage_CaseId(
			caseId, cannabisStage, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis collobartions
	 */
	@Override
	public List<CannabisCollobartion> findBycannabisStage_CaseId(
		String caseId, String cannabisStage, int start, int end,
		OrderByComparator<CannabisCollobartion> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");
		cannabisStage = Objects.toString(cannabisStage, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBycannabisStage_CaseId;
				finderArgs = new Object[] {caseId, cannabisStage};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBycannabisStage_CaseId;
			finderArgs = new Object[] {
				caseId, cannabisStage, start, end, orderByComparator
			};
		}

		List<CannabisCollobartion> list = null;

		if (useFinderCache) {
			list = (List<CannabisCollobartion>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisCollobartion cannabisCollobartion : list) {
					if (!caseId.equals(cannabisCollobartion.getCaseId()) ||
						!cannabisStage.equals(
							cannabisCollobartion.getCannabisStage())) {

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

			sb.append(_SQL_SELECT_CANNABISCOLLOBARTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_CANNABISSTAGE_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_CANNABISSTAGE_CASEID_CASEID_2);
			}

			boolean bindCannabisStage = false;

			if (cannabisStage.isEmpty()) {
				sb.append(_FINDER_COLUMN_CANNABISSTAGE_CASEID_CANNABISSTAGE_3);
			}
			else {
				bindCannabisStage = true;

				sb.append(_FINDER_COLUMN_CANNABISSTAGE_CASEID_CANNABISSTAGE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CannabisCollobartionModelImpl.ORDER_BY_JPQL);
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

				if (bindCannabisStage) {
					queryPos.add(cannabisStage);
				}

				list = (List<CannabisCollobartion>)QueryUtil.list(
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
	 * Returns the first cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	@Override
	public CannabisCollobartion findBycannabisStage_CaseId_First(
			String caseId, String cannabisStage,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException {

		CannabisCollobartion cannabisCollobartion =
			fetchBycannabisStage_CaseId_First(
				caseId, cannabisStage, orderByComparator);

		if (cannabisCollobartion != null) {
			return cannabisCollobartion;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append(", cannabisStage=");
		sb.append(cannabisStage);

		sb.append("}");

		throw new NoSuchCannabisCollobartionException(sb.toString());
	}

	/**
	 * Returns the first cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	@Override
	public CannabisCollobartion fetchBycannabisStage_CaseId_First(
		String caseId, String cannabisStage,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		List<CannabisCollobartion> list = findBycannabisStage_CaseId(
			caseId, cannabisStage, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	@Override
	public CannabisCollobartion findBycannabisStage_CaseId_Last(
			String caseId, String cannabisStage,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException {

		CannabisCollobartion cannabisCollobartion =
			fetchBycannabisStage_CaseId_Last(
				caseId, cannabisStage, orderByComparator);

		if (cannabisCollobartion != null) {
			return cannabisCollobartion;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append(", cannabisStage=");
		sb.append(cannabisStage);

		sb.append("}");

		throw new NoSuchCannabisCollobartionException(sb.toString());
	}

	/**
	 * Returns the last cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	@Override
	public CannabisCollobartion fetchBycannabisStage_CaseId_Last(
		String caseId, String cannabisStage,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		int count = countBycannabisStage_CaseId(caseId, cannabisStage);

		if (count == 0) {
			return null;
		}

		List<CannabisCollobartion> list = findBycannabisStage_CaseId(
			caseId, cannabisStage, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis collobartions before and after the current cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63;.
	 *
	 * @param cannabisCollaborationId the primary key of the current cannabis collobartion
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a cannabis collobartion with the primary key could not be found
	 */
	@Override
	public CannabisCollobartion[] findBycannabisStage_CaseId_PrevAndNext(
			long cannabisCollaborationId, String caseId, String cannabisStage,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException {

		caseId = Objects.toString(caseId, "");
		cannabisStage = Objects.toString(cannabisStage, "");

		CannabisCollobartion cannabisCollobartion = findByPrimaryKey(
			cannabisCollaborationId);

		Session session = null;

		try {
			session = openSession();

			CannabisCollobartion[] array = new CannabisCollobartionImpl[3];

			array[0] = getBycannabisStage_CaseId_PrevAndNext(
				session, cannabisCollobartion, caseId, cannabisStage,
				orderByComparator, true);

			array[1] = cannabisCollobartion;

			array[2] = getBycannabisStage_CaseId_PrevAndNext(
				session, cannabisCollobartion, caseId, cannabisStage,
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

	protected CannabisCollobartion getBycannabisStage_CaseId_PrevAndNext(
		Session session, CannabisCollobartion cannabisCollobartion,
		String caseId, String cannabisStage,
		OrderByComparator<CannabisCollobartion> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISCOLLOBARTION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_CANNABISSTAGE_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_CANNABISSTAGE_CASEID_CASEID_2);
		}

		boolean bindCannabisStage = false;

		if (cannabisStage.isEmpty()) {
			sb.append(_FINDER_COLUMN_CANNABISSTAGE_CASEID_CANNABISSTAGE_3);
		}
		else {
			bindCannabisStage = true;

			sb.append(_FINDER_COLUMN_CANNABISSTAGE_CASEID_CANNABISSTAGE_2);
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
			sb.append(CannabisCollobartionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindCaseId) {
			queryPos.add(caseId);
		}

		if (bindCannabisStage) {
			queryPos.add(cannabisStage);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisCollobartion)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisCollobartion> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 */
	@Override
	public void removeBycannabisStage_CaseId(
		String caseId, String cannabisStage) {

		for (CannabisCollobartion cannabisCollobartion :
				findBycannabisStage_CaseId(
					caseId, cannabisStage, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(cannabisCollobartion);
		}
	}

	/**
	 * Returns the number of cannabis collobartions where caseId = &#63; and cannabisStage = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @return the number of matching cannabis collobartions
	 */
	@Override
	public int countBycannabisStage_CaseId(
		String caseId, String cannabisStage) {

		caseId = Objects.toString(caseId, "");
		cannabisStage = Objects.toString(cannabisStage, "");

		FinderPath finderPath = _finderPathCountBycannabisStage_CaseId;

		Object[] finderArgs = new Object[] {caseId, cannabisStage};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISCOLLOBARTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_CANNABISSTAGE_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_CANNABISSTAGE_CASEID_CASEID_2);
			}

			boolean bindCannabisStage = false;

			if (cannabisStage.isEmpty()) {
				sb.append(_FINDER_COLUMN_CANNABISSTAGE_CASEID_CANNABISSTAGE_3);
			}
			else {
				bindCannabisStage = true;

				sb.append(_FINDER_COLUMN_CANNABISSTAGE_CASEID_CANNABISSTAGE_2);
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

				if (bindCannabisStage) {
					queryPos.add(cannabisStage);
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

	private static final String _FINDER_COLUMN_CANNABISSTAGE_CASEID_CASEID_2 =
		"cannabisCollobartion.caseId = ? AND ";

	private static final String _FINDER_COLUMN_CANNABISSTAGE_CASEID_CASEID_3 =
		"(cannabisCollobartion.caseId IS NULL OR cannabisCollobartion.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_CANNABISSTAGE_CASEID_CANNABISSTAGE_2 =
			"cannabisCollobartion.cannabisStage = ?";

	private static final String
		_FINDER_COLUMN_CANNABISSTAGE_CASEID_CANNABISSTAGE_3 =
			"(cannabisCollobartion.cannabisStage IS NULL OR cannabisCollobartion.cannabisStage = '')";

	private FinderPath _finderPathWithPaginationFindBycannabisStage_CU;
	private FinderPath _finderPathWithoutPaginationFindBycannabisStage_CU;
	private FinderPath _finderPathCountBycannabisStage_CU;

	/**
	 * Returns all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @return the matching cannabis collobartions
	 */
	@Override
	public List<CannabisCollobartion> findBycannabisStage_CU(
		String caseId, String cannabisStage, String userType) {

		return findBycannabisStage_CU(
			caseId, cannabisStage, userType, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @return the range of matching cannabis collobartions
	 */
	@Override
	public List<CannabisCollobartion> findBycannabisStage_CU(
		String caseId, String cannabisStage, String userType, int start,
		int end) {

		return findBycannabisStage_CU(
			caseId, cannabisStage, userType, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis collobartions
	 */
	@Override
	public List<CannabisCollobartion> findBycannabisStage_CU(
		String caseId, String cannabisStage, String userType, int start,
		int end, OrderByComparator<CannabisCollobartion> orderByComparator) {

		return findBycannabisStage_CU(
			caseId, cannabisStage, userType, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis collobartions
	 */
	@Override
	public List<CannabisCollobartion> findBycannabisStage_CU(
		String caseId, String cannabisStage, String userType, int start,
		int end, OrderByComparator<CannabisCollobartion> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");
		cannabisStage = Objects.toString(cannabisStage, "");
		userType = Objects.toString(userType, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBycannabisStage_CU;
				finderArgs = new Object[] {caseId, cannabisStage, userType};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBycannabisStage_CU;
			finderArgs = new Object[] {
				caseId, cannabisStage, userType, start, end, orderByComparator
			};
		}

		List<CannabisCollobartion> list = null;

		if (useFinderCache) {
			list = (List<CannabisCollobartion>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisCollobartion cannabisCollobartion : list) {
					if (!caseId.equals(cannabisCollobartion.getCaseId()) ||
						!cannabisStage.equals(
							cannabisCollobartion.getCannabisStage()) ||
						!userType.equals(cannabisCollobartion.getUserType())) {

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

			sb.append(_SQL_SELECT_CANNABISCOLLOBARTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_CANNABISSTAGE_CU_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_CANNABISSTAGE_CU_CASEID_2);
			}

			boolean bindCannabisStage = false;

			if (cannabisStage.isEmpty()) {
				sb.append(_FINDER_COLUMN_CANNABISSTAGE_CU_CANNABISSTAGE_3);
			}
			else {
				bindCannabisStage = true;

				sb.append(_FINDER_COLUMN_CANNABISSTAGE_CU_CANNABISSTAGE_2);
			}

			boolean bindUserType = false;

			if (userType.isEmpty()) {
				sb.append(_FINDER_COLUMN_CANNABISSTAGE_CU_USERTYPE_3);
			}
			else {
				bindUserType = true;

				sb.append(_FINDER_COLUMN_CANNABISSTAGE_CU_USERTYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CannabisCollobartionModelImpl.ORDER_BY_JPQL);
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

				if (bindCannabisStage) {
					queryPos.add(cannabisStage);
				}

				if (bindUserType) {
					queryPos.add(userType);
				}

				list = (List<CannabisCollobartion>)QueryUtil.list(
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
	 * Returns the first cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	@Override
	public CannabisCollobartion findBycannabisStage_CU_First(
			String caseId, String cannabisStage, String userType,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException {

		CannabisCollobartion cannabisCollobartion =
			fetchBycannabisStage_CU_First(
				caseId, cannabisStage, userType, orderByComparator);

		if (cannabisCollobartion != null) {
			return cannabisCollobartion;
		}

		StringBundler sb = new StringBundler(8);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append(", cannabisStage=");
		sb.append(cannabisStage);

		sb.append(", userType=");
		sb.append(userType);

		sb.append("}");

		throw new NoSuchCannabisCollobartionException(sb.toString());
	}

	/**
	 * Returns the first cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	@Override
	public CannabisCollobartion fetchBycannabisStage_CU_First(
		String caseId, String cannabisStage, String userType,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		List<CannabisCollobartion> list = findBycannabisStage_CU(
			caseId, cannabisStage, userType, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	@Override
	public CannabisCollobartion findBycannabisStage_CU_Last(
			String caseId, String cannabisStage, String userType,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException {

		CannabisCollobartion cannabisCollobartion =
			fetchBycannabisStage_CU_Last(
				caseId, cannabisStage, userType, orderByComparator);

		if (cannabisCollobartion != null) {
			return cannabisCollobartion;
		}

		StringBundler sb = new StringBundler(8);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append(", cannabisStage=");
		sb.append(cannabisStage);

		sb.append(", userType=");
		sb.append(userType);

		sb.append("}");

		throw new NoSuchCannabisCollobartionException(sb.toString());
	}

	/**
	 * Returns the last cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	@Override
	public CannabisCollobartion fetchBycannabisStage_CU_Last(
		String caseId, String cannabisStage, String userType,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		int count = countBycannabisStage_CU(caseId, cannabisStage, userType);

		if (count == 0) {
			return null;
		}

		List<CannabisCollobartion> list = findBycannabisStage_CU(
			caseId, cannabisStage, userType, count - 1, count,
			orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis collobartions before and after the current cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63; and userType = &#63;.
	 *
	 * @param cannabisCollaborationId the primary key of the current cannabis collobartion
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a cannabis collobartion with the primary key could not be found
	 */
	@Override
	public CannabisCollobartion[] findBycannabisStage_CU_PrevAndNext(
			long cannabisCollaborationId, String caseId, String cannabisStage,
			String userType,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException {

		caseId = Objects.toString(caseId, "");
		cannabisStage = Objects.toString(cannabisStage, "");
		userType = Objects.toString(userType, "");

		CannabisCollobartion cannabisCollobartion = findByPrimaryKey(
			cannabisCollaborationId);

		Session session = null;

		try {
			session = openSession();

			CannabisCollobartion[] array = new CannabisCollobartionImpl[3];

			array[0] = getBycannabisStage_CU_PrevAndNext(
				session, cannabisCollobartion, caseId, cannabisStage, userType,
				orderByComparator, true);

			array[1] = cannabisCollobartion;

			array[2] = getBycannabisStage_CU_PrevAndNext(
				session, cannabisCollobartion, caseId, cannabisStage, userType,
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

	protected CannabisCollobartion getBycannabisStage_CU_PrevAndNext(
		Session session, CannabisCollobartion cannabisCollobartion,
		String caseId, String cannabisStage, String userType,
		OrderByComparator<CannabisCollobartion> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				6 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(5);
		}

		sb.append(_SQL_SELECT_CANNABISCOLLOBARTION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_CANNABISSTAGE_CU_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_CANNABISSTAGE_CU_CASEID_2);
		}

		boolean bindCannabisStage = false;

		if (cannabisStage.isEmpty()) {
			sb.append(_FINDER_COLUMN_CANNABISSTAGE_CU_CANNABISSTAGE_3);
		}
		else {
			bindCannabisStage = true;

			sb.append(_FINDER_COLUMN_CANNABISSTAGE_CU_CANNABISSTAGE_2);
		}

		boolean bindUserType = false;

		if (userType.isEmpty()) {
			sb.append(_FINDER_COLUMN_CANNABISSTAGE_CU_USERTYPE_3);
		}
		else {
			bindUserType = true;

			sb.append(_FINDER_COLUMN_CANNABISSTAGE_CU_USERTYPE_2);
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
			sb.append(CannabisCollobartionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindCaseId) {
			queryPos.add(caseId);
		}

		if (bindCannabisStage) {
			queryPos.add(cannabisStage);
		}

		if (bindUserType) {
			queryPos.add(userType);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisCollobartion)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisCollobartion> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 */
	@Override
	public void removeBycannabisStage_CU(
		String caseId, String cannabisStage, String userType) {

		for (CannabisCollobartion cannabisCollobartion :
				findBycannabisStage_CU(
					caseId, cannabisStage, userType, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(cannabisCollobartion);
		}
	}

	/**
	 * Returns the number of cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @return the number of matching cannabis collobartions
	 */
	@Override
	public int countBycannabisStage_CU(
		String caseId, String cannabisStage, String userType) {

		caseId = Objects.toString(caseId, "");
		cannabisStage = Objects.toString(cannabisStage, "");
		userType = Objects.toString(userType, "");

		FinderPath finderPath = _finderPathCountBycannabisStage_CU;

		Object[] finderArgs = new Object[] {caseId, cannabisStage, userType};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_CANNABISCOLLOBARTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_CANNABISSTAGE_CU_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_CANNABISSTAGE_CU_CASEID_2);
			}

			boolean bindCannabisStage = false;

			if (cannabisStage.isEmpty()) {
				sb.append(_FINDER_COLUMN_CANNABISSTAGE_CU_CANNABISSTAGE_3);
			}
			else {
				bindCannabisStage = true;

				sb.append(_FINDER_COLUMN_CANNABISSTAGE_CU_CANNABISSTAGE_2);
			}

			boolean bindUserType = false;

			if (userType.isEmpty()) {
				sb.append(_FINDER_COLUMN_CANNABISSTAGE_CU_USERTYPE_3);
			}
			else {
				bindUserType = true;

				sb.append(_FINDER_COLUMN_CANNABISSTAGE_CU_USERTYPE_2);
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

				if (bindCannabisStage) {
					queryPos.add(cannabisStage);
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

	private static final String _FINDER_COLUMN_CANNABISSTAGE_CU_CASEID_2 =
		"cannabisCollobartion.caseId = ? AND ";

	private static final String _FINDER_COLUMN_CANNABISSTAGE_CU_CASEID_3 =
		"(cannabisCollobartion.caseId IS NULL OR cannabisCollobartion.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_CANNABISSTAGE_CU_CANNABISSTAGE_2 =
			"cannabisCollobartion.cannabisStage = ? AND ";

	private static final String
		_FINDER_COLUMN_CANNABISSTAGE_CU_CANNABISSTAGE_3 =
			"(cannabisCollobartion.cannabisStage IS NULL OR cannabisCollobartion.cannabisStage = '') AND ";

	private static final String _FINDER_COLUMN_CANNABISSTAGE_CU_USERTYPE_2 =
		"cannabisCollobartion.userType = ?";

	private static final String _FINDER_COLUMN_CANNABISSTAGE_CU_USERTYPE_3 =
		"(cannabisCollobartion.userType IS NULL OR cannabisCollobartion.userType = '')";

	private FinderPath _finderPathWithPaginationFindBycannabisStage_CUA;
	private FinderPath _finderPathWithoutPaginationFindBycannabisStage_CUA;
	private FinderPath _finderPathCountBycannabisStage_CUA;

	/**
	 * Returns all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param archived the archived
	 * @return the matching cannabis collobartions
	 */
	@Override
	public List<CannabisCollobartion> findBycannabisStage_CUA(
		String caseId, String cannabisStage, String userType, int archived) {

		return findBycannabisStage_CUA(
			caseId, cannabisStage, userType, archived, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param archived the archived
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @return the range of matching cannabis collobartions
	 */
	@Override
	public List<CannabisCollobartion> findBycannabisStage_CUA(
		String caseId, String cannabisStage, String userType, int archived,
		int start, int end) {

		return findBycannabisStage_CUA(
			caseId, cannabisStage, userType, archived, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param archived the archived
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis collobartions
	 */
	@Override
	public List<CannabisCollobartion> findBycannabisStage_CUA(
		String caseId, String cannabisStage, String userType, int archived,
		int start, int end,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		return findBycannabisStage_CUA(
			caseId, cannabisStage, userType, archived, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param archived the archived
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis collobartions
	 */
	@Override
	public List<CannabisCollobartion> findBycannabisStage_CUA(
		String caseId, String cannabisStage, String userType, int archived,
		int start, int end,
		OrderByComparator<CannabisCollobartion> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");
		cannabisStage = Objects.toString(cannabisStage, "");
		userType = Objects.toString(userType, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBycannabisStage_CUA;
				finderArgs = new Object[] {
					caseId, cannabisStage, userType, archived
				};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBycannabisStage_CUA;
			finderArgs = new Object[] {
				caseId, cannabisStage, userType, archived, start, end,
				orderByComparator
			};
		}

		List<CannabisCollobartion> list = null;

		if (useFinderCache) {
			list = (List<CannabisCollobartion>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisCollobartion cannabisCollobartion : list) {
					if (!caseId.equals(cannabisCollobartion.getCaseId()) ||
						!cannabisStage.equals(
							cannabisCollobartion.getCannabisStage()) ||
						!userType.equals(cannabisCollobartion.getUserType()) ||
						(archived != cannabisCollobartion.getArchived())) {

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

			sb.append(_SQL_SELECT_CANNABISCOLLOBARTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_CANNABISSTAGE_CUA_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_CANNABISSTAGE_CUA_CASEID_2);
			}

			boolean bindCannabisStage = false;

			if (cannabisStage.isEmpty()) {
				sb.append(_FINDER_COLUMN_CANNABISSTAGE_CUA_CANNABISSTAGE_3);
			}
			else {
				bindCannabisStage = true;

				sb.append(_FINDER_COLUMN_CANNABISSTAGE_CUA_CANNABISSTAGE_2);
			}

			boolean bindUserType = false;

			if (userType.isEmpty()) {
				sb.append(_FINDER_COLUMN_CANNABISSTAGE_CUA_USERTYPE_3);
			}
			else {
				bindUserType = true;

				sb.append(_FINDER_COLUMN_CANNABISSTAGE_CUA_USERTYPE_2);
			}

			sb.append(_FINDER_COLUMN_CANNABISSTAGE_CUA_ARCHIVED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CannabisCollobartionModelImpl.ORDER_BY_JPQL);
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

				if (bindCannabisStage) {
					queryPos.add(cannabisStage);
				}

				if (bindUserType) {
					queryPos.add(userType);
				}

				queryPos.add(archived);

				list = (List<CannabisCollobartion>)QueryUtil.list(
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
	 * Returns the first cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	@Override
	public CannabisCollobartion findBycannabisStage_CUA_First(
			String caseId, String cannabisStage, String userType, int archived,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException {

		CannabisCollobartion cannabisCollobartion =
			fetchBycannabisStage_CUA_First(
				caseId, cannabisStage, userType, archived, orderByComparator);

		if (cannabisCollobartion != null) {
			return cannabisCollobartion;
		}

		StringBundler sb = new StringBundler(10);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append(", cannabisStage=");
		sb.append(cannabisStage);

		sb.append(", userType=");
		sb.append(userType);

		sb.append(", archived=");
		sb.append(archived);

		sb.append("}");

		throw new NoSuchCannabisCollobartionException(sb.toString());
	}

	/**
	 * Returns the first cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	@Override
	public CannabisCollobartion fetchBycannabisStage_CUA_First(
		String caseId, String cannabisStage, String userType, int archived,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		List<CannabisCollobartion> list = findBycannabisStage_CUA(
			caseId, cannabisStage, userType, archived, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	@Override
	public CannabisCollobartion findBycannabisStage_CUA_Last(
			String caseId, String cannabisStage, String userType, int archived,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException {

		CannabisCollobartion cannabisCollobartion =
			fetchBycannabisStage_CUA_Last(
				caseId, cannabisStage, userType, archived, orderByComparator);

		if (cannabisCollobartion != null) {
			return cannabisCollobartion;
		}

		StringBundler sb = new StringBundler(10);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append(", cannabisStage=");
		sb.append(cannabisStage);

		sb.append(", userType=");
		sb.append(userType);

		sb.append(", archived=");
		sb.append(archived);

		sb.append("}");

		throw new NoSuchCannabisCollobartionException(sb.toString());
	}

	/**
	 * Returns the last cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	@Override
	public CannabisCollobartion fetchBycannabisStage_CUA_Last(
		String caseId, String cannabisStage, String userType, int archived,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		int count = countBycannabisStage_CUA(
			caseId, cannabisStage, userType, archived);

		if (count == 0) {
			return null;
		}

		List<CannabisCollobartion> list = findBycannabisStage_CUA(
			caseId, cannabisStage, userType, archived, count - 1, count,
			orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis collobartions before and after the current cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param cannabisCollaborationId the primary key of the current cannabis collobartion
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a cannabis collobartion with the primary key could not be found
	 */
	@Override
	public CannabisCollobartion[] findBycannabisStage_CUA_PrevAndNext(
			long cannabisCollaborationId, String caseId, String cannabisStage,
			String userType, int archived,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException {

		caseId = Objects.toString(caseId, "");
		cannabisStage = Objects.toString(cannabisStage, "");
		userType = Objects.toString(userType, "");

		CannabisCollobartion cannabisCollobartion = findByPrimaryKey(
			cannabisCollaborationId);

		Session session = null;

		try {
			session = openSession();

			CannabisCollobartion[] array = new CannabisCollobartionImpl[3];

			array[0] = getBycannabisStage_CUA_PrevAndNext(
				session, cannabisCollobartion, caseId, cannabisStage, userType,
				archived, orderByComparator, true);

			array[1] = cannabisCollobartion;

			array[2] = getBycannabisStage_CUA_PrevAndNext(
				session, cannabisCollobartion, caseId, cannabisStage, userType,
				archived, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected CannabisCollobartion getBycannabisStage_CUA_PrevAndNext(
		Session session, CannabisCollobartion cannabisCollobartion,
		String caseId, String cannabisStage, String userType, int archived,
		OrderByComparator<CannabisCollobartion> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				7 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(6);
		}

		sb.append(_SQL_SELECT_CANNABISCOLLOBARTION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_CANNABISSTAGE_CUA_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_CANNABISSTAGE_CUA_CASEID_2);
		}

		boolean bindCannabisStage = false;

		if (cannabisStage.isEmpty()) {
			sb.append(_FINDER_COLUMN_CANNABISSTAGE_CUA_CANNABISSTAGE_3);
		}
		else {
			bindCannabisStage = true;

			sb.append(_FINDER_COLUMN_CANNABISSTAGE_CUA_CANNABISSTAGE_2);
		}

		boolean bindUserType = false;

		if (userType.isEmpty()) {
			sb.append(_FINDER_COLUMN_CANNABISSTAGE_CUA_USERTYPE_3);
		}
		else {
			bindUserType = true;

			sb.append(_FINDER_COLUMN_CANNABISSTAGE_CUA_USERTYPE_2);
		}

		sb.append(_FINDER_COLUMN_CANNABISSTAGE_CUA_ARCHIVED_2);

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
			sb.append(CannabisCollobartionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindCaseId) {
			queryPos.add(caseId);
		}

		if (bindCannabisStage) {
			queryPos.add(cannabisStage);
		}

		if (bindUserType) {
			queryPos.add(userType);
		}

		queryPos.add(archived);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisCollobartion)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisCollobartion> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63; and archived = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param archived the archived
	 */
	@Override
	public void removeBycannabisStage_CUA(
		String caseId, String cannabisStage, String userType, int archived) {

		for (CannabisCollobartion cannabisCollobartion :
				findBycannabisStage_CUA(
					caseId, cannabisStage, userType, archived,
					QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(cannabisCollobartion);
		}
	}

	/**
	 * Returns the number of cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param archived the archived
	 * @return the number of matching cannabis collobartions
	 */
	@Override
	public int countBycannabisStage_CUA(
		String caseId, String cannabisStage, String userType, int archived) {

		caseId = Objects.toString(caseId, "");
		cannabisStage = Objects.toString(cannabisStage, "");
		userType = Objects.toString(userType, "");

		FinderPath finderPath = _finderPathCountBycannabisStage_CUA;

		Object[] finderArgs = new Object[] {
			caseId, cannabisStage, userType, archived
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_COUNT_CANNABISCOLLOBARTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_CANNABISSTAGE_CUA_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_CANNABISSTAGE_CUA_CASEID_2);
			}

			boolean bindCannabisStage = false;

			if (cannabisStage.isEmpty()) {
				sb.append(_FINDER_COLUMN_CANNABISSTAGE_CUA_CANNABISSTAGE_3);
			}
			else {
				bindCannabisStage = true;

				sb.append(_FINDER_COLUMN_CANNABISSTAGE_CUA_CANNABISSTAGE_2);
			}

			boolean bindUserType = false;

			if (userType.isEmpty()) {
				sb.append(_FINDER_COLUMN_CANNABISSTAGE_CUA_USERTYPE_3);
			}
			else {
				bindUserType = true;

				sb.append(_FINDER_COLUMN_CANNABISSTAGE_CUA_USERTYPE_2);
			}

			sb.append(_FINDER_COLUMN_CANNABISSTAGE_CUA_ARCHIVED_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				if (bindCannabisStage) {
					queryPos.add(cannabisStage);
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

	private static final String _FINDER_COLUMN_CANNABISSTAGE_CUA_CASEID_2 =
		"cannabisCollobartion.caseId = ? AND ";

	private static final String _FINDER_COLUMN_CANNABISSTAGE_CUA_CASEID_3 =
		"(cannabisCollobartion.caseId IS NULL OR cannabisCollobartion.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_CANNABISSTAGE_CUA_CANNABISSTAGE_2 =
			"cannabisCollobartion.cannabisStage = ? AND ";

	private static final String
		_FINDER_COLUMN_CANNABISSTAGE_CUA_CANNABISSTAGE_3 =
			"(cannabisCollobartion.cannabisStage IS NULL OR cannabisCollobartion.cannabisStage = '') AND ";

	private static final String _FINDER_COLUMN_CANNABISSTAGE_CUA_USERTYPE_2 =
		"cannabisCollobartion.userType = ? AND ";

	private static final String _FINDER_COLUMN_CANNABISSTAGE_CUA_USERTYPE_3 =
		"(cannabisCollobartion.userType IS NULL OR cannabisCollobartion.userType = '') AND ";

	private static final String _FINDER_COLUMN_CANNABISSTAGE_CUA_ARCHIVED_2 =
		"cannabisCollobartion.archived = ?";

	public CannabisCollobartionPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");
		dbColumnNames.put("comment", "comment_");

		setDBColumnNames(dbColumnNames);

		setModelClass(CannabisCollobartion.class);

		setModelImplClass(CannabisCollobartionImpl.class);
		setModelPKClass(long.class);

		setTable(CannabisCollobartionTable.INSTANCE);
	}

	/**
	 * Caches the cannabis collobartion in the entity cache if it is enabled.
	 *
	 * @param cannabisCollobartion the cannabis collobartion
	 */
	@Override
	public void cacheResult(CannabisCollobartion cannabisCollobartion) {
		entityCache.putResult(
			CannabisCollobartionImpl.class,
			cannabisCollobartion.getPrimaryKey(), cannabisCollobartion);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				cannabisCollobartion.getUuid(),
				cannabisCollobartion.getGroupId()
			},
			cannabisCollobartion);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the cannabis collobartions in the entity cache if it is enabled.
	 *
	 * @param cannabisCollobartions the cannabis collobartions
	 */
	@Override
	public void cacheResult(List<CannabisCollobartion> cannabisCollobartions) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (cannabisCollobartions.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CannabisCollobartion cannabisCollobartion :
				cannabisCollobartions) {

			if (entityCache.getResult(
					CannabisCollobartionImpl.class,
					cannabisCollobartion.getPrimaryKey()) == null) {

				cacheResult(cannabisCollobartion);
			}
		}
	}

	/**
	 * Clears the cache for all cannabis collobartions.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CannabisCollobartionImpl.class);

		finderCache.clearCache(CannabisCollobartionImpl.class);
	}

	/**
	 * Clears the cache for the cannabis collobartion.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CannabisCollobartion cannabisCollobartion) {
		entityCache.removeResult(
			CannabisCollobartionImpl.class, cannabisCollobartion);
	}

	@Override
	public void clearCache(List<CannabisCollobartion> cannabisCollobartions) {
		for (CannabisCollobartion cannabisCollobartion :
				cannabisCollobartions) {

			entityCache.removeResult(
				CannabisCollobartionImpl.class, cannabisCollobartion);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CannabisCollobartionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CannabisCollobartionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CannabisCollobartionModelImpl cannabisCollobartionModelImpl) {

		Object[] args = new Object[] {
			cannabisCollobartionModelImpl.getUuid(),
			cannabisCollobartionModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, cannabisCollobartionModelImpl);
	}

	/**
	 * Creates a new cannabis collobartion with the primary key. Does not add the cannabis collobartion to the database.
	 *
	 * @param cannabisCollaborationId the primary key for the new cannabis collobartion
	 * @return the new cannabis collobartion
	 */
	@Override
	public CannabisCollobartion create(long cannabisCollaborationId) {
		CannabisCollobartion cannabisCollobartion =
			new CannabisCollobartionImpl();

		cannabisCollobartion.setNew(true);
		cannabisCollobartion.setPrimaryKey(cannabisCollaborationId);

		String uuid = PortalUUIDUtil.generate();

		cannabisCollobartion.setUuid(uuid);

		cannabisCollobartion.setCompanyId(CompanyThreadLocal.getCompanyId());

		return cannabisCollobartion;
	}

	/**
	 * Removes the cannabis collobartion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisCollaborationId the primary key of the cannabis collobartion
	 * @return the cannabis collobartion that was removed
	 * @throws NoSuchCannabisCollobartionException if a cannabis collobartion with the primary key could not be found
	 */
	@Override
	public CannabisCollobartion remove(long cannabisCollaborationId)
		throws NoSuchCannabisCollobartionException {

		return remove((Serializable)cannabisCollaborationId);
	}

	/**
	 * Removes the cannabis collobartion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cannabis collobartion
	 * @return the cannabis collobartion that was removed
	 * @throws NoSuchCannabisCollobartionException if a cannabis collobartion with the primary key could not be found
	 */
	@Override
	public CannabisCollobartion remove(Serializable primaryKey)
		throws NoSuchCannabisCollobartionException {

		Session session = null;

		try {
			session = openSession();

			CannabisCollobartion cannabisCollobartion =
				(CannabisCollobartion)session.get(
					CannabisCollobartionImpl.class, primaryKey);

			if (cannabisCollobartion == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCannabisCollobartionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(cannabisCollobartion);
		}
		catch (NoSuchCannabisCollobartionException noSuchEntityException) {
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
	protected CannabisCollobartion removeImpl(
		CannabisCollobartion cannabisCollobartion) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cannabisCollobartion)) {
				cannabisCollobartion = (CannabisCollobartion)session.get(
					CannabisCollobartionImpl.class,
					cannabisCollobartion.getPrimaryKeyObj());
			}

			if (cannabisCollobartion != null) {
				session.delete(cannabisCollobartion);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (cannabisCollobartion != null) {
			clearCache(cannabisCollobartion);
		}

		return cannabisCollobartion;
	}

	@Override
	public CannabisCollobartion updateImpl(
		CannabisCollobartion cannabisCollobartion) {

		boolean isNew = cannabisCollobartion.isNew();

		if (!(cannabisCollobartion instanceof CannabisCollobartionModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(cannabisCollobartion.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					cannabisCollobartion);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cannabisCollobartion proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CannabisCollobartion implementation " +
					cannabisCollobartion.getClass());
		}

		CannabisCollobartionModelImpl cannabisCollobartionModelImpl =
			(CannabisCollobartionModelImpl)cannabisCollobartion;

		if (Validator.isNull(cannabisCollobartion.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			cannabisCollobartion.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (cannabisCollobartion.getCreateDate() == null)) {
			if (serviceContext == null) {
				cannabisCollobartion.setCreateDate(date);
			}
			else {
				cannabisCollobartion.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!cannabisCollobartionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				cannabisCollobartion.setModifiedDate(date);
			}
			else {
				cannabisCollobartion.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(cannabisCollobartion);
			}
			else {
				cannabisCollobartion = (CannabisCollobartion)session.merge(
					cannabisCollobartion);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CannabisCollobartionImpl.class, cannabisCollobartionModelImpl,
			false, true);

		cacheUniqueFindersCache(cannabisCollobartionModelImpl);

		if (isNew) {
			cannabisCollobartion.setNew(false);
		}

		cannabisCollobartion.resetOriginalValues();

		return cannabisCollobartion;
	}

	/**
	 * Returns the cannabis collobartion with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cannabis collobartion
	 * @return the cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a cannabis collobartion with the primary key could not be found
	 */
	@Override
	public CannabisCollobartion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCannabisCollobartionException {

		CannabisCollobartion cannabisCollobartion = fetchByPrimaryKey(
			primaryKey);

		if (cannabisCollobartion == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCannabisCollobartionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return cannabisCollobartion;
	}

	/**
	 * Returns the cannabis collobartion with the primary key or throws a <code>NoSuchCannabisCollobartionException</code> if it could not be found.
	 *
	 * @param cannabisCollaborationId the primary key of the cannabis collobartion
	 * @return the cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a cannabis collobartion with the primary key could not be found
	 */
	@Override
	public CannabisCollobartion findByPrimaryKey(long cannabisCollaborationId)
		throws NoSuchCannabisCollobartionException {

		return findByPrimaryKey((Serializable)cannabisCollaborationId);
	}

	/**
	 * Returns the cannabis collobartion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisCollaborationId the primary key of the cannabis collobartion
	 * @return the cannabis collobartion, or <code>null</code> if a cannabis collobartion with the primary key could not be found
	 */
	@Override
	public CannabisCollobartion fetchByPrimaryKey(
		long cannabisCollaborationId) {

		return fetchByPrimaryKey((Serializable)cannabisCollaborationId);
	}

	/**
	 * Returns all the cannabis collobartions.
	 *
	 * @return the cannabis collobartions
	 */
	@Override
	public List<CannabisCollobartion> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis collobartions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @return the range of cannabis collobartions
	 */
	@Override
	public List<CannabisCollobartion> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis collobartions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis collobartions
	 */
	@Override
	public List<CannabisCollobartion> findAll(
		int start, int end,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis collobartions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis collobartions
	 */
	@Override
	public List<CannabisCollobartion> findAll(
		int start, int end,
		OrderByComparator<CannabisCollobartion> orderByComparator,
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

		List<CannabisCollobartion> list = null;

		if (useFinderCache) {
			list = (List<CannabisCollobartion>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CANNABISCOLLOBARTION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CANNABISCOLLOBARTION;

				sql = sql.concat(CannabisCollobartionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CannabisCollobartion>)QueryUtil.list(
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
	 * Removes all the cannabis collobartions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CannabisCollobartion cannabisCollobartion : findAll()) {
			remove(cannabisCollobartion);
		}
	}

	/**
	 * Returns the number of cannabis collobartions.
	 *
	 * @return the number of cannabis collobartions
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
					_SQL_COUNT_CANNABISCOLLOBARTION);

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
		return "cannabisCollaborationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CANNABISCOLLOBARTION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CannabisCollobartionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cannabis collobartion persistence.
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

		_finderPathWithPaginationFindBycannabisStage_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBycannabisStage_CaseId",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"caseId", "cannabisStage"}, true);

		_finderPathWithoutPaginationFindBycannabisStage_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBycannabisStage_CaseId",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "cannabisStage"}, true);

		_finderPathCountBycannabisStage_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBycannabisStage_CaseId",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "cannabisStage"}, false);

		_finderPathWithPaginationFindBycannabisStage_CU = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycannabisStage_CU",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId", "cannabisStage", "userType"}, true);

		_finderPathWithoutPaginationFindBycannabisStage_CU = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycannabisStage_CU",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "cannabisStage", "userType"}, true);

		_finderPathCountBycannabisStage_CU = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBycannabisStage_CU",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "cannabisStage", "userType"}, false);

		_finderPathWithPaginationFindBycannabisStage_CUA = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycannabisStage_CUA",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"caseId", "cannabisStage", "userType", "archived"},
			true);

		_finderPathWithoutPaginationFindBycannabisStage_CUA = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBycannabisStage_CUA",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			},
			new String[] {"caseId", "cannabisStage", "userType", "archived"},
			true);

		_finderPathCountBycannabisStage_CUA = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBycannabisStage_CUA",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			},
			new String[] {"caseId", "cannabisStage", "userType", "archived"},
			false);

		CannabisCollobartionUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CannabisCollobartionUtil.setPersistence(null);

		entityCache.removeCache(CannabisCollobartionImpl.class.getName());
	}

	@Override
	@Reference(
		target = CANNABIS_COLLABORATIONPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = CANNABIS_COLLABORATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = CANNABIS_COLLABORATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_CANNABISCOLLOBARTION =
		"SELECT cannabisCollobartion FROM CannabisCollobartion cannabisCollobartion";

	private static final String _SQL_SELECT_CANNABISCOLLOBARTION_WHERE =
		"SELECT cannabisCollobartion FROM CannabisCollobartion cannabisCollobartion WHERE ";

	private static final String _SQL_COUNT_CANNABISCOLLOBARTION =
		"SELECT COUNT(cannabisCollobartion) FROM CannabisCollobartion cannabisCollobartion";

	private static final String _SQL_COUNT_CANNABISCOLLOBARTION_WHERE =
		"SELECT COUNT(cannabisCollobartion) FROM CannabisCollobartion cannabisCollobartion WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"cannabisCollobartion.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CannabisCollobartion exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CannabisCollobartion exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CannabisCollobartionPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid", "comment"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}