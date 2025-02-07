/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence.impl;

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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismGroundTransBoxException;
import com.nbp.tourism.application.form.services.model.TourismGroundTransBox;
import com.nbp.tourism.application.form.services.model.TourismGroundTransBoxTable;
import com.nbp.tourism.application.form.services.model.impl.TourismGroundTransBoxImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismGroundTransBoxModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismGroundTransBoxPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismGroundTransBoxUtil;
import com.nbp.tourism.application.form.services.service.persistence.impl.constants.TOURISMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

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
 * The persistence implementation for the tourism ground trans box service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismGroundTransBoxPersistence.class)
public class TourismGroundTransBoxPersistenceImpl
	extends BasePersistenceImpl<TourismGroundTransBox>
	implements TourismGroundTransBoxPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismGroundTransBoxUtil</code> to access the tourism ground trans box persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismGroundTransBoxImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetTAP_TAI;
	private FinderPath _finderPathWithoutPaginationFindBygetTAP_TAI;
	private FinderPath _finderPathCountBygetTAP_TAI;

	/**
	 * Returns all the tourism ground trans boxes where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism ground trans boxes
	 */
	@Override
	public List<TourismGroundTransBox> findBygetTAP_TAI(
		long tourismApplicationId) {

		return findBygetTAP_TAI(
			tourismApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism ground trans boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismGroundTransBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism ground trans boxes
	 * @param end the upper bound of the range of tourism ground trans boxes (not inclusive)
	 * @return the range of matching tourism ground trans boxes
	 */
	@Override
	public List<TourismGroundTransBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end) {

		return findBygetTAP_TAI(tourismApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism ground trans boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismGroundTransBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism ground trans boxes
	 * @param end the upper bound of the range of tourism ground trans boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism ground trans boxes
	 */
	@Override
	public List<TourismGroundTransBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end,
		OrderByComparator<TourismGroundTransBox> orderByComparator) {

		return findBygetTAP_TAI(
			tourismApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism ground trans boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismGroundTransBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism ground trans boxes
	 * @param end the upper bound of the range of tourism ground trans boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism ground trans boxes
	 */
	@Override
	public List<TourismGroundTransBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end,
		OrderByComparator<TourismGroundTransBox> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetTAP_TAI;
				finderArgs = new Object[] {tourismApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetTAP_TAI;
			finderArgs = new Object[] {
				tourismApplicationId, start, end, orderByComparator
			};
		}

		List<TourismGroundTransBox> list = null;

		if (useFinderCache) {
			list = (List<TourismGroundTransBox>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TourismGroundTransBox tourismGroundTransBox : list) {
					if (tourismApplicationId !=
							tourismGroundTransBox.getTourismApplicationId()) {

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

			sb.append(_SQL_SELECT_TOURISMGROUNDTRANSBOX_WHERE);

			sb.append(_FINDER_COLUMN_GETTAP_TAI_TOURISMAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(TourismGroundTransBoxModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				list = (List<TourismGroundTransBox>)QueryUtil.list(
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
	 * Returns the first tourism ground trans box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism ground trans box
	 * @throws NoSuchTourismGroundTransBoxException if a matching tourism ground trans box could not be found
	 */
	@Override
	public TourismGroundTransBox findBygetTAP_TAI_First(
			long tourismApplicationId,
			OrderByComparator<TourismGroundTransBox> orderByComparator)
		throws NoSuchTourismGroundTransBoxException {

		TourismGroundTransBox tourismGroundTransBox = fetchBygetTAP_TAI_First(
			tourismApplicationId, orderByComparator);

		if (tourismGroundTransBox != null) {
			return tourismGroundTransBox;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("tourismApplicationId=");
		sb.append(tourismApplicationId);

		sb.append("}");

		throw new NoSuchTourismGroundTransBoxException(sb.toString());
	}

	/**
	 * Returns the first tourism ground trans box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism ground trans box, or <code>null</code> if a matching tourism ground trans box could not be found
	 */
	@Override
	public TourismGroundTransBox fetchBygetTAP_TAI_First(
		long tourismApplicationId,
		OrderByComparator<TourismGroundTransBox> orderByComparator) {

		List<TourismGroundTransBox> list = findBygetTAP_TAI(
			tourismApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tourism ground trans box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism ground trans box
	 * @throws NoSuchTourismGroundTransBoxException if a matching tourism ground trans box could not be found
	 */
	@Override
	public TourismGroundTransBox findBygetTAP_TAI_Last(
			long tourismApplicationId,
			OrderByComparator<TourismGroundTransBox> orderByComparator)
		throws NoSuchTourismGroundTransBoxException {

		TourismGroundTransBox tourismGroundTransBox = fetchBygetTAP_TAI_Last(
			tourismApplicationId, orderByComparator);

		if (tourismGroundTransBox != null) {
			return tourismGroundTransBox;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("tourismApplicationId=");
		sb.append(tourismApplicationId);

		sb.append("}");

		throw new NoSuchTourismGroundTransBoxException(sb.toString());
	}

	/**
	 * Returns the last tourism ground trans box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism ground trans box, or <code>null</code> if a matching tourism ground trans box could not be found
	 */
	@Override
	public TourismGroundTransBox fetchBygetTAP_TAI_Last(
		long tourismApplicationId,
		OrderByComparator<TourismGroundTransBox> orderByComparator) {

		int count = countBygetTAP_TAI(tourismApplicationId);

		if (count == 0) {
			return null;
		}

		List<TourismGroundTransBox> list = findBygetTAP_TAI(
			tourismApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tourism ground trans boxes before and after the current tourism ground trans box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismVehicleBoxId the primary key of the current tourism ground trans box
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism ground trans box
	 * @throws NoSuchTourismGroundTransBoxException if a tourism ground trans box with the primary key could not be found
	 */
	@Override
	public TourismGroundTransBox[] findBygetTAP_TAI_PrevAndNext(
			long tourismVehicleBoxId, long tourismApplicationId,
			OrderByComparator<TourismGroundTransBox> orderByComparator)
		throws NoSuchTourismGroundTransBoxException {

		TourismGroundTransBox tourismGroundTransBox = findByPrimaryKey(
			tourismVehicleBoxId);

		Session session = null;

		try {
			session = openSession();

			TourismGroundTransBox[] array = new TourismGroundTransBoxImpl[3];

			array[0] = getBygetTAP_TAI_PrevAndNext(
				session, tourismGroundTransBox, tourismApplicationId,
				orderByComparator, true);

			array[1] = tourismGroundTransBox;

			array[2] = getBygetTAP_TAI_PrevAndNext(
				session, tourismGroundTransBox, tourismApplicationId,
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

	protected TourismGroundTransBox getBygetTAP_TAI_PrevAndNext(
		Session session, TourismGroundTransBox tourismGroundTransBox,
		long tourismApplicationId,
		OrderByComparator<TourismGroundTransBox> orderByComparator,
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

		sb.append(_SQL_SELECT_TOURISMGROUNDTRANSBOX_WHERE);

		sb.append(_FINDER_COLUMN_GETTAP_TAI_TOURISMAPPLICATIONID_2);

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
			sb.append(TourismGroundTransBoxModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(tourismApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						tourismGroundTransBox)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<TourismGroundTransBox> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tourism ground trans boxes where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 */
	@Override
	public void removeBygetTAP_TAI(long tourismApplicationId) {
		for (TourismGroundTransBox tourismGroundTransBox :
				findBygetTAP_TAI(
					tourismApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(tourismGroundTransBox);
		}
	}

	/**
	 * Returns the number of tourism ground trans boxes where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism ground trans boxes
	 */
	@Override
	public int countBygetTAP_TAI(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTAP_TAI;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMGROUNDTRANSBOX_WHERE);

			sb.append(_FINDER_COLUMN_GETTAP_TAI_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

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
		_FINDER_COLUMN_GETTAP_TAI_TOURISMAPPLICATIONID_2 =
			"tourismGroundTransBox.tourismApplicationId = ?";

	public TourismGroundTransBoxPersistenceImpl() {
		setModelClass(TourismGroundTransBox.class);

		setModelImplClass(TourismGroundTransBoxImpl.class);
		setModelPKClass(long.class);

		setTable(TourismGroundTransBoxTable.INSTANCE);
	}

	/**
	 * Caches the tourism ground trans box in the entity cache if it is enabled.
	 *
	 * @param tourismGroundTransBox the tourism ground trans box
	 */
	@Override
	public void cacheResult(TourismGroundTransBox tourismGroundTransBox) {
		entityCache.putResult(
			TourismGroundTransBoxImpl.class,
			tourismGroundTransBox.getPrimaryKey(), tourismGroundTransBox);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism ground trans boxes in the entity cache if it is enabled.
	 *
	 * @param tourismGroundTransBoxes the tourism ground trans boxes
	 */
	@Override
	public void cacheResult(
		List<TourismGroundTransBox> tourismGroundTransBoxes) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismGroundTransBoxes.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismGroundTransBox tourismGroundTransBox :
				tourismGroundTransBoxes) {

			if (entityCache.getResult(
					TourismGroundTransBoxImpl.class,
					tourismGroundTransBox.getPrimaryKey()) == null) {

				cacheResult(tourismGroundTransBox);
			}
		}
	}

	/**
	 * Clears the cache for all tourism ground trans boxes.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismGroundTransBoxImpl.class);

		finderCache.clearCache(TourismGroundTransBoxImpl.class);
	}

	/**
	 * Clears the cache for the tourism ground trans box.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TourismGroundTransBox tourismGroundTransBox) {
		entityCache.removeResult(
			TourismGroundTransBoxImpl.class, tourismGroundTransBox);
	}

	@Override
	public void clearCache(
		List<TourismGroundTransBox> tourismGroundTransBoxes) {

		for (TourismGroundTransBox tourismGroundTransBox :
				tourismGroundTransBoxes) {

			entityCache.removeResult(
				TourismGroundTransBoxImpl.class, tourismGroundTransBox);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismGroundTransBoxImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismGroundTransBoxImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new tourism ground trans box with the primary key. Does not add the tourism ground trans box to the database.
	 *
	 * @param tourismVehicleBoxId the primary key for the new tourism ground trans box
	 * @return the new tourism ground trans box
	 */
	@Override
	public TourismGroundTransBox create(long tourismVehicleBoxId) {
		TourismGroundTransBox tourismGroundTransBox =
			new TourismGroundTransBoxImpl();

		tourismGroundTransBox.setNew(true);
		tourismGroundTransBox.setPrimaryKey(tourismVehicleBoxId);

		tourismGroundTransBox.setCompanyId(CompanyThreadLocal.getCompanyId());

		return tourismGroundTransBox;
	}

	/**
	 * Removes the tourism ground trans box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismVehicleBoxId the primary key of the tourism ground trans box
	 * @return the tourism ground trans box that was removed
	 * @throws NoSuchTourismGroundTransBoxException if a tourism ground trans box with the primary key could not be found
	 */
	@Override
	public TourismGroundTransBox remove(long tourismVehicleBoxId)
		throws NoSuchTourismGroundTransBoxException {

		return remove((Serializable)tourismVehicleBoxId);
	}

	/**
	 * Removes the tourism ground trans box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism ground trans box
	 * @return the tourism ground trans box that was removed
	 * @throws NoSuchTourismGroundTransBoxException if a tourism ground trans box with the primary key could not be found
	 */
	@Override
	public TourismGroundTransBox remove(Serializable primaryKey)
		throws NoSuchTourismGroundTransBoxException {

		Session session = null;

		try {
			session = openSession();

			TourismGroundTransBox tourismGroundTransBox =
				(TourismGroundTransBox)session.get(
					TourismGroundTransBoxImpl.class, primaryKey);

			if (tourismGroundTransBox == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismGroundTransBoxException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismGroundTransBox);
		}
		catch (NoSuchTourismGroundTransBoxException noSuchEntityException) {
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
	protected TourismGroundTransBox removeImpl(
		TourismGroundTransBox tourismGroundTransBox) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismGroundTransBox)) {
				tourismGroundTransBox = (TourismGroundTransBox)session.get(
					TourismGroundTransBoxImpl.class,
					tourismGroundTransBox.getPrimaryKeyObj());
			}

			if (tourismGroundTransBox != null) {
				session.delete(tourismGroundTransBox);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismGroundTransBox != null) {
			clearCache(tourismGroundTransBox);
		}

		return tourismGroundTransBox;
	}

	@Override
	public TourismGroundTransBox updateImpl(
		TourismGroundTransBox tourismGroundTransBox) {

		boolean isNew = tourismGroundTransBox.isNew();

		if (!(tourismGroundTransBox instanceof
				TourismGroundTransBoxModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(tourismGroundTransBox.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismGroundTransBox);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismGroundTransBox proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismGroundTransBox implementation " +
					tourismGroundTransBox.getClass());
		}

		TourismGroundTransBoxModelImpl tourismGroundTransBoxModelImpl =
			(TourismGroundTransBoxModelImpl)tourismGroundTransBox;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (tourismGroundTransBox.getCreateDate() == null)) {
			if (serviceContext == null) {
				tourismGroundTransBox.setCreateDate(date);
			}
			else {
				tourismGroundTransBox.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismGroundTransBoxModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismGroundTransBox.setModifiedDate(date);
			}
			else {
				tourismGroundTransBox.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismGroundTransBox);
			}
			else {
				tourismGroundTransBox = (TourismGroundTransBox)session.merge(
					tourismGroundTransBox);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismGroundTransBoxImpl.class, tourismGroundTransBoxModelImpl,
			false, true);

		if (isNew) {
			tourismGroundTransBox.setNew(false);
		}

		tourismGroundTransBox.resetOriginalValues();

		return tourismGroundTransBox;
	}

	/**
	 * Returns the tourism ground trans box with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism ground trans box
	 * @return the tourism ground trans box
	 * @throws NoSuchTourismGroundTransBoxException if a tourism ground trans box with the primary key could not be found
	 */
	@Override
	public TourismGroundTransBox findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTourismGroundTransBoxException {

		TourismGroundTransBox tourismGroundTransBox = fetchByPrimaryKey(
			primaryKey);

		if (tourismGroundTransBox == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismGroundTransBoxException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismGroundTransBox;
	}

	/**
	 * Returns the tourism ground trans box with the primary key or throws a <code>NoSuchTourismGroundTransBoxException</code> if it could not be found.
	 *
	 * @param tourismVehicleBoxId the primary key of the tourism ground trans box
	 * @return the tourism ground trans box
	 * @throws NoSuchTourismGroundTransBoxException if a tourism ground trans box with the primary key could not be found
	 */
	@Override
	public TourismGroundTransBox findByPrimaryKey(long tourismVehicleBoxId)
		throws NoSuchTourismGroundTransBoxException {

		return findByPrimaryKey((Serializable)tourismVehicleBoxId);
	}

	/**
	 * Returns the tourism ground trans box with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismVehicleBoxId the primary key of the tourism ground trans box
	 * @return the tourism ground trans box, or <code>null</code> if a tourism ground trans box with the primary key could not be found
	 */
	@Override
	public TourismGroundTransBox fetchByPrimaryKey(long tourismVehicleBoxId) {
		return fetchByPrimaryKey((Serializable)tourismVehicleBoxId);
	}

	/**
	 * Returns all the tourism ground trans boxes.
	 *
	 * @return the tourism ground trans boxes
	 */
	@Override
	public List<TourismGroundTransBox> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism ground trans boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismGroundTransBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism ground trans boxes
	 * @param end the upper bound of the range of tourism ground trans boxes (not inclusive)
	 * @return the range of tourism ground trans boxes
	 */
	@Override
	public List<TourismGroundTransBox> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism ground trans boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismGroundTransBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism ground trans boxes
	 * @param end the upper bound of the range of tourism ground trans boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism ground trans boxes
	 */
	@Override
	public List<TourismGroundTransBox> findAll(
		int start, int end,
		OrderByComparator<TourismGroundTransBox> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism ground trans boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismGroundTransBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism ground trans boxes
	 * @param end the upper bound of the range of tourism ground trans boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism ground trans boxes
	 */
	@Override
	public List<TourismGroundTransBox> findAll(
		int start, int end,
		OrderByComparator<TourismGroundTransBox> orderByComparator,
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

		List<TourismGroundTransBox> list = null;

		if (useFinderCache) {
			list = (List<TourismGroundTransBox>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMGROUNDTRANSBOX);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMGROUNDTRANSBOX;

				sql = sql.concat(TourismGroundTransBoxModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismGroundTransBox>)QueryUtil.list(
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
	 * Removes all the tourism ground trans boxes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismGroundTransBox tourismGroundTransBox : findAll()) {
			remove(tourismGroundTransBox);
		}
	}

	/**
	 * Returns the number of tourism ground trans boxes.
	 *
	 * @return the number of tourism ground trans boxes
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
					_SQL_COUNT_TOURISMGROUNDTRANSBOX);

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
		return "tourismVehicleBoxId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMGROUNDTRANSBOX;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismGroundTransBoxModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism ground trans box persistence.
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

		_finderPathWithPaginationFindBygetTAP_TAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetTAP_TAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"tourismApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetTAP_TAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetTAP_TAI",
			new String[] {Long.class.getName()},
			new String[] {"tourismApplicationId"}, true);

		_finderPathCountBygetTAP_TAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetTAP_TAI",
			new String[] {Long.class.getName()},
			new String[] {"tourismApplicationId"}, false);

		TourismGroundTransBoxUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismGroundTransBoxUtil.setPersistence(null);

		entityCache.removeCache(TourismGroundTransBoxImpl.class.getName());
	}

	@Override
	@Reference(
		target = TOURISMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = TOURISMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = TOURISMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_TOURISMGROUNDTRANSBOX =
		"SELECT tourismGroundTransBox FROM TourismGroundTransBox tourismGroundTransBox";

	private static final String _SQL_SELECT_TOURISMGROUNDTRANSBOX_WHERE =
		"SELECT tourismGroundTransBox FROM TourismGroundTransBox tourismGroundTransBox WHERE ";

	private static final String _SQL_COUNT_TOURISMGROUNDTRANSBOX =
		"SELECT COUNT(tourismGroundTransBox) FROM TourismGroundTransBox tourismGroundTransBox";

	private static final String _SQL_COUNT_TOURISMGROUNDTRANSBOX_WHERE =
		"SELECT COUNT(tourismGroundTransBox) FROM TourismGroundTransBox tourismGroundTransBox WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismGroundTransBox.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismGroundTransBox exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismGroundTransBox exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismGroundTransBoxPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}