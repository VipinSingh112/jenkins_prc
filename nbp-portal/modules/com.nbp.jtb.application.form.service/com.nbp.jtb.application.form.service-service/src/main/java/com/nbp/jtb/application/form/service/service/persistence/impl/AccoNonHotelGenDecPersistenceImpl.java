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

import com.nbp.jtb.application.form.service.exception.NoSuchAccoNonHotelGenDecException;
import com.nbp.jtb.application.form.service.model.AccoNonHotelGenDec;
import com.nbp.jtb.application.form.service.model.AccoNonHotelGenDecTable;
import com.nbp.jtb.application.form.service.model.impl.AccoNonHotelGenDecImpl;
import com.nbp.jtb.application.form.service.model.impl.AccoNonHotelGenDecModelImpl;
import com.nbp.jtb.application.form.service.service.persistence.AccoNonHotelGenDecPersistence;
import com.nbp.jtb.application.form.service.service.persistence.AccoNonHotelGenDecUtil;
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
 * The persistence implementation for the acco non hotel gen dec service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AccoNonHotelGenDecPersistence.class)
public class AccoNonHotelGenDecPersistenceImpl
	extends BasePersistenceImpl<AccoNonHotelGenDec>
	implements AccoNonHotelGenDecPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AccoNonHotelGenDecUtil</code> to access the acco non hotel gen dec persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AccoNonHotelGenDecImpl.class.getName();

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
	 * Returns all the acco non hotel gen decs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acco non hotel gen decs
	 */
	@Override
	public List<AccoNonHotelGenDec> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acco non hotel gen decs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelGenDecModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco non hotel gen decs
	 * @param end the upper bound of the range of acco non hotel gen decs (not inclusive)
	 * @return the range of matching acco non hotel gen decs
	 */
	@Override
	public List<AccoNonHotelGenDec> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the acco non hotel gen decs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelGenDecModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco non hotel gen decs
	 * @param end the upper bound of the range of acco non hotel gen decs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acco non hotel gen decs
	 */
	@Override
	public List<AccoNonHotelGenDec> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccoNonHotelGenDec> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acco non hotel gen decs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelGenDecModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco non hotel gen decs
	 * @param end the upper bound of the range of acco non hotel gen decs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acco non hotel gen decs
	 */
	@Override
	public List<AccoNonHotelGenDec> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccoNonHotelGenDec> orderByComparator,
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

		List<AccoNonHotelGenDec> list = null;

		if (useFinderCache) {
			list = (List<AccoNonHotelGenDec>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AccoNonHotelGenDec accoNonHotelGenDec : list) {
					if (!uuid.equals(accoNonHotelGenDec.getUuid())) {
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

			sb.append(_SQL_SELECT_ACCONONHOTELGENDEC_WHERE);

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
				sb.append(AccoNonHotelGenDecModelImpl.ORDER_BY_JPQL);
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

				list = (List<AccoNonHotelGenDec>)QueryUtil.list(
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
	 * Returns the first acco non hotel gen dec in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco non hotel gen dec
	 * @throws NoSuchAccoNonHotelGenDecException if a matching acco non hotel gen dec could not be found
	 */
	@Override
	public AccoNonHotelGenDec findByUuid_First(
			String uuid,
			OrderByComparator<AccoNonHotelGenDec> orderByComparator)
		throws NoSuchAccoNonHotelGenDecException {

		AccoNonHotelGenDec accoNonHotelGenDec = fetchByUuid_First(
			uuid, orderByComparator);

		if (accoNonHotelGenDec != null) {
			return accoNonHotelGenDec;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAccoNonHotelGenDecException(sb.toString());
	}

	/**
	 * Returns the first acco non hotel gen dec in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco non hotel gen dec, or <code>null</code> if a matching acco non hotel gen dec could not be found
	 */
	@Override
	public AccoNonHotelGenDec fetchByUuid_First(
		String uuid, OrderByComparator<AccoNonHotelGenDec> orderByComparator) {

		List<AccoNonHotelGenDec> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last acco non hotel gen dec in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco non hotel gen dec
	 * @throws NoSuchAccoNonHotelGenDecException if a matching acco non hotel gen dec could not be found
	 */
	@Override
	public AccoNonHotelGenDec findByUuid_Last(
			String uuid,
			OrderByComparator<AccoNonHotelGenDec> orderByComparator)
		throws NoSuchAccoNonHotelGenDecException {

		AccoNonHotelGenDec accoNonHotelGenDec = fetchByUuid_Last(
			uuid, orderByComparator);

		if (accoNonHotelGenDec != null) {
			return accoNonHotelGenDec;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAccoNonHotelGenDecException(sb.toString());
	}

	/**
	 * Returns the last acco non hotel gen dec in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco non hotel gen dec, or <code>null</code> if a matching acco non hotel gen dec could not be found
	 */
	@Override
	public AccoNonHotelGenDec fetchByUuid_Last(
		String uuid, OrderByComparator<AccoNonHotelGenDec> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<AccoNonHotelGenDec> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the acco non hotel gen decs before and after the current acco non hotel gen dec in the ordered set where uuid = &#63;.
	 *
	 * @param accoNonHotelGenDecId the primary key of the current acco non hotel gen dec
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acco non hotel gen dec
	 * @throws NoSuchAccoNonHotelGenDecException if a acco non hotel gen dec with the primary key could not be found
	 */
	@Override
	public AccoNonHotelGenDec[] findByUuid_PrevAndNext(
			long accoNonHotelGenDecId, String uuid,
			OrderByComparator<AccoNonHotelGenDec> orderByComparator)
		throws NoSuchAccoNonHotelGenDecException {

		uuid = Objects.toString(uuid, "");

		AccoNonHotelGenDec accoNonHotelGenDec = findByPrimaryKey(
			accoNonHotelGenDecId);

		Session session = null;

		try {
			session = openSession();

			AccoNonHotelGenDec[] array = new AccoNonHotelGenDecImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, accoNonHotelGenDec, uuid, orderByComparator, true);

			array[1] = accoNonHotelGenDec;

			array[2] = getByUuid_PrevAndNext(
				session, accoNonHotelGenDec, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected AccoNonHotelGenDec getByUuid_PrevAndNext(
		Session session, AccoNonHotelGenDec accoNonHotelGenDec, String uuid,
		OrderByComparator<AccoNonHotelGenDec> orderByComparator,
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

		sb.append(_SQL_SELECT_ACCONONHOTELGENDEC_WHERE);

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
			sb.append(AccoNonHotelGenDecModelImpl.ORDER_BY_JPQL);
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
						accoNonHotelGenDec)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AccoNonHotelGenDec> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the acco non hotel gen decs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (AccoNonHotelGenDec accoNonHotelGenDec :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(accoNonHotelGenDec);
		}
	}

	/**
	 * Returns the number of acco non hotel gen decs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acco non hotel gen decs
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACCONONHOTELGENDEC_WHERE);

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
		"accoNonHotelGenDec.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(accoNonHotelGenDec.uuid IS NULL OR accoNonHotelGenDec.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the acco non hotel gen dec where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccoNonHotelGenDecException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acco non hotel gen dec
	 * @throws NoSuchAccoNonHotelGenDecException if a matching acco non hotel gen dec could not be found
	 */
	@Override
	public AccoNonHotelGenDec findByUUID_G(String uuid, long groupId)
		throws NoSuchAccoNonHotelGenDecException {

		AccoNonHotelGenDec accoNonHotelGenDec = fetchByUUID_G(uuid, groupId);

		if (accoNonHotelGenDec == null) {
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

			throw new NoSuchAccoNonHotelGenDecException(sb.toString());
		}

		return accoNonHotelGenDec;
	}

	/**
	 * Returns the acco non hotel gen dec where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acco non hotel gen dec, or <code>null</code> if a matching acco non hotel gen dec could not be found
	 */
	@Override
	public AccoNonHotelGenDec fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the acco non hotel gen dec where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acco non hotel gen dec, or <code>null</code> if a matching acco non hotel gen dec could not be found
	 */
	@Override
	public AccoNonHotelGenDec fetchByUUID_G(
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

		if (result instanceof AccoNonHotelGenDec) {
			AccoNonHotelGenDec accoNonHotelGenDec = (AccoNonHotelGenDec)result;

			if (!Objects.equals(uuid, accoNonHotelGenDec.getUuid()) ||
				(groupId != accoNonHotelGenDec.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_ACCONONHOTELGENDEC_WHERE);

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

				List<AccoNonHotelGenDec> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					AccoNonHotelGenDec accoNonHotelGenDec = list.get(0);

					result = accoNonHotelGenDec;

					cacheResult(accoNonHotelGenDec);
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
			return (AccoNonHotelGenDec)result;
		}
	}

	/**
	 * Removes the acco non hotel gen dec where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acco non hotel gen dec that was removed
	 */
	@Override
	public AccoNonHotelGenDec removeByUUID_G(String uuid, long groupId)
		throws NoSuchAccoNonHotelGenDecException {

		AccoNonHotelGenDec accoNonHotelGenDec = findByUUID_G(uuid, groupId);

		return remove(accoNonHotelGenDec);
	}

	/**
	 * Returns the number of acco non hotel gen decs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acco non hotel gen decs
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ACCONONHOTELGENDEC_WHERE);

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
		"accoNonHotelGenDec.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(accoNonHotelGenDec.uuid IS NULL OR accoNonHotelGenDec.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"accoNonHotelGenDec.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the acco non hotel gen decs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acco non hotel gen decs
	 */
	@Override
	public List<AccoNonHotelGenDec> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acco non hotel gen decs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelGenDecModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco non hotel gen decs
	 * @param end the upper bound of the range of acco non hotel gen decs (not inclusive)
	 * @return the range of matching acco non hotel gen decs
	 */
	@Override
	public List<AccoNonHotelGenDec> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the acco non hotel gen decs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelGenDecModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco non hotel gen decs
	 * @param end the upper bound of the range of acco non hotel gen decs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acco non hotel gen decs
	 */
	@Override
	public List<AccoNonHotelGenDec> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccoNonHotelGenDec> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acco non hotel gen decs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelGenDecModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco non hotel gen decs
	 * @param end the upper bound of the range of acco non hotel gen decs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acco non hotel gen decs
	 */
	@Override
	public List<AccoNonHotelGenDec> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccoNonHotelGenDec> orderByComparator,
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

		List<AccoNonHotelGenDec> list = null;

		if (useFinderCache) {
			list = (List<AccoNonHotelGenDec>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AccoNonHotelGenDec accoNonHotelGenDec : list) {
					if (!uuid.equals(accoNonHotelGenDec.getUuid()) ||
						(companyId != accoNonHotelGenDec.getCompanyId())) {

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

			sb.append(_SQL_SELECT_ACCONONHOTELGENDEC_WHERE);

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
				sb.append(AccoNonHotelGenDecModelImpl.ORDER_BY_JPQL);
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

				list = (List<AccoNonHotelGenDec>)QueryUtil.list(
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
	 * Returns the first acco non hotel gen dec in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco non hotel gen dec
	 * @throws NoSuchAccoNonHotelGenDecException if a matching acco non hotel gen dec could not be found
	 */
	@Override
	public AccoNonHotelGenDec findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<AccoNonHotelGenDec> orderByComparator)
		throws NoSuchAccoNonHotelGenDecException {

		AccoNonHotelGenDec accoNonHotelGenDec = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (accoNonHotelGenDec != null) {
			return accoNonHotelGenDec;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchAccoNonHotelGenDecException(sb.toString());
	}

	/**
	 * Returns the first acco non hotel gen dec in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco non hotel gen dec, or <code>null</code> if a matching acco non hotel gen dec could not be found
	 */
	@Override
	public AccoNonHotelGenDec fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<AccoNonHotelGenDec> orderByComparator) {

		List<AccoNonHotelGenDec> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last acco non hotel gen dec in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco non hotel gen dec
	 * @throws NoSuchAccoNonHotelGenDecException if a matching acco non hotel gen dec could not be found
	 */
	@Override
	public AccoNonHotelGenDec findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<AccoNonHotelGenDec> orderByComparator)
		throws NoSuchAccoNonHotelGenDecException {

		AccoNonHotelGenDec accoNonHotelGenDec = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (accoNonHotelGenDec != null) {
			return accoNonHotelGenDec;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchAccoNonHotelGenDecException(sb.toString());
	}

	/**
	 * Returns the last acco non hotel gen dec in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco non hotel gen dec, or <code>null</code> if a matching acco non hotel gen dec could not be found
	 */
	@Override
	public AccoNonHotelGenDec fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<AccoNonHotelGenDec> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<AccoNonHotelGenDec> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the acco non hotel gen decs before and after the current acco non hotel gen dec in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accoNonHotelGenDecId the primary key of the current acco non hotel gen dec
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acco non hotel gen dec
	 * @throws NoSuchAccoNonHotelGenDecException if a acco non hotel gen dec with the primary key could not be found
	 */
	@Override
	public AccoNonHotelGenDec[] findByUuid_C_PrevAndNext(
			long accoNonHotelGenDecId, String uuid, long companyId,
			OrderByComparator<AccoNonHotelGenDec> orderByComparator)
		throws NoSuchAccoNonHotelGenDecException {

		uuid = Objects.toString(uuid, "");

		AccoNonHotelGenDec accoNonHotelGenDec = findByPrimaryKey(
			accoNonHotelGenDecId);

		Session session = null;

		try {
			session = openSession();

			AccoNonHotelGenDec[] array = new AccoNonHotelGenDecImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, accoNonHotelGenDec, uuid, companyId, orderByComparator,
				true);

			array[1] = accoNonHotelGenDec;

			array[2] = getByUuid_C_PrevAndNext(
				session, accoNonHotelGenDec, uuid, companyId, orderByComparator,
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

	protected AccoNonHotelGenDec getByUuid_C_PrevAndNext(
		Session session, AccoNonHotelGenDec accoNonHotelGenDec, String uuid,
		long companyId, OrderByComparator<AccoNonHotelGenDec> orderByComparator,
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

		sb.append(_SQL_SELECT_ACCONONHOTELGENDEC_WHERE);

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
			sb.append(AccoNonHotelGenDecModelImpl.ORDER_BY_JPQL);
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
						accoNonHotelGenDec)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AccoNonHotelGenDec> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the acco non hotel gen decs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (AccoNonHotelGenDec accoNonHotelGenDec :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(accoNonHotelGenDec);
		}
	}

	/**
	 * Returns the number of acco non hotel gen decs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acco non hotel gen decs
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ACCONONHOTELGENDEC_WHERE);

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
		"accoNonHotelGenDec.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(accoNonHotelGenDec.uuid IS NULL OR accoNonHotelGenDec.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"accoNonHotelGenDec.companyId = ?";

	private FinderPath _finderPathFetchBygetJTB_ByApplicationId;
	private FinderPath _finderPathCountBygetJTB_ByApplicationId;

	/**
	 * Returns the acco non hotel gen dec where jtbApplicationId = &#63; or throws a <code>NoSuchAccoNonHotelGenDecException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching acco non hotel gen dec
	 * @throws NoSuchAccoNonHotelGenDecException if a matching acco non hotel gen dec could not be found
	 */
	@Override
	public AccoNonHotelGenDec findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAccoNonHotelGenDecException {

		AccoNonHotelGenDec accoNonHotelGenDec = fetchBygetJTB_ByApplicationId(
			jtbApplicationId);

		if (accoNonHotelGenDec == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jtbApplicationId=");
			sb.append(jtbApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAccoNonHotelGenDecException(sb.toString());
		}

		return accoNonHotelGenDec;
	}

	/**
	 * Returns the acco non hotel gen dec where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching acco non hotel gen dec, or <code>null</code> if a matching acco non hotel gen dec could not be found
	 */
	@Override
	public AccoNonHotelGenDec fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return fetchBygetJTB_ByApplicationId(jtbApplicationId, true);
	}

	/**
	 * Returns the acco non hotel gen dec where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acco non hotel gen dec, or <code>null</code> if a matching acco non hotel gen dec could not be found
	 */
	@Override
	public AccoNonHotelGenDec fetchBygetJTB_ByApplicationId(
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

		if (result instanceof AccoNonHotelGenDec) {
			AccoNonHotelGenDec accoNonHotelGenDec = (AccoNonHotelGenDec)result;

			if (jtbApplicationId != accoNonHotelGenDec.getJtbApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ACCONONHOTELGENDEC_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				List<AccoNonHotelGenDec> list = query.list();

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
								"AccoNonHotelGenDecPersistenceImpl.fetchBygetJTB_ByApplicationId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AccoNonHotelGenDec accoNonHotelGenDec = list.get(0);

					result = accoNonHotelGenDec;

					cacheResult(accoNonHotelGenDec);
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
			return (AccoNonHotelGenDec)result;
		}
	}

	/**
	 * Removes the acco non hotel gen dec where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the acco non hotel gen dec that was removed
	 */
	@Override
	public AccoNonHotelGenDec removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAccoNonHotelGenDecException {

		AccoNonHotelGenDec accoNonHotelGenDec = findBygetJTB_ByApplicationId(
			jtbApplicationId);

		return remove(accoNonHotelGenDec);
	}

	/**
	 * Returns the number of acco non hotel gen decs where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching acco non hotel gen decs
	 */
	@Override
	public int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJTB_ByApplicationId;

		Object[] finderArgs = new Object[] {jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACCONONHOTELGENDEC_WHERE);

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
			"accoNonHotelGenDec.jtbApplicationId = ?";

	public AccoNonHotelGenDecPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(AccoNonHotelGenDec.class);

		setModelImplClass(AccoNonHotelGenDecImpl.class);
		setModelPKClass(long.class);

		setTable(AccoNonHotelGenDecTable.INSTANCE);
	}

	/**
	 * Caches the acco non hotel gen dec in the entity cache if it is enabled.
	 *
	 * @param accoNonHotelGenDec the acco non hotel gen dec
	 */
	@Override
	public void cacheResult(AccoNonHotelGenDec accoNonHotelGenDec) {
		entityCache.putResult(
			AccoNonHotelGenDecImpl.class, accoNonHotelGenDec.getPrimaryKey(),
			accoNonHotelGenDec);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				accoNonHotelGenDec.getUuid(), accoNonHotelGenDec.getGroupId()
			},
			accoNonHotelGenDec);

		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId,
			new Object[] {accoNonHotelGenDec.getJtbApplicationId()},
			accoNonHotelGenDec);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the acco non hotel gen decs in the entity cache if it is enabled.
	 *
	 * @param accoNonHotelGenDecs the acco non hotel gen decs
	 */
	@Override
	public void cacheResult(List<AccoNonHotelGenDec> accoNonHotelGenDecs) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (accoNonHotelGenDecs.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AccoNonHotelGenDec accoNonHotelGenDec : accoNonHotelGenDecs) {
			if (entityCache.getResult(
					AccoNonHotelGenDecImpl.class,
					accoNonHotelGenDec.getPrimaryKey()) == null) {

				cacheResult(accoNonHotelGenDec);
			}
		}
	}

	/**
	 * Clears the cache for all acco non hotel gen decs.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AccoNonHotelGenDecImpl.class);

		finderCache.clearCache(AccoNonHotelGenDecImpl.class);
	}

	/**
	 * Clears the cache for the acco non hotel gen dec.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AccoNonHotelGenDec accoNonHotelGenDec) {
		entityCache.removeResult(
			AccoNonHotelGenDecImpl.class, accoNonHotelGenDec);
	}

	@Override
	public void clearCache(List<AccoNonHotelGenDec> accoNonHotelGenDecs) {
		for (AccoNonHotelGenDec accoNonHotelGenDec : accoNonHotelGenDecs) {
			entityCache.removeResult(
				AccoNonHotelGenDecImpl.class, accoNonHotelGenDec);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AccoNonHotelGenDecImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AccoNonHotelGenDecImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AccoNonHotelGenDecModelImpl accoNonHotelGenDecModelImpl) {

		Object[] args = new Object[] {
			accoNonHotelGenDecModelImpl.getUuid(),
			accoNonHotelGenDecModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, accoNonHotelGenDecModelImpl);

		args = new Object[] {accoNonHotelGenDecModelImpl.getJtbApplicationId()};

		finderCache.putResult(
			_finderPathCountBygetJTB_ByApplicationId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId, args,
			accoNonHotelGenDecModelImpl);
	}

	/**
	 * Creates a new acco non hotel gen dec with the primary key. Does not add the acco non hotel gen dec to the database.
	 *
	 * @param accoNonHotelGenDecId the primary key for the new acco non hotel gen dec
	 * @return the new acco non hotel gen dec
	 */
	@Override
	public AccoNonHotelGenDec create(long accoNonHotelGenDecId) {
		AccoNonHotelGenDec accoNonHotelGenDec = new AccoNonHotelGenDecImpl();

		accoNonHotelGenDec.setNew(true);
		accoNonHotelGenDec.setPrimaryKey(accoNonHotelGenDecId);

		String uuid = PortalUUIDUtil.generate();

		accoNonHotelGenDec.setUuid(uuid);

		accoNonHotelGenDec.setCompanyId(CompanyThreadLocal.getCompanyId());

		return accoNonHotelGenDec;
	}

	/**
	 * Removes the acco non hotel gen dec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accoNonHotelGenDecId the primary key of the acco non hotel gen dec
	 * @return the acco non hotel gen dec that was removed
	 * @throws NoSuchAccoNonHotelGenDecException if a acco non hotel gen dec with the primary key could not be found
	 */
	@Override
	public AccoNonHotelGenDec remove(long accoNonHotelGenDecId)
		throws NoSuchAccoNonHotelGenDecException {

		return remove((Serializable)accoNonHotelGenDecId);
	}

	/**
	 * Removes the acco non hotel gen dec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the acco non hotel gen dec
	 * @return the acco non hotel gen dec that was removed
	 * @throws NoSuchAccoNonHotelGenDecException if a acco non hotel gen dec with the primary key could not be found
	 */
	@Override
	public AccoNonHotelGenDec remove(Serializable primaryKey)
		throws NoSuchAccoNonHotelGenDecException {

		Session session = null;

		try {
			session = openSession();

			AccoNonHotelGenDec accoNonHotelGenDec =
				(AccoNonHotelGenDec)session.get(
					AccoNonHotelGenDecImpl.class, primaryKey);

			if (accoNonHotelGenDec == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAccoNonHotelGenDecException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(accoNonHotelGenDec);
		}
		catch (NoSuchAccoNonHotelGenDecException noSuchEntityException) {
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
	protected AccoNonHotelGenDec removeImpl(
		AccoNonHotelGenDec accoNonHotelGenDec) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(accoNonHotelGenDec)) {
				accoNonHotelGenDec = (AccoNonHotelGenDec)session.get(
					AccoNonHotelGenDecImpl.class,
					accoNonHotelGenDec.getPrimaryKeyObj());
			}

			if (accoNonHotelGenDec != null) {
				session.delete(accoNonHotelGenDec);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (accoNonHotelGenDec != null) {
			clearCache(accoNonHotelGenDec);
		}

		return accoNonHotelGenDec;
	}

	@Override
	public AccoNonHotelGenDec updateImpl(
		AccoNonHotelGenDec accoNonHotelGenDec) {

		boolean isNew = accoNonHotelGenDec.isNew();

		if (!(accoNonHotelGenDec instanceof AccoNonHotelGenDecModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(accoNonHotelGenDec.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					accoNonHotelGenDec);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in accoNonHotelGenDec proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AccoNonHotelGenDec implementation " +
					accoNonHotelGenDec.getClass());
		}

		AccoNonHotelGenDecModelImpl accoNonHotelGenDecModelImpl =
			(AccoNonHotelGenDecModelImpl)accoNonHotelGenDec;

		if (Validator.isNull(accoNonHotelGenDec.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			accoNonHotelGenDec.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (accoNonHotelGenDec.getCreateDate() == null)) {
			if (serviceContext == null) {
				accoNonHotelGenDec.setCreateDate(date);
			}
			else {
				accoNonHotelGenDec.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!accoNonHotelGenDecModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				accoNonHotelGenDec.setModifiedDate(date);
			}
			else {
				accoNonHotelGenDec.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(accoNonHotelGenDec);
			}
			else {
				accoNonHotelGenDec = (AccoNonHotelGenDec)session.merge(
					accoNonHotelGenDec);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AccoNonHotelGenDecImpl.class, accoNonHotelGenDecModelImpl, false,
			true);

		cacheUniqueFindersCache(accoNonHotelGenDecModelImpl);

		if (isNew) {
			accoNonHotelGenDec.setNew(false);
		}

		accoNonHotelGenDec.resetOriginalValues();

		return accoNonHotelGenDec;
	}

	/**
	 * Returns the acco non hotel gen dec with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the acco non hotel gen dec
	 * @return the acco non hotel gen dec
	 * @throws NoSuchAccoNonHotelGenDecException if a acco non hotel gen dec with the primary key could not be found
	 */
	@Override
	public AccoNonHotelGenDec findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAccoNonHotelGenDecException {

		AccoNonHotelGenDec accoNonHotelGenDec = fetchByPrimaryKey(primaryKey);

		if (accoNonHotelGenDec == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAccoNonHotelGenDecException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return accoNonHotelGenDec;
	}

	/**
	 * Returns the acco non hotel gen dec with the primary key or throws a <code>NoSuchAccoNonHotelGenDecException</code> if it could not be found.
	 *
	 * @param accoNonHotelGenDecId the primary key of the acco non hotel gen dec
	 * @return the acco non hotel gen dec
	 * @throws NoSuchAccoNonHotelGenDecException if a acco non hotel gen dec with the primary key could not be found
	 */
	@Override
	public AccoNonHotelGenDec findByPrimaryKey(long accoNonHotelGenDecId)
		throws NoSuchAccoNonHotelGenDecException {

		return findByPrimaryKey((Serializable)accoNonHotelGenDecId);
	}

	/**
	 * Returns the acco non hotel gen dec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accoNonHotelGenDecId the primary key of the acco non hotel gen dec
	 * @return the acco non hotel gen dec, or <code>null</code> if a acco non hotel gen dec with the primary key could not be found
	 */
	@Override
	public AccoNonHotelGenDec fetchByPrimaryKey(long accoNonHotelGenDecId) {
		return fetchByPrimaryKey((Serializable)accoNonHotelGenDecId);
	}

	/**
	 * Returns all the acco non hotel gen decs.
	 *
	 * @return the acco non hotel gen decs
	 */
	@Override
	public List<AccoNonHotelGenDec> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acco non hotel gen decs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelGenDecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco non hotel gen decs
	 * @param end the upper bound of the range of acco non hotel gen decs (not inclusive)
	 * @return the range of acco non hotel gen decs
	 */
	@Override
	public List<AccoNonHotelGenDec> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the acco non hotel gen decs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelGenDecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco non hotel gen decs
	 * @param end the upper bound of the range of acco non hotel gen decs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acco non hotel gen decs
	 */
	@Override
	public List<AccoNonHotelGenDec> findAll(
		int start, int end,
		OrderByComparator<AccoNonHotelGenDec> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acco non hotel gen decs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelGenDecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco non hotel gen decs
	 * @param end the upper bound of the range of acco non hotel gen decs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acco non hotel gen decs
	 */
	@Override
	public List<AccoNonHotelGenDec> findAll(
		int start, int end,
		OrderByComparator<AccoNonHotelGenDec> orderByComparator,
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

		List<AccoNonHotelGenDec> list = null;

		if (useFinderCache) {
			list = (List<AccoNonHotelGenDec>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ACCONONHOTELGENDEC);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ACCONONHOTELGENDEC;

				sql = sql.concat(AccoNonHotelGenDecModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AccoNonHotelGenDec>)QueryUtil.list(
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
	 * Removes all the acco non hotel gen decs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AccoNonHotelGenDec accoNonHotelGenDec : findAll()) {
			remove(accoNonHotelGenDec);
		}
	}

	/**
	 * Returns the number of acco non hotel gen decs.
	 *
	 * @return the number of acco non hotel gen decs
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
					_SQL_COUNT_ACCONONHOTELGENDEC);

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
		return "accoNonHotelGenDecId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ACCONONHOTELGENDEC;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AccoNonHotelGenDecModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the acco non hotel gen dec persistence.
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

		AccoNonHotelGenDecUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AccoNonHotelGenDecUtil.setPersistence(null);

		entityCache.removeCache(AccoNonHotelGenDecImpl.class.getName());
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

	private static final String _SQL_SELECT_ACCONONHOTELGENDEC =
		"SELECT accoNonHotelGenDec FROM AccoNonHotelGenDec accoNonHotelGenDec";

	private static final String _SQL_SELECT_ACCONONHOTELGENDEC_WHERE =
		"SELECT accoNonHotelGenDec FROM AccoNonHotelGenDec accoNonHotelGenDec WHERE ";

	private static final String _SQL_COUNT_ACCONONHOTELGENDEC =
		"SELECT COUNT(accoNonHotelGenDec) FROM AccoNonHotelGenDec accoNonHotelGenDec";

	private static final String _SQL_COUNT_ACCONONHOTELGENDEC_WHERE =
		"SELECT COUNT(accoNonHotelGenDec) FROM AccoNonHotelGenDec accoNonHotelGenDec WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "accoNonHotelGenDec.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AccoNonHotelGenDec exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AccoNonHotelGenDec exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AccoNonHotelGenDecPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}