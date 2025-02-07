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

import com.nbp.cannabis.application.form.services.exception.NoSuchCannabisApplicationCompanyInfoException;
import com.nbp.cannabis.application.form.services.model.CannabisApplicationCompanyInfo;
import com.nbp.cannabis.application.form.services.model.CannabisApplicationCompanyInfoTable;
import com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCompanyInfoImpl;
import com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCompanyInfoModelImpl;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisApplicationCompanyInfoPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisApplicationCompanyInfoUtil;
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
 * The persistence implementation for the cannabis application company info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CannabisApplicationCompanyInfoPersistence.class)
public class CannabisApplicationCompanyInfoPersistenceImpl
	extends BasePersistenceImpl<CannabisApplicationCompanyInfo>
	implements CannabisApplicationCompanyInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CannabisApplicationCompanyInfoUtil</code> to access the cannabis application company info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CannabisApplicationCompanyInfoImpl.class.getName();

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
	 * Returns all the cannabis application company infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cannabis application company infos
	 */
	@Override
	public List<CannabisApplicationCompanyInfo> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis application company infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application company infos
	 * @param end the upper bound of the range of cannabis application company infos (not inclusive)
	 * @return the range of matching cannabis application company infos
	 */
	@Override
	public List<CannabisApplicationCompanyInfo> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis application company infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application company infos
	 * @param end the upper bound of the range of cannabis application company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application company infos
	 */
	@Override
	public List<CannabisApplicationCompanyInfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisApplicationCompanyInfo> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis application company infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application company infos
	 * @param end the upper bound of the range of cannabis application company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application company infos
	 */
	@Override
	public List<CannabisApplicationCompanyInfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisApplicationCompanyInfo> orderByComparator,
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

		List<CannabisApplicationCompanyInfo> list = null;

		if (useFinderCache) {
			list = (List<CannabisApplicationCompanyInfo>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisApplicationCompanyInfo
						cannabisApplicationCompanyInfo : list) {

					if (!uuid.equals(
							cannabisApplicationCompanyInfo.getUuid())) {

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

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONCOMPANYINFO_WHERE);

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
					CannabisApplicationCompanyInfoModelImpl.ORDER_BY_JPQL);
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

				list = (List<CannabisApplicationCompanyInfo>)QueryUtil.list(
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
	 * Returns the first cannabis application company info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application company info
	 * @throws NoSuchCannabisApplicationCompanyInfoException if a matching cannabis application company info could not be found
	 */
	@Override
	public CannabisApplicationCompanyInfo findByUuid_First(
			String uuid,
			OrderByComparator<CannabisApplicationCompanyInfo> orderByComparator)
		throws NoSuchCannabisApplicationCompanyInfoException {

		CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo =
			fetchByUuid_First(uuid, orderByComparator);

		if (cannabisApplicationCompanyInfo != null) {
			return cannabisApplicationCompanyInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchCannabisApplicationCompanyInfoException(sb.toString());
	}

	/**
	 * Returns the first cannabis application company info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application company info, or <code>null</code> if a matching cannabis application company info could not be found
	 */
	@Override
	public CannabisApplicationCompanyInfo fetchByUuid_First(
		String uuid,
		OrderByComparator<CannabisApplicationCompanyInfo> orderByComparator) {

		List<CannabisApplicationCompanyInfo> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis application company info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application company info
	 * @throws NoSuchCannabisApplicationCompanyInfoException if a matching cannabis application company info could not be found
	 */
	@Override
	public CannabisApplicationCompanyInfo findByUuid_Last(
			String uuid,
			OrderByComparator<CannabisApplicationCompanyInfo> orderByComparator)
		throws NoSuchCannabisApplicationCompanyInfoException {

		CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo =
			fetchByUuid_Last(uuid, orderByComparator);

		if (cannabisApplicationCompanyInfo != null) {
			return cannabisApplicationCompanyInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchCannabisApplicationCompanyInfoException(sb.toString());
	}

	/**
	 * Returns the last cannabis application company info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application company info, or <code>null</code> if a matching cannabis application company info could not be found
	 */
	@Override
	public CannabisApplicationCompanyInfo fetchByUuid_Last(
		String uuid,
		OrderByComparator<CannabisApplicationCompanyInfo> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<CannabisApplicationCompanyInfo> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis application company infos before and after the current cannabis application company info in the ordered set where uuid = &#63;.
	 *
	 * @param companyInformationId the primary key of the current cannabis application company info
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application company info
	 * @throws NoSuchCannabisApplicationCompanyInfoException if a cannabis application company info with the primary key could not be found
	 */
	@Override
	public CannabisApplicationCompanyInfo[] findByUuid_PrevAndNext(
			long companyInformationId, String uuid,
			OrderByComparator<CannabisApplicationCompanyInfo> orderByComparator)
		throws NoSuchCannabisApplicationCompanyInfoException {

		uuid = Objects.toString(uuid, "");

		CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo =
			findByPrimaryKey(companyInformationId);

		Session session = null;

		try {
			session = openSession();

			CannabisApplicationCompanyInfo[] array =
				new CannabisApplicationCompanyInfoImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, cannabisApplicationCompanyInfo, uuid,
				orderByComparator, true);

			array[1] = cannabisApplicationCompanyInfo;

			array[2] = getByUuid_PrevAndNext(
				session, cannabisApplicationCompanyInfo, uuid,
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

	protected CannabisApplicationCompanyInfo getByUuid_PrevAndNext(
		Session session,
		CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo,
		String uuid,
		OrderByComparator<CannabisApplicationCompanyInfo> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISAPPLICATIONCOMPANYINFO_WHERE);

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
			sb.append(CannabisApplicationCompanyInfoModelImpl.ORDER_BY_JPQL);
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
						cannabisApplicationCompanyInfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisApplicationCompanyInfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis application company infos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(cannabisApplicationCompanyInfo);
		}
	}

	/**
	 * Returns the number of cannabis application company infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cannabis application company infos
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONCOMPANYINFO_WHERE);

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
		"cannabisApplicationCompanyInfo.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(cannabisApplicationCompanyInfo.uuid IS NULL OR cannabisApplicationCompanyInfo.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the cannabis application company info where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCannabisApplicationCompanyInfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis application company info
	 * @throws NoSuchCannabisApplicationCompanyInfoException if a matching cannabis application company info could not be found
	 */
	@Override
	public CannabisApplicationCompanyInfo findByUUID_G(
			String uuid, long groupId)
		throws NoSuchCannabisApplicationCompanyInfoException {

		CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo =
			fetchByUUID_G(uuid, groupId);

		if (cannabisApplicationCompanyInfo == null) {
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

			throw new NoSuchCannabisApplicationCompanyInfoException(
				sb.toString());
		}

		return cannabisApplicationCompanyInfo;
	}

	/**
	 * Returns the cannabis application company info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis application company info, or <code>null</code> if a matching cannabis application company info could not be found
	 */
	@Override
	public CannabisApplicationCompanyInfo fetchByUUID_G(
		String uuid, long groupId) {

		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the cannabis application company info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application company info, or <code>null</code> if a matching cannabis application company info could not be found
	 */
	@Override
	public CannabisApplicationCompanyInfo fetchByUUID_G(
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

		if (result instanceof CannabisApplicationCompanyInfo) {
			CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo =
				(CannabisApplicationCompanyInfo)result;

			if (!Objects.equals(
					uuid, cannabisApplicationCompanyInfo.getUuid()) ||
				(groupId != cannabisApplicationCompanyInfo.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONCOMPANYINFO_WHERE);

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

				List<CannabisApplicationCompanyInfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					CannabisApplicationCompanyInfo
						cannabisApplicationCompanyInfo = list.get(0);

					result = cannabisApplicationCompanyInfo;

					cacheResult(cannabisApplicationCompanyInfo);
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
			return (CannabisApplicationCompanyInfo)result;
		}
	}

	/**
	 * Removes the cannabis application company info where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the cannabis application company info that was removed
	 */
	@Override
	public CannabisApplicationCompanyInfo removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchCannabisApplicationCompanyInfoException {

		CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo =
			findByUUID_G(uuid, groupId);

		return remove(cannabisApplicationCompanyInfo);
	}

	/**
	 * Returns the number of cannabis application company infos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cannabis application company infos
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONCOMPANYINFO_WHERE);

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
		"cannabisApplicationCompanyInfo.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(cannabisApplicationCompanyInfo.uuid IS NULL OR cannabisApplicationCompanyInfo.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"cannabisApplicationCompanyInfo.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the cannabis application company infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cannabis application company infos
	 */
	@Override
	public List<CannabisApplicationCompanyInfo> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis application company infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application company infos
	 * @param end the upper bound of the range of cannabis application company infos (not inclusive)
	 * @return the range of matching cannabis application company infos
	 */
	@Override
	public List<CannabisApplicationCompanyInfo> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis application company infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application company infos
	 * @param end the upper bound of the range of cannabis application company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application company infos
	 */
	@Override
	public List<CannabisApplicationCompanyInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisApplicationCompanyInfo> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis application company infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application company infos
	 * @param end the upper bound of the range of cannabis application company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application company infos
	 */
	@Override
	public List<CannabisApplicationCompanyInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisApplicationCompanyInfo> orderByComparator,
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

		List<CannabisApplicationCompanyInfo> list = null;

		if (useFinderCache) {
			list = (List<CannabisApplicationCompanyInfo>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisApplicationCompanyInfo
						cannabisApplicationCompanyInfo : list) {

					if (!uuid.equals(
							cannabisApplicationCompanyInfo.getUuid()) ||
						(companyId !=
							cannabisApplicationCompanyInfo.getCompanyId())) {

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

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONCOMPANYINFO_WHERE);

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
					CannabisApplicationCompanyInfoModelImpl.ORDER_BY_JPQL);
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

				list = (List<CannabisApplicationCompanyInfo>)QueryUtil.list(
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
	 * Returns the first cannabis application company info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application company info
	 * @throws NoSuchCannabisApplicationCompanyInfoException if a matching cannabis application company info could not be found
	 */
	@Override
	public CannabisApplicationCompanyInfo findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CannabisApplicationCompanyInfo> orderByComparator)
		throws NoSuchCannabisApplicationCompanyInfoException {

		CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo =
			fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (cannabisApplicationCompanyInfo != null) {
			return cannabisApplicationCompanyInfo;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchCannabisApplicationCompanyInfoException(sb.toString());
	}

	/**
	 * Returns the first cannabis application company info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application company info, or <code>null</code> if a matching cannabis application company info could not be found
	 */
	@Override
	public CannabisApplicationCompanyInfo fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CannabisApplicationCompanyInfo> orderByComparator) {

		List<CannabisApplicationCompanyInfo> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis application company info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application company info
	 * @throws NoSuchCannabisApplicationCompanyInfoException if a matching cannabis application company info could not be found
	 */
	@Override
	public CannabisApplicationCompanyInfo findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CannabisApplicationCompanyInfo> orderByComparator)
		throws NoSuchCannabisApplicationCompanyInfoException {

		CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo =
			fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (cannabisApplicationCompanyInfo != null) {
			return cannabisApplicationCompanyInfo;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchCannabisApplicationCompanyInfoException(sb.toString());
	}

	/**
	 * Returns the last cannabis application company info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application company info, or <code>null</code> if a matching cannabis application company info could not be found
	 */
	@Override
	public CannabisApplicationCompanyInfo fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CannabisApplicationCompanyInfo> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<CannabisApplicationCompanyInfo> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis application company infos before and after the current cannabis application company info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param companyInformationId the primary key of the current cannabis application company info
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application company info
	 * @throws NoSuchCannabisApplicationCompanyInfoException if a cannabis application company info with the primary key could not be found
	 */
	@Override
	public CannabisApplicationCompanyInfo[] findByUuid_C_PrevAndNext(
			long companyInformationId, String uuid, long companyId,
			OrderByComparator<CannabisApplicationCompanyInfo> orderByComparator)
		throws NoSuchCannabisApplicationCompanyInfoException {

		uuid = Objects.toString(uuid, "");

		CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo =
			findByPrimaryKey(companyInformationId);

		Session session = null;

		try {
			session = openSession();

			CannabisApplicationCompanyInfo[] array =
				new CannabisApplicationCompanyInfoImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, cannabisApplicationCompanyInfo, uuid, companyId,
				orderByComparator, true);

			array[1] = cannabisApplicationCompanyInfo;

			array[2] = getByUuid_C_PrevAndNext(
				session, cannabisApplicationCompanyInfo, uuid, companyId,
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

	protected CannabisApplicationCompanyInfo getByUuid_C_PrevAndNext(
		Session session,
		CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo,
		String uuid, long companyId,
		OrderByComparator<CannabisApplicationCompanyInfo> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISAPPLICATIONCOMPANYINFO_WHERE);

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
			sb.append(CannabisApplicationCompanyInfoModelImpl.ORDER_BY_JPQL);
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
						cannabisApplicationCompanyInfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisApplicationCompanyInfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis application company infos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(cannabisApplicationCompanyInfo);
		}
	}

	/**
	 * Returns the number of cannabis application company infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cannabis application company infos
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONCOMPANYINFO_WHERE);

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
		"cannabisApplicationCompanyInfo.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(cannabisApplicationCompanyInfo.uuid IS NULL OR cannabisApplicationCompanyInfo.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"cannabisApplicationCompanyInfo.companyId = ?";

	private FinderPath _finderPathFetchBygetCA_CI_by_AppNo;
	private FinderPath _finderPathCountBygetCA_CI_by_AppNo;

	/**
	 * Returns the cannabis application company info where applicationNumber = &#63; or throws a <code>NoSuchCannabisApplicationCompanyInfoException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching cannabis application company info
	 * @throws NoSuchCannabisApplicationCompanyInfoException if a matching cannabis application company info could not be found
	 */
	@Override
	public CannabisApplicationCompanyInfo findBygetCA_CI_by_AppNo(
			String applicationNumber)
		throws NoSuchCannabisApplicationCompanyInfoException {

		CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo =
			fetchBygetCA_CI_by_AppNo(applicationNumber);

		if (cannabisApplicationCompanyInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("applicationNumber=");
			sb.append(applicationNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCannabisApplicationCompanyInfoException(
				sb.toString());
		}

		return cannabisApplicationCompanyInfo;
	}

	/**
	 * Returns the cannabis application company info where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching cannabis application company info, or <code>null</code> if a matching cannabis application company info could not be found
	 */
	@Override
	public CannabisApplicationCompanyInfo fetchBygetCA_CI_by_AppNo(
		String applicationNumber) {

		return fetchBygetCA_CI_by_AppNo(applicationNumber, true);
	}

	/**
	 * Returns the cannabis application company info where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application company info, or <code>null</code> if a matching cannabis application company info could not be found
	 */
	@Override
	public CannabisApplicationCompanyInfo fetchBygetCA_CI_by_AppNo(
		String applicationNumber, boolean useFinderCache) {

		applicationNumber = Objects.toString(applicationNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {applicationNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetCA_CI_by_AppNo, finderArgs, this);
		}

		if (result instanceof CannabisApplicationCompanyInfo) {
			CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo =
				(CannabisApplicationCompanyInfo)result;

			if (!Objects.equals(
					applicationNumber,
					cannabisApplicationCompanyInfo.getApplicationNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONCOMPANYINFO_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCA_CI_BY_APPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GETCA_CI_BY_APPNO_APPLICATIONNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindApplicationNumber) {
					queryPos.add(applicationNumber);
				}

				List<CannabisApplicationCompanyInfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCA_CI_by_AppNo, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {applicationNumber};
							}

							_log.warn(
								"CannabisApplicationCompanyInfoPersistenceImpl.fetchBygetCA_CI_by_AppNo(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CannabisApplicationCompanyInfo
						cannabisApplicationCompanyInfo = list.get(0);

					result = cannabisApplicationCompanyInfo;

					cacheResult(cannabisApplicationCompanyInfo);
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
			return (CannabisApplicationCompanyInfo)result;
		}
	}

	/**
	 * Removes the cannabis application company info where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the cannabis application company info that was removed
	 */
	@Override
	public CannabisApplicationCompanyInfo removeBygetCA_CI_by_AppNo(
			String applicationNumber)
		throws NoSuchCannabisApplicationCompanyInfoException {

		CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo =
			findBygetCA_CI_by_AppNo(applicationNumber);

		return remove(cannabisApplicationCompanyInfo);
	}

	/**
	 * Returns the number of cannabis application company infos where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching cannabis application company infos
	 */
	@Override
	public int countBygetCA_CI_by_AppNo(String applicationNumber) {
		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath = _finderPathCountBygetCA_CI_by_AppNo;

		Object[] finderArgs = new Object[] {applicationNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONCOMPANYINFO_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCA_CI_BY_APPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GETCA_CI_BY_APPNO_APPLICATIONNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindApplicationNumber) {
					queryPos.add(applicationNumber);
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

	private static final String
		_FINDER_COLUMN_GETCA_CI_BY_APPNO_APPLICATIONNUMBER_2 =
			"cannabisApplicationCompanyInfo.applicationNumber = ?";

	private static final String
		_FINDER_COLUMN_GETCA_CI_BY_APPNO_APPLICATIONNUMBER_3 =
			"(cannabisApplicationCompanyInfo.applicationNumber IS NULL OR cannabisApplicationCompanyInfo.applicationNumber = '')";

	private FinderPath _finderPathFetchBygetCA_CI_by_AppId;
	private FinderPath _finderPathCountBygetCA_CI_by_AppId;

	/**
	 * Returns the cannabis application company info where cannabisApplicationId = &#63; or throws a <code>NoSuchCannabisApplicationCompanyInfoException</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application company info
	 * @throws NoSuchCannabisApplicationCompanyInfoException if a matching cannabis application company info could not be found
	 */
	@Override
	public CannabisApplicationCompanyInfo findBygetCA_CI_by_AppId(
			long cannabisApplicationId)
		throws NoSuchCannabisApplicationCompanyInfoException {

		CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo =
			fetchBygetCA_CI_by_AppId(cannabisApplicationId);

		if (cannabisApplicationCompanyInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("cannabisApplicationId=");
			sb.append(cannabisApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCannabisApplicationCompanyInfoException(
				sb.toString());
		}

		return cannabisApplicationCompanyInfo;
	}

	/**
	 * Returns the cannabis application company info where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application company info, or <code>null</code> if a matching cannabis application company info could not be found
	 */
	@Override
	public CannabisApplicationCompanyInfo fetchBygetCA_CI_by_AppId(
		long cannabisApplicationId) {

		return fetchBygetCA_CI_by_AppId(cannabisApplicationId, true);
	}

	/**
	 * Returns the cannabis application company info where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application company info, or <code>null</code> if a matching cannabis application company info could not be found
	 */
	@Override
	public CannabisApplicationCompanyInfo fetchBygetCA_CI_by_AppId(
		long cannabisApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {cannabisApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetCA_CI_by_AppId, finderArgs, this);
		}

		if (result instanceof CannabisApplicationCompanyInfo) {
			CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo =
				(CannabisApplicationCompanyInfo)result;

			if (cannabisApplicationId !=
					cannabisApplicationCompanyInfo.getCannabisApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONCOMPANYINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETCA_CI_BY_APPID_CANNABISAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(cannabisApplicationId);

				List<CannabisApplicationCompanyInfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCA_CI_by_AppId, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									cannabisApplicationId
								};
							}

							_log.warn(
								"CannabisApplicationCompanyInfoPersistenceImpl.fetchBygetCA_CI_by_AppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CannabisApplicationCompanyInfo
						cannabisApplicationCompanyInfo = list.get(0);

					result = cannabisApplicationCompanyInfo;

					cacheResult(cannabisApplicationCompanyInfo);
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
			return (CannabisApplicationCompanyInfo)result;
		}
	}

	/**
	 * Removes the cannabis application company info where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the cannabis application company info that was removed
	 */
	@Override
	public CannabisApplicationCompanyInfo removeBygetCA_CI_by_AppId(
			long cannabisApplicationId)
		throws NoSuchCannabisApplicationCompanyInfoException {

		CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo =
			findBygetCA_CI_by_AppId(cannabisApplicationId);

		return remove(cannabisApplicationCompanyInfo);
	}

	/**
	 * Returns the number of cannabis application company infos where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis application company infos
	 */
	@Override
	public int countBygetCA_CI_by_AppId(long cannabisApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCA_CI_by_AppId;

		Object[] finderArgs = new Object[] {cannabisApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONCOMPANYINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETCA_CI_BY_APPID_CANNABISAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(cannabisApplicationId);

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
		_FINDER_COLUMN_GETCA_CI_BY_APPID_CANNABISAPPLICATIONID_2 =
			"cannabisApplicationCompanyInfo.cannabisApplicationId = ?";

	public CannabisApplicationCompanyInfoPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(CannabisApplicationCompanyInfo.class);

		setModelImplClass(CannabisApplicationCompanyInfoImpl.class);
		setModelPKClass(long.class);

		setTable(CannabisApplicationCompanyInfoTable.INSTANCE);
	}

	/**
	 * Caches the cannabis application company info in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationCompanyInfo the cannabis application company info
	 */
	@Override
	public void cacheResult(
		CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo) {

		entityCache.putResult(
			CannabisApplicationCompanyInfoImpl.class,
			cannabisApplicationCompanyInfo.getPrimaryKey(),
			cannabisApplicationCompanyInfo);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				cannabisApplicationCompanyInfo.getUuid(),
				cannabisApplicationCompanyInfo.getGroupId()
			},
			cannabisApplicationCompanyInfo);

		finderCache.putResult(
			_finderPathFetchBygetCA_CI_by_AppNo,
			new Object[] {
				cannabisApplicationCompanyInfo.getApplicationNumber()
			},
			cannabisApplicationCompanyInfo);

		finderCache.putResult(
			_finderPathFetchBygetCA_CI_by_AppId,
			new Object[] {
				cannabisApplicationCompanyInfo.getCannabisApplicationId()
			},
			cannabisApplicationCompanyInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the cannabis application company infos in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationCompanyInfos the cannabis application company infos
	 */
	@Override
	public void cacheResult(
		List<CannabisApplicationCompanyInfo> cannabisApplicationCompanyInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (cannabisApplicationCompanyInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo :
				cannabisApplicationCompanyInfos) {

			if (entityCache.getResult(
					CannabisApplicationCompanyInfoImpl.class,
					cannabisApplicationCompanyInfo.getPrimaryKey()) == null) {

				cacheResult(cannabisApplicationCompanyInfo);
			}
		}
	}

	/**
	 * Clears the cache for all cannabis application company infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CannabisApplicationCompanyInfoImpl.class);

		finderCache.clearCache(CannabisApplicationCompanyInfoImpl.class);
	}

	/**
	 * Clears the cache for the cannabis application company info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo) {

		entityCache.removeResult(
			CannabisApplicationCompanyInfoImpl.class,
			cannabisApplicationCompanyInfo);
	}

	@Override
	public void clearCache(
		List<CannabisApplicationCompanyInfo> cannabisApplicationCompanyInfos) {

		for (CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo :
				cannabisApplicationCompanyInfos) {

			entityCache.removeResult(
				CannabisApplicationCompanyInfoImpl.class,
				cannabisApplicationCompanyInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CannabisApplicationCompanyInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CannabisApplicationCompanyInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CannabisApplicationCompanyInfoModelImpl
			cannabisApplicationCompanyInfoModelImpl) {

		Object[] args = new Object[] {
			cannabisApplicationCompanyInfoModelImpl.getUuid(),
			cannabisApplicationCompanyInfoModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args,
			cannabisApplicationCompanyInfoModelImpl);

		args = new Object[] {
			cannabisApplicationCompanyInfoModelImpl.getApplicationNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetCA_CI_by_AppNo, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCA_CI_by_AppNo, args,
			cannabisApplicationCompanyInfoModelImpl);

		args = new Object[] {
			cannabisApplicationCompanyInfoModelImpl.getCannabisApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetCA_CI_by_AppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCA_CI_by_AppId, args,
			cannabisApplicationCompanyInfoModelImpl);
	}

	/**
	 * Creates a new cannabis application company info with the primary key. Does not add the cannabis application company info to the database.
	 *
	 * @param companyInformationId the primary key for the new cannabis application company info
	 * @return the new cannabis application company info
	 */
	@Override
	public CannabisApplicationCompanyInfo create(long companyInformationId) {
		CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo =
			new CannabisApplicationCompanyInfoImpl();

		cannabisApplicationCompanyInfo.setNew(true);
		cannabisApplicationCompanyInfo.setPrimaryKey(companyInformationId);

		String uuid = PortalUUIDUtil.generate();

		cannabisApplicationCompanyInfo.setUuid(uuid);

		cannabisApplicationCompanyInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return cannabisApplicationCompanyInfo;
	}

	/**
	 * Removes the cannabis application company info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param companyInformationId the primary key of the cannabis application company info
	 * @return the cannabis application company info that was removed
	 * @throws NoSuchCannabisApplicationCompanyInfoException if a cannabis application company info with the primary key could not be found
	 */
	@Override
	public CannabisApplicationCompanyInfo remove(long companyInformationId)
		throws NoSuchCannabisApplicationCompanyInfoException {

		return remove((Serializable)companyInformationId);
	}

	/**
	 * Removes the cannabis application company info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cannabis application company info
	 * @return the cannabis application company info that was removed
	 * @throws NoSuchCannabisApplicationCompanyInfoException if a cannabis application company info with the primary key could not be found
	 */
	@Override
	public CannabisApplicationCompanyInfo remove(Serializable primaryKey)
		throws NoSuchCannabisApplicationCompanyInfoException {

		Session session = null;

		try {
			session = openSession();

			CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo =
				(CannabisApplicationCompanyInfo)session.get(
					CannabisApplicationCompanyInfoImpl.class, primaryKey);

			if (cannabisApplicationCompanyInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCannabisApplicationCompanyInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(cannabisApplicationCompanyInfo);
		}
		catch (NoSuchCannabisApplicationCompanyInfoException
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
	protected CannabisApplicationCompanyInfo removeImpl(
		CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cannabisApplicationCompanyInfo)) {
				cannabisApplicationCompanyInfo =
					(CannabisApplicationCompanyInfo)session.get(
						CannabisApplicationCompanyInfoImpl.class,
						cannabisApplicationCompanyInfo.getPrimaryKeyObj());
			}

			if (cannabisApplicationCompanyInfo != null) {
				session.delete(cannabisApplicationCompanyInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (cannabisApplicationCompanyInfo != null) {
			clearCache(cannabisApplicationCompanyInfo);
		}

		return cannabisApplicationCompanyInfo;
	}

	@Override
	public CannabisApplicationCompanyInfo updateImpl(
		CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo) {

		boolean isNew = cannabisApplicationCompanyInfo.isNew();

		if (!(cannabisApplicationCompanyInfo instanceof
				CannabisApplicationCompanyInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					cannabisApplicationCompanyInfo.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					cannabisApplicationCompanyInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cannabisApplicationCompanyInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CannabisApplicationCompanyInfo implementation " +
					cannabisApplicationCompanyInfo.getClass());
		}

		CannabisApplicationCompanyInfoModelImpl
			cannabisApplicationCompanyInfoModelImpl =
				(CannabisApplicationCompanyInfoModelImpl)
					cannabisApplicationCompanyInfo;

		if (Validator.isNull(cannabisApplicationCompanyInfo.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			cannabisApplicationCompanyInfo.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (cannabisApplicationCompanyInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				cannabisApplicationCompanyInfo.setCreateDate(date);
			}
			else {
				cannabisApplicationCompanyInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!cannabisApplicationCompanyInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				cannabisApplicationCompanyInfo.setModifiedDate(date);
			}
			else {
				cannabisApplicationCompanyInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(cannabisApplicationCompanyInfo);
			}
			else {
				cannabisApplicationCompanyInfo =
					(CannabisApplicationCompanyInfo)session.merge(
						cannabisApplicationCompanyInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CannabisApplicationCompanyInfoImpl.class,
			cannabisApplicationCompanyInfoModelImpl, false, true);

		cacheUniqueFindersCache(cannabisApplicationCompanyInfoModelImpl);

		if (isNew) {
			cannabisApplicationCompanyInfo.setNew(false);
		}

		cannabisApplicationCompanyInfo.resetOriginalValues();

		return cannabisApplicationCompanyInfo;
	}

	/**
	 * Returns the cannabis application company info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cannabis application company info
	 * @return the cannabis application company info
	 * @throws NoSuchCannabisApplicationCompanyInfoException if a cannabis application company info with the primary key could not be found
	 */
	@Override
	public CannabisApplicationCompanyInfo findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchCannabisApplicationCompanyInfoException {

		CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo =
			fetchByPrimaryKey(primaryKey);

		if (cannabisApplicationCompanyInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCannabisApplicationCompanyInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return cannabisApplicationCompanyInfo;
	}

	/**
	 * Returns the cannabis application company info with the primary key or throws a <code>NoSuchCannabisApplicationCompanyInfoException</code> if it could not be found.
	 *
	 * @param companyInformationId the primary key of the cannabis application company info
	 * @return the cannabis application company info
	 * @throws NoSuchCannabisApplicationCompanyInfoException if a cannabis application company info with the primary key could not be found
	 */
	@Override
	public CannabisApplicationCompanyInfo findByPrimaryKey(
			long companyInformationId)
		throws NoSuchCannabisApplicationCompanyInfoException {

		return findByPrimaryKey((Serializable)companyInformationId);
	}

	/**
	 * Returns the cannabis application company info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param companyInformationId the primary key of the cannabis application company info
	 * @return the cannabis application company info, or <code>null</code> if a cannabis application company info with the primary key could not be found
	 */
	@Override
	public CannabisApplicationCompanyInfo fetchByPrimaryKey(
		long companyInformationId) {

		return fetchByPrimaryKey((Serializable)companyInformationId);
	}

	/**
	 * Returns all the cannabis application company infos.
	 *
	 * @return the cannabis application company infos
	 */
	@Override
	public List<CannabisApplicationCompanyInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis application company infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application company infos
	 * @param end the upper bound of the range of cannabis application company infos (not inclusive)
	 * @return the range of cannabis application company infos
	 */
	@Override
	public List<CannabisApplicationCompanyInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis application company infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application company infos
	 * @param end the upper bound of the range of cannabis application company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis application company infos
	 */
	@Override
	public List<CannabisApplicationCompanyInfo> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationCompanyInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis application company infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application company infos
	 * @param end the upper bound of the range of cannabis application company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis application company infos
	 */
	@Override
	public List<CannabisApplicationCompanyInfo> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationCompanyInfo> orderByComparator,
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

		List<CannabisApplicationCompanyInfo> list = null;

		if (useFinderCache) {
			list = (List<CannabisApplicationCompanyInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CANNABISAPPLICATIONCOMPANYINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CANNABISAPPLICATIONCOMPANYINFO;

				sql = sql.concat(
					CannabisApplicationCompanyInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CannabisApplicationCompanyInfo>)QueryUtil.list(
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
	 * Removes all the cannabis application company infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo :
				findAll()) {

			remove(cannabisApplicationCompanyInfo);
		}
	}

	/**
	 * Returns the number of cannabis application company infos.
	 *
	 * @return the number of cannabis application company infos
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
					_SQL_COUNT_CANNABISAPPLICATIONCOMPANYINFO);

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
		return "companyInformationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CANNABISAPPLICATIONCOMPANYINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CannabisApplicationCompanyInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cannabis application company info persistence.
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

		_finderPathFetchBygetCA_CI_by_AppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCA_CI_by_AppNo",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, true);

		_finderPathCountBygetCA_CI_by_AppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCA_CI_by_AppNo", new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, false);

		_finderPathFetchBygetCA_CI_by_AppId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCA_CI_by_AppId",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, true);

		_finderPathCountBygetCA_CI_by_AppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCA_CI_by_AppId", new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, false);

		CannabisApplicationCompanyInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CannabisApplicationCompanyInfoUtil.setPersistence(null);

		entityCache.removeCache(
			CannabisApplicationCompanyInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_CANNABISAPPLICATIONCOMPANYINFO =
		"SELECT cannabisApplicationCompanyInfo FROM CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo";

	private static final String
		_SQL_SELECT_CANNABISAPPLICATIONCOMPANYINFO_WHERE =
			"SELECT cannabisApplicationCompanyInfo FROM CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo WHERE ";

	private static final String _SQL_COUNT_CANNABISAPPLICATIONCOMPANYINFO =
		"SELECT COUNT(cannabisApplicationCompanyInfo) FROM CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo";

	private static final String
		_SQL_COUNT_CANNABISAPPLICATIONCOMPANYINFO_WHERE =
			"SELECT COUNT(cannabisApplicationCompanyInfo) FROM CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"cannabisApplicationCompanyInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CannabisApplicationCompanyInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CannabisApplicationCompanyInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CannabisApplicationCompanyInfoPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}