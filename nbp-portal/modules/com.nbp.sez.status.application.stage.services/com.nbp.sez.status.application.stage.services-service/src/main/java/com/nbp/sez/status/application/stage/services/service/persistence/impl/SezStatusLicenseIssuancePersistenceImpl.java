/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service.persistence.impl;

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

import com.nbp.sez.status.application.stage.services.exception.NoSuchSezStatusLicenseIssuanceException;
import com.nbp.sez.status.application.stage.services.model.SezStatusLicenseIssuance;
import com.nbp.sez.status.application.stage.services.model.SezStatusLicenseIssuanceTable;
import com.nbp.sez.status.application.stage.services.model.impl.SezStatusLicenseIssuanceImpl;
import com.nbp.sez.status.application.stage.services.model.impl.SezStatusLicenseIssuanceModelImpl;
import com.nbp.sez.status.application.stage.services.service.persistence.SezStatusLicenseIssuancePersistence;
import com.nbp.sez.status.application.stage.services.service.persistence.SezStatusLicenseIssuanceUtil;
import com.nbp.sez.status.application.stage.services.service.persistence.impl.constants.SEZ_STATUS_STAGESPersistenceConstants;

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
 * The persistence implementation for the sez status license issuance service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezStatusLicenseIssuancePersistence.class)
