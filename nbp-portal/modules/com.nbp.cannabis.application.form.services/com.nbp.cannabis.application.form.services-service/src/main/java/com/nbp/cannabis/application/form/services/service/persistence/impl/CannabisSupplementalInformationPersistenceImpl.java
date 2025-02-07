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

import com.nbp.cannabis.application.form.services.exception.NoSuchCannabisSupplementalInformationException;
import com.nbp.cannabis.application.form.services.model.CannabisSupplementalInformation;
import com.nbp.cannabis.application.form.services.model.CannabisSupplementalInformationTable;
import com.nbp.cannabis.application.form.services.model.impl.CannabisSupplementalInformationImpl;
import com.nbp.cannabis.application.form.services.model.impl.CannabisSupplementalInformationModelImpl;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisSupplementalInformationPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisSupplementalInformationUtil;
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
 * The persistence implementation for the cannabis supplemental information service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CannabisSupplementalInformationPersistence.class)
public class CannabisSupplementalInformationPersistenceImpl
	extends BasePersistenceImpl<CannabisSupplementalInformation>
	implements CannabisSupplementalInformationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CannabisSupplementalInformationUtil</code> to access the cannabis supplemental information persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CannabisSupplementalInformationImpl.class.getName();

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
	 * Returns all the cannabis supplemental informations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cannabis supplemental informations
	 */
	@Override
	public List<CannabisSupplementalInformation> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis supplemental informations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @return the range of matching cannabis supplemental informations
	 */
	@Override
	public List<CannabisSupplementalInformation> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis supplemental informations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis supplemental informations
	 */
	@Override
	public List<CannabisSupplementalInformation> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisSupplementalInformation> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis supplemental informations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis supplemental informations
	 */
	@Override
	public List<CannabisSupplementalInformation> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisSupplementalInformation> orderByComparator,
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

		List<CannabisSupplementalInformation> list = null;

		if (useFinderCache) {
			list = (List<CannabisSupplementalInformation>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisSupplementalInformation
						cannabisSupplementalInformation : list) {

					if (!uuid.equals(
							cannabisSupplementalInformation.getUuid())) {

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

			sb.append(_SQL_SELECT_CANNABISSUPPLEMENTALINFORMATION_WHERE);

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
					CannabisSupplementalInformationModelImpl.ORDER_BY_JPQL);
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

				list = (List<CannabisSupplementalInformation>)QueryUtil.list(
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
	 * Returns the first cannabis supplemental information in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis supplemental information
	 * @throws NoSuchCannabisSupplementalInformationException if a matching cannabis supplemental information could not be found
	 */
	@Override
	public CannabisSupplementalInformation findByUuid_First(
			String uuid,
			OrderByComparator<CannabisSupplementalInformation>
				orderByComparator)
		throws NoSuchCannabisSupplementalInformationException {

		CannabisSupplementalInformation cannabisSupplementalInformation =
			fetchByUuid_First(uuid, orderByComparator);

		if (cannabisSupplementalInformation != null) {
			return cannabisSupplementalInformation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchCannabisSupplementalInformationException(sb.toString());
	}

	/**
	 * Returns the first cannabis supplemental information in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis supplemental information, or <code>null</code> if a matching cannabis supplemental information could not be found
	 */
	@Override
	public CannabisSupplementalInformation fetchByUuid_First(
		String uuid,
		OrderByComparator<CannabisSupplementalInformation> orderByComparator) {

		List<CannabisSupplementalInformation> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis supplemental information in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis supplemental information
	 * @throws NoSuchCannabisSupplementalInformationException if a matching cannabis supplemental information could not be found
	 */
	@Override
	public CannabisSupplementalInformation findByUuid_Last(
			String uuid,
			OrderByComparator<CannabisSupplementalInformation>
				orderByComparator)
		throws NoSuchCannabisSupplementalInformationException {

		CannabisSupplementalInformation cannabisSupplementalInformation =
			fetchByUuid_Last(uuid, orderByComparator);

		if (cannabisSupplementalInformation != null) {
			return cannabisSupplementalInformation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchCannabisSupplementalInformationException(sb.toString());
	}

	/**
	 * Returns the last cannabis supplemental information in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis supplemental information, or <code>null</code> if a matching cannabis supplemental information could not be found
	 */
	@Override
	public CannabisSupplementalInformation fetchByUuid_Last(
		String uuid,
		OrderByComparator<CannabisSupplementalInformation> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<CannabisSupplementalInformation> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis supplemental informations before and after the current cannabis supplemental information in the ordered set where uuid = &#63;.
	 *
	 * @param cannabisSupplementalInfoId the primary key of the current cannabis supplemental information
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis supplemental information
	 * @throws NoSuchCannabisSupplementalInformationException if a cannabis supplemental information with the primary key could not be found
	 */
	@Override
	public CannabisSupplementalInformation[] findByUuid_PrevAndNext(
			long cannabisSupplementalInfoId, String uuid,
			OrderByComparator<CannabisSupplementalInformation>
				orderByComparator)
		throws NoSuchCannabisSupplementalInformationException {

		uuid = Objects.toString(uuid, "");

		CannabisSupplementalInformation cannabisSupplementalInformation =
			findByPrimaryKey(cannabisSupplementalInfoId);

		Session session = null;

		try {
			session = openSession();

			CannabisSupplementalInformation[] array =
				new CannabisSupplementalInformationImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, cannabisSupplementalInformation, uuid,
				orderByComparator, true);

			array[1] = cannabisSupplementalInformation;

			array[2] = getByUuid_PrevAndNext(
				session, cannabisSupplementalInformation, uuid,
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

	protected CannabisSupplementalInformation getByUuid_PrevAndNext(
		Session session,
		CannabisSupplementalInformation cannabisSupplementalInformation,
		String uuid,
		OrderByComparator<CannabisSupplementalInformation> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISSUPPLEMENTALINFORMATION_WHERE);

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
			sb.append(CannabisSupplementalInformationModelImpl.ORDER_BY_JPQL);
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
						cannabisSupplementalInformation)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisSupplementalInformation> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis supplemental informations where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (CannabisSupplementalInformation cannabisSupplementalInformation :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(cannabisSupplementalInformation);
		}
	}

	/**
	 * Returns the number of cannabis supplemental informations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cannabis supplemental informations
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISSUPPLEMENTALINFORMATION_WHERE);

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
		"cannabisSupplementalInformation.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(cannabisSupplementalInformation.uuid IS NULL OR cannabisSupplementalInformation.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the cannabis supplemental information where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCannabisSupplementalInformationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis supplemental information
	 * @throws NoSuchCannabisSupplementalInformationException if a matching cannabis supplemental information could not be found
	 */
	@Override
	public CannabisSupplementalInformation findByUUID_G(
			String uuid, long groupId)
		throws NoSuchCannabisSupplementalInformationException {

		CannabisSupplementalInformation cannabisSupplementalInformation =
			fetchByUUID_G(uuid, groupId);

		if (cannabisSupplementalInformation == null) {
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

			throw new NoSuchCannabisSupplementalInformationException(
				sb.toString());
		}

		return cannabisSupplementalInformation;
	}

	/**
	 * Returns the cannabis supplemental information where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis supplemental information, or <code>null</code> if a matching cannabis supplemental information could not be found
	 */
	@Override
	public CannabisSupplementalInformation fetchByUUID_G(
		String uuid, long groupId) {

		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the cannabis supplemental information where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis supplemental information, or <code>null</code> if a matching cannabis supplemental information could not be found
	 */
	@Override
	public CannabisSupplementalInformation fetchByUUID_G(
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

		if (result instanceof CannabisSupplementalInformation) {
			CannabisSupplementalInformation cannabisSupplementalInformation =
				(CannabisSupplementalInformation)result;

			if (!Objects.equals(
					uuid, cannabisSupplementalInformation.getUuid()) ||
				(groupId != cannabisSupplementalInformation.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_CANNABISSUPPLEMENTALINFORMATION_WHERE);

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

				List<CannabisSupplementalInformation> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					CannabisSupplementalInformation
						cannabisSupplementalInformation = list.get(0);

					result = cannabisSupplementalInformation;

					cacheResult(cannabisSupplementalInformation);
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
			return (CannabisSupplementalInformation)result;
		}
	}

	/**
	 * Removes the cannabis supplemental information where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the cannabis supplemental information that was removed
	 */
	@Override
	public CannabisSupplementalInformation removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchCannabisSupplementalInformationException {

		CannabisSupplementalInformation cannabisSupplementalInformation =
			findByUUID_G(uuid, groupId);

		return remove(cannabisSupplementalInformation);
	}

	/**
	 * Returns the number of cannabis supplemental informations where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cannabis supplemental informations
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISSUPPLEMENTALINFORMATION_WHERE);

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
		"cannabisSupplementalInformation.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(cannabisSupplementalInformation.uuid IS NULL OR cannabisSupplementalInformation.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"cannabisSupplementalInformation.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the cannabis supplemental informations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cannabis supplemental informations
	 */
	@Override
	public List<CannabisSupplementalInformation> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis supplemental informations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @return the range of matching cannabis supplemental informations
	 */
	@Override
	public List<CannabisSupplementalInformation> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis supplemental informations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis supplemental informations
	 */
	@Override
	public List<CannabisSupplementalInformation> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisSupplementalInformation> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis supplemental informations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis supplemental informations
	 */
	@Override
	public List<CannabisSupplementalInformation> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisSupplementalInformation> orderByComparator,
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

		List<CannabisSupplementalInformation> list = null;

		if (useFinderCache) {
			list = (List<CannabisSupplementalInformation>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisSupplementalInformation
						cannabisSupplementalInformation : list) {

					if (!uuid.equals(
							cannabisSupplementalInformation.getUuid()) ||
						(companyId !=
							cannabisSupplementalInformation.getCompanyId())) {

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

			sb.append(_SQL_SELECT_CANNABISSUPPLEMENTALINFORMATION_WHERE);

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
					CannabisSupplementalInformationModelImpl.ORDER_BY_JPQL);
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

				list = (List<CannabisSupplementalInformation>)QueryUtil.list(
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
	 * Returns the first cannabis supplemental information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis supplemental information
	 * @throws NoSuchCannabisSupplementalInformationException if a matching cannabis supplemental information could not be found
	 */
	@Override
	public CannabisSupplementalInformation findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CannabisSupplementalInformation>
				orderByComparator)
		throws NoSuchCannabisSupplementalInformationException {

		CannabisSupplementalInformation cannabisSupplementalInformation =
			fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (cannabisSupplementalInformation != null) {
			return cannabisSupplementalInformation;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchCannabisSupplementalInformationException(sb.toString());
	}

	/**
	 * Returns the first cannabis supplemental information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis supplemental information, or <code>null</code> if a matching cannabis supplemental information could not be found
	 */
	@Override
	public CannabisSupplementalInformation fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CannabisSupplementalInformation> orderByComparator) {

		List<CannabisSupplementalInformation> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis supplemental information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis supplemental information
	 * @throws NoSuchCannabisSupplementalInformationException if a matching cannabis supplemental information could not be found
	 */
	@Override
	public CannabisSupplementalInformation findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CannabisSupplementalInformation>
				orderByComparator)
		throws NoSuchCannabisSupplementalInformationException {

		CannabisSupplementalInformation cannabisSupplementalInformation =
			fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (cannabisSupplementalInformation != null) {
			return cannabisSupplementalInformation;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchCannabisSupplementalInformationException(sb.toString());
	}

	/**
	 * Returns the last cannabis supplemental information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis supplemental information, or <code>null</code> if a matching cannabis supplemental information could not be found
	 */
	@Override
	public CannabisSupplementalInformation fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CannabisSupplementalInformation> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<CannabisSupplementalInformation> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis supplemental informations before and after the current cannabis supplemental information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param cannabisSupplementalInfoId the primary key of the current cannabis supplemental information
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis supplemental information
	 * @throws NoSuchCannabisSupplementalInformationException if a cannabis supplemental information with the primary key could not be found
	 */
	@Override
	public CannabisSupplementalInformation[] findByUuid_C_PrevAndNext(
			long cannabisSupplementalInfoId, String uuid, long companyId,
			OrderByComparator<CannabisSupplementalInformation>
				orderByComparator)
		throws NoSuchCannabisSupplementalInformationException {

		uuid = Objects.toString(uuid, "");

		CannabisSupplementalInformation cannabisSupplementalInformation =
			findByPrimaryKey(cannabisSupplementalInfoId);

		Session session = null;

		try {
			session = openSession();

			CannabisSupplementalInformation[] array =
				new CannabisSupplementalInformationImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, cannabisSupplementalInformation, uuid, companyId,
				orderByComparator, true);

			array[1] = cannabisSupplementalInformation;

			array[2] = getByUuid_C_PrevAndNext(
				session, cannabisSupplementalInformation, uuid, companyId,
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

	protected CannabisSupplementalInformation getByUuid_C_PrevAndNext(
		Session session,
		CannabisSupplementalInformation cannabisSupplementalInformation,
		String uuid, long companyId,
		OrderByComparator<CannabisSupplementalInformation> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISSUPPLEMENTALINFORMATION_WHERE);

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
			sb.append(CannabisSupplementalInformationModelImpl.ORDER_BY_JPQL);
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
						cannabisSupplementalInformation)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisSupplementalInformation> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis supplemental informations where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (CannabisSupplementalInformation cannabisSupplementalInformation :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(cannabisSupplementalInformation);
		}
	}

	/**
	 * Returns the number of cannabis supplemental informations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cannabis supplemental informations
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISSUPPLEMENTALINFORMATION_WHERE);

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
		"cannabisSupplementalInformation.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(cannabisSupplementalInformation.uuid IS NULL OR cannabisSupplementalInformation.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"cannabisSupplementalInformation.companyId = ?";

	private FinderPath _finderPathWithPaginationFindBygetCA_SI_CAI;
	private FinderPath _finderPathWithoutPaginationFindBygetCA_SI_CAI;
	private FinderPath _finderPathCountBygetCA_SI_CAI;

	/**
	 * Returns all the cannabis supplemental informations where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis supplemental informations
	 */
	@Override
	public List<CannabisSupplementalInformation> findBygetCA_SI_CAI(
		long cannabisApplicationId) {

		return findBygetCA_SI_CAI(
			cannabisApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis supplemental informations where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @return the range of matching cannabis supplemental informations
	 */
	@Override
	public List<CannabisSupplementalInformation> findBygetCA_SI_CAI(
		long cannabisApplicationId, int start, int end) {

		return findBygetCA_SI_CAI(cannabisApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis supplemental informations where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis supplemental informations
	 */
	@Override
	public List<CannabisSupplementalInformation> findBygetCA_SI_CAI(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisSupplementalInformation> orderByComparator) {

		return findBygetCA_SI_CAI(
			cannabisApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis supplemental informations where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis supplemental informations
	 */
	@Override
	public List<CannabisSupplementalInformation> findBygetCA_SI_CAI(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisSupplementalInformation> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetCA_SI_CAI;
				finderArgs = new Object[] {cannabisApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCA_SI_CAI;
			finderArgs = new Object[] {
				cannabisApplicationId, start, end, orderByComparator
			};
		}

		List<CannabisSupplementalInformation> list = null;

		if (useFinderCache) {
			list = (List<CannabisSupplementalInformation>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisSupplementalInformation
						cannabisSupplementalInformation : list) {

					if (cannabisApplicationId !=
							cannabisSupplementalInformation.
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

			sb.append(_SQL_SELECT_CANNABISSUPPLEMENTALINFORMATION_WHERE);

			sb.append(_FINDER_COLUMN_GETCA_SI_CAI_CANNABISAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					CannabisSupplementalInformationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(cannabisApplicationId);

				list = (List<CannabisSupplementalInformation>)QueryUtil.list(
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
	 * Returns the first cannabis supplemental information in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis supplemental information
	 * @throws NoSuchCannabisSupplementalInformationException if a matching cannabis supplemental information could not be found
	 */
	@Override
	public CannabisSupplementalInformation findBygetCA_SI_CAI_First(
			long cannabisApplicationId,
			OrderByComparator<CannabisSupplementalInformation>
				orderByComparator)
		throws NoSuchCannabisSupplementalInformationException {

		CannabisSupplementalInformation cannabisSupplementalInformation =
			fetchBygetCA_SI_CAI_First(cannabisApplicationId, orderByComparator);

		if (cannabisSupplementalInformation != null) {
			return cannabisSupplementalInformation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("cannabisApplicationId=");
		sb.append(cannabisApplicationId);

		sb.append("}");

		throw new NoSuchCannabisSupplementalInformationException(sb.toString());
	}

	/**
	 * Returns the first cannabis supplemental information in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis supplemental information, or <code>null</code> if a matching cannabis supplemental information could not be found
	 */
	@Override
	public CannabisSupplementalInformation fetchBygetCA_SI_CAI_First(
		long cannabisApplicationId,
		OrderByComparator<CannabisSupplementalInformation> orderByComparator) {

		List<CannabisSupplementalInformation> list = findBygetCA_SI_CAI(
			cannabisApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis supplemental information in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis supplemental information
	 * @throws NoSuchCannabisSupplementalInformationException if a matching cannabis supplemental information could not be found
	 */
	@Override
	public CannabisSupplementalInformation findBygetCA_SI_CAI_Last(
			long cannabisApplicationId,
			OrderByComparator<CannabisSupplementalInformation>
				orderByComparator)
		throws NoSuchCannabisSupplementalInformationException {

		CannabisSupplementalInformation cannabisSupplementalInformation =
			fetchBygetCA_SI_CAI_Last(cannabisApplicationId, orderByComparator);

		if (cannabisSupplementalInformation != null) {
			return cannabisSupplementalInformation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("cannabisApplicationId=");
		sb.append(cannabisApplicationId);

		sb.append("}");

		throw new NoSuchCannabisSupplementalInformationException(sb.toString());
	}

	/**
	 * Returns the last cannabis supplemental information in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis supplemental information, or <code>null</code> if a matching cannabis supplemental information could not be found
	 */
	@Override
	public CannabisSupplementalInformation fetchBygetCA_SI_CAI_Last(
		long cannabisApplicationId,
		OrderByComparator<CannabisSupplementalInformation> orderByComparator) {

		int count = countBygetCA_SI_CAI(cannabisApplicationId);

		if (count == 0) {
			return null;
		}

		List<CannabisSupplementalInformation> list = findBygetCA_SI_CAI(
			cannabisApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis supplemental informations before and after the current cannabis supplemental information in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisSupplementalInfoId the primary key of the current cannabis supplemental information
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis supplemental information
	 * @throws NoSuchCannabisSupplementalInformationException if a cannabis supplemental information with the primary key could not be found
	 */
	@Override
	public CannabisSupplementalInformation[] findBygetCA_SI_CAI_PrevAndNext(
			long cannabisSupplementalInfoId, long cannabisApplicationId,
			OrderByComparator<CannabisSupplementalInformation>
				orderByComparator)
		throws NoSuchCannabisSupplementalInformationException {

		CannabisSupplementalInformation cannabisSupplementalInformation =
			findByPrimaryKey(cannabisSupplementalInfoId);

		Session session = null;

		try {
			session = openSession();

			CannabisSupplementalInformation[] array =
				new CannabisSupplementalInformationImpl[3];

			array[0] = getBygetCA_SI_CAI_PrevAndNext(
				session, cannabisSupplementalInformation, cannabisApplicationId,
				orderByComparator, true);

			array[1] = cannabisSupplementalInformation;

			array[2] = getBygetCA_SI_CAI_PrevAndNext(
				session, cannabisSupplementalInformation, cannabisApplicationId,
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

	protected CannabisSupplementalInformation getBygetCA_SI_CAI_PrevAndNext(
		Session session,
		CannabisSupplementalInformation cannabisSupplementalInformation,
		long cannabisApplicationId,
		OrderByComparator<CannabisSupplementalInformation> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISSUPPLEMENTALINFORMATION_WHERE);

		sb.append(_FINDER_COLUMN_GETCA_SI_CAI_CANNABISAPPLICATIONID_2);

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
			sb.append(CannabisSupplementalInformationModelImpl.ORDER_BY_JPQL);
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
						cannabisSupplementalInformation)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisSupplementalInformation> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis supplemental informations where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	@Override
	public void removeBygetCA_SI_CAI(long cannabisApplicationId) {
		for (CannabisSupplementalInformation cannabisSupplementalInformation :
				findBygetCA_SI_CAI(
					cannabisApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(cannabisSupplementalInformation);
		}
	}

	/**
	 * Returns the number of cannabis supplemental informations where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis supplemental informations
	 */
	@Override
	public int countBygetCA_SI_CAI(long cannabisApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCA_SI_CAI;

		Object[] finderArgs = new Object[] {cannabisApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISSUPPLEMENTALINFORMATION_WHERE);

			sb.append(_FINDER_COLUMN_GETCA_SI_CAI_CANNABISAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETCA_SI_CAI_CANNABISAPPLICATIONID_2 =
			"cannabisSupplementalInformation.cannabisApplicationId = ?";

	public CannabisSupplementalInformationPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(CannabisSupplementalInformation.class);

		setModelImplClass(CannabisSupplementalInformationImpl.class);
		setModelPKClass(long.class);

		setTable(CannabisSupplementalInformationTable.INSTANCE);
	}

	/**
	 * Caches the cannabis supplemental information in the entity cache if it is enabled.
	 *
	 * @param cannabisSupplementalInformation the cannabis supplemental information
	 */
	@Override
	public void cacheResult(
		CannabisSupplementalInformation cannabisSupplementalInformation) {

		entityCache.putResult(
			CannabisSupplementalInformationImpl.class,
			cannabisSupplementalInformation.getPrimaryKey(),
			cannabisSupplementalInformation);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				cannabisSupplementalInformation.getUuid(),
				cannabisSupplementalInformation.getGroupId()
			},
			cannabisSupplementalInformation);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the cannabis supplemental informations in the entity cache if it is enabled.
	 *
	 * @param cannabisSupplementalInformations the cannabis supplemental informations
	 */
	@Override
	public void cacheResult(
		List<CannabisSupplementalInformation>
			cannabisSupplementalInformations) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (cannabisSupplementalInformations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CannabisSupplementalInformation cannabisSupplementalInformation :
				cannabisSupplementalInformations) {

			if (entityCache.getResult(
					CannabisSupplementalInformationImpl.class,
					cannabisSupplementalInformation.getPrimaryKey()) == null) {

				cacheResult(cannabisSupplementalInformation);
			}
		}
	}

	/**
	 * Clears the cache for all cannabis supplemental informations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CannabisSupplementalInformationImpl.class);

		finderCache.clearCache(CannabisSupplementalInformationImpl.class);
	}

	/**
	 * Clears the cache for the cannabis supplemental information.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CannabisSupplementalInformation cannabisSupplementalInformation) {

		entityCache.removeResult(
			CannabisSupplementalInformationImpl.class,
			cannabisSupplementalInformation);
	}

	@Override
	public void clearCache(
		List<CannabisSupplementalInformation>
			cannabisSupplementalInformations) {

		for (CannabisSupplementalInformation cannabisSupplementalInformation :
				cannabisSupplementalInformations) {

			entityCache.removeResult(
				CannabisSupplementalInformationImpl.class,
				cannabisSupplementalInformation);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CannabisSupplementalInformationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CannabisSupplementalInformationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CannabisSupplementalInformationModelImpl
			cannabisSupplementalInformationModelImpl) {

		Object[] args = new Object[] {
			cannabisSupplementalInformationModelImpl.getUuid(),
			cannabisSupplementalInformationModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args,
			cannabisSupplementalInformationModelImpl);
	}

	/**
	 * Creates a new cannabis supplemental information with the primary key. Does not add the cannabis supplemental information to the database.
	 *
	 * @param cannabisSupplementalInfoId the primary key for the new cannabis supplemental information
	 * @return the new cannabis supplemental information
	 */
	@Override
	public CannabisSupplementalInformation create(
		long cannabisSupplementalInfoId) {

		CannabisSupplementalInformation cannabisSupplementalInformation =
			new CannabisSupplementalInformationImpl();

		cannabisSupplementalInformation.setNew(true);
		cannabisSupplementalInformation.setPrimaryKey(
			cannabisSupplementalInfoId);

		String uuid = PortalUUIDUtil.generate();

		cannabisSupplementalInformation.setUuid(uuid);

		cannabisSupplementalInformation.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return cannabisSupplementalInformation;
	}

	/**
	 * Removes the cannabis supplemental information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisSupplementalInfoId the primary key of the cannabis supplemental information
	 * @return the cannabis supplemental information that was removed
	 * @throws NoSuchCannabisSupplementalInformationException if a cannabis supplemental information with the primary key could not be found
	 */
	@Override
	public CannabisSupplementalInformation remove(
			long cannabisSupplementalInfoId)
		throws NoSuchCannabisSupplementalInformationException {

		return remove((Serializable)cannabisSupplementalInfoId);
	}

	/**
	 * Removes the cannabis supplemental information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cannabis supplemental information
	 * @return the cannabis supplemental information that was removed
	 * @throws NoSuchCannabisSupplementalInformationException if a cannabis supplemental information with the primary key could not be found
	 */
	@Override
	public CannabisSupplementalInformation remove(Serializable primaryKey)
		throws NoSuchCannabisSupplementalInformationException {

		Session session = null;

		try {
			session = openSession();

			CannabisSupplementalInformation cannabisSupplementalInformation =
				(CannabisSupplementalInformation)session.get(
					CannabisSupplementalInformationImpl.class, primaryKey);

			if (cannabisSupplementalInformation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCannabisSupplementalInformationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(cannabisSupplementalInformation);
		}
		catch (NoSuchCannabisSupplementalInformationException
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
	protected CannabisSupplementalInformation removeImpl(
		CannabisSupplementalInformation cannabisSupplementalInformation) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cannabisSupplementalInformation)) {
				cannabisSupplementalInformation =
					(CannabisSupplementalInformation)session.get(
						CannabisSupplementalInformationImpl.class,
						cannabisSupplementalInformation.getPrimaryKeyObj());
			}

			if (cannabisSupplementalInformation != null) {
				session.delete(cannabisSupplementalInformation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (cannabisSupplementalInformation != null) {
			clearCache(cannabisSupplementalInformation);
		}

		return cannabisSupplementalInformation;
	}

	@Override
	public CannabisSupplementalInformation updateImpl(
		CannabisSupplementalInformation cannabisSupplementalInformation) {

		boolean isNew = cannabisSupplementalInformation.isNew();

		if (!(cannabisSupplementalInformation instanceof
				CannabisSupplementalInformationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					cannabisSupplementalInformation.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					cannabisSupplementalInformation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cannabisSupplementalInformation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CannabisSupplementalInformation implementation " +
					cannabisSupplementalInformation.getClass());
		}

		CannabisSupplementalInformationModelImpl
			cannabisSupplementalInformationModelImpl =
				(CannabisSupplementalInformationModelImpl)
					cannabisSupplementalInformation;

		if (Validator.isNull(cannabisSupplementalInformation.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			cannabisSupplementalInformation.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(cannabisSupplementalInformation.getCreateDate() == null)) {

			if (serviceContext == null) {
				cannabisSupplementalInformation.setCreateDate(date);
			}
			else {
				cannabisSupplementalInformation.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!cannabisSupplementalInformationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				cannabisSupplementalInformation.setModifiedDate(date);
			}
			else {
				cannabisSupplementalInformation.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(cannabisSupplementalInformation);
			}
			else {
				cannabisSupplementalInformation =
					(CannabisSupplementalInformation)session.merge(
						cannabisSupplementalInformation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CannabisSupplementalInformationImpl.class,
			cannabisSupplementalInformationModelImpl, false, true);

		cacheUniqueFindersCache(cannabisSupplementalInformationModelImpl);

		if (isNew) {
			cannabisSupplementalInformation.setNew(false);
		}

		cannabisSupplementalInformation.resetOriginalValues();

		return cannabisSupplementalInformation;
	}

	/**
	 * Returns the cannabis supplemental information with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cannabis supplemental information
	 * @return the cannabis supplemental information
	 * @throws NoSuchCannabisSupplementalInformationException if a cannabis supplemental information with the primary key could not be found
	 */
	@Override
	public CannabisSupplementalInformation findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchCannabisSupplementalInformationException {

		CannabisSupplementalInformation cannabisSupplementalInformation =
			fetchByPrimaryKey(primaryKey);

		if (cannabisSupplementalInformation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCannabisSupplementalInformationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return cannabisSupplementalInformation;
	}

	/**
	 * Returns the cannabis supplemental information with the primary key or throws a <code>NoSuchCannabisSupplementalInformationException</code> if it could not be found.
	 *
	 * @param cannabisSupplementalInfoId the primary key of the cannabis supplemental information
	 * @return the cannabis supplemental information
	 * @throws NoSuchCannabisSupplementalInformationException if a cannabis supplemental information with the primary key could not be found
	 */
	@Override
	public CannabisSupplementalInformation findByPrimaryKey(
			long cannabisSupplementalInfoId)
		throws NoSuchCannabisSupplementalInformationException {

		return findByPrimaryKey((Serializable)cannabisSupplementalInfoId);
	}

	/**
	 * Returns the cannabis supplemental information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisSupplementalInfoId the primary key of the cannabis supplemental information
	 * @return the cannabis supplemental information, or <code>null</code> if a cannabis supplemental information with the primary key could not be found
	 */
	@Override
	public CannabisSupplementalInformation fetchByPrimaryKey(
		long cannabisSupplementalInfoId) {

		return fetchByPrimaryKey((Serializable)cannabisSupplementalInfoId);
	}

	/**
	 * Returns all the cannabis supplemental informations.
	 *
	 * @return the cannabis supplemental informations
	 */
	@Override
	public List<CannabisSupplementalInformation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis supplemental informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @return the range of cannabis supplemental informations
	 */
	@Override
	public List<CannabisSupplementalInformation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis supplemental informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis supplemental informations
	 */
	@Override
	public List<CannabisSupplementalInformation> findAll(
		int start, int end,
		OrderByComparator<CannabisSupplementalInformation> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis supplemental informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis supplemental informations
	 */
	@Override
	public List<CannabisSupplementalInformation> findAll(
		int start, int end,
		OrderByComparator<CannabisSupplementalInformation> orderByComparator,
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

		List<CannabisSupplementalInformation> list = null;

		if (useFinderCache) {
			list = (List<CannabisSupplementalInformation>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CANNABISSUPPLEMENTALINFORMATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CANNABISSUPPLEMENTALINFORMATION;

				sql = sql.concat(
					CannabisSupplementalInformationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CannabisSupplementalInformation>)QueryUtil.list(
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
	 * Removes all the cannabis supplemental informations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CannabisSupplementalInformation cannabisSupplementalInformation :
				findAll()) {

			remove(cannabisSupplementalInformation);
		}
	}

	/**
	 * Returns the number of cannabis supplemental informations.
	 *
	 * @return the number of cannabis supplemental informations
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
					_SQL_COUNT_CANNABISSUPPLEMENTALINFORMATION);

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
		return "cannabisSupplementalInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CANNABISSUPPLEMENTALINFORMATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CannabisSupplementalInformationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cannabis supplemental information persistence.
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

		_finderPathWithPaginationFindBygetCA_SI_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCA_SI_CAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"cannabisApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetCA_SI_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetCA_SI_CAI",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, true);

		_finderPathCountBygetCA_SI_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCA_SI_CAI",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, false);

		CannabisSupplementalInformationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CannabisSupplementalInformationUtil.setPersistence(null);

		entityCache.removeCache(
			CannabisSupplementalInformationImpl.class.getName());
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

	private static final String _SQL_SELECT_CANNABISSUPPLEMENTALINFORMATION =
		"SELECT cannabisSupplementalInformation FROM CannabisSupplementalInformation cannabisSupplementalInformation";

	private static final String
		_SQL_SELECT_CANNABISSUPPLEMENTALINFORMATION_WHERE =
			"SELECT cannabisSupplementalInformation FROM CannabisSupplementalInformation cannabisSupplementalInformation WHERE ";

	private static final String _SQL_COUNT_CANNABISSUPPLEMENTALINFORMATION =
		"SELECT COUNT(cannabisSupplementalInformation) FROM CannabisSupplementalInformation cannabisSupplementalInformation";

	private static final String
		_SQL_COUNT_CANNABISSUPPLEMENTALINFORMATION_WHERE =
			"SELECT COUNT(cannabisSupplementalInformation) FROM CannabisSupplementalInformation cannabisSupplementalInformation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"cannabisSupplementalInformation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CannabisSupplementalInformation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CannabisSupplementalInformation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CannabisSupplementalInformationPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}