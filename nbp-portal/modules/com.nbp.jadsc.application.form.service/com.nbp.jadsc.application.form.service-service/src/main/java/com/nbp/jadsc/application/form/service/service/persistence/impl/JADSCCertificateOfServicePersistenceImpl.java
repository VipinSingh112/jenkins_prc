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

import com.nbp.jadsc.application.form.service.exception.NoSuchJADSCCertificateOfServiceException;
import com.nbp.jadsc.application.form.service.model.JADSCCertificateOfService;
import com.nbp.jadsc.application.form.service.model.JADSCCertificateOfServiceTable;
import com.nbp.jadsc.application.form.service.model.impl.JADSCCertificateOfServiceImpl;
import com.nbp.jadsc.application.form.service.model.impl.JADSCCertificateOfServiceModelImpl;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCCertificateOfServicePersistence;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCCertificateOfServiceUtil;
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
 * The persistence implementation for the jadsc certificate of service service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = JADSCCertificateOfServicePersistence.class)
public class JADSCCertificateOfServicePersistenceImpl
	extends BasePersistenceImpl<JADSCCertificateOfService>
	implements JADSCCertificateOfServicePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JADSCCertificateOfServiceUtil</code> to access the jadsc certificate of service persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JADSCCertificateOfServiceImpl.class.getName();

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
	 * Returns all the jadsc certificate of services where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jadsc certificate of services
	 */
	@Override
	public List<JADSCCertificateOfService> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc certificate of services where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc certificate of services
	 * @param end the upper bound of the range of jadsc certificate of services (not inclusive)
	 * @return the range of matching jadsc certificate of services
	 */
	@Override
	public List<JADSCCertificateOfService> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of services where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc certificate of services
	 * @param end the upper bound of the range of jadsc certificate of services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc certificate of services
	 */
	@Override
	public List<JADSCCertificateOfService> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCCertificateOfService> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of services where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc certificate of services
	 * @param end the upper bound of the range of jadsc certificate of services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc certificate of services
	 */
	@Override
	public List<JADSCCertificateOfService> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCCertificateOfService> orderByComparator,
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

		List<JADSCCertificateOfService> list = null;

		if (useFinderCache) {
			list = (List<JADSCCertificateOfService>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JADSCCertificateOfService jadscCertificateOfService :
						list) {

					if (!uuid.equals(jadscCertificateOfService.getUuid())) {
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

			sb.append(_SQL_SELECT_JADSCCERTIFICATEOFSERVICE_WHERE);

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
				sb.append(JADSCCertificateOfServiceModelImpl.ORDER_BY_JPQL);
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

				list = (List<JADSCCertificateOfService>)QueryUtil.list(
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
	 * Returns the first jadsc certificate of service in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of service
	 * @throws NoSuchJADSCCertificateOfServiceException if a matching jadsc certificate of service could not be found
	 */
	@Override
	public JADSCCertificateOfService findByUuid_First(
			String uuid,
			OrderByComparator<JADSCCertificateOfService> orderByComparator)
		throws NoSuchJADSCCertificateOfServiceException {

		JADSCCertificateOfService jadscCertificateOfService = fetchByUuid_First(
			uuid, orderByComparator);

		if (jadscCertificateOfService != null) {
			return jadscCertificateOfService;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchJADSCCertificateOfServiceException(sb.toString());
	}

	/**
	 * Returns the first jadsc certificate of service in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of service, or <code>null</code> if a matching jadsc certificate of service could not be found
	 */
	@Override
	public JADSCCertificateOfService fetchByUuid_First(
		String uuid,
		OrderByComparator<JADSCCertificateOfService> orderByComparator) {

		List<JADSCCertificateOfService> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc certificate of service in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of service
	 * @throws NoSuchJADSCCertificateOfServiceException if a matching jadsc certificate of service could not be found
	 */
	@Override
	public JADSCCertificateOfService findByUuid_Last(
			String uuid,
			OrderByComparator<JADSCCertificateOfService> orderByComparator)
		throws NoSuchJADSCCertificateOfServiceException {

		JADSCCertificateOfService jadscCertificateOfService = fetchByUuid_Last(
			uuid, orderByComparator);

		if (jadscCertificateOfService != null) {
			return jadscCertificateOfService;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchJADSCCertificateOfServiceException(sb.toString());
	}

	/**
	 * Returns the last jadsc certificate of service in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of service, or <code>null</code> if a matching jadsc certificate of service could not be found
	 */
	@Override
	public JADSCCertificateOfService fetchByUuid_Last(
		String uuid,
		OrderByComparator<JADSCCertificateOfService> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<JADSCCertificateOfService> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc certificate of services before and after the current jadsc certificate of service in the ordered set where uuid = &#63;.
	 *
	 * @param jadscCOSId the primary key of the current jadsc certificate of service
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc certificate of service
	 * @throws NoSuchJADSCCertificateOfServiceException if a jadsc certificate of service with the primary key could not be found
	 */
	@Override
	public JADSCCertificateOfService[] findByUuid_PrevAndNext(
			long jadscCOSId, String uuid,
			OrderByComparator<JADSCCertificateOfService> orderByComparator)
		throws NoSuchJADSCCertificateOfServiceException {

		uuid = Objects.toString(uuid, "");

		JADSCCertificateOfService jadscCertificateOfService = findByPrimaryKey(
			jadscCOSId);

		Session session = null;

		try {
			session = openSession();

			JADSCCertificateOfService[] array =
				new JADSCCertificateOfServiceImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, jadscCertificateOfService, uuid, orderByComparator,
				true);

			array[1] = jadscCertificateOfService;

			array[2] = getByUuid_PrevAndNext(
				session, jadscCertificateOfService, uuid, orderByComparator,
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

	protected JADSCCertificateOfService getByUuid_PrevAndNext(
		Session session, JADSCCertificateOfService jadscCertificateOfService,
		String uuid,
		OrderByComparator<JADSCCertificateOfService> orderByComparator,
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

		sb.append(_SQL_SELECT_JADSCCERTIFICATEOFSERVICE_WHERE);

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
			sb.append(JADSCCertificateOfServiceModelImpl.ORDER_BY_JPQL);
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
						jadscCertificateOfService)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JADSCCertificateOfService> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc certificate of services where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (JADSCCertificateOfService jadscCertificateOfService :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(jadscCertificateOfService);
		}
	}

	/**
	 * Returns the number of jadsc certificate of services where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jadsc certificate of services
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCCERTIFICATEOFSERVICE_WHERE);

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
		"jadscCertificateOfService.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(jadscCertificateOfService.uuid IS NULL OR jadscCertificateOfService.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the jadsc certificate of service where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJADSCCertificateOfServiceException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc certificate of service
	 * @throws NoSuchJADSCCertificateOfServiceException if a matching jadsc certificate of service could not be found
	 */
	@Override
	public JADSCCertificateOfService findByUUID_G(String uuid, long groupId)
		throws NoSuchJADSCCertificateOfServiceException {

		JADSCCertificateOfService jadscCertificateOfService = fetchByUUID_G(
			uuid, groupId);

		if (jadscCertificateOfService == null) {
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

			throw new NoSuchJADSCCertificateOfServiceException(sb.toString());
		}

		return jadscCertificateOfService;
	}

	/**
	 * Returns the jadsc certificate of service where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc certificate of service, or <code>null</code> if a matching jadsc certificate of service could not be found
	 */
	@Override
	public JADSCCertificateOfService fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the jadsc certificate of service where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc certificate of service, or <code>null</code> if a matching jadsc certificate of service could not be found
	 */
	@Override
	public JADSCCertificateOfService fetchByUUID_G(
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

		if (result instanceof JADSCCertificateOfService) {
			JADSCCertificateOfService jadscCertificateOfService =
				(JADSCCertificateOfService)result;

			if (!Objects.equals(uuid, jadscCertificateOfService.getUuid()) ||
				(groupId != jadscCertificateOfService.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_JADSCCERTIFICATEOFSERVICE_WHERE);

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

				List<JADSCCertificateOfService> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					JADSCCertificateOfService jadscCertificateOfService =
						list.get(0);

					result = jadscCertificateOfService;

					cacheResult(jadscCertificateOfService);
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
			return (JADSCCertificateOfService)result;
		}
	}

	/**
	 * Removes the jadsc certificate of service where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jadsc certificate of service that was removed
	 */
	@Override
	public JADSCCertificateOfService removeByUUID_G(String uuid, long groupId)
		throws NoSuchJADSCCertificateOfServiceException {

		JADSCCertificateOfService jadscCertificateOfService = findByUUID_G(
			uuid, groupId);

		return remove(jadscCertificateOfService);
	}

	/**
	 * Returns the number of jadsc certificate of services where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jadsc certificate of services
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JADSCCERTIFICATEOFSERVICE_WHERE);

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
		"jadscCertificateOfService.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(jadscCertificateOfService.uuid IS NULL OR jadscCertificateOfService.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"jadscCertificateOfService.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the jadsc certificate of services where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jadsc certificate of services
	 */
	@Override
	public List<JADSCCertificateOfService> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc certificate of services where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc certificate of services
	 * @param end the upper bound of the range of jadsc certificate of services (not inclusive)
	 * @return the range of matching jadsc certificate of services
	 */
	@Override
	public List<JADSCCertificateOfService> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of services where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc certificate of services
	 * @param end the upper bound of the range of jadsc certificate of services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc certificate of services
	 */
	@Override
	public List<JADSCCertificateOfService> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCCertificateOfService> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of services where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc certificate of services
	 * @param end the upper bound of the range of jadsc certificate of services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc certificate of services
	 */
	@Override
	public List<JADSCCertificateOfService> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCCertificateOfService> orderByComparator,
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

		List<JADSCCertificateOfService> list = null;

		if (useFinderCache) {
			list = (List<JADSCCertificateOfService>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JADSCCertificateOfService jadscCertificateOfService :
						list) {

					if (!uuid.equals(jadscCertificateOfService.getUuid()) ||
						(companyId !=
							jadscCertificateOfService.getCompanyId())) {

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

			sb.append(_SQL_SELECT_JADSCCERTIFICATEOFSERVICE_WHERE);

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
				sb.append(JADSCCertificateOfServiceModelImpl.ORDER_BY_JPQL);
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

				list = (List<JADSCCertificateOfService>)QueryUtil.list(
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
	 * Returns the first jadsc certificate of service in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of service
	 * @throws NoSuchJADSCCertificateOfServiceException if a matching jadsc certificate of service could not be found
	 */
	@Override
	public JADSCCertificateOfService findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<JADSCCertificateOfService> orderByComparator)
		throws NoSuchJADSCCertificateOfServiceException {

		JADSCCertificateOfService jadscCertificateOfService =
			fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (jadscCertificateOfService != null) {
			return jadscCertificateOfService;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchJADSCCertificateOfServiceException(sb.toString());
	}

	/**
	 * Returns the first jadsc certificate of service in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of service, or <code>null</code> if a matching jadsc certificate of service could not be found
	 */
	@Override
	public JADSCCertificateOfService fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<JADSCCertificateOfService> orderByComparator) {

		List<JADSCCertificateOfService> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc certificate of service in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of service
	 * @throws NoSuchJADSCCertificateOfServiceException if a matching jadsc certificate of service could not be found
	 */
	@Override
	public JADSCCertificateOfService findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<JADSCCertificateOfService> orderByComparator)
		throws NoSuchJADSCCertificateOfServiceException {

		JADSCCertificateOfService jadscCertificateOfService =
			fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (jadscCertificateOfService != null) {
			return jadscCertificateOfService;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchJADSCCertificateOfServiceException(sb.toString());
	}

	/**
	 * Returns the last jadsc certificate of service in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of service, or <code>null</code> if a matching jadsc certificate of service could not be found
	 */
	@Override
	public JADSCCertificateOfService fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<JADSCCertificateOfService> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<JADSCCertificateOfService> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc certificate of services before and after the current jadsc certificate of service in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jadscCOSId the primary key of the current jadsc certificate of service
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc certificate of service
	 * @throws NoSuchJADSCCertificateOfServiceException if a jadsc certificate of service with the primary key could not be found
	 */
	@Override
	public JADSCCertificateOfService[] findByUuid_C_PrevAndNext(
			long jadscCOSId, String uuid, long companyId,
			OrderByComparator<JADSCCertificateOfService> orderByComparator)
		throws NoSuchJADSCCertificateOfServiceException {

		uuid = Objects.toString(uuid, "");

		JADSCCertificateOfService jadscCertificateOfService = findByPrimaryKey(
			jadscCOSId);

		Session session = null;

		try {
			session = openSession();

			JADSCCertificateOfService[] array =
				new JADSCCertificateOfServiceImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, jadscCertificateOfService, uuid, companyId,
				orderByComparator, true);

			array[1] = jadscCertificateOfService;

			array[2] = getByUuid_C_PrevAndNext(
				session, jadscCertificateOfService, uuid, companyId,
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

	protected JADSCCertificateOfService getByUuid_C_PrevAndNext(
		Session session, JADSCCertificateOfService jadscCertificateOfService,
		String uuid, long companyId,
		OrderByComparator<JADSCCertificateOfService> orderByComparator,
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

		sb.append(_SQL_SELECT_JADSCCERTIFICATEOFSERVICE_WHERE);

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
			sb.append(JADSCCertificateOfServiceModelImpl.ORDER_BY_JPQL);
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
						jadscCertificateOfService)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JADSCCertificateOfService> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc certificate of services where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (JADSCCertificateOfService jadscCertificateOfService :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(jadscCertificateOfService);
		}
	}

	/**
	 * Returns the number of jadsc certificate of services where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jadsc certificate of services
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JADSCCERTIFICATEOFSERVICE_WHERE);

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
		"jadscCertificateOfService.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(jadscCertificateOfService.uuid IS NULL OR jadscCertificateOfService.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"jadscCertificateOfService.companyId = ?";

	private FinderPath _finderPathFetchBygetJADSCById;
	private FinderPath _finderPathCountBygetJADSCById;

	/**
	 * Returns the jadsc certificate of service where jadscApplicationId = &#63; or throws a <code>NoSuchJADSCCertificateOfServiceException</code> if it could not be found.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc certificate of service
	 * @throws NoSuchJADSCCertificateOfServiceException if a matching jadsc certificate of service could not be found
	 */
	@Override
	public JADSCCertificateOfService findBygetJADSCById(long jadscApplicationId)
		throws NoSuchJADSCCertificateOfServiceException {

		JADSCCertificateOfService jadscCertificateOfService =
			fetchBygetJADSCById(jadscApplicationId);

		if (jadscCertificateOfService == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jadscApplicationId=");
			sb.append(jadscApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJADSCCertificateOfServiceException(sb.toString());
		}

		return jadscCertificateOfService;
	}

	/**
	 * Returns the jadsc certificate of service where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc certificate of service, or <code>null</code> if a matching jadsc certificate of service could not be found
	 */
	@Override
	public JADSCCertificateOfService fetchBygetJADSCById(
		long jadscApplicationId) {

		return fetchBygetJADSCById(jadscApplicationId, true);
	}

	/**
	 * Returns the jadsc certificate of service where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc certificate of service, or <code>null</code> if a matching jadsc certificate of service could not be found
	 */
	@Override
	public JADSCCertificateOfService fetchBygetJADSCById(
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

		if (result instanceof JADSCCertificateOfService) {
			JADSCCertificateOfService jadscCertificateOfService =
				(JADSCCertificateOfService)result;

			if (jadscApplicationId !=
					jadscCertificateOfService.getJadscApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JADSCCERTIFICATEOFSERVICE_WHERE);

			sb.append(_FINDER_COLUMN_GETJADSCBYID_JADSCAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jadscApplicationId);

				List<JADSCCertificateOfService> list = query.list();

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
								"JADSCCertificateOfServicePersistenceImpl.fetchBygetJADSCById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JADSCCertificateOfService jadscCertificateOfService =
						list.get(0);

					result = jadscCertificateOfService;

					cacheResult(jadscCertificateOfService);
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
			return (JADSCCertificateOfService)result;
		}
	}

	/**
	 * Removes the jadsc certificate of service where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the jadsc certificate of service that was removed
	 */
	@Override
	public JADSCCertificateOfService removeBygetJADSCById(
			long jadscApplicationId)
		throws NoSuchJADSCCertificateOfServiceException {

		JADSCCertificateOfService jadscCertificateOfService =
			findBygetJADSCById(jadscApplicationId);

		return remove(jadscCertificateOfService);
	}

	/**
	 * Returns the number of jadsc certificate of services where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc certificate of services
	 */
	@Override
	public int countBygetJADSCById(long jadscApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJADSCById;

		Object[] finderArgs = new Object[] {jadscApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCCERTIFICATEOFSERVICE_WHERE);

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
			"jadscCertificateOfService.jadscApplicationId = ?";

	public JADSCCertificateOfServicePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(JADSCCertificateOfService.class);

		setModelImplClass(JADSCCertificateOfServiceImpl.class);
		setModelPKClass(long.class);

		setTable(JADSCCertificateOfServiceTable.INSTANCE);
	}

	/**
	 * Caches the jadsc certificate of service in the entity cache if it is enabled.
	 *
	 * @param jadscCertificateOfService the jadsc certificate of service
	 */
	@Override
	public void cacheResult(
		JADSCCertificateOfService jadscCertificateOfService) {

		entityCache.putResult(
			JADSCCertificateOfServiceImpl.class,
			jadscCertificateOfService.getPrimaryKey(),
			jadscCertificateOfService);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				jadscCertificateOfService.getUuid(),
				jadscCertificateOfService.getGroupId()
			},
			jadscCertificateOfService);

		finderCache.putResult(
			_finderPathFetchBygetJADSCById,
			new Object[] {jadscCertificateOfService.getJadscApplicationId()},
			jadscCertificateOfService);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the jadsc certificate of services in the entity cache if it is enabled.
	 *
	 * @param jadscCertificateOfServices the jadsc certificate of services
	 */
	@Override
	public void cacheResult(
		List<JADSCCertificateOfService> jadscCertificateOfServices) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (jadscCertificateOfServices.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JADSCCertificateOfService jadscCertificateOfService :
				jadscCertificateOfServices) {

			if (entityCache.getResult(
					JADSCCertificateOfServiceImpl.class,
					jadscCertificateOfService.getPrimaryKey()) == null) {

				cacheResult(jadscCertificateOfService);
			}
		}
	}

	/**
	 * Clears the cache for all jadsc certificate of services.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JADSCCertificateOfServiceImpl.class);

		finderCache.clearCache(JADSCCertificateOfServiceImpl.class);
	}

	/**
	 * Clears the cache for the jadsc certificate of service.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		JADSCCertificateOfService jadscCertificateOfService) {

		entityCache.removeResult(
			JADSCCertificateOfServiceImpl.class, jadscCertificateOfService);
	}

	@Override
	public void clearCache(
		List<JADSCCertificateOfService> jadscCertificateOfServices) {

		for (JADSCCertificateOfService jadscCertificateOfService :
				jadscCertificateOfServices) {

			entityCache.removeResult(
				JADSCCertificateOfServiceImpl.class, jadscCertificateOfService);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JADSCCertificateOfServiceImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				JADSCCertificateOfServiceImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		JADSCCertificateOfServiceModelImpl jadscCertificateOfServiceModelImpl) {

		Object[] args = new Object[] {
			jadscCertificateOfServiceModelImpl.getUuid(),
			jadscCertificateOfServiceModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, jadscCertificateOfServiceModelImpl);

		args = new Object[] {
			jadscCertificateOfServiceModelImpl.getJadscApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetJADSCById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJADSCById, args,
			jadscCertificateOfServiceModelImpl);
	}

	/**
	 * Creates a new jadsc certificate of service with the primary key. Does not add the jadsc certificate of service to the database.
	 *
	 * @param jadscCOSId the primary key for the new jadsc certificate of service
	 * @return the new jadsc certificate of service
	 */
	@Override
	public JADSCCertificateOfService create(long jadscCOSId) {
		JADSCCertificateOfService jadscCertificateOfService =
			new JADSCCertificateOfServiceImpl();

		jadscCertificateOfService.setNew(true);
		jadscCertificateOfService.setPrimaryKey(jadscCOSId);

		String uuid = PortalUUIDUtil.generate();

		jadscCertificateOfService.setUuid(uuid);

		jadscCertificateOfService.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return jadscCertificateOfService;
	}

	/**
	 * Removes the jadsc certificate of service with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscCOSId the primary key of the jadsc certificate of service
	 * @return the jadsc certificate of service that was removed
	 * @throws NoSuchJADSCCertificateOfServiceException if a jadsc certificate of service with the primary key could not be found
	 */
	@Override
	public JADSCCertificateOfService remove(long jadscCOSId)
		throws NoSuchJADSCCertificateOfServiceException {

		return remove((Serializable)jadscCOSId);
	}

	/**
	 * Removes the jadsc certificate of service with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jadsc certificate of service
	 * @return the jadsc certificate of service that was removed
	 * @throws NoSuchJADSCCertificateOfServiceException if a jadsc certificate of service with the primary key could not be found
	 */
	@Override
	public JADSCCertificateOfService remove(Serializable primaryKey)
		throws NoSuchJADSCCertificateOfServiceException {

		Session session = null;

		try {
			session = openSession();

			JADSCCertificateOfService jadscCertificateOfService =
				(JADSCCertificateOfService)session.get(
					JADSCCertificateOfServiceImpl.class, primaryKey);

			if (jadscCertificateOfService == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJADSCCertificateOfServiceException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(jadscCertificateOfService);
		}
		catch (NoSuchJADSCCertificateOfServiceException noSuchEntityException) {
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
	protected JADSCCertificateOfService removeImpl(
		JADSCCertificateOfService jadscCertificateOfService) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jadscCertificateOfService)) {
				jadscCertificateOfService =
					(JADSCCertificateOfService)session.get(
						JADSCCertificateOfServiceImpl.class,
						jadscCertificateOfService.getPrimaryKeyObj());
			}

			if (jadscCertificateOfService != null) {
				session.delete(jadscCertificateOfService);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (jadscCertificateOfService != null) {
			clearCache(jadscCertificateOfService);
		}

		return jadscCertificateOfService;
	}

	@Override
	public JADSCCertificateOfService updateImpl(
		JADSCCertificateOfService jadscCertificateOfService) {

		boolean isNew = jadscCertificateOfService.isNew();

		if (!(jadscCertificateOfService instanceof
				JADSCCertificateOfServiceModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(jadscCertificateOfService.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					jadscCertificateOfService);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in jadscCertificateOfService proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JADSCCertificateOfService implementation " +
					jadscCertificateOfService.getClass());
		}

		JADSCCertificateOfServiceModelImpl jadscCertificateOfServiceModelImpl =
			(JADSCCertificateOfServiceModelImpl)jadscCertificateOfService;

		if (Validator.isNull(jadscCertificateOfService.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			jadscCertificateOfService.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (jadscCertificateOfService.getCreateDate() == null)) {
			if (serviceContext == null) {
				jadscCertificateOfService.setCreateDate(date);
			}
			else {
				jadscCertificateOfService.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!jadscCertificateOfServiceModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				jadscCertificateOfService.setModifiedDate(date);
			}
			else {
				jadscCertificateOfService.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(jadscCertificateOfService);
			}
			else {
				jadscCertificateOfService =
					(JADSCCertificateOfService)session.merge(
						jadscCertificateOfService);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JADSCCertificateOfServiceImpl.class,
			jadscCertificateOfServiceModelImpl, false, true);

		cacheUniqueFindersCache(jadscCertificateOfServiceModelImpl);

		if (isNew) {
			jadscCertificateOfService.setNew(false);
		}

		jadscCertificateOfService.resetOriginalValues();

		return jadscCertificateOfService;
	}

	/**
	 * Returns the jadsc certificate of service with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jadsc certificate of service
	 * @return the jadsc certificate of service
	 * @throws NoSuchJADSCCertificateOfServiceException if a jadsc certificate of service with the primary key could not be found
	 */
	@Override
	public JADSCCertificateOfService findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJADSCCertificateOfServiceException {

		JADSCCertificateOfService jadscCertificateOfService = fetchByPrimaryKey(
			primaryKey);

		if (jadscCertificateOfService == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJADSCCertificateOfServiceException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return jadscCertificateOfService;
	}

	/**
	 * Returns the jadsc certificate of service with the primary key or throws a <code>NoSuchJADSCCertificateOfServiceException</code> if it could not be found.
	 *
	 * @param jadscCOSId the primary key of the jadsc certificate of service
	 * @return the jadsc certificate of service
	 * @throws NoSuchJADSCCertificateOfServiceException if a jadsc certificate of service with the primary key could not be found
	 */
	@Override
	public JADSCCertificateOfService findByPrimaryKey(long jadscCOSId)
		throws NoSuchJADSCCertificateOfServiceException {

		return findByPrimaryKey((Serializable)jadscCOSId);
	}

	/**
	 * Returns the jadsc certificate of service with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscCOSId the primary key of the jadsc certificate of service
	 * @return the jadsc certificate of service, or <code>null</code> if a jadsc certificate of service with the primary key could not be found
	 */
	@Override
	public JADSCCertificateOfService fetchByPrimaryKey(long jadscCOSId) {
		return fetchByPrimaryKey((Serializable)jadscCOSId);
	}

	/**
	 * Returns all the jadsc certificate of services.
	 *
	 * @return the jadsc certificate of services
	 */
	@Override
	public List<JADSCCertificateOfService> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc certificate of services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc certificate of services
	 * @param end the upper bound of the range of jadsc certificate of services (not inclusive)
	 * @return the range of jadsc certificate of services
	 */
	@Override
	public List<JADSCCertificateOfService> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc certificate of services
	 * @param end the upper bound of the range of jadsc certificate of services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc certificate of services
	 */
	@Override
	public List<JADSCCertificateOfService> findAll(
		int start, int end,
		OrderByComparator<JADSCCertificateOfService> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc certificate of services
	 * @param end the upper bound of the range of jadsc certificate of services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc certificate of services
	 */
	@Override
	public List<JADSCCertificateOfService> findAll(
		int start, int end,
		OrderByComparator<JADSCCertificateOfService> orderByComparator,
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

		List<JADSCCertificateOfService> list = null;

		if (useFinderCache) {
			list = (List<JADSCCertificateOfService>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JADSCCERTIFICATEOFSERVICE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JADSCCERTIFICATEOFSERVICE;

				sql = sql.concat(
					JADSCCertificateOfServiceModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JADSCCertificateOfService>)QueryUtil.list(
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
	 * Removes all the jadsc certificate of services from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JADSCCertificateOfService jadscCertificateOfService : findAll()) {
			remove(jadscCertificateOfService);
		}
	}

	/**
	 * Returns the number of jadsc certificate of services.
	 *
	 * @return the number of jadsc certificate of services
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
					_SQL_COUNT_JADSCCERTIFICATEOFSERVICE);

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
		return "jadscCOSId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JADSCCERTIFICATEOFSERVICE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JADSCCertificateOfServiceModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the jadsc certificate of service persistence.
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

		JADSCCertificateOfServiceUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		JADSCCertificateOfServiceUtil.setPersistence(null);

		entityCache.removeCache(JADSCCertificateOfServiceImpl.class.getName());
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

	private static final String _SQL_SELECT_JADSCCERTIFICATEOFSERVICE =
		"SELECT jadscCertificateOfService FROM JADSCCertificateOfService jadscCertificateOfService";

	private static final String _SQL_SELECT_JADSCCERTIFICATEOFSERVICE_WHERE =
		"SELECT jadscCertificateOfService FROM JADSCCertificateOfService jadscCertificateOfService WHERE ";

	private static final String _SQL_COUNT_JADSCCERTIFICATEOFSERVICE =
		"SELECT COUNT(jadscCertificateOfService) FROM JADSCCertificateOfService jadscCertificateOfService";

	private static final String _SQL_COUNT_JADSCCERTIFICATEOFSERVICE_WHERE =
		"SELECT COUNT(jadscCertificateOfService) FROM JADSCCertificateOfService jadscCertificateOfService WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"jadscCertificateOfService.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JADSCCertificateOfService exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JADSCCertificateOfService exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JADSCCertificateOfServicePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}