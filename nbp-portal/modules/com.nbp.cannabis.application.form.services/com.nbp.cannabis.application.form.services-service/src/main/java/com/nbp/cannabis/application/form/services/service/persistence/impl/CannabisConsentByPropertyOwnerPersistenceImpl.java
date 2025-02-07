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

import com.nbp.cannabis.application.form.services.exception.NoSuchCannabisConsentByPropertyOwnerException;
import com.nbp.cannabis.application.form.services.model.CannabisConsentByPropertyOwner;
import com.nbp.cannabis.application.form.services.model.CannabisConsentByPropertyOwnerTable;
import com.nbp.cannabis.application.form.services.model.impl.CannabisConsentByPropertyOwnerImpl;
import com.nbp.cannabis.application.form.services.model.impl.CannabisConsentByPropertyOwnerModelImpl;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisConsentByPropertyOwnerPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisConsentByPropertyOwnerUtil;
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
 * The persistence implementation for the cannabis consent by property owner service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CannabisConsentByPropertyOwnerPersistence.class)
public class CannabisConsentByPropertyOwnerPersistenceImpl
	extends BasePersistenceImpl<CannabisConsentByPropertyOwner>
	implements CannabisConsentByPropertyOwnerPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CannabisConsentByPropertyOwnerUtil</code> to access the cannabis consent by property owner persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CannabisConsentByPropertyOwnerImpl.class.getName();

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
	 * Returns all the cannabis consent by property owners where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cannabis consent by property owners
	 */
	@Override
	public List<CannabisConsentByPropertyOwner> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis consent by property owners where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentByPropertyOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis consent by property owners
	 * @param end the upper bound of the range of cannabis consent by property owners (not inclusive)
	 * @return the range of matching cannabis consent by property owners
	 */
	@Override
	public List<CannabisConsentByPropertyOwner> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis consent by property owners where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentByPropertyOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis consent by property owners
	 * @param end the upper bound of the range of cannabis consent by property owners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis consent by property owners
	 */
	@Override
	public List<CannabisConsentByPropertyOwner> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis consent by property owners where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentByPropertyOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis consent by property owners
	 * @param end the upper bound of the range of cannabis consent by property owners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis consent by property owners
	 */
	@Override
	public List<CannabisConsentByPropertyOwner> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator,
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

		List<CannabisConsentByPropertyOwner> list = null;

		if (useFinderCache) {
			list = (List<CannabisConsentByPropertyOwner>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisConsentByPropertyOwner
						cannabisConsentByPropertyOwner : list) {

					if (!uuid.equals(
							cannabisConsentByPropertyOwner.getUuid())) {

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

			sb.append(_SQL_SELECT_CANNABISCONSENTBYPROPERTYOWNER_WHERE);

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
					CannabisConsentByPropertyOwnerModelImpl.ORDER_BY_JPQL);
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

				list = (List<CannabisConsentByPropertyOwner>)QueryUtil.list(
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
	 * Returns the first cannabis consent by property owner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis consent by property owner
	 * @throws NoSuchCannabisConsentByPropertyOwnerException if a matching cannabis consent by property owner could not be found
	 */
	@Override
	public CannabisConsentByPropertyOwner findByUuid_First(
			String uuid,
			OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator)
		throws NoSuchCannabisConsentByPropertyOwnerException {

		CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner =
			fetchByUuid_First(uuid, orderByComparator);

		if (cannabisConsentByPropertyOwner != null) {
			return cannabisConsentByPropertyOwner;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchCannabisConsentByPropertyOwnerException(sb.toString());
	}

	/**
	 * Returns the first cannabis consent by property owner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis consent by property owner, or <code>null</code> if a matching cannabis consent by property owner could not be found
	 */
	@Override
	public CannabisConsentByPropertyOwner fetchByUuid_First(
		String uuid,
		OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator) {

		List<CannabisConsentByPropertyOwner> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis consent by property owner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis consent by property owner
	 * @throws NoSuchCannabisConsentByPropertyOwnerException if a matching cannabis consent by property owner could not be found
	 */
	@Override
	public CannabisConsentByPropertyOwner findByUuid_Last(
			String uuid,
			OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator)
		throws NoSuchCannabisConsentByPropertyOwnerException {

		CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner =
			fetchByUuid_Last(uuid, orderByComparator);

		if (cannabisConsentByPropertyOwner != null) {
			return cannabisConsentByPropertyOwner;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchCannabisConsentByPropertyOwnerException(sb.toString());
	}

	/**
	 * Returns the last cannabis consent by property owner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis consent by property owner, or <code>null</code> if a matching cannabis consent by property owner could not be found
	 */
	@Override
	public CannabisConsentByPropertyOwner fetchByUuid_Last(
		String uuid,
		OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<CannabisConsentByPropertyOwner> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis consent by property owners before and after the current cannabis consent by property owner in the ordered set where uuid = &#63;.
	 *
	 * @param cannabisCPOId the primary key of the current cannabis consent by property owner
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis consent by property owner
	 * @throws NoSuchCannabisConsentByPropertyOwnerException if a cannabis consent by property owner with the primary key could not be found
	 */
	@Override
	public CannabisConsentByPropertyOwner[] findByUuid_PrevAndNext(
			long cannabisCPOId, String uuid,
			OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator)
		throws NoSuchCannabisConsentByPropertyOwnerException {

		uuid = Objects.toString(uuid, "");

		CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner =
			findByPrimaryKey(cannabisCPOId);

		Session session = null;

		try {
			session = openSession();

			CannabisConsentByPropertyOwner[] array =
				new CannabisConsentByPropertyOwnerImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, cannabisConsentByPropertyOwner, uuid,
				orderByComparator, true);

			array[1] = cannabisConsentByPropertyOwner;

			array[2] = getByUuid_PrevAndNext(
				session, cannabisConsentByPropertyOwner, uuid,
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

	protected CannabisConsentByPropertyOwner getByUuid_PrevAndNext(
		Session session,
		CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner,
		String uuid,
		OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISCONSENTBYPROPERTYOWNER_WHERE);

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
			sb.append(CannabisConsentByPropertyOwnerModelImpl.ORDER_BY_JPQL);
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
						cannabisConsentByPropertyOwner)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisConsentByPropertyOwner> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis consent by property owners where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(cannabisConsentByPropertyOwner);
		}
	}

	/**
	 * Returns the number of cannabis consent by property owners where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cannabis consent by property owners
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISCONSENTBYPROPERTYOWNER_WHERE);

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
		"cannabisConsentByPropertyOwner.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(cannabisConsentByPropertyOwner.uuid IS NULL OR cannabisConsentByPropertyOwner.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the cannabis consent by property owner where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCannabisConsentByPropertyOwnerException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis consent by property owner
	 * @throws NoSuchCannabisConsentByPropertyOwnerException if a matching cannabis consent by property owner could not be found
	 */
	@Override
	public CannabisConsentByPropertyOwner findByUUID_G(
			String uuid, long groupId)
		throws NoSuchCannabisConsentByPropertyOwnerException {

		CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner =
			fetchByUUID_G(uuid, groupId);

		if (cannabisConsentByPropertyOwner == null) {
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

			throw new NoSuchCannabisConsentByPropertyOwnerException(
				sb.toString());
		}

		return cannabisConsentByPropertyOwner;
	}

	/**
	 * Returns the cannabis consent by property owner where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis consent by property owner, or <code>null</code> if a matching cannabis consent by property owner could not be found
	 */
	@Override
	public CannabisConsentByPropertyOwner fetchByUUID_G(
		String uuid, long groupId) {

		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the cannabis consent by property owner where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis consent by property owner, or <code>null</code> if a matching cannabis consent by property owner could not be found
	 */
	@Override
	public CannabisConsentByPropertyOwner fetchByUUID_G(
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

		if (result instanceof CannabisConsentByPropertyOwner) {
			CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner =
				(CannabisConsentByPropertyOwner)result;

			if (!Objects.equals(
					uuid, cannabisConsentByPropertyOwner.getUuid()) ||
				(groupId != cannabisConsentByPropertyOwner.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_CANNABISCONSENTBYPROPERTYOWNER_WHERE);

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

				List<CannabisConsentByPropertyOwner> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					CannabisConsentByPropertyOwner
						cannabisConsentByPropertyOwner = list.get(0);

					result = cannabisConsentByPropertyOwner;

					cacheResult(cannabisConsentByPropertyOwner);
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
			return (CannabisConsentByPropertyOwner)result;
		}
	}

	/**
	 * Removes the cannabis consent by property owner where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the cannabis consent by property owner that was removed
	 */
	@Override
	public CannabisConsentByPropertyOwner removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchCannabisConsentByPropertyOwnerException {

		CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner =
			findByUUID_G(uuid, groupId);

		return remove(cannabisConsentByPropertyOwner);
	}

	/**
	 * Returns the number of cannabis consent by property owners where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cannabis consent by property owners
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISCONSENTBYPROPERTYOWNER_WHERE);

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
		"cannabisConsentByPropertyOwner.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(cannabisConsentByPropertyOwner.uuid IS NULL OR cannabisConsentByPropertyOwner.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"cannabisConsentByPropertyOwner.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the cannabis consent by property owners where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cannabis consent by property owners
	 */
	@Override
	public List<CannabisConsentByPropertyOwner> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis consent by property owners where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentByPropertyOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis consent by property owners
	 * @param end the upper bound of the range of cannabis consent by property owners (not inclusive)
	 * @return the range of matching cannabis consent by property owners
	 */
	@Override
	public List<CannabisConsentByPropertyOwner> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis consent by property owners where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentByPropertyOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis consent by property owners
	 * @param end the upper bound of the range of cannabis consent by property owners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis consent by property owners
	 */
	@Override
	public List<CannabisConsentByPropertyOwner> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis consent by property owners where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentByPropertyOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis consent by property owners
	 * @param end the upper bound of the range of cannabis consent by property owners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis consent by property owners
	 */
	@Override
	public List<CannabisConsentByPropertyOwner> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator,
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

		List<CannabisConsentByPropertyOwner> list = null;

		if (useFinderCache) {
			list = (List<CannabisConsentByPropertyOwner>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisConsentByPropertyOwner
						cannabisConsentByPropertyOwner : list) {

					if (!uuid.equals(
							cannabisConsentByPropertyOwner.getUuid()) ||
						(companyId !=
							cannabisConsentByPropertyOwner.getCompanyId())) {

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

			sb.append(_SQL_SELECT_CANNABISCONSENTBYPROPERTYOWNER_WHERE);

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
					CannabisConsentByPropertyOwnerModelImpl.ORDER_BY_JPQL);
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

				list = (List<CannabisConsentByPropertyOwner>)QueryUtil.list(
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
	 * Returns the first cannabis consent by property owner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis consent by property owner
	 * @throws NoSuchCannabisConsentByPropertyOwnerException if a matching cannabis consent by property owner could not be found
	 */
	@Override
	public CannabisConsentByPropertyOwner findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator)
		throws NoSuchCannabisConsentByPropertyOwnerException {

		CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner =
			fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (cannabisConsentByPropertyOwner != null) {
			return cannabisConsentByPropertyOwner;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchCannabisConsentByPropertyOwnerException(sb.toString());
	}

	/**
	 * Returns the first cannabis consent by property owner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis consent by property owner, or <code>null</code> if a matching cannabis consent by property owner could not be found
	 */
	@Override
	public CannabisConsentByPropertyOwner fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator) {

		List<CannabisConsentByPropertyOwner> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis consent by property owner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis consent by property owner
	 * @throws NoSuchCannabisConsentByPropertyOwnerException if a matching cannabis consent by property owner could not be found
	 */
	@Override
	public CannabisConsentByPropertyOwner findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator)
		throws NoSuchCannabisConsentByPropertyOwnerException {

		CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner =
			fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (cannabisConsentByPropertyOwner != null) {
			return cannabisConsentByPropertyOwner;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchCannabisConsentByPropertyOwnerException(sb.toString());
	}

	/**
	 * Returns the last cannabis consent by property owner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis consent by property owner, or <code>null</code> if a matching cannabis consent by property owner could not be found
	 */
	@Override
	public CannabisConsentByPropertyOwner fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<CannabisConsentByPropertyOwner> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis consent by property owners before and after the current cannabis consent by property owner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param cannabisCPOId the primary key of the current cannabis consent by property owner
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis consent by property owner
	 * @throws NoSuchCannabisConsentByPropertyOwnerException if a cannabis consent by property owner with the primary key could not be found
	 */
	@Override
	public CannabisConsentByPropertyOwner[] findByUuid_C_PrevAndNext(
			long cannabisCPOId, String uuid, long companyId,
			OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator)
		throws NoSuchCannabisConsentByPropertyOwnerException {

		uuid = Objects.toString(uuid, "");

		CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner =
			findByPrimaryKey(cannabisCPOId);

		Session session = null;

		try {
			session = openSession();

			CannabisConsentByPropertyOwner[] array =
				new CannabisConsentByPropertyOwnerImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, cannabisConsentByPropertyOwner, uuid, companyId,
				orderByComparator, true);

			array[1] = cannabisConsentByPropertyOwner;

			array[2] = getByUuid_C_PrevAndNext(
				session, cannabisConsentByPropertyOwner, uuid, companyId,
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

	protected CannabisConsentByPropertyOwner getByUuid_C_PrevAndNext(
		Session session,
		CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner,
		String uuid, long companyId,
		OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISCONSENTBYPROPERTYOWNER_WHERE);

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
			sb.append(CannabisConsentByPropertyOwnerModelImpl.ORDER_BY_JPQL);
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
						cannabisConsentByPropertyOwner)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisConsentByPropertyOwner> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis consent by property owners where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(cannabisConsentByPropertyOwner);
		}
	}

	/**
	 * Returns the number of cannabis consent by property owners where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cannabis consent by property owners
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISCONSENTBYPROPERTYOWNER_WHERE);

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
		"cannabisConsentByPropertyOwner.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(cannabisConsentByPropertyOwner.uuid IS NULL OR cannabisConsentByPropertyOwner.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"cannabisConsentByPropertyOwner.companyId = ?";

	private FinderPath _finderPathFetchBygetCA_CPO_CAI;
	private FinderPath _finderPathCountBygetCA_CPO_CAI;

	/**
	 * Returns the cannabis consent by property owner where cannabisApplicationId = &#63; or throws a <code>NoSuchCannabisConsentByPropertyOwnerException</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis consent by property owner
	 * @throws NoSuchCannabisConsentByPropertyOwnerException if a matching cannabis consent by property owner could not be found
	 */
	@Override
	public CannabisConsentByPropertyOwner findBygetCA_CPO_CAI(
			long cannabisApplicationId)
		throws NoSuchCannabisConsentByPropertyOwnerException {

		CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner =
			fetchBygetCA_CPO_CAI(cannabisApplicationId);

		if (cannabisConsentByPropertyOwner == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("cannabisApplicationId=");
			sb.append(cannabisApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCannabisConsentByPropertyOwnerException(
				sb.toString());
		}

		return cannabisConsentByPropertyOwner;
	}

	/**
	 * Returns the cannabis consent by property owner where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis consent by property owner, or <code>null</code> if a matching cannabis consent by property owner could not be found
	 */
	@Override
	public CannabisConsentByPropertyOwner fetchBygetCA_CPO_CAI(
		long cannabisApplicationId) {

		return fetchBygetCA_CPO_CAI(cannabisApplicationId, true);
	}

	/**
	 * Returns the cannabis consent by property owner where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis consent by property owner, or <code>null</code> if a matching cannabis consent by property owner could not be found
	 */
	@Override
	public CannabisConsentByPropertyOwner fetchBygetCA_CPO_CAI(
		long cannabisApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {cannabisApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetCA_CPO_CAI, finderArgs, this);
		}

		if (result instanceof CannabisConsentByPropertyOwner) {
			CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner =
				(CannabisConsentByPropertyOwner)result;

			if (cannabisApplicationId !=
					cannabisConsentByPropertyOwner.getCannabisApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_CANNABISCONSENTBYPROPERTYOWNER_WHERE);

			sb.append(_FINDER_COLUMN_GETCA_CPO_CAI_CANNABISAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(cannabisApplicationId);

				List<CannabisConsentByPropertyOwner> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCA_CPO_CAI, finderArgs, list);
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
								"CannabisConsentByPropertyOwnerPersistenceImpl.fetchBygetCA_CPO_CAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CannabisConsentByPropertyOwner
						cannabisConsentByPropertyOwner = list.get(0);

					result = cannabisConsentByPropertyOwner;

					cacheResult(cannabisConsentByPropertyOwner);
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
			return (CannabisConsentByPropertyOwner)result;
		}
	}

	/**
	 * Removes the cannabis consent by property owner where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the cannabis consent by property owner that was removed
	 */
	@Override
	public CannabisConsentByPropertyOwner removeBygetCA_CPO_CAI(
			long cannabisApplicationId)
		throws NoSuchCannabisConsentByPropertyOwnerException {

		CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner =
			findBygetCA_CPO_CAI(cannabisApplicationId);

		return remove(cannabisConsentByPropertyOwner);
	}

	/**
	 * Returns the number of cannabis consent by property owners where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis consent by property owners
	 */
	@Override
	public int countBygetCA_CPO_CAI(long cannabisApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCA_CPO_CAI;

		Object[] finderArgs = new Object[] {cannabisApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISCONSENTBYPROPERTYOWNER_WHERE);

			sb.append(_FINDER_COLUMN_GETCA_CPO_CAI_CANNABISAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETCA_CPO_CAI_CANNABISAPPLICATIONID_2 =
			"cannabisConsentByPropertyOwner.cannabisApplicationId = ?";

	public CannabisConsentByPropertyOwnerPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(CannabisConsentByPropertyOwner.class);

		setModelImplClass(CannabisConsentByPropertyOwnerImpl.class);
		setModelPKClass(long.class);

		setTable(CannabisConsentByPropertyOwnerTable.INSTANCE);
	}

	/**
	 * Caches the cannabis consent by property owner in the entity cache if it is enabled.
	 *
	 * @param cannabisConsentByPropertyOwner the cannabis consent by property owner
	 */
	@Override
	public void cacheResult(
		CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner) {

		entityCache.putResult(
			CannabisConsentByPropertyOwnerImpl.class,
			cannabisConsentByPropertyOwner.getPrimaryKey(),
			cannabisConsentByPropertyOwner);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				cannabisConsentByPropertyOwner.getUuid(),
				cannabisConsentByPropertyOwner.getGroupId()
			},
			cannabisConsentByPropertyOwner);

		finderCache.putResult(
			_finderPathFetchBygetCA_CPO_CAI,
			new Object[] {
				cannabisConsentByPropertyOwner.getCannabisApplicationId()
			},
			cannabisConsentByPropertyOwner);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the cannabis consent by property owners in the entity cache if it is enabled.
	 *
	 * @param cannabisConsentByPropertyOwners the cannabis consent by property owners
	 */
	@Override
	public void cacheResult(
		List<CannabisConsentByPropertyOwner> cannabisConsentByPropertyOwners) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (cannabisConsentByPropertyOwners.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner :
				cannabisConsentByPropertyOwners) {

			if (entityCache.getResult(
					CannabisConsentByPropertyOwnerImpl.class,
					cannabisConsentByPropertyOwner.getPrimaryKey()) == null) {

				cacheResult(cannabisConsentByPropertyOwner);
			}
		}
	}

	/**
	 * Clears the cache for all cannabis consent by property owners.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CannabisConsentByPropertyOwnerImpl.class);

		finderCache.clearCache(CannabisConsentByPropertyOwnerImpl.class);
	}

	/**
	 * Clears the cache for the cannabis consent by property owner.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner) {

		entityCache.removeResult(
			CannabisConsentByPropertyOwnerImpl.class,
			cannabisConsentByPropertyOwner);
	}

	@Override
	public void clearCache(
		List<CannabisConsentByPropertyOwner> cannabisConsentByPropertyOwners) {

		for (CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner :
				cannabisConsentByPropertyOwners) {

			entityCache.removeResult(
				CannabisConsentByPropertyOwnerImpl.class,
				cannabisConsentByPropertyOwner);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CannabisConsentByPropertyOwnerImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CannabisConsentByPropertyOwnerImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CannabisConsentByPropertyOwnerModelImpl
			cannabisConsentByPropertyOwnerModelImpl) {

		Object[] args = new Object[] {
			cannabisConsentByPropertyOwnerModelImpl.getUuid(),
			cannabisConsentByPropertyOwnerModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args,
			cannabisConsentByPropertyOwnerModelImpl);

		args = new Object[] {
			cannabisConsentByPropertyOwnerModelImpl.getCannabisApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetCA_CPO_CAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCA_CPO_CAI, args,
			cannabisConsentByPropertyOwnerModelImpl);
	}

	/**
	 * Creates a new cannabis consent by property owner with the primary key. Does not add the cannabis consent by property owner to the database.
	 *
	 * @param cannabisCPOId the primary key for the new cannabis consent by property owner
	 * @return the new cannabis consent by property owner
	 */
	@Override
	public CannabisConsentByPropertyOwner create(long cannabisCPOId) {
		CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner =
			new CannabisConsentByPropertyOwnerImpl();

		cannabisConsentByPropertyOwner.setNew(true);
		cannabisConsentByPropertyOwner.setPrimaryKey(cannabisCPOId);

		String uuid = PortalUUIDUtil.generate();

		cannabisConsentByPropertyOwner.setUuid(uuid);

		cannabisConsentByPropertyOwner.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return cannabisConsentByPropertyOwner;
	}

	/**
	 * Removes the cannabis consent by property owner with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisCPOId the primary key of the cannabis consent by property owner
	 * @return the cannabis consent by property owner that was removed
	 * @throws NoSuchCannabisConsentByPropertyOwnerException if a cannabis consent by property owner with the primary key could not be found
	 */
	@Override
	public CannabisConsentByPropertyOwner remove(long cannabisCPOId)
		throws NoSuchCannabisConsentByPropertyOwnerException {

		return remove((Serializable)cannabisCPOId);
	}

	/**
	 * Removes the cannabis consent by property owner with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cannabis consent by property owner
	 * @return the cannabis consent by property owner that was removed
	 * @throws NoSuchCannabisConsentByPropertyOwnerException if a cannabis consent by property owner with the primary key could not be found
	 */
	@Override
	public CannabisConsentByPropertyOwner remove(Serializable primaryKey)
		throws NoSuchCannabisConsentByPropertyOwnerException {

		Session session = null;

		try {
			session = openSession();

			CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner =
				(CannabisConsentByPropertyOwner)session.get(
					CannabisConsentByPropertyOwnerImpl.class, primaryKey);

			if (cannabisConsentByPropertyOwner == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCannabisConsentByPropertyOwnerException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(cannabisConsentByPropertyOwner);
		}
		catch (NoSuchCannabisConsentByPropertyOwnerException
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
	protected CannabisConsentByPropertyOwner removeImpl(
		CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cannabisConsentByPropertyOwner)) {
				cannabisConsentByPropertyOwner =
					(CannabisConsentByPropertyOwner)session.get(
						CannabisConsentByPropertyOwnerImpl.class,
						cannabisConsentByPropertyOwner.getPrimaryKeyObj());
			}

			if (cannabisConsentByPropertyOwner != null) {
				session.delete(cannabisConsentByPropertyOwner);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (cannabisConsentByPropertyOwner != null) {
			clearCache(cannabisConsentByPropertyOwner);
		}

		return cannabisConsentByPropertyOwner;
	}

	@Override
	public CannabisConsentByPropertyOwner updateImpl(
		CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner) {

		boolean isNew = cannabisConsentByPropertyOwner.isNew();

		if (!(cannabisConsentByPropertyOwner instanceof
				CannabisConsentByPropertyOwnerModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					cannabisConsentByPropertyOwner.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					cannabisConsentByPropertyOwner);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cannabisConsentByPropertyOwner proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CannabisConsentByPropertyOwner implementation " +
					cannabisConsentByPropertyOwner.getClass());
		}

		CannabisConsentByPropertyOwnerModelImpl
			cannabisConsentByPropertyOwnerModelImpl =
				(CannabisConsentByPropertyOwnerModelImpl)
					cannabisConsentByPropertyOwner;

		if (Validator.isNull(cannabisConsentByPropertyOwner.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			cannabisConsentByPropertyOwner.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (cannabisConsentByPropertyOwner.getCreateDate() == null)) {
			if (serviceContext == null) {
				cannabisConsentByPropertyOwner.setCreateDate(date);
			}
			else {
				cannabisConsentByPropertyOwner.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!cannabisConsentByPropertyOwnerModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				cannabisConsentByPropertyOwner.setModifiedDate(date);
			}
			else {
				cannabisConsentByPropertyOwner.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(cannabisConsentByPropertyOwner);
			}
			else {
				cannabisConsentByPropertyOwner =
					(CannabisConsentByPropertyOwner)session.merge(
						cannabisConsentByPropertyOwner);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CannabisConsentByPropertyOwnerImpl.class,
			cannabisConsentByPropertyOwnerModelImpl, false, true);

		cacheUniqueFindersCache(cannabisConsentByPropertyOwnerModelImpl);

		if (isNew) {
			cannabisConsentByPropertyOwner.setNew(false);
		}

		cannabisConsentByPropertyOwner.resetOriginalValues();

		return cannabisConsentByPropertyOwner;
	}

	/**
	 * Returns the cannabis consent by property owner with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cannabis consent by property owner
	 * @return the cannabis consent by property owner
	 * @throws NoSuchCannabisConsentByPropertyOwnerException if a cannabis consent by property owner with the primary key could not be found
	 */
	@Override
	public CannabisConsentByPropertyOwner findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchCannabisConsentByPropertyOwnerException {

		CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner =
			fetchByPrimaryKey(primaryKey);

		if (cannabisConsentByPropertyOwner == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCannabisConsentByPropertyOwnerException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return cannabisConsentByPropertyOwner;
	}

	/**
	 * Returns the cannabis consent by property owner with the primary key or throws a <code>NoSuchCannabisConsentByPropertyOwnerException</code> if it could not be found.
	 *
	 * @param cannabisCPOId the primary key of the cannabis consent by property owner
	 * @return the cannabis consent by property owner
	 * @throws NoSuchCannabisConsentByPropertyOwnerException if a cannabis consent by property owner with the primary key could not be found
	 */
	@Override
	public CannabisConsentByPropertyOwner findByPrimaryKey(long cannabisCPOId)
		throws NoSuchCannabisConsentByPropertyOwnerException {

		return findByPrimaryKey((Serializable)cannabisCPOId);
	}

	/**
	 * Returns the cannabis consent by property owner with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisCPOId the primary key of the cannabis consent by property owner
	 * @return the cannabis consent by property owner, or <code>null</code> if a cannabis consent by property owner with the primary key could not be found
	 */
	@Override
	public CannabisConsentByPropertyOwner fetchByPrimaryKey(
		long cannabisCPOId) {

		return fetchByPrimaryKey((Serializable)cannabisCPOId);
	}

	/**
	 * Returns all the cannabis consent by property owners.
	 *
	 * @return the cannabis consent by property owners
	 */
	@Override
	public List<CannabisConsentByPropertyOwner> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis consent by property owners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentByPropertyOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis consent by property owners
	 * @param end the upper bound of the range of cannabis consent by property owners (not inclusive)
	 * @return the range of cannabis consent by property owners
	 */
	@Override
	public List<CannabisConsentByPropertyOwner> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis consent by property owners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentByPropertyOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis consent by property owners
	 * @param end the upper bound of the range of cannabis consent by property owners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis consent by property owners
	 */
	@Override
	public List<CannabisConsentByPropertyOwner> findAll(
		int start, int end,
		OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis consent by property owners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentByPropertyOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis consent by property owners
	 * @param end the upper bound of the range of cannabis consent by property owners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis consent by property owners
	 */
	@Override
	public List<CannabisConsentByPropertyOwner> findAll(
		int start, int end,
		OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator,
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

		List<CannabisConsentByPropertyOwner> list = null;

		if (useFinderCache) {
			list = (List<CannabisConsentByPropertyOwner>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CANNABISCONSENTBYPROPERTYOWNER);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CANNABISCONSENTBYPROPERTYOWNER;

				sql = sql.concat(
					CannabisConsentByPropertyOwnerModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CannabisConsentByPropertyOwner>)QueryUtil.list(
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
	 * Removes all the cannabis consent by property owners from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner :
				findAll()) {

			remove(cannabisConsentByPropertyOwner);
		}
	}

	/**
	 * Returns the number of cannabis consent by property owners.
	 *
	 * @return the number of cannabis consent by property owners
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
					_SQL_COUNT_CANNABISCONSENTBYPROPERTYOWNER);

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
		return "cannabisCPOId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CANNABISCONSENTBYPROPERTYOWNER;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CannabisConsentByPropertyOwnerModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cannabis consent by property owner persistence.
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

		_finderPathFetchBygetCA_CPO_CAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCA_CPO_CAI",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, true);

		_finderPathCountBygetCA_CPO_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCA_CPO_CAI",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, false);

		CannabisConsentByPropertyOwnerUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CannabisConsentByPropertyOwnerUtil.setPersistence(null);

		entityCache.removeCache(
			CannabisConsentByPropertyOwnerImpl.class.getName());
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

	private static final String _SQL_SELECT_CANNABISCONSENTBYPROPERTYOWNER =
		"SELECT cannabisConsentByPropertyOwner FROM CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner";

	private static final String
		_SQL_SELECT_CANNABISCONSENTBYPROPERTYOWNER_WHERE =
			"SELECT cannabisConsentByPropertyOwner FROM CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner WHERE ";

	private static final String _SQL_COUNT_CANNABISCONSENTBYPROPERTYOWNER =
		"SELECT COUNT(cannabisConsentByPropertyOwner) FROM CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner";

	private static final String
		_SQL_COUNT_CANNABISCONSENTBYPROPERTYOWNER_WHERE =
			"SELECT COUNT(cannabisConsentByPropertyOwner) FROM CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"cannabisConsentByPropertyOwner.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CannabisConsentByPropertyOwner exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CannabisConsentByPropertyOwner exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CannabisConsentByPropertyOwnerPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}