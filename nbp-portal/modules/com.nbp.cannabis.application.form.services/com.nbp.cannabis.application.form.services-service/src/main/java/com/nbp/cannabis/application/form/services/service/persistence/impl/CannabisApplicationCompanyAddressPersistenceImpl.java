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

import com.nbp.cannabis.application.form.services.exception.NoSuchCannabisApplicationCompanyAddressException;
import com.nbp.cannabis.application.form.services.model.CannabisApplicationCompanyAddress;
import com.nbp.cannabis.application.form.services.model.CannabisApplicationCompanyAddressTable;
import com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCompanyAddressImpl;
import com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCompanyAddressModelImpl;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisApplicationCompanyAddressPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisApplicationCompanyAddressUtil;
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
 * The persistence implementation for the cannabis application company address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CannabisApplicationCompanyAddressPersistence.class)
public class CannabisApplicationCompanyAddressPersistenceImpl
	extends BasePersistenceImpl<CannabisApplicationCompanyAddress>
	implements CannabisApplicationCompanyAddressPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CannabisApplicationCompanyAddressUtil</code> to access the cannabis application company address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CannabisApplicationCompanyAddressImpl.class.getName();

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
	 * Returns all the cannabis application company addresses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cannabis application company addresses
	 */
	@Override
	public List<CannabisApplicationCompanyAddress> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis application company addresses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @return the range of matching cannabis application company addresses
	 */
	@Override
	public List<CannabisApplicationCompanyAddress> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis application company addresses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application company addresses
	 */
	@Override
	public List<CannabisApplicationCompanyAddress> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisApplicationCompanyAddress>
			orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis application company addresses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application company addresses
	 */
	@Override
	public List<CannabisApplicationCompanyAddress> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisApplicationCompanyAddress> orderByComparator,
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

		List<CannabisApplicationCompanyAddress> list = null;

		if (useFinderCache) {
			list =
				(List<CannabisApplicationCompanyAddress>)finderCache.getResult(
					finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisApplicationCompanyAddress
						cannabisApplicationCompanyAddress : list) {

					if (!uuid.equals(
							cannabisApplicationCompanyAddress.getUuid())) {

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

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONCOMPANYADDRESS_WHERE);

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
					CannabisApplicationCompanyAddressModelImpl.ORDER_BY_JPQL);
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

				list = (List<CannabisApplicationCompanyAddress>)QueryUtil.list(
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
	 * Returns the first cannabis application company address in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a matching cannabis application company address could not be found
	 */
	@Override
	public CannabisApplicationCompanyAddress findByUuid_First(
			String uuid,
			OrderByComparator<CannabisApplicationCompanyAddress>
				orderByComparator)
		throws NoSuchCannabisApplicationCompanyAddressException {

		CannabisApplicationCompanyAddress cannabisApplicationCompanyAddress =
			fetchByUuid_First(uuid, orderByComparator);

		if (cannabisApplicationCompanyAddress != null) {
			return cannabisApplicationCompanyAddress;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchCannabisApplicationCompanyAddressException(
			sb.toString());
	}

	/**
	 * Returns the first cannabis application company address in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application company address, or <code>null</code> if a matching cannabis application company address could not be found
	 */
	@Override
	public CannabisApplicationCompanyAddress fetchByUuid_First(
		String uuid,
		OrderByComparator<CannabisApplicationCompanyAddress>
			orderByComparator) {

		List<CannabisApplicationCompanyAddress> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis application company address in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a matching cannabis application company address could not be found
	 */
	@Override
	public CannabisApplicationCompanyAddress findByUuid_Last(
			String uuid,
			OrderByComparator<CannabisApplicationCompanyAddress>
				orderByComparator)
		throws NoSuchCannabisApplicationCompanyAddressException {

		CannabisApplicationCompanyAddress cannabisApplicationCompanyAddress =
			fetchByUuid_Last(uuid, orderByComparator);

		if (cannabisApplicationCompanyAddress != null) {
			return cannabisApplicationCompanyAddress;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchCannabisApplicationCompanyAddressException(
			sb.toString());
	}

	/**
	 * Returns the last cannabis application company address in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application company address, or <code>null</code> if a matching cannabis application company address could not be found
	 */
	@Override
	public CannabisApplicationCompanyAddress fetchByUuid_Last(
		String uuid,
		OrderByComparator<CannabisApplicationCompanyAddress>
			orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<CannabisApplicationCompanyAddress> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis application company addresses before and after the current cannabis application company address in the ordered set where uuid = &#63;.
	 *
	 * @param companyAddressId the primary key of the current cannabis application company address
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a cannabis application company address with the primary key could not be found
	 */
	@Override
	public CannabisApplicationCompanyAddress[] findByUuid_PrevAndNext(
			long companyAddressId, String uuid,
			OrderByComparator<CannabisApplicationCompanyAddress>
				orderByComparator)
		throws NoSuchCannabisApplicationCompanyAddressException {

		uuid = Objects.toString(uuid, "");

		CannabisApplicationCompanyAddress cannabisApplicationCompanyAddress =
			findByPrimaryKey(companyAddressId);

		Session session = null;

		try {
			session = openSession();

			CannabisApplicationCompanyAddress[] array =
				new CannabisApplicationCompanyAddressImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, cannabisApplicationCompanyAddress, uuid,
				orderByComparator, true);

			array[1] = cannabisApplicationCompanyAddress;

			array[2] = getByUuid_PrevAndNext(
				session, cannabisApplicationCompanyAddress, uuid,
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

	protected CannabisApplicationCompanyAddress getByUuid_PrevAndNext(
		Session session,
		CannabisApplicationCompanyAddress cannabisApplicationCompanyAddress,
		String uuid,
		OrderByComparator<CannabisApplicationCompanyAddress> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISAPPLICATIONCOMPANYADDRESS_WHERE);

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
			sb.append(CannabisApplicationCompanyAddressModelImpl.ORDER_BY_JPQL);
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
						cannabisApplicationCompanyAddress)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisApplicationCompanyAddress> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis application company addresses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (CannabisApplicationCompanyAddress
				cannabisApplicationCompanyAddress :
					findByUuid(
						uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(cannabisApplicationCompanyAddress);
		}
	}

	/**
	 * Returns the number of cannabis application company addresses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cannabis application company addresses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONCOMPANYADDRESS_WHERE);

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
		"cannabisApplicationCompanyAddress.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(cannabisApplicationCompanyAddress.uuid IS NULL OR cannabisApplicationCompanyAddress.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the cannabis application company address where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCannabisApplicationCompanyAddressException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a matching cannabis application company address could not be found
	 */
	@Override
	public CannabisApplicationCompanyAddress findByUUID_G(
			String uuid, long groupId)
		throws NoSuchCannabisApplicationCompanyAddressException {

		CannabisApplicationCompanyAddress cannabisApplicationCompanyAddress =
			fetchByUUID_G(uuid, groupId);

		if (cannabisApplicationCompanyAddress == null) {
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

			throw new NoSuchCannabisApplicationCompanyAddressException(
				sb.toString());
		}

		return cannabisApplicationCompanyAddress;
	}

	/**
	 * Returns the cannabis application company address where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis application company address, or <code>null</code> if a matching cannabis application company address could not be found
	 */
	@Override
	public CannabisApplicationCompanyAddress fetchByUUID_G(
		String uuid, long groupId) {

		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the cannabis application company address where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application company address, or <code>null</code> if a matching cannabis application company address could not be found
	 */
	@Override
	public CannabisApplicationCompanyAddress fetchByUUID_G(
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

		if (result instanceof CannabisApplicationCompanyAddress) {
			CannabisApplicationCompanyAddress
				cannabisApplicationCompanyAddress =
					(CannabisApplicationCompanyAddress)result;

			if (!Objects.equals(
					uuid, cannabisApplicationCompanyAddress.getUuid()) ||
				(groupId != cannabisApplicationCompanyAddress.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONCOMPANYADDRESS_WHERE);

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

				List<CannabisApplicationCompanyAddress> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					CannabisApplicationCompanyAddress
						cannabisApplicationCompanyAddress = list.get(0);

					result = cannabisApplicationCompanyAddress;

					cacheResult(cannabisApplicationCompanyAddress);
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
			return (CannabisApplicationCompanyAddress)result;
		}
	}

	/**
	 * Removes the cannabis application company address where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the cannabis application company address that was removed
	 */
	@Override
	public CannabisApplicationCompanyAddress removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchCannabisApplicationCompanyAddressException {

		CannabisApplicationCompanyAddress cannabisApplicationCompanyAddress =
			findByUUID_G(uuid, groupId);

		return remove(cannabisApplicationCompanyAddress);
	}

	/**
	 * Returns the number of cannabis application company addresses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cannabis application company addresses
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONCOMPANYADDRESS_WHERE);

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
		"cannabisApplicationCompanyAddress.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(cannabisApplicationCompanyAddress.uuid IS NULL OR cannabisApplicationCompanyAddress.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"cannabisApplicationCompanyAddress.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the cannabis application company addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cannabis application company addresses
	 */
	@Override
	public List<CannabisApplicationCompanyAddress> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis application company addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @return the range of matching cannabis application company addresses
	 */
	@Override
	public List<CannabisApplicationCompanyAddress> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis application company addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application company addresses
	 */
	@Override
	public List<CannabisApplicationCompanyAddress> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisApplicationCompanyAddress>
			orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis application company addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application company addresses
	 */
	@Override
	public List<CannabisApplicationCompanyAddress> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisApplicationCompanyAddress> orderByComparator,
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

		List<CannabisApplicationCompanyAddress> list = null;

		if (useFinderCache) {
			list =
				(List<CannabisApplicationCompanyAddress>)finderCache.getResult(
					finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisApplicationCompanyAddress
						cannabisApplicationCompanyAddress : list) {

					if (!uuid.equals(
							cannabisApplicationCompanyAddress.getUuid()) ||
						(companyId !=
							cannabisApplicationCompanyAddress.getCompanyId())) {

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

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONCOMPANYADDRESS_WHERE);

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
					CannabisApplicationCompanyAddressModelImpl.ORDER_BY_JPQL);
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

				list = (List<CannabisApplicationCompanyAddress>)QueryUtil.list(
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
	 * Returns the first cannabis application company address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a matching cannabis application company address could not be found
	 */
	@Override
	public CannabisApplicationCompanyAddress findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CannabisApplicationCompanyAddress>
				orderByComparator)
		throws NoSuchCannabisApplicationCompanyAddressException {

		CannabisApplicationCompanyAddress cannabisApplicationCompanyAddress =
			fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (cannabisApplicationCompanyAddress != null) {
			return cannabisApplicationCompanyAddress;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchCannabisApplicationCompanyAddressException(
			sb.toString());
	}

	/**
	 * Returns the first cannabis application company address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application company address, or <code>null</code> if a matching cannabis application company address could not be found
	 */
	@Override
	public CannabisApplicationCompanyAddress fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CannabisApplicationCompanyAddress>
			orderByComparator) {

		List<CannabisApplicationCompanyAddress> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis application company address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a matching cannabis application company address could not be found
	 */
	@Override
	public CannabisApplicationCompanyAddress findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CannabisApplicationCompanyAddress>
				orderByComparator)
		throws NoSuchCannabisApplicationCompanyAddressException {

		CannabisApplicationCompanyAddress cannabisApplicationCompanyAddress =
			fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (cannabisApplicationCompanyAddress != null) {
			return cannabisApplicationCompanyAddress;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchCannabisApplicationCompanyAddressException(
			sb.toString());
	}

	/**
	 * Returns the last cannabis application company address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application company address, or <code>null</code> if a matching cannabis application company address could not be found
	 */
	@Override
	public CannabisApplicationCompanyAddress fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CannabisApplicationCompanyAddress>
			orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<CannabisApplicationCompanyAddress> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis application company addresses before and after the current cannabis application company address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param companyAddressId the primary key of the current cannabis application company address
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a cannabis application company address with the primary key could not be found
	 */
	@Override
	public CannabisApplicationCompanyAddress[] findByUuid_C_PrevAndNext(
			long companyAddressId, String uuid, long companyId,
			OrderByComparator<CannabisApplicationCompanyAddress>
				orderByComparator)
		throws NoSuchCannabisApplicationCompanyAddressException {

		uuid = Objects.toString(uuid, "");

		CannabisApplicationCompanyAddress cannabisApplicationCompanyAddress =
			findByPrimaryKey(companyAddressId);

		Session session = null;

		try {
			session = openSession();

			CannabisApplicationCompanyAddress[] array =
				new CannabisApplicationCompanyAddressImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, cannabisApplicationCompanyAddress, uuid, companyId,
				orderByComparator, true);

			array[1] = cannabisApplicationCompanyAddress;

			array[2] = getByUuid_C_PrevAndNext(
				session, cannabisApplicationCompanyAddress, uuid, companyId,
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

	protected CannabisApplicationCompanyAddress getByUuid_C_PrevAndNext(
		Session session,
		CannabisApplicationCompanyAddress cannabisApplicationCompanyAddress,
		String uuid, long companyId,
		OrderByComparator<CannabisApplicationCompanyAddress> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISAPPLICATIONCOMPANYADDRESS_WHERE);

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
			sb.append(CannabisApplicationCompanyAddressModelImpl.ORDER_BY_JPQL);
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
						cannabisApplicationCompanyAddress)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisApplicationCompanyAddress> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis application company addresses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (CannabisApplicationCompanyAddress
				cannabisApplicationCompanyAddress :
					findByUuid_C(
						uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
						null)) {

			remove(cannabisApplicationCompanyAddress);
		}
	}

	/**
	 * Returns the number of cannabis application company addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cannabis application company addresses
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONCOMPANYADDRESS_WHERE);

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
		"cannabisApplicationCompanyAddress.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(cannabisApplicationCompanyAddress.uuid IS NULL OR cannabisApplicationCompanyAddress.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"cannabisApplicationCompanyAddress.companyId = ?";

	private FinderPath _finderPathFetchBygetCA_CA_by_CI_AT;
	private FinderPath _finderPathCountBygetCA_CA_by_CI_AT;

	/**
	 * Returns the cannabis application company address where addressType = &#63; and companyInformationId = &#63; or throws a <code>NoSuchCannabisApplicationCompanyAddressException</code> if it could not be found.
	 *
	 * @param addressType the address type
	 * @param companyInformationId the company information ID
	 * @return the matching cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a matching cannabis application company address could not be found
	 */
	@Override
	public CannabisApplicationCompanyAddress findBygetCA_CA_by_CI_AT(
			String addressType, long companyInformationId)
		throws NoSuchCannabisApplicationCompanyAddressException {

		CannabisApplicationCompanyAddress cannabisApplicationCompanyAddress =
			fetchBygetCA_CA_by_CI_AT(addressType, companyInformationId);

		if (cannabisApplicationCompanyAddress == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("addressType=");
			sb.append(addressType);

			sb.append(", companyInformationId=");
			sb.append(companyInformationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCannabisApplicationCompanyAddressException(
				sb.toString());
		}

		return cannabisApplicationCompanyAddress;
	}

	/**
	 * Returns the cannabis application company address where addressType = &#63; and companyInformationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param addressType the address type
	 * @param companyInformationId the company information ID
	 * @return the matching cannabis application company address, or <code>null</code> if a matching cannabis application company address could not be found
	 */
	@Override
	public CannabisApplicationCompanyAddress fetchBygetCA_CA_by_CI_AT(
		String addressType, long companyInformationId) {

		return fetchBygetCA_CA_by_CI_AT(
			addressType, companyInformationId, true);
	}

	/**
	 * Returns the cannabis application company address where addressType = &#63; and companyInformationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param addressType the address type
	 * @param companyInformationId the company information ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application company address, or <code>null</code> if a matching cannabis application company address could not be found
	 */
	@Override
	public CannabisApplicationCompanyAddress fetchBygetCA_CA_by_CI_AT(
		String addressType, long companyInformationId, boolean useFinderCache) {

		addressType = Objects.toString(addressType, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {addressType, companyInformationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetCA_CA_by_CI_AT, finderArgs, this);
		}

		if (result instanceof CannabisApplicationCompanyAddress) {
			CannabisApplicationCompanyAddress
				cannabisApplicationCompanyAddress =
					(CannabisApplicationCompanyAddress)result;

			if (!Objects.equals(
					addressType,
					cannabisApplicationCompanyAddress.getAddressType()) ||
				(companyInformationId !=
					cannabisApplicationCompanyAddress.
						getCompanyInformationId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONCOMPANYADDRESS_WHERE);

			boolean bindAddressType = false;

			if (addressType.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCA_CA_BY_CI_AT_ADDRESSTYPE_3);
			}
			else {
				bindAddressType = true;

				sb.append(_FINDER_COLUMN_GETCA_CA_BY_CI_AT_ADDRESSTYPE_2);
			}

			sb.append(_FINDER_COLUMN_GETCA_CA_BY_CI_AT_COMPANYINFORMATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindAddressType) {
					queryPos.add(addressType);
				}

				queryPos.add(companyInformationId);

				List<CannabisApplicationCompanyAddress> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCA_CA_by_CI_AT, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									addressType, companyInformationId
								};
							}

							_log.warn(
								"CannabisApplicationCompanyAddressPersistenceImpl.fetchBygetCA_CA_by_CI_AT(String, long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CannabisApplicationCompanyAddress
						cannabisApplicationCompanyAddress = list.get(0);

					result = cannabisApplicationCompanyAddress;

					cacheResult(cannabisApplicationCompanyAddress);
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
			return (CannabisApplicationCompanyAddress)result;
		}
	}

	/**
	 * Removes the cannabis application company address where addressType = &#63; and companyInformationId = &#63; from the database.
	 *
	 * @param addressType the address type
	 * @param companyInformationId the company information ID
	 * @return the cannabis application company address that was removed
	 */
	@Override
	public CannabisApplicationCompanyAddress removeBygetCA_CA_by_CI_AT(
			String addressType, long companyInformationId)
		throws NoSuchCannabisApplicationCompanyAddressException {

		CannabisApplicationCompanyAddress cannabisApplicationCompanyAddress =
			findBygetCA_CA_by_CI_AT(addressType, companyInformationId);

		return remove(cannabisApplicationCompanyAddress);
	}

	/**
	 * Returns the number of cannabis application company addresses where addressType = &#63; and companyInformationId = &#63;.
	 *
	 * @param addressType the address type
	 * @param companyInformationId the company information ID
	 * @return the number of matching cannabis application company addresses
	 */
	@Override
	public int countBygetCA_CA_by_CI_AT(
		String addressType, long companyInformationId) {

		addressType = Objects.toString(addressType, "");

		FinderPath finderPath = _finderPathCountBygetCA_CA_by_CI_AT;

		Object[] finderArgs = new Object[] {addressType, companyInformationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONCOMPANYADDRESS_WHERE);

			boolean bindAddressType = false;

			if (addressType.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCA_CA_BY_CI_AT_ADDRESSTYPE_3);
			}
			else {
				bindAddressType = true;

				sb.append(_FINDER_COLUMN_GETCA_CA_BY_CI_AT_ADDRESSTYPE_2);
			}

			sb.append(_FINDER_COLUMN_GETCA_CA_BY_CI_AT_COMPANYINFORMATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindAddressType) {
					queryPos.add(addressType);
				}

				queryPos.add(companyInformationId);

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

	private static final String _FINDER_COLUMN_GETCA_CA_BY_CI_AT_ADDRESSTYPE_2 =
		"cannabisApplicationCompanyAddress.addressType = ? AND ";

	private static final String _FINDER_COLUMN_GETCA_CA_BY_CI_AT_ADDRESSTYPE_3 =
		"(cannabisApplicationCompanyAddress.addressType IS NULL OR cannabisApplicationCompanyAddress.addressType = '') AND ";

	private static final String
		_FINDER_COLUMN_GETCA_CA_BY_CI_AT_COMPANYINFORMATIONID_2 =
			"cannabisApplicationCompanyAddress.companyInformationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetCA_CA_by_CI;
	private FinderPath _finderPathWithoutPaginationFindBygetCA_CA_by_CI;
	private FinderPath _finderPathCountBygetCA_CA_by_CI;

	/**
	 * Returns all the cannabis application company addresses where companyInformationId = &#63;.
	 *
	 * @param companyInformationId the company information ID
	 * @return the matching cannabis application company addresses
	 */
	@Override
	public List<CannabisApplicationCompanyAddress> findBygetCA_CA_by_CI(
		long companyInformationId) {

		return findBygetCA_CA_by_CI(
			companyInformationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis application company addresses where companyInformationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param companyInformationId the company information ID
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @return the range of matching cannabis application company addresses
	 */
	@Override
	public List<CannabisApplicationCompanyAddress> findBygetCA_CA_by_CI(
		long companyInformationId, int start, int end) {

		return findBygetCA_CA_by_CI(companyInformationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis application company addresses where companyInformationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param companyInformationId the company information ID
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application company addresses
	 */
	@Override
	public List<CannabisApplicationCompanyAddress> findBygetCA_CA_by_CI(
		long companyInformationId, int start, int end,
		OrderByComparator<CannabisApplicationCompanyAddress>
			orderByComparator) {

		return findBygetCA_CA_by_CI(
			companyInformationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis application company addresses where companyInformationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param companyInformationId the company information ID
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application company addresses
	 */
	@Override
	public List<CannabisApplicationCompanyAddress> findBygetCA_CA_by_CI(
		long companyInformationId, int start, int end,
		OrderByComparator<CannabisApplicationCompanyAddress> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetCA_CA_by_CI;
				finderArgs = new Object[] {companyInformationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCA_CA_by_CI;
			finderArgs = new Object[] {
				companyInformationId, start, end, orderByComparator
			};
		}

		List<CannabisApplicationCompanyAddress> list = null;

		if (useFinderCache) {
			list =
				(List<CannabisApplicationCompanyAddress>)finderCache.getResult(
					finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisApplicationCompanyAddress
						cannabisApplicationCompanyAddress : list) {

					if (companyInformationId !=
							cannabisApplicationCompanyAddress.
								getCompanyInformationId()) {

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

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONCOMPANYADDRESS_WHERE);

			sb.append(_FINDER_COLUMN_GETCA_CA_BY_CI_COMPANYINFORMATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					CannabisApplicationCompanyAddressModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(companyInformationId);

				list = (List<CannabisApplicationCompanyAddress>)QueryUtil.list(
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
	 * Returns the first cannabis application company address in the ordered set where companyInformationId = &#63;.
	 *
	 * @param companyInformationId the company information ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a matching cannabis application company address could not be found
	 */
	@Override
	public CannabisApplicationCompanyAddress findBygetCA_CA_by_CI_First(
			long companyInformationId,
			OrderByComparator<CannabisApplicationCompanyAddress>
				orderByComparator)
		throws NoSuchCannabisApplicationCompanyAddressException {

		CannabisApplicationCompanyAddress cannabisApplicationCompanyAddress =
			fetchBygetCA_CA_by_CI_First(
				companyInformationId, orderByComparator);

		if (cannabisApplicationCompanyAddress != null) {
			return cannabisApplicationCompanyAddress;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("companyInformationId=");
		sb.append(companyInformationId);

		sb.append("}");

		throw new NoSuchCannabisApplicationCompanyAddressException(
			sb.toString());
	}

	/**
	 * Returns the first cannabis application company address in the ordered set where companyInformationId = &#63;.
	 *
	 * @param companyInformationId the company information ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application company address, or <code>null</code> if a matching cannabis application company address could not be found
	 */
	@Override
	public CannabisApplicationCompanyAddress fetchBygetCA_CA_by_CI_First(
		long companyInformationId,
		OrderByComparator<CannabisApplicationCompanyAddress>
			orderByComparator) {

		List<CannabisApplicationCompanyAddress> list = findBygetCA_CA_by_CI(
			companyInformationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis application company address in the ordered set where companyInformationId = &#63;.
	 *
	 * @param companyInformationId the company information ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a matching cannabis application company address could not be found
	 */
	@Override
	public CannabisApplicationCompanyAddress findBygetCA_CA_by_CI_Last(
			long companyInformationId,
			OrderByComparator<CannabisApplicationCompanyAddress>
				orderByComparator)
		throws NoSuchCannabisApplicationCompanyAddressException {

		CannabisApplicationCompanyAddress cannabisApplicationCompanyAddress =
			fetchBygetCA_CA_by_CI_Last(companyInformationId, orderByComparator);

		if (cannabisApplicationCompanyAddress != null) {
			return cannabisApplicationCompanyAddress;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("companyInformationId=");
		sb.append(companyInformationId);

		sb.append("}");

		throw new NoSuchCannabisApplicationCompanyAddressException(
			sb.toString());
	}

	/**
	 * Returns the last cannabis application company address in the ordered set where companyInformationId = &#63;.
	 *
	 * @param companyInformationId the company information ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application company address, or <code>null</code> if a matching cannabis application company address could not be found
	 */
	@Override
	public CannabisApplicationCompanyAddress fetchBygetCA_CA_by_CI_Last(
		long companyInformationId,
		OrderByComparator<CannabisApplicationCompanyAddress>
			orderByComparator) {

		int count = countBygetCA_CA_by_CI(companyInformationId);

		if (count == 0) {
			return null;
		}

		List<CannabisApplicationCompanyAddress> list = findBygetCA_CA_by_CI(
			companyInformationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis application company addresses before and after the current cannabis application company address in the ordered set where companyInformationId = &#63;.
	 *
	 * @param companyAddressId the primary key of the current cannabis application company address
	 * @param companyInformationId the company information ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a cannabis application company address with the primary key could not be found
	 */
	@Override
	public CannabisApplicationCompanyAddress[] findBygetCA_CA_by_CI_PrevAndNext(
			long companyAddressId, long companyInformationId,
			OrderByComparator<CannabisApplicationCompanyAddress>
				orderByComparator)
		throws NoSuchCannabisApplicationCompanyAddressException {

		CannabisApplicationCompanyAddress cannabisApplicationCompanyAddress =
			findByPrimaryKey(companyAddressId);

		Session session = null;

		try {
			session = openSession();

			CannabisApplicationCompanyAddress[] array =
				new CannabisApplicationCompanyAddressImpl[3];

			array[0] = getBygetCA_CA_by_CI_PrevAndNext(
				session, cannabisApplicationCompanyAddress,
				companyInformationId, orderByComparator, true);

			array[1] = cannabisApplicationCompanyAddress;

			array[2] = getBygetCA_CA_by_CI_PrevAndNext(
				session, cannabisApplicationCompanyAddress,
				companyInformationId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected CannabisApplicationCompanyAddress getBygetCA_CA_by_CI_PrevAndNext(
		Session session,
		CannabisApplicationCompanyAddress cannabisApplicationCompanyAddress,
		long companyInformationId,
		OrderByComparator<CannabisApplicationCompanyAddress> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISAPPLICATIONCOMPANYADDRESS_WHERE);

		sb.append(_FINDER_COLUMN_GETCA_CA_BY_CI_COMPANYINFORMATIONID_2);

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
			sb.append(CannabisApplicationCompanyAddressModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(companyInformationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisApplicationCompanyAddress)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisApplicationCompanyAddress> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis application company addresses where companyInformationId = &#63; from the database.
	 *
	 * @param companyInformationId the company information ID
	 */
	@Override
	public void removeBygetCA_CA_by_CI(long companyInformationId) {
		for (CannabisApplicationCompanyAddress
				cannabisApplicationCompanyAddress :
					findBygetCA_CA_by_CI(
						companyInformationId, QueryUtil.ALL_POS,
						QueryUtil.ALL_POS, null)) {

			remove(cannabisApplicationCompanyAddress);
		}
	}

	/**
	 * Returns the number of cannabis application company addresses where companyInformationId = &#63;.
	 *
	 * @param companyInformationId the company information ID
	 * @return the number of matching cannabis application company addresses
	 */
	@Override
	public int countBygetCA_CA_by_CI(long companyInformationId) {
		FinderPath finderPath = _finderPathCountBygetCA_CA_by_CI;

		Object[] finderArgs = new Object[] {companyInformationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONCOMPANYADDRESS_WHERE);

			sb.append(_FINDER_COLUMN_GETCA_CA_BY_CI_COMPANYINFORMATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(companyInformationId);

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
		_FINDER_COLUMN_GETCA_CA_BY_CI_COMPANYINFORMATIONID_2 =
			"cannabisApplicationCompanyAddress.companyInformationId = ?";

	public CannabisApplicationCompanyAddressPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(CannabisApplicationCompanyAddress.class);

		setModelImplClass(CannabisApplicationCompanyAddressImpl.class);
		setModelPKClass(long.class);

		setTable(CannabisApplicationCompanyAddressTable.INSTANCE);
	}

	/**
	 * Caches the cannabis application company address in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationCompanyAddress the cannabis application company address
	 */
	@Override
	public void cacheResult(
		CannabisApplicationCompanyAddress cannabisApplicationCompanyAddress) {

		entityCache.putResult(
			CannabisApplicationCompanyAddressImpl.class,
			cannabisApplicationCompanyAddress.getPrimaryKey(),
			cannabisApplicationCompanyAddress);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				cannabisApplicationCompanyAddress.getUuid(),
				cannabisApplicationCompanyAddress.getGroupId()
			},
			cannabisApplicationCompanyAddress);

		finderCache.putResult(
			_finderPathFetchBygetCA_CA_by_CI_AT,
			new Object[] {
				cannabisApplicationCompanyAddress.getAddressType(),
				cannabisApplicationCompanyAddress.getCompanyInformationId()
			},
			cannabisApplicationCompanyAddress);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the cannabis application company addresses in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationCompanyAddresses the cannabis application company addresses
	 */
	@Override
	public void cacheResult(
		List<CannabisApplicationCompanyAddress>
			cannabisApplicationCompanyAddresses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (cannabisApplicationCompanyAddresses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CannabisApplicationCompanyAddress
				cannabisApplicationCompanyAddress :
					cannabisApplicationCompanyAddresses) {

			if (entityCache.getResult(
					CannabisApplicationCompanyAddressImpl.class,
					cannabisApplicationCompanyAddress.getPrimaryKey()) ==
						null) {

				cacheResult(cannabisApplicationCompanyAddress);
			}
		}
	}

	/**
	 * Clears the cache for all cannabis application company addresses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CannabisApplicationCompanyAddressImpl.class);

		finderCache.clearCache(CannabisApplicationCompanyAddressImpl.class);
	}

	/**
	 * Clears the cache for the cannabis application company address.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CannabisApplicationCompanyAddress cannabisApplicationCompanyAddress) {

		entityCache.removeResult(
			CannabisApplicationCompanyAddressImpl.class,
			cannabisApplicationCompanyAddress);
	}

	@Override
	public void clearCache(
		List<CannabisApplicationCompanyAddress>
			cannabisApplicationCompanyAddresses) {

		for (CannabisApplicationCompanyAddress
				cannabisApplicationCompanyAddress :
					cannabisApplicationCompanyAddresses) {

			entityCache.removeResult(
				CannabisApplicationCompanyAddressImpl.class,
				cannabisApplicationCompanyAddress);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CannabisApplicationCompanyAddressImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CannabisApplicationCompanyAddressImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CannabisApplicationCompanyAddressModelImpl
			cannabisApplicationCompanyAddressModelImpl) {

		Object[] args = new Object[] {
			cannabisApplicationCompanyAddressModelImpl.getUuid(),
			cannabisApplicationCompanyAddressModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args,
			cannabisApplicationCompanyAddressModelImpl);

		args = new Object[] {
			cannabisApplicationCompanyAddressModelImpl.getAddressType(),
			cannabisApplicationCompanyAddressModelImpl.getCompanyInformationId()
		};

		finderCache.putResult(
			_finderPathCountBygetCA_CA_by_CI_AT, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCA_CA_by_CI_AT, args,
			cannabisApplicationCompanyAddressModelImpl);
	}

	/**
	 * Creates a new cannabis application company address with the primary key. Does not add the cannabis application company address to the database.
	 *
	 * @param companyAddressId the primary key for the new cannabis application company address
	 * @return the new cannabis application company address
	 */
	@Override
	public CannabisApplicationCompanyAddress create(long companyAddressId) {
		CannabisApplicationCompanyAddress cannabisApplicationCompanyAddress =
			new CannabisApplicationCompanyAddressImpl();

		cannabisApplicationCompanyAddress.setNew(true);
		cannabisApplicationCompanyAddress.setPrimaryKey(companyAddressId);

		String uuid = PortalUUIDUtil.generate();

		cannabisApplicationCompanyAddress.setUuid(uuid);

		cannabisApplicationCompanyAddress.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return cannabisApplicationCompanyAddress;
	}

	/**
	 * Removes the cannabis application company address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param companyAddressId the primary key of the cannabis application company address
	 * @return the cannabis application company address that was removed
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a cannabis application company address with the primary key could not be found
	 */
	@Override
	public CannabisApplicationCompanyAddress remove(long companyAddressId)
		throws NoSuchCannabisApplicationCompanyAddressException {

		return remove((Serializable)companyAddressId);
	}

	/**
	 * Removes the cannabis application company address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cannabis application company address
	 * @return the cannabis application company address that was removed
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a cannabis application company address with the primary key could not be found
	 */
	@Override
	public CannabisApplicationCompanyAddress remove(Serializable primaryKey)
		throws NoSuchCannabisApplicationCompanyAddressException {

		Session session = null;

		try {
			session = openSession();

			CannabisApplicationCompanyAddress
				cannabisApplicationCompanyAddress =
					(CannabisApplicationCompanyAddress)session.get(
						CannabisApplicationCompanyAddressImpl.class,
						primaryKey);

			if (cannabisApplicationCompanyAddress == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCannabisApplicationCompanyAddressException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(cannabisApplicationCompanyAddress);
		}
		catch (NoSuchCannabisApplicationCompanyAddressException
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
	protected CannabisApplicationCompanyAddress removeImpl(
		CannabisApplicationCompanyAddress cannabisApplicationCompanyAddress) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cannabisApplicationCompanyAddress)) {
				cannabisApplicationCompanyAddress =
					(CannabisApplicationCompanyAddress)session.get(
						CannabisApplicationCompanyAddressImpl.class,
						cannabisApplicationCompanyAddress.getPrimaryKeyObj());
			}

			if (cannabisApplicationCompanyAddress != null) {
				session.delete(cannabisApplicationCompanyAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (cannabisApplicationCompanyAddress != null) {
			clearCache(cannabisApplicationCompanyAddress);
		}

		return cannabisApplicationCompanyAddress;
	}

	@Override
	public CannabisApplicationCompanyAddress updateImpl(
		CannabisApplicationCompanyAddress cannabisApplicationCompanyAddress) {

		boolean isNew = cannabisApplicationCompanyAddress.isNew();

		if (!(cannabisApplicationCompanyAddress instanceof
				CannabisApplicationCompanyAddressModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					cannabisApplicationCompanyAddress.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					cannabisApplicationCompanyAddress);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cannabisApplicationCompanyAddress proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CannabisApplicationCompanyAddress implementation " +
					cannabisApplicationCompanyAddress.getClass());
		}

		CannabisApplicationCompanyAddressModelImpl
			cannabisApplicationCompanyAddressModelImpl =
				(CannabisApplicationCompanyAddressModelImpl)
					cannabisApplicationCompanyAddress;

		if (Validator.isNull(cannabisApplicationCompanyAddress.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			cannabisApplicationCompanyAddress.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(cannabisApplicationCompanyAddress.getCreateDate() == null)) {

			if (serviceContext == null) {
				cannabisApplicationCompanyAddress.setCreateDate(date);
			}
			else {
				cannabisApplicationCompanyAddress.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!cannabisApplicationCompanyAddressModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				cannabisApplicationCompanyAddress.setModifiedDate(date);
			}
			else {
				cannabisApplicationCompanyAddress.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(cannabisApplicationCompanyAddress);
			}
			else {
				cannabisApplicationCompanyAddress =
					(CannabisApplicationCompanyAddress)session.merge(
						cannabisApplicationCompanyAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CannabisApplicationCompanyAddressImpl.class,
			cannabisApplicationCompanyAddressModelImpl, false, true);

		cacheUniqueFindersCache(cannabisApplicationCompanyAddressModelImpl);

		if (isNew) {
			cannabisApplicationCompanyAddress.setNew(false);
		}

		cannabisApplicationCompanyAddress.resetOriginalValues();

		return cannabisApplicationCompanyAddress;
	}

	/**
	 * Returns the cannabis application company address with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cannabis application company address
	 * @return the cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a cannabis application company address with the primary key could not be found
	 */
	@Override
	public CannabisApplicationCompanyAddress findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchCannabisApplicationCompanyAddressException {

		CannabisApplicationCompanyAddress cannabisApplicationCompanyAddress =
			fetchByPrimaryKey(primaryKey);

		if (cannabisApplicationCompanyAddress == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCannabisApplicationCompanyAddressException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return cannabisApplicationCompanyAddress;
	}

	/**
	 * Returns the cannabis application company address with the primary key or throws a <code>NoSuchCannabisApplicationCompanyAddressException</code> if it could not be found.
	 *
	 * @param companyAddressId the primary key of the cannabis application company address
	 * @return the cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a cannabis application company address with the primary key could not be found
	 */
	@Override
	public CannabisApplicationCompanyAddress findByPrimaryKey(
			long companyAddressId)
		throws NoSuchCannabisApplicationCompanyAddressException {

		return findByPrimaryKey((Serializable)companyAddressId);
	}

	/**
	 * Returns the cannabis application company address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param companyAddressId the primary key of the cannabis application company address
	 * @return the cannabis application company address, or <code>null</code> if a cannabis application company address with the primary key could not be found
	 */
	@Override
	public CannabisApplicationCompanyAddress fetchByPrimaryKey(
		long companyAddressId) {

		return fetchByPrimaryKey((Serializable)companyAddressId);
	}

	/**
	 * Returns all the cannabis application company addresses.
	 *
	 * @return the cannabis application company addresses
	 */
	@Override
	public List<CannabisApplicationCompanyAddress> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis application company addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @return the range of cannabis application company addresses
	 */
	@Override
	public List<CannabisApplicationCompanyAddress> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis application company addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis application company addresses
	 */
	@Override
	public List<CannabisApplicationCompanyAddress> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationCompanyAddress>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis application company addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis application company addresses
	 */
	@Override
	public List<CannabisApplicationCompanyAddress> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationCompanyAddress> orderByComparator,
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

		List<CannabisApplicationCompanyAddress> list = null;

		if (useFinderCache) {
			list =
				(List<CannabisApplicationCompanyAddress>)finderCache.getResult(
					finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CANNABISAPPLICATIONCOMPANYADDRESS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CANNABISAPPLICATIONCOMPANYADDRESS;

				sql = sql.concat(
					CannabisApplicationCompanyAddressModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CannabisApplicationCompanyAddress>)QueryUtil.list(
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
	 * Removes all the cannabis application company addresses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CannabisApplicationCompanyAddress
				cannabisApplicationCompanyAddress : findAll()) {

			remove(cannabisApplicationCompanyAddress);
		}
	}

	/**
	 * Returns the number of cannabis application company addresses.
	 *
	 * @return the number of cannabis application company addresses
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
					_SQL_COUNT_CANNABISAPPLICATIONCOMPANYADDRESS);

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
		return "companyAddressId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CANNABISAPPLICATIONCOMPANYADDRESS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CannabisApplicationCompanyAddressModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cannabis application company address persistence.
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

		_finderPathFetchBygetCA_CA_by_CI_AT = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCA_CA_by_CI_AT",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"addressType", "companyInformationId"}, true);

		_finderPathCountBygetCA_CA_by_CI_AT = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCA_CA_by_CI_AT",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"addressType", "companyInformationId"}, false);

		_finderPathWithPaginationFindBygetCA_CA_by_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCA_CA_by_CI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"companyInformationId"}, true);

		_finderPathWithoutPaginationFindBygetCA_CA_by_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetCA_CA_by_CI",
			new String[] {Long.class.getName()},
			new String[] {"companyInformationId"}, true);

		_finderPathCountBygetCA_CA_by_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCA_CA_by_CI",
			new String[] {Long.class.getName()},
			new String[] {"companyInformationId"}, false);

		CannabisApplicationCompanyAddressUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CannabisApplicationCompanyAddressUtil.setPersistence(null);

		entityCache.removeCache(
			CannabisApplicationCompanyAddressImpl.class.getName());
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

	private static final String _SQL_SELECT_CANNABISAPPLICATIONCOMPANYADDRESS =
		"SELECT cannabisApplicationCompanyAddress FROM CannabisApplicationCompanyAddress cannabisApplicationCompanyAddress";

	private static final String
		_SQL_SELECT_CANNABISAPPLICATIONCOMPANYADDRESS_WHERE =
			"SELECT cannabisApplicationCompanyAddress FROM CannabisApplicationCompanyAddress cannabisApplicationCompanyAddress WHERE ";

	private static final String _SQL_COUNT_CANNABISAPPLICATIONCOMPANYADDRESS =
		"SELECT COUNT(cannabisApplicationCompanyAddress) FROM CannabisApplicationCompanyAddress cannabisApplicationCompanyAddress";

	private static final String
		_SQL_COUNT_CANNABISAPPLICATIONCOMPANYADDRESS_WHERE =
			"SELECT COUNT(cannabisApplicationCompanyAddress) FROM CannabisApplicationCompanyAddress cannabisApplicationCompanyAddress WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"cannabisApplicationCompanyAddress.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CannabisApplicationCompanyAddress exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CannabisApplicationCompanyAddress exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CannabisApplicationCompanyAddressPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}