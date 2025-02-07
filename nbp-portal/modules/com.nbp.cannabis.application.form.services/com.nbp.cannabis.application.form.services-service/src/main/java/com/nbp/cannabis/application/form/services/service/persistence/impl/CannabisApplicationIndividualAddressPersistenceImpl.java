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

import com.nbp.cannabis.application.form.services.exception.NoSuchCannabisApplicationIndividualAddressException;
import com.nbp.cannabis.application.form.services.model.CannabisApplicationIndividualAddress;
import com.nbp.cannabis.application.form.services.model.CannabisApplicationIndividualAddressTable;
import com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationIndividualAddressImpl;
import com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationIndividualAddressModelImpl;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisApplicationIndividualAddressPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisApplicationIndividualAddressUtil;
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
 * The persistence implementation for the cannabis application individual address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CannabisApplicationIndividualAddressPersistence.class)
public class CannabisApplicationIndividualAddressPersistenceImpl
	extends BasePersistenceImpl<CannabisApplicationIndividualAddress>
	implements CannabisApplicationIndividualAddressPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CannabisApplicationIndividualAddressUtil</code> to access the cannabis application individual address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CannabisApplicationIndividualAddressImpl.class.getName();

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
	 * Returns all the cannabis application individual addresses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cannabis application individual addresses
	 */
	@Override
	public List<CannabisApplicationIndividualAddress> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis application individual addresses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @return the range of matching cannabis application individual addresses
	 */
	@Override
	public List<CannabisApplicationIndividualAddress> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis application individual addresses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application individual addresses
	 */
	@Override
	public List<CannabisApplicationIndividualAddress> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisApplicationIndividualAddress>
			orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis application individual addresses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application individual addresses
	 */
	@Override
	public List<CannabisApplicationIndividualAddress> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisApplicationIndividualAddress>
			orderByComparator,
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

		List<CannabisApplicationIndividualAddress> list = null;

		if (useFinderCache) {
			list =
				(List<CannabisApplicationIndividualAddress>)
					finderCache.getResult(finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisApplicationIndividualAddress
						cannabisApplicationIndividualAddress : list) {

					if (!uuid.equals(
							cannabisApplicationIndividualAddress.getUuid())) {

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

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONINDIVIDUALADDRESS_WHERE);

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
					CannabisApplicationIndividualAddressModelImpl.
						ORDER_BY_JPQL);
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

				list =
					(List<CannabisApplicationIndividualAddress>)QueryUtil.list(
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
	 * Returns the first cannabis application individual address in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a matching cannabis application individual address could not be found
	 */
	@Override
	public CannabisApplicationIndividualAddress findByUuid_First(
			String uuid,
			OrderByComparator<CannabisApplicationIndividualAddress>
				orderByComparator)
		throws NoSuchCannabisApplicationIndividualAddressException {

		CannabisApplicationIndividualAddress
			cannabisApplicationIndividualAddress = fetchByUuid_First(
				uuid, orderByComparator);

		if (cannabisApplicationIndividualAddress != null) {
			return cannabisApplicationIndividualAddress;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchCannabisApplicationIndividualAddressException(
			sb.toString());
	}

	/**
	 * Returns the first cannabis application individual address in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application individual address, or <code>null</code> if a matching cannabis application individual address could not be found
	 */
	@Override
	public CannabisApplicationIndividualAddress fetchByUuid_First(
		String uuid,
		OrderByComparator<CannabisApplicationIndividualAddress>
			orderByComparator) {

		List<CannabisApplicationIndividualAddress> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis application individual address in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a matching cannabis application individual address could not be found
	 */
	@Override
	public CannabisApplicationIndividualAddress findByUuid_Last(
			String uuid,
			OrderByComparator<CannabisApplicationIndividualAddress>
				orderByComparator)
		throws NoSuchCannabisApplicationIndividualAddressException {

		CannabisApplicationIndividualAddress
			cannabisApplicationIndividualAddress = fetchByUuid_Last(
				uuid, orderByComparator);

		if (cannabisApplicationIndividualAddress != null) {
			return cannabisApplicationIndividualAddress;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchCannabisApplicationIndividualAddressException(
			sb.toString());
	}

	/**
	 * Returns the last cannabis application individual address in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application individual address, or <code>null</code> if a matching cannabis application individual address could not be found
	 */
	@Override
	public CannabisApplicationIndividualAddress fetchByUuid_Last(
		String uuid,
		OrderByComparator<CannabisApplicationIndividualAddress>
			orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<CannabisApplicationIndividualAddress> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis application individual addresses before and after the current cannabis application individual address in the ordered set where uuid = &#63;.
	 *
	 * @param IndividualAddressId the primary key of the current cannabis application individual address
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a cannabis application individual address with the primary key could not be found
	 */
	@Override
	public CannabisApplicationIndividualAddress[] findByUuid_PrevAndNext(
			long IndividualAddressId, String uuid,
			OrderByComparator<CannabisApplicationIndividualAddress>
				orderByComparator)
		throws NoSuchCannabisApplicationIndividualAddressException {

		uuid = Objects.toString(uuid, "");

		CannabisApplicationIndividualAddress
			cannabisApplicationIndividualAddress = findByPrimaryKey(
				IndividualAddressId);

		Session session = null;

		try {
			session = openSession();

			CannabisApplicationIndividualAddress[] array =
				new CannabisApplicationIndividualAddressImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, cannabisApplicationIndividualAddress, uuid,
				orderByComparator, true);

			array[1] = cannabisApplicationIndividualAddress;

			array[2] = getByUuid_PrevAndNext(
				session, cannabisApplicationIndividualAddress, uuid,
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

	protected CannabisApplicationIndividualAddress getByUuid_PrevAndNext(
		Session session,
		CannabisApplicationIndividualAddress
			cannabisApplicationIndividualAddress,
		String uuid,
		OrderByComparator<CannabisApplicationIndividualAddress>
			orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISAPPLICATIONINDIVIDUALADDRESS_WHERE);

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
			sb.append(
				CannabisApplicationIndividualAddressModelImpl.ORDER_BY_JPQL);
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
						cannabisApplicationIndividualAddress)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisApplicationIndividualAddress> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis application individual addresses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (CannabisApplicationIndividualAddress
				cannabisApplicationIndividualAddress :
					findByUuid(
						uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(cannabisApplicationIndividualAddress);
		}
	}

	/**
	 * Returns the number of cannabis application individual addresses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cannabis application individual addresses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONINDIVIDUALADDRESS_WHERE);

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
		"cannabisApplicationIndividualAddress.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(cannabisApplicationIndividualAddress.uuid IS NULL OR cannabisApplicationIndividualAddress.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the cannabis application individual address where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCannabisApplicationIndividualAddressException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a matching cannabis application individual address could not be found
	 */
	@Override
	public CannabisApplicationIndividualAddress findByUUID_G(
			String uuid, long groupId)
		throws NoSuchCannabisApplicationIndividualAddressException {

		CannabisApplicationIndividualAddress
			cannabisApplicationIndividualAddress = fetchByUUID_G(uuid, groupId);

		if (cannabisApplicationIndividualAddress == null) {
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

			throw new NoSuchCannabisApplicationIndividualAddressException(
				sb.toString());
		}

		return cannabisApplicationIndividualAddress;
	}

	/**
	 * Returns the cannabis application individual address where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis application individual address, or <code>null</code> if a matching cannabis application individual address could not be found
	 */
	@Override
	public CannabisApplicationIndividualAddress fetchByUUID_G(
		String uuid, long groupId) {

		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the cannabis application individual address where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application individual address, or <code>null</code> if a matching cannabis application individual address could not be found
	 */
	@Override
	public CannabisApplicationIndividualAddress fetchByUUID_G(
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

		if (result instanceof CannabisApplicationIndividualAddress) {
			CannabisApplicationIndividualAddress
				cannabisApplicationIndividualAddress =
					(CannabisApplicationIndividualAddress)result;

			if (!Objects.equals(
					uuid, cannabisApplicationIndividualAddress.getUuid()) ||
				(groupId !=
					cannabisApplicationIndividualAddress.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONINDIVIDUALADDRESS_WHERE);

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

				List<CannabisApplicationIndividualAddress> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					CannabisApplicationIndividualAddress
						cannabisApplicationIndividualAddress = list.get(0);

					result = cannabisApplicationIndividualAddress;

					cacheResult(cannabisApplicationIndividualAddress);
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
			return (CannabisApplicationIndividualAddress)result;
		}
	}

	/**
	 * Removes the cannabis application individual address where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the cannabis application individual address that was removed
	 */
	@Override
	public CannabisApplicationIndividualAddress removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchCannabisApplicationIndividualAddressException {

		CannabisApplicationIndividualAddress
			cannabisApplicationIndividualAddress = findByUUID_G(uuid, groupId);

		return remove(cannabisApplicationIndividualAddress);
	}

	/**
	 * Returns the number of cannabis application individual addresses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cannabis application individual addresses
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONINDIVIDUALADDRESS_WHERE);

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
		"cannabisApplicationIndividualAddress.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(cannabisApplicationIndividualAddress.uuid IS NULL OR cannabisApplicationIndividualAddress.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"cannabisApplicationIndividualAddress.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the cannabis application individual addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cannabis application individual addresses
	 */
	@Override
	public List<CannabisApplicationIndividualAddress> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis application individual addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @return the range of matching cannabis application individual addresses
	 */
	@Override
	public List<CannabisApplicationIndividualAddress> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis application individual addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application individual addresses
	 */
	@Override
	public List<CannabisApplicationIndividualAddress> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisApplicationIndividualAddress>
			orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis application individual addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application individual addresses
	 */
	@Override
	public List<CannabisApplicationIndividualAddress> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisApplicationIndividualAddress>
			orderByComparator,
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

		List<CannabisApplicationIndividualAddress> list = null;

		if (useFinderCache) {
			list =
				(List<CannabisApplicationIndividualAddress>)
					finderCache.getResult(finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisApplicationIndividualAddress
						cannabisApplicationIndividualAddress : list) {

					if (!uuid.equals(
							cannabisApplicationIndividualAddress.getUuid()) ||
						(companyId !=
							cannabisApplicationIndividualAddress.
								getCompanyId())) {

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

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONINDIVIDUALADDRESS_WHERE);

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
					CannabisApplicationIndividualAddressModelImpl.
						ORDER_BY_JPQL);
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

				list =
					(List<CannabisApplicationIndividualAddress>)QueryUtil.list(
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
	 * Returns the first cannabis application individual address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a matching cannabis application individual address could not be found
	 */
	@Override
	public CannabisApplicationIndividualAddress findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CannabisApplicationIndividualAddress>
				orderByComparator)
		throws NoSuchCannabisApplicationIndividualAddressException {

		CannabisApplicationIndividualAddress
			cannabisApplicationIndividualAddress = fetchByUuid_C_First(
				uuid, companyId, orderByComparator);

		if (cannabisApplicationIndividualAddress != null) {
			return cannabisApplicationIndividualAddress;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchCannabisApplicationIndividualAddressException(
			sb.toString());
	}

	/**
	 * Returns the first cannabis application individual address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application individual address, or <code>null</code> if a matching cannabis application individual address could not be found
	 */
	@Override
	public CannabisApplicationIndividualAddress fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CannabisApplicationIndividualAddress>
			orderByComparator) {

		List<CannabisApplicationIndividualAddress> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis application individual address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a matching cannabis application individual address could not be found
	 */
	@Override
	public CannabisApplicationIndividualAddress findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CannabisApplicationIndividualAddress>
				orderByComparator)
		throws NoSuchCannabisApplicationIndividualAddressException {

		CannabisApplicationIndividualAddress
			cannabisApplicationIndividualAddress = fetchByUuid_C_Last(
				uuid, companyId, orderByComparator);

		if (cannabisApplicationIndividualAddress != null) {
			return cannabisApplicationIndividualAddress;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchCannabisApplicationIndividualAddressException(
			sb.toString());
	}

	/**
	 * Returns the last cannabis application individual address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application individual address, or <code>null</code> if a matching cannabis application individual address could not be found
	 */
	@Override
	public CannabisApplicationIndividualAddress fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CannabisApplicationIndividualAddress>
			orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<CannabisApplicationIndividualAddress> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis application individual addresses before and after the current cannabis application individual address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param IndividualAddressId the primary key of the current cannabis application individual address
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a cannabis application individual address with the primary key could not be found
	 */
	@Override
	public CannabisApplicationIndividualAddress[] findByUuid_C_PrevAndNext(
			long IndividualAddressId, String uuid, long companyId,
			OrderByComparator<CannabisApplicationIndividualAddress>
				orderByComparator)
		throws NoSuchCannabisApplicationIndividualAddressException {

		uuid = Objects.toString(uuid, "");

		CannabisApplicationIndividualAddress
			cannabisApplicationIndividualAddress = findByPrimaryKey(
				IndividualAddressId);

		Session session = null;

		try {
			session = openSession();

			CannabisApplicationIndividualAddress[] array =
				new CannabisApplicationIndividualAddressImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, cannabisApplicationIndividualAddress, uuid, companyId,
				orderByComparator, true);

			array[1] = cannabisApplicationIndividualAddress;

			array[2] = getByUuid_C_PrevAndNext(
				session, cannabisApplicationIndividualAddress, uuid, companyId,
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

	protected CannabisApplicationIndividualAddress getByUuid_C_PrevAndNext(
		Session session,
		CannabisApplicationIndividualAddress
			cannabisApplicationIndividualAddress,
		String uuid, long companyId,
		OrderByComparator<CannabisApplicationIndividualAddress>
			orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISAPPLICATIONINDIVIDUALADDRESS_WHERE);

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
			sb.append(
				CannabisApplicationIndividualAddressModelImpl.ORDER_BY_JPQL);
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
						cannabisApplicationIndividualAddress)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisApplicationIndividualAddress> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis application individual addresses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (CannabisApplicationIndividualAddress
				cannabisApplicationIndividualAddress :
					findByUuid_C(
						uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
						null)) {

			remove(cannabisApplicationIndividualAddress);
		}
	}

	/**
	 * Returns the number of cannabis application individual addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cannabis application individual addresses
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONINDIVIDUALADDRESS_WHERE);

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
		"cannabisApplicationIndividualAddress.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(cannabisApplicationIndividualAddress.uuid IS NULL OR cannabisApplicationIndividualAddress.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"cannabisApplicationIndividualAddress.companyId = ?";

	private FinderPath _finderPathFetchBygetCA_CA_by_CI_AT;
	private FinderPath _finderPathCountBygetCA_CA_by_CI_AT;

	/**
	 * Returns the cannabis application individual address where addressType = &#63; and individualInformationId = &#63; or throws a <code>NoSuchCannabisApplicationIndividualAddressException</code> if it could not be found.
	 *
	 * @param addressType the address type
	 * @param individualInformationId the individual information ID
	 * @return the matching cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a matching cannabis application individual address could not be found
	 */
	@Override
	public CannabisApplicationIndividualAddress findBygetCA_CA_by_CI_AT(
			String addressType, long individualInformationId)
		throws NoSuchCannabisApplicationIndividualAddressException {

		CannabisApplicationIndividualAddress
			cannabisApplicationIndividualAddress = fetchBygetCA_CA_by_CI_AT(
				addressType, individualInformationId);

		if (cannabisApplicationIndividualAddress == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("addressType=");
			sb.append(addressType);

			sb.append(", individualInformationId=");
			sb.append(individualInformationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCannabisApplicationIndividualAddressException(
				sb.toString());
		}

		return cannabisApplicationIndividualAddress;
	}

	/**
	 * Returns the cannabis application individual address where addressType = &#63; and individualInformationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param addressType the address type
	 * @param individualInformationId the individual information ID
	 * @return the matching cannabis application individual address, or <code>null</code> if a matching cannabis application individual address could not be found
	 */
	@Override
	public CannabisApplicationIndividualAddress fetchBygetCA_CA_by_CI_AT(
		String addressType, long individualInformationId) {

		return fetchBygetCA_CA_by_CI_AT(
			addressType, individualInformationId, true);
	}

	/**
	 * Returns the cannabis application individual address where addressType = &#63; and individualInformationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param addressType the address type
	 * @param individualInformationId the individual information ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application individual address, or <code>null</code> if a matching cannabis application individual address could not be found
	 */
	@Override
	public CannabisApplicationIndividualAddress fetchBygetCA_CA_by_CI_AT(
		String addressType, long individualInformationId,
		boolean useFinderCache) {

		addressType = Objects.toString(addressType, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {addressType, individualInformationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetCA_CA_by_CI_AT, finderArgs, this);
		}

		if (result instanceof CannabisApplicationIndividualAddress) {
			CannabisApplicationIndividualAddress
				cannabisApplicationIndividualAddress =
					(CannabisApplicationIndividualAddress)result;

			if (!Objects.equals(
					addressType,
					cannabisApplicationIndividualAddress.getAddressType()) ||
				(individualInformationId !=
					cannabisApplicationIndividualAddress.
						getIndividualInformationId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONINDIVIDUALADDRESS_WHERE);

			boolean bindAddressType = false;

			if (addressType.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCA_CA_BY_CI_AT_ADDRESSTYPE_3);
			}
			else {
				bindAddressType = true;

				sb.append(_FINDER_COLUMN_GETCA_CA_BY_CI_AT_ADDRESSTYPE_2);
			}

			sb.append(
				_FINDER_COLUMN_GETCA_CA_BY_CI_AT_INDIVIDUALINFORMATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindAddressType) {
					queryPos.add(addressType);
				}

				queryPos.add(individualInformationId);

				List<CannabisApplicationIndividualAddress> list = query.list();

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
									addressType, individualInformationId
								};
							}

							_log.warn(
								"CannabisApplicationIndividualAddressPersistenceImpl.fetchBygetCA_CA_by_CI_AT(String, long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CannabisApplicationIndividualAddress
						cannabisApplicationIndividualAddress = list.get(0);

					result = cannabisApplicationIndividualAddress;

					cacheResult(cannabisApplicationIndividualAddress);
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
			return (CannabisApplicationIndividualAddress)result;
		}
	}

	/**
	 * Removes the cannabis application individual address where addressType = &#63; and individualInformationId = &#63; from the database.
	 *
	 * @param addressType the address type
	 * @param individualInformationId the individual information ID
	 * @return the cannabis application individual address that was removed
	 */
	@Override
	public CannabisApplicationIndividualAddress removeBygetCA_CA_by_CI_AT(
			String addressType, long individualInformationId)
		throws NoSuchCannabisApplicationIndividualAddressException {

		CannabisApplicationIndividualAddress
			cannabisApplicationIndividualAddress = findBygetCA_CA_by_CI_AT(
				addressType, individualInformationId);

		return remove(cannabisApplicationIndividualAddress);
	}

	/**
	 * Returns the number of cannabis application individual addresses where addressType = &#63; and individualInformationId = &#63;.
	 *
	 * @param addressType the address type
	 * @param individualInformationId the individual information ID
	 * @return the number of matching cannabis application individual addresses
	 */
	@Override
	public int countBygetCA_CA_by_CI_AT(
		String addressType, long individualInformationId) {

		addressType = Objects.toString(addressType, "");

		FinderPath finderPath = _finderPathCountBygetCA_CA_by_CI_AT;

		Object[] finderArgs = new Object[] {
			addressType, individualInformationId
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONINDIVIDUALADDRESS_WHERE);

			boolean bindAddressType = false;

			if (addressType.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCA_CA_BY_CI_AT_ADDRESSTYPE_3);
			}
			else {
				bindAddressType = true;

				sb.append(_FINDER_COLUMN_GETCA_CA_BY_CI_AT_ADDRESSTYPE_2);
			}

			sb.append(
				_FINDER_COLUMN_GETCA_CA_BY_CI_AT_INDIVIDUALINFORMATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindAddressType) {
					queryPos.add(addressType);
				}

				queryPos.add(individualInformationId);

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
		"cannabisApplicationIndividualAddress.addressType = ? AND ";

	private static final String _FINDER_COLUMN_GETCA_CA_BY_CI_AT_ADDRESSTYPE_3 =
		"(cannabisApplicationIndividualAddress.addressType IS NULL OR cannabisApplicationIndividualAddress.addressType = '') AND ";

	private static final String
		_FINDER_COLUMN_GETCA_CA_BY_CI_AT_INDIVIDUALINFORMATIONID_2 =
			"cannabisApplicationIndividualAddress.individualInformationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetCA_CA_by_CI;
	private FinderPath _finderPathWithoutPaginationFindBygetCA_CA_by_CI;
	private FinderPath _finderPathCountBygetCA_CA_by_CI;

	/**
	 * Returns all the cannabis application individual addresses where individualInformationId = &#63;.
	 *
	 * @param individualInformationId the individual information ID
	 * @return the matching cannabis application individual addresses
	 */
	@Override
	public List<CannabisApplicationIndividualAddress> findBygetCA_CA_by_CI(
		long individualInformationId) {

		return findBygetCA_CA_by_CI(
			individualInformationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the cannabis application individual addresses where individualInformationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param individualInformationId the individual information ID
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @return the range of matching cannabis application individual addresses
	 */
	@Override
	public List<CannabisApplicationIndividualAddress> findBygetCA_CA_by_CI(
		long individualInformationId, int start, int end) {

		return findBygetCA_CA_by_CI(individualInformationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis application individual addresses where individualInformationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param individualInformationId the individual information ID
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application individual addresses
	 */
	@Override
	public List<CannabisApplicationIndividualAddress> findBygetCA_CA_by_CI(
		long individualInformationId, int start, int end,
		OrderByComparator<CannabisApplicationIndividualAddress>
			orderByComparator) {

		return findBygetCA_CA_by_CI(
			individualInformationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis application individual addresses where individualInformationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param individualInformationId the individual information ID
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application individual addresses
	 */
	@Override
	public List<CannabisApplicationIndividualAddress> findBygetCA_CA_by_CI(
		long individualInformationId, int start, int end,
		OrderByComparator<CannabisApplicationIndividualAddress>
			orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetCA_CA_by_CI;
				finderArgs = new Object[] {individualInformationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCA_CA_by_CI;
			finderArgs = new Object[] {
				individualInformationId, start, end, orderByComparator
			};
		}

		List<CannabisApplicationIndividualAddress> list = null;

		if (useFinderCache) {
			list =
				(List<CannabisApplicationIndividualAddress>)
					finderCache.getResult(finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisApplicationIndividualAddress
						cannabisApplicationIndividualAddress : list) {

					if (individualInformationId !=
							cannabisApplicationIndividualAddress.
								getIndividualInformationId()) {

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

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONINDIVIDUALADDRESS_WHERE);

			sb.append(_FINDER_COLUMN_GETCA_CA_BY_CI_INDIVIDUALINFORMATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					CannabisApplicationIndividualAddressModelImpl.
						ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(individualInformationId);

				list =
					(List<CannabisApplicationIndividualAddress>)QueryUtil.list(
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
	 * Returns the first cannabis application individual address in the ordered set where individualInformationId = &#63;.
	 *
	 * @param individualInformationId the individual information ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a matching cannabis application individual address could not be found
	 */
	@Override
	public CannabisApplicationIndividualAddress findBygetCA_CA_by_CI_First(
			long individualInformationId,
			OrderByComparator<CannabisApplicationIndividualAddress>
				orderByComparator)
		throws NoSuchCannabisApplicationIndividualAddressException {

		CannabisApplicationIndividualAddress
			cannabisApplicationIndividualAddress = fetchBygetCA_CA_by_CI_First(
				individualInformationId, orderByComparator);

		if (cannabisApplicationIndividualAddress != null) {
			return cannabisApplicationIndividualAddress;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("individualInformationId=");
		sb.append(individualInformationId);

		sb.append("}");

		throw new NoSuchCannabisApplicationIndividualAddressException(
			sb.toString());
	}

	/**
	 * Returns the first cannabis application individual address in the ordered set where individualInformationId = &#63;.
	 *
	 * @param individualInformationId the individual information ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application individual address, or <code>null</code> if a matching cannabis application individual address could not be found
	 */
	@Override
	public CannabisApplicationIndividualAddress fetchBygetCA_CA_by_CI_First(
		long individualInformationId,
		OrderByComparator<CannabisApplicationIndividualAddress>
			orderByComparator) {

		List<CannabisApplicationIndividualAddress> list = findBygetCA_CA_by_CI(
			individualInformationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis application individual address in the ordered set where individualInformationId = &#63;.
	 *
	 * @param individualInformationId the individual information ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a matching cannabis application individual address could not be found
	 */
	@Override
	public CannabisApplicationIndividualAddress findBygetCA_CA_by_CI_Last(
			long individualInformationId,
			OrderByComparator<CannabisApplicationIndividualAddress>
				orderByComparator)
		throws NoSuchCannabisApplicationIndividualAddressException {

		CannabisApplicationIndividualAddress
			cannabisApplicationIndividualAddress = fetchBygetCA_CA_by_CI_Last(
				individualInformationId, orderByComparator);

		if (cannabisApplicationIndividualAddress != null) {
			return cannabisApplicationIndividualAddress;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("individualInformationId=");
		sb.append(individualInformationId);

		sb.append("}");

		throw new NoSuchCannabisApplicationIndividualAddressException(
			sb.toString());
	}

	/**
	 * Returns the last cannabis application individual address in the ordered set where individualInformationId = &#63;.
	 *
	 * @param individualInformationId the individual information ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application individual address, or <code>null</code> if a matching cannabis application individual address could not be found
	 */
	@Override
	public CannabisApplicationIndividualAddress fetchBygetCA_CA_by_CI_Last(
		long individualInformationId,
		OrderByComparator<CannabisApplicationIndividualAddress>
			orderByComparator) {

		int count = countBygetCA_CA_by_CI(individualInformationId);

		if (count == 0) {
			return null;
		}

		List<CannabisApplicationIndividualAddress> list = findBygetCA_CA_by_CI(
			individualInformationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis application individual addresses before and after the current cannabis application individual address in the ordered set where individualInformationId = &#63;.
	 *
	 * @param IndividualAddressId the primary key of the current cannabis application individual address
	 * @param individualInformationId the individual information ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a cannabis application individual address with the primary key could not be found
	 */
	@Override
	public CannabisApplicationIndividualAddress[]
			findBygetCA_CA_by_CI_PrevAndNext(
				long IndividualAddressId, long individualInformationId,
				OrderByComparator<CannabisApplicationIndividualAddress>
					orderByComparator)
		throws NoSuchCannabisApplicationIndividualAddressException {

		CannabisApplicationIndividualAddress
			cannabisApplicationIndividualAddress = findByPrimaryKey(
				IndividualAddressId);

		Session session = null;

		try {
			session = openSession();

			CannabisApplicationIndividualAddress[] array =
				new CannabisApplicationIndividualAddressImpl[3];

			array[0] = getBygetCA_CA_by_CI_PrevAndNext(
				session, cannabisApplicationIndividualAddress,
				individualInformationId, orderByComparator, true);

			array[1] = cannabisApplicationIndividualAddress;

			array[2] = getBygetCA_CA_by_CI_PrevAndNext(
				session, cannabisApplicationIndividualAddress,
				individualInformationId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected CannabisApplicationIndividualAddress
		getBygetCA_CA_by_CI_PrevAndNext(
			Session session,
			CannabisApplicationIndividualAddress
				cannabisApplicationIndividualAddress,
			long individualInformationId,
			OrderByComparator<CannabisApplicationIndividualAddress>
				orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISAPPLICATIONINDIVIDUALADDRESS_WHERE);

		sb.append(_FINDER_COLUMN_GETCA_CA_BY_CI_INDIVIDUALINFORMATIONID_2);

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
			sb.append(
				CannabisApplicationIndividualAddressModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(individualInformationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisApplicationIndividualAddress)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisApplicationIndividualAddress> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis application individual addresses where individualInformationId = &#63; from the database.
	 *
	 * @param individualInformationId the individual information ID
	 */
	@Override
	public void removeBygetCA_CA_by_CI(long individualInformationId) {
		for (CannabisApplicationIndividualAddress
				cannabisApplicationIndividualAddress :
					findBygetCA_CA_by_CI(
						individualInformationId, QueryUtil.ALL_POS,
						QueryUtil.ALL_POS, null)) {

			remove(cannabisApplicationIndividualAddress);
		}
	}

	/**
	 * Returns the number of cannabis application individual addresses where individualInformationId = &#63;.
	 *
	 * @param individualInformationId the individual information ID
	 * @return the number of matching cannabis application individual addresses
	 */
	@Override
	public int countBygetCA_CA_by_CI(long individualInformationId) {
		FinderPath finderPath = _finderPathCountBygetCA_CA_by_CI;

		Object[] finderArgs = new Object[] {individualInformationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONINDIVIDUALADDRESS_WHERE);

			sb.append(_FINDER_COLUMN_GETCA_CA_BY_CI_INDIVIDUALINFORMATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(individualInformationId);

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
		_FINDER_COLUMN_GETCA_CA_BY_CI_INDIVIDUALINFORMATIONID_2 =
			"cannabisApplicationIndividualAddress.individualInformationId = ?";

	public CannabisApplicationIndividualAddressPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(CannabisApplicationIndividualAddress.class);

		setModelImplClass(CannabisApplicationIndividualAddressImpl.class);
		setModelPKClass(long.class);

		setTable(CannabisApplicationIndividualAddressTable.INSTANCE);
	}

	/**
	 * Caches the cannabis application individual address in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationIndividualAddress the cannabis application individual address
	 */
	@Override
	public void cacheResult(
		CannabisApplicationIndividualAddress
			cannabisApplicationIndividualAddress) {

		entityCache.putResult(
			CannabisApplicationIndividualAddressImpl.class,
			cannabisApplicationIndividualAddress.getPrimaryKey(),
			cannabisApplicationIndividualAddress);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				cannabisApplicationIndividualAddress.getUuid(),
				cannabisApplicationIndividualAddress.getGroupId()
			},
			cannabisApplicationIndividualAddress);

		finderCache.putResult(
			_finderPathFetchBygetCA_CA_by_CI_AT,
			new Object[] {
				cannabisApplicationIndividualAddress.getAddressType(),
				cannabisApplicationIndividualAddress.
					getIndividualInformationId()
			},
			cannabisApplicationIndividualAddress);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the cannabis application individual addresses in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationIndividualAddresses the cannabis application individual addresses
	 */
	@Override
	public void cacheResult(
		List<CannabisApplicationIndividualAddress>
			cannabisApplicationIndividualAddresses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (cannabisApplicationIndividualAddresses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CannabisApplicationIndividualAddress
				cannabisApplicationIndividualAddress :
					cannabisApplicationIndividualAddresses) {

			if (entityCache.getResult(
					CannabisApplicationIndividualAddressImpl.class,
					cannabisApplicationIndividualAddress.getPrimaryKey()) ==
						null) {

				cacheResult(cannabisApplicationIndividualAddress);
			}
		}
	}

	/**
	 * Clears the cache for all cannabis application individual addresses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CannabisApplicationIndividualAddressImpl.class);

		finderCache.clearCache(CannabisApplicationIndividualAddressImpl.class);
	}

	/**
	 * Clears the cache for the cannabis application individual address.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CannabisApplicationIndividualAddress
			cannabisApplicationIndividualAddress) {

		entityCache.removeResult(
			CannabisApplicationIndividualAddressImpl.class,
			cannabisApplicationIndividualAddress);
	}

	@Override
	public void clearCache(
		List<CannabisApplicationIndividualAddress>
			cannabisApplicationIndividualAddresses) {

		for (CannabisApplicationIndividualAddress
				cannabisApplicationIndividualAddress :
					cannabisApplicationIndividualAddresses) {

			entityCache.removeResult(
				CannabisApplicationIndividualAddressImpl.class,
				cannabisApplicationIndividualAddress);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CannabisApplicationIndividualAddressImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CannabisApplicationIndividualAddressImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CannabisApplicationIndividualAddressModelImpl
			cannabisApplicationIndividualAddressModelImpl) {

		Object[] args = new Object[] {
			cannabisApplicationIndividualAddressModelImpl.getUuid(),
			cannabisApplicationIndividualAddressModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args,
			cannabisApplicationIndividualAddressModelImpl);

		args = new Object[] {
			cannabisApplicationIndividualAddressModelImpl.getAddressType(),
			cannabisApplicationIndividualAddressModelImpl.
				getIndividualInformationId()
		};

		finderCache.putResult(
			_finderPathCountBygetCA_CA_by_CI_AT, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCA_CA_by_CI_AT, args,
			cannabisApplicationIndividualAddressModelImpl);
	}

	/**
	 * Creates a new cannabis application individual address with the primary key. Does not add the cannabis application individual address to the database.
	 *
	 * @param IndividualAddressId the primary key for the new cannabis application individual address
	 * @return the new cannabis application individual address
	 */
	@Override
	public CannabisApplicationIndividualAddress create(
		long IndividualAddressId) {

		CannabisApplicationIndividualAddress
			cannabisApplicationIndividualAddress =
				new CannabisApplicationIndividualAddressImpl();

		cannabisApplicationIndividualAddress.setNew(true);
		cannabisApplicationIndividualAddress.setPrimaryKey(IndividualAddressId);

		String uuid = PortalUUIDUtil.generate();

		cannabisApplicationIndividualAddress.setUuid(uuid);

		cannabisApplicationIndividualAddress.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return cannabisApplicationIndividualAddress;
	}

	/**
	 * Removes the cannabis application individual address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param IndividualAddressId the primary key of the cannabis application individual address
	 * @return the cannabis application individual address that was removed
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a cannabis application individual address with the primary key could not be found
	 */
	@Override
	public CannabisApplicationIndividualAddress remove(long IndividualAddressId)
		throws NoSuchCannabisApplicationIndividualAddressException {

		return remove((Serializable)IndividualAddressId);
	}

	/**
	 * Removes the cannabis application individual address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cannabis application individual address
	 * @return the cannabis application individual address that was removed
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a cannabis application individual address with the primary key could not be found
	 */
	@Override
	public CannabisApplicationIndividualAddress remove(Serializable primaryKey)
		throws NoSuchCannabisApplicationIndividualAddressException {

		Session session = null;

		try {
			session = openSession();

			CannabisApplicationIndividualAddress
				cannabisApplicationIndividualAddress =
					(CannabisApplicationIndividualAddress)session.get(
						CannabisApplicationIndividualAddressImpl.class,
						primaryKey);

			if (cannabisApplicationIndividualAddress == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCannabisApplicationIndividualAddressException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(cannabisApplicationIndividualAddress);
		}
		catch (NoSuchCannabisApplicationIndividualAddressException
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
	protected CannabisApplicationIndividualAddress removeImpl(
		CannabisApplicationIndividualAddress
			cannabisApplicationIndividualAddress) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cannabisApplicationIndividualAddress)) {
				cannabisApplicationIndividualAddress =
					(CannabisApplicationIndividualAddress)session.get(
						CannabisApplicationIndividualAddressImpl.class,
						cannabisApplicationIndividualAddress.
							getPrimaryKeyObj());
			}

			if (cannabisApplicationIndividualAddress != null) {
				session.delete(cannabisApplicationIndividualAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (cannabisApplicationIndividualAddress != null) {
			clearCache(cannabisApplicationIndividualAddress);
		}

		return cannabisApplicationIndividualAddress;
	}

	@Override
	public CannabisApplicationIndividualAddress updateImpl(
		CannabisApplicationIndividualAddress
			cannabisApplicationIndividualAddress) {

		boolean isNew = cannabisApplicationIndividualAddress.isNew();

		if (!(cannabisApplicationIndividualAddress instanceof
				CannabisApplicationIndividualAddressModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					cannabisApplicationIndividualAddress.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					cannabisApplicationIndividualAddress);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cannabisApplicationIndividualAddress proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CannabisApplicationIndividualAddress implementation " +
					cannabisApplicationIndividualAddress.getClass());
		}

		CannabisApplicationIndividualAddressModelImpl
			cannabisApplicationIndividualAddressModelImpl =
				(CannabisApplicationIndividualAddressModelImpl)
					cannabisApplicationIndividualAddress;

		if (Validator.isNull(cannabisApplicationIndividualAddress.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			cannabisApplicationIndividualAddress.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(cannabisApplicationIndividualAddress.getCreateDate() == null)) {

			if (serviceContext == null) {
				cannabisApplicationIndividualAddress.setCreateDate(date);
			}
			else {
				cannabisApplicationIndividualAddress.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!cannabisApplicationIndividualAddressModelImpl.
				hasSetModifiedDate()) {

			if (serviceContext == null) {
				cannabisApplicationIndividualAddress.setModifiedDate(date);
			}
			else {
				cannabisApplicationIndividualAddress.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(cannabisApplicationIndividualAddress);
			}
			else {
				cannabisApplicationIndividualAddress =
					(CannabisApplicationIndividualAddress)session.merge(
						cannabisApplicationIndividualAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CannabisApplicationIndividualAddressImpl.class,
			cannabisApplicationIndividualAddressModelImpl, false, true);

		cacheUniqueFindersCache(cannabisApplicationIndividualAddressModelImpl);

		if (isNew) {
			cannabisApplicationIndividualAddress.setNew(false);
		}

		cannabisApplicationIndividualAddress.resetOriginalValues();

		return cannabisApplicationIndividualAddress;
	}

	/**
	 * Returns the cannabis application individual address with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cannabis application individual address
	 * @return the cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a cannabis application individual address with the primary key could not be found
	 */
	@Override
	public CannabisApplicationIndividualAddress findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchCannabisApplicationIndividualAddressException {

		CannabisApplicationIndividualAddress
			cannabisApplicationIndividualAddress = fetchByPrimaryKey(
				primaryKey);

		if (cannabisApplicationIndividualAddress == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCannabisApplicationIndividualAddressException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return cannabisApplicationIndividualAddress;
	}

	/**
	 * Returns the cannabis application individual address with the primary key or throws a <code>NoSuchCannabisApplicationIndividualAddressException</code> if it could not be found.
	 *
	 * @param IndividualAddressId the primary key of the cannabis application individual address
	 * @return the cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a cannabis application individual address with the primary key could not be found
	 */
	@Override
	public CannabisApplicationIndividualAddress findByPrimaryKey(
			long IndividualAddressId)
		throws NoSuchCannabisApplicationIndividualAddressException {

		return findByPrimaryKey((Serializable)IndividualAddressId);
	}

	/**
	 * Returns the cannabis application individual address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param IndividualAddressId the primary key of the cannabis application individual address
	 * @return the cannabis application individual address, or <code>null</code> if a cannabis application individual address with the primary key could not be found
	 */
	@Override
	public CannabisApplicationIndividualAddress fetchByPrimaryKey(
		long IndividualAddressId) {

		return fetchByPrimaryKey((Serializable)IndividualAddressId);
	}

	/**
	 * Returns all the cannabis application individual addresses.
	 *
	 * @return the cannabis application individual addresses
	 */
	@Override
	public List<CannabisApplicationIndividualAddress> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis application individual addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @return the range of cannabis application individual addresses
	 */
	@Override
	public List<CannabisApplicationIndividualAddress> findAll(
		int start, int end) {

		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis application individual addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis application individual addresses
	 */
	@Override
	public List<CannabisApplicationIndividualAddress> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationIndividualAddress>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis application individual addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis application individual addresses
	 */
	@Override
	public List<CannabisApplicationIndividualAddress> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationIndividualAddress>
			orderByComparator,
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

		List<CannabisApplicationIndividualAddress> list = null;

		if (useFinderCache) {
			list =
				(List<CannabisApplicationIndividualAddress>)
					finderCache.getResult(finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CANNABISAPPLICATIONINDIVIDUALADDRESS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CANNABISAPPLICATIONINDIVIDUALADDRESS;

				sql = sql.concat(
					CannabisApplicationIndividualAddressModelImpl.
						ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list =
					(List<CannabisApplicationIndividualAddress>)QueryUtil.list(
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
	 * Removes all the cannabis application individual addresses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CannabisApplicationIndividualAddress
				cannabisApplicationIndividualAddress : findAll()) {

			remove(cannabisApplicationIndividualAddress);
		}
	}

	/**
	 * Returns the number of cannabis application individual addresses.
	 *
	 * @return the number of cannabis application individual addresses
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
					_SQL_COUNT_CANNABISAPPLICATIONINDIVIDUALADDRESS);

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
		return "IndividualAddressId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CANNABISAPPLICATIONINDIVIDUALADDRESS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CannabisApplicationIndividualAddressModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cannabis application individual address persistence.
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
			new String[] {"addressType", "individualInformationId"}, true);

		_finderPathCountBygetCA_CA_by_CI_AT = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCA_CA_by_CI_AT",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"addressType", "individualInformationId"}, false);

		_finderPathWithPaginationFindBygetCA_CA_by_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCA_CA_by_CI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"individualInformationId"}, true);

		_finderPathWithoutPaginationFindBygetCA_CA_by_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetCA_CA_by_CI",
			new String[] {Long.class.getName()},
			new String[] {"individualInformationId"}, true);

		_finderPathCountBygetCA_CA_by_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCA_CA_by_CI",
			new String[] {Long.class.getName()},
			new String[] {"individualInformationId"}, false);

		CannabisApplicationIndividualAddressUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CannabisApplicationIndividualAddressUtil.setPersistence(null);

		entityCache.removeCache(
			CannabisApplicationIndividualAddressImpl.class.getName());
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

	private static final String
		_SQL_SELECT_CANNABISAPPLICATIONINDIVIDUALADDRESS =
			"SELECT cannabisApplicationIndividualAddress FROM CannabisApplicationIndividualAddress cannabisApplicationIndividualAddress";

	private static final String
		_SQL_SELECT_CANNABISAPPLICATIONINDIVIDUALADDRESS_WHERE =
			"SELECT cannabisApplicationIndividualAddress FROM CannabisApplicationIndividualAddress cannabisApplicationIndividualAddress WHERE ";

	private static final String
		_SQL_COUNT_CANNABISAPPLICATIONINDIVIDUALADDRESS =
			"SELECT COUNT(cannabisApplicationIndividualAddress) FROM CannabisApplicationIndividualAddress cannabisApplicationIndividualAddress";

	private static final String
		_SQL_COUNT_CANNABISAPPLICATIONINDIVIDUALADDRESS_WHERE =
			"SELECT COUNT(cannabisApplicationIndividualAddress) FROM CannabisApplicationIndividualAddress cannabisApplicationIndividualAddress WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"cannabisApplicationIndividualAddress.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CannabisApplicationIndividualAddress exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CannabisApplicationIndividualAddress exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CannabisApplicationIndividualAddressPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}