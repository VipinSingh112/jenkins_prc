/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service.persistence.impl;

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

import com.nbp.jadsc.application.form.service.exception.NoSuchJADSCOathRequestException;
import com.nbp.jadsc.application.form.service.model.JADSCOathRequest;
import com.nbp.jadsc.application.form.service.model.JADSCOathRequestTable;
import com.nbp.jadsc.application.form.service.model.impl.JADSCOathRequestImpl;
import com.nbp.jadsc.application.form.service.model.impl.JADSCOathRequestModelImpl;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCOathRequestPersistence;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCOathRequestUtil;
import com.nbp.jadsc.application.form.service.service.persistence.impl.constants.JADSC_FORMPersistenceConstants;

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
 * The persistence implementation for the jadsc oath request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = JADSCOathRequestPersistence.class)
public class JADSCOathRequestPersistenceImpl
	extends BasePersistenceImpl<JADSCOathRequest>
	implements JADSCOathRequestPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JADSCOathRequestUtil</code> to access the jadsc oath request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JADSCOathRequestImpl.class.getName();

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
	 * Returns all the jadsc oath requests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jadsc oath requests
	 */
	@Override
	public List<JADSCOathRequest> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc oath requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCOathRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc oath requests
	 * @param end the upper bound of the range of jadsc oath requests (not inclusive)
	 * @return the range of matching jadsc oath requests
	 */
	@Override
	public List<JADSCOathRequest> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc oath requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCOathRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc oath requests
	 * @param end the upper bound of the range of jadsc oath requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc oath requests
	 */
	@Override
	public List<JADSCOathRequest> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCOathRequest> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc oath requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCOathRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc oath requests
	 * @param end the upper bound of the range of jadsc oath requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc oath requests
	 */
	@Override
	public List<JADSCOathRequest> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCOathRequest> orderByComparator,
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

		List<JADSCOathRequest> list = null;

		if (useFinderCache) {
			list = (List<JADSCOathRequest>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JADSCOathRequest jadscOathRequest : list) {
					if (!uuid.equals(jadscOathRequest.getUuid())) {
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

			sb.append(_SQL_SELECT_JADSCOATHREQUEST_WHERE);

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
				sb.append(JADSCOathRequestModelImpl.ORDER_BY_JPQL);
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

				list = (List<JADSCOathRequest>)QueryUtil.list(
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
	 * Returns the first jadsc oath request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc oath request
	 * @throws NoSuchJADSCOathRequestException if a matching jadsc oath request could not be found
	 */
	@Override
	public JADSCOathRequest findByUuid_First(
			String uuid, OrderByComparator<JADSCOathRequest> orderByComparator)
		throws NoSuchJADSCOathRequestException {

		JADSCOathRequest jadscOathRequest = fetchByUuid_First(
			uuid, orderByComparator);

		if (jadscOathRequest != null) {
			return jadscOathRequest;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchJADSCOathRequestException(sb.toString());
	}

	/**
	 * Returns the first jadsc oath request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc oath request, or <code>null</code> if a matching jadsc oath request could not be found
	 */
	@Override
	public JADSCOathRequest fetchByUuid_First(
		String uuid, OrderByComparator<JADSCOathRequest> orderByComparator) {

		List<JADSCOathRequest> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc oath request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc oath request
	 * @throws NoSuchJADSCOathRequestException if a matching jadsc oath request could not be found
	 */
	@Override
	public JADSCOathRequest findByUuid_Last(
			String uuid, OrderByComparator<JADSCOathRequest> orderByComparator)
		throws NoSuchJADSCOathRequestException {

		JADSCOathRequest jadscOathRequest = fetchByUuid_Last(
			uuid, orderByComparator);

		if (jadscOathRequest != null) {
			return jadscOathRequest;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchJADSCOathRequestException(sb.toString());
	}

	/**
	 * Returns the last jadsc oath request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc oath request, or <code>null</code> if a matching jadsc oath request could not be found
	 */
	@Override
	public JADSCOathRequest fetchByUuid_Last(
		String uuid, OrderByComparator<JADSCOathRequest> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<JADSCOathRequest> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc oath requests before and after the current jadsc oath request in the ordered set where uuid = &#63;.
	 *
	 * @param jadscOathRequestId the primary key of the current jadsc oath request
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc oath request
	 * @throws NoSuchJADSCOathRequestException if a jadsc oath request with the primary key could not be found
	 */
	@Override
	public JADSCOathRequest[] findByUuid_PrevAndNext(
			long jadscOathRequestId, String uuid,
			OrderByComparator<JADSCOathRequest> orderByComparator)
		throws NoSuchJADSCOathRequestException {

		uuid = Objects.toString(uuid, "");

		JADSCOathRequest jadscOathRequest = findByPrimaryKey(
			jadscOathRequestId);

		Session session = null;

		try {
			session = openSession();

			JADSCOathRequest[] array = new JADSCOathRequestImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, jadscOathRequest, uuid, orderByComparator, true);

			array[1] = jadscOathRequest;

			array[2] = getByUuid_PrevAndNext(
				session, jadscOathRequest, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected JADSCOathRequest getByUuid_PrevAndNext(
		Session session, JADSCOathRequest jadscOathRequest, String uuid,
		OrderByComparator<JADSCOathRequest> orderByComparator,
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

		sb.append(_SQL_SELECT_JADSCOATHREQUEST_WHERE);

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
			sb.append(JADSCOathRequestModelImpl.ORDER_BY_JPQL);
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
						jadscOathRequest)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JADSCOathRequest> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc oath requests where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (JADSCOathRequest jadscOathRequest :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(jadscOathRequest);
		}
	}

	/**
	 * Returns the number of jadsc oath requests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jadsc oath requests
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCOATHREQUEST_WHERE);

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
		"jadscOathRequest.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(jadscOathRequest.uuid IS NULL OR jadscOathRequest.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the jadsc oath request where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJADSCOathRequestException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc oath request
	 * @throws NoSuchJADSCOathRequestException if a matching jadsc oath request could not be found
	 */
	@Override
	public JADSCOathRequest findByUUID_G(String uuid, long groupId)
		throws NoSuchJADSCOathRequestException {

		JADSCOathRequest jadscOathRequest = fetchByUUID_G(uuid, groupId);

		if (jadscOathRequest == null) {
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

			throw new NoSuchJADSCOathRequestException(sb.toString());
		}

		return jadscOathRequest;
	}

	/**
	 * Returns the jadsc oath request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc oath request, or <code>null</code> if a matching jadsc oath request could not be found
	 */
	@Override
	public JADSCOathRequest fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the jadsc oath request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc oath request, or <code>null</code> if a matching jadsc oath request could not be found
	 */
	@Override
	public JADSCOathRequest fetchByUUID_G(
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

		if (result instanceof JADSCOathRequest) {
			JADSCOathRequest jadscOathRequest = (JADSCOathRequest)result;

			if (!Objects.equals(uuid, jadscOathRequest.getUuid()) ||
				(groupId != jadscOathRequest.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_JADSCOATHREQUEST_WHERE);

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

				List<JADSCOathRequest> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					JADSCOathRequest jadscOathRequest = list.get(0);

					result = jadscOathRequest;

					cacheResult(jadscOathRequest);
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
			return (JADSCOathRequest)result;
		}
	}

	/**
	 * Removes the jadsc oath request where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jadsc oath request that was removed
	 */
	@Override
	public JADSCOathRequest removeByUUID_G(String uuid, long groupId)
		throws NoSuchJADSCOathRequestException {

		JADSCOathRequest jadscOathRequest = findByUUID_G(uuid, groupId);

		return remove(jadscOathRequest);
	}

	/**
	 * Returns the number of jadsc oath requests where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jadsc oath requests
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JADSCOATHREQUEST_WHERE);

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
		"jadscOathRequest.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(jadscOathRequest.uuid IS NULL OR jadscOathRequest.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"jadscOathRequest.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the jadsc oath requests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jadsc oath requests
	 */
	@Override
	public List<JADSCOathRequest> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc oath requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCOathRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc oath requests
	 * @param end the upper bound of the range of jadsc oath requests (not inclusive)
	 * @return the range of matching jadsc oath requests
	 */
	@Override
	public List<JADSCOathRequest> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc oath requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCOathRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc oath requests
	 * @param end the upper bound of the range of jadsc oath requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc oath requests
	 */
	@Override
	public List<JADSCOathRequest> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCOathRequest> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc oath requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCOathRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc oath requests
	 * @param end the upper bound of the range of jadsc oath requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc oath requests
	 */
	@Override
	public List<JADSCOathRequest> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCOathRequest> orderByComparator,
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

		List<JADSCOathRequest> list = null;

		if (useFinderCache) {
			list = (List<JADSCOathRequest>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JADSCOathRequest jadscOathRequest : list) {
					if (!uuid.equals(jadscOathRequest.getUuid()) ||
						(companyId != jadscOathRequest.getCompanyId())) {

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

			sb.append(_SQL_SELECT_JADSCOATHREQUEST_WHERE);

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
				sb.append(JADSCOathRequestModelImpl.ORDER_BY_JPQL);
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

				list = (List<JADSCOathRequest>)QueryUtil.list(
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
	 * Returns the first jadsc oath request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc oath request
	 * @throws NoSuchJADSCOathRequestException if a matching jadsc oath request could not be found
	 */
	@Override
	public JADSCOathRequest findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<JADSCOathRequest> orderByComparator)
		throws NoSuchJADSCOathRequestException {

		JADSCOathRequest jadscOathRequest = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (jadscOathRequest != null) {
			return jadscOathRequest;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchJADSCOathRequestException(sb.toString());
	}

	/**
	 * Returns the first jadsc oath request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc oath request, or <code>null</code> if a matching jadsc oath request could not be found
	 */
	@Override
	public JADSCOathRequest fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<JADSCOathRequest> orderByComparator) {

		List<JADSCOathRequest> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc oath request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc oath request
	 * @throws NoSuchJADSCOathRequestException if a matching jadsc oath request could not be found
	 */
	@Override
	public JADSCOathRequest findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<JADSCOathRequest> orderByComparator)
		throws NoSuchJADSCOathRequestException {

		JADSCOathRequest jadscOathRequest = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (jadscOathRequest != null) {
			return jadscOathRequest;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchJADSCOathRequestException(sb.toString());
	}

	/**
	 * Returns the last jadsc oath request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc oath request, or <code>null</code> if a matching jadsc oath request could not be found
	 */
	@Override
	public JADSCOathRequest fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<JADSCOathRequest> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<JADSCOathRequest> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc oath requests before and after the current jadsc oath request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jadscOathRequestId the primary key of the current jadsc oath request
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc oath request
	 * @throws NoSuchJADSCOathRequestException if a jadsc oath request with the primary key could not be found
	 */
	@Override
	public JADSCOathRequest[] findByUuid_C_PrevAndNext(
			long jadscOathRequestId, String uuid, long companyId,
			OrderByComparator<JADSCOathRequest> orderByComparator)
		throws NoSuchJADSCOathRequestException {

		uuid = Objects.toString(uuid, "");

		JADSCOathRequest jadscOathRequest = findByPrimaryKey(
			jadscOathRequestId);

		Session session = null;

		try {
			session = openSession();

			JADSCOathRequest[] array = new JADSCOathRequestImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, jadscOathRequest, uuid, companyId, orderByComparator,
				true);

			array[1] = jadscOathRequest;

			array[2] = getByUuid_C_PrevAndNext(
				session, jadscOathRequest, uuid, companyId, orderByComparator,
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

	protected JADSCOathRequest getByUuid_C_PrevAndNext(
		Session session, JADSCOathRequest jadscOathRequest, String uuid,
		long companyId, OrderByComparator<JADSCOathRequest> orderByComparator,
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

		sb.append(_SQL_SELECT_JADSCOATHREQUEST_WHERE);

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
			sb.append(JADSCOathRequestModelImpl.ORDER_BY_JPQL);
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
						jadscOathRequest)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JADSCOathRequest> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc oath requests where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (JADSCOathRequest jadscOathRequest :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(jadscOathRequest);
		}
	}

	/**
	 * Returns the number of jadsc oath requests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jadsc oath requests
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JADSCOATHREQUEST_WHERE);

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
		"jadscOathRequest.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(jadscOathRequest.uuid IS NULL OR jadscOathRequest.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"jadscOathRequest.companyId = ?";

	private FinderPath _finderPathFetchBygetJADSCById;
	private FinderPath _finderPathCountBygetJADSCById;

	/**
	 * Returns the jadsc oath request where jadscApplicationId = &#63; or throws a <code>NoSuchJADSCOathRequestException</code> if it could not be found.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc oath request
	 * @throws NoSuchJADSCOathRequestException if a matching jadsc oath request could not be found
	 */
	@Override
	public JADSCOathRequest findBygetJADSCById(long jadscApplicationId)
		throws NoSuchJADSCOathRequestException {

		JADSCOathRequest jadscOathRequest = fetchBygetJADSCById(
			jadscApplicationId);

		if (jadscOathRequest == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jadscApplicationId=");
			sb.append(jadscApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJADSCOathRequestException(sb.toString());
		}

		return jadscOathRequest;
	}

	/**
	 * Returns the jadsc oath request where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc oath request, or <code>null</code> if a matching jadsc oath request could not be found
	 */
	@Override
	public JADSCOathRequest fetchBygetJADSCById(long jadscApplicationId) {
		return fetchBygetJADSCById(jadscApplicationId, true);
	}

	/**
	 * Returns the jadsc oath request where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc oath request, or <code>null</code> if a matching jadsc oath request could not be found
	 */
	@Override
	public JADSCOathRequest fetchBygetJADSCById(
		long jadscApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {jadscApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJADSCById, finderArgs, this);
		}

		if (result instanceof JADSCOathRequest) {
			JADSCOathRequest jadscOathRequest = (JADSCOathRequest)result;

			if (jadscApplicationId !=
					jadscOathRequest.getJadscApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JADSCOATHREQUEST_WHERE);

			sb.append(_FINDER_COLUMN_GETJADSCBYID_JADSCAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jadscApplicationId);

				List<JADSCOathRequest> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJADSCById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {jadscApplicationId};
							}

							_log.warn(
								"JADSCOathRequestPersistenceImpl.fetchBygetJADSCById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JADSCOathRequest jadscOathRequest = list.get(0);

					result = jadscOathRequest;

					cacheResult(jadscOathRequest);
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
			return (JADSCOathRequest)result;
		}
	}

	/**
	 * Removes the jadsc oath request where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the jadsc oath request that was removed
	 */
	@Override
	public JADSCOathRequest removeBygetJADSCById(long jadscApplicationId)
		throws NoSuchJADSCOathRequestException {

		JADSCOathRequest jadscOathRequest = findBygetJADSCById(
			jadscApplicationId);

		return remove(jadscOathRequest);
	}

	/**
	 * Returns the number of jadsc oath requests where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc oath requests
	 */
	@Override
	public int countBygetJADSCById(long jadscApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJADSCById;

		Object[] finderArgs = new Object[] {jadscApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCOATHREQUEST_WHERE);

			sb.append(_FINDER_COLUMN_GETJADSCBYID_JADSCAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jadscApplicationId);

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
		_FINDER_COLUMN_GETJADSCBYID_JADSCAPPLICATIONID_2 =
			"jadscOathRequest.jadscApplicationId = ?";

	public JADSCOathRequestPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(JADSCOathRequest.class);

		setModelImplClass(JADSCOathRequestImpl.class);
		setModelPKClass(long.class);

		setTable(JADSCOathRequestTable.INSTANCE);
	}

	/**
	 * Caches the jadsc oath request in the entity cache if it is enabled.
	 *
	 * @param jadscOathRequest the jadsc oath request
	 */
	@Override
	public void cacheResult(JADSCOathRequest jadscOathRequest) {
		entityCache.putResult(
			JADSCOathRequestImpl.class, jadscOathRequest.getPrimaryKey(),
			jadscOathRequest);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				jadscOathRequest.getUuid(), jadscOathRequest.getGroupId()
			},
			jadscOathRequest);

		finderCache.putResult(
			_finderPathFetchBygetJADSCById,
			new Object[] {jadscOathRequest.getJadscApplicationId()},
			jadscOathRequest);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the jadsc oath requests in the entity cache if it is enabled.
	 *
	 * @param jadscOathRequests the jadsc oath requests
	 */
	@Override
	public void cacheResult(List<JADSCOathRequest> jadscOathRequests) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (jadscOathRequests.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JADSCOathRequest jadscOathRequest : jadscOathRequests) {
			if (entityCache.getResult(
					JADSCOathRequestImpl.class,
					jadscOathRequest.getPrimaryKey()) == null) {

				cacheResult(jadscOathRequest);
			}
		}
	}

	/**
	 * Clears the cache for all jadsc oath requests.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JADSCOathRequestImpl.class);

		finderCache.clearCache(JADSCOathRequestImpl.class);
	}

	/**
	 * Clears the cache for the jadsc oath request.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JADSCOathRequest jadscOathRequest) {
		entityCache.removeResult(JADSCOathRequestImpl.class, jadscOathRequest);
	}

	@Override
	public void clearCache(List<JADSCOathRequest> jadscOathRequests) {
		for (JADSCOathRequest jadscOathRequest : jadscOathRequests) {
			entityCache.removeResult(
				JADSCOathRequestImpl.class, jadscOathRequest);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JADSCOathRequestImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(JADSCOathRequestImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		JADSCOathRequestModelImpl jadscOathRequestModelImpl) {

		Object[] args = new Object[] {
			jadscOathRequestModelImpl.getUuid(),
			jadscOathRequestModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, jadscOathRequestModelImpl);

		args = new Object[] {jadscOathRequestModelImpl.getJadscApplicationId()};

		finderCache.putResult(
			_finderPathCountBygetJADSCById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJADSCById, args, jadscOathRequestModelImpl);
	}

	/**
	 * Creates a new jadsc oath request with the primary key. Does not add the jadsc oath request to the database.
	 *
	 * @param jadscOathRequestId the primary key for the new jadsc oath request
	 * @return the new jadsc oath request
	 */
	@Override
	public JADSCOathRequest create(long jadscOathRequestId) {
		JADSCOathRequest jadscOathRequest = new JADSCOathRequestImpl();

		jadscOathRequest.setNew(true);
		jadscOathRequest.setPrimaryKey(jadscOathRequestId);

		String uuid = PortalUUIDUtil.generate();

		jadscOathRequest.setUuid(uuid);

		jadscOathRequest.setCompanyId(CompanyThreadLocal.getCompanyId());

		return jadscOathRequest;
	}

	/**
	 * Removes the jadsc oath request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscOathRequestId the primary key of the jadsc oath request
	 * @return the jadsc oath request that was removed
	 * @throws NoSuchJADSCOathRequestException if a jadsc oath request with the primary key could not be found
	 */
	@Override
	public JADSCOathRequest remove(long jadscOathRequestId)
		throws NoSuchJADSCOathRequestException {

		return remove((Serializable)jadscOathRequestId);
	}

	/**
	 * Removes the jadsc oath request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jadsc oath request
	 * @return the jadsc oath request that was removed
	 * @throws NoSuchJADSCOathRequestException if a jadsc oath request with the primary key could not be found
	 */
	@Override
	public JADSCOathRequest remove(Serializable primaryKey)
		throws NoSuchJADSCOathRequestException {

		Session session = null;

		try {
			session = openSession();

			JADSCOathRequest jadscOathRequest = (JADSCOathRequest)session.get(
				JADSCOathRequestImpl.class, primaryKey);

			if (jadscOathRequest == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJADSCOathRequestException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(jadscOathRequest);
		}
		catch (NoSuchJADSCOathRequestException noSuchEntityException) {
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
	protected JADSCOathRequest removeImpl(JADSCOathRequest jadscOathRequest) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jadscOathRequest)) {
				jadscOathRequest = (JADSCOathRequest)session.get(
					JADSCOathRequestImpl.class,
					jadscOathRequest.getPrimaryKeyObj());
			}

			if (jadscOathRequest != null) {
				session.delete(jadscOathRequest);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (jadscOathRequest != null) {
			clearCache(jadscOathRequest);
		}

		return jadscOathRequest;
	}

	@Override
	public JADSCOathRequest updateImpl(JADSCOathRequest jadscOathRequest) {
		boolean isNew = jadscOathRequest.isNew();

		if (!(jadscOathRequest instanceof JADSCOathRequestModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(jadscOathRequest.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					jadscOathRequest);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in jadscOathRequest proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JADSCOathRequest implementation " +
					jadscOathRequest.getClass());
		}

		JADSCOathRequestModelImpl jadscOathRequestModelImpl =
			(JADSCOathRequestModelImpl)jadscOathRequest;

		if (Validator.isNull(jadscOathRequest.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			jadscOathRequest.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (jadscOathRequest.getCreateDate() == null)) {
			if (serviceContext == null) {
				jadscOathRequest.setCreateDate(date);
			}
			else {
				jadscOathRequest.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!jadscOathRequestModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				jadscOathRequest.setModifiedDate(date);
			}
			else {
				jadscOathRequest.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(jadscOathRequest);
			}
			else {
				jadscOathRequest = (JADSCOathRequest)session.merge(
					jadscOathRequest);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JADSCOathRequestImpl.class, jadscOathRequestModelImpl, false, true);

		cacheUniqueFindersCache(jadscOathRequestModelImpl);

		if (isNew) {
			jadscOathRequest.setNew(false);
		}

		jadscOathRequest.resetOriginalValues();

		return jadscOathRequest;
	}

	/**
	 * Returns the jadsc oath request with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jadsc oath request
	 * @return the jadsc oath request
	 * @throws NoSuchJADSCOathRequestException if a jadsc oath request with the primary key could not be found
	 */
	@Override
	public JADSCOathRequest findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJADSCOathRequestException {

		JADSCOathRequest jadscOathRequest = fetchByPrimaryKey(primaryKey);

		if (jadscOathRequest == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJADSCOathRequestException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return jadscOathRequest;
	}

	/**
	 * Returns the jadsc oath request with the primary key or throws a <code>NoSuchJADSCOathRequestException</code> if it could not be found.
	 *
	 * @param jadscOathRequestId the primary key of the jadsc oath request
	 * @return the jadsc oath request
	 * @throws NoSuchJADSCOathRequestException if a jadsc oath request with the primary key could not be found
	 */
	@Override
	public JADSCOathRequest findByPrimaryKey(long jadscOathRequestId)
		throws NoSuchJADSCOathRequestException {

		return findByPrimaryKey((Serializable)jadscOathRequestId);
	}

	/**
	 * Returns the jadsc oath request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscOathRequestId the primary key of the jadsc oath request
	 * @return the jadsc oath request, or <code>null</code> if a jadsc oath request with the primary key could not be found
	 */
	@Override
	public JADSCOathRequest fetchByPrimaryKey(long jadscOathRequestId) {
		return fetchByPrimaryKey((Serializable)jadscOathRequestId);
	}

	/**
	 * Returns all the jadsc oath requests.
	 *
	 * @return the jadsc oath requests
	 */
	@Override
	public List<JADSCOathRequest> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc oath requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCOathRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc oath requests
	 * @param end the upper bound of the range of jadsc oath requests (not inclusive)
	 * @return the range of jadsc oath requests
	 */
	@Override
	public List<JADSCOathRequest> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc oath requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCOathRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc oath requests
	 * @param end the upper bound of the range of jadsc oath requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc oath requests
	 */
	@Override
	public List<JADSCOathRequest> findAll(
		int start, int end,
		OrderByComparator<JADSCOathRequest> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc oath requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCOathRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc oath requests
	 * @param end the upper bound of the range of jadsc oath requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc oath requests
	 */
	@Override
	public List<JADSCOathRequest> findAll(
		int start, int end,
		OrderByComparator<JADSCOathRequest> orderByComparator,
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

		List<JADSCOathRequest> list = null;

		if (useFinderCache) {
			list = (List<JADSCOathRequest>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JADSCOATHREQUEST);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JADSCOATHREQUEST;

				sql = sql.concat(JADSCOathRequestModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JADSCOathRequest>)QueryUtil.list(
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
	 * Removes all the jadsc oath requests from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JADSCOathRequest jadscOathRequest : findAll()) {
			remove(jadscOathRequest);
		}
	}

	/**
	 * Returns the number of jadsc oath requests.
	 *
	 * @return the number of jadsc oath requests
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_JADSCOATHREQUEST);

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
		return "jadscOathRequestId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JADSCOATHREQUEST;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JADSCOathRequestModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the jadsc oath request persistence.
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

		_finderPathFetchBygetJADSCById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJADSCById",
			new String[] {Long.class.getName()},
			new String[] {"jadscApplicationId"}, true);

		_finderPathCountBygetJADSCById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJADSCById",
			new String[] {Long.class.getName()},
			new String[] {"jadscApplicationId"}, false);

		JADSCOathRequestUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		JADSCOathRequestUtil.setPersistence(null);

		entityCache.removeCache(JADSCOathRequestImpl.class.getName());
	}

	@Override
	@Reference(
		target = JADSC_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JADSC_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JADSC_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_JADSCOATHREQUEST =
		"SELECT jadscOathRequest FROM JADSCOathRequest jadscOathRequest";

	private static final String _SQL_SELECT_JADSCOATHREQUEST_WHERE =
		"SELECT jadscOathRequest FROM JADSCOathRequest jadscOathRequest WHERE ";

	private static final String _SQL_COUNT_JADSCOATHREQUEST =
		"SELECT COUNT(jadscOathRequest) FROM JADSCOathRequest jadscOathRequest";

	private static final String _SQL_COUNT_JADSCOATHREQUEST_WHERE =
		"SELECT COUNT(jadscOathRequest) FROM JADSCOathRequest jadscOathRequest WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "jadscOathRequest.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JADSCOathRequest exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JADSCOathRequest exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JADSCOathRequestPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}