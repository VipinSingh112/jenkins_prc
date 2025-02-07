/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence.impl;

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

import com.nbp.jtb.application.form.service.exception.NoSuchAccoHotelLicenceException;
import com.nbp.jtb.application.form.service.model.AccoHotelLicence;
import com.nbp.jtb.application.form.service.model.AccoHotelLicenceTable;
import com.nbp.jtb.application.form.service.model.impl.AccoHotelLicenceImpl;
import com.nbp.jtb.application.form.service.model.impl.AccoHotelLicenceModelImpl;
import com.nbp.jtb.application.form.service.service.persistence.AccoHotelLicencePersistence;
import com.nbp.jtb.application.form.service.service.persistence.AccoHotelLicenceUtil;
import com.nbp.jtb.application.form.service.service.persistence.impl.constants.JTB_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the acco hotel licence service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AccoHotelLicencePersistence.class)
public class AccoHotelLicencePersistenceImpl
	extends BasePersistenceImpl<AccoHotelLicence>
	implements AccoHotelLicencePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AccoHotelLicenceUtil</code> to access the acco hotel licence persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AccoHotelLicenceImpl.class.getName();

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
	 * Returns all the acco hotel licences where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acco hotel licences
	 */
	@Override
	public List<AccoHotelLicence> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acco hotel licences where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco hotel licences
	 * @param end the upper bound of the range of acco hotel licences (not inclusive)
	 * @return the range of matching acco hotel licences
	 */
	@Override
	public List<AccoHotelLicence> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the acco hotel licences where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco hotel licences
	 * @param end the upper bound of the range of acco hotel licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acco hotel licences
	 */
	@Override
	public List<AccoHotelLicence> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccoHotelLicence> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acco hotel licences where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco hotel licences
	 * @param end the upper bound of the range of acco hotel licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acco hotel licences
	 */
	@Override
	public List<AccoHotelLicence> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccoHotelLicence> orderByComparator,
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

		List<AccoHotelLicence> list = null;

		if (useFinderCache) {
			list = (List<AccoHotelLicence>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AccoHotelLicence accoHotelLicence : list) {
					if (!uuid.equals(accoHotelLicence.getUuid())) {
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

			sb.append(_SQL_SELECT_ACCOHOTELLICENCE_WHERE);

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
				sb.append(AccoHotelLicenceModelImpl.ORDER_BY_JPQL);
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

				list = (List<AccoHotelLicence>)QueryUtil.list(
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
	 * Returns the first acco hotel licence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco hotel licence
	 * @throws NoSuchAccoHotelLicenceException if a matching acco hotel licence could not be found
	 */
	@Override
	public AccoHotelLicence findByUuid_First(
			String uuid, OrderByComparator<AccoHotelLicence> orderByComparator)
		throws NoSuchAccoHotelLicenceException {

		AccoHotelLicence accoHotelLicence = fetchByUuid_First(
			uuid, orderByComparator);

		if (accoHotelLicence != null) {
			return accoHotelLicence;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAccoHotelLicenceException(sb.toString());
	}

	/**
	 * Returns the first acco hotel licence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco hotel licence, or <code>null</code> if a matching acco hotel licence could not be found
	 */
	@Override
	public AccoHotelLicence fetchByUuid_First(
		String uuid, OrderByComparator<AccoHotelLicence> orderByComparator) {

		List<AccoHotelLicence> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last acco hotel licence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco hotel licence
	 * @throws NoSuchAccoHotelLicenceException if a matching acco hotel licence could not be found
	 */
	@Override
	public AccoHotelLicence findByUuid_Last(
			String uuid, OrderByComparator<AccoHotelLicence> orderByComparator)
		throws NoSuchAccoHotelLicenceException {

		AccoHotelLicence accoHotelLicence = fetchByUuid_Last(
			uuid, orderByComparator);

		if (accoHotelLicence != null) {
			return accoHotelLicence;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAccoHotelLicenceException(sb.toString());
	}

	/**
	 * Returns the last acco hotel licence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco hotel licence, or <code>null</code> if a matching acco hotel licence could not be found
	 */
	@Override
	public AccoHotelLicence fetchByUuid_Last(
		String uuid, OrderByComparator<AccoHotelLicence> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<AccoHotelLicence> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the acco hotel licences before and after the current acco hotel licence in the ordered set where uuid = &#63;.
	 *
	 * @param accoHotelLicenceId the primary key of the current acco hotel licence
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acco hotel licence
	 * @throws NoSuchAccoHotelLicenceException if a acco hotel licence with the primary key could not be found
	 */
	@Override
	public AccoHotelLicence[] findByUuid_PrevAndNext(
			long accoHotelLicenceId, String uuid,
			OrderByComparator<AccoHotelLicence> orderByComparator)
		throws NoSuchAccoHotelLicenceException {

		uuid = Objects.toString(uuid, "");

		AccoHotelLicence accoHotelLicence = findByPrimaryKey(
			accoHotelLicenceId);

		Session session = null;

		try {
			session = openSession();

			AccoHotelLicence[] array = new AccoHotelLicenceImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, accoHotelLicence, uuid, orderByComparator, true);

			array[1] = accoHotelLicence;

			array[2] = getByUuid_PrevAndNext(
				session, accoHotelLicence, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected AccoHotelLicence getByUuid_PrevAndNext(
		Session session, AccoHotelLicence accoHotelLicence, String uuid,
		OrderByComparator<AccoHotelLicence> orderByComparator,
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

		sb.append(_SQL_SELECT_ACCOHOTELLICENCE_WHERE);

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
			sb.append(AccoHotelLicenceModelImpl.ORDER_BY_JPQL);
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
						accoHotelLicence)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AccoHotelLicence> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the acco hotel licences where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (AccoHotelLicence accoHotelLicence :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(accoHotelLicence);
		}
	}

	/**
	 * Returns the number of acco hotel licences where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acco hotel licences
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACCOHOTELLICENCE_WHERE);

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
		"accoHotelLicence.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(accoHotelLicence.uuid IS NULL OR accoHotelLicence.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the acco hotel licence where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccoHotelLicenceException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acco hotel licence
	 * @throws NoSuchAccoHotelLicenceException if a matching acco hotel licence could not be found
	 */
	@Override
	public AccoHotelLicence findByUUID_G(String uuid, long groupId)
		throws NoSuchAccoHotelLicenceException {

		AccoHotelLicence accoHotelLicence = fetchByUUID_G(uuid, groupId);

		if (accoHotelLicence == null) {
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

			throw new NoSuchAccoHotelLicenceException(sb.toString());
		}

		return accoHotelLicence;
	}

	/**
	 * Returns the acco hotel licence where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acco hotel licence, or <code>null</code> if a matching acco hotel licence could not be found
	 */
	@Override
	public AccoHotelLicence fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the acco hotel licence where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acco hotel licence, or <code>null</code> if a matching acco hotel licence could not be found
	 */
	@Override
	public AccoHotelLicence fetchByUUID_G(
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

		if (result instanceof AccoHotelLicence) {
			AccoHotelLicence accoHotelLicence = (AccoHotelLicence)result;

			if (!Objects.equals(uuid, accoHotelLicence.getUuid()) ||
				(groupId != accoHotelLicence.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_ACCOHOTELLICENCE_WHERE);

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

				List<AccoHotelLicence> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					AccoHotelLicence accoHotelLicence = list.get(0);

					result = accoHotelLicence;

					cacheResult(accoHotelLicence);
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
			return (AccoHotelLicence)result;
		}
	}

	/**
	 * Removes the acco hotel licence where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acco hotel licence that was removed
	 */
	@Override
	public AccoHotelLicence removeByUUID_G(String uuid, long groupId)
		throws NoSuchAccoHotelLicenceException {

		AccoHotelLicence accoHotelLicence = findByUUID_G(uuid, groupId);

		return remove(accoHotelLicence);
	}

	/**
	 * Returns the number of acco hotel licences where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acco hotel licences
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ACCOHOTELLICENCE_WHERE);

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
		"accoHotelLicence.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(accoHotelLicence.uuid IS NULL OR accoHotelLicence.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"accoHotelLicence.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the acco hotel licences where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acco hotel licences
	 */
	@Override
	public List<AccoHotelLicence> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acco hotel licences where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco hotel licences
	 * @param end the upper bound of the range of acco hotel licences (not inclusive)
	 * @return the range of matching acco hotel licences
	 */
	@Override
	public List<AccoHotelLicence> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the acco hotel licences where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco hotel licences
	 * @param end the upper bound of the range of acco hotel licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acco hotel licences
	 */
	@Override
	public List<AccoHotelLicence> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccoHotelLicence> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acco hotel licences where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco hotel licences
	 * @param end the upper bound of the range of acco hotel licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acco hotel licences
	 */
	@Override
	public List<AccoHotelLicence> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccoHotelLicence> orderByComparator,
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

		List<AccoHotelLicence> list = null;

		if (useFinderCache) {
			list = (List<AccoHotelLicence>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AccoHotelLicence accoHotelLicence : list) {
					if (!uuid.equals(accoHotelLicence.getUuid()) ||
						(companyId != accoHotelLicence.getCompanyId())) {

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

			sb.append(_SQL_SELECT_ACCOHOTELLICENCE_WHERE);

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
				sb.append(AccoHotelLicenceModelImpl.ORDER_BY_JPQL);
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

				list = (List<AccoHotelLicence>)QueryUtil.list(
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
	 * Returns the first acco hotel licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco hotel licence
	 * @throws NoSuchAccoHotelLicenceException if a matching acco hotel licence could not be found
	 */
	@Override
	public AccoHotelLicence findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<AccoHotelLicence> orderByComparator)
		throws NoSuchAccoHotelLicenceException {

		AccoHotelLicence accoHotelLicence = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (accoHotelLicence != null) {
			return accoHotelLicence;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchAccoHotelLicenceException(sb.toString());
	}

	/**
	 * Returns the first acco hotel licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco hotel licence, or <code>null</code> if a matching acco hotel licence could not be found
	 */
	@Override
	public AccoHotelLicence fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<AccoHotelLicence> orderByComparator) {

		List<AccoHotelLicence> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last acco hotel licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco hotel licence
	 * @throws NoSuchAccoHotelLicenceException if a matching acco hotel licence could not be found
	 */
	@Override
	public AccoHotelLicence findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<AccoHotelLicence> orderByComparator)
		throws NoSuchAccoHotelLicenceException {

		AccoHotelLicence accoHotelLicence = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (accoHotelLicence != null) {
			return accoHotelLicence;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchAccoHotelLicenceException(sb.toString());
	}

	/**
	 * Returns the last acco hotel licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco hotel licence, or <code>null</code> if a matching acco hotel licence could not be found
	 */
	@Override
	public AccoHotelLicence fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<AccoHotelLicence> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<AccoHotelLicence> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the acco hotel licences before and after the current acco hotel licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accoHotelLicenceId the primary key of the current acco hotel licence
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acco hotel licence
	 * @throws NoSuchAccoHotelLicenceException if a acco hotel licence with the primary key could not be found
	 */
	@Override
	public AccoHotelLicence[] findByUuid_C_PrevAndNext(
			long accoHotelLicenceId, String uuid, long companyId,
			OrderByComparator<AccoHotelLicence> orderByComparator)
		throws NoSuchAccoHotelLicenceException {

		uuid = Objects.toString(uuid, "");

		AccoHotelLicence accoHotelLicence = findByPrimaryKey(
			accoHotelLicenceId);

		Session session = null;

		try {
			session = openSession();

			AccoHotelLicence[] array = new AccoHotelLicenceImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, accoHotelLicence, uuid, companyId, orderByComparator,
				true);

			array[1] = accoHotelLicence;

			array[2] = getByUuid_C_PrevAndNext(
				session, accoHotelLicence, uuid, companyId, orderByComparator,
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

	protected AccoHotelLicence getByUuid_C_PrevAndNext(
		Session session, AccoHotelLicence accoHotelLicence, String uuid,
		long companyId, OrderByComparator<AccoHotelLicence> orderByComparator,
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

		sb.append(_SQL_SELECT_ACCOHOTELLICENCE_WHERE);

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
			sb.append(AccoHotelLicenceModelImpl.ORDER_BY_JPQL);
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
						accoHotelLicence)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AccoHotelLicence> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the acco hotel licences where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (AccoHotelLicence accoHotelLicence :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(accoHotelLicence);
		}
	}

	/**
	 * Returns the number of acco hotel licences where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acco hotel licences
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ACCOHOTELLICENCE_WHERE);

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
		"accoHotelLicence.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(accoHotelLicence.uuid IS NULL OR accoHotelLicence.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"accoHotelLicence.companyId = ?";

	private FinderPath _finderPathFetchBygetJTB_ByApplicationId;
	private FinderPath _finderPathCountBygetJTB_ByApplicationId;

	/**
	 * Returns the acco hotel licence where jtbApplicationId = &#63; or throws a <code>NoSuchAccoHotelLicenceException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching acco hotel licence
	 * @throws NoSuchAccoHotelLicenceException if a matching acco hotel licence could not be found
	 */
	@Override
	public AccoHotelLicence findBygetJTB_ByApplicationId(long jtbApplicationId)
		throws NoSuchAccoHotelLicenceException {

		AccoHotelLicence accoHotelLicence = fetchBygetJTB_ByApplicationId(
			jtbApplicationId);

		if (accoHotelLicence == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jtbApplicationId=");
			sb.append(jtbApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAccoHotelLicenceException(sb.toString());
		}

		return accoHotelLicence;
	}

	/**
	 * Returns the acco hotel licence where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching acco hotel licence, or <code>null</code> if a matching acco hotel licence could not be found
	 */
	@Override
	public AccoHotelLicence fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return fetchBygetJTB_ByApplicationId(jtbApplicationId, true);
	}

	/**
	 * Returns the acco hotel licence where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acco hotel licence, or <code>null</code> if a matching acco hotel licence could not be found
	 */
	@Override
	public AccoHotelLicence fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {jtbApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJTB_ByApplicationId, finderArgs, this);
		}

		if (result instanceof AccoHotelLicence) {
			AccoHotelLicence accoHotelLicence = (AccoHotelLicence)result;

			if (jtbApplicationId != accoHotelLicence.getJtbApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ACCOHOTELLICENCE_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				List<AccoHotelLicence> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJTB_ByApplicationId,
							finderArgs, list);
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
								"AccoHotelLicencePersistenceImpl.fetchBygetJTB_ByApplicationId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AccoHotelLicence accoHotelLicence = list.get(0);

					result = accoHotelLicence;

					cacheResult(accoHotelLicence);
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
			return (AccoHotelLicence)result;
		}
	}

	/**
	 * Removes the acco hotel licence where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the acco hotel licence that was removed
	 */
	@Override
	public AccoHotelLicence removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAccoHotelLicenceException {

		AccoHotelLicence accoHotelLicence = findBygetJTB_ByApplicationId(
			jtbApplicationId);

		return remove(accoHotelLicence);
	}

	/**
	 * Returns the number of acco hotel licences where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching acco hotel licences
	 */
	@Override
	public int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJTB_ByApplicationId;

		Object[] finderArgs = new Object[] {jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACCOHOTELLICENCE_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

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

	private static final String
		_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2 =
			"accoHotelLicence.jtbApplicationId = ?";

	public AccoHotelLicencePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(AccoHotelLicence.class);

		setModelImplClass(AccoHotelLicenceImpl.class);
		setModelPKClass(long.class);

		setTable(AccoHotelLicenceTable.INSTANCE);
	}

	/**
	 * Caches the acco hotel licence in the entity cache if it is enabled.
	 *
	 * @param accoHotelLicence the acco hotel licence
	 */
	@Override
	public void cacheResult(AccoHotelLicence accoHotelLicence) {
		entityCache.putResult(
			AccoHotelLicenceImpl.class, accoHotelLicence.getPrimaryKey(),
			accoHotelLicence);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				accoHotelLicence.getUuid(), accoHotelLicence.getGroupId()
			},
			accoHotelLicence);

		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId,
			new Object[] {accoHotelLicence.getJtbApplicationId()},
			accoHotelLicence);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the acco hotel licences in the entity cache if it is enabled.
	 *
	 * @param accoHotelLicences the acco hotel licences
	 */
	@Override
	public void cacheResult(List<AccoHotelLicence> accoHotelLicences) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (accoHotelLicences.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AccoHotelLicence accoHotelLicence : accoHotelLicences) {
			if (entityCache.getResult(
					AccoHotelLicenceImpl.class,
					accoHotelLicence.getPrimaryKey()) == null) {

				cacheResult(accoHotelLicence);
			}
		}
	}

	/**
	 * Clears the cache for all acco hotel licences.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AccoHotelLicenceImpl.class);

		finderCache.clearCache(AccoHotelLicenceImpl.class);
	}

	/**
	 * Clears the cache for the acco hotel licence.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AccoHotelLicence accoHotelLicence) {
		entityCache.removeResult(AccoHotelLicenceImpl.class, accoHotelLicence);
	}

	@Override
	public void clearCache(List<AccoHotelLicence> accoHotelLicences) {
		for (AccoHotelLicence accoHotelLicence : accoHotelLicences) {
			entityCache.removeResult(
				AccoHotelLicenceImpl.class, accoHotelLicence);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AccoHotelLicenceImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AccoHotelLicenceImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AccoHotelLicenceModelImpl accoHotelLicenceModelImpl) {

		Object[] args = new Object[] {
			accoHotelLicenceModelImpl.getUuid(),
			accoHotelLicenceModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, accoHotelLicenceModelImpl);

		args = new Object[] {accoHotelLicenceModelImpl.getJtbApplicationId()};

		finderCache.putResult(
			_finderPathCountBygetJTB_ByApplicationId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId, args,
			accoHotelLicenceModelImpl);
	}

	/**
	 * Creates a new acco hotel licence with the primary key. Does not add the acco hotel licence to the database.
	 *
	 * @param accoHotelLicenceId the primary key for the new acco hotel licence
	 * @return the new acco hotel licence
	 */
	@Override
	public AccoHotelLicence create(long accoHotelLicenceId) {
		AccoHotelLicence accoHotelLicence = new AccoHotelLicenceImpl();

		accoHotelLicence.setNew(true);
		accoHotelLicence.setPrimaryKey(accoHotelLicenceId);

		String uuid = PortalUUIDUtil.generate();

		accoHotelLicence.setUuid(uuid);

		accoHotelLicence.setCompanyId(CompanyThreadLocal.getCompanyId());

		return accoHotelLicence;
	}

	/**
	 * Removes the acco hotel licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accoHotelLicenceId the primary key of the acco hotel licence
	 * @return the acco hotel licence that was removed
	 * @throws NoSuchAccoHotelLicenceException if a acco hotel licence with the primary key could not be found
	 */
	@Override
	public AccoHotelLicence remove(long accoHotelLicenceId)
		throws NoSuchAccoHotelLicenceException {

		return remove((Serializable)accoHotelLicenceId);
	}

	/**
	 * Removes the acco hotel licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the acco hotel licence
	 * @return the acco hotel licence that was removed
	 * @throws NoSuchAccoHotelLicenceException if a acco hotel licence with the primary key could not be found
	 */
	@Override
	public AccoHotelLicence remove(Serializable primaryKey)
		throws NoSuchAccoHotelLicenceException {

		Session session = null;

		try {
			session = openSession();

			AccoHotelLicence accoHotelLicence = (AccoHotelLicence)session.get(
				AccoHotelLicenceImpl.class, primaryKey);

			if (accoHotelLicence == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAccoHotelLicenceException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(accoHotelLicence);
		}
		catch (NoSuchAccoHotelLicenceException noSuchEntityException) {
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
	protected AccoHotelLicence removeImpl(AccoHotelLicence accoHotelLicence) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(accoHotelLicence)) {
				accoHotelLicence = (AccoHotelLicence)session.get(
					AccoHotelLicenceImpl.class,
					accoHotelLicence.getPrimaryKeyObj());
			}

			if (accoHotelLicence != null) {
				session.delete(accoHotelLicence);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (accoHotelLicence != null) {
			clearCache(accoHotelLicence);
		}

		return accoHotelLicence;
	}

	@Override
	public AccoHotelLicence updateImpl(AccoHotelLicence accoHotelLicence) {
		boolean isNew = accoHotelLicence.isNew();

		if (!(accoHotelLicence instanceof AccoHotelLicenceModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(accoHotelLicence.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					accoHotelLicence);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in accoHotelLicence proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AccoHotelLicence implementation " +
					accoHotelLicence.getClass());
		}

		AccoHotelLicenceModelImpl accoHotelLicenceModelImpl =
			(AccoHotelLicenceModelImpl)accoHotelLicence;

		if (Validator.isNull(accoHotelLicence.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			accoHotelLicence.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (accoHotelLicence.getCreateDate() == null)) {
			if (serviceContext == null) {
				accoHotelLicence.setCreateDate(date);
			}
			else {
				accoHotelLicence.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!accoHotelLicenceModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				accoHotelLicence.setModifiedDate(date);
			}
			else {
				accoHotelLicence.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(accoHotelLicence);
			}
			else {
				accoHotelLicence = (AccoHotelLicence)session.merge(
					accoHotelLicence);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AccoHotelLicenceImpl.class, accoHotelLicenceModelImpl, false, true);

		cacheUniqueFindersCache(accoHotelLicenceModelImpl);

		if (isNew) {
			accoHotelLicence.setNew(false);
		}

		accoHotelLicence.resetOriginalValues();

		return accoHotelLicence;
	}

	/**
	 * Returns the acco hotel licence with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the acco hotel licence
	 * @return the acco hotel licence
	 * @throws NoSuchAccoHotelLicenceException if a acco hotel licence with the primary key could not be found
	 */
	@Override
	public AccoHotelLicence findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAccoHotelLicenceException {

		AccoHotelLicence accoHotelLicence = fetchByPrimaryKey(primaryKey);

		if (accoHotelLicence == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAccoHotelLicenceException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return accoHotelLicence;
	}

	/**
	 * Returns the acco hotel licence with the primary key or throws a <code>NoSuchAccoHotelLicenceException</code> if it could not be found.
	 *
	 * @param accoHotelLicenceId the primary key of the acco hotel licence
	 * @return the acco hotel licence
	 * @throws NoSuchAccoHotelLicenceException if a acco hotel licence with the primary key could not be found
	 */
	@Override
	public AccoHotelLicence findByPrimaryKey(long accoHotelLicenceId)
		throws NoSuchAccoHotelLicenceException {

		return findByPrimaryKey((Serializable)accoHotelLicenceId);
	}

	/**
	 * Returns the acco hotel licence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accoHotelLicenceId the primary key of the acco hotel licence
	 * @return the acco hotel licence, or <code>null</code> if a acco hotel licence with the primary key could not be found
	 */
	@Override
	public AccoHotelLicence fetchByPrimaryKey(long accoHotelLicenceId) {
		return fetchByPrimaryKey((Serializable)accoHotelLicenceId);
	}

	/**
	 * Returns all the acco hotel licences.
	 *
	 * @return the acco hotel licences
	 */
	@Override
	public List<AccoHotelLicence> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acco hotel licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco hotel licences
	 * @param end the upper bound of the range of acco hotel licences (not inclusive)
	 * @return the range of acco hotel licences
	 */
	@Override
	public List<AccoHotelLicence> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the acco hotel licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco hotel licences
	 * @param end the upper bound of the range of acco hotel licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acco hotel licences
	 */
	@Override
	public List<AccoHotelLicence> findAll(
		int start, int end,
		OrderByComparator<AccoHotelLicence> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acco hotel licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco hotel licences
	 * @param end the upper bound of the range of acco hotel licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acco hotel licences
	 */
	@Override
	public List<AccoHotelLicence> findAll(
		int start, int end,
		OrderByComparator<AccoHotelLicence> orderByComparator,
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

		List<AccoHotelLicence> list = null;

		if (useFinderCache) {
			list = (List<AccoHotelLicence>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ACCOHOTELLICENCE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ACCOHOTELLICENCE;

				sql = sql.concat(AccoHotelLicenceModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AccoHotelLicence>)QueryUtil.list(
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
	 * Removes all the acco hotel licences from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AccoHotelLicence accoHotelLicence : findAll()) {
			remove(accoHotelLicence);
		}
	}

	/**
	 * Returns the number of acco hotel licences.
	 *
	 * @return the number of acco hotel licences
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_ACCOHOTELLICENCE);

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
		return "accoHotelLicenceId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ACCOHOTELLICENCE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AccoHotelLicenceModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the acco hotel licence persistence.
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

		_finderPathFetchBygetJTB_ByApplicationId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJTB_ByApplicationId",
			new String[] {Long.class.getName()},
			new String[] {"jtbApplicationId"}, true);

		_finderPathCountBygetJTB_ByApplicationId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJTB_ByApplicationId",
			new String[] {Long.class.getName()},
			new String[] {"jtbApplicationId"}, false);

		AccoHotelLicenceUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AccoHotelLicenceUtil.setPersistence(null);

		entityCache.removeCache(AccoHotelLicenceImpl.class.getName());
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ACCOHOTELLICENCE =
		"SELECT accoHotelLicence FROM AccoHotelLicence accoHotelLicence";

	private static final String _SQL_SELECT_ACCOHOTELLICENCE_WHERE =
		"SELECT accoHotelLicence FROM AccoHotelLicence accoHotelLicence WHERE ";

	private static final String _SQL_COUNT_ACCOHOTELLICENCE =
		"SELECT COUNT(accoHotelLicence) FROM AccoHotelLicence accoHotelLicence";

	private static final String _SQL_COUNT_ACCOHOTELLICENCE_WHERE =
		"SELECT COUNT(accoHotelLicence) FROM AccoHotelLicence accoHotelLicence WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "accoHotelLicence.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AccoHotelLicence exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AccoHotelLicence exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AccoHotelLicencePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}