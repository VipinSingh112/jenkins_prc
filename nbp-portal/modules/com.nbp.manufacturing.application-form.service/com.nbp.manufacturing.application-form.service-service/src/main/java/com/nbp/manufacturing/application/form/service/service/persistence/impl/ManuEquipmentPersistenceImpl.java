/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence.impl;

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
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.manufacturing.application.form.service.exception.NoSuchManuEquipmentException;
import com.nbp.manufacturing.application.form.service.model.ManuEquipment;
import com.nbp.manufacturing.application.form.service.model.ManuEquipmentTable;
import com.nbp.manufacturing.application.form.service.model.impl.ManuEquipmentImpl;
import com.nbp.manufacturing.application.form.service.model.impl.ManuEquipmentModelImpl;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuEquipmentPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuEquipmentUtil;
import com.nbp.manufacturing.application.form.service.service.persistence.impl.constants.MANUFACTURINGPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the manu equipment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ManuEquipmentPersistence.class)
public class ManuEquipmentPersistenceImpl
	extends BasePersistenceImpl<ManuEquipment>
	implements ManuEquipmentPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ManuEquipmentUtil</code> to access the manu equipment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ManuEquipmentImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetManufactureById;
	private FinderPath _finderPathCountBygetManufactureById;

	/**
	 * Returns the manu equipment where manufacturingApplicationId = &#63; or throws a <code>NoSuchManuEquipmentException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu equipment
	 * @throws NoSuchManuEquipmentException if a matching manu equipment could not be found
	 */
	@Override
	public ManuEquipment findBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchManuEquipmentException {

		ManuEquipment manuEquipment = fetchBygetManufactureById(
			manufacturingApplicationId);

		if (manuEquipment == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("manufacturingApplicationId=");
			sb.append(manufacturingApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchManuEquipmentException(sb.toString());
		}

		return manuEquipment;
	}

	/**
	 * Returns the manu equipment where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu equipment, or <code>null</code> if a matching manu equipment could not be found
	 */
	@Override
	public ManuEquipment fetchBygetManufactureById(
		long manufacturingApplicationId) {

		return fetchBygetManufactureById(manufacturingApplicationId, true);
	}

	/**
	 * Returns the manu equipment where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manu equipment, or <code>null</code> if a matching manu equipment could not be found
	 */
	@Override
	public ManuEquipment fetchBygetManufactureById(
		long manufacturingApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {manufacturingApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetManufactureById, finderArgs, this);
		}

		if (result instanceof ManuEquipment) {
			ManuEquipment manuEquipment = (ManuEquipment)result;

			if (manufacturingApplicationId !=
					manuEquipment.getManufacturingApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MANUEQUIPMENT_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMANUFACTUREBYID_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

				List<ManuEquipment> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetManufactureById, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									manufacturingApplicationId
								};
							}

							_log.warn(
								"ManuEquipmentPersistenceImpl.fetchBygetManufactureById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ManuEquipment manuEquipment = list.get(0);

					result = manuEquipment;

					cacheResult(manuEquipment);
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
			return (ManuEquipment)result;
		}
	}

	/**
	 * Removes the manu equipment where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the manu equipment that was removed
	 */
	@Override
	public ManuEquipment removeBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchManuEquipmentException {

		ManuEquipment manuEquipment = findBygetManufactureById(
			manufacturingApplicationId);

		return remove(manuEquipment);
	}

	/**
	 * Returns the number of manu equipments where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu equipments
	 */
	@Override
	public int countBygetManufactureById(long manufacturingApplicationId) {
		FinderPath finderPath = _finderPathCountBygetManufactureById;

		Object[] finderArgs = new Object[] {manufacturingApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MANUEQUIPMENT_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMANUFACTUREBYID_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

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
		_FINDER_COLUMN_GETMANUFACTUREBYID_MANUFACTURINGAPPLICATIONID_2 =
			"manuEquipment.manufacturingApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetMA_ME_MAI;
	private FinderPath _finderPathWithoutPaginationFindBygetMA_ME_MAI;
	private FinderPath _finderPathCountBygetMA_ME_MAI;

	/**
	 * Returns all the manu equipments where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu equipments
	 */
	@Override
	public List<ManuEquipment> findBygetMA_ME_MAI(
		long manufacturingApplicationId) {

		return findBygetMA_ME_MAI(
			manufacturingApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the manu equipments where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu equipments
	 * @param end the upper bound of the range of manu equipments (not inclusive)
	 * @return the range of matching manu equipments
	 */
	@Override
	public List<ManuEquipment> findBygetMA_ME_MAI(
		long manufacturingApplicationId, int start, int end) {

		return findBygetMA_ME_MAI(manufacturingApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the manu equipments where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu equipments
	 * @param end the upper bound of the range of manu equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu equipments
	 */
	@Override
	public List<ManuEquipment> findBygetMA_ME_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuEquipment> orderByComparator) {

		return findBygetMA_ME_MAI(
			manufacturingApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the manu equipments where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu equipments
	 * @param end the upper bound of the range of manu equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu equipments
	 */
	@Override
	public List<ManuEquipment> findBygetMA_ME_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuEquipment> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetMA_ME_MAI;
				finderArgs = new Object[] {manufacturingApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMA_ME_MAI;
			finderArgs = new Object[] {
				manufacturingApplicationId, start, end, orderByComparator
			};
		}

		List<ManuEquipment> list = null;

		if (useFinderCache) {
			list = (List<ManuEquipment>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ManuEquipment manuEquipment : list) {
					if (manufacturingApplicationId !=
							manuEquipment.getManufacturingApplicationId()) {

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

			sb.append(_SQL_SELECT_MANUEQUIPMENT_WHERE);

			sb.append(_FINDER_COLUMN_GETMA_ME_MAI_MANUFACTURINGAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ManuEquipmentModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

				list = (List<ManuEquipment>)QueryUtil.list(
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
	 * Returns the first manu equipment in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu equipment
	 * @throws NoSuchManuEquipmentException if a matching manu equipment could not be found
	 */
	@Override
	public ManuEquipment findBygetMA_ME_MAI_First(
			long manufacturingApplicationId,
			OrderByComparator<ManuEquipment> orderByComparator)
		throws NoSuchManuEquipmentException {

		ManuEquipment manuEquipment = fetchBygetMA_ME_MAI_First(
			manufacturingApplicationId, orderByComparator);

		if (manuEquipment != null) {
			return manuEquipment;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);

		sb.append("}");

		throw new NoSuchManuEquipmentException(sb.toString());
	}

	/**
	 * Returns the first manu equipment in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu equipment, or <code>null</code> if a matching manu equipment could not be found
	 */
	@Override
	public ManuEquipment fetchBygetMA_ME_MAI_First(
		long manufacturingApplicationId,
		OrderByComparator<ManuEquipment> orderByComparator) {

		List<ManuEquipment> list = findBygetMA_ME_MAI(
			manufacturingApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last manu equipment in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu equipment
	 * @throws NoSuchManuEquipmentException if a matching manu equipment could not be found
	 */
	@Override
	public ManuEquipment findBygetMA_ME_MAI_Last(
			long manufacturingApplicationId,
			OrderByComparator<ManuEquipment> orderByComparator)
		throws NoSuchManuEquipmentException {

		ManuEquipment manuEquipment = fetchBygetMA_ME_MAI_Last(
			manufacturingApplicationId, orderByComparator);

		if (manuEquipment != null) {
			return manuEquipment;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);

		sb.append("}");

		throw new NoSuchManuEquipmentException(sb.toString());
	}

	/**
	 * Returns the last manu equipment in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu equipment, or <code>null</code> if a matching manu equipment could not be found
	 */
	@Override
	public ManuEquipment fetchBygetMA_ME_MAI_Last(
		long manufacturingApplicationId,
		OrderByComparator<ManuEquipment> orderByComparator) {

		int count = countBygetMA_ME_MAI(manufacturingApplicationId);

		if (count == 0) {
			return null;
		}

		List<ManuEquipment> list = findBygetMA_ME_MAI(
			manufacturingApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the manu equipments before and after the current manu equipment in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manuEquipmentId the primary key of the current manu equipment
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu equipment
	 * @throws NoSuchManuEquipmentException if a manu equipment with the primary key could not be found
	 */
	@Override
	public ManuEquipment[] findBygetMA_ME_MAI_PrevAndNext(
			long manuEquipmentId, long manufacturingApplicationId,
			OrderByComparator<ManuEquipment> orderByComparator)
		throws NoSuchManuEquipmentException {

		ManuEquipment manuEquipment = findByPrimaryKey(manuEquipmentId);

		Session session = null;

		try {
			session = openSession();

			ManuEquipment[] array = new ManuEquipmentImpl[3];

			array[0] = getBygetMA_ME_MAI_PrevAndNext(
				session, manuEquipment, manufacturingApplicationId,
				orderByComparator, true);

			array[1] = manuEquipment;

			array[2] = getBygetMA_ME_MAI_PrevAndNext(
				session, manuEquipment, manufacturingApplicationId,
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

	protected ManuEquipment getBygetMA_ME_MAI_PrevAndNext(
		Session session, ManuEquipment manuEquipment,
		long manufacturingApplicationId,
		OrderByComparator<ManuEquipment> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_MANUEQUIPMENT_WHERE);

		sb.append(_FINDER_COLUMN_GETMA_ME_MAI_MANUFACTURINGAPPLICATIONID_2);

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
			sb.append(ManuEquipmentModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(manufacturingApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						manuEquipment)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ManuEquipment> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the manu equipments where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	@Override
	public void removeBygetMA_ME_MAI(long manufacturingApplicationId) {
		for (ManuEquipment manuEquipment :
				findBygetMA_ME_MAI(
					manufacturingApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(manuEquipment);
		}
	}

	/**
	 * Returns the number of manu equipments where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu equipments
	 */
	@Override
	public int countBygetMA_ME_MAI(long manufacturingApplicationId) {
		FinderPath finderPath = _finderPathCountBygetMA_ME_MAI;

		Object[] finderArgs = new Object[] {manufacturingApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MANUEQUIPMENT_WHERE);

			sb.append(_FINDER_COLUMN_GETMA_ME_MAI_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

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
		_FINDER_COLUMN_GETMA_ME_MAI_MANUFACTURINGAPPLICATIONID_2 =
			"manuEquipment.manufacturingApplicationId = ?";

	public ManuEquipmentPersistenceImpl() {
		setModelClass(ManuEquipment.class);

		setModelImplClass(ManuEquipmentImpl.class);
		setModelPKClass(long.class);

		setTable(ManuEquipmentTable.INSTANCE);
	}

	/**
	 * Caches the manu equipment in the entity cache if it is enabled.
	 *
	 * @param manuEquipment the manu equipment
	 */
	@Override
	public void cacheResult(ManuEquipment manuEquipment) {
		entityCache.putResult(
			ManuEquipmentImpl.class, manuEquipment.getPrimaryKey(),
			manuEquipment);

		finderCache.putResult(
			_finderPathFetchBygetManufactureById,
			new Object[] {manuEquipment.getManufacturingApplicationId()},
			manuEquipment);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the manu equipments in the entity cache if it is enabled.
	 *
	 * @param manuEquipments the manu equipments
	 */
	@Override
	public void cacheResult(List<ManuEquipment> manuEquipments) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (manuEquipments.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (ManuEquipment manuEquipment : manuEquipments) {
			if (entityCache.getResult(
					ManuEquipmentImpl.class, manuEquipment.getPrimaryKey()) ==
						null) {

				cacheResult(manuEquipment);
			}
		}
	}

	/**
	 * Clears the cache for all manu equipments.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ManuEquipmentImpl.class);

		finderCache.clearCache(ManuEquipmentImpl.class);
	}

	/**
	 * Clears the cache for the manu equipment.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ManuEquipment manuEquipment) {
		entityCache.removeResult(ManuEquipmentImpl.class, manuEquipment);
	}

	@Override
	public void clearCache(List<ManuEquipment> manuEquipments) {
		for (ManuEquipment manuEquipment : manuEquipments) {
			entityCache.removeResult(ManuEquipmentImpl.class, manuEquipment);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ManuEquipmentImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(ManuEquipmentImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		ManuEquipmentModelImpl manuEquipmentModelImpl) {

		Object[] args = new Object[] {
			manuEquipmentModelImpl.getManufacturingApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetManufactureById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetManufactureById, args, manuEquipmentModelImpl);
	}

	/**
	 * Creates a new manu equipment with the primary key. Does not add the manu equipment to the database.
	 *
	 * @param manuEquipmentId the primary key for the new manu equipment
	 * @return the new manu equipment
	 */
	@Override
	public ManuEquipment create(long manuEquipmentId) {
		ManuEquipment manuEquipment = new ManuEquipmentImpl();

		manuEquipment.setNew(true);
		manuEquipment.setPrimaryKey(manuEquipmentId);

		manuEquipment.setCompanyId(CompanyThreadLocal.getCompanyId());

		return manuEquipment;
	}

	/**
	 * Removes the manu equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manuEquipmentId the primary key of the manu equipment
	 * @return the manu equipment that was removed
	 * @throws NoSuchManuEquipmentException if a manu equipment with the primary key could not be found
	 */
	@Override
	public ManuEquipment remove(long manuEquipmentId)
		throws NoSuchManuEquipmentException {

		return remove((Serializable)manuEquipmentId);
	}

	/**
	 * Removes the manu equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the manu equipment
	 * @return the manu equipment that was removed
	 * @throws NoSuchManuEquipmentException if a manu equipment with the primary key could not be found
	 */
	@Override
	public ManuEquipment remove(Serializable primaryKey)
		throws NoSuchManuEquipmentException {

		Session session = null;

		try {
			session = openSession();

			ManuEquipment manuEquipment = (ManuEquipment)session.get(
				ManuEquipmentImpl.class, primaryKey);

			if (manuEquipment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchManuEquipmentException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(manuEquipment);
		}
		catch (NoSuchManuEquipmentException noSuchEntityException) {
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
	protected ManuEquipment removeImpl(ManuEquipment manuEquipment) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(manuEquipment)) {
				manuEquipment = (ManuEquipment)session.get(
					ManuEquipmentImpl.class, manuEquipment.getPrimaryKeyObj());
			}

			if (manuEquipment != null) {
				session.delete(manuEquipment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (manuEquipment != null) {
			clearCache(manuEquipment);
		}

		return manuEquipment;
	}

	@Override
	public ManuEquipment updateImpl(ManuEquipment manuEquipment) {
		boolean isNew = manuEquipment.isNew();

		if (!(manuEquipment instanceof ManuEquipmentModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(manuEquipment.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					manuEquipment);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in manuEquipment proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ManuEquipment implementation " +
					manuEquipment.getClass());
		}

		ManuEquipmentModelImpl manuEquipmentModelImpl =
			(ManuEquipmentModelImpl)manuEquipment;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (manuEquipment.getCreateDate() == null)) {
			if (serviceContext == null) {
				manuEquipment.setCreateDate(date);
			}
			else {
				manuEquipment.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!manuEquipmentModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				manuEquipment.setModifiedDate(date);
			}
			else {
				manuEquipment.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(manuEquipment);
			}
			else {
				manuEquipment = (ManuEquipment)session.merge(manuEquipment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ManuEquipmentImpl.class, manuEquipmentModelImpl, false, true);

		cacheUniqueFindersCache(manuEquipmentModelImpl);

		if (isNew) {
			manuEquipment.setNew(false);
		}

		manuEquipment.resetOriginalValues();

		return manuEquipment;
	}

	/**
	 * Returns the manu equipment with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the manu equipment
	 * @return the manu equipment
	 * @throws NoSuchManuEquipmentException if a manu equipment with the primary key could not be found
	 */
	@Override
	public ManuEquipment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchManuEquipmentException {

		ManuEquipment manuEquipment = fetchByPrimaryKey(primaryKey);

		if (manuEquipment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchManuEquipmentException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return manuEquipment;
	}

	/**
	 * Returns the manu equipment with the primary key or throws a <code>NoSuchManuEquipmentException</code> if it could not be found.
	 *
	 * @param manuEquipmentId the primary key of the manu equipment
	 * @return the manu equipment
	 * @throws NoSuchManuEquipmentException if a manu equipment with the primary key could not be found
	 */
	@Override
	public ManuEquipment findByPrimaryKey(long manuEquipmentId)
		throws NoSuchManuEquipmentException {

		return findByPrimaryKey((Serializable)manuEquipmentId);
	}

	/**
	 * Returns the manu equipment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manuEquipmentId the primary key of the manu equipment
	 * @return the manu equipment, or <code>null</code> if a manu equipment with the primary key could not be found
	 */
	@Override
	public ManuEquipment fetchByPrimaryKey(long manuEquipmentId) {
		return fetchByPrimaryKey((Serializable)manuEquipmentId);
	}

	/**
	 * Returns all the manu equipments.
	 *
	 * @return the manu equipments
	 */
	@Override
	public List<ManuEquipment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the manu equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu equipments
	 * @param end the upper bound of the range of manu equipments (not inclusive)
	 * @return the range of manu equipments
	 */
	@Override
	public List<ManuEquipment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the manu equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu equipments
	 * @param end the upper bound of the range of manu equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manu equipments
	 */
	@Override
	public List<ManuEquipment> findAll(
		int start, int end,
		OrderByComparator<ManuEquipment> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the manu equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu equipments
	 * @param end the upper bound of the range of manu equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manu equipments
	 */
	@Override
	public List<ManuEquipment> findAll(
		int start, int end, OrderByComparator<ManuEquipment> orderByComparator,
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

		List<ManuEquipment> list = null;

		if (useFinderCache) {
			list = (List<ManuEquipment>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MANUEQUIPMENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MANUEQUIPMENT;

				sql = sql.concat(ManuEquipmentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ManuEquipment>)QueryUtil.list(
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
	 * Removes all the manu equipments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ManuEquipment manuEquipment : findAll()) {
			remove(manuEquipment);
		}
	}

	/**
	 * Returns the number of manu equipments.
	 *
	 * @return the number of manu equipments
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_MANUEQUIPMENT);

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
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "manuEquipmentId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MANUEQUIPMENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ManuEquipmentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the manu equipment persistence.
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

		_finderPathFetchBygetManufactureById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetManufactureById",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathCountBygetManufactureById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetManufactureById", new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, false);

		_finderPathWithPaginationFindBygetMA_ME_MAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMA_ME_MAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetMA_ME_MAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetMA_ME_MAI",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathCountBygetMA_ME_MAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMA_ME_MAI",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, false);

		ManuEquipmentUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		ManuEquipmentUtil.setPersistence(null);

		entityCache.removeCache(ManuEquipmentImpl.class.getName());
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MANUEQUIPMENT =
		"SELECT manuEquipment FROM ManuEquipment manuEquipment";

	private static final String _SQL_SELECT_MANUEQUIPMENT_WHERE =
		"SELECT manuEquipment FROM ManuEquipment manuEquipment WHERE ";

	private static final String _SQL_COUNT_MANUEQUIPMENT =
		"SELECT COUNT(manuEquipment) FROM ManuEquipment manuEquipment";

	private static final String _SQL_COUNT_MANUEQUIPMENT_WHERE =
		"SELECT COUNT(manuEquipment) FROM ManuEquipment manuEquipment WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "manuEquipment.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ManuEquipment exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ManuEquipment exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ManuEquipmentPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}