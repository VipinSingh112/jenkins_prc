/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service.persistence.impl;

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

import com.nbp.osi.application.form.services.exception.NoSuchDetailOfApplicantException;
import com.nbp.osi.application.form.services.model.DetailOfApplicant;
import com.nbp.osi.application.form.services.model.DetailOfApplicantTable;
import com.nbp.osi.application.form.services.model.impl.DetailOfApplicantImpl;
import com.nbp.osi.application.form.services.model.impl.DetailOfApplicantModelImpl;
import com.nbp.osi.application.form.services.service.persistence.DetailOfApplicantPersistence;
import com.nbp.osi.application.form.services.service.persistence.DetailOfApplicantUtil;
import com.nbp.osi.application.form.services.service.persistence.impl.constants.OSIPersistenceConstants;

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
 * The persistence implementation for the detail of applicant service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = DetailOfApplicantPersistence.class)
public class DetailOfApplicantPersistenceImpl
	extends BasePersistenceImpl<DetailOfApplicant>
	implements DetailOfApplicantPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>DetailOfApplicantUtil</code> to access the detail of applicant persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		DetailOfApplicantImpl.class.getName();

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
	 * Returns all the detail of applicants where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching detail of applicants
	 */
	@Override
	public List<DetailOfApplicant> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the detail of applicants where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of detail of applicants
	 * @param end the upper bound of the range of detail of applicants (not inclusive)
	 * @return the range of matching detail of applicants
	 */
	@Override
	public List<DetailOfApplicant> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the detail of applicants where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of detail of applicants
	 * @param end the upper bound of the range of detail of applicants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching detail of applicants
	 */
	@Override
	public List<DetailOfApplicant> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DetailOfApplicant> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the detail of applicants where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of detail of applicants
	 * @param end the upper bound of the range of detail of applicants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching detail of applicants
	 */
	@Override
	public List<DetailOfApplicant> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DetailOfApplicant> orderByComparator,
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

		List<DetailOfApplicant> list = null;

		if (useFinderCache) {
			list = (List<DetailOfApplicant>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DetailOfApplicant detailOfApplicant : list) {
					if (!uuid.equals(detailOfApplicant.getUuid())) {
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

			sb.append(_SQL_SELECT_DETAILOFAPPLICANT_WHERE);

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
				sb.append(DetailOfApplicantModelImpl.ORDER_BY_JPQL);
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

				list = (List<DetailOfApplicant>)QueryUtil.list(
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
	 * Returns the first detail of applicant in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching detail of applicant
	 * @throws NoSuchDetailOfApplicantException if a matching detail of applicant could not be found
	 */
	@Override
	public DetailOfApplicant findByUuid_First(
			String uuid, OrderByComparator<DetailOfApplicant> orderByComparator)
		throws NoSuchDetailOfApplicantException {

		DetailOfApplicant detailOfApplicant = fetchByUuid_First(
			uuid, orderByComparator);

		if (detailOfApplicant != null) {
			return detailOfApplicant;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchDetailOfApplicantException(sb.toString());
	}

	/**
	 * Returns the first detail of applicant in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching detail of applicant, or <code>null</code> if a matching detail of applicant could not be found
	 */
	@Override
	public DetailOfApplicant fetchByUuid_First(
		String uuid, OrderByComparator<DetailOfApplicant> orderByComparator) {

		List<DetailOfApplicant> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last detail of applicant in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching detail of applicant
	 * @throws NoSuchDetailOfApplicantException if a matching detail of applicant could not be found
	 */
	@Override
	public DetailOfApplicant findByUuid_Last(
			String uuid, OrderByComparator<DetailOfApplicant> orderByComparator)
		throws NoSuchDetailOfApplicantException {

		DetailOfApplicant detailOfApplicant = fetchByUuid_Last(
			uuid, orderByComparator);

		if (detailOfApplicant != null) {
			return detailOfApplicant;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchDetailOfApplicantException(sb.toString());
	}

	/**
	 * Returns the last detail of applicant in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching detail of applicant, or <code>null</code> if a matching detail of applicant could not be found
	 */
	@Override
	public DetailOfApplicant fetchByUuid_Last(
		String uuid, OrderByComparator<DetailOfApplicant> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<DetailOfApplicant> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the detail of applicants before and after the current detail of applicant in the ordered set where uuid = &#63;.
	 *
	 * @param detailOfApplicantId the primary key of the current detail of applicant
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next detail of applicant
	 * @throws NoSuchDetailOfApplicantException if a detail of applicant with the primary key could not be found
	 */
	@Override
	public DetailOfApplicant[] findByUuid_PrevAndNext(
			long detailOfApplicantId, String uuid,
			OrderByComparator<DetailOfApplicant> orderByComparator)
		throws NoSuchDetailOfApplicantException {

		uuid = Objects.toString(uuid, "");

		DetailOfApplicant detailOfApplicant = findByPrimaryKey(
			detailOfApplicantId);

		Session session = null;

		try {
			session = openSession();

			DetailOfApplicant[] array = new DetailOfApplicantImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, detailOfApplicant, uuid, orderByComparator, true);

			array[1] = detailOfApplicant;

			array[2] = getByUuid_PrevAndNext(
				session, detailOfApplicant, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected DetailOfApplicant getByUuid_PrevAndNext(
		Session session, DetailOfApplicant detailOfApplicant, String uuid,
		OrderByComparator<DetailOfApplicant> orderByComparator,
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

		sb.append(_SQL_SELECT_DETAILOFAPPLICANT_WHERE);

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
			sb.append(DetailOfApplicantModelImpl.ORDER_BY_JPQL);
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
						detailOfApplicant)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<DetailOfApplicant> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the detail of applicants where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (DetailOfApplicant detailOfApplicant :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(detailOfApplicant);
		}
	}

	/**
	 * Returns the number of detail of applicants where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching detail of applicants
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_DETAILOFAPPLICANT_WHERE);

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
		"detailOfApplicant.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(detailOfApplicant.uuid IS NULL OR detailOfApplicant.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the detail of applicant where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchDetailOfApplicantException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching detail of applicant
	 * @throws NoSuchDetailOfApplicantException if a matching detail of applicant could not be found
	 */
	@Override
	public DetailOfApplicant findByUUID_G(String uuid, long groupId)
		throws NoSuchDetailOfApplicantException {

		DetailOfApplicant detailOfApplicant = fetchByUUID_G(uuid, groupId);

		if (detailOfApplicant == null) {
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

			throw new NoSuchDetailOfApplicantException(sb.toString());
		}

		return detailOfApplicant;
	}

	/**
	 * Returns the detail of applicant where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching detail of applicant, or <code>null</code> if a matching detail of applicant could not be found
	 */
	@Override
	public DetailOfApplicant fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the detail of applicant where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching detail of applicant, or <code>null</code> if a matching detail of applicant could not be found
	 */
	@Override
	public DetailOfApplicant fetchByUUID_G(
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

		if (result instanceof DetailOfApplicant) {
			DetailOfApplicant detailOfApplicant = (DetailOfApplicant)result;

			if (!Objects.equals(uuid, detailOfApplicant.getUuid()) ||
				(groupId != detailOfApplicant.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_DETAILOFAPPLICANT_WHERE);

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

				List<DetailOfApplicant> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					DetailOfApplicant detailOfApplicant = list.get(0);

					result = detailOfApplicant;

					cacheResult(detailOfApplicant);
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
			return (DetailOfApplicant)result;
		}
	}

	/**
	 * Removes the detail of applicant where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the detail of applicant that was removed
	 */
	@Override
	public DetailOfApplicant removeByUUID_G(String uuid, long groupId)
		throws NoSuchDetailOfApplicantException {

		DetailOfApplicant detailOfApplicant = findByUUID_G(uuid, groupId);

		return remove(detailOfApplicant);
	}

	/**
	 * Returns the number of detail of applicants where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching detail of applicants
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_DETAILOFAPPLICANT_WHERE);

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
		"detailOfApplicant.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(detailOfApplicant.uuid IS NULL OR detailOfApplicant.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"detailOfApplicant.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the detail of applicants where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching detail of applicants
	 */
	@Override
	public List<DetailOfApplicant> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the detail of applicants where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of detail of applicants
	 * @param end the upper bound of the range of detail of applicants (not inclusive)
	 * @return the range of matching detail of applicants
	 */
	@Override
	public List<DetailOfApplicant> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the detail of applicants where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of detail of applicants
	 * @param end the upper bound of the range of detail of applicants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching detail of applicants
	 */
	@Override
	public List<DetailOfApplicant> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<DetailOfApplicant> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the detail of applicants where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of detail of applicants
	 * @param end the upper bound of the range of detail of applicants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching detail of applicants
	 */
	@Override
	public List<DetailOfApplicant> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<DetailOfApplicant> orderByComparator,
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

		List<DetailOfApplicant> list = null;

		if (useFinderCache) {
			list = (List<DetailOfApplicant>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DetailOfApplicant detailOfApplicant : list) {
					if (!uuid.equals(detailOfApplicant.getUuid()) ||
						(companyId != detailOfApplicant.getCompanyId())) {

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

			sb.append(_SQL_SELECT_DETAILOFAPPLICANT_WHERE);

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
				sb.append(DetailOfApplicantModelImpl.ORDER_BY_JPQL);
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

				list = (List<DetailOfApplicant>)QueryUtil.list(
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
	 * Returns the first detail of applicant in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching detail of applicant
	 * @throws NoSuchDetailOfApplicantException if a matching detail of applicant could not be found
	 */
	@Override
	public DetailOfApplicant findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<DetailOfApplicant> orderByComparator)
		throws NoSuchDetailOfApplicantException {

		DetailOfApplicant detailOfApplicant = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (detailOfApplicant != null) {
			return detailOfApplicant;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchDetailOfApplicantException(sb.toString());
	}

	/**
	 * Returns the first detail of applicant in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching detail of applicant, or <code>null</code> if a matching detail of applicant could not be found
	 */
	@Override
	public DetailOfApplicant fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<DetailOfApplicant> orderByComparator) {

		List<DetailOfApplicant> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last detail of applicant in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching detail of applicant
	 * @throws NoSuchDetailOfApplicantException if a matching detail of applicant could not be found
	 */
	@Override
	public DetailOfApplicant findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<DetailOfApplicant> orderByComparator)
		throws NoSuchDetailOfApplicantException {

		DetailOfApplicant detailOfApplicant = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (detailOfApplicant != null) {
			return detailOfApplicant;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchDetailOfApplicantException(sb.toString());
	}

	/**
	 * Returns the last detail of applicant in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching detail of applicant, or <code>null</code> if a matching detail of applicant could not be found
	 */
	@Override
	public DetailOfApplicant fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<DetailOfApplicant> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<DetailOfApplicant> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the detail of applicants before and after the current detail of applicant in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param detailOfApplicantId the primary key of the current detail of applicant
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next detail of applicant
	 * @throws NoSuchDetailOfApplicantException if a detail of applicant with the primary key could not be found
	 */
	@Override
	public DetailOfApplicant[] findByUuid_C_PrevAndNext(
			long detailOfApplicantId, String uuid, long companyId,
			OrderByComparator<DetailOfApplicant> orderByComparator)
		throws NoSuchDetailOfApplicantException {

		uuid = Objects.toString(uuid, "");

		DetailOfApplicant detailOfApplicant = findByPrimaryKey(
			detailOfApplicantId);

		Session session = null;

		try {
			session = openSession();

			DetailOfApplicant[] array = new DetailOfApplicantImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, detailOfApplicant, uuid, companyId, orderByComparator,
				true);

			array[1] = detailOfApplicant;

			array[2] = getByUuid_C_PrevAndNext(
				session, detailOfApplicant, uuid, companyId, orderByComparator,
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

	protected DetailOfApplicant getByUuid_C_PrevAndNext(
		Session session, DetailOfApplicant detailOfApplicant, String uuid,
		long companyId, OrderByComparator<DetailOfApplicant> orderByComparator,
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

		sb.append(_SQL_SELECT_DETAILOFAPPLICANT_WHERE);

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
			sb.append(DetailOfApplicantModelImpl.ORDER_BY_JPQL);
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
						detailOfApplicant)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<DetailOfApplicant> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the detail of applicants where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (DetailOfApplicant detailOfApplicant :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(detailOfApplicant);
		}
	}

	/**
	 * Returns the number of detail of applicants where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching detail of applicants
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_DETAILOFAPPLICANT_WHERE);

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
		"detailOfApplicant.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(detailOfApplicant.uuid IS NULL OR detailOfApplicant.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"detailOfApplicant.companyId = ?";

	private FinderPath _finderPathFetchBygetOsiById;
	private FinderPath _finderPathCountBygetOsiById;

	/**
	 * Returns the detail of applicant where osiApplicationId = &#63; or throws a <code>NoSuchDetailOfApplicantException</code> if it could not be found.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching detail of applicant
	 * @throws NoSuchDetailOfApplicantException if a matching detail of applicant could not be found
	 */
	@Override
	public DetailOfApplicant findBygetOsiById(long osiApplicationId)
		throws NoSuchDetailOfApplicantException {

		DetailOfApplicant detailOfApplicant = fetchBygetOsiById(
			osiApplicationId);

		if (detailOfApplicant == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiApplicationId=");
			sb.append(osiApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchDetailOfApplicantException(sb.toString());
		}

		return detailOfApplicant;
	}

	/**
	 * Returns the detail of applicant where osiApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching detail of applicant, or <code>null</code> if a matching detail of applicant could not be found
	 */
	@Override
	public DetailOfApplicant fetchBygetOsiById(long osiApplicationId) {
		return fetchBygetOsiById(osiApplicationId, true);
	}

	/**
	 * Returns the detail of applicant where osiApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching detail of applicant, or <code>null</code> if a matching detail of applicant could not be found
	 */
	@Override
	public DetailOfApplicant fetchBygetOsiById(
		long osiApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {osiApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOsiById, finderArgs, this);
		}

		if (result instanceof DetailOfApplicant) {
			DetailOfApplicant detailOfApplicant = (DetailOfApplicant)result;

			if (osiApplicationId != detailOfApplicant.getOsiApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_DETAILOFAPPLICANT_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiApplicationId);

				List<DetailOfApplicant> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOsiById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {osiApplicationId};
							}

							_log.warn(
								"DetailOfApplicantPersistenceImpl.fetchBygetOsiById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					DetailOfApplicant detailOfApplicant = list.get(0);

					result = detailOfApplicant;

					cacheResult(detailOfApplicant);
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
			return (DetailOfApplicant)result;
		}
	}

	/**
	 * Removes the detail of applicant where osiApplicationId = &#63; from the database.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the detail of applicant that was removed
	 */
	@Override
	public DetailOfApplicant removeBygetOsiById(long osiApplicationId)
		throws NoSuchDetailOfApplicantException {

		DetailOfApplicant detailOfApplicant = findBygetOsiById(
			osiApplicationId);

		return remove(detailOfApplicant);
	}

	/**
	 * Returns the number of detail of applicants where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the number of matching detail of applicants
	 */
	@Override
	public int countBygetOsiById(long osiApplicationId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_DETAILOFAPPLICANT_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiApplicationId);

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

	private static final String _FINDER_COLUMN_GETOSIBYID_OSIAPPLICATIONID_2 =
		"detailOfApplicant.osiApplicationId = ?";

	public DetailOfApplicantPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(DetailOfApplicant.class);

		setModelImplClass(DetailOfApplicantImpl.class);
		setModelPKClass(long.class);

		setTable(DetailOfApplicantTable.INSTANCE);
	}

	/**
	 * Caches the detail of applicant in the entity cache if it is enabled.
	 *
	 * @param detailOfApplicant the detail of applicant
	 */
	@Override
	public void cacheResult(DetailOfApplicant detailOfApplicant) {
		entityCache.putResult(
			DetailOfApplicantImpl.class, detailOfApplicant.getPrimaryKey(),
			detailOfApplicant);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				detailOfApplicant.getUuid(), detailOfApplicant.getGroupId()
			},
			detailOfApplicant);

		finderCache.putResult(
			_finderPathFetchBygetOsiById,
			new Object[] {detailOfApplicant.getOsiApplicationId()},
			detailOfApplicant);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the detail of applicants in the entity cache if it is enabled.
	 *
	 * @param detailOfApplicants the detail of applicants
	 */
	@Override
	public void cacheResult(List<DetailOfApplicant> detailOfApplicants) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (detailOfApplicants.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (DetailOfApplicant detailOfApplicant : detailOfApplicants) {
			if (entityCache.getResult(
					DetailOfApplicantImpl.class,
					detailOfApplicant.getPrimaryKey()) == null) {

				cacheResult(detailOfApplicant);
			}
		}
	}

	/**
	 * Clears the cache for all detail of applicants.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DetailOfApplicantImpl.class);

		finderCache.clearCache(DetailOfApplicantImpl.class);
	}

	/**
	 * Clears the cache for the detail of applicant.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DetailOfApplicant detailOfApplicant) {
		entityCache.removeResult(
			DetailOfApplicantImpl.class, detailOfApplicant);
	}

	@Override
	public void clearCache(List<DetailOfApplicant> detailOfApplicants) {
		for (DetailOfApplicant detailOfApplicant : detailOfApplicants) {
			entityCache.removeResult(
				DetailOfApplicantImpl.class, detailOfApplicant);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(DetailOfApplicantImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(DetailOfApplicantImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		DetailOfApplicantModelImpl detailOfApplicantModelImpl) {

		Object[] args = new Object[] {
			detailOfApplicantModelImpl.getUuid(),
			detailOfApplicantModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, detailOfApplicantModelImpl);

		args = new Object[] {detailOfApplicantModelImpl.getOsiApplicationId()};

		finderCache.putResult(
			_finderPathCountBygetOsiById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiById, args, detailOfApplicantModelImpl);
	}

	/**
	 * Creates a new detail of applicant with the primary key. Does not add the detail of applicant to the database.
	 *
	 * @param detailOfApplicantId the primary key for the new detail of applicant
	 * @return the new detail of applicant
	 */
	@Override
	public DetailOfApplicant create(long detailOfApplicantId) {
		DetailOfApplicant detailOfApplicant = new DetailOfApplicantImpl();

		detailOfApplicant.setNew(true);
		detailOfApplicant.setPrimaryKey(detailOfApplicantId);

		String uuid = PortalUUIDUtil.generate();

		detailOfApplicant.setUuid(uuid);

		detailOfApplicant.setCompanyId(CompanyThreadLocal.getCompanyId());

		return detailOfApplicant;
	}

	/**
	 * Removes the detail of applicant with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param detailOfApplicantId the primary key of the detail of applicant
	 * @return the detail of applicant that was removed
	 * @throws NoSuchDetailOfApplicantException if a detail of applicant with the primary key could not be found
	 */
	@Override
	public DetailOfApplicant remove(long detailOfApplicantId)
		throws NoSuchDetailOfApplicantException {

		return remove((Serializable)detailOfApplicantId);
	}

	/**
	 * Removes the detail of applicant with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the detail of applicant
	 * @return the detail of applicant that was removed
	 * @throws NoSuchDetailOfApplicantException if a detail of applicant with the primary key could not be found
	 */
	@Override
	public DetailOfApplicant remove(Serializable primaryKey)
		throws NoSuchDetailOfApplicantException {

		Session session = null;

		try {
			session = openSession();

			DetailOfApplicant detailOfApplicant =
				(DetailOfApplicant)session.get(
					DetailOfApplicantImpl.class, primaryKey);

			if (detailOfApplicant == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDetailOfApplicantException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(detailOfApplicant);
		}
		catch (NoSuchDetailOfApplicantException noSuchEntityException) {
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
	protected DetailOfApplicant removeImpl(
		DetailOfApplicant detailOfApplicant) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(detailOfApplicant)) {
				detailOfApplicant = (DetailOfApplicant)session.get(
					DetailOfApplicantImpl.class,
					detailOfApplicant.getPrimaryKeyObj());
			}

			if (detailOfApplicant != null) {
				session.delete(detailOfApplicant);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (detailOfApplicant != null) {
			clearCache(detailOfApplicant);
		}

		return detailOfApplicant;
	}

	@Override
	public DetailOfApplicant updateImpl(DetailOfApplicant detailOfApplicant) {
		boolean isNew = detailOfApplicant.isNew();

		if (!(detailOfApplicant instanceof DetailOfApplicantModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(detailOfApplicant.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					detailOfApplicant);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in detailOfApplicant proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom DetailOfApplicant implementation " +
					detailOfApplicant.getClass());
		}

		DetailOfApplicantModelImpl detailOfApplicantModelImpl =
			(DetailOfApplicantModelImpl)detailOfApplicant;

		if (Validator.isNull(detailOfApplicant.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			detailOfApplicant.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (detailOfApplicant.getCreateDate() == null)) {
			if (serviceContext == null) {
				detailOfApplicant.setCreateDate(date);
			}
			else {
				detailOfApplicant.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!detailOfApplicantModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				detailOfApplicant.setModifiedDate(date);
			}
			else {
				detailOfApplicant.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(detailOfApplicant);
			}
			else {
				detailOfApplicant = (DetailOfApplicant)session.merge(
					detailOfApplicant);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			DetailOfApplicantImpl.class, detailOfApplicantModelImpl, false,
			true);

		cacheUniqueFindersCache(detailOfApplicantModelImpl);

		if (isNew) {
			detailOfApplicant.setNew(false);
		}

		detailOfApplicant.resetOriginalValues();

		return detailOfApplicant;
	}

	/**
	 * Returns the detail of applicant with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the detail of applicant
	 * @return the detail of applicant
	 * @throws NoSuchDetailOfApplicantException if a detail of applicant with the primary key could not be found
	 */
	@Override
	public DetailOfApplicant findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDetailOfApplicantException {

		DetailOfApplicant detailOfApplicant = fetchByPrimaryKey(primaryKey);

		if (detailOfApplicant == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDetailOfApplicantException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return detailOfApplicant;
	}

	/**
	 * Returns the detail of applicant with the primary key or throws a <code>NoSuchDetailOfApplicantException</code> if it could not be found.
	 *
	 * @param detailOfApplicantId the primary key of the detail of applicant
	 * @return the detail of applicant
	 * @throws NoSuchDetailOfApplicantException if a detail of applicant with the primary key could not be found
	 */
	@Override
	public DetailOfApplicant findByPrimaryKey(long detailOfApplicantId)
		throws NoSuchDetailOfApplicantException {

		return findByPrimaryKey((Serializable)detailOfApplicantId);
	}

	/**
	 * Returns the detail of applicant with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param detailOfApplicantId the primary key of the detail of applicant
	 * @return the detail of applicant, or <code>null</code> if a detail of applicant with the primary key could not be found
	 */
	@Override
	public DetailOfApplicant fetchByPrimaryKey(long detailOfApplicantId) {
		return fetchByPrimaryKey((Serializable)detailOfApplicantId);
	}

	/**
	 * Returns all the detail of applicants.
	 *
	 * @return the detail of applicants
	 */
	@Override
	public List<DetailOfApplicant> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the detail of applicants.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of applicants
	 * @param end the upper bound of the range of detail of applicants (not inclusive)
	 * @return the range of detail of applicants
	 */
	@Override
	public List<DetailOfApplicant> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the detail of applicants.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of applicants
	 * @param end the upper bound of the range of detail of applicants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of detail of applicants
	 */
	@Override
	public List<DetailOfApplicant> findAll(
		int start, int end,
		OrderByComparator<DetailOfApplicant> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the detail of applicants.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of applicants
	 * @param end the upper bound of the range of detail of applicants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of detail of applicants
	 */
	@Override
	public List<DetailOfApplicant> findAll(
		int start, int end,
		OrderByComparator<DetailOfApplicant> orderByComparator,
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

		List<DetailOfApplicant> list = null;

		if (useFinderCache) {
			list = (List<DetailOfApplicant>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_DETAILOFAPPLICANT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_DETAILOFAPPLICANT;

				sql = sql.concat(DetailOfApplicantModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<DetailOfApplicant>)QueryUtil.list(
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
	 * Removes all the detail of applicants from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (DetailOfApplicant detailOfApplicant : findAll()) {
			remove(detailOfApplicant);
		}
	}

	/**
	 * Returns the number of detail of applicants.
	 *
	 * @return the number of detail of applicants
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_DETAILOFAPPLICANT);

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
		return "detailOfApplicantId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_DETAILOFAPPLICANT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return DetailOfApplicantModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the detail of applicant persistence.
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

		_finderPathFetchBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiApplicationId"}, true);

		_finderPathCountBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiApplicationId"}, false);

		DetailOfApplicantUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		DetailOfApplicantUtil.setPersistence(null);

		entityCache.removeCache(DetailOfApplicantImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSIPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSIPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSIPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_DETAILOFAPPLICANT =
		"SELECT detailOfApplicant FROM DetailOfApplicant detailOfApplicant";

	private static final String _SQL_SELECT_DETAILOFAPPLICANT_WHERE =
		"SELECT detailOfApplicant FROM DetailOfApplicant detailOfApplicant WHERE ";

	private static final String _SQL_COUNT_DETAILOFAPPLICANT =
		"SELECT COUNT(detailOfApplicant) FROM DetailOfApplicant detailOfApplicant";

	private static final String _SQL_COUNT_DETAILOFAPPLICANT_WHERE =
		"SELECT COUNT(detailOfApplicant) FROM DetailOfApplicant detailOfApplicant WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "detailOfApplicant.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No DetailOfApplicant exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No DetailOfApplicant exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		DetailOfApplicantPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}