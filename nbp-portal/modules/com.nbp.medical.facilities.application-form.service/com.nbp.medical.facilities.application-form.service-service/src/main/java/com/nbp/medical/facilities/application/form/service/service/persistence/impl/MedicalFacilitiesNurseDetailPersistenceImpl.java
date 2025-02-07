/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service.persistence.impl;

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

import com.nbp.medical.facilities.application.form.service.exception.NoSuchMedicalFacilitiesNurseDetailException;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesNurseDetail;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesNurseDetailTable;
import com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesNurseDetailImpl;
import com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesNurseDetailModelImpl;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesNurseDetailPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesNurseDetailUtil;
import com.nbp.medical.facilities.application.form.service.service.persistence.impl.constants.MEDICAL_FACILITIESPersistenceConstants;

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
 * The persistence implementation for the medical facilities nurse detail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MedicalFacilitiesNurseDetailPersistence.class)
public class MedicalFacilitiesNurseDetailPersistenceImpl
	extends BasePersistenceImpl<MedicalFacilitiesNurseDetail>
	implements MedicalFacilitiesNurseDetailPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MedicalFacilitiesNurseDetailUtil</code> to access the medical facilities nurse detail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MedicalFacilitiesNurseDetailImpl.class.getName();

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
	 * Returns all the medical facilities nurse details where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching medical facilities nurse details
	 */
	@Override
	public List<MedicalFacilitiesNurseDetail> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities nurse details where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @return the range of matching medical facilities nurse details
	 */
	@Override
	public List<MedicalFacilitiesNurseDetail> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities nurse details where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities nurse details
	 */
	@Override
	public List<MedicalFacilitiesNurseDetail> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities nurse details where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities nurse details
	 */
	@Override
	public List<MedicalFacilitiesNurseDetail> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator,
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

		List<MedicalFacilitiesNurseDetail> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesNurseDetail>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail :
						list) {

					if (!uuid.equals(medicalFacilitiesNurseDetail.getUuid())) {
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

			sb.append(_SQL_SELECT_MEDICALFACILITIESNURSEDETAIL_WHERE);

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
				sb.append(MedicalFacilitiesNurseDetailModelImpl.ORDER_BY_JPQL);
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

				list = (List<MedicalFacilitiesNurseDetail>)QueryUtil.list(
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
	 * Returns the first medical facilities nurse detail in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse detail
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a matching medical facilities nurse detail could not be found
	 */
	@Override
	public MedicalFacilitiesNurseDetail findByUuid_First(
			String uuid,
			OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator)
		throws NoSuchMedicalFacilitiesNurseDetailException {

		MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail =
			fetchByUuid_First(uuid, orderByComparator);

		if (medicalFacilitiesNurseDetail != null) {
			return medicalFacilitiesNurseDetail;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesNurseDetailException(sb.toString());
	}

	/**
	 * Returns the first medical facilities nurse detail in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse detail, or <code>null</code> if a matching medical facilities nurse detail could not be found
	 */
	@Override
	public MedicalFacilitiesNurseDetail fetchByUuid_First(
		String uuid,
		OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator) {

		List<MedicalFacilitiesNurseDetail> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical facilities nurse detail in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse detail
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a matching medical facilities nurse detail could not be found
	 */
	@Override
	public MedicalFacilitiesNurseDetail findByUuid_Last(
			String uuid,
			OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator)
		throws NoSuchMedicalFacilitiesNurseDetailException {

		MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail =
			fetchByUuid_Last(uuid, orderByComparator);

		if (medicalFacilitiesNurseDetail != null) {
			return medicalFacilitiesNurseDetail;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesNurseDetailException(sb.toString());
	}

	/**
	 * Returns the last medical facilities nurse detail in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse detail, or <code>null</code> if a matching medical facilities nurse detail could not be found
	 */
	@Override
	public MedicalFacilitiesNurseDetail fetchByUuid_Last(
		String uuid,
		OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<MedicalFacilitiesNurseDetail> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical facilities nurse details before and after the current medical facilities nurse detail in the ordered set where uuid = &#63;.
	 *
	 * @param medicalFacilitiesNurseDetailId the primary key of the current medical facilities nurse detail
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities nurse detail
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a medical facilities nurse detail with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesNurseDetail[] findByUuid_PrevAndNext(
			long medicalFacilitiesNurseDetailId, String uuid,
			OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator)
		throws NoSuchMedicalFacilitiesNurseDetailException {

		uuid = Objects.toString(uuid, "");

		MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail =
			findByPrimaryKey(medicalFacilitiesNurseDetailId);

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesNurseDetail[] array =
				new MedicalFacilitiesNurseDetailImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, medicalFacilitiesNurseDetail, uuid, orderByComparator,
				true);

			array[1] = medicalFacilitiesNurseDetail;

			array[2] = getByUuid_PrevAndNext(
				session, medicalFacilitiesNurseDetail, uuid, orderByComparator,
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

	protected MedicalFacilitiesNurseDetail getByUuid_PrevAndNext(
		Session session,
		MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail, String uuid,
		OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator,
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

		sb.append(_SQL_SELECT_MEDICALFACILITIESNURSEDETAIL_WHERE);

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
			sb.append(MedicalFacilitiesNurseDetailModelImpl.ORDER_BY_JPQL);
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
						medicalFacilitiesNurseDetail)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalFacilitiesNurseDetail> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical facilities nurse details where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(medicalFacilitiesNurseDetail);
		}
	}

	/**
	 * Returns the number of medical facilities nurse details where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching medical facilities nurse details
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALFACILITIESNURSEDETAIL_WHERE);

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
		"medicalFacilitiesNurseDetail.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(medicalFacilitiesNurseDetail.uuid IS NULL OR medicalFacilitiesNurseDetail.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the medical facilities nurse detail where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMedicalFacilitiesNurseDetailException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities nurse detail
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a matching medical facilities nurse detail could not be found
	 */
	@Override
	public MedicalFacilitiesNurseDetail findByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalFacilitiesNurseDetailException {

		MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail =
			fetchByUUID_G(uuid, groupId);

		if (medicalFacilitiesNurseDetail == null) {
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

			throw new NoSuchMedicalFacilitiesNurseDetailException(
				sb.toString());
		}

		return medicalFacilitiesNurseDetail;
	}

	/**
	 * Returns the medical facilities nurse detail where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities nurse detail, or <code>null</code> if a matching medical facilities nurse detail could not be found
	 */
	@Override
	public MedicalFacilitiesNurseDetail fetchByUUID_G(
		String uuid, long groupId) {

		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the medical facilities nurse detail where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities nurse detail, or <code>null</code> if a matching medical facilities nurse detail could not be found
	 */
	@Override
	public MedicalFacilitiesNurseDetail fetchByUUID_G(
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

		if (result instanceof MedicalFacilitiesNurseDetail) {
			MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail =
				(MedicalFacilitiesNurseDetail)result;

			if (!Objects.equals(uuid, medicalFacilitiesNurseDetail.getUuid()) ||
				(groupId != medicalFacilitiesNurseDetail.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_MEDICALFACILITIESNURSEDETAIL_WHERE);

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

				List<MedicalFacilitiesNurseDetail> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail =
						list.get(0);

					result = medicalFacilitiesNurseDetail;

					cacheResult(medicalFacilitiesNurseDetail);
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
			return (MedicalFacilitiesNurseDetail)result;
		}
	}

	/**
	 * Removes the medical facilities nurse detail where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the medical facilities nurse detail that was removed
	 */
	@Override
	public MedicalFacilitiesNurseDetail removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchMedicalFacilitiesNurseDetailException {

		MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail =
			findByUUID_G(uuid, groupId);

		return remove(medicalFacilitiesNurseDetail);
	}

	/**
	 * Returns the number of medical facilities nurse details where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching medical facilities nurse details
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MEDICALFACILITIESNURSEDETAIL_WHERE);

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
		"medicalFacilitiesNurseDetail.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(medicalFacilitiesNurseDetail.uuid IS NULL OR medicalFacilitiesNurseDetail.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"medicalFacilitiesNurseDetail.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the medical facilities nurse details where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching medical facilities nurse details
	 */
	@Override
	public List<MedicalFacilitiesNurseDetail> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities nurse details where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @return the range of matching medical facilities nurse details
	 */
	@Override
	public List<MedicalFacilitiesNurseDetail> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities nurse details where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities nurse details
	 */
	@Override
	public List<MedicalFacilitiesNurseDetail> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities nurse details where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities nurse details
	 */
	@Override
	public List<MedicalFacilitiesNurseDetail> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator,
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

		List<MedicalFacilitiesNurseDetail> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesNurseDetail>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail :
						list) {

					if (!uuid.equals(medicalFacilitiesNurseDetail.getUuid()) ||
						(companyId !=
							medicalFacilitiesNurseDetail.getCompanyId())) {

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

			sb.append(_SQL_SELECT_MEDICALFACILITIESNURSEDETAIL_WHERE);

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
				sb.append(MedicalFacilitiesNurseDetailModelImpl.ORDER_BY_JPQL);
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

				list = (List<MedicalFacilitiesNurseDetail>)QueryUtil.list(
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
	 * Returns the first medical facilities nurse detail in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse detail
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a matching medical facilities nurse detail could not be found
	 */
	@Override
	public MedicalFacilitiesNurseDetail findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator)
		throws NoSuchMedicalFacilitiesNurseDetailException {

		MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail =
			fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (medicalFacilitiesNurseDetail != null) {
			return medicalFacilitiesNurseDetail;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesNurseDetailException(sb.toString());
	}

	/**
	 * Returns the first medical facilities nurse detail in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse detail, or <code>null</code> if a matching medical facilities nurse detail could not be found
	 */
	@Override
	public MedicalFacilitiesNurseDetail fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator) {

		List<MedicalFacilitiesNurseDetail> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical facilities nurse detail in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse detail
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a matching medical facilities nurse detail could not be found
	 */
	@Override
	public MedicalFacilitiesNurseDetail findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator)
		throws NoSuchMedicalFacilitiesNurseDetailException {

		MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail =
			fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (medicalFacilitiesNurseDetail != null) {
			return medicalFacilitiesNurseDetail;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesNurseDetailException(sb.toString());
	}

	/**
	 * Returns the last medical facilities nurse detail in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse detail, or <code>null</code> if a matching medical facilities nurse detail could not be found
	 */
	@Override
	public MedicalFacilitiesNurseDetail fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<MedicalFacilitiesNurseDetail> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical facilities nurse details before and after the current medical facilities nurse detail in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param medicalFacilitiesNurseDetailId the primary key of the current medical facilities nurse detail
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities nurse detail
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a medical facilities nurse detail with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesNurseDetail[] findByUuid_C_PrevAndNext(
			long medicalFacilitiesNurseDetailId, String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator)
		throws NoSuchMedicalFacilitiesNurseDetailException {

		uuid = Objects.toString(uuid, "");

		MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail =
			findByPrimaryKey(medicalFacilitiesNurseDetailId);

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesNurseDetail[] array =
				new MedicalFacilitiesNurseDetailImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, medicalFacilitiesNurseDetail, uuid, companyId,
				orderByComparator, true);

			array[1] = medicalFacilitiesNurseDetail;

			array[2] = getByUuid_C_PrevAndNext(
				session, medicalFacilitiesNurseDetail, uuid, companyId,
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

	protected MedicalFacilitiesNurseDetail getByUuid_C_PrevAndNext(
		Session session,
		MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail, String uuid,
		long companyId,
		OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator,
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

		sb.append(_SQL_SELECT_MEDICALFACILITIESNURSEDETAIL_WHERE);

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
			sb.append(MedicalFacilitiesNurseDetailModelImpl.ORDER_BY_JPQL);
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
						medicalFacilitiesNurseDetail)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalFacilitiesNurseDetail> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical facilities nurse details where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(medicalFacilitiesNurseDetail);
		}
	}

	/**
	 * Returns the number of medical facilities nurse details where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching medical facilities nurse details
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MEDICALFACILITIESNURSEDETAIL_WHERE);

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
		"medicalFacilitiesNurseDetail.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(medicalFacilitiesNurseDetail.uuid IS NULL OR medicalFacilitiesNurseDetail.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"medicalFacilitiesNurseDetail.companyId = ?";

	private FinderPath _finderPathWithPaginationFindBygetMedicalFacilitiesById;
	private FinderPath
		_finderPathWithoutPaginationFindBygetMedicalFacilitiesById;
	private FinderPath _finderPathCountBygetMedicalFacilitiesById;

	/**
	 * Returns all the medical facilities nurse details where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities nurse details
	 */
	@Override
	public List<MedicalFacilitiesNurseDetail> findBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId) {

		return findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities nurse details where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @return the range of matching medical facilities nurse details
	 */
	@Override
	public List<MedicalFacilitiesNurseDetail> findBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId, int start, int end) {

		return findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities nurse details where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities nurse details
	 */
	@Override
	public List<MedicalFacilitiesNurseDetail> findBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId, int start, int end,
		OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator) {

		return findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities nurse details where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities nurse details
	 */
	@Override
	public List<MedicalFacilitiesNurseDetail> findBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId, int start, int end,
		OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetMedicalFacilitiesById;
				finderArgs = new Object[] {medicalFacilitiesAppId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetMedicalFacilitiesById;
			finderArgs = new Object[] {
				medicalFacilitiesAppId, start, end, orderByComparator
			};
		}

		List<MedicalFacilitiesNurseDetail> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesNurseDetail>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail :
						list) {

					if (medicalFacilitiesAppId !=
							medicalFacilitiesNurseDetail.
								getMedicalFacilitiesAppId()) {

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

			sb.append(_SQL_SELECT_MEDICALFACILITIESNURSEDETAIL_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMEDICALFACILITIESBYID_MEDICALFACILITIESAPPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MedicalFacilitiesNurseDetailModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(medicalFacilitiesAppId);

				list = (List<MedicalFacilitiesNurseDetail>)QueryUtil.list(
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
	 * Returns the first medical facilities nurse detail in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse detail
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a matching medical facilities nurse detail could not be found
	 */
	@Override
	public MedicalFacilitiesNurseDetail findBygetMedicalFacilitiesById_First(
			long medicalFacilitiesAppId,
			OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator)
		throws NoSuchMedicalFacilitiesNurseDetailException {

		MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail =
			fetchBygetMedicalFacilitiesById_First(
				medicalFacilitiesAppId, orderByComparator);

		if (medicalFacilitiesNurseDetail != null) {
			return medicalFacilitiesNurseDetail;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("medicalFacilitiesAppId=");
		sb.append(medicalFacilitiesAppId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesNurseDetailException(sb.toString());
	}

	/**
	 * Returns the first medical facilities nurse detail in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse detail, or <code>null</code> if a matching medical facilities nurse detail could not be found
	 */
	@Override
	public MedicalFacilitiesNurseDetail fetchBygetMedicalFacilitiesById_First(
		long medicalFacilitiesAppId,
		OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator) {

		List<MedicalFacilitiesNurseDetail> list =
			findBygetMedicalFacilitiesById(
				medicalFacilitiesAppId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical facilities nurse detail in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse detail
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a matching medical facilities nurse detail could not be found
	 */
	@Override
	public MedicalFacilitiesNurseDetail findBygetMedicalFacilitiesById_Last(
			long medicalFacilitiesAppId,
			OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator)
		throws NoSuchMedicalFacilitiesNurseDetailException {

		MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail =
			fetchBygetMedicalFacilitiesById_Last(
				medicalFacilitiesAppId, orderByComparator);

		if (medicalFacilitiesNurseDetail != null) {
			return medicalFacilitiesNurseDetail;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("medicalFacilitiesAppId=");
		sb.append(medicalFacilitiesAppId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesNurseDetailException(sb.toString());
	}

	/**
	 * Returns the last medical facilities nurse detail in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse detail, or <code>null</code> if a matching medical facilities nurse detail could not be found
	 */
	@Override
	public MedicalFacilitiesNurseDetail fetchBygetMedicalFacilitiesById_Last(
		long medicalFacilitiesAppId,
		OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator) {

		int count = countBygetMedicalFacilitiesById(medicalFacilitiesAppId);

		if (count == 0) {
			return null;
		}

		List<MedicalFacilitiesNurseDetail> list =
			findBygetMedicalFacilitiesById(
				medicalFacilitiesAppId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical facilities nurse details before and after the current medical facilities nurse detail in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesNurseDetailId the primary key of the current medical facilities nurse detail
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities nurse detail
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a medical facilities nurse detail with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesNurseDetail[]
			findBygetMedicalFacilitiesById_PrevAndNext(
				long medicalFacilitiesNurseDetailId,
				long medicalFacilitiesAppId,
				OrderByComparator<MedicalFacilitiesNurseDetail>
					orderByComparator)
		throws NoSuchMedicalFacilitiesNurseDetailException {

		MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail =
			findByPrimaryKey(medicalFacilitiesNurseDetailId);

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesNurseDetail[] array =
				new MedicalFacilitiesNurseDetailImpl[3];

			array[0] = getBygetMedicalFacilitiesById_PrevAndNext(
				session, medicalFacilitiesNurseDetail, medicalFacilitiesAppId,
				orderByComparator, true);

			array[1] = medicalFacilitiesNurseDetail;

			array[2] = getBygetMedicalFacilitiesById_PrevAndNext(
				session, medicalFacilitiesNurseDetail, medicalFacilitiesAppId,
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

	protected MedicalFacilitiesNurseDetail
		getBygetMedicalFacilitiesById_PrevAndNext(
			Session session,
			MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail,
			long medicalFacilitiesAppId,
			OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator,
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

		sb.append(_SQL_SELECT_MEDICALFACILITIESNURSEDETAIL_WHERE);

		sb.append(
			_FINDER_COLUMN_GETMEDICALFACILITIESBYID_MEDICALFACILITIESAPPID_2);

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
			sb.append(MedicalFacilitiesNurseDetailModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(medicalFacilitiesAppId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						medicalFacilitiesNurseDetail)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalFacilitiesNurseDetail> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical facilities nurse details where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 */
	@Override
	public void removeBygetMedicalFacilitiesById(long medicalFacilitiesAppId) {
		for (MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail :
				findBygetMedicalFacilitiesById(
					medicalFacilitiesAppId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(medicalFacilitiesNurseDetail);
		}
	}

	/**
	 * Returns the number of medical facilities nurse details where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical facilities nurse details
	 */
	@Override
	public int countBygetMedicalFacilitiesById(long medicalFacilitiesAppId) {
		FinderPath finderPath = _finderPathCountBygetMedicalFacilitiesById;

		Object[] finderArgs = new Object[] {medicalFacilitiesAppId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALFACILITIESNURSEDETAIL_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMEDICALFACILITIESBYID_MEDICALFACILITIESAPPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(medicalFacilitiesAppId);

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
		_FINDER_COLUMN_GETMEDICALFACILITIESBYID_MEDICALFACILITIESAPPID_2 =
			"medicalFacilitiesNurseDetail.medicalFacilitiesAppId = ?";

	public MedicalFacilitiesNurseDetailPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(MedicalFacilitiesNurseDetail.class);

		setModelImplClass(MedicalFacilitiesNurseDetailImpl.class);
		setModelPKClass(long.class);

		setTable(MedicalFacilitiesNurseDetailTable.INSTANCE);
	}

	/**
	 * Caches the medical facilities nurse detail in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesNurseDetail the medical facilities nurse detail
	 */
	@Override
	public void cacheResult(
		MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail) {

		entityCache.putResult(
			MedicalFacilitiesNurseDetailImpl.class,
			medicalFacilitiesNurseDetail.getPrimaryKey(),
			medicalFacilitiesNurseDetail);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				medicalFacilitiesNurseDetail.getUuid(),
				medicalFacilitiesNurseDetail.getGroupId()
			},
			medicalFacilitiesNurseDetail);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the medical facilities nurse details in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesNurseDetails the medical facilities nurse details
	 */
	@Override
	public void cacheResult(
		List<MedicalFacilitiesNurseDetail> medicalFacilitiesNurseDetails) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (medicalFacilitiesNurseDetails.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail :
				medicalFacilitiesNurseDetails) {

			if (entityCache.getResult(
					MedicalFacilitiesNurseDetailImpl.class,
					medicalFacilitiesNurseDetail.getPrimaryKey()) == null) {

				cacheResult(medicalFacilitiesNurseDetail);
			}
		}
	}

	/**
	 * Clears the cache for all medical facilities nurse details.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MedicalFacilitiesNurseDetailImpl.class);

		finderCache.clearCache(MedicalFacilitiesNurseDetailImpl.class);
	}

	/**
	 * Clears the cache for the medical facilities nurse detail.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail) {

		entityCache.removeResult(
			MedicalFacilitiesNurseDetailImpl.class,
			medicalFacilitiesNurseDetail);
	}

	@Override
	public void clearCache(
		List<MedicalFacilitiesNurseDetail> medicalFacilitiesNurseDetails) {

		for (MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail :
				medicalFacilitiesNurseDetails) {

			entityCache.removeResult(
				MedicalFacilitiesNurseDetailImpl.class,
				medicalFacilitiesNurseDetail);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MedicalFacilitiesNurseDetailImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MedicalFacilitiesNurseDetailImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MedicalFacilitiesNurseDetailModelImpl
			medicalFacilitiesNurseDetailModelImpl) {

		Object[] args = new Object[] {
			medicalFacilitiesNurseDetailModelImpl.getUuid(),
			medicalFacilitiesNurseDetailModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args,
			medicalFacilitiesNurseDetailModelImpl);
	}

	/**
	 * Creates a new medical facilities nurse detail with the primary key. Does not add the medical facilities nurse detail to the database.
	 *
	 * @param medicalFacilitiesNurseDetailId the primary key for the new medical facilities nurse detail
	 * @return the new medical facilities nurse detail
	 */
	@Override
	public MedicalFacilitiesNurseDetail create(
		long medicalFacilitiesNurseDetailId) {

		MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail =
			new MedicalFacilitiesNurseDetailImpl();

		medicalFacilitiesNurseDetail.setNew(true);
		medicalFacilitiesNurseDetail.setPrimaryKey(
			medicalFacilitiesNurseDetailId);

		String uuid = PortalUUIDUtil.generate();

		medicalFacilitiesNurseDetail.setUuid(uuid);

		medicalFacilitiesNurseDetail.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return medicalFacilitiesNurseDetail;
	}

	/**
	 * Removes the medical facilities nurse detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalFacilitiesNurseDetailId the primary key of the medical facilities nurse detail
	 * @return the medical facilities nurse detail that was removed
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a medical facilities nurse detail with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesNurseDetail remove(
			long medicalFacilitiesNurseDetailId)
		throws NoSuchMedicalFacilitiesNurseDetailException {

		return remove((Serializable)medicalFacilitiesNurseDetailId);
	}

	/**
	 * Removes the medical facilities nurse detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the medical facilities nurse detail
	 * @return the medical facilities nurse detail that was removed
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a medical facilities nurse detail with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesNurseDetail remove(Serializable primaryKey)
		throws NoSuchMedicalFacilitiesNurseDetailException {

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail =
				(MedicalFacilitiesNurseDetail)session.get(
					MedicalFacilitiesNurseDetailImpl.class, primaryKey);

			if (medicalFacilitiesNurseDetail == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMedicalFacilitiesNurseDetailException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(medicalFacilitiesNurseDetail);
		}
		catch (NoSuchMedicalFacilitiesNurseDetailException
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
	protected MedicalFacilitiesNurseDetail removeImpl(
		MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(medicalFacilitiesNurseDetail)) {
				medicalFacilitiesNurseDetail =
					(MedicalFacilitiesNurseDetail)session.get(
						MedicalFacilitiesNurseDetailImpl.class,
						medicalFacilitiesNurseDetail.getPrimaryKeyObj());
			}

			if (medicalFacilitiesNurseDetail != null) {
				session.delete(medicalFacilitiesNurseDetail);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (medicalFacilitiesNurseDetail != null) {
			clearCache(medicalFacilitiesNurseDetail);
		}

		return medicalFacilitiesNurseDetail;
	}

	@Override
	public MedicalFacilitiesNurseDetail updateImpl(
		MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail) {

		boolean isNew = medicalFacilitiesNurseDetail.isNew();

		if (!(medicalFacilitiesNurseDetail instanceof
				MedicalFacilitiesNurseDetailModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					medicalFacilitiesNurseDetail.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					medicalFacilitiesNurseDetail);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in medicalFacilitiesNurseDetail proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MedicalFacilitiesNurseDetail implementation " +
					medicalFacilitiesNurseDetail.getClass());
		}

		MedicalFacilitiesNurseDetailModelImpl
			medicalFacilitiesNurseDetailModelImpl =
				(MedicalFacilitiesNurseDetailModelImpl)
					medicalFacilitiesNurseDetail;

		if (Validator.isNull(medicalFacilitiesNurseDetail.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			medicalFacilitiesNurseDetail.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (medicalFacilitiesNurseDetail.getCreateDate() == null)) {
			if (serviceContext == null) {
				medicalFacilitiesNurseDetail.setCreateDate(date);
			}
			else {
				medicalFacilitiesNurseDetail.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!medicalFacilitiesNurseDetailModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				medicalFacilitiesNurseDetail.setModifiedDate(date);
			}
			else {
				medicalFacilitiesNurseDetail.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(medicalFacilitiesNurseDetail);
			}
			else {
				medicalFacilitiesNurseDetail =
					(MedicalFacilitiesNurseDetail)session.merge(
						medicalFacilitiesNurseDetail);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MedicalFacilitiesNurseDetailImpl.class,
			medicalFacilitiesNurseDetailModelImpl, false, true);

		cacheUniqueFindersCache(medicalFacilitiesNurseDetailModelImpl);

		if (isNew) {
			medicalFacilitiesNurseDetail.setNew(false);
		}

		medicalFacilitiesNurseDetail.resetOriginalValues();

		return medicalFacilitiesNurseDetail;
	}

	/**
	 * Returns the medical facilities nurse detail with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the medical facilities nurse detail
	 * @return the medical facilities nurse detail
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a medical facilities nurse detail with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesNurseDetail findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchMedicalFacilitiesNurseDetailException {

		MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail =
			fetchByPrimaryKey(primaryKey);

		if (medicalFacilitiesNurseDetail == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMedicalFacilitiesNurseDetailException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return medicalFacilitiesNurseDetail;
	}

	/**
	 * Returns the medical facilities nurse detail with the primary key or throws a <code>NoSuchMedicalFacilitiesNurseDetailException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesNurseDetailId the primary key of the medical facilities nurse detail
	 * @return the medical facilities nurse detail
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a medical facilities nurse detail with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesNurseDetail findByPrimaryKey(
			long medicalFacilitiesNurseDetailId)
		throws NoSuchMedicalFacilitiesNurseDetailException {

		return findByPrimaryKey((Serializable)medicalFacilitiesNurseDetailId);
	}

	/**
	 * Returns the medical facilities nurse detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalFacilitiesNurseDetailId the primary key of the medical facilities nurse detail
	 * @return the medical facilities nurse detail, or <code>null</code> if a medical facilities nurse detail with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesNurseDetail fetchByPrimaryKey(
		long medicalFacilitiesNurseDetailId) {

		return fetchByPrimaryKey((Serializable)medicalFacilitiesNurseDetailId);
	}

	/**
	 * Returns all the medical facilities nurse details.
	 *
	 * @return the medical facilities nurse details
	 */
	@Override
	public List<MedicalFacilitiesNurseDetail> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities nurse details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @return the range of medical facilities nurse details
	 */
	@Override
	public List<MedicalFacilitiesNurseDetail> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities nurse details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical facilities nurse details
	 */
	@Override
	public List<MedicalFacilitiesNurseDetail> findAll(
		int start, int end,
		OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities nurse details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical facilities nurse details
	 */
	@Override
	public List<MedicalFacilitiesNurseDetail> findAll(
		int start, int end,
		OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator,
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

		List<MedicalFacilitiesNurseDetail> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesNurseDetail>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MEDICALFACILITIESNURSEDETAIL);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MEDICALFACILITIESNURSEDETAIL;

				sql = sql.concat(
					MedicalFacilitiesNurseDetailModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MedicalFacilitiesNurseDetail>)QueryUtil.list(
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
	 * Removes all the medical facilities nurse details from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail :
				findAll()) {

			remove(medicalFacilitiesNurseDetail);
		}
	}

	/**
	 * Returns the number of medical facilities nurse details.
	 *
	 * @return the number of medical facilities nurse details
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
					_SQL_COUNT_MEDICALFACILITIESNURSEDETAIL);

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
		return "medicalFacilitiesNurseDetailId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MEDICALFACILITIESNURSEDETAIL;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MedicalFacilitiesNurseDetailModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the medical facilities nurse detail persistence.
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

		_finderPathWithPaginationFindBygetMedicalFacilitiesById =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetMedicalFacilitiesById",
				new String[] {
					Long.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"medicalFacilitiesAppId"}, true);

		_finderPathWithoutPaginationFindBygetMedicalFacilitiesById =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetMedicalFacilitiesById",
				new String[] {Long.class.getName()},
				new String[] {"medicalFacilitiesAppId"}, true);

		_finderPathCountBygetMedicalFacilitiesById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMedicalFacilitiesById",
			new String[] {Long.class.getName()},
			new String[] {"medicalFacilitiesAppId"}, false);

		MedicalFacilitiesNurseDetailUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MedicalFacilitiesNurseDetailUtil.setPersistence(null);

		entityCache.removeCache(
			MedicalFacilitiesNurseDetailImpl.class.getName());
	}

	@Override
	@Reference(
		target = MEDICAL_FACILITIESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MEDICAL_FACILITIESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MEDICAL_FACILITIESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MEDICALFACILITIESNURSEDETAIL =
		"SELECT medicalFacilitiesNurseDetail FROM MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail";

	private static final String _SQL_SELECT_MEDICALFACILITIESNURSEDETAIL_WHERE =
		"SELECT medicalFacilitiesNurseDetail FROM MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail WHERE ";

	private static final String _SQL_COUNT_MEDICALFACILITIESNURSEDETAIL =
		"SELECT COUNT(medicalFacilitiesNurseDetail) FROM MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail";

	private static final String _SQL_COUNT_MEDICALFACILITIESNURSEDETAIL_WHERE =
		"SELECT COUNT(medicalFacilitiesNurseDetail) FROM MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"medicalFacilitiesNurseDetail.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MedicalFacilitiesNurseDetail exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MedicalFacilitiesNurseDetail exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MedicalFacilitiesNurseDetailPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}