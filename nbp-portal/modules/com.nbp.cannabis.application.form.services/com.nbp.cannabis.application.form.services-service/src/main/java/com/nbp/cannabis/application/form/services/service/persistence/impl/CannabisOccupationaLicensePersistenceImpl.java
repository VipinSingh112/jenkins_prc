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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import com.nbp.cannabis.application.form.services.exception.NoSuchCannabisOccupationaLicenseException;
import com.nbp.cannabis.application.form.services.model.CannabisOccupationaLicense;
import com.nbp.cannabis.application.form.services.model.CannabisOccupationaLicenseTable;
import com.nbp.cannabis.application.form.services.model.impl.CannabisOccupationaLicenseImpl;
import com.nbp.cannabis.application.form.services.model.impl.CannabisOccupationaLicenseModelImpl;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisOccupationaLicensePersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisOccupationaLicenseUtil;
import com.nbp.cannabis.application.form.services.service.persistence.impl.constants.CANNABISPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

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
 * The persistence implementation for the cannabis occupationa license service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CannabisOccupationaLicensePersistence.class)
public class CannabisOccupationaLicensePersistenceImpl
	extends BasePersistenceImpl<CannabisOccupationaLicense>
	implements CannabisOccupationaLicensePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CannabisOccupationaLicenseUtil</code> to access the cannabis occupationa license persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CannabisOccupationaLicenseImpl.class.getName();

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
	 * Returns all the cannabis occupationa licenses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cannabis occupationa licenses
	 */
	@Override
	public List<CannabisOccupationaLicense> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis occupationa licenses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @return the range of matching cannabis occupationa licenses
	 */
	@Override
	public List<CannabisOccupationaLicense> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis occupationa licenses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis occupationa licenses
	 */
	@Override
	public List<CannabisOccupationaLicense> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisOccupationaLicense> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis occupationa licenses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis occupationa licenses
	 */
	@Override
	public List<CannabisOccupationaLicense> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisOccupationaLicense> orderByComparator,
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

		List<CannabisOccupationaLicense> list = null;

		if (useFinderCache) {
			list = (List<CannabisOccupationaLicense>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisOccupationaLicense cannabisOccupationaLicense :
						list) {

					if (!uuid.equals(cannabisOccupationaLicense.getUuid())) {
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

			sb.append(_SQL_SELECT_CANNABISOCCUPATIONALICENSE_WHERE);

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
				sb.append(CannabisOccupationaLicenseModelImpl.ORDER_BY_JPQL);
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

				list = (List<CannabisOccupationaLicense>)QueryUtil.list(
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
	 * Returns the first cannabis occupationa license in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis occupationa license
	 * @throws NoSuchCannabisOccupationaLicenseException if a matching cannabis occupationa license could not be found
	 */
	@Override
	public CannabisOccupationaLicense findByUuid_First(
			String uuid,
			OrderByComparator<CannabisOccupationaLicense> orderByComparator)
		throws NoSuchCannabisOccupationaLicenseException {

		CannabisOccupationaLicense cannabisOccupationaLicense =
			fetchByUuid_First(uuid, orderByComparator);

		if (cannabisOccupationaLicense != null) {
			return cannabisOccupationaLicense;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchCannabisOccupationaLicenseException(sb.toString());
	}

	/**
	 * Returns the first cannabis occupationa license in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis occupationa license, or <code>null</code> if a matching cannabis occupationa license could not be found
	 */
	@Override
	public CannabisOccupationaLicense fetchByUuid_First(
		String uuid,
		OrderByComparator<CannabisOccupationaLicense> orderByComparator) {

		List<CannabisOccupationaLicense> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis occupationa license in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis occupationa license
	 * @throws NoSuchCannabisOccupationaLicenseException if a matching cannabis occupationa license could not be found
	 */
	@Override
	public CannabisOccupationaLicense findByUuid_Last(
			String uuid,
			OrderByComparator<CannabisOccupationaLicense> orderByComparator)
		throws NoSuchCannabisOccupationaLicenseException {

		CannabisOccupationaLicense cannabisOccupationaLicense =
			fetchByUuid_Last(uuid, orderByComparator);

		if (cannabisOccupationaLicense != null) {
			return cannabisOccupationaLicense;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchCannabisOccupationaLicenseException(sb.toString());
	}

	/**
	 * Returns the last cannabis occupationa license in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis occupationa license, or <code>null</code> if a matching cannabis occupationa license could not be found
	 */
	@Override
	public CannabisOccupationaLicense fetchByUuid_Last(
		String uuid,
		OrderByComparator<CannabisOccupationaLicense> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<CannabisOccupationaLicense> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis occupationa licenses before and after the current cannabis occupationa license in the ordered set where uuid = &#63;.
	 *
	 * @param cannabisOccupationaLicenseId the primary key of the current cannabis occupationa license
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis occupationa license
	 * @throws NoSuchCannabisOccupationaLicenseException if a cannabis occupationa license with the primary key could not be found
	 */
	@Override
	public CannabisOccupationaLicense[] findByUuid_PrevAndNext(
			long cannabisOccupationaLicenseId, String uuid,
			OrderByComparator<CannabisOccupationaLicense> orderByComparator)
		throws NoSuchCannabisOccupationaLicenseException {

		uuid = Objects.toString(uuid, "");

		CannabisOccupationaLicense cannabisOccupationaLicense =
			findByPrimaryKey(cannabisOccupationaLicenseId);

		Session session = null;

		try {
			session = openSession();

			CannabisOccupationaLicense[] array =
				new CannabisOccupationaLicenseImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, cannabisOccupationaLicense, uuid, orderByComparator,
				true);

			array[1] = cannabisOccupationaLicense;

			array[2] = getByUuid_PrevAndNext(
				session, cannabisOccupationaLicense, uuid, orderByComparator,
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

	protected CannabisOccupationaLicense getByUuid_PrevAndNext(
		Session session, CannabisOccupationaLicense cannabisOccupationaLicense,
		String uuid,
		OrderByComparator<CannabisOccupationaLicense> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISOCCUPATIONALICENSE_WHERE);

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
			sb.append(CannabisOccupationaLicenseModelImpl.ORDER_BY_JPQL);
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
						cannabisOccupationaLicense)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisOccupationaLicense> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis occupationa licenses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (CannabisOccupationaLicense cannabisOccupationaLicense :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(cannabisOccupationaLicense);
		}
	}

	/**
	 * Returns the number of cannabis occupationa licenses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cannabis occupationa licenses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISOCCUPATIONALICENSE_WHERE);

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
		"cannabisOccupationaLicense.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(cannabisOccupationaLicense.uuid IS NULL OR cannabisOccupationaLicense.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the cannabis occupationa license where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCannabisOccupationaLicenseException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis occupationa license
	 * @throws NoSuchCannabisOccupationaLicenseException if a matching cannabis occupationa license could not be found
	 */
	@Override
	public CannabisOccupationaLicense findByUUID_G(String uuid, long groupId)
		throws NoSuchCannabisOccupationaLicenseException {

		CannabisOccupationaLicense cannabisOccupationaLicense = fetchByUUID_G(
			uuid, groupId);

		if (cannabisOccupationaLicense == null) {
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

			throw new NoSuchCannabisOccupationaLicenseException(sb.toString());
		}

		return cannabisOccupationaLicense;
	}

	/**
	 * Returns the cannabis occupationa license where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis occupationa license, or <code>null</code> if a matching cannabis occupationa license could not be found
	 */
	@Override
	public CannabisOccupationaLicense fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the cannabis occupationa license where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis occupationa license, or <code>null</code> if a matching cannabis occupationa license could not be found
	 */
	@Override
	public CannabisOccupationaLicense fetchByUUID_G(
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

		if (result instanceof CannabisOccupationaLicense) {
			CannabisOccupationaLicense cannabisOccupationaLicense =
				(CannabisOccupationaLicense)result;

			if (!Objects.equals(uuid, cannabisOccupationaLicense.getUuid()) ||
				(groupId != cannabisOccupationaLicense.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_CANNABISOCCUPATIONALICENSE_WHERE);

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

				List<CannabisOccupationaLicense> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					CannabisOccupationaLicense cannabisOccupationaLicense =
						list.get(0);

					result = cannabisOccupationaLicense;

					cacheResult(cannabisOccupationaLicense);
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
			return (CannabisOccupationaLicense)result;
		}
	}

	/**
	 * Removes the cannabis occupationa license where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the cannabis occupationa license that was removed
	 */
	@Override
	public CannabisOccupationaLicense removeByUUID_G(String uuid, long groupId)
		throws NoSuchCannabisOccupationaLicenseException {

		CannabisOccupationaLicense cannabisOccupationaLicense = findByUUID_G(
			uuid, groupId);

		return remove(cannabisOccupationaLicense);
	}

	/**
	 * Returns the number of cannabis occupationa licenses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cannabis occupationa licenses
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISOCCUPATIONALICENSE_WHERE);

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
		"cannabisOccupationaLicense.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(cannabisOccupationaLicense.uuid IS NULL OR cannabisOccupationaLicense.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"cannabisOccupationaLicense.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the cannabis occupationa licenses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cannabis occupationa licenses
	 */
	@Override
	public List<CannabisOccupationaLicense> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis occupationa licenses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @return the range of matching cannabis occupationa licenses
	 */
	@Override
	public List<CannabisOccupationaLicense> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis occupationa licenses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis occupationa licenses
	 */
	@Override
	public List<CannabisOccupationaLicense> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisOccupationaLicense> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis occupationa licenses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis occupationa licenses
	 */
	@Override
	public List<CannabisOccupationaLicense> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisOccupationaLicense> orderByComparator,
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

		List<CannabisOccupationaLicense> list = null;

		if (useFinderCache) {
			list = (List<CannabisOccupationaLicense>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisOccupationaLicense cannabisOccupationaLicense :
						list) {

					if (!uuid.equals(cannabisOccupationaLicense.getUuid()) ||
						(companyId !=
							cannabisOccupationaLicense.getCompanyId())) {

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

			sb.append(_SQL_SELECT_CANNABISOCCUPATIONALICENSE_WHERE);

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
				sb.append(CannabisOccupationaLicenseModelImpl.ORDER_BY_JPQL);
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

				list = (List<CannabisOccupationaLicense>)QueryUtil.list(
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
	 * Returns the first cannabis occupationa license in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis occupationa license
	 * @throws NoSuchCannabisOccupationaLicenseException if a matching cannabis occupationa license could not be found
	 */
	@Override
	public CannabisOccupationaLicense findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CannabisOccupationaLicense> orderByComparator)
		throws NoSuchCannabisOccupationaLicenseException {

		CannabisOccupationaLicense cannabisOccupationaLicense =
			fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (cannabisOccupationaLicense != null) {
			return cannabisOccupationaLicense;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchCannabisOccupationaLicenseException(sb.toString());
	}

	/**
	 * Returns the first cannabis occupationa license in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis occupationa license, or <code>null</code> if a matching cannabis occupationa license could not be found
	 */
	@Override
	public CannabisOccupationaLicense fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CannabisOccupationaLicense> orderByComparator) {

		List<CannabisOccupationaLicense> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis occupationa license in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis occupationa license
	 * @throws NoSuchCannabisOccupationaLicenseException if a matching cannabis occupationa license could not be found
	 */
	@Override
	public CannabisOccupationaLicense findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CannabisOccupationaLicense> orderByComparator)
		throws NoSuchCannabisOccupationaLicenseException {

		CannabisOccupationaLicense cannabisOccupationaLicense =
			fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (cannabisOccupationaLicense != null) {
			return cannabisOccupationaLicense;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchCannabisOccupationaLicenseException(sb.toString());
	}

	/**
	 * Returns the last cannabis occupationa license in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis occupationa license, or <code>null</code> if a matching cannabis occupationa license could not be found
	 */
	@Override
	public CannabisOccupationaLicense fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CannabisOccupationaLicense> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<CannabisOccupationaLicense> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis occupationa licenses before and after the current cannabis occupationa license in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param cannabisOccupationaLicenseId the primary key of the current cannabis occupationa license
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis occupationa license
	 * @throws NoSuchCannabisOccupationaLicenseException if a cannabis occupationa license with the primary key could not be found
	 */
	@Override
	public CannabisOccupationaLicense[] findByUuid_C_PrevAndNext(
			long cannabisOccupationaLicenseId, String uuid, long companyId,
			OrderByComparator<CannabisOccupationaLicense> orderByComparator)
		throws NoSuchCannabisOccupationaLicenseException {

		uuid = Objects.toString(uuid, "");

		CannabisOccupationaLicense cannabisOccupationaLicense =
			findByPrimaryKey(cannabisOccupationaLicenseId);

		Session session = null;

		try {
			session = openSession();

			CannabisOccupationaLicense[] array =
				new CannabisOccupationaLicenseImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, cannabisOccupationaLicense, uuid, companyId,
				orderByComparator, true);

			array[1] = cannabisOccupationaLicense;

			array[2] = getByUuid_C_PrevAndNext(
				session, cannabisOccupationaLicense, uuid, companyId,
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

	protected CannabisOccupationaLicense getByUuid_C_PrevAndNext(
		Session session, CannabisOccupationaLicense cannabisOccupationaLicense,
		String uuid, long companyId,
		OrderByComparator<CannabisOccupationaLicense> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISOCCUPATIONALICENSE_WHERE);

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
			sb.append(CannabisOccupationaLicenseModelImpl.ORDER_BY_JPQL);
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
						cannabisOccupationaLicense)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisOccupationaLicense> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis occupationa licenses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (CannabisOccupationaLicense cannabisOccupationaLicense :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(cannabisOccupationaLicense);
		}
	}

	/**
	 * Returns the number of cannabis occupationa licenses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cannabis occupationa licenses
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISOCCUPATIONALICENSE_WHERE);

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
		"cannabisOccupationaLicense.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(cannabisOccupationaLicense.uuid IS NULL OR cannabisOccupationaLicense.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"cannabisOccupationaLicense.companyId = ?";

	private FinderPath _finderPathWithPaginationFindBygetCA_OL_CAI;
	private FinderPath _finderPathWithoutPaginationFindBygetCA_OL_CAI;
	private FinderPath _finderPathCountBygetCA_OL_CAI;

	/**
	 * Returns all the cannabis occupationa licenses where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis occupationa licenses
	 */
	@Override
	public List<CannabisOccupationaLicense> findBygetCA_OL_CAI(
		long cannabisApplicationId) {

		return findBygetCA_OL_CAI(
			cannabisApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis occupationa licenses where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @return the range of matching cannabis occupationa licenses
	 */
	@Override
	public List<CannabisOccupationaLicense> findBygetCA_OL_CAI(
		long cannabisApplicationId, int start, int end) {

		return findBygetCA_OL_CAI(cannabisApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis occupationa licenses where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis occupationa licenses
	 */
	@Override
	public List<CannabisOccupationaLicense> findBygetCA_OL_CAI(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisOccupationaLicense> orderByComparator) {

		return findBygetCA_OL_CAI(
			cannabisApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis occupationa licenses where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis occupationa licenses
	 */
	@Override
	public List<CannabisOccupationaLicense> findBygetCA_OL_CAI(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisOccupationaLicense> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetCA_OL_CAI;
				finderArgs = new Object[] {cannabisApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCA_OL_CAI;
			finderArgs = new Object[] {
				cannabisApplicationId, start, end, orderByComparator
			};
		}

		List<CannabisOccupationaLicense> list = null;

		if (useFinderCache) {
			list = (List<CannabisOccupationaLicense>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisOccupationaLicense cannabisOccupationaLicense :
						list) {

					if (cannabisApplicationId !=
							cannabisOccupationaLicense.
								getCannabisApplicationId()) {

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

			sb.append(_SQL_SELECT_CANNABISOCCUPATIONALICENSE_WHERE);

			sb.append(_FINDER_COLUMN_GETCA_OL_CAI_CANNABISAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CannabisOccupationaLicenseModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(cannabisApplicationId);

				list = (List<CannabisOccupationaLicense>)QueryUtil.list(
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
	 * Returns the first cannabis occupationa license in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis occupationa license
	 * @throws NoSuchCannabisOccupationaLicenseException if a matching cannabis occupationa license could not be found
	 */
	@Override
	public CannabisOccupationaLicense findBygetCA_OL_CAI_First(
			long cannabisApplicationId,
			OrderByComparator<CannabisOccupationaLicense> orderByComparator)
		throws NoSuchCannabisOccupationaLicenseException {

		CannabisOccupationaLicense cannabisOccupationaLicense =
			fetchBygetCA_OL_CAI_First(cannabisApplicationId, orderByComparator);

		if (cannabisOccupationaLicense != null) {
			return cannabisOccupationaLicense;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("cannabisApplicationId=");
		sb.append(cannabisApplicationId);

		sb.append("}");

		throw new NoSuchCannabisOccupationaLicenseException(sb.toString());
	}

	/**
	 * Returns the first cannabis occupationa license in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis occupationa license, or <code>null</code> if a matching cannabis occupationa license could not be found
	 */
	@Override
	public CannabisOccupationaLicense fetchBygetCA_OL_CAI_First(
		long cannabisApplicationId,
		OrderByComparator<CannabisOccupationaLicense> orderByComparator) {

		List<CannabisOccupationaLicense> list = findBygetCA_OL_CAI(
			cannabisApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis occupationa license in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis occupationa license
	 * @throws NoSuchCannabisOccupationaLicenseException if a matching cannabis occupationa license could not be found
	 */
	@Override
	public CannabisOccupationaLicense findBygetCA_OL_CAI_Last(
			long cannabisApplicationId,
			OrderByComparator<CannabisOccupationaLicense> orderByComparator)
		throws NoSuchCannabisOccupationaLicenseException {

		CannabisOccupationaLicense cannabisOccupationaLicense =
			fetchBygetCA_OL_CAI_Last(cannabisApplicationId, orderByComparator);

		if (cannabisOccupationaLicense != null) {
			return cannabisOccupationaLicense;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("cannabisApplicationId=");
		sb.append(cannabisApplicationId);

		sb.append("}");

		throw new NoSuchCannabisOccupationaLicenseException(sb.toString());
	}

	/**
	 * Returns the last cannabis occupationa license in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis occupationa license, or <code>null</code> if a matching cannabis occupationa license could not be found
	 */
	@Override
	public CannabisOccupationaLicense fetchBygetCA_OL_CAI_Last(
		long cannabisApplicationId,
		OrderByComparator<CannabisOccupationaLicense> orderByComparator) {

		int count = countBygetCA_OL_CAI(cannabisApplicationId);

		if (count == 0) {
			return null;
		}

		List<CannabisOccupationaLicense> list = findBygetCA_OL_CAI(
			cannabisApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis occupationa licenses before and after the current cannabis occupationa license in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisOccupationaLicenseId the primary key of the current cannabis occupationa license
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis occupationa license
	 * @throws NoSuchCannabisOccupationaLicenseException if a cannabis occupationa license with the primary key could not be found
	 */
	@Override
	public CannabisOccupationaLicense[] findBygetCA_OL_CAI_PrevAndNext(
			long cannabisOccupationaLicenseId, long cannabisApplicationId,
			OrderByComparator<CannabisOccupationaLicense> orderByComparator)
		throws NoSuchCannabisOccupationaLicenseException {

		CannabisOccupationaLicense cannabisOccupationaLicense =
			findByPrimaryKey(cannabisOccupationaLicenseId);

		Session session = null;

		try {
			session = openSession();

			CannabisOccupationaLicense[] array =
				new CannabisOccupationaLicenseImpl[3];

			array[0] = getBygetCA_OL_CAI_PrevAndNext(
				session, cannabisOccupationaLicense, cannabisApplicationId,
				orderByComparator, true);

			array[1] = cannabisOccupationaLicense;

			array[2] = getBygetCA_OL_CAI_PrevAndNext(
				session, cannabisOccupationaLicense, cannabisApplicationId,
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

	protected CannabisOccupationaLicense getBygetCA_OL_CAI_PrevAndNext(
		Session session, CannabisOccupationaLicense cannabisOccupationaLicense,
		long cannabisApplicationId,
		OrderByComparator<CannabisOccupationaLicense> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISOCCUPATIONALICENSE_WHERE);

		sb.append(_FINDER_COLUMN_GETCA_OL_CAI_CANNABISAPPLICATIONID_2);

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
			sb.append(CannabisOccupationaLicenseModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(cannabisApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisOccupationaLicense)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisOccupationaLicense> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis occupationa licenses where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	@Override
	public void removeBygetCA_OL_CAI(long cannabisApplicationId) {
		for (CannabisOccupationaLicense cannabisOccupationaLicense :
				findBygetCA_OL_CAI(
					cannabisApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(cannabisOccupationaLicense);
		}
	}

	/**
	 * Returns the number of cannabis occupationa licenses where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis occupationa licenses
	 */
	@Override
	public int countBygetCA_OL_CAI(long cannabisApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCA_OL_CAI;

		Object[] finderArgs = new Object[] {cannabisApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISOCCUPATIONALICENSE_WHERE);

			sb.append(_FINDER_COLUMN_GETCA_OL_CAI_CANNABISAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETCA_OL_CAI_CANNABISAPPLICATIONID_2 =
			"cannabisOccupationaLicense.cannabisApplicationId = ?";

	public CannabisOccupationaLicensePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(CannabisOccupationaLicense.class);

		setModelImplClass(CannabisOccupationaLicenseImpl.class);
		setModelPKClass(long.class);

		setTable(CannabisOccupationaLicenseTable.INSTANCE);
	}

	/**
	 * Caches the cannabis occupationa license in the entity cache if it is enabled.
	 *
	 * @param cannabisOccupationaLicense the cannabis occupationa license
	 */
	@Override
	public void cacheResult(
		CannabisOccupationaLicense cannabisOccupationaLicense) {

		entityCache.putResult(
			CannabisOccupationaLicenseImpl.class,
			cannabisOccupationaLicense.getPrimaryKey(),
			cannabisOccupationaLicense);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				cannabisOccupationaLicense.getUuid(),
				cannabisOccupationaLicense.getGroupId()
			},
			cannabisOccupationaLicense);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the cannabis occupationa licenses in the entity cache if it is enabled.
	 *
	 * @param cannabisOccupationaLicenses the cannabis occupationa licenses
	 */
	@Override
	public void cacheResult(
		List<CannabisOccupationaLicense> cannabisOccupationaLicenses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (cannabisOccupationaLicenses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CannabisOccupationaLicense cannabisOccupationaLicense :
				cannabisOccupationaLicenses) {

			if (entityCache.getResult(
					CannabisOccupationaLicenseImpl.class,
					cannabisOccupationaLicense.getPrimaryKey()) == null) {

				cacheResult(cannabisOccupationaLicense);
			}
		}
	}

	/**
	 * Clears the cache for all cannabis occupationa licenses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CannabisOccupationaLicenseImpl.class);

		finderCache.clearCache(CannabisOccupationaLicenseImpl.class);
	}

	/**
	 * Clears the cache for the cannabis occupationa license.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CannabisOccupationaLicense cannabisOccupationaLicense) {

		entityCache.removeResult(
			CannabisOccupationaLicenseImpl.class, cannabisOccupationaLicense);
	}

	@Override
	public void clearCache(
		List<CannabisOccupationaLicense> cannabisOccupationaLicenses) {

		for (CannabisOccupationaLicense cannabisOccupationaLicense :
				cannabisOccupationaLicenses) {

			entityCache.removeResult(
				CannabisOccupationaLicenseImpl.class,
				cannabisOccupationaLicense);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CannabisOccupationaLicenseImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CannabisOccupationaLicenseImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CannabisOccupationaLicenseModelImpl
			cannabisOccupationaLicenseModelImpl) {

		Object[] args = new Object[] {
			cannabisOccupationaLicenseModelImpl.getUuid(),
			cannabisOccupationaLicenseModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args,
			cannabisOccupationaLicenseModelImpl);
	}

	/**
	 * Creates a new cannabis occupationa license with the primary key. Does not add the cannabis occupationa license to the database.
	 *
	 * @param cannabisOccupationaLicenseId the primary key for the new cannabis occupationa license
	 * @return the new cannabis occupationa license
	 */
	@Override
	public CannabisOccupationaLicense create(
		long cannabisOccupationaLicenseId) {

		CannabisOccupationaLicense cannabisOccupationaLicense =
			new CannabisOccupationaLicenseImpl();

		cannabisOccupationaLicense.setNew(true);
		cannabisOccupationaLicense.setPrimaryKey(cannabisOccupationaLicenseId);

		String uuid = PortalUUIDUtil.generate();

		cannabisOccupationaLicense.setUuid(uuid);

		cannabisOccupationaLicense.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return cannabisOccupationaLicense;
	}

	/**
	 * Removes the cannabis occupationa license with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisOccupationaLicenseId the primary key of the cannabis occupationa license
	 * @return the cannabis occupationa license that was removed
	 * @throws NoSuchCannabisOccupationaLicenseException if a cannabis occupationa license with the primary key could not be found
	 */
	@Override
	public CannabisOccupationaLicense remove(long cannabisOccupationaLicenseId)
		throws NoSuchCannabisOccupationaLicenseException {

		return remove((Serializable)cannabisOccupationaLicenseId);
	}

	/**
	 * Removes the cannabis occupationa license with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cannabis occupationa license
	 * @return the cannabis occupationa license that was removed
	 * @throws NoSuchCannabisOccupationaLicenseException if a cannabis occupationa license with the primary key could not be found
	 */
	@Override
	public CannabisOccupationaLicense remove(Serializable primaryKey)
		throws NoSuchCannabisOccupationaLicenseException {

		Session session = null;

		try {
			session = openSession();

			CannabisOccupationaLicense cannabisOccupationaLicense =
				(CannabisOccupationaLicense)session.get(
					CannabisOccupationaLicenseImpl.class, primaryKey);

			if (cannabisOccupationaLicense == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCannabisOccupationaLicenseException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(cannabisOccupationaLicense);
		}
		catch (NoSuchCannabisOccupationaLicenseException
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
	protected CannabisOccupationaLicense removeImpl(
		CannabisOccupationaLicense cannabisOccupationaLicense) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cannabisOccupationaLicense)) {
				cannabisOccupationaLicense =
					(CannabisOccupationaLicense)session.get(
						CannabisOccupationaLicenseImpl.class,
						cannabisOccupationaLicense.getPrimaryKeyObj());
			}

			if (cannabisOccupationaLicense != null) {
				session.delete(cannabisOccupationaLicense);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (cannabisOccupationaLicense != null) {
			clearCache(cannabisOccupationaLicense);
		}

		return cannabisOccupationaLicense;
	}

	@Override
	public CannabisOccupationaLicense updateImpl(
		CannabisOccupationaLicense cannabisOccupationaLicense) {

		boolean isNew = cannabisOccupationaLicense.isNew();

		if (!(cannabisOccupationaLicense instanceof
				CannabisOccupationaLicenseModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(cannabisOccupationaLicense.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					cannabisOccupationaLicense);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cannabisOccupationaLicense proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CannabisOccupationaLicense implementation " +
					cannabisOccupationaLicense.getClass());
		}

		CannabisOccupationaLicenseModelImpl
			cannabisOccupationaLicenseModelImpl =
				(CannabisOccupationaLicenseModelImpl)cannabisOccupationaLicense;

		if (Validator.isNull(cannabisOccupationaLicense.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			cannabisOccupationaLicense.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (cannabisOccupationaLicense.getCreateDate() == null)) {
			if (serviceContext == null) {
				cannabisOccupationaLicense.setCreateDate(date);
			}
			else {
				cannabisOccupationaLicense.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!cannabisOccupationaLicenseModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				cannabisOccupationaLicense.setModifiedDate(date);
			}
			else {
				cannabisOccupationaLicense.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(cannabisOccupationaLicense);
			}
			else {
				cannabisOccupationaLicense =
					(CannabisOccupationaLicense)session.merge(
						cannabisOccupationaLicense);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CannabisOccupationaLicenseImpl.class,
			cannabisOccupationaLicenseModelImpl, false, true);

		cacheUniqueFindersCache(cannabisOccupationaLicenseModelImpl);

		if (isNew) {
			cannabisOccupationaLicense.setNew(false);
		}

		cannabisOccupationaLicense.resetOriginalValues();

		return cannabisOccupationaLicense;
	}

	/**
	 * Returns the cannabis occupationa license with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cannabis occupationa license
	 * @return the cannabis occupationa license
	 * @throws NoSuchCannabisOccupationaLicenseException if a cannabis occupationa license with the primary key could not be found
	 */
	@Override
	public CannabisOccupationaLicense findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCannabisOccupationaLicenseException {

		CannabisOccupationaLicense cannabisOccupationaLicense =
			fetchByPrimaryKey(primaryKey);

		if (cannabisOccupationaLicense == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCannabisOccupationaLicenseException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return cannabisOccupationaLicense;
	}

	/**
	 * Returns the cannabis occupationa license with the primary key or throws a <code>NoSuchCannabisOccupationaLicenseException</code> if it could not be found.
	 *
	 * @param cannabisOccupationaLicenseId the primary key of the cannabis occupationa license
	 * @return the cannabis occupationa license
	 * @throws NoSuchCannabisOccupationaLicenseException if a cannabis occupationa license with the primary key could not be found
	 */
	@Override
	public CannabisOccupationaLicense findByPrimaryKey(
			long cannabisOccupationaLicenseId)
		throws NoSuchCannabisOccupationaLicenseException {

		return findByPrimaryKey((Serializable)cannabisOccupationaLicenseId);
	}

	/**
	 * Returns the cannabis occupationa license with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisOccupationaLicenseId the primary key of the cannabis occupationa license
	 * @return the cannabis occupationa license, or <code>null</code> if a cannabis occupationa license with the primary key could not be found
	 */
	@Override
	public CannabisOccupationaLicense fetchByPrimaryKey(
		long cannabisOccupationaLicenseId) {

		return fetchByPrimaryKey((Serializable)cannabisOccupationaLicenseId);
	}

	/**
	 * Returns all the cannabis occupationa licenses.
	 *
	 * @return the cannabis occupationa licenses
	 */
	@Override
	public List<CannabisOccupationaLicense> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis occupationa licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @return the range of cannabis occupationa licenses
	 */
	@Override
	public List<CannabisOccupationaLicense> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis occupationa licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis occupationa licenses
	 */
	@Override
	public List<CannabisOccupationaLicense> findAll(
		int start, int end,
		OrderByComparator<CannabisOccupationaLicense> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis occupationa licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis occupationa licenses
	 */
	@Override
	public List<CannabisOccupationaLicense> findAll(
		int start, int end,
		OrderByComparator<CannabisOccupationaLicense> orderByComparator,
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

		List<CannabisOccupationaLicense> list = null;

		if (useFinderCache) {
			list = (List<CannabisOccupationaLicense>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CANNABISOCCUPATIONALICENSE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CANNABISOCCUPATIONALICENSE;

				sql = sql.concat(
					CannabisOccupationaLicenseModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CannabisOccupationaLicense>)QueryUtil.list(
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
	 * Removes all the cannabis occupationa licenses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CannabisOccupationaLicense cannabisOccupationaLicense :
				findAll()) {

			remove(cannabisOccupationaLicense);
		}
	}

	/**
	 * Returns the number of cannabis occupationa licenses.
	 *
	 * @return the number of cannabis occupationa licenses
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
					_SQL_COUNT_CANNABISOCCUPATIONALICENSE);

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
		return "cannabisOccupationaLicenseId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CANNABISOCCUPATIONALICENSE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CannabisOccupationaLicenseModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cannabis occupationa license persistence.
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

		_finderPathWithPaginationFindBygetCA_OL_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCA_OL_CAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"cannabisApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetCA_OL_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetCA_OL_CAI",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, true);

		_finderPathCountBygetCA_OL_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCA_OL_CAI",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, false);

		CannabisOccupationaLicenseUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CannabisOccupationaLicenseUtil.setPersistence(null);

		entityCache.removeCache(CannabisOccupationaLicenseImpl.class.getName());
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

	private static final String _SQL_SELECT_CANNABISOCCUPATIONALICENSE =
		"SELECT cannabisOccupationaLicense FROM CannabisOccupationaLicense cannabisOccupationaLicense";

	private static final String _SQL_SELECT_CANNABISOCCUPATIONALICENSE_WHERE =
		"SELECT cannabisOccupationaLicense FROM CannabisOccupationaLicense cannabisOccupationaLicense WHERE ";

	private static final String _SQL_COUNT_CANNABISOCCUPATIONALICENSE =
		"SELECT COUNT(cannabisOccupationaLicense) FROM CannabisOccupationaLicense cannabisOccupationaLicense";

	private static final String _SQL_COUNT_CANNABISOCCUPATIONALICENSE_WHERE =
		"SELECT COUNT(cannabisOccupationaLicense) FROM CannabisOccupationaLicense cannabisOccupationaLicense WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"cannabisOccupationaLicense.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CannabisOccupationaLicense exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CannabisOccupationaLicense exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CannabisOccupationaLicensePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}