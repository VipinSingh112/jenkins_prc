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

import com.nbp.jtb.application.form.service.exception.NoSuchAccoNonHotelLicenceException;
import com.nbp.jtb.application.form.service.model.AccoNonHotelLicence;
import com.nbp.jtb.application.form.service.model.AccoNonHotelLicenceTable;
import com.nbp.jtb.application.form.service.model.impl.AccoNonHotelLicenceImpl;
import com.nbp.jtb.application.form.service.model.impl.AccoNonHotelLicenceModelImpl;
import com.nbp.jtb.application.form.service.service.persistence.AccoNonHotelLicencePersistence;
import com.nbp.jtb.application.form.service.service.persistence.AccoNonHotelLicenceUtil;
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
 * The persistence implementation for the acco non hotel licence service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AccoNonHotelLicencePersistence.class)
public class AccoNonHotelLicencePersistenceImpl
	extends BasePersistenceImpl<AccoNonHotelLicence>
	implements AccoNonHotelLicencePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AccoNonHotelLicenceUtil</code> to access the acco non hotel licence persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AccoNonHotelLicenceImpl.class.getName();

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
	 * Returns all the acco non hotel licences where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acco non hotel licences
	 */
	@Override
	public List<AccoNonHotelLicence> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acco non hotel licences where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco non hotel licences
	 * @param end the upper bound of the range of acco non hotel licences (not inclusive)
	 * @return the range of matching acco non hotel licences
	 */
	@Override
	public List<AccoNonHotelLicence> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the acco non hotel licences where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco non hotel licences
	 * @param end the upper bound of the range of acco non hotel licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acco non hotel licences
	 */
	@Override
	public List<AccoNonHotelLicence> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccoNonHotelLicence> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acco non hotel licences where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco non hotel licences
	 * @param end the upper bound of the range of acco non hotel licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acco non hotel licences
	 */
	@Override
	public List<AccoNonHotelLicence> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccoNonHotelLicence> orderByComparator,
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

		List<AccoNonHotelLicence> list = null;

		if (useFinderCache) {
			list = (List<AccoNonHotelLicence>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AccoNonHotelLicence accoNonHotelLicence : list) {
					if (!uuid.equals(accoNonHotelLicence.getUuid())) {
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

			sb.append(_SQL_SELECT_ACCONONHOTELLICENCE_WHERE);

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
				sb.append(AccoNonHotelLicenceModelImpl.ORDER_BY_JPQL);
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

				list = (List<AccoNonHotelLicence>)QueryUtil.list(
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
	 * Returns the first acco non hotel licence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco non hotel licence
	 * @throws NoSuchAccoNonHotelLicenceException if a matching acco non hotel licence could not be found
	 */
	@Override
	public AccoNonHotelLicence findByUuid_First(
			String uuid,
			OrderByComparator<AccoNonHotelLicence> orderByComparator)
		throws NoSuchAccoNonHotelLicenceException {

		AccoNonHotelLicence accoNonHotelLicence = fetchByUuid_First(
			uuid, orderByComparator);

		if (accoNonHotelLicence != null) {
			return accoNonHotelLicence;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAccoNonHotelLicenceException(sb.toString());
	}

	/**
	 * Returns the first acco non hotel licence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco non hotel licence, or <code>null</code> if a matching acco non hotel licence could not be found
	 */
	@Override
	public AccoNonHotelLicence fetchByUuid_First(
		String uuid, OrderByComparator<AccoNonHotelLicence> orderByComparator) {

		List<AccoNonHotelLicence> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last acco non hotel licence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco non hotel licence
	 * @throws NoSuchAccoNonHotelLicenceException if a matching acco non hotel licence could not be found
	 */
	@Override
	public AccoNonHotelLicence findByUuid_Last(
			String uuid,
			OrderByComparator<AccoNonHotelLicence> orderByComparator)
		throws NoSuchAccoNonHotelLicenceException {

		AccoNonHotelLicence accoNonHotelLicence = fetchByUuid_Last(
			uuid, orderByComparator);

		if (accoNonHotelLicence != null) {
			return accoNonHotelLicence;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAccoNonHotelLicenceException(sb.toString());
	}

	/**
	 * Returns the last acco non hotel licence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco non hotel licence, or <code>null</code> if a matching acco non hotel licence could not be found
	 */
	@Override
	public AccoNonHotelLicence fetchByUuid_Last(
		String uuid, OrderByComparator<AccoNonHotelLicence> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<AccoNonHotelLicence> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the acco non hotel licences before and after the current acco non hotel licence in the ordered set where uuid = &#63;.
	 *
	 * @param accoNonHotelLicenceId the primary key of the current acco non hotel licence
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acco non hotel licence
	 * @throws NoSuchAccoNonHotelLicenceException if a acco non hotel licence with the primary key could not be found
	 */
	@Override
	public AccoNonHotelLicence[] findByUuid_PrevAndNext(
			long accoNonHotelLicenceId, String uuid,
			OrderByComparator<AccoNonHotelLicence> orderByComparator)
		throws NoSuchAccoNonHotelLicenceException {

		uuid = Objects.toString(uuid, "");

		AccoNonHotelLicence accoNonHotelLicence = findByPrimaryKey(
			accoNonHotelLicenceId);

		Session session = null;

		try {
			session = openSession();

			AccoNonHotelLicence[] array = new AccoNonHotelLicenceImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, accoNonHotelLicence, uuid, orderByComparator, true);

			array[1] = accoNonHotelLicence;

			array[2] = getByUuid_PrevAndNext(
				session, accoNonHotelLicence, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected AccoNonHotelLicence getByUuid_PrevAndNext(
		Session session, AccoNonHotelLicence accoNonHotelLicence, String uuid,
		OrderByComparator<AccoNonHotelLicence> orderByComparator,
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

		sb.append(_SQL_SELECT_ACCONONHOTELLICENCE_WHERE);

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
			sb.append(AccoNonHotelLicenceModelImpl.ORDER_BY_JPQL);
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
						accoNonHotelLicence)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AccoNonHotelLicence> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the acco non hotel licences where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (AccoNonHotelLicence accoNonHotelLicence :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(accoNonHotelLicence);
		}
	}

	/**
	 * Returns the number of acco non hotel licences where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acco non hotel licences
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACCONONHOTELLICENCE_WHERE);

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
		"accoNonHotelLicence.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(accoNonHotelLicence.uuid IS NULL OR accoNonHotelLicence.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the acco non hotel licence where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccoNonHotelLicenceException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acco non hotel licence
	 * @throws NoSuchAccoNonHotelLicenceException if a matching acco non hotel licence could not be found
	 */
	@Override
	public AccoNonHotelLicence findByUUID_G(String uuid, long groupId)
		throws NoSuchAccoNonHotelLicenceException {

		AccoNonHotelLicence accoNonHotelLicence = fetchByUUID_G(uuid, groupId);

		if (accoNonHotelLicence == null) {
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

			throw new NoSuchAccoNonHotelLicenceException(sb.toString());
		}

		return accoNonHotelLicence;
	}

	/**
	 * Returns the acco non hotel licence where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acco non hotel licence, or <code>null</code> if a matching acco non hotel licence could not be found
	 */
	@Override
	public AccoNonHotelLicence fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the acco non hotel licence where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acco non hotel licence, or <code>null</code> if a matching acco non hotel licence could not be found
	 */
	@Override
	public AccoNonHotelLicence fetchByUUID_G(
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

		if (result instanceof AccoNonHotelLicence) {
			AccoNonHotelLicence accoNonHotelLicence =
				(AccoNonHotelLicence)result;

			if (!Objects.equals(uuid, accoNonHotelLicence.getUuid()) ||
				(groupId != accoNonHotelLicence.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_ACCONONHOTELLICENCE_WHERE);

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

				List<AccoNonHotelLicence> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					AccoNonHotelLicence accoNonHotelLicence = list.get(0);

					result = accoNonHotelLicence;

					cacheResult(accoNonHotelLicence);
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
			return (AccoNonHotelLicence)result;
		}
	}

	/**
	 * Removes the acco non hotel licence where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acco non hotel licence that was removed
	 */
	@Override
	public AccoNonHotelLicence removeByUUID_G(String uuid, long groupId)
		throws NoSuchAccoNonHotelLicenceException {

		AccoNonHotelLicence accoNonHotelLicence = findByUUID_G(uuid, groupId);

		return remove(accoNonHotelLicence);
	}

	/**
	 * Returns the number of acco non hotel licences where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acco non hotel licences
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ACCONONHOTELLICENCE_WHERE);

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
		"accoNonHotelLicence.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(accoNonHotelLicence.uuid IS NULL OR accoNonHotelLicence.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"accoNonHotelLicence.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the acco non hotel licences where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acco non hotel licences
	 */
	@Override
	public List<AccoNonHotelLicence> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acco non hotel licences where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco non hotel licences
	 * @param end the upper bound of the range of acco non hotel licences (not inclusive)
	 * @return the range of matching acco non hotel licences
	 */
	@Override
	public List<AccoNonHotelLicence> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the acco non hotel licences where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco non hotel licences
	 * @param end the upper bound of the range of acco non hotel licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acco non hotel licences
	 */
	@Override
	public List<AccoNonHotelLicence> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccoNonHotelLicence> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acco non hotel licences where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco non hotel licences
	 * @param end the upper bound of the range of acco non hotel licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acco non hotel licences
	 */
	@Override
	public List<AccoNonHotelLicence> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccoNonHotelLicence> orderByComparator,
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

		List<AccoNonHotelLicence> list = null;

		if (useFinderCache) {
			list = (List<AccoNonHotelLicence>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AccoNonHotelLicence accoNonHotelLicence : list) {
					if (!uuid.equals(accoNonHotelLicence.getUuid()) ||
						(companyId != accoNonHotelLicence.getCompanyId())) {

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

			sb.append(_SQL_SELECT_ACCONONHOTELLICENCE_WHERE);

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
				sb.append(AccoNonHotelLicenceModelImpl.ORDER_BY_JPQL);
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

				list = (List<AccoNonHotelLicence>)QueryUtil.list(
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
	 * Returns the first acco non hotel licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco non hotel licence
	 * @throws NoSuchAccoNonHotelLicenceException if a matching acco non hotel licence could not be found
	 */
	@Override
	public AccoNonHotelLicence findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<AccoNonHotelLicence> orderByComparator)
		throws NoSuchAccoNonHotelLicenceException {

		AccoNonHotelLicence accoNonHotelLicence = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (accoNonHotelLicence != null) {
			return accoNonHotelLicence;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchAccoNonHotelLicenceException(sb.toString());
	}

	/**
	 * Returns the first acco non hotel licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco non hotel licence, or <code>null</code> if a matching acco non hotel licence could not be found
	 */
	@Override
	public AccoNonHotelLicence fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<AccoNonHotelLicence> orderByComparator) {

		List<AccoNonHotelLicence> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last acco non hotel licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco non hotel licence
	 * @throws NoSuchAccoNonHotelLicenceException if a matching acco non hotel licence could not be found
	 */
	@Override
	public AccoNonHotelLicence findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<AccoNonHotelLicence> orderByComparator)
		throws NoSuchAccoNonHotelLicenceException {

		AccoNonHotelLicence accoNonHotelLicence = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (accoNonHotelLicence != null) {
			return accoNonHotelLicence;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchAccoNonHotelLicenceException(sb.toString());
	}

	/**
	 * Returns the last acco non hotel licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco non hotel licence, or <code>null</code> if a matching acco non hotel licence could not be found
	 */
	@Override
	public AccoNonHotelLicence fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<AccoNonHotelLicence> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<AccoNonHotelLicence> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the acco non hotel licences before and after the current acco non hotel licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accoNonHotelLicenceId the primary key of the current acco non hotel licence
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acco non hotel licence
	 * @throws NoSuchAccoNonHotelLicenceException if a acco non hotel licence with the primary key could not be found
	 */
	@Override
	public AccoNonHotelLicence[] findByUuid_C_PrevAndNext(
			long accoNonHotelLicenceId, String uuid, long companyId,
			OrderByComparator<AccoNonHotelLicence> orderByComparator)
		throws NoSuchAccoNonHotelLicenceException {

		uuid = Objects.toString(uuid, "");

		AccoNonHotelLicence accoNonHotelLicence = findByPrimaryKey(
			accoNonHotelLicenceId);

		Session session = null;

		try {
			session = openSession();

			AccoNonHotelLicence[] array = new AccoNonHotelLicenceImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, accoNonHotelLicence, uuid, companyId,
				orderByComparator, true);

			array[1] = accoNonHotelLicence;

			array[2] = getByUuid_C_PrevAndNext(
				session, accoNonHotelLicence, uuid, companyId,
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

	protected AccoNonHotelLicence getByUuid_C_PrevAndNext(
		Session session, AccoNonHotelLicence accoNonHotelLicence, String uuid,
		long companyId,
		OrderByComparator<AccoNonHotelLicence> orderByComparator,
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

		sb.append(_SQL_SELECT_ACCONONHOTELLICENCE_WHERE);

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
			sb.append(AccoNonHotelLicenceModelImpl.ORDER_BY_JPQL);
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
						accoNonHotelLicence)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AccoNonHotelLicence> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the acco non hotel licences where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (AccoNonHotelLicence accoNonHotelLicence :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(accoNonHotelLicence);
		}
	}

	/**
	 * Returns the number of acco non hotel licences where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acco non hotel licences
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ACCONONHOTELLICENCE_WHERE);

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
		"accoNonHotelLicence.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(accoNonHotelLicence.uuid IS NULL OR accoNonHotelLicence.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"accoNonHotelLicence.companyId = ?";

	private FinderPath _finderPathFetchBygetJTB_ByApplicationId;
	private FinderPath _finderPathCountBygetJTB_ByApplicationId;

	/**
	 * Returns the acco non hotel licence where jtbApplicationId = &#63; or throws a <code>NoSuchAccoNonHotelLicenceException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching acco non hotel licence
	 * @throws NoSuchAccoNonHotelLicenceException if a matching acco non hotel licence could not be found
	 */
	@Override
	public AccoNonHotelLicence findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAccoNonHotelLicenceException {

		AccoNonHotelLicence accoNonHotelLicence = fetchBygetJTB_ByApplicationId(
			jtbApplicationId);

		if (accoNonHotelLicence == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jtbApplicationId=");
			sb.append(jtbApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAccoNonHotelLicenceException(sb.toString());
		}

		return accoNonHotelLicence;
	}

	/**
	 * Returns the acco non hotel licence where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching acco non hotel licence, or <code>null</code> if a matching acco non hotel licence could not be found
	 */
	@Override
	public AccoNonHotelLicence fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return fetchBygetJTB_ByApplicationId(jtbApplicationId, true);
	}

	/**
	 * Returns the acco non hotel licence where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acco non hotel licence, or <code>null</code> if a matching acco non hotel licence could not be found
	 */
	@Override
	public AccoNonHotelLicence fetchBygetJTB_ByApplicationId(
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

		if (result instanceof AccoNonHotelLicence) {
			AccoNonHotelLicence accoNonHotelLicence =
				(AccoNonHotelLicence)result;

			if (jtbApplicationId != accoNonHotelLicence.getJtbApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ACCONONHOTELLICENCE_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				List<AccoNonHotelLicence> list = query.list();

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
								"AccoNonHotelLicencePersistenceImpl.fetchBygetJTB_ByApplicationId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AccoNonHotelLicence accoNonHotelLicence = list.get(0);

					result = accoNonHotelLicence;

					cacheResult(accoNonHotelLicence);
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
			return (AccoNonHotelLicence)result;
		}
	}

	/**
	 * Removes the acco non hotel licence where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the acco non hotel licence that was removed
	 */
	@Override
	public AccoNonHotelLicence removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAccoNonHotelLicenceException {

		AccoNonHotelLicence accoNonHotelLicence = findBygetJTB_ByApplicationId(
			jtbApplicationId);

		return remove(accoNonHotelLicence);
	}

	/**
	 * Returns the number of acco non hotel licences where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching acco non hotel licences
	 */
	@Override
	public int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJTB_ByApplicationId;

		Object[] finderArgs = new Object[] {jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACCONONHOTELLICENCE_WHERE);

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
			"accoNonHotelLicence.jtbApplicationId = ?";

	public AccoNonHotelLicencePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(AccoNonHotelLicence.class);

		setModelImplClass(AccoNonHotelLicenceImpl.class);
		setModelPKClass(long.class);

		setTable(AccoNonHotelLicenceTable.INSTANCE);
	}

	/**
	 * Caches the acco non hotel licence in the entity cache if it is enabled.
	 *
	 * @param accoNonHotelLicence the acco non hotel licence
	 */
	@Override
	public void cacheResult(AccoNonHotelLicence accoNonHotelLicence) {
		entityCache.putResult(
			AccoNonHotelLicenceImpl.class, accoNonHotelLicence.getPrimaryKey(),
			accoNonHotelLicence);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				accoNonHotelLicence.getUuid(), accoNonHotelLicence.getGroupId()
			},
			accoNonHotelLicence);

		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId,
			new Object[] {accoNonHotelLicence.getJtbApplicationId()},
			accoNonHotelLicence);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the acco non hotel licences in the entity cache if it is enabled.
	 *
	 * @param accoNonHotelLicences the acco non hotel licences
	 */
	@Override
	public void cacheResult(List<AccoNonHotelLicence> accoNonHotelLicences) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (accoNonHotelLicences.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AccoNonHotelLicence accoNonHotelLicence : accoNonHotelLicences) {
			if (entityCache.getResult(
					AccoNonHotelLicenceImpl.class,
					accoNonHotelLicence.getPrimaryKey()) == null) {

				cacheResult(accoNonHotelLicence);
			}
		}
	}

	/**
	 * Clears the cache for all acco non hotel licences.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AccoNonHotelLicenceImpl.class);

		finderCache.clearCache(AccoNonHotelLicenceImpl.class);
	}

	/**
	 * Clears the cache for the acco non hotel licence.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AccoNonHotelLicence accoNonHotelLicence) {
		entityCache.removeResult(
			AccoNonHotelLicenceImpl.class, accoNonHotelLicence);
	}

	@Override
	public void clearCache(List<AccoNonHotelLicence> accoNonHotelLicences) {
		for (AccoNonHotelLicence accoNonHotelLicence : accoNonHotelLicences) {
			entityCache.removeResult(
				AccoNonHotelLicenceImpl.class, accoNonHotelLicence);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AccoNonHotelLicenceImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AccoNonHotelLicenceImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AccoNonHotelLicenceModelImpl accoNonHotelLicenceModelImpl) {

		Object[] args = new Object[] {
			accoNonHotelLicenceModelImpl.getUuid(),
			accoNonHotelLicenceModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, accoNonHotelLicenceModelImpl);

		args = new Object[] {
			accoNonHotelLicenceModelImpl.getJtbApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetJTB_ByApplicationId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId, args,
			accoNonHotelLicenceModelImpl);
	}

	/**
	 * Creates a new acco non hotel licence with the primary key. Does not add the acco non hotel licence to the database.
	 *
	 * @param accoNonHotelLicenceId the primary key for the new acco non hotel licence
	 * @return the new acco non hotel licence
	 */
	@Override
	public AccoNonHotelLicence create(long accoNonHotelLicenceId) {
		AccoNonHotelLicence accoNonHotelLicence = new AccoNonHotelLicenceImpl();

		accoNonHotelLicence.setNew(true);
		accoNonHotelLicence.setPrimaryKey(accoNonHotelLicenceId);

		String uuid = PortalUUIDUtil.generate();

		accoNonHotelLicence.setUuid(uuid);

		accoNonHotelLicence.setCompanyId(CompanyThreadLocal.getCompanyId());

		return accoNonHotelLicence;
	}

	/**
	 * Removes the acco non hotel licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accoNonHotelLicenceId the primary key of the acco non hotel licence
	 * @return the acco non hotel licence that was removed
	 * @throws NoSuchAccoNonHotelLicenceException if a acco non hotel licence with the primary key could not be found
	 */
	@Override
	public AccoNonHotelLicence remove(long accoNonHotelLicenceId)
		throws NoSuchAccoNonHotelLicenceException {

		return remove((Serializable)accoNonHotelLicenceId);
	}

	/**
	 * Removes the acco non hotel licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the acco non hotel licence
	 * @return the acco non hotel licence that was removed
	 * @throws NoSuchAccoNonHotelLicenceException if a acco non hotel licence with the primary key could not be found
	 */
	@Override
	public AccoNonHotelLicence remove(Serializable primaryKey)
		throws NoSuchAccoNonHotelLicenceException {

		Session session = null;

		try {
			session = openSession();

			AccoNonHotelLicence accoNonHotelLicence =
				(AccoNonHotelLicence)session.get(
					AccoNonHotelLicenceImpl.class, primaryKey);

			if (accoNonHotelLicence == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAccoNonHotelLicenceException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(accoNonHotelLicence);
		}
		catch (NoSuchAccoNonHotelLicenceException noSuchEntityException) {
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
	protected AccoNonHotelLicence removeImpl(
		AccoNonHotelLicence accoNonHotelLicence) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(accoNonHotelLicence)) {
				accoNonHotelLicence = (AccoNonHotelLicence)session.get(
					AccoNonHotelLicenceImpl.class,
					accoNonHotelLicence.getPrimaryKeyObj());
			}

			if (accoNonHotelLicence != null) {
				session.delete(accoNonHotelLicence);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (accoNonHotelLicence != null) {
			clearCache(accoNonHotelLicence);
		}

		return accoNonHotelLicence;
	}

	@Override
	public AccoNonHotelLicence updateImpl(
		AccoNonHotelLicence accoNonHotelLicence) {

		boolean isNew = accoNonHotelLicence.isNew();

		if (!(accoNonHotelLicence instanceof AccoNonHotelLicenceModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(accoNonHotelLicence.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					accoNonHotelLicence);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in accoNonHotelLicence proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AccoNonHotelLicence implementation " +
					accoNonHotelLicence.getClass());
		}

		AccoNonHotelLicenceModelImpl accoNonHotelLicenceModelImpl =
			(AccoNonHotelLicenceModelImpl)accoNonHotelLicence;

		if (Validator.isNull(accoNonHotelLicence.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			accoNonHotelLicence.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (accoNonHotelLicence.getCreateDate() == null)) {
			if (serviceContext == null) {
				accoNonHotelLicence.setCreateDate(date);
			}
			else {
				accoNonHotelLicence.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!accoNonHotelLicenceModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				accoNonHotelLicence.setModifiedDate(date);
			}
			else {
				accoNonHotelLicence.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(accoNonHotelLicence);
			}
			else {
				accoNonHotelLicence = (AccoNonHotelLicence)session.merge(
					accoNonHotelLicence);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AccoNonHotelLicenceImpl.class, accoNonHotelLicenceModelImpl, false,
			true);

		cacheUniqueFindersCache(accoNonHotelLicenceModelImpl);

		if (isNew) {
			accoNonHotelLicence.setNew(false);
		}

		accoNonHotelLicence.resetOriginalValues();

		return accoNonHotelLicence;
	}

	/**
	 * Returns the acco non hotel licence with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the acco non hotel licence
	 * @return the acco non hotel licence
	 * @throws NoSuchAccoNonHotelLicenceException if a acco non hotel licence with the primary key could not be found
	 */
	@Override
	public AccoNonHotelLicence findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAccoNonHotelLicenceException {

		AccoNonHotelLicence accoNonHotelLicence = fetchByPrimaryKey(primaryKey);

		if (accoNonHotelLicence == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAccoNonHotelLicenceException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return accoNonHotelLicence;
	}

	/**
	 * Returns the acco non hotel licence with the primary key or throws a <code>NoSuchAccoNonHotelLicenceException</code> if it could not be found.
	 *
	 * @param accoNonHotelLicenceId the primary key of the acco non hotel licence
	 * @return the acco non hotel licence
	 * @throws NoSuchAccoNonHotelLicenceException if a acco non hotel licence with the primary key could not be found
	 */
	@Override
	public AccoNonHotelLicence findByPrimaryKey(long accoNonHotelLicenceId)
		throws NoSuchAccoNonHotelLicenceException {

		return findByPrimaryKey((Serializable)accoNonHotelLicenceId);
	}

	/**
	 * Returns the acco non hotel licence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accoNonHotelLicenceId the primary key of the acco non hotel licence
	 * @return the acco non hotel licence, or <code>null</code> if a acco non hotel licence with the primary key could not be found
	 */
	@Override
	public AccoNonHotelLicence fetchByPrimaryKey(long accoNonHotelLicenceId) {
		return fetchByPrimaryKey((Serializable)accoNonHotelLicenceId);
	}

	/**
	 * Returns all the acco non hotel licences.
	 *
	 * @return the acco non hotel licences
	 */
	@Override
	public List<AccoNonHotelLicence> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acco non hotel licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco non hotel licences
	 * @param end the upper bound of the range of acco non hotel licences (not inclusive)
	 * @return the range of acco non hotel licences
	 */
	@Override
	public List<AccoNonHotelLicence> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the acco non hotel licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco non hotel licences
	 * @param end the upper bound of the range of acco non hotel licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acco non hotel licences
	 */
	@Override
	public List<AccoNonHotelLicence> findAll(
		int start, int end,
		OrderByComparator<AccoNonHotelLicence> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acco non hotel licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco non hotel licences
	 * @param end the upper bound of the range of acco non hotel licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acco non hotel licences
	 */
	@Override
	public List<AccoNonHotelLicence> findAll(
		int start, int end,
		OrderByComparator<AccoNonHotelLicence> orderByComparator,
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

		List<AccoNonHotelLicence> list = null;

		if (useFinderCache) {
			list = (List<AccoNonHotelLicence>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ACCONONHOTELLICENCE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ACCONONHOTELLICENCE;

				sql = sql.concat(AccoNonHotelLicenceModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AccoNonHotelLicence>)QueryUtil.list(
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
	 * Removes all the acco non hotel licences from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AccoNonHotelLicence accoNonHotelLicence : findAll()) {
			remove(accoNonHotelLicence);
		}
	}

	/**
	 * Returns the number of acco non hotel licences.
	 *
	 * @return the number of acco non hotel licences
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
					_SQL_COUNT_ACCONONHOTELLICENCE);

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
		return "accoNonHotelLicenceId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ACCONONHOTELLICENCE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AccoNonHotelLicenceModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the acco non hotel licence persistence.
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

		AccoNonHotelLicenceUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AccoNonHotelLicenceUtil.setPersistence(null);

		entityCache.removeCache(AccoNonHotelLicenceImpl.class.getName());
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

	private static final String _SQL_SELECT_ACCONONHOTELLICENCE =
		"SELECT accoNonHotelLicence FROM AccoNonHotelLicence accoNonHotelLicence";

	private static final String _SQL_SELECT_ACCONONHOTELLICENCE_WHERE =
		"SELECT accoNonHotelLicence FROM AccoNonHotelLicence accoNonHotelLicence WHERE ";

	private static final String _SQL_COUNT_ACCONONHOTELLICENCE =
		"SELECT COUNT(accoNonHotelLicence) FROM AccoNonHotelLicence accoNonHotelLicence";

	private static final String _SQL_COUNT_ACCONONHOTELLICENCE_WHERE =
		"SELECT COUNT(accoNonHotelLicence) FROM AccoNonHotelLicence accoNonHotelLicence WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "accoNonHotelLicence.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AccoNonHotelLicence exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AccoNonHotelLicence exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AccoNonHotelLicencePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}