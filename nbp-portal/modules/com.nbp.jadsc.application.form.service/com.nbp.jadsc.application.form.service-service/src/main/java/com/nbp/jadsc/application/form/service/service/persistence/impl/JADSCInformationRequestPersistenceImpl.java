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

import com.nbp.jadsc.application.form.service.exception.NoSuchJADSCInformationRequestException;
import com.nbp.jadsc.application.form.service.model.JADSCInformationRequest;
import com.nbp.jadsc.application.form.service.model.JADSCInformationRequestTable;
import com.nbp.jadsc.application.form.service.model.impl.JADSCInformationRequestImpl;
import com.nbp.jadsc.application.form.service.model.impl.JADSCInformationRequestModelImpl;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCInformationRequestPersistence;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCInformationRequestUtil;
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
 * The persistence implementation for the jadsc information request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = JADSCInformationRequestPersistence.class)
public class JADSCInformationRequestPersistenceImpl
	extends BasePersistenceImpl<JADSCInformationRequest>
	implements JADSCInformationRequestPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JADSCInformationRequestUtil</code> to access the jadsc information request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JADSCInformationRequestImpl.class.getName();

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
	 * Returns all the jadsc information requests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jadsc information requests
	 */
	@Override
	public List<JADSCInformationRequest> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc information requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCInformationRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc information requests
	 * @param end the upper bound of the range of jadsc information requests (not inclusive)
	 * @return the range of matching jadsc information requests
	 */
	@Override
	public List<JADSCInformationRequest> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc information requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCInformationRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc information requests
	 * @param end the upper bound of the range of jadsc information requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc information requests
	 */
	@Override
	public List<JADSCInformationRequest> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCInformationRequest> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc information requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCInformationRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc information requests
	 * @param end the upper bound of the range of jadsc information requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc information requests
	 */
	@Override
	public List<JADSCInformationRequest> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCInformationRequest> orderByComparator,
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

		List<JADSCInformationRequest> list = null;

		if (useFinderCache) {
			list = (List<JADSCInformationRequest>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JADSCInformationRequest jadscInformationRequest : list) {
					if (!uuid.equals(jadscInformationRequest.getUuid())) {
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

			sb.append(_SQL_SELECT_JADSCINFORMATIONREQUEST_WHERE);

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
				sb.append(JADSCInformationRequestModelImpl.ORDER_BY_JPQL);
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

				list = (List<JADSCInformationRequest>)QueryUtil.list(
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
	 * Returns the first jadsc information request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc information request
	 * @throws NoSuchJADSCInformationRequestException if a matching jadsc information request could not be found
	 */
	@Override
	public JADSCInformationRequest findByUuid_First(
			String uuid,
			OrderByComparator<JADSCInformationRequest> orderByComparator)
		throws NoSuchJADSCInformationRequestException {

		JADSCInformationRequest jadscInformationRequest = fetchByUuid_First(
			uuid, orderByComparator);

		if (jadscInformationRequest != null) {
			return jadscInformationRequest;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchJADSCInformationRequestException(sb.toString());
	}

	/**
	 * Returns the first jadsc information request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc information request, or <code>null</code> if a matching jadsc information request could not be found
	 */
	@Override
	public JADSCInformationRequest fetchByUuid_First(
		String uuid,
		OrderByComparator<JADSCInformationRequest> orderByComparator) {

		List<JADSCInformationRequest> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc information request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc information request
	 * @throws NoSuchJADSCInformationRequestException if a matching jadsc information request could not be found
	 */
	@Override
	public JADSCInformationRequest findByUuid_Last(
			String uuid,
			OrderByComparator<JADSCInformationRequest> orderByComparator)
		throws NoSuchJADSCInformationRequestException {

		JADSCInformationRequest jadscInformationRequest = fetchByUuid_Last(
			uuid, orderByComparator);

		if (jadscInformationRequest != null) {
			return jadscInformationRequest;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchJADSCInformationRequestException(sb.toString());
	}

	/**
	 * Returns the last jadsc information request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc information request, or <code>null</code> if a matching jadsc information request could not be found
	 */
	@Override
	public JADSCInformationRequest fetchByUuid_Last(
		String uuid,
		OrderByComparator<JADSCInformationRequest> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<JADSCInformationRequest> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc information requests before and after the current jadsc information request in the ordered set where uuid = &#63;.
	 *
	 * @param jadscInfoRequestId the primary key of the current jadsc information request
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc information request
	 * @throws NoSuchJADSCInformationRequestException if a jadsc information request with the primary key could not be found
	 */
	@Override
	public JADSCInformationRequest[] findByUuid_PrevAndNext(
			long jadscInfoRequestId, String uuid,
			OrderByComparator<JADSCInformationRequest> orderByComparator)
		throws NoSuchJADSCInformationRequestException {

		uuid = Objects.toString(uuid, "");

		JADSCInformationRequest jadscInformationRequest = findByPrimaryKey(
			jadscInfoRequestId);

		Session session = null;

		try {
			session = openSession();

			JADSCInformationRequest[] array =
				new JADSCInformationRequestImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, jadscInformationRequest, uuid, orderByComparator,
				true);

			array[1] = jadscInformationRequest;

			array[2] = getByUuid_PrevAndNext(
				session, jadscInformationRequest, uuid, orderByComparator,
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

	protected JADSCInformationRequest getByUuid_PrevAndNext(
		Session session, JADSCInformationRequest jadscInformationRequest,
		String uuid,
		OrderByComparator<JADSCInformationRequest> orderByComparator,
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

		sb.append(_SQL_SELECT_JADSCINFORMATIONREQUEST_WHERE);

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
			sb.append(JADSCInformationRequestModelImpl.ORDER_BY_JPQL);
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
						jadscInformationRequest)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JADSCInformationRequest> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc information requests where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (JADSCInformationRequest jadscInformationRequest :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(jadscInformationRequest);
		}
	}

	/**
	 * Returns the number of jadsc information requests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jadsc information requests
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCINFORMATIONREQUEST_WHERE);

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
		"jadscInformationRequest.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(jadscInformationRequest.uuid IS NULL OR jadscInformationRequest.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the jadsc information request where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJADSCInformationRequestException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc information request
	 * @throws NoSuchJADSCInformationRequestException if a matching jadsc information request could not be found
	 */
	@Override
	public JADSCInformationRequest findByUUID_G(String uuid, long groupId)
		throws NoSuchJADSCInformationRequestException {

		JADSCInformationRequest jadscInformationRequest = fetchByUUID_G(
			uuid, groupId);

		if (jadscInformationRequest == null) {
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

			throw new NoSuchJADSCInformationRequestException(sb.toString());
		}

		return jadscInformationRequest;
	}

	/**
	 * Returns the jadsc information request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc information request, or <code>null</code> if a matching jadsc information request could not be found
	 */
	@Override
	public JADSCInformationRequest fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the jadsc information request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc information request, or <code>null</code> if a matching jadsc information request could not be found
	 */
	@Override
	public JADSCInformationRequest fetchByUUID_G(
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

		if (result instanceof JADSCInformationRequest) {
			JADSCInformationRequest jadscInformationRequest =
				(JADSCInformationRequest)result;

			if (!Objects.equals(uuid, jadscInformationRequest.getUuid()) ||
				(groupId != jadscInformationRequest.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_JADSCINFORMATIONREQUEST_WHERE);

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

				List<JADSCInformationRequest> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					JADSCInformationRequest jadscInformationRequest = list.get(
						0);

					result = jadscInformationRequest;

					cacheResult(jadscInformationRequest);
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
			return (JADSCInformationRequest)result;
		}
	}

	/**
	 * Removes the jadsc information request where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jadsc information request that was removed
	 */
	@Override
	public JADSCInformationRequest removeByUUID_G(String uuid, long groupId)
		throws NoSuchJADSCInformationRequestException {

		JADSCInformationRequest jadscInformationRequest = findByUUID_G(
			uuid, groupId);

		return remove(jadscInformationRequest);
	}

	/**
	 * Returns the number of jadsc information requests where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jadsc information requests
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JADSCINFORMATIONREQUEST_WHERE);

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
		"jadscInformationRequest.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(jadscInformationRequest.uuid IS NULL OR jadscInformationRequest.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"jadscInformationRequest.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the jadsc information requests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jadsc information requests
	 */
	@Override
	public List<JADSCInformationRequest> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc information requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCInformationRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc information requests
	 * @param end the upper bound of the range of jadsc information requests (not inclusive)
	 * @return the range of matching jadsc information requests
	 */
	@Override
	public List<JADSCInformationRequest> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc information requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCInformationRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc information requests
	 * @param end the upper bound of the range of jadsc information requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc information requests
	 */
	@Override
	public List<JADSCInformationRequest> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCInformationRequest> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc information requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCInformationRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc information requests
	 * @param end the upper bound of the range of jadsc information requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc information requests
	 */
	@Override
	public List<JADSCInformationRequest> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCInformationRequest> orderByComparator,
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

		List<JADSCInformationRequest> list = null;

		if (useFinderCache) {
			list = (List<JADSCInformationRequest>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JADSCInformationRequest jadscInformationRequest : list) {
					if (!uuid.equals(jadscInformationRequest.getUuid()) ||
						(companyId != jadscInformationRequest.getCompanyId())) {

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

			sb.append(_SQL_SELECT_JADSCINFORMATIONREQUEST_WHERE);

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
				sb.append(JADSCInformationRequestModelImpl.ORDER_BY_JPQL);
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

				list = (List<JADSCInformationRequest>)QueryUtil.list(
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
	 * Returns the first jadsc information request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc information request
	 * @throws NoSuchJADSCInformationRequestException if a matching jadsc information request could not be found
	 */
	@Override
	public JADSCInformationRequest findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<JADSCInformationRequest> orderByComparator)
		throws NoSuchJADSCInformationRequestException {

		JADSCInformationRequest jadscInformationRequest = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (jadscInformationRequest != null) {
			return jadscInformationRequest;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchJADSCInformationRequestException(sb.toString());
	}

	/**
	 * Returns the first jadsc information request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc information request, or <code>null</code> if a matching jadsc information request could not be found
	 */
	@Override
	public JADSCInformationRequest fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<JADSCInformationRequest> orderByComparator) {

		List<JADSCInformationRequest> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc information request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc information request
	 * @throws NoSuchJADSCInformationRequestException if a matching jadsc information request could not be found
	 */
	@Override
	public JADSCInformationRequest findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<JADSCInformationRequest> orderByComparator)
		throws NoSuchJADSCInformationRequestException {

		JADSCInformationRequest jadscInformationRequest = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (jadscInformationRequest != null) {
			return jadscInformationRequest;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchJADSCInformationRequestException(sb.toString());
	}

	/**
	 * Returns the last jadsc information request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc information request, or <code>null</code> if a matching jadsc information request could not be found
	 */
	@Override
	public JADSCInformationRequest fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<JADSCInformationRequest> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<JADSCInformationRequest> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc information requests before and after the current jadsc information request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jadscInfoRequestId the primary key of the current jadsc information request
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc information request
	 * @throws NoSuchJADSCInformationRequestException if a jadsc information request with the primary key could not be found
	 */
	@Override
	public JADSCInformationRequest[] findByUuid_C_PrevAndNext(
			long jadscInfoRequestId, String uuid, long companyId,
			OrderByComparator<JADSCInformationRequest> orderByComparator)
		throws NoSuchJADSCInformationRequestException {

		uuid = Objects.toString(uuid, "");

		JADSCInformationRequest jadscInformationRequest = findByPrimaryKey(
			jadscInfoRequestId);

		Session session = null;

		try {
			session = openSession();

			JADSCInformationRequest[] array =
				new JADSCInformationRequestImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, jadscInformationRequest, uuid, companyId,
				orderByComparator, true);

			array[1] = jadscInformationRequest;

			array[2] = getByUuid_C_PrevAndNext(
				session, jadscInformationRequest, uuid, companyId,
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

	protected JADSCInformationRequest getByUuid_C_PrevAndNext(
		Session session, JADSCInformationRequest jadscInformationRequest,
		String uuid, long companyId,
		OrderByComparator<JADSCInformationRequest> orderByComparator,
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

		sb.append(_SQL_SELECT_JADSCINFORMATIONREQUEST_WHERE);

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
			sb.append(JADSCInformationRequestModelImpl.ORDER_BY_JPQL);
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
						jadscInformationRequest)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JADSCInformationRequest> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc information requests where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (JADSCInformationRequest jadscInformationRequest :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(jadscInformationRequest);
		}
	}

	/**
	 * Returns the number of jadsc information requests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jadsc information requests
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JADSCINFORMATIONREQUEST_WHERE);

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
		"jadscInformationRequest.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(jadscInformationRequest.uuid IS NULL OR jadscInformationRequest.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"jadscInformationRequest.companyId = ?";

	private FinderPath _finderPathFetchBygetJADSCById;
	private FinderPath _finderPathCountBygetJADSCById;

	/**
	 * Returns the jadsc information request where jadscApplicationId = &#63; or throws a <code>NoSuchJADSCInformationRequestException</code> if it could not be found.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc information request
	 * @throws NoSuchJADSCInformationRequestException if a matching jadsc information request could not be found
	 */
	@Override
	public JADSCInformationRequest findBygetJADSCById(long jadscApplicationId)
		throws NoSuchJADSCInformationRequestException {

		JADSCInformationRequest jadscInformationRequest = fetchBygetJADSCById(
			jadscApplicationId);

		if (jadscInformationRequest == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jadscApplicationId=");
			sb.append(jadscApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJADSCInformationRequestException(sb.toString());
		}

		return jadscInformationRequest;
	}

	/**
	 * Returns the jadsc information request where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc information request, or <code>null</code> if a matching jadsc information request could not be found
	 */
	@Override
	public JADSCInformationRequest fetchBygetJADSCById(
		long jadscApplicationId) {

		return fetchBygetJADSCById(jadscApplicationId, true);
	}

	/**
	 * Returns the jadsc information request where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc information request, or <code>null</code> if a matching jadsc information request could not be found
	 */
	@Override
	public JADSCInformationRequest fetchBygetJADSCById(
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

		if (result instanceof JADSCInformationRequest) {
			JADSCInformationRequest jadscInformationRequest =
				(JADSCInformationRequest)result;

			if (jadscApplicationId !=
					jadscInformationRequest.getJadscApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JADSCINFORMATIONREQUEST_WHERE);

			sb.append(_FINDER_COLUMN_GETJADSCBYID_JADSCAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jadscApplicationId);

				List<JADSCInformationRequest> list = query.list();

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
								"JADSCInformationRequestPersistenceImpl.fetchBygetJADSCById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JADSCInformationRequest jadscInformationRequest = list.get(
						0);

					result = jadscInformationRequest;

					cacheResult(jadscInformationRequest);
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
			return (JADSCInformationRequest)result;
		}
	}

	/**
	 * Removes the jadsc information request where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the jadsc information request that was removed
	 */
	@Override
	public JADSCInformationRequest removeBygetJADSCById(long jadscApplicationId)
		throws NoSuchJADSCInformationRequestException {

		JADSCInformationRequest jadscInformationRequest = findBygetJADSCById(
			jadscApplicationId);

		return remove(jadscInformationRequest);
	}

	/**
	 * Returns the number of jadsc information requests where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc information requests
	 */
	@Override
	public int countBygetJADSCById(long jadscApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJADSCById;

		Object[] finderArgs = new Object[] {jadscApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCINFORMATIONREQUEST_WHERE);

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
			"jadscInformationRequest.jadscApplicationId = ?";

	public JADSCInformationRequestPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(JADSCInformationRequest.class);

		setModelImplClass(JADSCInformationRequestImpl.class);
		setModelPKClass(long.class);

		setTable(JADSCInformationRequestTable.INSTANCE);
	}

	/**
	 * Caches the jadsc information request in the entity cache if it is enabled.
	 *
	 * @param jadscInformationRequest the jadsc information request
	 */
	@Override
	public void cacheResult(JADSCInformationRequest jadscInformationRequest) {
		entityCache.putResult(
			JADSCInformationRequestImpl.class,
			jadscInformationRequest.getPrimaryKey(), jadscInformationRequest);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				jadscInformationRequest.getUuid(),
				jadscInformationRequest.getGroupId()
			},
			jadscInformationRequest);

		finderCache.putResult(
			_finderPathFetchBygetJADSCById,
			new Object[] {jadscInformationRequest.getJadscApplicationId()},
			jadscInformationRequest);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the jadsc information requests in the entity cache if it is enabled.
	 *
	 * @param jadscInformationRequests the jadsc information requests
	 */
	@Override
	public void cacheResult(
		List<JADSCInformationRequest> jadscInformationRequests) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (jadscInformationRequests.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JADSCInformationRequest jadscInformationRequest :
				jadscInformationRequests) {

			if (entityCache.getResult(
					JADSCInformationRequestImpl.class,
					jadscInformationRequest.getPrimaryKey()) == null) {

				cacheResult(jadscInformationRequest);
			}
		}
	}

	/**
	 * Clears the cache for all jadsc information requests.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JADSCInformationRequestImpl.class);

		finderCache.clearCache(JADSCInformationRequestImpl.class);
	}

	/**
	 * Clears the cache for the jadsc information request.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JADSCInformationRequest jadscInformationRequest) {
		entityCache.removeResult(
			JADSCInformationRequestImpl.class, jadscInformationRequest);
	}

	@Override
	public void clearCache(
		List<JADSCInformationRequest> jadscInformationRequests) {

		for (JADSCInformationRequest jadscInformationRequest :
				jadscInformationRequests) {

			entityCache.removeResult(
				JADSCInformationRequestImpl.class, jadscInformationRequest);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JADSCInformationRequestImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				JADSCInformationRequestImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		JADSCInformationRequestModelImpl jadscInformationRequestModelImpl) {

		Object[] args = new Object[] {
			jadscInformationRequestModelImpl.getUuid(),
			jadscInformationRequestModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, jadscInformationRequestModelImpl);

		args = new Object[] {
			jadscInformationRequestModelImpl.getJadscApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetJADSCById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJADSCById, args,
			jadscInformationRequestModelImpl);
	}

	/**
	 * Creates a new jadsc information request with the primary key. Does not add the jadsc information request to the database.
	 *
	 * @param jadscInfoRequestId the primary key for the new jadsc information request
	 * @return the new jadsc information request
	 */
	@Override
	public JADSCInformationRequest create(long jadscInfoRequestId) {
		JADSCInformationRequest jadscInformationRequest =
			new JADSCInformationRequestImpl();

		jadscInformationRequest.setNew(true);
		jadscInformationRequest.setPrimaryKey(jadscInfoRequestId);

		String uuid = PortalUUIDUtil.generate();

		jadscInformationRequest.setUuid(uuid);

		jadscInformationRequest.setCompanyId(CompanyThreadLocal.getCompanyId());

		return jadscInformationRequest;
	}

	/**
	 * Removes the jadsc information request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscInfoRequestId the primary key of the jadsc information request
	 * @return the jadsc information request that was removed
	 * @throws NoSuchJADSCInformationRequestException if a jadsc information request with the primary key could not be found
	 */
	@Override
	public JADSCInformationRequest remove(long jadscInfoRequestId)
		throws NoSuchJADSCInformationRequestException {

		return remove((Serializable)jadscInfoRequestId);
	}

	/**
	 * Removes the jadsc information request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jadsc information request
	 * @return the jadsc information request that was removed
	 * @throws NoSuchJADSCInformationRequestException if a jadsc information request with the primary key could not be found
	 */
	@Override
	public JADSCInformationRequest remove(Serializable primaryKey)
		throws NoSuchJADSCInformationRequestException {

		Session session = null;

		try {
			session = openSession();

			JADSCInformationRequest jadscInformationRequest =
				(JADSCInformationRequest)session.get(
					JADSCInformationRequestImpl.class, primaryKey);

			if (jadscInformationRequest == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJADSCInformationRequestException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(jadscInformationRequest);
		}
		catch (NoSuchJADSCInformationRequestException noSuchEntityException) {
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
	protected JADSCInformationRequest removeImpl(
		JADSCInformationRequest jadscInformationRequest) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jadscInformationRequest)) {
				jadscInformationRequest = (JADSCInformationRequest)session.get(
					JADSCInformationRequestImpl.class,
					jadscInformationRequest.getPrimaryKeyObj());
			}

			if (jadscInformationRequest != null) {
				session.delete(jadscInformationRequest);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (jadscInformationRequest != null) {
			clearCache(jadscInformationRequest);
		}

		return jadscInformationRequest;
	}

	@Override
	public JADSCInformationRequest updateImpl(
		JADSCInformationRequest jadscInformationRequest) {

		boolean isNew = jadscInformationRequest.isNew();

		if (!(jadscInformationRequest instanceof
				JADSCInformationRequestModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(jadscInformationRequest.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					jadscInformationRequest);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in jadscInformationRequest proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JADSCInformationRequest implementation " +
					jadscInformationRequest.getClass());
		}

		JADSCInformationRequestModelImpl jadscInformationRequestModelImpl =
			(JADSCInformationRequestModelImpl)jadscInformationRequest;

		if (Validator.isNull(jadscInformationRequest.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			jadscInformationRequest.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (jadscInformationRequest.getCreateDate() == null)) {
			if (serviceContext == null) {
				jadscInformationRequest.setCreateDate(date);
			}
			else {
				jadscInformationRequest.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!jadscInformationRequestModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				jadscInformationRequest.setModifiedDate(date);
			}
			else {
				jadscInformationRequest.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(jadscInformationRequest);
			}
			else {
				jadscInformationRequest =
					(JADSCInformationRequest)session.merge(
						jadscInformationRequest);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JADSCInformationRequestImpl.class, jadscInformationRequestModelImpl,
			false, true);

		cacheUniqueFindersCache(jadscInformationRequestModelImpl);

		if (isNew) {
			jadscInformationRequest.setNew(false);
		}

		jadscInformationRequest.resetOriginalValues();

		return jadscInformationRequest;
	}

	/**
	 * Returns the jadsc information request with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jadsc information request
	 * @return the jadsc information request
	 * @throws NoSuchJADSCInformationRequestException if a jadsc information request with the primary key could not be found
	 */
	@Override
	public JADSCInformationRequest findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJADSCInformationRequestException {

		JADSCInformationRequest jadscInformationRequest = fetchByPrimaryKey(
			primaryKey);

		if (jadscInformationRequest == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJADSCInformationRequestException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return jadscInformationRequest;
	}

	/**
	 * Returns the jadsc information request with the primary key or throws a <code>NoSuchJADSCInformationRequestException</code> if it could not be found.
	 *
	 * @param jadscInfoRequestId the primary key of the jadsc information request
	 * @return the jadsc information request
	 * @throws NoSuchJADSCInformationRequestException if a jadsc information request with the primary key could not be found
	 */
	@Override
	public JADSCInformationRequest findByPrimaryKey(long jadscInfoRequestId)
		throws NoSuchJADSCInformationRequestException {

		return findByPrimaryKey((Serializable)jadscInfoRequestId);
	}

	/**
	 * Returns the jadsc information request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscInfoRequestId the primary key of the jadsc information request
	 * @return the jadsc information request, or <code>null</code> if a jadsc information request with the primary key could not be found
	 */
	@Override
	public JADSCInformationRequest fetchByPrimaryKey(long jadscInfoRequestId) {
		return fetchByPrimaryKey((Serializable)jadscInfoRequestId);
	}

	/**
	 * Returns all the jadsc information requests.
	 *
	 * @return the jadsc information requests
	 */
	@Override
	public List<JADSCInformationRequest> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc information requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCInformationRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc information requests
	 * @param end the upper bound of the range of jadsc information requests (not inclusive)
	 * @return the range of jadsc information requests
	 */
	@Override
	public List<JADSCInformationRequest> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc information requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCInformationRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc information requests
	 * @param end the upper bound of the range of jadsc information requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc information requests
	 */
	@Override
	public List<JADSCInformationRequest> findAll(
		int start, int end,
		OrderByComparator<JADSCInformationRequest> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc information requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCInformationRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc information requests
	 * @param end the upper bound of the range of jadsc information requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc information requests
	 */
	@Override
	public List<JADSCInformationRequest> findAll(
		int start, int end,
		OrderByComparator<JADSCInformationRequest> orderByComparator,
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

		List<JADSCInformationRequest> list = null;

		if (useFinderCache) {
			list = (List<JADSCInformationRequest>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JADSCINFORMATIONREQUEST);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JADSCINFORMATIONREQUEST;

				sql = sql.concat(
					JADSCInformationRequestModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JADSCInformationRequest>)QueryUtil.list(
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
	 * Removes all the jadsc information requests from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JADSCInformationRequest jadscInformationRequest : findAll()) {
			remove(jadscInformationRequest);
		}
	}

	/**
	 * Returns the number of jadsc information requests.
	 *
	 * @return the number of jadsc information requests
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
					_SQL_COUNT_JADSCINFORMATIONREQUEST);

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
		return "jadscInfoRequestId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JADSCINFORMATIONREQUEST;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JADSCInformationRequestModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the jadsc information request persistence.
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

		JADSCInformationRequestUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		JADSCInformationRequestUtil.setPersistence(null);

		entityCache.removeCache(JADSCInformationRequestImpl.class.getName());
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

	private static final String _SQL_SELECT_JADSCINFORMATIONREQUEST =
		"SELECT jadscInformationRequest FROM JADSCInformationRequest jadscInformationRequest";

	private static final String _SQL_SELECT_JADSCINFORMATIONREQUEST_WHERE =
		"SELECT jadscInformationRequest FROM JADSCInformationRequest jadscInformationRequest WHERE ";

	private static final String _SQL_COUNT_JADSCINFORMATIONREQUEST =
		"SELECT COUNT(jadscInformationRequest) FROM JADSCInformationRequest jadscInformationRequest";

	private static final String _SQL_COUNT_JADSCINFORMATIONREQUEST_WHERE =
		"SELECT COUNT(jadscInformationRequest) FROM JADSCInformationRequest jadscInformationRequest WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"jadscInformationRequest.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JADSCInformationRequest exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JADSCInformationRequest exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JADSCInformationRequestPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}