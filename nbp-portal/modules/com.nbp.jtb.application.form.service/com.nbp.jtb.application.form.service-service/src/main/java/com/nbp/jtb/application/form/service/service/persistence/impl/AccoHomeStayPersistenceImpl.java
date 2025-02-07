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

import com.nbp.jtb.application.form.service.exception.NoSuchAccoHomeStayException;
import com.nbp.jtb.application.form.service.model.AccoHomeStay;
import com.nbp.jtb.application.form.service.model.AccoHomeStayTable;
import com.nbp.jtb.application.form.service.model.impl.AccoHomeStayImpl;
import com.nbp.jtb.application.form.service.model.impl.AccoHomeStayModelImpl;
import com.nbp.jtb.application.form.service.service.persistence.AccoHomeStayPersistence;
import com.nbp.jtb.application.form.service.service.persistence.AccoHomeStayUtil;
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
 * The persistence implementation for the acco home stay service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AccoHomeStayPersistence.class)
public class AccoHomeStayPersistenceImpl
	extends BasePersistenceImpl<AccoHomeStay>
	implements AccoHomeStayPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AccoHomeStayUtil</code> to access the acco home stay persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AccoHomeStayImpl.class.getName();

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
	 * Returns all the acco home stays where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acco home stays
	 */
	@Override
	public List<AccoHomeStay> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acco home stays where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHomeStayModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco home stays
	 * @param end the upper bound of the range of acco home stays (not inclusive)
	 * @return the range of matching acco home stays
	 */
	@Override
	public List<AccoHomeStay> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the acco home stays where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHomeStayModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco home stays
	 * @param end the upper bound of the range of acco home stays (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acco home stays
	 */
	@Override
	public List<AccoHomeStay> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccoHomeStay> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acco home stays where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHomeStayModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco home stays
	 * @param end the upper bound of the range of acco home stays (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acco home stays
	 */
	@Override
	public List<AccoHomeStay> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccoHomeStay> orderByComparator,
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

		List<AccoHomeStay> list = null;

		if (useFinderCache) {
			list = (List<AccoHomeStay>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AccoHomeStay accoHomeStay : list) {
					if (!uuid.equals(accoHomeStay.getUuid())) {
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

			sb.append(_SQL_SELECT_ACCOHOMESTAY_WHERE);

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
				sb.append(AccoHomeStayModelImpl.ORDER_BY_JPQL);
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

				list = (List<AccoHomeStay>)QueryUtil.list(
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
	 * Returns the first acco home stay in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco home stay
	 * @throws NoSuchAccoHomeStayException if a matching acco home stay could not be found
	 */
	@Override
	public AccoHomeStay findByUuid_First(
			String uuid, OrderByComparator<AccoHomeStay> orderByComparator)
		throws NoSuchAccoHomeStayException {

		AccoHomeStay accoHomeStay = fetchByUuid_First(uuid, orderByComparator);

		if (accoHomeStay != null) {
			return accoHomeStay;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAccoHomeStayException(sb.toString());
	}

	/**
	 * Returns the first acco home stay in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco home stay, or <code>null</code> if a matching acco home stay could not be found
	 */
	@Override
	public AccoHomeStay fetchByUuid_First(
		String uuid, OrderByComparator<AccoHomeStay> orderByComparator) {

		List<AccoHomeStay> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last acco home stay in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco home stay
	 * @throws NoSuchAccoHomeStayException if a matching acco home stay could not be found
	 */
	@Override
	public AccoHomeStay findByUuid_Last(
			String uuid, OrderByComparator<AccoHomeStay> orderByComparator)
		throws NoSuchAccoHomeStayException {

		AccoHomeStay accoHomeStay = fetchByUuid_Last(uuid, orderByComparator);

		if (accoHomeStay != null) {
			return accoHomeStay;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAccoHomeStayException(sb.toString());
	}

	/**
	 * Returns the last acco home stay in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco home stay, or <code>null</code> if a matching acco home stay could not be found
	 */
	@Override
	public AccoHomeStay fetchByUuid_Last(
		String uuid, OrderByComparator<AccoHomeStay> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<AccoHomeStay> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the acco home stays before and after the current acco home stay in the ordered set where uuid = &#63;.
	 *
	 * @param accoHomeStayId the primary key of the current acco home stay
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acco home stay
	 * @throws NoSuchAccoHomeStayException if a acco home stay with the primary key could not be found
	 */
	@Override
	public AccoHomeStay[] findByUuid_PrevAndNext(
			long accoHomeStayId, String uuid,
			OrderByComparator<AccoHomeStay> orderByComparator)
		throws NoSuchAccoHomeStayException {

		uuid = Objects.toString(uuid, "");

		AccoHomeStay accoHomeStay = findByPrimaryKey(accoHomeStayId);

		Session session = null;

		try {
			session = openSession();

			AccoHomeStay[] array = new AccoHomeStayImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, accoHomeStay, uuid, orderByComparator, true);

			array[1] = accoHomeStay;

			array[2] = getByUuid_PrevAndNext(
				session, accoHomeStay, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected AccoHomeStay getByUuid_PrevAndNext(
		Session session, AccoHomeStay accoHomeStay, String uuid,
		OrderByComparator<AccoHomeStay> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_ACCOHOMESTAY_WHERE);

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
			sb.append(AccoHomeStayModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(accoHomeStay)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AccoHomeStay> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the acco home stays where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (AccoHomeStay accoHomeStay :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(accoHomeStay);
		}
	}

	/**
	 * Returns the number of acco home stays where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acco home stays
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACCOHOMESTAY_WHERE);

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
		"accoHomeStay.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(accoHomeStay.uuid IS NULL OR accoHomeStay.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the acco home stay where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccoHomeStayException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acco home stay
	 * @throws NoSuchAccoHomeStayException if a matching acco home stay could not be found
	 */
	@Override
	public AccoHomeStay findByUUID_G(String uuid, long groupId)
		throws NoSuchAccoHomeStayException {

		AccoHomeStay accoHomeStay = fetchByUUID_G(uuid, groupId);

		if (accoHomeStay == null) {
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

			throw new NoSuchAccoHomeStayException(sb.toString());
		}

		return accoHomeStay;
	}

	/**
	 * Returns the acco home stay where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acco home stay, or <code>null</code> if a matching acco home stay could not be found
	 */
	@Override
	public AccoHomeStay fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the acco home stay where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acco home stay, or <code>null</code> if a matching acco home stay could not be found
	 */
	@Override
	public AccoHomeStay fetchByUUID_G(
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

		if (result instanceof AccoHomeStay) {
			AccoHomeStay accoHomeStay = (AccoHomeStay)result;

			if (!Objects.equals(uuid, accoHomeStay.getUuid()) ||
				(groupId != accoHomeStay.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_ACCOHOMESTAY_WHERE);

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

				List<AccoHomeStay> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					AccoHomeStay accoHomeStay = list.get(0);

					result = accoHomeStay;

					cacheResult(accoHomeStay);
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
			return (AccoHomeStay)result;
		}
	}

	/**
	 * Removes the acco home stay where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acco home stay that was removed
	 */
	@Override
	public AccoHomeStay removeByUUID_G(String uuid, long groupId)
		throws NoSuchAccoHomeStayException {

		AccoHomeStay accoHomeStay = findByUUID_G(uuid, groupId);

		return remove(accoHomeStay);
	}

	/**
	 * Returns the number of acco home stays where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acco home stays
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ACCOHOMESTAY_WHERE);

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
		"accoHomeStay.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(accoHomeStay.uuid IS NULL OR accoHomeStay.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"accoHomeStay.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the acco home stays where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acco home stays
	 */
	@Override
	public List<AccoHomeStay> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acco home stays where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHomeStayModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco home stays
	 * @param end the upper bound of the range of acco home stays (not inclusive)
	 * @return the range of matching acco home stays
	 */
	@Override
	public List<AccoHomeStay> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the acco home stays where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHomeStayModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco home stays
	 * @param end the upper bound of the range of acco home stays (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acco home stays
	 */
	@Override
	public List<AccoHomeStay> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccoHomeStay> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acco home stays where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHomeStayModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco home stays
	 * @param end the upper bound of the range of acco home stays (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acco home stays
	 */
	@Override
	public List<AccoHomeStay> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccoHomeStay> orderByComparator,
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

		List<AccoHomeStay> list = null;

		if (useFinderCache) {
			list = (List<AccoHomeStay>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AccoHomeStay accoHomeStay : list) {
					if (!uuid.equals(accoHomeStay.getUuid()) ||
						(companyId != accoHomeStay.getCompanyId())) {

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

			sb.append(_SQL_SELECT_ACCOHOMESTAY_WHERE);

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
				sb.append(AccoHomeStayModelImpl.ORDER_BY_JPQL);
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

				list = (List<AccoHomeStay>)QueryUtil.list(
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
	 * Returns the first acco home stay in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco home stay
	 * @throws NoSuchAccoHomeStayException if a matching acco home stay could not be found
	 */
	@Override
	public AccoHomeStay findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<AccoHomeStay> orderByComparator)
		throws NoSuchAccoHomeStayException {

		AccoHomeStay accoHomeStay = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (accoHomeStay != null) {
			return accoHomeStay;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchAccoHomeStayException(sb.toString());
	}

	/**
	 * Returns the first acco home stay in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco home stay, or <code>null</code> if a matching acco home stay could not be found
	 */
	@Override
	public AccoHomeStay fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<AccoHomeStay> orderByComparator) {

		List<AccoHomeStay> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last acco home stay in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco home stay
	 * @throws NoSuchAccoHomeStayException if a matching acco home stay could not be found
	 */
	@Override
	public AccoHomeStay findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<AccoHomeStay> orderByComparator)
		throws NoSuchAccoHomeStayException {

		AccoHomeStay accoHomeStay = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (accoHomeStay != null) {
			return accoHomeStay;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchAccoHomeStayException(sb.toString());
	}

	/**
	 * Returns the last acco home stay in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco home stay, or <code>null</code> if a matching acco home stay could not be found
	 */
	@Override
	public AccoHomeStay fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<AccoHomeStay> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<AccoHomeStay> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the acco home stays before and after the current acco home stay in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accoHomeStayId the primary key of the current acco home stay
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acco home stay
	 * @throws NoSuchAccoHomeStayException if a acco home stay with the primary key could not be found
	 */
	@Override
	public AccoHomeStay[] findByUuid_C_PrevAndNext(
			long accoHomeStayId, String uuid, long companyId,
			OrderByComparator<AccoHomeStay> orderByComparator)
		throws NoSuchAccoHomeStayException {

		uuid = Objects.toString(uuid, "");

		AccoHomeStay accoHomeStay = findByPrimaryKey(accoHomeStayId);

		Session session = null;

		try {
			session = openSession();

			AccoHomeStay[] array = new AccoHomeStayImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, accoHomeStay, uuid, companyId, orderByComparator,
				true);

			array[1] = accoHomeStay;

			array[2] = getByUuid_C_PrevAndNext(
				session, accoHomeStay, uuid, companyId, orderByComparator,
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

	protected AccoHomeStay getByUuid_C_PrevAndNext(
		Session session, AccoHomeStay accoHomeStay, String uuid, long companyId,
		OrderByComparator<AccoHomeStay> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_ACCOHOMESTAY_WHERE);

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
			sb.append(AccoHomeStayModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(accoHomeStay)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AccoHomeStay> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the acco home stays where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (AccoHomeStay accoHomeStay :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(accoHomeStay);
		}
	}

	/**
	 * Returns the number of acco home stays where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acco home stays
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ACCOHOMESTAY_WHERE);

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
		"accoHomeStay.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(accoHomeStay.uuid IS NULL OR accoHomeStay.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"accoHomeStay.companyId = ?";

	private FinderPath _finderPathFetchBygetJTB_ByApplicationId;
	private FinderPath _finderPathCountBygetJTB_ByApplicationId;

	/**
	 * Returns the acco home stay where jtbApplicationId = &#63; or throws a <code>NoSuchAccoHomeStayException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching acco home stay
	 * @throws NoSuchAccoHomeStayException if a matching acco home stay could not be found
	 */
	@Override
	public AccoHomeStay findBygetJTB_ByApplicationId(long jtbApplicationId)
		throws NoSuchAccoHomeStayException {

		AccoHomeStay accoHomeStay = fetchBygetJTB_ByApplicationId(
			jtbApplicationId);

		if (accoHomeStay == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jtbApplicationId=");
			sb.append(jtbApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAccoHomeStayException(sb.toString());
		}

		return accoHomeStay;
	}

	/**
	 * Returns the acco home stay where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching acco home stay, or <code>null</code> if a matching acco home stay could not be found
	 */
	@Override
	public AccoHomeStay fetchBygetJTB_ByApplicationId(long jtbApplicationId) {
		return fetchBygetJTB_ByApplicationId(jtbApplicationId, true);
	}

	/**
	 * Returns the acco home stay where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acco home stay, or <code>null</code> if a matching acco home stay could not be found
	 */
	@Override
	public AccoHomeStay fetchBygetJTB_ByApplicationId(
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

		if (result instanceof AccoHomeStay) {
			AccoHomeStay accoHomeStay = (AccoHomeStay)result;

			if (jtbApplicationId != accoHomeStay.getJtbApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ACCOHOMESTAY_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				List<AccoHomeStay> list = query.list();

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
								"AccoHomeStayPersistenceImpl.fetchBygetJTB_ByApplicationId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AccoHomeStay accoHomeStay = list.get(0);

					result = accoHomeStay;

					cacheResult(accoHomeStay);
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
			return (AccoHomeStay)result;
		}
	}

	/**
	 * Removes the acco home stay where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the acco home stay that was removed
	 */
	@Override
	public AccoHomeStay removeBygetJTB_ByApplicationId(long jtbApplicationId)
		throws NoSuchAccoHomeStayException {

		AccoHomeStay accoHomeStay = findBygetJTB_ByApplicationId(
			jtbApplicationId);

		return remove(accoHomeStay);
	}

	/**
	 * Returns the number of acco home stays where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching acco home stays
	 */
	@Override
	public int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJTB_ByApplicationId;

		Object[] finderArgs = new Object[] {jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACCOHOMESTAY_WHERE);

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
			"accoHomeStay.jtbApplicationId = ?";

	public AccoHomeStayPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(AccoHomeStay.class);

		setModelImplClass(AccoHomeStayImpl.class);
		setModelPKClass(long.class);

		setTable(AccoHomeStayTable.INSTANCE);
	}

	/**
	 * Caches the acco home stay in the entity cache if it is enabled.
	 *
	 * @param accoHomeStay the acco home stay
	 */
	@Override
	public void cacheResult(AccoHomeStay accoHomeStay) {
		entityCache.putResult(
			AccoHomeStayImpl.class, accoHomeStay.getPrimaryKey(), accoHomeStay);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {accoHomeStay.getUuid(), accoHomeStay.getGroupId()},
			accoHomeStay);

		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId,
			new Object[] {accoHomeStay.getJtbApplicationId()}, accoHomeStay);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the acco home stays in the entity cache if it is enabled.
	 *
	 * @param accoHomeStays the acco home stays
	 */
	@Override
	public void cacheResult(List<AccoHomeStay> accoHomeStays) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (accoHomeStays.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AccoHomeStay accoHomeStay : accoHomeStays) {
			if (entityCache.getResult(
					AccoHomeStayImpl.class, accoHomeStay.getPrimaryKey()) ==
						null) {

				cacheResult(accoHomeStay);
			}
		}
	}

	/**
	 * Clears the cache for all acco home stays.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AccoHomeStayImpl.class);

		finderCache.clearCache(AccoHomeStayImpl.class);
	}

	/**
	 * Clears the cache for the acco home stay.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AccoHomeStay accoHomeStay) {
		entityCache.removeResult(AccoHomeStayImpl.class, accoHomeStay);
	}

	@Override
	public void clearCache(List<AccoHomeStay> accoHomeStays) {
		for (AccoHomeStay accoHomeStay : accoHomeStays) {
			entityCache.removeResult(AccoHomeStayImpl.class, accoHomeStay);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AccoHomeStayImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AccoHomeStayImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AccoHomeStayModelImpl accoHomeStayModelImpl) {

		Object[] args = new Object[] {
			accoHomeStayModelImpl.getUuid(), accoHomeStayModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, accoHomeStayModelImpl);

		args = new Object[] {accoHomeStayModelImpl.getJtbApplicationId()};

		finderCache.putResult(
			_finderPathCountBygetJTB_ByApplicationId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId, args,
			accoHomeStayModelImpl);
	}

	/**
	 * Creates a new acco home stay with the primary key. Does not add the acco home stay to the database.
	 *
	 * @param accoHomeStayId the primary key for the new acco home stay
	 * @return the new acco home stay
	 */
	@Override
	public AccoHomeStay create(long accoHomeStayId) {
		AccoHomeStay accoHomeStay = new AccoHomeStayImpl();

		accoHomeStay.setNew(true);
		accoHomeStay.setPrimaryKey(accoHomeStayId);

		String uuid = PortalUUIDUtil.generate();

		accoHomeStay.setUuid(uuid);

		accoHomeStay.setCompanyId(CompanyThreadLocal.getCompanyId());

		return accoHomeStay;
	}

	/**
	 * Removes the acco home stay with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accoHomeStayId the primary key of the acco home stay
	 * @return the acco home stay that was removed
	 * @throws NoSuchAccoHomeStayException if a acco home stay with the primary key could not be found
	 */
	@Override
	public AccoHomeStay remove(long accoHomeStayId)
		throws NoSuchAccoHomeStayException {

		return remove((Serializable)accoHomeStayId);
	}

	/**
	 * Removes the acco home stay with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the acco home stay
	 * @return the acco home stay that was removed
	 * @throws NoSuchAccoHomeStayException if a acco home stay with the primary key could not be found
	 */
	@Override
	public AccoHomeStay remove(Serializable primaryKey)
		throws NoSuchAccoHomeStayException {

		Session session = null;

		try {
			session = openSession();

			AccoHomeStay accoHomeStay = (AccoHomeStay)session.get(
				AccoHomeStayImpl.class, primaryKey);

			if (accoHomeStay == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAccoHomeStayException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(accoHomeStay);
		}
		catch (NoSuchAccoHomeStayException noSuchEntityException) {
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
	protected AccoHomeStay removeImpl(AccoHomeStay accoHomeStay) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(accoHomeStay)) {
				accoHomeStay = (AccoHomeStay)session.get(
					AccoHomeStayImpl.class, accoHomeStay.getPrimaryKeyObj());
			}

			if (accoHomeStay != null) {
				session.delete(accoHomeStay);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (accoHomeStay != null) {
			clearCache(accoHomeStay);
		}

		return accoHomeStay;
	}

	@Override
	public AccoHomeStay updateImpl(AccoHomeStay accoHomeStay) {
		boolean isNew = accoHomeStay.isNew();

		if (!(accoHomeStay instanceof AccoHomeStayModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(accoHomeStay.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					accoHomeStay);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in accoHomeStay proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AccoHomeStay implementation " +
					accoHomeStay.getClass());
		}

		AccoHomeStayModelImpl accoHomeStayModelImpl =
			(AccoHomeStayModelImpl)accoHomeStay;

		if (Validator.isNull(accoHomeStay.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			accoHomeStay.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (accoHomeStay.getCreateDate() == null)) {
			if (serviceContext == null) {
				accoHomeStay.setCreateDate(date);
			}
			else {
				accoHomeStay.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!accoHomeStayModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				accoHomeStay.setModifiedDate(date);
			}
			else {
				accoHomeStay.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(accoHomeStay);
			}
			else {
				accoHomeStay = (AccoHomeStay)session.merge(accoHomeStay);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AccoHomeStayImpl.class, accoHomeStayModelImpl, false, true);

		cacheUniqueFindersCache(accoHomeStayModelImpl);

		if (isNew) {
			accoHomeStay.setNew(false);
		}

		accoHomeStay.resetOriginalValues();

		return accoHomeStay;
	}

	/**
	 * Returns the acco home stay with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the acco home stay
	 * @return the acco home stay
	 * @throws NoSuchAccoHomeStayException if a acco home stay with the primary key could not be found
	 */
	@Override
	public AccoHomeStay findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAccoHomeStayException {

		AccoHomeStay accoHomeStay = fetchByPrimaryKey(primaryKey);

		if (accoHomeStay == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAccoHomeStayException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return accoHomeStay;
	}

	/**
	 * Returns the acco home stay with the primary key or throws a <code>NoSuchAccoHomeStayException</code> if it could not be found.
	 *
	 * @param accoHomeStayId the primary key of the acco home stay
	 * @return the acco home stay
	 * @throws NoSuchAccoHomeStayException if a acco home stay with the primary key could not be found
	 */
	@Override
	public AccoHomeStay findByPrimaryKey(long accoHomeStayId)
		throws NoSuchAccoHomeStayException {

		return findByPrimaryKey((Serializable)accoHomeStayId);
	}

	/**
	 * Returns the acco home stay with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accoHomeStayId the primary key of the acco home stay
	 * @return the acco home stay, or <code>null</code> if a acco home stay with the primary key could not be found
	 */
	@Override
	public AccoHomeStay fetchByPrimaryKey(long accoHomeStayId) {
		return fetchByPrimaryKey((Serializable)accoHomeStayId);
	}

	/**
	 * Returns all the acco home stays.
	 *
	 * @return the acco home stays
	 */
	@Override
	public List<AccoHomeStay> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acco home stays.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHomeStayModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco home stays
	 * @param end the upper bound of the range of acco home stays (not inclusive)
	 * @return the range of acco home stays
	 */
	@Override
	public List<AccoHomeStay> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the acco home stays.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHomeStayModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco home stays
	 * @param end the upper bound of the range of acco home stays (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acco home stays
	 */
	@Override
	public List<AccoHomeStay> findAll(
		int start, int end, OrderByComparator<AccoHomeStay> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acco home stays.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHomeStayModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco home stays
	 * @param end the upper bound of the range of acco home stays (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acco home stays
	 */
	@Override
	public List<AccoHomeStay> findAll(
		int start, int end, OrderByComparator<AccoHomeStay> orderByComparator,
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

		List<AccoHomeStay> list = null;

		if (useFinderCache) {
			list = (List<AccoHomeStay>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ACCOHOMESTAY);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ACCOHOMESTAY;

				sql = sql.concat(AccoHomeStayModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AccoHomeStay>)QueryUtil.list(
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
	 * Removes all the acco home stays from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AccoHomeStay accoHomeStay : findAll()) {
			remove(accoHomeStay);
		}
	}

	/**
	 * Returns the number of acco home stays.
	 *
	 * @return the number of acco home stays
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_ACCOHOMESTAY);

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
		return "accoHomeStayId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ACCOHOMESTAY;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AccoHomeStayModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the acco home stay persistence.
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

		AccoHomeStayUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AccoHomeStayUtil.setPersistence(null);

		entityCache.removeCache(AccoHomeStayImpl.class.getName());
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

	private static final String _SQL_SELECT_ACCOHOMESTAY =
		"SELECT accoHomeStay FROM AccoHomeStay accoHomeStay";

	private static final String _SQL_SELECT_ACCOHOMESTAY_WHERE =
		"SELECT accoHomeStay FROM AccoHomeStay accoHomeStay WHERE ";

	private static final String _SQL_COUNT_ACCOHOMESTAY =
		"SELECT COUNT(accoHomeStay) FROM AccoHomeStay accoHomeStay";

	private static final String _SQL_COUNT_ACCOHOMESTAY_WHERE =
		"SELECT COUNT(accoHomeStay) FROM AccoHomeStay accoHomeStay WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "accoHomeStay.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AccoHomeStay exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AccoHomeStay exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AccoHomeStayPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}