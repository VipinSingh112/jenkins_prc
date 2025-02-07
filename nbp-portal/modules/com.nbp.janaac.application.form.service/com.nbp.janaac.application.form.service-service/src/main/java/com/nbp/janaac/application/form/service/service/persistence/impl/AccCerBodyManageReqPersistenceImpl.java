/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence.impl;

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

import com.nbp.janaac.application.form.service.exception.NoSuchAccCerBodyManageReqException;
import com.nbp.janaac.application.form.service.model.AccCerBodyManageReq;
import com.nbp.janaac.application.form.service.model.AccCerBodyManageReqTable;
import com.nbp.janaac.application.form.service.model.impl.AccCerBodyManageReqImpl;
import com.nbp.janaac.application.form.service.model.impl.AccCerBodyManageReqModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.AccCerBodyManageReqPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AccCerBodyManageReqUtil;
import com.nbp.janaac.application.form.service.service.persistence.impl.constants.JANAAC_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the acc cer body manage req service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AccCerBodyManageReqPersistence.class)
public class AccCerBodyManageReqPersistenceImpl
	extends BasePersistenceImpl<AccCerBodyManageReq>
	implements AccCerBodyManageReqPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AccCerBodyManageReqUtil</code> to access the acc cer body manage req persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AccCerBodyManageReqImpl.class.getName();

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
	 * Returns all the acc cer body manage reqs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acc cer body manage reqs
	 */
	@Override
	public List<AccCerBodyManageReq> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acc cer body manage reqs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyManageReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc cer body manage reqs
	 * @param end the upper bound of the range of acc cer body manage reqs (not inclusive)
	 * @return the range of matching acc cer body manage reqs
	 */
	@Override
	public List<AccCerBodyManageReq> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the acc cer body manage reqs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyManageReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc cer body manage reqs
	 * @param end the upper bound of the range of acc cer body manage reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc cer body manage reqs
	 */
	@Override
	public List<AccCerBodyManageReq> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccCerBodyManageReq> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acc cer body manage reqs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyManageReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc cer body manage reqs
	 * @param end the upper bound of the range of acc cer body manage reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc cer body manage reqs
	 */
	@Override
	public List<AccCerBodyManageReq> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccCerBodyManageReq> orderByComparator,
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

		List<AccCerBodyManageReq> list = null;

		if (useFinderCache) {
			list = (List<AccCerBodyManageReq>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AccCerBodyManageReq accCerBodyManageReq : list) {
					if (!uuid.equals(accCerBodyManageReq.getUuid())) {
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

			sb.append(_SQL_SELECT_ACCCERBODYMANAGEREQ_WHERE);

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
				sb.append(AccCerBodyManageReqModelImpl.ORDER_BY_JPQL);
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

				list = (List<AccCerBodyManageReq>)QueryUtil.list(
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
	 * Returns the first acc cer body manage req in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body manage req
	 * @throws NoSuchAccCerBodyManageReqException if a matching acc cer body manage req could not be found
	 */
	@Override
	public AccCerBodyManageReq findByUuid_First(
			String uuid,
			OrderByComparator<AccCerBodyManageReq> orderByComparator)
		throws NoSuchAccCerBodyManageReqException {

		AccCerBodyManageReq accCerBodyManageReq = fetchByUuid_First(
			uuid, orderByComparator);

		if (accCerBodyManageReq != null) {
			return accCerBodyManageReq;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAccCerBodyManageReqException(sb.toString());
	}

	/**
	 * Returns the first acc cer body manage req in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body manage req, or <code>null</code> if a matching acc cer body manage req could not be found
	 */
	@Override
	public AccCerBodyManageReq fetchByUuid_First(
		String uuid, OrderByComparator<AccCerBodyManageReq> orderByComparator) {

		List<AccCerBodyManageReq> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last acc cer body manage req in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body manage req
	 * @throws NoSuchAccCerBodyManageReqException if a matching acc cer body manage req could not be found
	 */
	@Override
	public AccCerBodyManageReq findByUuid_Last(
			String uuid,
			OrderByComparator<AccCerBodyManageReq> orderByComparator)
		throws NoSuchAccCerBodyManageReqException {

		AccCerBodyManageReq accCerBodyManageReq = fetchByUuid_Last(
			uuid, orderByComparator);

		if (accCerBodyManageReq != null) {
			return accCerBodyManageReq;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAccCerBodyManageReqException(sb.toString());
	}

	/**
	 * Returns the last acc cer body manage req in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body manage req, or <code>null</code> if a matching acc cer body manage req could not be found
	 */
	@Override
	public AccCerBodyManageReq fetchByUuid_Last(
		String uuid, OrderByComparator<AccCerBodyManageReq> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<AccCerBodyManageReq> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the acc cer body manage reqs before and after the current acc cer body manage req in the ordered set where uuid = &#63;.
	 *
	 * @param accCerBodyManageReqId the primary key of the current acc cer body manage req
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc cer body manage req
	 * @throws NoSuchAccCerBodyManageReqException if a acc cer body manage req with the primary key could not be found
	 */
	@Override
	public AccCerBodyManageReq[] findByUuid_PrevAndNext(
			long accCerBodyManageReqId, String uuid,
			OrderByComparator<AccCerBodyManageReq> orderByComparator)
		throws NoSuchAccCerBodyManageReqException {

		uuid = Objects.toString(uuid, "");

		AccCerBodyManageReq accCerBodyManageReq = findByPrimaryKey(
			accCerBodyManageReqId);

		Session session = null;

		try {
			session = openSession();

			AccCerBodyManageReq[] array = new AccCerBodyManageReqImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, accCerBodyManageReq, uuid, orderByComparator, true);

			array[1] = accCerBodyManageReq;

			array[2] = getByUuid_PrevAndNext(
				session, accCerBodyManageReq, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected AccCerBodyManageReq getByUuid_PrevAndNext(
		Session session, AccCerBodyManageReq accCerBodyManageReq, String uuid,
		OrderByComparator<AccCerBodyManageReq> orderByComparator,
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

		sb.append(_SQL_SELECT_ACCCERBODYMANAGEREQ_WHERE);

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
			sb.append(AccCerBodyManageReqModelImpl.ORDER_BY_JPQL);
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
						accCerBodyManageReq)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AccCerBodyManageReq> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the acc cer body manage reqs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (AccCerBodyManageReq accCerBodyManageReq :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(accCerBodyManageReq);
		}
	}

	/**
	 * Returns the number of acc cer body manage reqs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acc cer body manage reqs
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACCCERBODYMANAGEREQ_WHERE);

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
		"accCerBodyManageReq.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(accCerBodyManageReq.uuid IS NULL OR accCerBodyManageReq.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the acc cer body manage req where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccCerBodyManageReqException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc cer body manage req
	 * @throws NoSuchAccCerBodyManageReqException if a matching acc cer body manage req could not be found
	 */
	@Override
	public AccCerBodyManageReq findByUUID_G(String uuid, long groupId)
		throws NoSuchAccCerBodyManageReqException {

		AccCerBodyManageReq accCerBodyManageReq = fetchByUUID_G(uuid, groupId);

		if (accCerBodyManageReq == null) {
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

			throw new NoSuchAccCerBodyManageReqException(sb.toString());
		}

		return accCerBodyManageReq;
	}

	/**
	 * Returns the acc cer body manage req where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc cer body manage req, or <code>null</code> if a matching acc cer body manage req could not be found
	 */
	@Override
	public AccCerBodyManageReq fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the acc cer body manage req where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc cer body manage req, or <code>null</code> if a matching acc cer body manage req could not be found
	 */
	@Override
	public AccCerBodyManageReq fetchByUUID_G(
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

		if (result instanceof AccCerBodyManageReq) {
			AccCerBodyManageReq accCerBodyManageReq =
				(AccCerBodyManageReq)result;

			if (!Objects.equals(uuid, accCerBodyManageReq.getUuid()) ||
				(groupId != accCerBodyManageReq.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_ACCCERBODYMANAGEREQ_WHERE);

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

				List<AccCerBodyManageReq> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					AccCerBodyManageReq accCerBodyManageReq = list.get(0);

					result = accCerBodyManageReq;

					cacheResult(accCerBodyManageReq);
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
			return (AccCerBodyManageReq)result;
		}
	}

	/**
	 * Removes the acc cer body manage req where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acc cer body manage req that was removed
	 */
	@Override
	public AccCerBodyManageReq removeByUUID_G(String uuid, long groupId)
		throws NoSuchAccCerBodyManageReqException {

		AccCerBodyManageReq accCerBodyManageReq = findByUUID_G(uuid, groupId);

		return remove(accCerBodyManageReq);
	}

	/**
	 * Returns the number of acc cer body manage reqs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acc cer body manage reqs
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ACCCERBODYMANAGEREQ_WHERE);

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
		"accCerBodyManageReq.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(accCerBodyManageReq.uuid IS NULL OR accCerBodyManageReq.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"accCerBodyManageReq.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the acc cer body manage reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acc cer body manage reqs
	 */
	@Override
	public List<AccCerBodyManageReq> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acc cer body manage reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyManageReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc cer body manage reqs
	 * @param end the upper bound of the range of acc cer body manage reqs (not inclusive)
	 * @return the range of matching acc cer body manage reqs
	 */
	@Override
	public List<AccCerBodyManageReq> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the acc cer body manage reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyManageReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc cer body manage reqs
	 * @param end the upper bound of the range of acc cer body manage reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc cer body manage reqs
	 */
	@Override
	public List<AccCerBodyManageReq> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccCerBodyManageReq> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acc cer body manage reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyManageReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc cer body manage reqs
	 * @param end the upper bound of the range of acc cer body manage reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc cer body manage reqs
	 */
	@Override
	public List<AccCerBodyManageReq> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccCerBodyManageReq> orderByComparator,
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

		List<AccCerBodyManageReq> list = null;

		if (useFinderCache) {
			list = (List<AccCerBodyManageReq>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AccCerBodyManageReq accCerBodyManageReq : list) {
					if (!uuid.equals(accCerBodyManageReq.getUuid()) ||
						(companyId != accCerBodyManageReq.getCompanyId())) {

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

			sb.append(_SQL_SELECT_ACCCERBODYMANAGEREQ_WHERE);

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
				sb.append(AccCerBodyManageReqModelImpl.ORDER_BY_JPQL);
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

				list = (List<AccCerBodyManageReq>)QueryUtil.list(
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
	 * Returns the first acc cer body manage req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body manage req
	 * @throws NoSuchAccCerBodyManageReqException if a matching acc cer body manage req could not be found
	 */
	@Override
	public AccCerBodyManageReq findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<AccCerBodyManageReq> orderByComparator)
		throws NoSuchAccCerBodyManageReqException {

		AccCerBodyManageReq accCerBodyManageReq = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (accCerBodyManageReq != null) {
			return accCerBodyManageReq;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchAccCerBodyManageReqException(sb.toString());
	}

	/**
	 * Returns the first acc cer body manage req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body manage req, or <code>null</code> if a matching acc cer body manage req could not be found
	 */
	@Override
	public AccCerBodyManageReq fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<AccCerBodyManageReq> orderByComparator) {

		List<AccCerBodyManageReq> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last acc cer body manage req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body manage req
	 * @throws NoSuchAccCerBodyManageReqException if a matching acc cer body manage req could not be found
	 */
	@Override
	public AccCerBodyManageReq findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<AccCerBodyManageReq> orderByComparator)
		throws NoSuchAccCerBodyManageReqException {

		AccCerBodyManageReq accCerBodyManageReq = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (accCerBodyManageReq != null) {
			return accCerBodyManageReq;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchAccCerBodyManageReqException(sb.toString());
	}

	/**
	 * Returns the last acc cer body manage req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body manage req, or <code>null</code> if a matching acc cer body manage req could not be found
	 */
	@Override
	public AccCerBodyManageReq fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<AccCerBodyManageReq> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<AccCerBodyManageReq> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the acc cer body manage reqs before and after the current acc cer body manage req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accCerBodyManageReqId the primary key of the current acc cer body manage req
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc cer body manage req
	 * @throws NoSuchAccCerBodyManageReqException if a acc cer body manage req with the primary key could not be found
	 */
	@Override
	public AccCerBodyManageReq[] findByUuid_C_PrevAndNext(
			long accCerBodyManageReqId, String uuid, long companyId,
			OrderByComparator<AccCerBodyManageReq> orderByComparator)
		throws NoSuchAccCerBodyManageReqException {

		uuid = Objects.toString(uuid, "");

		AccCerBodyManageReq accCerBodyManageReq = findByPrimaryKey(
			accCerBodyManageReqId);

		Session session = null;

		try {
			session = openSession();

			AccCerBodyManageReq[] array = new AccCerBodyManageReqImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, accCerBodyManageReq, uuid, companyId,
				orderByComparator, true);

			array[1] = accCerBodyManageReq;

			array[2] = getByUuid_C_PrevAndNext(
				session, accCerBodyManageReq, uuid, companyId,
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

	protected AccCerBodyManageReq getByUuid_C_PrevAndNext(
		Session session, AccCerBodyManageReq accCerBodyManageReq, String uuid,
		long companyId,
		OrderByComparator<AccCerBodyManageReq> orderByComparator,
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

		sb.append(_SQL_SELECT_ACCCERBODYMANAGEREQ_WHERE);

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
			sb.append(AccCerBodyManageReqModelImpl.ORDER_BY_JPQL);
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
						accCerBodyManageReq)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AccCerBodyManageReq> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the acc cer body manage reqs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (AccCerBodyManageReq accCerBodyManageReq :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(accCerBodyManageReq);
		}
	}

	/**
	 * Returns the number of acc cer body manage reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acc cer body manage reqs
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ACCCERBODYMANAGEREQ_WHERE);

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
		"accCerBodyManageReq.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(accCerBodyManageReq.uuid IS NULL OR accCerBodyManageReq.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"accCerBodyManageReq.companyId = ?";

	private FinderPath _finderPathFetchBygetJANAAC_ByApplicationId;
	private FinderPath _finderPathCountBygetJANAAC_ByApplicationId;

	/**
	 * Returns the acc cer body manage req where janaacApplicationId = &#63; or throws a <code>NoSuchAccCerBodyManageReqException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc cer body manage req
	 * @throws NoSuchAccCerBodyManageReqException if a matching acc cer body manage req could not be found
	 */
	@Override
	public AccCerBodyManageReq findBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccCerBodyManageReqException {

		AccCerBodyManageReq accCerBodyManageReq =
			fetchBygetJANAAC_ByApplicationId(janaacApplicationId);

		if (accCerBodyManageReq == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("janaacApplicationId=");
			sb.append(janaacApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAccCerBodyManageReqException(sb.toString());
		}

		return accCerBodyManageReq;
	}

	/**
	 * Returns the acc cer body manage req where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc cer body manage req, or <code>null</code> if a matching acc cer body manage req could not be found
	 */
	@Override
	public AccCerBodyManageReq fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId) {

		return fetchBygetJANAAC_ByApplicationId(janaacApplicationId, true);
	}

	/**
	 * Returns the acc cer body manage req where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc cer body manage req, or <code>null</code> if a matching acc cer body manage req could not be found
	 */
	@Override
	public AccCerBodyManageReq fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {janaacApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJANAAC_ByApplicationId, finderArgs, this);
		}

		if (result instanceof AccCerBodyManageReq) {
			AccCerBodyManageReq accCerBodyManageReq =
				(AccCerBodyManageReq)result;

			if (janaacApplicationId !=
					accCerBodyManageReq.getJanaacApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ACCCERBODYMANAGEREQ_WHERE);

			sb.append(
				_FINDER_COLUMN_GETJANAAC_BYAPPLICATIONID_JANAACAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				List<AccCerBodyManageReq> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJANAAC_ByApplicationId,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {janaacApplicationId};
							}

							_log.warn(
								"AccCerBodyManageReqPersistenceImpl.fetchBygetJANAAC_ByApplicationId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AccCerBodyManageReq accCerBodyManageReq = list.get(0);

					result = accCerBodyManageReq;

					cacheResult(accCerBodyManageReq);
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
			return (AccCerBodyManageReq)result;
		}
	}

	/**
	 * Removes the acc cer body manage req where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the acc cer body manage req that was removed
	 */
	@Override
	public AccCerBodyManageReq removeBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccCerBodyManageReqException {

		AccCerBodyManageReq accCerBodyManageReq =
			findBygetJANAAC_ByApplicationId(janaacApplicationId);

		return remove(accCerBodyManageReq);
	}

	/**
	 * Returns the number of acc cer body manage reqs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching acc cer body manage reqs
	 */
	@Override
	public int countBygetJANAAC_ByApplicationId(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJANAAC_ByApplicationId;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACCCERBODYMANAGEREQ_WHERE);

			sb.append(
				_FINDER_COLUMN_GETJANAAC_BYAPPLICATIONID_JANAACAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

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
		_FINDER_COLUMN_GETJANAAC_BYAPPLICATIONID_JANAACAPPLICATIONID_2 =
			"accCerBodyManageReq.janaacApplicationId = ?";

	public AccCerBodyManageReqPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(AccCerBodyManageReq.class);

		setModelImplClass(AccCerBodyManageReqImpl.class);
		setModelPKClass(long.class);

		setTable(AccCerBodyManageReqTable.INSTANCE);
	}

	/**
	 * Caches the acc cer body manage req in the entity cache if it is enabled.
	 *
	 * @param accCerBodyManageReq the acc cer body manage req
	 */
	@Override
	public void cacheResult(AccCerBodyManageReq accCerBodyManageReq) {
		entityCache.putResult(
			AccCerBodyManageReqImpl.class, accCerBodyManageReq.getPrimaryKey(),
			accCerBodyManageReq);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				accCerBodyManageReq.getUuid(), accCerBodyManageReq.getGroupId()
			},
			accCerBodyManageReq);

		finderCache.putResult(
			_finderPathFetchBygetJANAAC_ByApplicationId,
			new Object[] {accCerBodyManageReq.getJanaacApplicationId()},
			accCerBodyManageReq);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the acc cer body manage reqs in the entity cache if it is enabled.
	 *
	 * @param accCerBodyManageReqs the acc cer body manage reqs
	 */
	@Override
	public void cacheResult(List<AccCerBodyManageReq> accCerBodyManageReqs) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (accCerBodyManageReqs.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AccCerBodyManageReq accCerBodyManageReq : accCerBodyManageReqs) {
			if (entityCache.getResult(
					AccCerBodyManageReqImpl.class,
					accCerBodyManageReq.getPrimaryKey()) == null) {

				cacheResult(accCerBodyManageReq);
			}
		}
	}

	/**
	 * Clears the cache for all acc cer body manage reqs.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AccCerBodyManageReqImpl.class);

		finderCache.clearCache(AccCerBodyManageReqImpl.class);
	}

	/**
	 * Clears the cache for the acc cer body manage req.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AccCerBodyManageReq accCerBodyManageReq) {
		entityCache.removeResult(
			AccCerBodyManageReqImpl.class, accCerBodyManageReq);
	}

	@Override
	public void clearCache(List<AccCerBodyManageReq> accCerBodyManageReqs) {
		for (AccCerBodyManageReq accCerBodyManageReq : accCerBodyManageReqs) {
			entityCache.removeResult(
				AccCerBodyManageReqImpl.class, accCerBodyManageReq);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AccCerBodyManageReqImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AccCerBodyManageReqImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AccCerBodyManageReqModelImpl accCerBodyManageReqModelImpl) {

		Object[] args = new Object[] {
			accCerBodyManageReqModelImpl.getUuid(),
			accCerBodyManageReqModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, accCerBodyManageReqModelImpl);

		args = new Object[] {
			accCerBodyManageReqModelImpl.getJanaacApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetJANAAC_ByApplicationId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJANAAC_ByApplicationId, args,
			accCerBodyManageReqModelImpl);
	}

	/**
	 * Creates a new acc cer body manage req with the primary key. Does not add the acc cer body manage req to the database.
	 *
	 * @param accCerBodyManageReqId the primary key for the new acc cer body manage req
	 * @return the new acc cer body manage req
	 */
	@Override
	public AccCerBodyManageReq create(long accCerBodyManageReqId) {
		AccCerBodyManageReq accCerBodyManageReq = new AccCerBodyManageReqImpl();

		accCerBodyManageReq.setNew(true);
		accCerBodyManageReq.setPrimaryKey(accCerBodyManageReqId);

		String uuid = PortalUUIDUtil.generate();

		accCerBodyManageReq.setUuid(uuid);

		accCerBodyManageReq.setCompanyId(CompanyThreadLocal.getCompanyId());

		return accCerBodyManageReq;
	}

	/**
	 * Removes the acc cer body manage req with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accCerBodyManageReqId the primary key of the acc cer body manage req
	 * @return the acc cer body manage req that was removed
	 * @throws NoSuchAccCerBodyManageReqException if a acc cer body manage req with the primary key could not be found
	 */
	@Override
	public AccCerBodyManageReq remove(long accCerBodyManageReqId)
		throws NoSuchAccCerBodyManageReqException {

		return remove((Serializable)accCerBodyManageReqId);
	}

	/**
	 * Removes the acc cer body manage req with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the acc cer body manage req
	 * @return the acc cer body manage req that was removed
	 * @throws NoSuchAccCerBodyManageReqException if a acc cer body manage req with the primary key could not be found
	 */
	@Override
	public AccCerBodyManageReq remove(Serializable primaryKey)
		throws NoSuchAccCerBodyManageReqException {

		Session session = null;

		try {
			session = openSession();

			AccCerBodyManageReq accCerBodyManageReq =
				(AccCerBodyManageReq)session.get(
					AccCerBodyManageReqImpl.class, primaryKey);

			if (accCerBodyManageReq == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAccCerBodyManageReqException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(accCerBodyManageReq);
		}
		catch (NoSuchAccCerBodyManageReqException noSuchEntityException) {
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
	protected AccCerBodyManageReq removeImpl(
		AccCerBodyManageReq accCerBodyManageReq) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(accCerBodyManageReq)) {
				accCerBodyManageReq = (AccCerBodyManageReq)session.get(
					AccCerBodyManageReqImpl.class,
					accCerBodyManageReq.getPrimaryKeyObj());
			}

			if (accCerBodyManageReq != null) {
				session.delete(accCerBodyManageReq);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (accCerBodyManageReq != null) {
			clearCache(accCerBodyManageReq);
		}

		return accCerBodyManageReq;
	}

	@Override
	public AccCerBodyManageReq updateImpl(
		AccCerBodyManageReq accCerBodyManageReq) {

		boolean isNew = accCerBodyManageReq.isNew();

		if (!(accCerBodyManageReq instanceof AccCerBodyManageReqModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(accCerBodyManageReq.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					accCerBodyManageReq);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in accCerBodyManageReq proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AccCerBodyManageReq implementation " +
					accCerBodyManageReq.getClass());
		}

		AccCerBodyManageReqModelImpl accCerBodyManageReqModelImpl =
			(AccCerBodyManageReqModelImpl)accCerBodyManageReq;

		if (Validator.isNull(accCerBodyManageReq.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			accCerBodyManageReq.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (accCerBodyManageReq.getCreateDate() == null)) {
			if (serviceContext == null) {
				accCerBodyManageReq.setCreateDate(date);
			}
			else {
				accCerBodyManageReq.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!accCerBodyManageReqModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				accCerBodyManageReq.setModifiedDate(date);
			}
			else {
				accCerBodyManageReq.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(accCerBodyManageReq);
			}
			else {
				accCerBodyManageReq = (AccCerBodyManageReq)session.merge(
					accCerBodyManageReq);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AccCerBodyManageReqImpl.class, accCerBodyManageReqModelImpl, false,
			true);

		cacheUniqueFindersCache(accCerBodyManageReqModelImpl);

		if (isNew) {
			accCerBodyManageReq.setNew(false);
		}

		accCerBodyManageReq.resetOriginalValues();

		return accCerBodyManageReq;
	}

	/**
	 * Returns the acc cer body manage req with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the acc cer body manage req
	 * @return the acc cer body manage req
	 * @throws NoSuchAccCerBodyManageReqException if a acc cer body manage req with the primary key could not be found
	 */
	@Override
	public AccCerBodyManageReq findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAccCerBodyManageReqException {

		AccCerBodyManageReq accCerBodyManageReq = fetchByPrimaryKey(primaryKey);

		if (accCerBodyManageReq == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAccCerBodyManageReqException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return accCerBodyManageReq;
	}

	/**
	 * Returns the acc cer body manage req with the primary key or throws a <code>NoSuchAccCerBodyManageReqException</code> if it could not be found.
	 *
	 * @param accCerBodyManageReqId the primary key of the acc cer body manage req
	 * @return the acc cer body manage req
	 * @throws NoSuchAccCerBodyManageReqException if a acc cer body manage req with the primary key could not be found
	 */
	@Override
	public AccCerBodyManageReq findByPrimaryKey(long accCerBodyManageReqId)
		throws NoSuchAccCerBodyManageReqException {

		return findByPrimaryKey((Serializable)accCerBodyManageReqId);
	}

	/**
	 * Returns the acc cer body manage req with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accCerBodyManageReqId the primary key of the acc cer body manage req
	 * @return the acc cer body manage req, or <code>null</code> if a acc cer body manage req with the primary key could not be found
	 */
	@Override
	public AccCerBodyManageReq fetchByPrimaryKey(long accCerBodyManageReqId) {
		return fetchByPrimaryKey((Serializable)accCerBodyManageReqId);
	}

	/**
	 * Returns all the acc cer body manage reqs.
	 *
	 * @return the acc cer body manage reqs
	 */
	@Override
	public List<AccCerBodyManageReq> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acc cer body manage reqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyManageReqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body manage reqs
	 * @param end the upper bound of the range of acc cer body manage reqs (not inclusive)
	 * @return the range of acc cer body manage reqs
	 */
	@Override
	public List<AccCerBodyManageReq> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the acc cer body manage reqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyManageReqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body manage reqs
	 * @param end the upper bound of the range of acc cer body manage reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acc cer body manage reqs
	 */
	@Override
	public List<AccCerBodyManageReq> findAll(
		int start, int end,
		OrderByComparator<AccCerBodyManageReq> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acc cer body manage reqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyManageReqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body manage reqs
	 * @param end the upper bound of the range of acc cer body manage reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acc cer body manage reqs
	 */
	@Override
	public List<AccCerBodyManageReq> findAll(
		int start, int end,
		OrderByComparator<AccCerBodyManageReq> orderByComparator,
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

		List<AccCerBodyManageReq> list = null;

		if (useFinderCache) {
			list = (List<AccCerBodyManageReq>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ACCCERBODYMANAGEREQ);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ACCCERBODYMANAGEREQ;

				sql = sql.concat(AccCerBodyManageReqModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AccCerBodyManageReq>)QueryUtil.list(
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
	 * Removes all the acc cer body manage reqs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AccCerBodyManageReq accCerBodyManageReq : findAll()) {
			remove(accCerBodyManageReq);
		}
	}

	/**
	 * Returns the number of acc cer body manage reqs.
	 *
	 * @return the number of acc cer body manage reqs
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
					_SQL_COUNT_ACCCERBODYMANAGEREQ);

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
		return "accCerBodyManageReqId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ACCCERBODYMANAGEREQ;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AccCerBodyManageReqModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the acc cer body manage req persistence.
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

		_finderPathFetchBygetJANAAC_ByApplicationId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJANAAC_ByApplicationId",
			new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, true);

		_finderPathCountBygetJANAAC_ByApplicationId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJANAAC_ByApplicationId",
			new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, false);

		AccCerBodyManageReqUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AccCerBodyManageReqUtil.setPersistence(null);

		entityCache.removeCache(AccCerBodyManageReqImpl.class.getName());
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ACCCERBODYMANAGEREQ =
		"SELECT accCerBodyManageReq FROM AccCerBodyManageReq accCerBodyManageReq";

	private static final String _SQL_SELECT_ACCCERBODYMANAGEREQ_WHERE =
		"SELECT accCerBodyManageReq FROM AccCerBodyManageReq accCerBodyManageReq WHERE ";

	private static final String _SQL_COUNT_ACCCERBODYMANAGEREQ =
		"SELECT COUNT(accCerBodyManageReq) FROM AccCerBodyManageReq accCerBodyManageReq";

	private static final String _SQL_COUNT_ACCCERBODYMANAGEREQ_WHERE =
		"SELECT COUNT(accCerBodyManageReq) FROM AccCerBodyManageReq accCerBodyManageReq WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "accCerBodyManageReq.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AccCerBodyManageReq exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AccCerBodyManageReq exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AccCerBodyManageReqPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}