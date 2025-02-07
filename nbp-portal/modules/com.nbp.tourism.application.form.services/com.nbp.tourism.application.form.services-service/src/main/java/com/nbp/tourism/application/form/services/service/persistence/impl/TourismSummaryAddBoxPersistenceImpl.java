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
import com.liferay.portal.kernel.util.SetUtil;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismSummaryAddBoxException;
import com.nbp.tourism.application.form.services.model.TourismSummaryAddBox;
import com.nbp.tourism.application.form.services.model.TourismSummaryAddBoxTable;
import com.nbp.tourism.application.form.services.model.impl.TourismSummaryAddBoxImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismSummaryAddBoxModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismSummaryAddBoxPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismSummaryAddBoxUtil;
import com.nbp.tourism.application.form.services.service.persistence.impl.constants.TOURISMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the tourism summary add box service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismSummaryAddBoxPersistence.class)
public class TourismSummaryAddBoxPersistenceImpl
	extends BasePersistenceImpl<TourismSummaryAddBox>
	implements TourismSummaryAddBoxPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismSummaryAddBoxUtil</code> to access the tourism summary add box persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismSummaryAddBoxImpl.class.getName();

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
	 * Returns all the tourism summary add boxes where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism summary add boxes
	 */
	@Override
	public List<TourismSummaryAddBox> findBygetTAP_TAI(
		long tourismApplicationId) {

		return findBygetTAP_TAI(
			tourismApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism summary add boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismSummaryAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism summary add boxes
	 * @param end the upper bound of the range of tourism summary add boxes (not inclusive)
	 * @return the range of matching tourism summary add boxes
	 */
	@Override
	public List<TourismSummaryAddBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end) {

		return findBygetTAP_TAI(tourismApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism summary add boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismSummaryAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism summary add boxes
	 * @param end the upper bound of the range of tourism summary add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism summary add boxes
	 */
	@Override
	public List<TourismSummaryAddBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end,
		OrderByComparator<TourismSummaryAddBox> orderByComparator) {

		return findBygetTAP_TAI(
			tourismApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism summary add boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismSummaryAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism summary add boxes
	 * @param end the upper bound of the range of tourism summary add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism summary add boxes
	 */
	@Override
	public List<TourismSummaryAddBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end,
		OrderByComparator<TourismSummaryAddBox> orderByComparator,
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

		List<TourismSummaryAddBox> list = null;

		if (useFinderCache) {
			list = (List<TourismSummaryAddBox>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TourismSummaryAddBox tourismSummaryAddBox : list) {
					if (tourismApplicationId !=
							tourismSummaryAddBox.getTourismApplicationId()) {

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

			sb.append(_SQL_SELECT_TOURISMSUMMARYADDBOX_WHERE);

			sb.append(_FINDER_COLUMN_GETTAP_TAI_TOURISMAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(TourismSummaryAddBoxModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				list = (List<TourismSummaryAddBox>)QueryUtil.list(
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
	 * Returns the first tourism summary add box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism summary add box
	 * @throws NoSuchTourismSummaryAddBoxException if a matching tourism summary add box could not be found
	 */
	@Override
	public TourismSummaryAddBox findBygetTAP_TAI_First(
			long tourismApplicationId,
			OrderByComparator<TourismSummaryAddBox> orderByComparator)
		throws NoSuchTourismSummaryAddBoxException {

		TourismSummaryAddBox tourismSummaryAddBox = fetchBygetTAP_TAI_First(
			tourismApplicationId, orderByComparator);

		if (tourismSummaryAddBox != null) {
			return tourismSummaryAddBox;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("tourismApplicationId=");
		sb.append(tourismApplicationId);

		sb.append("}");

		throw new NoSuchTourismSummaryAddBoxException(sb.toString());
	}

	/**
	 * Returns the first tourism summary add box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism summary add box, or <code>null</code> if a matching tourism summary add box could not be found
	 */
	@Override
	public TourismSummaryAddBox fetchBygetTAP_TAI_First(
		long tourismApplicationId,
		OrderByComparator<TourismSummaryAddBox> orderByComparator) {

		List<TourismSummaryAddBox> list = findBygetTAP_TAI(
			tourismApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tourism summary add box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism summary add box
	 * @throws NoSuchTourismSummaryAddBoxException if a matching tourism summary add box could not be found
	 */
	@Override
	public TourismSummaryAddBox findBygetTAP_TAI_Last(
			long tourismApplicationId,
			OrderByComparator<TourismSummaryAddBox> orderByComparator)
		throws NoSuchTourismSummaryAddBoxException {

		TourismSummaryAddBox tourismSummaryAddBox = fetchBygetTAP_TAI_Last(
			tourismApplicationId, orderByComparator);

		if (tourismSummaryAddBox != null) {
			return tourismSummaryAddBox;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("tourismApplicationId=");
		sb.append(tourismApplicationId);

		sb.append("}");

		throw new NoSuchTourismSummaryAddBoxException(sb.toString());
	}

	/**
	 * Returns the last tourism summary add box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism summary add box, or <code>null</code> if a matching tourism summary add box could not be found
	 */
	@Override
	public TourismSummaryAddBox fetchBygetTAP_TAI_Last(
		long tourismApplicationId,
		OrderByComparator<TourismSummaryAddBox> orderByComparator) {

		int count = countBygetTAP_TAI(tourismApplicationId);

		if (count == 0) {
			return null;
		}

		List<TourismSummaryAddBox> list = findBygetTAP_TAI(
			tourismApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tourism summary add boxes before and after the current tourism summary add box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismSummaryBoxId the primary key of the current tourism summary add box
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism summary add box
	 * @throws NoSuchTourismSummaryAddBoxException if a tourism summary add box with the primary key could not be found
	 */
	@Override
	public TourismSummaryAddBox[] findBygetTAP_TAI_PrevAndNext(
			long tourismSummaryBoxId, long tourismApplicationId,
			OrderByComparator<TourismSummaryAddBox> orderByComparator)
		throws NoSuchTourismSummaryAddBoxException {

		TourismSummaryAddBox tourismSummaryAddBox = findByPrimaryKey(
			tourismSummaryBoxId);

		Session session = null;

		try {
			session = openSession();

			TourismSummaryAddBox[] array = new TourismSummaryAddBoxImpl[3];

			array[0] = getBygetTAP_TAI_PrevAndNext(
				session, tourismSummaryAddBox, tourismApplicationId,
				orderByComparator, true);

			array[1] = tourismSummaryAddBox;

			array[2] = getBygetTAP_TAI_PrevAndNext(
				session, tourismSummaryAddBox, tourismApplicationId,
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

	protected TourismSummaryAddBox getBygetTAP_TAI_PrevAndNext(
		Session session, TourismSummaryAddBox tourismSummaryAddBox,
		long tourismApplicationId,
		OrderByComparator<TourismSummaryAddBox> orderByComparator,
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

		sb.append(_SQL_SELECT_TOURISMSUMMARYADDBOX_WHERE);

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
			sb.append(TourismSummaryAddBoxModelImpl.ORDER_BY_JPQL);
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
						tourismSummaryAddBox)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<TourismSummaryAddBox> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tourism summary add boxes where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 */
	@Override
	public void removeBygetTAP_TAI(long tourismApplicationId) {
		for (TourismSummaryAddBox tourismSummaryAddBox :
				findBygetTAP_TAI(
					tourismApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(tourismSummaryAddBox);
		}
	}

	/**
	 * Returns the number of tourism summary add boxes where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism summary add boxes
	 */
	@Override
	public int countBygetTAP_TAI(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTAP_TAI;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMSUMMARYADDBOX_WHERE);

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
			"tourismSummaryAddBox.tourismApplicationId = ?";

	public TourismSummaryAddBoxPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("type", "type_");

		setDBColumnNames(dbColumnNames);

		setModelClass(TourismSummaryAddBox.class);

		setModelImplClass(TourismSummaryAddBoxImpl.class);
		setModelPKClass(long.class);

		setTable(TourismSummaryAddBoxTable.INSTANCE);
	}

	/**
	 * Caches the tourism summary add box in the entity cache if it is enabled.
	 *
	 * @param tourismSummaryAddBox the tourism summary add box
	 */
	@Override
	public void cacheResult(TourismSummaryAddBox tourismSummaryAddBox) {
		entityCache.putResult(
			TourismSummaryAddBoxImpl.class,
			tourismSummaryAddBox.getPrimaryKey(), tourismSummaryAddBox);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism summary add boxes in the entity cache if it is enabled.
	 *
	 * @param tourismSummaryAddBoxes the tourism summary add boxes
	 */
	@Override
	public void cacheResult(List<TourismSummaryAddBox> tourismSummaryAddBoxes) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismSummaryAddBoxes.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismSummaryAddBox tourismSummaryAddBox :
				tourismSummaryAddBoxes) {

			if (entityCache.getResult(
					TourismSummaryAddBoxImpl.class,
					tourismSummaryAddBox.getPrimaryKey()) == null) {

				cacheResult(tourismSummaryAddBox);
			}
		}
	}

	/**
	 * Clears the cache for all tourism summary add boxes.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismSummaryAddBoxImpl.class);

		finderCache.clearCache(TourismSummaryAddBoxImpl.class);
	}

	/**
	 * Clears the cache for the tourism summary add box.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TourismSummaryAddBox tourismSummaryAddBox) {
		entityCache.removeResult(
			TourismSummaryAddBoxImpl.class, tourismSummaryAddBox);
	}

	@Override
	public void clearCache(List<TourismSummaryAddBox> tourismSummaryAddBoxes) {
		for (TourismSummaryAddBox tourismSummaryAddBox :
				tourismSummaryAddBoxes) {

			entityCache.removeResult(
				TourismSummaryAddBoxImpl.class, tourismSummaryAddBox);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismSummaryAddBoxImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismSummaryAddBoxImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new tourism summary add box with the primary key. Does not add the tourism summary add box to the database.
	 *
	 * @param tourismSummaryBoxId the primary key for the new tourism summary add box
	 * @return the new tourism summary add box
	 */
	@Override
	public TourismSummaryAddBox create(long tourismSummaryBoxId) {
		TourismSummaryAddBox tourismSummaryAddBox =
			new TourismSummaryAddBoxImpl();

		tourismSummaryAddBox.setNew(true);
		tourismSummaryAddBox.setPrimaryKey(tourismSummaryBoxId);

		tourismSummaryAddBox.setCompanyId(CompanyThreadLocal.getCompanyId());

		return tourismSummaryAddBox;
	}

	/**
	 * Removes the tourism summary add box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismSummaryBoxId the primary key of the tourism summary add box
	 * @return the tourism summary add box that was removed
	 * @throws NoSuchTourismSummaryAddBoxException if a tourism summary add box with the primary key could not be found
	 */
	@Override
	public TourismSummaryAddBox remove(long tourismSummaryBoxId)
		throws NoSuchTourismSummaryAddBoxException {

		return remove((Serializable)tourismSummaryBoxId);
	}

	/**
	 * Removes the tourism summary add box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism summary add box
	 * @return the tourism summary add box that was removed
	 * @throws NoSuchTourismSummaryAddBoxException if a tourism summary add box with the primary key could not be found
	 */
	@Override
	public TourismSummaryAddBox remove(Serializable primaryKey)
		throws NoSuchTourismSummaryAddBoxException {

		Session session = null;

		try {
			session = openSession();

			TourismSummaryAddBox tourismSummaryAddBox =
				(TourismSummaryAddBox)session.get(
					TourismSummaryAddBoxImpl.class, primaryKey);

			if (tourismSummaryAddBox == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismSummaryAddBoxException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismSummaryAddBox);
		}
		catch (NoSuchTourismSummaryAddBoxException noSuchEntityException) {
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
	protected TourismSummaryAddBox removeImpl(
		TourismSummaryAddBox tourismSummaryAddBox) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismSummaryAddBox)) {
				tourismSummaryAddBox = (TourismSummaryAddBox)session.get(
					TourismSummaryAddBoxImpl.class,
					tourismSummaryAddBox.getPrimaryKeyObj());
			}

			if (tourismSummaryAddBox != null) {
				session.delete(tourismSummaryAddBox);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismSummaryAddBox != null) {
			clearCache(tourismSummaryAddBox);
		}

		return tourismSummaryAddBox;
	}

	@Override
	public TourismSummaryAddBox updateImpl(
		TourismSummaryAddBox tourismSummaryAddBox) {

		boolean isNew = tourismSummaryAddBox.isNew();

		if (!(tourismSummaryAddBox instanceof TourismSummaryAddBoxModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(tourismSummaryAddBox.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismSummaryAddBox);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismSummaryAddBox proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismSummaryAddBox implementation " +
					tourismSummaryAddBox.getClass());
		}

		TourismSummaryAddBoxModelImpl tourismSummaryAddBoxModelImpl =
			(TourismSummaryAddBoxModelImpl)tourismSummaryAddBox;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (tourismSummaryAddBox.getCreateDate() == null)) {
			if (serviceContext == null) {
				tourismSummaryAddBox.setCreateDate(date);
			}
			else {
				tourismSummaryAddBox.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismSummaryAddBoxModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismSummaryAddBox.setModifiedDate(date);
			}
			else {
				tourismSummaryAddBox.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismSummaryAddBox);
			}
			else {
				tourismSummaryAddBox = (TourismSummaryAddBox)session.merge(
					tourismSummaryAddBox);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismSummaryAddBoxImpl.class, tourismSummaryAddBoxModelImpl,
			false, true);

		if (isNew) {
			tourismSummaryAddBox.setNew(false);
		}

		tourismSummaryAddBox.resetOriginalValues();

		return tourismSummaryAddBox;
	}

	/**
	 * Returns the tourism summary add box with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism summary add box
	 * @return the tourism summary add box
	 * @throws NoSuchTourismSummaryAddBoxException if a tourism summary add box with the primary key could not be found
	 */
	@Override
	public TourismSummaryAddBox findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTourismSummaryAddBoxException {

		TourismSummaryAddBox tourismSummaryAddBox = fetchByPrimaryKey(
			primaryKey);

		if (tourismSummaryAddBox == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismSummaryAddBoxException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismSummaryAddBox;
	}

	/**
	 * Returns the tourism summary add box with the primary key or throws a <code>NoSuchTourismSummaryAddBoxException</code> if it could not be found.
	 *
	 * @param tourismSummaryBoxId the primary key of the tourism summary add box
	 * @return the tourism summary add box
	 * @throws NoSuchTourismSummaryAddBoxException if a tourism summary add box with the primary key could not be found
	 */
	@Override
	public TourismSummaryAddBox findByPrimaryKey(long tourismSummaryBoxId)
		throws NoSuchTourismSummaryAddBoxException {

		return findByPrimaryKey((Serializable)tourismSummaryBoxId);
	}

	/**
	 * Returns the tourism summary add box with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismSummaryBoxId the primary key of the tourism summary add box
	 * @return the tourism summary add box, or <code>null</code> if a tourism summary add box with the primary key could not be found
	 */
	@Override
	public TourismSummaryAddBox fetchByPrimaryKey(long tourismSummaryBoxId) {
		return fetchByPrimaryKey((Serializable)tourismSummaryBoxId);
	}

	/**
	 * Returns all the tourism summary add boxes.
	 *
	 * @return the tourism summary add boxes
	 */
	@Override
	public List<TourismSummaryAddBox> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism summary add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismSummaryAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism summary add boxes
	 * @param end the upper bound of the range of tourism summary add boxes (not inclusive)
	 * @return the range of tourism summary add boxes
	 */
	@Override
	public List<TourismSummaryAddBox> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism summary add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismSummaryAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism summary add boxes
	 * @param end the upper bound of the range of tourism summary add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism summary add boxes
	 */
	@Override
	public List<TourismSummaryAddBox> findAll(
		int start, int end,
		OrderByComparator<TourismSummaryAddBox> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism summary add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismSummaryAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism summary add boxes
	 * @param end the upper bound of the range of tourism summary add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism summary add boxes
	 */
	@Override
	public List<TourismSummaryAddBox> findAll(
		int start, int end,
		OrderByComparator<TourismSummaryAddBox> orderByComparator,
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

		List<TourismSummaryAddBox> list = null;

		if (useFinderCache) {
			list = (List<TourismSummaryAddBox>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMSUMMARYADDBOX);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMSUMMARYADDBOX;

				sql = sql.concat(TourismSummaryAddBoxModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismSummaryAddBox>)QueryUtil.list(
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
	 * Removes all the tourism summary add boxes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismSummaryAddBox tourismSummaryAddBox : findAll()) {
			remove(tourismSummaryAddBox);
		}
	}

	/**
	 * Returns the number of tourism summary add boxes.
	 *
	 * @return the number of tourism summary add boxes
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
					_SQL_COUNT_TOURISMSUMMARYADDBOX);

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
		return "tourismSummaryBoxId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMSUMMARYADDBOX;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismSummaryAddBoxModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism summary add box persistence.
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

		TourismSummaryAddBoxUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismSummaryAddBoxUtil.setPersistence(null);

		entityCache.removeCache(TourismSummaryAddBoxImpl.class.getName());
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

	private static final String _SQL_SELECT_TOURISMSUMMARYADDBOX =
		"SELECT tourismSummaryAddBox FROM TourismSummaryAddBox tourismSummaryAddBox";

	private static final String _SQL_SELECT_TOURISMSUMMARYADDBOX_WHERE =
		"SELECT tourismSummaryAddBox FROM TourismSummaryAddBox tourismSummaryAddBox WHERE ";

	private static final String _SQL_COUNT_TOURISMSUMMARYADDBOX =
		"SELECT COUNT(tourismSummaryAddBox) FROM TourismSummaryAddBox tourismSummaryAddBox";

	private static final String _SQL_COUNT_TOURISMSUMMARYADDBOX_WHERE =
		"SELECT COUNT(tourismSummaryAddBox) FROM TourismSummaryAddBox tourismSummaryAddBox WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismSummaryAddBox.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismSummaryAddBox exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismSummaryAddBox exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismSummaryAddBoxPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"type"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}