public class SezStatusLicenseIssuancePersistenceImpl
	extends BasePersistenceImpl<SezStatusLicenseIssuance>
	implements SezStatusLicenseIssuancePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezStatusLicenseIssuanceUtil</code> to access the sez status license issuance persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezStatusLicenseIssuanceImpl.class.getName();

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
	 * Returns all the sez status license issuances where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching sez status license issuances
	 */
	@Override
	public List<SezStatusLicenseIssuance> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status license issuances where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status license issuances
	 * @param end the upper bound of the range of sez status license issuances (not inclusive)
	 * @return the range of matching sez status license issuances
	 */
	@Override
	public List<SezStatusLicenseIssuance> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status license issuances where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status license issuances
	 * @param end the upper bound of the range of sez status license issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status license issuances
	 */
	@Override
	public List<SezStatusLicenseIssuance> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SezStatusLicenseIssuance> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status license issuances where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status license issuances
	 * @param end the upper bound of the range of sez status license issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status license issuances
	 */
	@Override
	public List<SezStatusLicenseIssuance> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SezStatusLicenseIssuance> orderByComparator,
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

		List<SezStatusLicenseIssuance> list = null;

		if (useFinderCache) {
			list = (List<SezStatusLicenseIssuance>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezStatusLicenseIssuance sezStatusLicenseIssuance : list) {
					if (!uuid.equals(sezStatusLicenseIssuance.getUuid())) {
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

			sb.append(_SQL_SELECT_SEZSTATUSLICENSEISSUANCE_WHERE);

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
				sb.append(SezStatusLicenseIssuanceModelImpl.ORDER_BY_JPQL);
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

				list = (List<SezStatusLicenseIssuance>)QueryUtil.list(
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
	 * Returns the first sez status license issuance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status license issuance
	 * @throws NoSuchSezStatusLicenseIssuanceException if a matching sez status license issuance could not be found
	 */
	@Override
	public SezStatusLicenseIssuance findByUuid_First(
			String uuid,
			OrderByComparator<SezStatusLicenseIssuance> orderByComparator)
		throws NoSuchSezStatusLicenseIssuanceException {

		SezStatusLicenseIssuance sezStatusLicenseIssuance = fetchByUuid_First(
			uuid, orderByComparator);

		if (sezStatusLicenseIssuance != null) {
			return sezStatusLicenseIssuance;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchSezStatusLicenseIssuanceException(sb.toString());
	}

	/**
	 * Returns the first sez status license issuance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status license issuance, or <code>null</code> if a matching sez status license issuance could not be found
	 */
	@Override
	public SezStatusLicenseIssuance fetchByUuid_First(
		String uuid,
		OrderByComparator<SezStatusLicenseIssuance> orderByComparator) {

		List<SezStatusLicenseIssuance> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez status license issuance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status license issuance
	 * @throws NoSuchSezStatusLicenseIssuanceException if a matching sez status license issuance could not be found
	 */
	@Override
	public SezStatusLicenseIssuance findByUuid_Last(
			String uuid,
			OrderByComparator<SezStatusLicenseIssuance> orderByComparator)
		throws NoSuchSezStatusLicenseIssuanceException {

		SezStatusLicenseIssuance sezStatusLicenseIssuance = fetchByUuid_Last(
			uuid, orderByComparator);

		if (sezStatusLicenseIssuance != null) {
			return sezStatusLicenseIssuance;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchSezStatusLicenseIssuanceException(sb.toString());
	}

	/**
	 * Returns the last sez status license issuance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status license issuance, or <code>null</code> if a matching sez status license issuance could not be found
	 */
	@Override
	public SezStatusLicenseIssuance fetchByUuid_Last(
		String uuid,
		OrderByComparator<SezStatusLicenseIssuance> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<SezStatusLicenseIssuance> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez status license issuances before and after the current sez status license issuance in the ordered set where uuid = &#63;.
	 *
	 * @param sezStatusLicIssuedId the primary key of the current sez status license issuance
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status license issuance
	 * @throws NoSuchSezStatusLicenseIssuanceException if a sez status license issuance with the primary key could not be found
	 */
	@Override
	public SezStatusLicenseIssuance[] findByUuid_PrevAndNext(
			long sezStatusLicIssuedId, String uuid,
			OrderByComparator<SezStatusLicenseIssuance> orderByComparator)
		throws NoSuchSezStatusLicenseIssuanceException {

		uuid = Objects.toString(uuid, "");

		SezStatusLicenseIssuance sezStatusLicenseIssuance = findByPrimaryKey(
			sezStatusLicIssuedId);

		Session session = null;

		try {
			session = openSession();

			SezStatusLicenseIssuance[] array =
				new SezStatusLicenseIssuanceImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, sezStatusLicenseIssuance, uuid, orderByComparator,
				true);

			array[1] = sezStatusLicenseIssuance;

			array[2] = getByUuid_PrevAndNext(
				session, sezStatusLicenseIssuance, uuid, orderByComparator,
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

	protected SezStatusLicenseIssuance getByUuid_PrevAndNext(
		Session session, SezStatusLicenseIssuance sezStatusLicenseIssuance,
		String uuid,
		OrderByComparator<SezStatusLicenseIssuance> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZSTATUSLICENSEISSUANCE_WHERE);

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
			sb.append(SezStatusLicenseIssuanceModelImpl.ORDER_BY_JPQL);
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
						sezStatusLicenseIssuance)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezStatusLicenseIssuance> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez status license issuances where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (SezStatusLicenseIssuance sezStatusLicenseIssuance :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(sezStatusLicenseIssuance);
		}
	}

	/**
	 * Returns the number of sez status license issuances where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching sez status license issuances
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZSTATUSLICENSEISSUANCE_WHERE);

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
		"sezStatusLicenseIssuance.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(sezStatusLicenseIssuance.uuid IS NULL OR sezStatusLicenseIssuance.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the sez status license issuance where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSezStatusLicenseIssuanceException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sez status license issuance
	 * @throws NoSuchSezStatusLicenseIssuanceException if a matching sez status license issuance could not be found
	 */
	@Override
	public SezStatusLicenseIssuance findByUUID_G(String uuid, long groupId)
		throws NoSuchSezStatusLicenseIssuanceException {

		SezStatusLicenseIssuance sezStatusLicenseIssuance = fetchByUUID_G(
			uuid, groupId);

		if (sezStatusLicenseIssuance == null) {
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

			throw new NoSuchSezStatusLicenseIssuanceException(sb.toString());
		}

		return sezStatusLicenseIssuance;
	}

	/**
	 * Returns the sez status license issuance where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sez status license issuance, or <code>null</code> if a matching sez status license issuance could not be found
	 */
	@Override
	public SezStatusLicenseIssuance fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the sez status license issuance where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status license issuance, or <code>null</code> if a matching sez status license issuance could not be found
	 */
	@Override
	public SezStatusLicenseIssuance fetchByUUID_G(
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

		if (result instanceof SezStatusLicenseIssuance) {
			SezStatusLicenseIssuance sezStatusLicenseIssuance =
				(SezStatusLicenseIssuance)result;

			if (!Objects.equals(uuid, sezStatusLicenseIssuance.getUuid()) ||
				(groupId != sezStatusLicenseIssuance.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_SEZSTATUSLICENSEISSUANCE_WHERE);

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

				List<SezStatusLicenseIssuance> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					SezStatusLicenseIssuance sezStatusLicenseIssuance =
						list.get(0);

					result = sezStatusLicenseIssuance;

					cacheResult(sezStatusLicenseIssuance);
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
			return (SezStatusLicenseIssuance)result;
		}
	}

	/**
	 * Removes the sez status license issuance where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the sez status license issuance that was removed
	 */
	@Override
	public SezStatusLicenseIssuance removeByUUID_G(String uuid, long groupId)
		throws NoSuchSezStatusLicenseIssuanceException {

		SezStatusLicenseIssuance sezStatusLicenseIssuance = findByUUID_G(
			uuid, groupId);

		return remove(sezStatusLicenseIssuance);
	}

	/**
	 * Returns the number of sez status license issuances where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching sez status license issuances
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_SEZSTATUSLICENSEISSUANCE_WHERE);

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
		"sezStatusLicenseIssuance.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(sezStatusLicenseIssuance.uuid IS NULL OR sezStatusLicenseIssuance.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"sezStatusLicenseIssuance.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the sez status license issuances where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching sez status license issuances
	 */
	@Override
	public List<SezStatusLicenseIssuance> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status license issuances where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status license issuances
	 * @param end the upper bound of the range of sez status license issuances (not inclusive)
	 * @return the range of matching sez status license issuances
	 */
	@Override
	public List<SezStatusLicenseIssuance> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status license issuances where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status license issuances
	 * @param end the upper bound of the range of sez status license issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status license issuances
	 */
	@Override
	public List<SezStatusLicenseIssuance> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SezStatusLicenseIssuance> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status license issuances where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status license issuances
	 * @param end the upper bound of the range of sez status license issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status license issuances
	 */
	@Override
	public List<SezStatusLicenseIssuance> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SezStatusLicenseIssuance> orderByComparator,
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

		List<SezStatusLicenseIssuance> list = null;

		if (useFinderCache) {
			list = (List<SezStatusLicenseIssuance>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezStatusLicenseIssuance sezStatusLicenseIssuance : list) {
					if (!uuid.equals(sezStatusLicenseIssuance.getUuid()) ||
						(companyId !=
							sezStatusLicenseIssuance.getCompanyId())) {

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

			sb.append(_SQL_SELECT_SEZSTATUSLICENSEISSUANCE_WHERE);

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
				sb.append(SezStatusLicenseIssuanceModelImpl.ORDER_BY_JPQL);
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

				list = (List<SezStatusLicenseIssuance>)QueryUtil.list(
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
	 * Returns the first sez status license issuance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status license issuance
	 * @throws NoSuchSezStatusLicenseIssuanceException if a matching sez status license issuance could not be found
	 */
	@Override
	public SezStatusLicenseIssuance findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<SezStatusLicenseIssuance> orderByComparator)
		throws NoSuchSezStatusLicenseIssuanceException {

		SezStatusLicenseIssuance sezStatusLicenseIssuance = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (sezStatusLicenseIssuance != null) {
			return sezStatusLicenseIssuance;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchSezStatusLicenseIssuanceException(sb.toString());
	}

	/**
	 * Returns the first sez status license issuance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status license issuance, or <code>null</code> if a matching sez status license issuance could not be found
	 */
	@Override
	public SezStatusLicenseIssuance fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<SezStatusLicenseIssuance> orderByComparator) {

		List<SezStatusLicenseIssuance> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez status license issuance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status license issuance
	 * @throws NoSuchSezStatusLicenseIssuanceException if a matching sez status license issuance could not be found
	 */
	@Override
	public SezStatusLicenseIssuance findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<SezStatusLicenseIssuance> orderByComparator)
		throws NoSuchSezStatusLicenseIssuanceException {

		SezStatusLicenseIssuance sezStatusLicenseIssuance = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (sezStatusLicenseIssuance != null) {
			return sezStatusLicenseIssuance;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchSezStatusLicenseIssuanceException(sb.toString());
	}

	/**
	 * Returns the last sez status license issuance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status license issuance, or <code>null</code> if a matching sez status license issuance could not be found
	 */
	@Override
	public SezStatusLicenseIssuance fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<SezStatusLicenseIssuance> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<SezStatusLicenseIssuance> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez status license issuances before and after the current sez status license issuance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param sezStatusLicIssuedId the primary key of the current sez status license issuance
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status license issuance
	 * @throws NoSuchSezStatusLicenseIssuanceException if a sez status license issuance with the primary key could not be found
	 */
	@Override
	public SezStatusLicenseIssuance[] findByUuid_C_PrevAndNext(
			long sezStatusLicIssuedId, String uuid, long companyId,
			OrderByComparator<SezStatusLicenseIssuance> orderByComparator)
		throws NoSuchSezStatusLicenseIssuanceException {

		uuid = Objects.toString(uuid, "");

		SezStatusLicenseIssuance sezStatusLicenseIssuance = findByPrimaryKey(
			sezStatusLicIssuedId);

		Session session = null;

		try {
			session = openSession();

			SezStatusLicenseIssuance[] array =
				new SezStatusLicenseIssuanceImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, sezStatusLicenseIssuance, uuid, companyId,
				orderByComparator, true);

			array[1] = sezStatusLicenseIssuance;

			array[2] = getByUuid_C_PrevAndNext(
				session, sezStatusLicenseIssuance, uuid, companyId,
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

	protected SezStatusLicenseIssuance getByUuid_C_PrevAndNext(
		Session session, SezStatusLicenseIssuance sezStatusLicenseIssuance,
		String uuid, long companyId,
		OrderByComparator<SezStatusLicenseIssuance> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZSTATUSLICENSEISSUANCE_WHERE);

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
			sb.append(SezStatusLicenseIssuanceModelImpl.ORDER_BY_JPQL);
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
						sezStatusLicenseIssuance)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezStatusLicenseIssuance> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez status license issuances where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (SezStatusLicenseIssuance sezStatusLicenseIssuance :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(sezStatusLicenseIssuance);
		}
	}

	/**
	 * Returns the number of sez status license issuances where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching sez status license issuances
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_SEZSTATUSLICENSEISSUANCE_WHERE);

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
		"sezStatusLicenseIssuance.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(sezStatusLicenseIssuance.uuid IS NULL OR sezStatusLicenseIssuance.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"sezStatusLicenseIssuance.companyId = ?";

	private FinderPath _finderPathFetchBygetSezStatus_License_Issuance_By_CI;
	private FinderPath _finderPathCountBygetSezStatus_License_Issuance_By_CI;

	/**
	 * Returns the sez status license issuance where caseId = &#63; or throws a <code>NoSuchSezStatusLicenseIssuanceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status license issuance
	 * @throws NoSuchSezStatusLicenseIssuanceException if a matching sez status license issuance could not be found
	 */
	@Override
	public SezStatusLicenseIssuance findBygetSezStatus_License_Issuance_By_CI(
			String caseId)
		throws NoSuchSezStatusLicenseIssuanceException {

		SezStatusLicenseIssuance sezStatusLicenseIssuance =
			fetchBygetSezStatus_License_Issuance_By_CI(caseId);

		if (sezStatusLicenseIssuance == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezStatusLicenseIssuanceException(sb.toString());
		}

		return sezStatusLicenseIssuance;
	}

	/**
	 * Returns the sez status license issuance where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status license issuance, or <code>null</code> if a matching sez status license issuance could not be found
	 */
	@Override
	public SezStatusLicenseIssuance fetchBygetSezStatus_License_Issuance_By_CI(
		String caseId) {

		return fetchBygetSezStatus_License_Issuance_By_CI(caseId, true);
	}

	/**
	 * Returns the sez status license issuance where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status license issuance, or <code>null</code> if a matching sez status license issuance could not be found
	 */
	@Override
	public SezStatusLicenseIssuance fetchBygetSezStatus_License_Issuance_By_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetSezStatus_License_Issuance_By_CI,
				finderArgs, this);
		}

		if (result instanceof SezStatusLicenseIssuance) {
			SezStatusLicenseIssuance sezStatusLicenseIssuance =
				(SezStatusLicenseIssuance)result;

			if (!Objects.equals(caseId, sezStatusLicenseIssuance.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZSTATUSLICENSEISSUANCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETSEZSTATUS_LICENSE_ISSUANCE_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETSEZSTATUS_LICENSE_ISSUANCE_BY_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				List<SezStatusLicenseIssuance> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetSezStatus_License_Issuance_By_CI,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId};
							}

							_log.warn(
								"SezStatusLicenseIssuancePersistenceImpl.fetchBygetSezStatus_License_Issuance_By_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezStatusLicenseIssuance sezStatusLicenseIssuance =
						list.get(0);

					result = sezStatusLicenseIssuance;

					cacheResult(sezStatusLicenseIssuance);
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
			return (SezStatusLicenseIssuance)result;
		}
	}

	/**
	 * Removes the sez status license issuance where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the sez status license issuance that was removed
	 */
	@Override
	public SezStatusLicenseIssuance removeBygetSezStatus_License_Issuance_By_CI(
			String caseId)
		throws NoSuchSezStatusLicenseIssuanceException {

		SezStatusLicenseIssuance sezStatusLicenseIssuance =
			findBygetSezStatus_License_Issuance_By_CI(caseId);

		return remove(sezStatusLicenseIssuance);
	}

	/**
	 * Returns the number of sez status license issuances where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching sez status license issuances
	 */
	@Override
	public int countBygetSezStatus_License_Issuance_By_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath =
			_finderPathCountBygetSezStatus_License_Issuance_By_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZSTATUSLICENSEISSUANCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETSEZSTATUS_LICENSE_ISSUANCE_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETSEZSTATUS_LICENSE_ISSUANCE_BY_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
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
		_FINDER_COLUMN_GETSEZSTATUS_LICENSE_ISSUANCE_BY_CI_CASEID_2 =
			"sezStatusLicenseIssuance.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETSEZSTATUS_LICENSE_ISSUANCE_BY_CI_CASEID_3 =
			"(sezStatusLicenseIssuance.caseId IS NULL OR sezStatusLicenseIssuance.caseId = '')";

	public SezStatusLicenseIssuancePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(SezStatusLicenseIssuance.class);

		setModelImplClass(SezStatusLicenseIssuanceImpl.class);
		setModelPKClass(long.class);

		setTable(SezStatusLicenseIssuanceTable.INSTANCE);
	}

	/**
	 * Caches the sez status license issuance in the entity cache if it is enabled.
	 *
	 * @param sezStatusLicenseIssuance the sez status license issuance
	 */
	@Override
	public void cacheResult(SezStatusLicenseIssuance sezStatusLicenseIssuance) {
		entityCache.putResult(
			SezStatusLicenseIssuanceImpl.class,
			sezStatusLicenseIssuance.getPrimaryKey(), sezStatusLicenseIssuance);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				sezStatusLicenseIssuance.getUuid(),
				sezStatusLicenseIssuance.getGroupId()
			},
			sezStatusLicenseIssuance);

		finderCache.putResult(
			_finderPathFetchBygetSezStatus_License_Issuance_By_CI,
			new Object[] {sezStatusLicenseIssuance.getCaseId()},
			sezStatusLicenseIssuance);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez status license issuances in the entity cache if it is enabled.
	 *
	 * @param sezStatusLicenseIssuances the sez status license issuances
	 */
	@Override
	public void cacheResult(
		List<SezStatusLicenseIssuance> sezStatusLicenseIssuances) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezStatusLicenseIssuances.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezStatusLicenseIssuance sezStatusLicenseIssuance :
				sezStatusLicenseIssuances) {

			if (entityCache.getResult(
					SezStatusLicenseIssuanceImpl.class,
					sezStatusLicenseIssuance.getPrimaryKey()) == null) {

				cacheResult(sezStatusLicenseIssuance);
			}
		}
	}

	/**
	 * Clears the cache for all sez status license issuances.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezStatusLicenseIssuanceImpl.class);

		finderCache.clearCache(SezStatusLicenseIssuanceImpl.class);
	}

	/**
	 * Clears the cache for the sez status license issuance.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SezStatusLicenseIssuance sezStatusLicenseIssuance) {
		entityCache.removeResult(
			SezStatusLicenseIssuanceImpl.class, sezStatusLicenseIssuance);
	}

	@Override
	public void clearCache(
		List<SezStatusLicenseIssuance> sezStatusLicenseIssuances) {

		for (SezStatusLicenseIssuance sezStatusLicenseIssuance :
				sezStatusLicenseIssuances) {

			entityCache.removeResult(
				SezStatusLicenseIssuanceImpl.class, sezStatusLicenseIssuance);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezStatusLicenseIssuanceImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezStatusLicenseIssuanceImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezStatusLicenseIssuanceModelImpl sezStatusLicenseIssuanceModelImpl) {

		Object[] args = new Object[] {
			sezStatusLicenseIssuanceModelImpl.getUuid(),
			sezStatusLicenseIssuanceModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, sezStatusLicenseIssuanceModelImpl);

		args = new Object[] {sezStatusLicenseIssuanceModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetSezStatus_License_Issuance_By_CI, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatus_License_Issuance_By_CI, args,
			sezStatusLicenseIssuanceModelImpl);
	}

	/**
	 * Creates a new sez status license issuance with the primary key. Does not add the sez status license issuance to the database.
	 *
	 * @param sezStatusLicIssuedId the primary key for the new sez status license issuance
	 * @return the new sez status license issuance
	 */
	@Override
	public SezStatusLicenseIssuance create(long sezStatusLicIssuedId) {
		SezStatusLicenseIssuance sezStatusLicenseIssuance =
			new SezStatusLicenseIssuanceImpl();

		sezStatusLicenseIssuance.setNew(true);
		sezStatusLicenseIssuance.setPrimaryKey(sezStatusLicIssuedId);

		String uuid = PortalUUIDUtil.generate();

		sezStatusLicenseIssuance.setUuid(uuid);

		sezStatusLicenseIssuance.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezStatusLicenseIssuance;
	}

	/**
	 * Removes the sez status license issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezStatusLicIssuedId the primary key of the sez status license issuance
	 * @return the sez status license issuance that was removed
	 * @throws NoSuchSezStatusLicenseIssuanceException if a sez status license issuance with the primary key could not be found
	 */
	@Override
	public SezStatusLicenseIssuance remove(long sezStatusLicIssuedId)
		throws NoSuchSezStatusLicenseIssuanceException {

		return remove((Serializable)sezStatusLicIssuedId);
	}

	/**
	 * Removes the sez status license issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez status license issuance
	 * @return the sez status license issuance that was removed
	 * @throws NoSuchSezStatusLicenseIssuanceException if a sez status license issuance with the primary key could not be found
	 */
	@Override
	public SezStatusLicenseIssuance remove(Serializable primaryKey)
		throws NoSuchSezStatusLicenseIssuanceException {

		Session session = null;

		try {
			session = openSession();

			SezStatusLicenseIssuance sezStatusLicenseIssuance =
				(SezStatusLicenseIssuance)session.get(
					SezStatusLicenseIssuanceImpl.class, primaryKey);

			if (sezStatusLicenseIssuance == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezStatusLicenseIssuanceException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezStatusLicenseIssuance);
		}
		catch (NoSuchSezStatusLicenseIssuanceException noSuchEntityException) {
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
	protected SezStatusLicenseIssuance removeImpl(
		SezStatusLicenseIssuance sezStatusLicenseIssuance) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezStatusLicenseIssuance)) {
				sezStatusLicenseIssuance =
					(SezStatusLicenseIssuance)session.get(
						SezStatusLicenseIssuanceImpl.class,
						sezStatusLicenseIssuance.getPrimaryKeyObj());
			}

			if (sezStatusLicenseIssuance != null) {
				session.delete(sezStatusLicenseIssuance);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezStatusLicenseIssuance != null) {
			clearCache(sezStatusLicenseIssuance);
		}

		return sezStatusLicenseIssuance;
	}

	@Override
	public SezStatusLicenseIssuance updateImpl(
		SezStatusLicenseIssuance sezStatusLicenseIssuance) {

		boolean isNew = sezStatusLicenseIssuance.isNew();

		if (!(sezStatusLicenseIssuance instanceof
				SezStatusLicenseIssuanceModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezStatusLicenseIssuance.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezStatusLicenseIssuance);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezStatusLicenseIssuance proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezStatusLicenseIssuance implementation " +
					sezStatusLicenseIssuance.getClass());
		}

		SezStatusLicenseIssuanceModelImpl sezStatusLicenseIssuanceModelImpl =
			(SezStatusLicenseIssuanceModelImpl)sezStatusLicenseIssuance;

		if (Validator.isNull(sezStatusLicenseIssuance.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			sezStatusLicenseIssuance.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezStatusLicenseIssuance.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezStatusLicenseIssuance.setCreateDate(date);
			}
			else {
				sezStatusLicenseIssuance.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezStatusLicenseIssuanceModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezStatusLicenseIssuance.setModifiedDate(date);
			}
			else {
				sezStatusLicenseIssuance.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezStatusLicenseIssuance);
			}
			else {
				sezStatusLicenseIssuance =
					(SezStatusLicenseIssuance)session.merge(
						sezStatusLicenseIssuance);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezStatusLicenseIssuanceImpl.class,
			sezStatusLicenseIssuanceModelImpl, false, true);

		cacheUniqueFindersCache(sezStatusLicenseIssuanceModelImpl);

		if (isNew) {
			sezStatusLicenseIssuance.setNew(false);
		}

		sezStatusLicenseIssuance.resetOriginalValues();

		return sezStatusLicenseIssuance;
	}

	/**
	 * Returns the sez status license issuance with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez status license issuance
	 * @return the sez status license issuance
	 * @throws NoSuchSezStatusLicenseIssuanceException if a sez status license issuance with the primary key could not be found
	 */
	@Override
	public SezStatusLicenseIssuance findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezStatusLicenseIssuanceException {

		SezStatusLicenseIssuance sezStatusLicenseIssuance = fetchByPrimaryKey(
			primaryKey);

		if (sezStatusLicenseIssuance == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezStatusLicenseIssuanceException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezStatusLicenseIssuance;
	}

	/**
	 * Returns the sez status license issuance with the primary key or throws a <code>NoSuchSezStatusLicenseIssuanceException</code> if it could not be found.
	 *
	 * @param sezStatusLicIssuedId the primary key of the sez status license issuance
	 * @return the sez status license issuance
	 * @throws NoSuchSezStatusLicenseIssuanceException if a sez status license issuance with the primary key could not be found
	 */
	@Override
	public SezStatusLicenseIssuance findByPrimaryKey(long sezStatusLicIssuedId)
		throws NoSuchSezStatusLicenseIssuanceException {

		return findByPrimaryKey((Serializable)sezStatusLicIssuedId);
	}

	/**
	 * Returns the sez status license issuance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezStatusLicIssuedId the primary key of the sez status license issuance
	 * @return the sez status license issuance, or <code>null</code> if a sez status license issuance with the primary key could not be found
	 */
	@Override
	public SezStatusLicenseIssuance fetchByPrimaryKey(
		long sezStatusLicIssuedId) {

		return fetchByPrimaryKey((Serializable)sezStatusLicIssuedId);
	}

	/**
	 * Returns all the sez status license issuances.
	 *
	 * @return the sez status license issuances
	 */
	@Override
	public List<SezStatusLicenseIssuance> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status license issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status license issuances
	 * @param end the upper bound of the range of sez status license issuances (not inclusive)
	 * @return the range of sez status license issuances
	 */
	@Override
	public List<SezStatusLicenseIssuance> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status license issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status license issuances
	 * @param end the upper bound of the range of sez status license issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status license issuances
	 */
	@Override
	public List<SezStatusLicenseIssuance> findAll(
		int start, int end,
		OrderByComparator<SezStatusLicenseIssuance> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status license issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status license issuances
	 * @param end the upper bound of the range of sez status license issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status license issuances
	 */
	@Override
	public List<SezStatusLicenseIssuance> findAll(
		int start, int end,
		OrderByComparator<SezStatusLicenseIssuance> orderByComparator,
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

		List<SezStatusLicenseIssuance> list = null;

		if (useFinderCache) {
			list = (List<SezStatusLicenseIssuance>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZSTATUSLICENSEISSUANCE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZSTATUSLICENSEISSUANCE;

				sql = sql.concat(
					SezStatusLicenseIssuanceModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezStatusLicenseIssuance>)QueryUtil.list(
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
	 * Removes all the sez status license issuances from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezStatusLicenseIssuance sezStatusLicenseIssuance : findAll()) {
			remove(sezStatusLicenseIssuance);
		}
	}

	/**
	 * Returns the number of sez status license issuances.
	 *
	 * @return the number of sez status license issuances
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
					_SQL_COUNT_SEZSTATUSLICENSEISSUANCE);

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
		return "sezStatusLicIssuedId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZSTATUSLICENSEISSUANCE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezStatusLicenseIssuanceModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez status license issuance persistence.
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

		_finderPathFetchBygetSezStatus_License_Issuance_By_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY,
			"fetchBygetSezStatus_License_Issuance_By_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetSezStatus_License_Issuance_By_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSezStatus_License_Issuance_By_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		SezStatusLicenseIssuanceUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezStatusLicenseIssuanceUtil.setPersistence(null);

		entityCache.removeCache(SezStatusLicenseIssuanceImpl.class.getName());
	}

	@Override
	@Reference(
		target = SEZ_STATUS_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = SEZ_STATUS_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = SEZ_STATUS_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SEZSTATUSLICENSEISSUANCE =
		"SELECT sezStatusLicenseIssuance FROM SezStatusLicenseIssuance sezStatusLicenseIssuance";

	private static final String _SQL_SELECT_SEZSTATUSLICENSEISSUANCE_WHERE =
		"SELECT sezStatusLicenseIssuance FROM SezStatusLicenseIssuance sezStatusLicenseIssuance WHERE ";

	private static final String _SQL_COUNT_SEZSTATUSLICENSEISSUANCE =
		"SELECT COUNT(sezStatusLicenseIssuance) FROM SezStatusLicenseIssuance sezStatusLicenseIssuance";

	private static final String _SQL_COUNT_SEZSTATUSLICENSEISSUANCE_WHERE =
		"SELECT COUNT(sezStatusLicenseIssuance) FROM SezStatusLicenseIssuance sezStatusLicenseIssuance WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezStatusLicenseIssuance.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezStatusLicenseIssuance exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezStatusLicenseIssuance exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezStatusLicenseIssuancePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}